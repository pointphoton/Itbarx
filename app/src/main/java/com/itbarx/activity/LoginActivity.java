package com.itbarx.activity;

import java.util.List;

import com.itbarx.R;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.custom.component.ButtonBold;
import com.itbarx.custom.component.EditTextRegular;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.listener.AccountProcessesServiceListener;
import com.itbarx.listener.ActivityProcessesServiceListener;
import com.itbarx.listener.FollowingProcessesServiceListener;
import com.itbarx.listener.LikeProcessesServiceListener;
import com.itbarx.listener.OneShotOnClickListener;
import com.itbarx.listener.PostProcessesServiceListener;
import com.itbarx.listener.ReBarkProcessesServiceListener;
import com.itbarx.listener.ReplyProcessesServiceListener;
import com.itbarx.listener.SearchProcessesServiceListener;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.model.account.AccountForgotSendMailModel;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.account.AccountSendEmailCodeModel;
import com.itbarx.model.account.AccountSignUpModel;
import com.itbarx.model.account.DeleteProfileModel;
import com.itbarx.model.account.EditProfileModel;
import com.itbarx.model.account.GetEditProfileIdModel;
import com.itbarx.model.account.GetEditProfileModel;
import com.itbarx.model.account.LoginModel;
import com.itbarx.model.activity.ActivityListModel;
import com.itbarx.model.activity.ActivityModel;
import com.itbarx.model.follow.FollowUserModel;
import com.itbarx.model.follow.FollowerListByFollowingIdModel;
import com.itbarx.model.follow.FollowerListModel;
import com.itbarx.model.follow.FollowerModel;
import com.itbarx.model.follow.FollowingListByFollowerIdModel;
import com.itbarx.model.follow.FollowingListModel;
import com.itbarx.model.follow.FollowingModel;
import com.itbarx.model.follow.PendingListByFollowingIdModel;
import com.itbarx.model.follow.SendPendingListByFollowerIdModel;
import com.itbarx.model.like.LikeCountPostModel;
import com.itbarx.model.like.LikeCountUserModel;
import com.itbarx.model.like.LikeModel;
import com.itbarx.model.like.LikePostListModel;
import com.itbarx.model.like.LikePostsByUserIdModel;
import com.itbarx.model.like.LikeUserListModel;
import com.itbarx.model.like.LikeUsersByPostIdModel;
import com.itbarx.model.post.PostAddPostModel;
import com.itbarx.model.post.PostGetPostDetailModel;
import com.itbarx.model.post.PostGetWallInfoModel;
import com.itbarx.model.post.PostNewModel;
import com.itbarx.model.post.PostNewPostListModel;
import com.itbarx.model.post.PostPopularModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.model.post.PostPostDetailModel;
import com.itbarx.model.post.PostTimelineListForUserModel;
import com.itbarx.model.post.PostTimelineModel;
import com.itbarx.model.post.PostWallInfoModel;
import com.itbarx.model.post.PostWallListForUserModel;
import com.itbarx.model.post.PostWallModel;
import com.itbarx.model.rebark.ReBarkDeleteModel;
import com.itbarx.model.rebark.ReBarkGetPostSharedUserListModel;
import com.itbarx.model.rebark.ReBarkGetSharedPostListModel;
import com.itbarx.model.rebark.ReBarkPostShareAddModel;
import com.itbarx.model.rebark.ReBarkPostSharedUserCountModel;
import com.itbarx.model.rebark.ReBarkPostSharedUserModel;
import com.itbarx.model.rebark.ReBarkSharedPostCountModel;
import com.itbarx.model.rebark.ReBarkSharedPostModel;
import com.itbarx.model.reply.ReplyAddModel;
import com.itbarx.model.reply.ReplyDeleteModel;
import com.itbarx.model.reply.ReplyListModel;
import com.itbarx.model.reply.ReplyModel;
import com.itbarx.model.search.SearchAutoCompleteModel;
import com.itbarx.model.search.SearchModel;
import com.itbarx.model.search.SearchUserForAutoCompleteResultModel;
import com.itbarx.model.search.SearchUserListResultModel;
import com.itbarx.sl.AccountProcessesServiceSL;
import com.itbarx.sl.ActivityProcessesServiceSL;
import com.itbarx.sl.FollowingProcessesServiceSL;
import com.itbarx.sl.LikeProcessesServiceSL;
import com.itbarx.sl.PostProcessesServiceSL;
import com.itbarx.sl.ReBarkProcessesServiceSL;
import com.itbarx.sl.ReplyProcessesServiceSL;
import com.itbarx.sl.SearchProcessesServiceSL;
import com.itbarx.utils.TextSizeUtil;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;


