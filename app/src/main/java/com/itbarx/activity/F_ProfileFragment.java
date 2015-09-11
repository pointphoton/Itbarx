package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.adapter.ProfilFragmentListAdapter;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.custom.component.ButtonBold;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.listener.AccountProcessesServiceListener;
import com.itbarx.listener.FollowingProcessesServiceListener;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.account.EditProfileModel;
import com.itbarx.model.account.GetEditProfileIdModel;
import com.itbarx.model.account.GetEditProfileModel;
import com.itbarx.model.follow.FollowingModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.sl.AccountProcessesServiceSL;
import com.itbarx.sl.FollowingProcessesServiceSL;
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
    private AccountGetUserByLoginInfoModel accLoginInfoModel;
 private   GetEditProfileModel getEdtPrflModel;
    private List<PostPopularPostListModel> postPopularPostListModels;
    private TextViewBold txtUserName, txtItBarkUserName;
    private TextViewRegular txtLocationName, txtUserBio;
    private TextViewRegular txtProfileToolbar;
    private TextViewBold txtBarkCount, txtFollowerCount, txtFollowingCount;
    private TextViewRegular txtBarkText, txtFollowerText, txtFollowingText;
    private ButtonBold btnProfil;
    String followerCount;
    ProfileActivityCommunicator profileActCommm;



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



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_profile_screen, container, false);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

            accLoginInfoModel = ItbarxGlobal.getInstance().getAccountModel();
       // getFollowerCount(sendFollowerModel());
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        profileActCommm = (ProfileActivityCommunicator) getActivity();
        txtProfileToolbar = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_toolbar_text);
        txtUserName = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_username_text);
        txtLocationName = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_place_text);
        txtUserBio = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_user_bio_text);
        txtItBarkUserName = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_itBarkUserName_text);
        btnProfil = (ButtonBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_edit_profile_button);
        txtBarkCount = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_barks_count_TextView);
        txtFollowerCount = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_followers_count_TextView);
        txtFollowingCount = (TextViewBold) t_profileActivity.findViewById(R.id.profile_fragment_screen_following_count_TextView);
        txtBarkText = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_barks_TextView);
        txtFollowerText = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_followers_TextView);
        txtFollowingText = (TextViewRegular) t_profileActivity.findViewById(R.id.profile_fragment_screen_following_TextView);

        //fills up the listview
    /*    userProfilePopularPostsListView = (ListView) t_profileActivity.findViewById(R.id.profile_fragment_screen_listView);
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

        setText();
        setTextSize();

    }

    private void setText() {


       txtUserName.setText((null != accLoginInfoModel.getName() && !accLoginInfoModel.getName().equals("")) ? accLoginInfoModel.getName() : txtUserName.getText());
        txtLocationName.setText((null != accLoginInfoModel.getLocationName() && !accLoginInfoModel.getLocationName().equals("")) ? accLoginInfoModel.getLocationName() : txtLocationName.getText());
        txtUserBio.setText((null != accLoginInfoModel.getUserBio() && !accLoginInfoModel.getUserBio().equals("")) ? accLoginInfoModel.getUserBio() : txtUserBio.getText());
        txtItBarkUserName.setText((null != accLoginInfoModel.getItBarxUserName() && !accLoginInfoModel.getItBarxUserName().equals("")) ? accLoginInfoModel.getItBarxUserName() : txtItBarkUserName.getText());
       txtFollowerCount.setText(profileActCommm.sendFollowerCountText());
    }

    private void setTextSize() {
        txtProfileToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        txtUserName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUsernameTextSize());
        txtLocationName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUserPlaceTextSize());
        txtUserBio.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUserBioTextSize());
        txtItBarkUserName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileUserBioTextSize());
        btnProfil.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        txtBarkCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonCountTextSize());
        txtFollowerCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonCountTextSize());
        txtFollowingCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonCountTextSize());
        txtBarkText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonTextSize());
        txtFollowerText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonTextSize());
        txtFollowingText.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getProfileMiniButtonTextSize());
    }

/*
    //TAKE FOLLOWER COUNT

    private FollowingModel sendFollowerModel(){
        return new FollowingModel(ItbarxGlobal.getInstance().getAccountModel().getUserID());
    }

    private void getFollowerCount(FollowingModel followingModel){
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(t_profileActivity.getContext(),followingProcessesServiceListener,R.string.root_service_url);
        followingProcessesServiceSL.setCountFollower(followingModel);
       // t_profileActivity.showProgress(getString(R.string.ItbarxConnecting));
    }

    FollowingProcessesServiceListener followingProcessesServiceListener = new FollowingProcessesServiceListener() {
        @Override
        public void add(Boolean isAdded) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void updateAsFriend(Boolean isUpdateAsFriend) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void updateAsBlocked(Boolean isUpdateAsBlocked) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void countFollower(Integer count) {
            t_profileActivity.dismissProgress();
            followerCount =(null == count ) ? 0 : count;


        }

        @Override
        public void countFollowing(Integer count) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void countPending(Integer count) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void countSendPending(Integer count) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void deleteFollow(Boolean isDeleted) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void getFollowerListById(List followerListByFollowingIdModel) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void getFollowingListById(List followingListByFollowerIdModel) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void getPendingListById(List pendingListByFollowingIdModel) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void getSendPendingListById(List sendPendingListByFollowerIdModel) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void onComplete(ResponseServiceModel onComplete) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void onError(ServiceErrorModel onError) {
            t_profileActivity.dismissProgress();
        }
    };

*/

  private GetEditProfileIdModel  sendModel(){
      GetEditProfileIdModel model = new GetEditProfileIdModel();
      model.setUserID(ItbarxGlobal.getInstance().getAccountModel().getUserID());
      return model;

  }

    private void getProfileInfo(GetEditProfileIdModel model){
        AccountProcessesServiceSL accountProcessesServiceSL = new AccountProcessesServiceSL(t_profileActivity.getContext(),accountProcessesServiceListener,R.string.root_service_url);
        accountProcessesServiceSL.setGetEditProfile(sendModel());
        t_profileActivity.showProgress(getString(R.string.ItbarxConnecting));
    }

    AccountProcessesServiceListener accountProcessesServiceListener = new AccountProcessesServiceListener() {
        @Override
        public void logInAccount(AccountGetUserByLoginInfoModel loginModelResponse) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void signUpAccount(AccountGetUserByLoginInfoModel loginModelResponse) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void forgotAccount(String forgotResponse) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void changePassByCode(AccountGetUserByLoginInfoModel loginModelResponse) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void getEditProfileAccount(GetEditProfileModel getEditProfileModel) {
            t_profileActivity.dismissProgress();
        //  getEdtPrflModel = getEditProfileModel;

        }

        @Override
        public void editProfileAccount(EditProfileModel editProfileModel) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void deleteProfileAccount(Boolean isDeleted) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void onComplete(ResponseServiceModel onComplete) {
            t_profileActivity.dismissProgress();
        }

        @Override
        public void onError(ServiceErrorModel onError) {
            t_profileActivity.dismissProgress();
        }
    };


}
