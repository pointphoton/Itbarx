package com.itbarx.model.post;

public class PostNewModel {

	private String userID;
	private String page;
	private String recPerPage;

	public PostNewModel() {
	super();
	}

	public PostNewModel(String userID, String page, String recPerPage) {
	super();
	this.userID = userID;
	this.page = page;
	this.recPerPage = recPerPage;
	}

	public String getUserID() {
	return userID;
	}

	public void setUserID(String userID) {
	this.userID = userID;
	}

	public String getPage() {
	return page;
	}

	public void setPage(String page) {
	this.page = page;
	}

	public String getRecPerPage() {
	return recPerPage;
	}

	public void setRecPerPage(String recPerPage) {
	this.recPerPage = recPerPage;
	}

}
