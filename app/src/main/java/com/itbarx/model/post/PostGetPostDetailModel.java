package com.itbarx.model.post;

public class PostGetPostDetailModel {

	private String userID;
	private String itBarxUserName;
	private String postID;
	private String addedDate;
	private String postSpeechToText;
	private String postLikeCount;
	private String postReplyCount;
	private String postRebarkCount;
	private String postURL;

	public PostGetPostDetailModel() {
	super();
	}

	public PostGetPostDetailModel(String userID, String itBarxUserName, String postID, String addedDate, String postSpeechToText, String postLikeCount, String postReplyCount, String postRebarkCount,
		String postURL) {
	super();
	this.userID = userID;
	this.itBarxUserName = itBarxUserName;
	this.postID = postID;
	this.addedDate = addedDate;
	this.postSpeechToText = postSpeechToText;
	this.postLikeCount = postLikeCount;
	this.postReplyCount = postReplyCount;
	this.postRebarkCount = postRebarkCount;
	this.postURL = postURL;
	}

	public String getUserID() {
	return userID;
	}

	public void setUserID(String userID) {
	this.userID = userID;
	}

	public String getItBarxUserName() {
	return itBarxUserName;
	}

	public void setItBarxUserName(String itBarxUserName) {
	this.itBarxUserName = itBarxUserName;
	}

	public String getPostID() {
	return postID;
	}

	public void setPostID(String postID) {
	this.postID = postID;
	}

	public String getAddedDate() {
	return addedDate;
	}

	public void setAddedDate(String addedDate) {
	this.addedDate = addedDate;
	}

	public String getPostSpeechToText() {
	return postSpeechToText;
	}

	public void setPostSpeechToText(String postSpeechToText) {
	this.postSpeechToText = postSpeechToText;
	}

	public String getPostLikeCount() {
	return postLikeCount;
	}

	public void setPostLikeCount(String postLikeCount) {
	this.postLikeCount = postLikeCount;
	}

	public String getPostReplyCount() {
	return postReplyCount;
	}

	public void setPostReplyCount(String postReplyCount) {
	this.postReplyCount = postReplyCount;
	}

	public String getPostRebarkCount() {
	return postRebarkCount;
	}

	public void setPostRebarkCount(String postRebarkCount) {
	this.postRebarkCount = postRebarkCount;
	}

	public String getPostURL() {
	return postURL;
	}

	public void setPostURL(String postURL) {
	this.postURL = postURL;
	}

}
