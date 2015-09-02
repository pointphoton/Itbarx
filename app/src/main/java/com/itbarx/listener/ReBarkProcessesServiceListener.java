package com.itbarx.listener;

import java.util.List;

import com.itbarx.model.rebark.ReBarkGetPostSharedUserListModel;
import com.itbarx.model.rebark.ReBarkGetSharedPostListModel;

public interface ReBarkProcessesServiceListener<T> extends BaseServiceListener<T> {

	public void add(Boolean isAdded);

	public void delete(Boolean isDeleted);

	public void getSharedPostList(List<ReBarkGetSharedPostListModel> reBarkGetSharedPostListModel);

	public void getPostSharedUserList(List<ReBarkGetPostSharedUserListModel> reBarkPostSharedUserListModel);

	public void getSharedPostCount(Integer count);

	public void getUserCount(Integer count);

}
