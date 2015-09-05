package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.adapter.ProfilFragmentListAdapter;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.custom.component.ButtonBold;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.utils.TextSizeUtil;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.List;

public class F_ProfileFragment extends Fragment {

    private T_ProfileActivity t_profileActivity;
    private AccountGetUserByLoginInfoModel accLoginInfoModel=null;
    private List<PostPopularPostListModel> postPopularPostListModels;
    private TextViewBold txtUserName, txtAtMail;
    private TextViewRegular txtLocationName, txtUserBio;
    private TextViewRegular txtProfileToolbar;
    private TextViewBold txtBarkCount, txtFollowerCount, txtFollowingCount;
    private TextViewRegular txtBarkText, txtFollowerText, txtFollowingText;
    private ButtonBold btnProfil;


    ListView userProfilePopularPostsListView;
    private VideoView video;

    public F_ProfileFragment() {

    }

    public F_ProfileFragment(T_ProfileActivity t_profileActivity) {
        this.t_profileActivity = t_profileActivity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (null != ItbarxGlobal.getInstance().getAccountModel()) {
            accLoginInfoModel = ItbarxGlobal.getInstance().getAccountModel();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_profile_screen, container, false);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        txtProfileToolbar = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_toolbar_text);
        txtUserName = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_username_text);
        txtLocationName = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_place_text);
        txtUserBio = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_user_bio_text);
        txtAtMail = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_atmail_text);
        btnProfil = (ButtonBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_edit_profile_button);
        txtBarkCount = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_barks_count_TextView);
        txtFollowerCount = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_followers_count_TextView);
        txtFollowingCount = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_following_count_TextView);
        txtBarkText = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_barks_TextView);
        txtFollowerText = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_followers_TextView);
        txtFollowingText = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_following_TextView);
/*
        //fills up the listview
        userProfilePopularPostsListView = (ListView) t_profileActivity.findViewById(R.id.profile_fragment_screen_listView);
        postPopularPostListModels = ItbarxGlobal.getPopularListModel();
        userProfilePopularPostsListView.setAdapter(new ProfilFragmentListAdapter(t_profileActivity.getContext(), postPopularPostListModels));
*/
        //control the video
        /*
        MediaController mc = new MediaController(t_profileActivity.getContext());
        video = (VideoView) t_profileActivity.findViewById(R.id.row_fragment_popular_screen_user_videoView);
        video.setMediaController(mc);
        video.stopPlayback();
        // video.start();
        mc.show();
        */
        setTextSize();
        setText();

    }

    private void setText() {

     //   txtUserName.setText((null != accLoginInfoModel.getName() && !accLoginInfoModel.getName().equals("")) ? accLoginInfoModel.getName() : txtUserName.getText());
      //  txtLocationName.setText((null != accLoginInfoModel.getLocationName() && !accLoginInfoModel.getLocationName().equals("")) ? accLoginInfoModel.getLocationName() : txtLocationName.getText());
      //  txtUserBio.setText((null != accLoginInfoModel.getUserBio() && !accLoginInfoModel.getUserBio().equals("")) ? accLoginInfoModel.getUserBio() : txtUserBio.getText());
        // txtUserBio.setText((null != accLoginInfoModel.getUserBio() && !accLoginInfoModel.getUserBio().equals("")) ? accLoginInfoModel.getUserBio() : txtUserBio.getText());
    }

    private void setTextSize() {
        txtProfileToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        txtUserName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUsernameTextSize());
        txtLocationName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUserPlaceTextSize());
        txtUserBio.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUserBioTextSize());
        txtAtMail.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUserBioTextSize());
        btnProfil.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        txtBarkCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonCountTextSize());
        txtFollowerCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonCountTextSize());
        txtFollowingCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonCountTextSize());
        txtBarkText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonTextSize());
        txtFollowerText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonTextSize());
        txtFollowingText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonTextSize());
    }


}
