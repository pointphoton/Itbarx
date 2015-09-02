package com.itbarx.custom.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;


public class ActivityFragmentItemAdapter extends ArrayAdapter<ActivityFragmentItem> {




    public ActivityFragmentItemAdapter(Context context, List<ActivityFragmentItem> items) {
        super(context,0,items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ActivityFragmentItemView itemView = (ActivityFragmentItemView)convertView;
        if (null == itemView)
            itemView = ActivityFragmentItemView.inflate(parent);
        itemView.setItem(getItem(position));
        return itemView;
    }
}
