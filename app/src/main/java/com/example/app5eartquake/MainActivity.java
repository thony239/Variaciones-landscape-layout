package com.example.app5eartquake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Surface;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

import com.example.app5eartquake.databinding.ActivityMainBinding;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        MainViewModel viewModel=new ViewModelProvider(this).get(MainViewModel.class);

        binding.eqRecycler.setLayoutManager(new LinearLayoutManager(this));


        EqAdapter adapter= new EqAdapter();
        adapter.setOnItemClickListener(earthquake ->abrirVentana(earthquake.getId(),
                earthquake.getPlace(),
                earthquake.getMagnitude(),
                earthquake.getTime(),
                earthquake.getLatidude(),
                earthquake.getLongitude()));

        binding.eqRecycler.setAdapter(adapter);

        viewModel.getEqlist().observe(this, eqlist->{
            adapter.submitList(eqlist);

            for (int i=0; i<eqlist.size(); i++){
                if(eqlist.get(i).getMagnitude() == mayormag(eqlist)){
                    int rotacion = getWindowManager().getDefaultDisplay().getRotation();
                    if (rotacion == Surface.ROTATION_0 ) {

                    }else{
                        binding.txtFecha.setText(eqlist.get(i).getTime()+"");
                        binding.txtLatitud.setText(eqlist.get(i).getLatidude()+"");
                        binding.txtLongitud.setText(eqlist.get(i).getLongitude()+"");
                        binding.txtMetros.setText(eqlist.get(i).getMagnitude()+"");
                        binding.txtUbi.setText(eqlist.get(i).getPlace());
                    }

                }
            }
            if(eqlist.isEmpty()){
                binding.emptyView.setVisibility(View.VISIBLE);
            }else{
                binding.emptyView.setVisibility(View.GONE);
            }
        });
        viewModel.getEarthquakes();
    }
    public void abrirVentana (String id,String place,double magnitude, long time, double lat, double logi){
        //Toast.makeText(MainActivity.this,place, Toast.LENGTH_SHORT).show();
        double longitud1=Math.round(logi*100.0)/100.0;
        double latitud1=Math.round(lat*100.0)/100.0;
        Intent intent=new Intent(this,Monitor.class);
        intent.putExtra("id", id);
        intent.putExtra("place", place);
        intent.putExtra("magnitude", magnitude);
        intent.putExtra("time", time);
        intent.putExtra("latitude", latitud1);
        intent.putExtra("longitude", longitud1);
        startActivity(intent);
    }
    public double mayormag(List<Earthquake> eqlist){
        double  mayor;
        mayor=eqlist.get(0).getMagnitude();
        for (int i = 0; i<eqlist.size(); i++){
            if(eqlist.get(i).getMagnitude()> mayor){
                mayor=eqlist.get(i).getMagnitude();
            }
        }
        return mayor;
    }
}