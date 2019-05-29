package com.example.zmaplexdemo.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.zmaplexdemo.R;
import com.example.zmaplexdemo.databinding.ActivityMainBinding;
import com.example.zmaplexdemo.ui.activity.permission.PermissionActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
       // setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, PermissionActivity.class);
        mBinding.permissionTv.setOnClickListener(v -> {
            startActivity(intent);
        });


    }
}
