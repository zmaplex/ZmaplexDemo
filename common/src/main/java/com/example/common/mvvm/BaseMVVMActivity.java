package com.example.common.mvvm;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import javax.inject.Inject;


public abstract class BaseMVVMActivity<VM extends ABSViewModel, VB extends ViewDataBinding> extends AppCompatActivity {

    @Inject
    protected VM mViewModel;

    protected VB mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = getLayoutInflater().inflate(this.getLayoutId(), null, false);
        mBinding = DataBindingUtil.bind(rootView);
        super.setContentView(rootView);
    }

    @LayoutRes
    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
