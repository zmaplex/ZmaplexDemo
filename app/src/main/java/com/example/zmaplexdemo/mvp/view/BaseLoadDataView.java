package com.example.zmaplexdemo.mvp.view;

public interface BaseLoadDataView extends BaseView {

    void showNoData();

    void showNoData(String mag);

    void showLoadFail();

    void showLoadFail(String failStr);

    void showLoadSuccess();

    void showStatusLayout();
}
