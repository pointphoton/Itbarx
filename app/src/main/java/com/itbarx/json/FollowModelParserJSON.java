package com.itbarx.json;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.itbarx.model.follow.FollowerListByFollowingIdModel;
import com.itbarx.model.follow.FollowingListByFollowerIdModel;
import com.itbarx.model.follow.PendingListByFollowingIdModel;
import com.itbarx.model.follow.SendPendingListByFollowerIdModel;

import android.util.Log;

public class FollowModelParserJSON {

	public Boolean getFollowUserModelFromJSON(String json) {
	Boolean isOK = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();
		Gson gson = new Gson();
		isOK = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getFollowUserModelFromJSON JSON PARSER", ex.getMessage());
	}
	return isOK;
	}

	public Integer getFollowingModelFromJSON(String json) {
	Integer count = null;
	try {
		Type type = new TypeToken<Integer>() {
		}.getType();
		Gson gson = new Gson();
		count = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getFollowingModelFromJSON JSON PARSER", ex.getMessage());
	}
	return count;
	}

	public Integer getFollowerModelFromJSON(String json) {
	Integer count = null;
	try {
		Type type = new TypeToken<Integer>() {
		}.getType();
		Gson gson = new Gson();
		count = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getFollowerModelFromJSON JSON PARSER", ex.getMessage());
	}
	return count;
	}

	public List<FollowerListByFollowingIdModel> getFollowerListByFollowingIdModelFromJSON(String json) {
	List<FollowerListByFollowingIdModel> model = null;
	try {
		Type type = new TypeToken<List<FollowerListByFollowingIdModel>>() {
		}.getType();
		Gson gson = new Gson();
		model = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getFollowerListByFollowingIdModelFromJSON JSON PARSER", ex.getMessage());
	}
	return model;
	}

	public List<FollowingListByFollowerIdModel> getFollowingListByFollowerIdModelFromJSON(String json) {
	List<FollowingListByFollowerIdModel> model = null;
	try {
		Type type = new TypeToken<List<FollowingListByFollowerIdModel>>() {
		}.getType();
		Gson gson = new Gson();
		model = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getFollowingListByFollowerIdModelFromJSON JSON PARSER", ex.getMessage());
	}
	return model;
	}

	public List<PendingListByFollowingIdModel> getPendingListByFollowingIdModelFromJSON(String json) {
		List<PendingListByFollowingIdModel> model = null;
		try {
			Type type = new TypeToken<List<PendingListByFollowingIdModel>>() {
			}.getType();
			Gson gson = new Gson();
			model = gson.fromJson(json, type);
		} catch (Exception ex) {
			Log.d("getPendingListByFollowingIdModelFromJSON JSON PARSER", ex.getMessage());
		}
		return model;
	}

	public List<SendPendingListByFollowerIdModel> getSendPendingListByFollowerIdModelFromJSON(String json) {
	List<SendPendingListByFollowerIdModel> model = null;
	try {
		Type type = new TypeToken<List<SendPendingListByFollowerIdModel>>() {
		}.getType();
		Gson gson = new Gson();
		model = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getSendPendingListByFollowerIdModelFromJSON JSON PARSER", ex.getMessage());
	}
	return model;
	}

}
