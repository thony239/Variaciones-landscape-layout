// Generated by data binding compiler. Do not edit!
package com.example.app5eartquake.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.app5eartquake.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMonitorBinding extends ViewDataBinding {
  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView txtFecha;

  @NonNull
  public final TextView txtLatitud;

  @NonNull
  public final TextView txtLongitud;

  @NonNull
  public final TextView txtMetros;

  @NonNull
  public final TextView txtNumLatitud;

  @NonNull
  public final TextView txtNumLongitud;

  @NonNull
  public final TextView txtRic;

  @NonNull
  public final TextView txtUbi;

  protected ActivityMonitorBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView10,
      TextView textView9, TextView txtFecha, TextView txtLatitud, TextView txtLongitud,
      TextView txtMetros, TextView txtNumLatitud, TextView txtNumLongitud, TextView txtRic,
      TextView txtUbi) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imageView = imageView;
    this.imageView2 = imageView2;
    this.imageView3 = imageView3;
    this.textView10 = textView10;
    this.textView9 = textView9;
    this.txtFecha = txtFecha;
    this.txtLatitud = txtLatitud;
    this.txtLongitud = txtLongitud;
    this.txtMetros = txtMetros;
    this.txtNumLatitud = txtNumLatitud;
    this.txtNumLongitud = txtNumLongitud;
    this.txtRic = txtRic;
    this.txtUbi = txtUbi;
  }

  @NonNull
  public static ActivityMonitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_monitor, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMonitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMonitorBinding>inflateInternal(inflater, R.layout.activity_monitor, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMonitorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_monitor, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMonitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMonitorBinding>inflateInternal(inflater, R.layout.activity_monitor, null, false, component);
  }

  public static ActivityMonitorBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMonitorBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMonitorBinding)bind(component, view, R.layout.activity_monitor);
  }
}
