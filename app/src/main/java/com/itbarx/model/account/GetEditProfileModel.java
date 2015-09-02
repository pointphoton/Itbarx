package com.itbarx.model.account;

public class GetEditProfileModel {

	public String userId;
	public String name;
	public String mentionname;
	public String locationId;
	public String locationName;
	public String userwebsite;
	public String userBio;
	public String userPassword;
	public String isNotificationActive;
	public String userProfilePhoto;
	public String itBarxUserName;

	public GetEditProfileModel() {

	}

	public GetEditProfileModel(String userId, String name, String mentionname, String locationId, String locationName, String userwebsite,
		String userBio, String userPassword, String isNotificationActive, String userProfilePhoto, String itBarxUserName) {
	this.userId = userId;
	this.name = name;
	this.mentionname = mentionname;
	this.locationId = locationId;
	this.locationName = locationName;
	this.userwebsite = userwebsite;
	this.userBio = userBio;
	this.userPassword = userPassword;
	this.isNotificationActive = isNotificationActive;
	this.userProfilePhoto = userProfilePhoto;
	this.itBarxUserName = itBarxUserName;
	}

	public String getUserId() {
	return userId;
	}

	public void setUserId(String userId) {
	this.userId = userId;
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getMentionname() {
	return mentionname;
	}

	public void setMentionname(String mentionname) {
	this.mentionname = mentionname;
	}

	public String getLocationId() {
	return locationId;
	}

	public void setLocationId(String locationId) {
	this.locationId = locationId;
	}

	public String getLocationName() {
	return locationName;
	}

	public void setLocationName(String locationName) {
	this.locationName = locationName;
	}

	public String getUserwebsite() {
	return userwebsite;
	}

	public void setUserwebsite(String userwebsite) {
	this.userwebsite = userwebsite;
	}

	public String getUserBio() {
	return userBio;
	}

	public void setUserBio(String userBio) {
	this.userBio = userBio;
	}

	public String getUserPassword() {
	return userPassword;
	}

	public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
	}

	public String getIsNotificationActive() {
	return isNotificationActive;
	}

	public void setIsNotificationActive(String isNotificationActive) {
	this.isNotificationActive = isNotificationActive;
	}

	public String getUserProfilePhoto() {
	return userProfilePhoto;
	}

	public void setUserProfilePhoto(String userProfilePhoto) {
	this.userProfilePhoto = userProfilePhoto;
	}

	public String getItBarxUserName() {
	return itBarxUserName;
	}

	public void setItBarxUserName(String itBarxUserName) {
	this.itBarxUserName = itBarxUserName;
	}

}
