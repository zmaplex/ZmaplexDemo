package com.example.zmaplexdemo.ui;
import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;


public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    protected Context mContext;
    protected LayoutInflater mInflater;
    protected List<T> mItems;

    public BaseRecyclerAdapter() {
    }

    public BaseRecyclerAdapter(Context context, List<T> mItems) {
        this.mContext = context;
        this.mItems = mItems;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public void addList(List<T> addlist) {
        mItems.addAll(addlist);
        notifyDataSetChanged();
    }

    public void addItem(T item) {
        mItems.add(item);
        notifyDataSetChanged();
    }

    public void removeItem(int pos) {
        if (pos < mItems.size()) {
            mItems.remove(pos);
            notifyDataSetChanged();
        }
    }

    public void removeAll() {
        mItems.clear();
        notifyDataSetChanged();
    }

    public List<T> getList() {
        return mItems;
    }


    public void clearList() {
        mItems.clear();
        notifyDataSetChanged();
    }

}
