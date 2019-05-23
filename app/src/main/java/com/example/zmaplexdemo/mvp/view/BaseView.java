package com.example.zmaplexdemo.mvp.view;

import android.content.Context;

public interface BaseView {

    void showLoading();

    void hideLoading();

    boolean isNetworkConnected();

    Context getContext();

    void showToast(String toastMsg);

    void showProgressDialog(String msg);

    void dismissProgressDialog();

}
