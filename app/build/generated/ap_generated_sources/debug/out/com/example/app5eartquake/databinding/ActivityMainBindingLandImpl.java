package com.example.app5eartquake.databinding;
import com.example.app5eartquake.R;
import com.example.app5eartquake.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingLandImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txt_metros, 1);
        sViewsWithIds.put(R.id.txt_ric, 2);
        sViewsWithIds.put(R.id.txt_latitud, 3);
        sViewsWithIds.put(R.id.txt_longitud, 4);
        sViewsWithIds.put(R.id.txt_num_latitud, 5);
        sViewsWithIds.put(R.id.txt_num_longitud, 6);
        sViewsWithIds.put(R.id.txt_ubi, 7);
        sViewsWithIds.put(R.id.txt_fecha, 8);
        sViewsWithIds.put(R.id.textView9, 9);
        sViewsWithIds.put(R.id.textView10, 10);
        sViewsWithIds.put(R.id.imageView, 11);
        sViewsWithIds.put(R.id.imageView2, 12);
        sViewsWithIds.put(R.id.imageView3, 13);
        sViewsWithIds.put(R.id.eq_recycler, 14);
        sViewsWithIds.put(R.id.empty_view, 15);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[15]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}