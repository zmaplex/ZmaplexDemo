package com.example.zmaplexdemo.ui;


import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.zmaplexdemo.mvp.presenter.IBasePresenter;
import com.example.zmaplexdemo.mvp.view.BaseView;

/**
 * add by Alex.Tang
 */

public abstract class BaseFragment<P extends IBasePresenter> extends Fragment implements BaseView, View.OnClickListener {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            invalidateData();
        }
    }


    public void invalidateData() {
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    public interface Callback {

        void onFragmentAttached();

        void onFragmentDetached(String tag);
    }


}
