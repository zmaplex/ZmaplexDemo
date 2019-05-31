package com.example.common.mvvm;

import androidx.lifecycle.MutableLiveData;

public class BaseMutableLiveData<T> extends MutableLiveData<T> {
    public BaseMutableLiveData() {
        super();
    }

    public BaseMutableLiveData(T value) {
        super(value);
    }

    public T getValue(T defaultObj) {
        T data = super.getValue();
        if (data != null) {
            return data;
        }
        return defaultObj;
    }

}
