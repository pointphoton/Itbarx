package com.itbarx.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.VideoView;

import com.itbarx.R;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.model.post.PostTimelineListForUserModel;

import java.sql.Time;
import java.util.List;


public class TimelineFragmentListAdapter extends BaseAdapter {


    Context context;
    List<PostTimelineListForUserModel> list;


    public TimelineFragmentListAdapter(Context context, List<PostTimelineListForUserModel> postTimelineListForUserModels){
        this.context=context;
        this.list = postTimelineListForUserModels;
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

        convertView = layoutInflater.inflate(R.layout.row_fragment_timeline_screen_item, parent, false);
        PostTimelineListForUserModel model = (PostTimelineListForUserModel) getItem(position);
        if (model != null) {
            //small user photo
            ImageView imgPhoto = (ImageView) convertView.findViewById(R.id.row_fragment_timeline_screen_user_imageView);
            if (model.getPostOwnerPhoto() != null && !model.getPostOwnerPhoto().equalsIgnoreCase("")) {
                //photo yu al
            }
            //user name
            com.itbarx.custom.component.CustOpenBoldTextView txtFullname = (com.itbarx.custom.component.CustOpenBoldTextView) convertView.findViewById(R.id.row_fragment_timeline_screen_fullName_TextView);
            txtFullname.setText(model.getPostOwner());
            //post time info
            com.itbarx.custom.component.CustOpenRegularTextView txtTimeInfo = (com.itbarx.custom.component.CustOpenRegularTextView) convertView.findViewById(R.id.row_fragment_timeline_screen_time_info_TextView);
            String addedDate = model.getAddedDate().replace("T", " ").substring(0, model.getAddedDate().indexOf("."));
            txtTimeInfo.setText(addedDate + " " + " eklendi.");
            //posted video
            VideoView video = (VideoView) convertView.findViewById(R.id.row_fragment_timeline_screen_VideoView);
            if (model.getIsAdultContent().equalsIgnoreCase("false") && model.getPostURL() != null && !model.getPostURL().equalsIgnoreCase("") && model.getIsDeleted().equalsIgnoreCase("false")) {
                Uri uri = Uri.parse("http://itbarxapp.azurewebsites.net" + model.getPostURL());
                video.setVideoURI(uri);
                //   video.start();

            } else {
                Uri uri = Uri.parse("android.resource://" + ItbarxGlobal.getInstance().getPackageName() + "/" + R.raw.sample);
                video.setVideoURI(uri);
                //  video.start();
            }
            //text to speech
            com.itbarx.custom.component.CustOpenRegularTextView txtSubs = (com.itbarx.custom.component.CustOpenRegularTextView) convertView.findViewById(R.id.row_fragment_timeline_screen_subtitles_TextView);
            txtSubs.setText( (model.getPostSpeechToText() != null ) ?  model.getPostSpeechToText() : txtSubs.getText());

            //add like count
            com.itbarx.custom.component.CustOpenBoldTextView txtLike = (com.itbarx.custom.component.CustOpenBoldTextView) convertView.findViewById(R.id.row_fragment_timeline_screen_like_TextView);
            txtLike.setText((model.getPostLikeCount()!=null && !model.getPostLikeCount().equals("")) ? model.getPostLikeCount()  : "0");

            //add rebark / share count
            com.itbarx.custom.component.CustOpenBoldTextView txtReBark = (com.itbarx.custom.component.CustOpenBoldTextView) convertView.findViewById(R.id.row_fragment_timeline_screen_rebark_TextView);
            txtReBark.setText((model.getPostShareCount()!=null && !model.getPostShareCount().equals("")) ? model.getPostShareCount()  : "0");

            //add reply count
            com.itbarx.custom.component.CustOpenBoldTextView txtReply = (com.itbarx.custom.component.CustOpenBoldTextView) convertView.findViewById(R.id.row_fragment_timeline_screen_reply_TextView);
            txtReply.setText((model.getPostReplyCount()!=null && !model.getPostReplyCount().equals("")) ? model.getPostReplyCount()  : "0");


        }

        return convertView;


    }
}
