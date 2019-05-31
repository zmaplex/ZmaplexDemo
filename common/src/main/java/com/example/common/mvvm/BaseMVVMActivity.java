package com.example.common.mvvm;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProviders;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

import javax.inject.Inject;


public abstract class BaseMVVMActivity<VM extends ABSViewModel, VB extends ViewDataBinding> extends AppCompatActivity {

    @Inject
    protected VM mVM;
    protected VB mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().inflate(this.getLayoutId(), null, false);
        mBinding = DataBindingUtil.bind(rootView);
        Objects.requireNonNull(mBinding).setLifecycleOwner(this);
        mVM = ViewModelProviders.of(this).get(getTClass());
        super.setContentView(rootView);
    }

    @LayoutRes
    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private Class<VM> getTClass() {
        Class<VM> tClass = (Class<VM>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
        return tClass;
    }
}