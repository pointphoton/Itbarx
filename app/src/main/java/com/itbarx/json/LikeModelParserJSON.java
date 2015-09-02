package com.itbarx.json;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.itbarx.model.like.LikePostsByUserIdModel;
import com.itbarx.model.like.LikeUsersByPostIdModel;

import android.util.Log;

public class LikeModelParserJSON {

	public Boolean getAddLikeModelFromJSON(String json) {
	Boolean isOK = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();
		Gson gson = new Gson();
		isOK = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getAddLikeModelFromJSON JSON PARSER", ex.getMessage());
	}
	return isOK;
	}

	public Boolean getDeleteLikeModelFromJSON(String json) {
	Boolean isOK = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();
		Gson gson = new Gson();
		isOK = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getDeleteLikeModelFromJSON JSON PARSER", ex.getMessage());
	}
	return isOK;
	}

	public Integer getLikeCountByUserModelFromJSON(String json) {
	Integer count = null;
	try {
		Type type = new TypeToken<Integer>() {
		}.getType();
		Gson gson = new Gson();
		count = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getLikeCountByUserModelFromJSON JSON PARSER", ex.getMessage());
	}
	return count;
	}

	public Integer getLikeCountBypostModelFromJSON(String json) {
	Integer count = null;
	try {
		Type type = new TypeToken<Integer>() {
		}.getType();
		Gson gson = new Gson();
		count = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getLikeCountBypostModelFromJSON JSON PARSER", ex.getMessage());
	}
	return count;
	}

	public List<LikePostsByUserIdModel> getLikePostsByUserIdModelFromJSON(String json) {

	List<LikePostsByUserIdModel> model = null;
	try {
		Type type = new TypeToken<List<LikePostsByUserIdModel>>() {
		}.getType();

		model = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("getLikePostsByUserIdModelFromJSON JSON PARSER", ex.getMessage());
	}

	return model;
	}

	public List<LikeUsersByPostIdModel> getLikeUsersByPostIdModelFromJSON(String json) {

	List<LikeUsersByPostIdModel> model = null;
	try {
		Type type = new TypeToken<List<LikeUsersByPostIdModel>>() {
		}.getType();

		model = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("LikeUsersByPostIdModelFromJSON JSON PARSER", ex.getMessage());
	}

	return model;
	}

}
