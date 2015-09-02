package com.itbarx.json;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.itbarx.model.rebark.ReBarkGetPostSharedUserListModel;
import com.itbarx.model.rebark.ReBarkGetSharedPostListModel;

import android.util.Log;

public class ReBarkModelParserJSON {

	public Boolean getReBarkPostShareModelFromJSON(String json) {
	Boolean isOK = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();
		Gson gson = new Gson();
		isOK = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getReBarkPostShareModelFromJSON JSON PARSER", ex.getMessage());
	}
	return isOK;
	}

	public List<ReBarkGetSharedPostListModel> getReBarkGetSharedPostListModelFromJSON(String json) {

	List<ReBarkGetSharedPostListModel> model = null;
	try {
		Type type = new TypeToken<List<ReBarkGetSharedPostListModel>>() {
		}.getType();

		model = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("getReBarkGetSharedPostListModelFromJSON JSON PARSER", ex.getMessage());
	}

	return model;
	}

	public List<ReBarkGetPostSharedUserListModel> getReBarkGetPostSharedUserListModelFromJSON(String json) {

	List<ReBarkGetPostSharedUserListModel> model = null;
	try {
		Type type = new TypeToken<List<ReBarkGetPostSharedUserListModel>>() {
		}.getType();

		model = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("getReBarkGetPostSharedUserListModelFromJSON JSON PARSER", ex.getMessage());
	}

	return model;
	}

	public Integer getReBarkSharedPostCountModelFromJSON(String json) {
	Integer count = null;
	try {
		Type type = new TypeToken<Integer>() {
		}.getType();
		Gson gson = new Gson();
		count = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getReBarkSharedPostCountModelFromJSON JSON PARSER", ex.getMessage());
	}
	return count;
	}

	public Integer getReBarkPostSharedUserCountModelFromJSON(String json) {
	Integer count = null;
	try {
		Type type = new TypeToken<Integer>() {
		}.getType();
		Gson gson = new Gson();
		count = gson.fromJson(json, type);
	} catch (Exception ex) {
		Log.d("getReBarkPostSharedUserCountModelFromJSON JSON PARSER", ex.getMessage());
	}
	return count;
	}
}
