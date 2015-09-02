package com.itbarx.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.itbarx.R;
import com.itbarx.model.activity.ActivityListModel;

import java.util.List;

/**
 * Created by Photon on 31.08.2015.
 */
public class ActivityFragmentListAdapter extends BaseAdapter {

    Context context;
    List<ActivityListModel> list;
    public ActivityFragmentListAdapter(Context mContext, List<ActivityListModel> models) {
        context  = mContext;
        list = models;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = layoutInflater.inflate(R.layout.row_fragment_acvtivity_screen_activities_item, parent, false);
        ActivityListModel model = (ActivityListModel)getItem(position);
        if(model!= null) {
            ImageView imgPhoto = (ImageView)convertView.findViewById(R.id.row_fragment_activity_screen_activities_imageView);
            if(model.getUserProfilePhoto()!= null&&!model.getUserProfilePhoto().equalsIgnoreCase("")){
                //photo yu al
            }

            com.itbarx.custom.component.CustOpenBoldTextView txtFullname = (com.itbarx.custom.component.CustOpenBoldTextView)convertView.findViewById(R.id.row_fragment_activity_screen_activities_fullName_textView);
            txtFullname.setText(model.getItBarxUserName());

            com.itbarx.custom.component.CustOpenRegularTextView txtAction= (com.itbarx.custom.component.CustOpenRegularTextView)convertView.findViewById(R.id.row_fragment_activity_screen_activities_action_textView);
            txtAction.setText(model.getActivityText().replace(model.getItBarxUserName(),""));
        }



        return convertView;
    }
}