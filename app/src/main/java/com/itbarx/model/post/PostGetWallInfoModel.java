package com.itbarx.model.post;

public class PostGetWallInfoModel {

	private String userID;
	private String name;
	private String mentionName;
	private String userName;
	private String description;
	private String userProfilePhoto;
	private String locationNAme;
	private String rebarkCount;
	private String followingCount;
	private String followerCount;
	private String isYUourFollower;
	private String areYouFollowing;

	public PostGetWallInfoModel() {
	super();
	}

	public PostGetWallInfoModel(String userID, String name, String mentionName, String userName, String description, String userProfilePhoto, String locationNAme, String rebarkCount,
		String followingCount, String followerCount, String isYUourFollower, String areYouFollowing) {
	super();
	this.userID = userID;
	this.name = name;
	this.mentionName = mentionName;
	this.userName = userName;
	this.description = description;
	this.userProfilePhoto = userProfilePhoto;
	this.locationNAme = locationNAme;
	this.rebarkCount = rebarkCount;
	this.followingCount = followingCount;
	this.followerCount = followerCount;
	this.isYUourFollower = isYUourFollower;
	this.areYouFollowing = areYouFollowing;
	}

	public String getUserID() {
	return userID;
	}

	public void setUserID(String userID) {
	this.userID = userID;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getMentionName() {
	return mentionName;
	}

	public void setMentionName(String mentionName) {
	this.mentionName = mentionName;
	}

	public String getUserName() {
	return userName;
	}

	public void setUserName(String userName) {
	this.userName = userName;
	}

	public String getDescription() {
	return description;
	}

	public void setDescription(String description) {
	this.description = description;
	}

	public String getUserProfilePhoto() {
	return userProfilePhoto;
	}

	public void setUserProfilePhoto(String userProfilePhoto) {
	this.userProfilePhoto = userProfilePhoto;
	}

	public String getLocationNAme() {
	return locationNAme;
	}

	public void setLocationNAme(String locationNAme) {
	this.locationNAme = locationNAme;
	}

	public String getRebarkCount() {
	return rebarkCount;
	}

	public void setRebarkCount(String rebarkCount) {
	this.rebarkCount = rebarkCount;
	}

	public String getFollowingCount() {
	return followingCount;
	}

	public void setFollowingCount(String followingCount) {
	this.followingCount = followingCount;
	}

	public String getFollowerCount() {
	return followerCount;
	}

	public void setFollowerCount(String followerCount) {
	this.followerCount = followerCount;
	}

	public String getIsYUourFollower() {
	return isYUourFollower;
	}

	public void setIsYUourFollower(String isYUourFollower) {
	this.isYUourFollower = isYUourFollower;
	}

	public String getAreYouFollowing() {
	return areYouFollowing;
	}

	public void setAreYouFollowing(String areYouFollowing) {
	this.areYouFollowing = areYouFollowing;
	}

}
