package com.itbarx.application;

import java.util.List;
import java.util.Locale;

import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.utils.TextSizeUtil;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

public class ItbarxGlobal extends Application {

	private String userToken;
	private AccountGetUserByLoginInfoModel userLoginInfoModel;
	private static List<PostPopularPostListModel> popularListModel;
	private static Context appContext;
	private static SharedPreferences mSharedPrefs;
	private static ItbarxGlobal instance =null;
	private static float DENSITY;



	@Override
	public void onCreate() {
		instance =this;

		setDensity();
		super.onCreate();
	}

	public static Context getContext(){
		return instance;
	}

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

	public static List<PostPopularPostListModel> getPopularListModel(){
		return popularListModel;
	}

	public static void setPopularListModel( List<PostPopularPostListModel> models){
		popularListModel =models;
	}

	public String getSystemLanguage() {
	return Locale.getDefault().getLanguage();
	}

	//set density

	private static void setDensity(){
	DENSITY =	getInstance().getResources().getDisplayMetrics().density;
	}

	public static  float getDENSITY(){
		return  DENSITY;
	}



}
