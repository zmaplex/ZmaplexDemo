package com.example.zmaplexdemo.ui.permission;

import android.os.Bundle;

import com.example.zmaplexdemo.R;
import com.example.zmaplexdemo.databinding.ActivityPermissionBinding;
import com.example.zmaplexdemo.mvp.presenter.permission.PermissionPresenter;
import com.example.zmaplexdemo.ui.BaseActivity;

public class PermissionActivity extends BaseActivity<PermissionPresenter, ActivityPermissionBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding.textView.setText("Hi");
    }


    @Override
    protected int getLayoutId() {
        return R.layout.activity_permission;
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
