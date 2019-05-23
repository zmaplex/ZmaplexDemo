package com.example.zmaplexdemo.mvp.presenter;
import com.example.zmaplexdemo.mvp.model.IBaseModel;
import com.example.zmaplexdemo.mvp.view.BaseView;

public abstract class BasePresenter<M extends IBaseModel, V extends BaseView> implements IBasePresenter {

    protected M mModel;

    protected V mRootView;

    public BasePresenter(M model, V rootView) {
        this.mModel = model;
        this.mRootView = rootView;
        onAttach();
    }

    public BasePresenter(V rootView) {
        this.mRootView = rootView;
        onAttach();
    }

    public BasePresenter() {
        onAttach();
    }


    @Override
    public void onAttach() {

    }

    @Override
    public void onDetach() {
        if (mModel != null)
            mModel.onDestroy();
        this.mModel = null;
        this.mRootView = null;
    }


    public abstract boolean useEventBus();

}
