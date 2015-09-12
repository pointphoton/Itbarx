package com.itbarx.model.post;

public class PostGetWallInfoModel {

	private String userId;
	private String name;
	private String mentionname;
	private String userName;
	private String description;
	private String userProfilePhoto;
	private String locationName;
	private String RebarkCount;
	private String FollowingCount;
	private String FollowerCount;
	private String IsYourFollower;
	private String AreYouFollowing;

	public String getUserId() {
		return userId;
	}

	public PostGetWallInfoModel setUserId(String userId) {
		this.userId = userId;
		return this;
	}

	public String getName() {
		return name;
	}

	public PostGetWallInfoModel setName(String name) {
		this.name = name;
		return this;
	}

	public String getMentionname() {
		return mentionname;
	}

	public PostGetWallInfoModel setMentionname(String mentionname) {
		this.mentionname = mentionname;
		return this;
	}

	public String getUserName() {
		return userName;
	}

	public PostGetWallInfoModel setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public PostGetWallInfoModel setDescription(String description) {
		this.description = description;
		return this;
	}

	public String getUserProfilePhoto() {
		return userProfilePhoto;
	}

	public PostGetWallInfoModel setUserProfilePhoto(String userProfilePhoto) {
		this.userProfilePhoto = userProfilePhoto;
		return this;
	}

	public String getLocationName() {
		return locationName;
	}

	public PostGetWallInfoModel setLocationName(String locationName) {
		this.locationName = locationName;
		return this;
	}

	public String getRebarkCount() {
		return RebarkCount;
	}

	public PostGetWallInfoModel setRebarkCount(String rebarkCount) {
		RebarkCount = rebarkCount;
		return this;
	}

	public String getFollowingCount() {
		return FollowingCount;
	}

	public PostGetWallInfoModel setFollowingCount(String followingCount) {
		FollowingCount = followingCount;
		return this;
	}

	public String getFollowerCount() {
		return FollowerCount;
	}

	public PostGetWallInfoModel setFollowerCount(String followerCount) {
		FollowerCount = followerCount;
		return this;
	}

	public String getIsYourFollower() {
		return IsYourFollower;
	}

	public PostGetWallInfoModel setIsYourFollower(String isYourFollower) {
		IsYourFollower = isYourFollower;
		return this;
	}

	public String getAreYouFollowing() {
		return AreYouFollowing;
	}

	public PostGetWallInfoModel setAreYouFollowing(String areYouFollowing) {
		AreYouFollowing = areYouFollowing;
		return this;
	}
}
