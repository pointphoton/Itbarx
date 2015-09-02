package com.itbarx.model;

import java.util.Locale;

import com.itbarx.model.account.AccountGetUserByLoginInfoModel;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class ItbarxGlobal extends Application {

	private String userToken;
	private AccountGetUserByLoginInfoModel userLoginInfoModel;
	private static Context appContext;
	private static SharedPreferences mSharedPrefs;
	private static ItbarxGlobal instance = null;

	public static ItbarxGlobal getInstance() {
	if (instance == null) {
		instance = new ItbarxGlobal();

	}
	return instance;
	}

	public static ItbarxGlobal setInstance(Context appContext) {
	if (instance == null) {
		instance = new ItbarxGlobal();
		init(appContext);

	}
	return instance;
	}

	private static void init(Context context) {
	appContext = context;
	mSharedPrefs = appContext.getSharedPreferences("xmlFile", MODE_PRIVATE);
	}

	public static Boolean IsContexNull() {
	Boolean isNull = false;
	if (appContext == null) {
		isNull = true;
	} else {
		isNull = false;
	}
	return isNull;

	}

	public String getUserToken() {
	return userToken;
	}

	public void setUserToken(String userToken) {
	this.userToken = userToken;
	}

	public AccountGetUserByLoginInfoModel getAccountModel() {
	return userLoginInfoModel;
	}

	public void setAccountModel(AccountGetUserByLoginInfoModel accountModel) {
	this.userLoginInfoModel = accountModel;
	}

	public String getSystemLanguage() {
	return Locale.getDefault().getLanguage();
	}

}
