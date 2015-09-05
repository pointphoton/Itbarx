package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.adapter.ProfilFragmentListAdapter;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.custom.component.ButtonBold;
import com.itbarx.custom.component.EditTextRegular;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.utils.TextSizeUtil;

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
    private AccountGetUserByLoginInfoModel accLoginInfoModel;
    private List<PostPopularPostListModel> postPopularPostListModels;
    private TextViewBold userNameTextView;
    private TextViewRegular userLocationTextView;
    private TextViewRegular userBioTextView;
    private TextViewBold barkTxtViewC,followerTxtViewC,followingTxtViewC;
    private TextViewRegular barkTxtView,followerTxtView,followingTxtView;
    private ButtonBold btnProfil;

    private float textSizeMiniButtonCountText = 0;
    private float textSizeMiniButtonsText = 0;
    private float textSizeBtnProfil = 0;
    private float textSizeListView = 0;
    private float textSizeToolbar = 0;
    private float textSizeUserName = 0;
    private float textSizePlace = 0;
    private float textSizeBio = 0;
    private TextViewRegular txtToolbar;

ListView userProfilePopularPostsListView;
    private VideoView video;
    public F_ProfileFragment() {

    }

    public F_ProfileFragment(T_ProfileActivity t_profileActivity) {
        this.t_profileActivity = t_profileActivity;
    }
    /*
	 * public F_ProfileFragment(FiveTabFragmentsContainerActivity container) { mainActivity = container; }
	 */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_profile_screen, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (null != ItbarxGlobal.getInstance().getAccountModel()) {
            accLoginInfoModel = ItbarxGlobal.getInstance().getAccountModel();
        }

        textSizeUserName = TextSizeUtil.getProfileUsernameTextSize() / (getResources().getDisplayMetrics().density);
        textSizePlace = TextSizeUtil.getProfileUserBioTextSize() / (getResources().getDisplayMetrics().density);
        textSizeBio =  TextSizeUtil.getProfileUserBioTextSize() / (getResources().getDisplayMetrics().density);
        textSizeToolbar= TextSizeUtil.getToolbarTextSize() / (getResources().getDisplayMetrics().density);
      //  textSizeBtnProfil = TextSizeUtil.getProfileButtonTextSize() / (getResources().getDisplayMetrics().density);
        textSizeMiniButtonCountText =  TextSizeUtil.getProfileMiniButtonCountTextSize() / (getResources().getDisplayMetrics().density);

        // set user name
        userNameTextView = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_username_text);
        userNameTextView.setText((null != accLoginInfoModel.getName() && !accLoginInfoModel.getName().equals("")) ? accLoginInfoModel.getName() : userNameTextView.getText());
        userNameTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeUserName);
        //set user location
        userLocationTextView = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_place_text);
        userLocationTextView.setText((null != accLoginInfoModel.getLocationName() && !accLoginInfoModel.getLocationName().equals("")) ? accLoginInfoModel.getLocationName() : userLocationTextView.getText());
        userLocationTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizePlace);
        //set user biography
        userBioTextView = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_user_bio_text);
        userBioTextView.setText((null != accLoginInfoModel.getUserBio() && !accLoginInfoModel.getUserBio().equals("")) ? accLoginInfoModel.getUserBio() : userBioTextView.getText());
        userBioTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeBio);

        //set mini button text size
        userBioTextView = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_user_bio_text);
        userBioTextView.setText((null != accLoginInfoModel.getUserBio() && !accLoginInfoModel.getUserBio().equals("")) ? accLoginInfoModel.getUserBio() : userBioTextView.getText());
        userBioTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeBio);

        btnProfil = (ButtonBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_edit_profile_button);
        btnProfil.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeBtnProfil);



        //fills up the listview
        userProfilePopularPostsListView= (ListView) t_profileActivity.findViewById(R.id.profile_fragment_screen_listView);
        postPopularPostListModels=ItbarxGlobal.getPopularListModel();
        userProfilePopularPostsListView.setAdapter(new ProfilFragmentListAdapter(t_profileActivity.getContext(), postPopularPostListModels));

        //control the video
        MediaController mc = new MediaController(t_profileActivity.getContext());
        video = (VideoView) t_profileActivity.findViewById(R.id.row_fragment_popular_screen_user_videoView);
        video.setMediaController(mc);
        video.stopPlayback();
       // video.start();
        mc.show();

    }


}
