package com.itbarx.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;

import com.itbarx.R;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.listener.FollowingProcessesServiceListener;
import com.itbarx.model.follow.FollowingModel;
import com.itbarx.sl.FollowingProcessesServiceSL;

import java.util.List;

/**
 * TODO: Add a class header comment!
 */
public class T_ProfileActivity extends  BaseActivity implements ProfileActivityCommunicator{

    String followerCount;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.t_profile_activity;
    }

    @Override
    protected Context getContext() {
        return T_ProfileActivity.this;
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initViews() {
        getFollowerCount(sendFollowerModel());
        setFragment(new F_ProfileFragment(T_ProfileActivity.this));

    }

    protected void setFragment(Fragment fragment1) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.profile1_fragment_container, fragment1, "profile");
        fragmentTransaction.commit();
    }

    //TAKE FOLLOWER COUNT

    private FollowingModel sendFollowerModel(){
        return new FollowingModel(ItbarxGlobal.getInstance().getAccountModel().getUserID());
    }

    private void getFollowerCount(FollowingModel followingModel){
        FollowingProcessesServiceSL followingProcessesServiceSL = new FollowingProcessesServiceSL(getContext(),followingProcessesServiceListener,R.string.root_service_url);
        followingProcessesServiceSL.setCountFollower(followingModel);
         showProgress(getString(R.string.ItbarxConnecting));
    }

    FollowingProcessesServiceListener followingProcessesServiceListener = new FollowingProcessesServiceListener() {
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
            followerCount =(null == count ) ? "0" :"7";


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
        public void getFollowerListById(List followerListByFollowingIdModel) {
            dismissProgress();
        }

        @Override
        public void getFollowingListById(List followingListByFollowerIdModel) {
            dismissProgress();
        }

        @Override
        public void getPendingListById(List pendingListByFollowingIdModel) {
            dismissProgress();
        }

        @Override
        public void getSendPendingListById(List sendPendingListByFollowerIdModel) {
            dismissProgress();
        }

        @Override
        public void onComplete(ResponseServiceModel onComplete) {
            dismissProgress();
        }

        @Override
        public void onError(ServiceErrorModel onError) {
            dismissProgress();
        }
    };


    @Override
    public String sendFollowerCountText() {
        return followerCount;
    }
}
