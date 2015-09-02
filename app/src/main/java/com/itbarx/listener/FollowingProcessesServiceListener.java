package com.itbarx.listener;

import java.util.List;

import com.itbarx.model.follow.FollowerListByFollowingIdModel;
import com.itbarx.model.follow.FollowingListByFollowerIdModel;
import com.itbarx.model.follow.PendingListByFollowingIdModel;
import com.itbarx.model.follow.SendPendingListByFollowerIdModel;

public interface FollowingProcessesServiceListener<T> extends BaseServiceListener<T> {

	public void add(Boolean isAdded);

	public void updateAsFriend(Boolean isUpdateAsFriend);

	public void updateAsBlocked(Boolean isUpdateAsBlocked);

	public void countFollower(Integer count);

	public void countFollowing(Integer count);

	public void countPending(Integer count);

	public void countSendPending(Integer count);

	public void deleteFollow(Boolean isDeleted);

	public void getFollowerListById(List<FollowerListByFollowingIdModel> followerListByFollowingIdModel);

	public void getFollowingListById(List<FollowingListByFollowerIdModel> followingListByFollowerIdModel);

	public void getPendingListById(List<PendingListByFollowingIdModel> pendingListByFollowingIdModel);

	public void getSendPendingListById(List<SendPendingListByFollowerIdModel> sendPendingListByFollowerIdModel);
}
