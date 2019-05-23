package com.example.zmaplexdemo.ui;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.example.zmaplexdemo.mvp.presenter.IBasePresenter;


public abstract class BaseActivity<P extends IBasePresenter, VB extends ViewDataBinding>
        extends AppCompatActivity {
    public P mPresenter;
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
        if (mPresenter != null) {
            mPresenter.onDetach();
        }
    }


    @Override
    protected void onResume() {
        super.onResume();
    }


}
