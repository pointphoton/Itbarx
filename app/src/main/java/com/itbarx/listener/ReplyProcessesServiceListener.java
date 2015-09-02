package com.itbarx.listener;

import java.util.List;

import com.itbarx.model.reply.ReplyListModel;

public interface ReplyProcessesServiceListener<T> extends BaseServiceListener<T> {

	public void deleteReply(Boolean idDeleted);

	public void getPostRepliesList(List<ReplyListModel> replyListModel);

	public void addReply(Boolean isAdded);

}
