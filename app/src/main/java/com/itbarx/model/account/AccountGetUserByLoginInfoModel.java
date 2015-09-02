package com.itbarx.model.account;

public class AccountGetUserByLoginInfoModel {
	private String userID;
	private String name;
	private String itBarxUserName;
	private String locationID_FK;
	private String signUpDate;
	private String profileUpdateDate;
	private String userBio;
	private String genderEnumCode;
	private String userFollowStatus;
	private String userEmail;
	private String userPassword;
	private String userAccountStatus;
	private String userProfilePhoto;
	private String lastWallSeenDate;
	private String favouriteUserCount;
	private String notificationCount;
	private String userRole;
	private String mentionName;
	private String userWebsite;
	private String userPassEmailCode;
	private String userPasswordChangedDate;
	private String mediaContainerId;
	private String isNotificationActive;
	private String photoContainerId;
	private String locationId;
	private String locationName;
	private String countryId;

	public AccountGetUserByLoginInfoModel() {
	super();
	}

	public AccountGetUserByLoginInfoModel(String userID, String name, String itBarxUserName, String locationID_FK, String signUpDate, String profileUpdateDate, String userBio, String genderEnumCode,
		String userFollowStatus, String userEmail, String userPassword, String userAccountStatus, String userProfilePhoto, String lastWallSeenDate, String favouriteUserCount, String notificationCount,
		String userRole, String mentionName, String userWebsite, String userPassEmailCode, String userPasswordChangedDate, String mediaContainerId, String isNotificationActive,
		String photoContainerId, String locationId, String locationName, String countryId) {
	super();
	this.userID = userID;
	this.name = name;
	this.itBarxUserName = itBarxUserName;
	this.locationID_FK = locationID_FK;
	this.signUpDate = signUpDate;
	this.profileUpdateDate = profileUpdateDate;
	this.userBio = userBio;
	this.genderEnumCode = genderEnumCode;
	this.userFollowStatus = userFollowStatus;
	this.userEmail = userEmail;
	this.userPassword = userPassword;
	this.userAccountStatus = userAccountStatus;
	this.userProfilePhoto = userProfilePhoto;
	this.lastWallSeenDate = lastWallSeenDate;
	this.favouriteUserCount = favouriteUserCount;
	this.notificationCount = notificationCount;
	this.userRole = userRole;
	this.mentionName = mentionName;
	this.userWebsite = userWebsite;
	this.userPassEmailCode = userPassEmailCode;
	this.userPasswordChangedDate = userPasswordChangedDate;
	this.mediaContainerId = mediaContainerId;
	this.isNotificationActive = isNotificationActive;
	this.photoContainerId = photoContainerId;
	this.locationId = locationId;
	this.locationName = locationName;
	this.countryId = countryId;
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

	public String getItBarxUserName() {
	return itBarxUserName;
	}

	public void setItBarxUserName(String itBarxUserName) {
	this.itBarxUserName = itBarxUserName;
	}

	public String getLocationID_FK() {
	return locationID_FK;
	}

	public void setLocationID_FK(String locationID_FK) {
	this.locationID_FK = locationID_FK;
	}

	public String getSignUpDate() {
	return signUpDate;
	}

	public void setSignUpDate(String signUpDate) {
	this.signUpDate = signUpDate;
	}

	public String getProfileUpdateDate() {
	return profileUpdateDate;
	}

	public void setProfileUpdateDate(String profileUpdateDate) {
	this.profileUpdateDate = profileUpdateDate;
	}

	public String getUserBio() {
	return userBio;
	}

	public void setUserBio(String userBio) {
	this.userBio = userBio;
	}

	public String getGenderEnumCode() {
	return genderEnumCode;
	}

	public void setGenderEnumCode(String genderEnumCode) {
	this.genderEnumCode = genderEnumCode;
	}

	public String getUserFollowStatus() {
	return userFollowStatus;
	}

	public void setUserFollowStatus(String userFollowStatus) {
	this.userFollowStatus = userFollowStatus;
	}

	public String getUserEmail() {
	return userEmail;
	}

	public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
	}

	public String getUserPassword() {
	return userPassword;
	}

	public void setUserPassword(String userPassword) {
	this.userPassword = userPassword;
	}

	public String getUserAccountStatus() {
	return userAccountStatus;
	}

	public void setUserAccountStatus(String userAccountStatus) {
	this.userAccountStatus = userAccountStatus;
	}

	public String getUserProfilePhoto() {
	return userProfilePhoto;
	}

	public void setUserProfilePhoto(String userProfilePhoto) {
	this.userProfilePhoto = userProfilePhoto;
	}

	public String getLastWallSeenDate() {
	return lastWallSeenDate;
	}

	public void setLastWallSeenDate(String lastWallSeenDate) {
	this.lastWallSeenDate = lastWallSeenDate;
	}

	public String getFavouriteUserCount() {
	return favouriteUserCount;
	}

	public void setFavouriteUserCount(String favouriteUserCount) {
	this.favouriteUserCount = favouriteUserCount;
	}

	public String getNotificationCount() {
	return notificationCount;
	}

	public void setNotificationCount(String notificationCount) {
	this.notificationCount = notificationCount;
	}

	public String getUserRole() {
	return userRole;
	}

	public void setUserRole(String userRole) {
	this.userRole = userRole;
	}

	public String getMentionName() {
	return mentionName;
	}

	public void setMentionName(String mentionName) {
	this.mentionName = mentionName;
	}

	public String getUserWebsite() {
	return userWebsite;
	}

	public void setUserWebsite(String userWebsite) {
	this.userWebsite = userWebsite;
	}

	public String getUserPassEmailCode() {
	return userPassEmailCode;
	}

	public void setUserPassEmailCode(String userPassEmailCode) {
	this.userPassEmailCode = userPassEmailCode;
	}

	public String getUserPasswordChangedDate() {
	return userPasswordChangedDate;
	}

	public void setUserPasswordChangedDate(String userPasswordChangedDate) {
	this.userPasswordChangedDate = userPasswordChangedDate;
	}

	public String getMediaContainerId() {
	return mediaContainerId;
	}

	public void setMediaContainerId(String mediaContainerId) {
	this.mediaContainerId = mediaContainerId;
	}

	public String getIsNotificationActive() {
	return isNotificationActive;
	}

	public void setIsNotificationActive(String isNotificationActive) {
	this.isNotificationActive = isNotificationActive;
	}

	public String getPhotoContainerId() {
	return photoContainerId;
	}

	public void setPhotoContainerId(String photoContainerId) {
	this.photoContainerId = photoContainerId;
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

	public String getCountryId() {
	return countryId;
	}

	public void setCountryId(String countryId) {
	this.countryId = countryId;
	}

}
