package com.example.zmaplexdemo.mvp.presenter.permission;

import com.example.zmaplexdemo.mvp.model.IBaseModel;
import com.example.zmaplexdemo.mvp.presenter.BasePresenter;
import com.example.zmaplexdemo.mvp.view.permission.PermissionView;

public class PermissionPresenter extends BasePresenter<IBaseModel, PermissionView> {
    public PermissionPresenter(IBaseModel model, PermissionView rootView) {
        super(model, rootView);
    }

    public PermissionPresenter(PermissionView rootView) {
        super(rootView);
    }

    public PermissionPresenter() {
        super();
    }

    @Override
    public void onAttach() {
        super.onAttach();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public boolean useEventBus() {
        return false;
    }
}
