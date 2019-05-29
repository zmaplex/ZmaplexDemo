package com.example.zmaplexdemo.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.List;


public abstract class BaseZmxAdapter<T> extends BaseAdapter {

    protected Context mContext;
    protected LayoutInflater mInflater;
    protected List<T> mItems;

    public BaseZmxAdapter(Context mContext, List<T> mItems) {
        this.mContext = mContext;
        this.mItems = mItems;
        this.mInflater = LayoutInflater.from(mContext);
    }

    public void addList(List<T> addlist) {
        mItems.addAll(addlist);
        notifyDataSetChanged();
    }


    public void addItem(T item) {
        mItems.add(item);
        notifyDataSetChanged();
    }

    public void addItem(T item, int pos) {
        mItems.add(pos, item);
        notifyDataSetChanged();
    }

    public void removeItem(int pos) {
        if (pos < mItems.size()) {
            mItems.remove(pos);
            notifyDataSetChanged();
        }
    }


    public List<T> getList() {
        return mItems;
    }


    public void clearList() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

}