public class LoginActivity extends BaseActivity {

    // ************************//
    // ---ATTRIBUTES---
    // ************************//
  private  ButtonBold btnLogIn, btnCreateNewAcc, btnForgotPwd, btnFacebook, btnTwitter;
   private TextViewRegular txtToolbar;
   private TextViewBold txtViewRembMe, txtViewOr;
   private EditTextRegular edtUserName, edtPassword;
   private String strUserName, strPassword;


    @Override
    protected int getLayoutResourceId() {

        return R.layout.activity_login_screen;
    }

    @Override
    protected Context getContext() {
        // TODO Auto-generated method stub
        return LoginActivity.this;
    }

    @Override
    protected void initViews() {

        edtUserName = (EditTextRegular) findViewById(R.id.login_activity_screen_username_edittext);
        edtPassword = (EditTextRegular) findViewById(R.id.login_activity_screen_password_edittext);
        btnLogIn = (ButtonBold) findViewById(R.id.login_activity_screen_login_button);
        btnForgotPwd = (ButtonBold) findViewById(R.id.login_activity_screen_forgotpassword_button);
        btnCreateNewAcc = (ButtonBold) findViewById(R.id.login_activity_screen_createnewaccount_button);
        btnTwitter = (ButtonBold) findViewById(R.id.login_activity_screen_twitter_button);
        btnFacebook = (ButtonBold) findViewById(R.id.login_activity_screen_facebook_button);
        txtViewOr = (TextViewBold) findViewById(R.id.login_activity_screen_or_plaintext);
        txtViewRembMe = (TextViewBold) findViewById(R.id.login_activity_screen_rememberme_plaintext);
        txtToolbar = (TextViewRegular) findViewById(R.id.login_activity_screen_toolbar_textView);

        strUserName = "";
        strPassword = "";

        //SET FONTS
        setCompFonts();
        //START OTHER ACTIVITIES
        logInStart();
        forgotStart();
        createNewAccStart();
        twitterStart();
        facebookStart();
    }

