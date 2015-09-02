package com.itbarx.json;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.account.EditProfileModel;
import com.itbarx.model.account.GetEditProfileModel;

import android.util.Log;

public class AccountModelParserJSON {

	// USED BY LOGIN, SIGNUP, CHANGEPASSBYCODE
	public AccountGetUserByLoginInfoModel getUserLoginInfoModelFromJSON(String json) {
	AccountGetUserByLoginInfoModel model = null;
	try {
		Type type = new TypeToken<AccountGetUserByLoginInfoModel>() {
		}.getType();
		Gson gson = new Gson();
		model = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getUserLoginInfoModelFromJSON JSON PARSER", ex.getMessage());
	}
	return model;
	}

	public GetEditProfileModel getGetEditProfileModelFromJSON(String json) {
	GetEditProfileModel model = null;
	try {
		Type type = new TypeToken<GetEditProfileModel>() {
		}.getType();
		Gson gson = new Gson();
		model = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getGetEditProfileModelFromJSON JSON PARSER", ex.getMessage());
	}
	return model;
	}

	public EditProfileModel getEditProfileModelFromJSON(String json) {
	EditProfileModel model = null;
	try {
		Type type = new TypeToken<EditProfileModel>() {
		}.getType();
		Gson gson = new Gson();
		model = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getEditProfileModelFromJSON JSON PARSER", ex.getMessage());
	}
	return model;
	}

	public String getForgotProfileModelFromJSON(String json) {
	String forgot = null;
	try {
		Type type = new TypeToken<String>() {
		}.getType();
		Gson gson = new Gson();
		forgot = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getForgotProfileModelFromJSON JSON PARSER", ex.getMessage());
	}
	return forgot;
	}

	public Boolean getDeleteProfileModelFromJSON(String json) {
	Boolean isDeleted = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();
		Gson gson = new Gson();
		isDeleted = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getDeleteProfileModelFromJSON JSON PARSER", ex.getMessage());
	}
	return isDeleted;
	}

}
