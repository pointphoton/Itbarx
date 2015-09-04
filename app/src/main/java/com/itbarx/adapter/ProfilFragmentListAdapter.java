package com.itbarx.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.VideoView;

import com.itbarx.R;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.model.post.PostPopularPostListModel;

import java.util.List;

/**
 * TODO: Add a class header comment!
 */
public class ProfilFragmentListAdapter extends BaseAdapter {

    Context context;
    List<PostPopularPostListModel> list;
    public ProfilFragmentListAdapter(Context mContext, List<PostPopularPostListModel> models) {
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

        convertView = layoutInflater.inflate(R.layout.row_fragment_profile_screen_item, parent, false);

        PostPopularPostListModel model = (PostPopularPostListModel) getItem(position);
        if (model != null) {
            VideoView video = (VideoView) convertView.findViewById(R.id.row_fragment_profile_screen_user_videoView);
            TextViewRegular text = (TextViewRegular) convertView.findViewById(R.id.row_fragment_profile_screen_subtitle_textView);


            if(model.getIsAdultContent().equalsIgnoreCase("false") && model.getPostURL()!=null  && !model.getPostURL().equalsIgnoreCase("") && model.getIsDeleted().equalsIgnoreCase("false") )
            {
                Uri uri = Uri.parse("http://itbarxapp.azurewebsites.net"+model.getPostURL());
                video.setVideoURI(uri);
                text.setText(model.getPostSpeechToText());
                video.stopPlayback();
                video.pause();
                //   video.start();

            }
            else{
                Uri uri = Uri.parse("android.resource://" + ItbarxGlobal.getInstance().getPackageName() + "/" + R.raw.sample);
                video.setVideoURI(uri);
                //  video.start();
                video.stopPlayback();
                video.pause();
                text.setText(model.getPostSpeechToText());
            }


            //      Uri uri = Uri.parse("android.resource://" + IApplication.getContext().getPackageName() + "/" + R.raw.sample);
            //  video.setVideoURI(uri);
            //  video.start();

        }


        return convertView;
    }
}