    //LOGIN COMPONENTS SETUP METHODS
    private void setCompFonts() {
        btnLogIn.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        btnForgotPwd.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        btnCreateNewAcc.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        btnFacebook.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        btnTwitter.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        txtViewOr.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getLoginOrTextSize());
        txtViewRembMe.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getLoginRememberMeTextSize());
        txtToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        edtUserName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
        edtPassword.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
    }

    // *************************************//
    // ---LOGIN ACTIVITY ACTION METHODS---
    // *************************************//

    // LOGIN BUTTON EVENTS
    private void logInStart() {


        btnLogIn.setOnClickListener(logInClickListener);
    }

    // FORGOT BUTTON EVENTS
    private void forgotStart() {

        btnForgotPwd.setOnClickListener(forgotPwdCreateClickListener);
    }

    // CREATE NEW ACCOUNT BUTTON EVENTS
    private void createNewAccStart() {

        btnCreateNewAcc.setOnClickListener(newUserCreateClickListener);
    }

    // TWITTER BUTTON EVENTS
    private void twitterStart() {

        btnTwitter.setOnClickListener(twitterClickListener);
    }

    // FACEBOOK BUTTON EVENTS
    private void facebookStart() {

        btnFacebook.setOnClickListener(facebookClickListener);
    }

    // ************************//
    // ---EVENT LISTENERS---
    // ************************//

    // LOGIN BUTTON LISTENER
    OneShotOnClickListener logInClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {

            strUserName = edtUserName.getText().toString();
            strPassword = edtPassword.getText().toString();
            // Toast.makeText(getApplicationContext(), strUserName + " " + strPassword, Toast.LENGTH_LONG).show();
            setLogInAccount(new LoginModel(strUserName, strPassword));
        }
    };

    // FORGOT BUTTON LISTENER
    OneShotOnClickListener forgotPwdCreateClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
            // launchSubActivity(ForgotPasswordActivity.class);
            launchSubActivity(ForgotPasswordActivity.class);
            setProgress(R.string.ItbarxConnecting);

        }
    };

    // CREATE NEW ACCOUNT BUTTON LISTENER
    OneShotOnClickListener newUserCreateClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
            // TODO Auto-generated method stub
            launchSubActivity(CreateNewAccountActivity.class);
        }
    };

    // FACEBOOK BUTTON LISTENER
    OneShotOnClickListener facebookClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
        }
    };

    // TWITTER BUTTON LISTENER
    OneShotOnClickListener twitterClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
        }
    };

    // TEST LISTENER
    OneShotOnClickListener testListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
        }
    };

    // TEST LISTENER
    OneShotOnClickListener testClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
            // TODO Auto-generated method stub
            // launchSubActivity(FiveTabFragmentsContainerActivity.class);

            showProgress(getResources().getString(R.string.ItbarxConnecting));

            // ACCOUNT
            // setLogin(new LoginModel("user5", "test"));
            // setSignUp(new SignUpModel("erdem", "123", "123", "erdem.bmail@gmail.com", ""));
            // setGetEditProfile(new GetEditProfileIdModel("10028"));
            // setEditProfile(new EditProfileModel("10028", "", "", "", "", "", "", "", "", "", "", ""));
            // setAdd(new FollowUserModel("10027", "10028"));
            // setUpdateAsFriend(new FollowUserModel("10027", "10032"));
            // setUpdateAsBocked(new FollowUserModel("10027", "10032"));
            // FOLLOW
            // setFollowerCount(new FollowingModel("10027"));
            // setFollowingCount(new FollowerModel("10027"));
            // setPendingCount(new FollowingModel("10027"));
            // setSendPendingCount(new FollowerModel("10027"));
            // setDeleteFollow(new FollowUserModel("10027", "10032"));
            // setFollowerList(new FollowerListModel("60000", "10036", "1", "10"));
            // setFollowingList(new FollowingListModel("60000", "10027", "1", "10"));
            // setGetPendingList(new FollowerListModel("10032", "1", "10"));
            // setGetSendPendingList(new FollowingListModel("10027", "1", "10"));
            // POST
            // setTimeline(new PostTimelineModel("10027", "1", "10"));
            // setWall(new PostWallModel("10027", "1", "10"));
            // setPopular(new PostPopularModel("10027", "1", "10"));
            // setNew(new PostNewModel("10027", "1", "10");
            // setWallInfo(new PostWallInfoModel("60000", "10026"));
            // setGetPostDetail(new PostPostDetailModel("6B2BDE44-8B31-4874-9EA9-00000437C69F"));
            // setAddPost(new PostAddPostModel("", "", "", ""));
            // REBARK
            // setAddPostShare(new ReBarkPostShareAddModel("10061","A97295D6-C944-45F1-9BB9-000058544642","demelerim"));
            // setDeletePostShare(new ReBarkDeleteModel("04E0A5CC-488C-4BD7-A801-119E8130E750", "62C0F4EF-CF7D-49DE-B4E2-0000100362EF"));
            // setGetSharedPost(new ReBarkSharedPostModel("10060", "1", "10"));
            // setGetPostSharedUser(new ReBarkPostSharedUserModel("6B2BDE44-8B31-4874-9EA9-00000437C69F", "1", "10"));
            // setSharedPostCount(new ReBarkSharedPostCountModel("10061"));
            // setUserCount(new ReBarkPostSharedUserCountModel("6B2BDE44-8B31-4874-9EA9-00000437C69F"));
            // LIKE
            // setAddLike(new LikeModel("10029", "F545020E-4026-4E72-BB81-00004D74A9A2"));
            // setDeleteLike(new LikeModel("10029", "F545020E-4026-4E72-BB81-00004D74A9A2"));
            // setCountLikeByUser(new LikeCountUserModel("10027"));
            // setCountLikeByPost(new LikeCountPostModel("F545020E-4026-4E72-BB81-00004D74A9A2"));
            // setGetLikePostsByUserId(new LikePostListModel("10027", "1", "10"));
            // setGetLikeUsersByPostId(new LikeUserListModel("F545020E-4026-4E72-BB81-00004D74A9A2", "1", "10"));
            // SEARCH
            // setSearchAutoComplete(new SearchAutoCompleteModel("10027", "user5"));
            // setSearchUser(new SearchModel("10027", "user5", "1", "10"));
            // ACTIVITY
            // setActivityList(new ActivityModel("10027", "1", "10"));
            // REPLY
            // setDeleteReply(new ReplyDeleteModel("FA8BC594-1CE2-4ADC-887F-16B450FC1993"));
            // setGetPostRepliesList(new ReplyModel("40BF425A-0853-4DF0-868B-6848978E6239", "1", "10"));
            // setAddReply(new ReplyAddModel("3FB952EA-FE3B-419D-89DC-58137EB2A9BF", "15000", "test", "", "127.0.0.1", ""));
        }
    };

    // *************************************//
    // ---WEB SERVICES METHODS---
    // *************************************//

    // ************************************************************************************************************************************************//

    // ****************************************//
    // ---ACCOUNT SEND DATA SERVICE METHODS----//
    // ****************************************//

    // ---LOGIN---
    protected void setLogInAccount(LoginModel loginModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setLogInAccount(loginModel);
        showProgress(getString(R.string.ItbarxConnecting));
    }

    // ---SIGNUP---
    protected void setSignUpAccount(AccountSignUpModel signUpModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setSignUpAccount(signUpModel);
        showProgress(getString(R.string.ItbarxConnecting));

    }

    // ---FORGOT---
    protected void setForgotAccount(AccountForgotSendMailModel accountForgotSendMailModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setForgotAccount(accountForgotSendMailModel);

    }

    // ---FORGOT---
    protected void setChangePassByCodeAccount(AccountSendEmailCodeModel accountSendEmailCodeModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setChangePassByCodeAccount(accountSendEmailCodeModel);

    }

    // ---GET EDIT PROFILE---
    protected void setGetEditProfile(GetEditProfileIdModel getEditProfileIdModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setGetEditProfile(getEditProfileIdModel);

    }

    // ---EDIT PROFILE---
    protected void setEditProfile(EditProfileModel editProfileModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setEditProfile(editProfileModel);

    }

    // --- DELETE PROFILE---
    protected void setDeleteProfile(DeleteProfileModel deleteProfileModel) {
        AccountProcessesServiceSL accountServiceSL = new AccountProcessesServiceSL(getContext(), accountProcessesServiceListener, R.string.root_service_url);
        accountServiceSL.setDeleteProfile(deleteProfileModel);
        ;

    }

    // **************************************//
    // ---ACCOUNT SERVICE LISTENER METHODS---
    // **************************************//
    AccountProcessesServiceListener<String> accountProcessesServiceListener = new AccountProcessesServiceListener<String>() {

        @Override
        public void onError(ServiceErrorModel onError) {

            dismissProgress();
            showAlert(onError.getDescription());
        }

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();

        }

        @Override
        public void logInAccount(AccountGetUserByLoginInfoModel loginModelResponse) {
            dismissProgress();

            ItbarxGlobal global = ItbarxGlobal.setInstance(LoginActivity.this);
            global.setAccountModel(loginModelResponse);

            launchSubActivity(TabContainer.class);
            // cağırmak
            // ItbarxGlobal.getInstance().getAccountModel().

        }

        @Override
        public void signUpAccount(AccountGetUserByLoginInfoModel loginModelResponse) {
            dismissProgress();

        }

        @Override
        public void forgotAccount(String ok) {
            dismissProgress();
        }

        @Override
        public void changePassByCode(AccountGetUserByLoginInfoModel loginModelResponse) {
            dismissProgress();
        }

        @Override
        public void getEditProfileAccount(GetEditProfileModel getEditProfileModel) {
            dismissProgress();

        }

        @Override
        public void editProfileAccount(EditProfileModel editProfileModel) {
            dismissProgress();
        }

        @Override
        public void deleteProfileAccount(Boolean isDeleted) {
            dismissProgress();

        }

    };

    // ************************************************************************************************************************************************//

    // *****************************************************//
    // ---FOLLOWING PROCESSES SEND DATA SERVICE METHODS----//
    // *****************************************************//

    // --- ADD FOLLOW---
    protected void setAdd(FollowUserModel followUserModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setAdd(followUserModel);
    }

    // --- UPDATE_AS_FRIEND---
    protected void setUpdateAsFriend(FollowUserModel followUserModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setUpdateAsFriend(followUserModel);
    }

    // --- UPDATE_AS_BLOCKED---
    protected void setUpdateAsBocked(FollowUserModel followUserModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setUpdateAsBlocked(followUserModel);
    }

    // --- FOLLOWER COUNT---
    protected void setFollowerCount(FollowingModel followingModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setCountFollower(followingModel);
    }

    // --- FOLLOWING COUNT---
    protected void setFollowingCount(FollowerModel followerModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setCountFollowing(followerModel);
    }

    // --- PENDING COUNT---
    protected void setPendingCount(FollowingModel followingModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setCountPending(followingModel);
    }

    // --- SEND PENDING COUNT---
    protected void setSendPendingCount(FollowerModel followerModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setCountSendPending(followerModel);
    }

    // --- DELETE FOLLOW---
    protected void setDeleteFollow(FollowUserModel followUserModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setDeleteFollow(followUserModel);
    }

    // ---FOLLOWER LIST---
    protected void setFollowerList(FollowerListModel followerListModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setFollowerList(followerListModel);

    }

    // ---FOLLOWING LIST---
    protected void setFollowingList(FollowingListModel followingListModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setFollowingList(followingListModel);

    }

    // ---PENDING LIST---
    protected void setGetPendingList(FollowerListModel followerListModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setGetPendingList(followerListModel);
    }

    // ---SEND PENDING LIST---
    protected void setGetSendPendingList(FollowingListModel followingListModel) {
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(), followingProcessesServiceListener, R.string.root_service_url);
        followingProcessesServiceSL.setGetSendPendingList(followingListModel);

    }

    // ****************************************************//
    // ---FOLLOWING PROCESSES SERVICE LISTENER METHODS---
    // ****************************************************//
    FollowingProcessesServiceListener<String> followingProcessesServiceListener = new FollowingProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();

        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();

        }

        @Override
        public void add(Boolean isAdded) {
            dismissProgress();

        }

        @Override
        public void updateAsFriend(Boolean isUpdateAsFriend) {
            dismissProgress();

        }

        @Override
        public void updateAsBlocked(Boolean isUpdateAsBlocked) {
            dismissProgress();

        }

        @Override
        public void countFollower(Integer count) {
            dismissProgress();

        }

        @Override
        public void countFollowing(Integer count) {
            dismissProgress();

        }

        @Override
        public void countPending(Integer count) {
            dismissProgress();

        }

        @Override
        public void countSendPending(Integer count) {
            dismissProgress();
        }

        @Override
        public void deleteFollow(Boolean isDeleted) {
            dismissProgress();

        }

        @Override
        public void getFollowerListById(List<FollowerListByFollowingIdModel> followerListByFollowingIdModel) {
            dismissProgress();
        }

        @Override
        public void getFollowingListById(List<FollowingListByFollowerIdModel> followingListByFollowerIdModel) {
            dismissProgress();

        }

        @Override
        public void getPendingListById(List<PendingListByFollowingIdModel> pendingListByFollowingIdModel) {
            dismissProgress();

        }

        @Override
        public void getSendPendingListById(List<SendPendingListByFollowerIdModel> sendPendingListByFollowerIdModel) {
            dismissProgress();

        }
    };

    // ************************************************************************************************************************************************//

    // ****************************************//
    // ---POST SEND DATA SERVICE METHODS----//
    // ****************************************//

    // TIMELINE
    public void setTimeline(PostTimelineModel postTimelineModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setTimeline(postTimelineModel);
    }

    // WALL
    public void setWall(PostWallModel postWallModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setWall(postWallModel);
    }

    // POPULAR POSTs
    public void setPopular(PostPopularModel postPopularModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setPopular(postPopularModel);
    }

    // NEW POSTs
    public void setNew(PostNewModel postNewModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setNew(postNewModel);
    }

    // WALL INFO
    public void setWallInfo(PostWallInfoModel postWallInfoModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setWallInfo(postWallInfoModel);
    }

    // POST DETAIL
    public void setGetPostDetail(PostPostDetailModel postPostDetailModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setGetPostDetail(postPostDetailModel);
    }

    // ADD POST
    public void setAddPost(PostAddPostModel postAddPostModel) {
        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setAddPost(postAddPostModel);
    }

    // ****************************************************//
    // ---POST PROCESSES SERVICE LISTENER METHODS---
    // ****************************************************//
    PostProcessesServiceListener<String> postProcessesServiceListener = new PostProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();

        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();

        }

        @Override
        public void getTimelineListForUser(List<PostTimelineListForUserModel> postTimelineListForUserModel) {
            dismissProgress();

        }

        @Override
        public void getWallListForUser(List<PostWallListForUserModel> postWallListForUserModel) {
            dismissProgress();

        }

        @Override
        public void getPopularPostList(List<PostPopularPostListModel> popularPostListModel) {
            dismissProgress();

        }

        @Override
        public void getNewPostList(List<PostNewPostListModel> postNewPostListModels) {
            dismissProgress();

        }

        @Override
        public void getWallInfo(PostGetWallInfoModel postGetWallInfoModel) {
            dismissProgress();

        }

        @Override
        public void getPostDetail(PostGetPostDetailModel postDetailModel) {
            dismissProgress();

        }

        @Override
        public void isAdded(Boolean isAdded) {
            dismissProgress();

        }

    };

    // ************************************************************************************************************************************************//

    // **************************************************//
    // ---REBARK PROCESSES SHARE DATA SERVICE METHODS----//
    // **************************************************//

    // ADD SHAREPOST
    public void setAddPostShare(ReBarkPostShareAddModel reBarkPostShareAddModel) {
        ReBarkProcessesServiceSL reBarkProcessesServiceSL = new ReBarkProcessesServiceSL(getContext(), reBarkProcessesServiceListener, R.string.root_service_url);
        reBarkProcessesServiceSL.setAddPostShare(reBarkPostShareAddModel);
    }

    // DELETE SHAREPOST
    public void setDeletePostShare(ReBarkDeleteModel reBarkDeleteModel) {
        ReBarkProcessesServiceSL reBarkProcessesServiceSL = new ReBarkProcessesServiceSL(getContext(), reBarkProcessesServiceListener, R.string.root_service_url);
        reBarkProcessesServiceSL.setDeletePostShare(reBarkDeleteModel);
    }

    // GET SHAREDPOST
    public void setGetSharedPost(ReBarkSharedPostModel reBarkSharedPostModel) {
        ReBarkProcessesServiceSL reBarkProcessesServiceSL = new ReBarkProcessesServiceSL(getContext(), reBarkProcessesServiceListener, R.string.root_service_url);
        reBarkProcessesServiceSL.setGetSharedPost(reBarkSharedPostModel);
    }

    // GET POSTSHARED USER
    public void setGetPostSharedUser(ReBarkPostSharedUserModel reBarkPostSharedUserModel) {
        ReBarkProcessesServiceSL reBarkProcessesServiceSL = new ReBarkProcessesServiceSL(getContext(), reBarkProcessesServiceListener, R.string.root_service_url);
        reBarkProcessesServiceSL.setGetPostSharedUser(reBarkPostSharedUserModel);
    }

    // GET SHAREDPOST COUNT
    public void setSharedPostCount(ReBarkSharedPostCountModel reBarkSharedPostCountModel) {
        ReBarkProcessesServiceSL reBarkProcessesServiceSL = new ReBarkProcessesServiceSL(getContext(), reBarkProcessesServiceListener, R.string.root_service_url);
        reBarkProcessesServiceSL.setSharedPostCount(reBarkSharedPostCountModel);
    }

    // GET USER COUNT
    public void setUserCount(ReBarkPostSharedUserCountModel reBarkPostSharedUserCountModel) {
        ReBarkProcessesServiceSL reBarkProcessesServiceSL = new ReBarkProcessesServiceSL(getContext(), reBarkProcessesServiceListener, R.string.root_service_url);
        reBarkProcessesServiceSL.setUserCount(reBarkPostSharedUserCountModel);
    }

    // *******************************************************//
    // ---REBARK PROCESSES SERVICE LISTENER METHODS---
    // *******************************************************//
    ReBarkProcessesServiceListener<String> reBarkProcessesServiceListener = new ReBarkProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();
        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();
        }

        @Override
        public void add(Boolean isAdded) {
            dismissProgress();
        }

        @Override
        public void delete(Boolean isDeleted) {
            dismissProgress();
        }

        @Override
        public void getSharedPostList(List<ReBarkGetSharedPostListModel> reBarkGetSharedPostListModel) {
            dismissProgress();

        }

        @Override
        public void getPostSharedUserList(List<ReBarkGetPostSharedUserListModel> reBarkPostSharedUserListModel) {
            dismissProgress();

        }

        @Override
        public void getSharedPostCount(Integer count) {
            dismissProgress();

        }

        @Override
        public void getUserCount(Integer count) {
            dismissProgress();

        }

    };

    // ************************************************************************************************************************************************//

    // **************************************************//
    // ---LIKE PROCESSES SHARE DATA SERVICE METHODS----//
    // **************************************************//

    // ADD LIKE
    public void setAddLike(LikeModel likeModel) {
        LikeProcessesServiceSL likeProcessesServiceSL = new LikeProcessesServiceSL(getContext(), likeProcessesServiceListener, R.string.root_service_url);
        likeProcessesServiceSL.setAddLike(likeModel);
    }

    // DELETE LIKE
    public void setDeleteLike(LikeModel likeModel) {
        LikeProcessesServiceSL likeProcessesServiceSL = new LikeProcessesServiceSL(getContext(), likeProcessesServiceListener, R.string.root_service_url);
        likeProcessesServiceSL.setDeleteLike(likeModel);
    }

    // COUNT LIKE ACCORDING TO USER
    public void setCountLikeByUser(LikeCountUserModel likeCountUserModel) {
        LikeProcessesServiceSL likeProcessesServiceSL = new LikeProcessesServiceSL(getContext(), likeProcessesServiceListener, R.string.root_service_url);
        likeProcessesServiceSL.setCountLikeByUser(likeCountUserModel);
    }

    // COUNT LIKE ACCORDING TO POST
    public void setCountLikeByPost(LikeCountPostModel likeCountPostModel) {
        LikeProcessesServiceSL likeProcessesServiceSL = new LikeProcessesServiceSL(getContext(), likeProcessesServiceListener, R.string.root_service_url);
        likeProcessesServiceSL.setCountLikeByPost(likeCountPostModel);
    }

    // GET POSTLIST LIKED BY THE USER (KULLANICININ BEGENDİGİ POSTLAR)
    public void setGetLikePostsByUserId(LikePostListModel likePostListModel) {
        LikeProcessesServiceSL likeProcessesServiceSL = new LikeProcessesServiceSL(getContext(), likeProcessesServiceListener, R.string.root_service_url);
        likeProcessesServiceSL.setGetLikePostsByUserId(likePostListModel);
    }

    // GET USERLIST THAT USERS LIKED THE POST (POSTU BEGENEN KULLANICI LİSTESİ)
    public void setGetLikeUsersByPostId(LikeUserListModel likeUserListModel) {
        LikeProcessesServiceSL likeProcessesServiceSL = new LikeProcessesServiceSL(getContext(), likeProcessesServiceListener, R.string.root_service_url);
        likeProcessesServiceSL.setGetLikeUsersByPostId(likeUserListModel);
    }

    // *******************************************************//
    // ---LIKE PROCESSES SERVICE LISTENER METHODS---
    // *******************************************************//
    LikeProcessesServiceListener<String> likeProcessesServiceListener = new LikeProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();
        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();

        }

        @Override
        public void addLike(Boolean isAdded) {
            dismissProgress();

        }

        @Override
        public void deleteLike(Boolean isDeleted) {
            dismissProgress();

        }

        @Override
        public void countLikeByUser(Integer count) {
            dismissProgress();

        }

        @Override
        public void countLikeByPost(Integer count) {
            dismissProgress();

        }

        @Override
        public void getLikePostByUserId(List<LikePostsByUserIdModel> likePostsByUserIdModel) {
            dismissProgress();

        }

        @Override
        public void getLikeUsersByPostId(List<LikeUsersByPostIdModel> likeUsersByPostIdModel) {
            dismissProgress();

        }

    };
    // ************************************************************************************************************************************************//

    // **************************************************//
    // ---SEARCH PROCESSES SHARE DATA SERVICE METHODS----//
    // **************************************************//

    // SEARCHAUTOCOMPLETE
    public void setSearchAutoComplete(SearchAutoCompleteModel searchAutoCompleteModel) {
        SearchProcessesServiceSL searchProcessesServiceSL = new SearchProcessesServiceSL(getContext(), searchProcessesServiceListener, R.string.root_service_url);
        searchProcessesServiceSL.setSearchAutoComplete(searchAutoCompleteModel);
    }

    // SEARCH USER
    public void setSearchUser(SearchModel searchModel) {
        SearchProcessesServiceSL searchProcessesServiceSL = new SearchProcessesServiceSL(getContext(), searchProcessesServiceListener, R.string.root_service_url);
        searchProcessesServiceSL.setSearchUser(searchModel);
    }

    // *******************************************************//
    // ---SEARCH PROCESSES SERVICE LISTENER METHODS---
    // *******************************************************//
    SearchProcessesServiceListener<String> searchProcessesServiceListener = new SearchProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();

        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();

        }

        @Override
        public void getSearchUserForAutoCompleteList(List<SearchUserForAutoCompleteResultModel> searchUserForAutoCompleteResultModel) {
            dismissProgress();

        }

        @Override
        public void getSearchUserList(List<SearchUserListResultModel> searchUserListResultModel) {
            dismissProgress();

        }
    };
    // ************************************************************************************************************************************************//

    // **************************************************//
    // ---ACTIVITY PROCESSES SHARE DATA SERVICE METHODS----//
    // **************************************************//

    // ACTIVITY LIST
    public void setActivityList(ActivityModel activityModel) {
        ActivityProcessesServiceSL activityProcessesServiceSL = new ActivityProcessesServiceSL(getContext(), activityProcessesServiceListener, R.string.root_service_url);
        activityProcessesServiceSL.setActivityList(activityModel);
    }

    // *******************************************************//
    // ---ACTIVITY PROCESSES SERVICE LISTENER METHODS---
    // *******************************************************//
    ActivityProcessesServiceListener<String> activityProcessesServiceListener = new ActivityProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();

        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();

        }

        @Override
        public void getActivityList(List<ActivityListModel> activityListModel) {
            dismissProgress();

        }
    };

    // ************************************************************************************************************************************************//

    // **************************************************//
    // ---REPLY PROCESSES SHARE DATA SERVICE METHODS----//
    // **************************************************//

    // DELETE POSTREPLY
    public void setDeleteReply(ReplyDeleteModel replyDeleteModel) {
        ReplyProcessesServiceSL replyProcessesServiceSLL = new ReplyProcessesServiceSL(getContext(), replyProcessesServiceListener, R.string.root_service_url);
        replyProcessesServiceSLL.setDeleteReply(replyDeleteModel);
    }

    // DELETE REPLYPOST
    public void setGetPostRepliesList(ReplyModel replyModel) {
        ReplyProcessesServiceSL replyProcessesServiceSLL = new ReplyProcessesServiceSL(getContext(), replyProcessesServiceListener, R.string.root_service_url);
        replyProcessesServiceSLL.setGetPostRepliesList(replyModel);
    }

    // ADD POSTREPLY
    public void setAddReply(ReplyAddModel replyAddModel) {
        ReplyProcessesServiceSL replyProcessesServiceSLL = new ReplyProcessesServiceSL(getContext(), replyProcessesServiceListener, R.string.root_service_url);
        replyProcessesServiceSLL.setAddReply(replyAddModel);
    }

    // *******************************************************//
    // ---REPLY PROCESSES SERVICE LISTENER METHODS---
    // *******************************************************//
    ReplyProcessesServiceListener<String> replyProcessesServiceListener = new ReplyProcessesServiceListener<String>() {

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            dismissProgress();

        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();

        }

        @Override
        public void deleteReply(Boolean idDeleted) {
            dismissProgress();

        }

        @Override
        public void getPostRepliesList(List<ReplyListModel> replyListModel) {
            dismissProgress();

        }

        @Override
        public void addReply(Boolean isAdded) {
            dismissProgress();

        }
    };

}
