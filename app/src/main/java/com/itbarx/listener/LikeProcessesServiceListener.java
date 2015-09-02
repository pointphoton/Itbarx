package com.itbarx.listener;

import java.util.List;

import com.itbarx.model.like.LikePostsByUserIdModel;
import com.itbarx.model.like.LikeUsersByPostIdModel;

public interface LikeProcessesServiceListener<T> extends BaseServiceListener<T> {

	public void addLike(Boolean isAdded);

	public void deleteLike(Boolean isDeleted);

	public void countLikeByUser(Integer count);

	public void countLikeByPost(Integer count);

	public void getLikePostByUserId(List<LikePostsByUserIdModel> likePostsByUserIdModel);

	public void getLikeUsersByPostId(List<LikeUsersByPostIdModel> likeUsersByPostIdModel);

}
