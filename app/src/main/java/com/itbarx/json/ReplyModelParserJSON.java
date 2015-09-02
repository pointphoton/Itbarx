package com.itbarx.json;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.itbarx.model.reply.ReplyListModel;

import android.util.Log;

public class ReplyModelParserJSON {

	public Boolean getReplyDeleteModelFromJSON(String json) {

	Boolean isDeleted = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();

		isDeleted = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("getReplyDeleteModelFromJSON JSON PARSER", ex.getMessage());
	}

	return isDeleted;
	}

	public List<ReplyListModel> getReplyListModelFromJSON(String json) {

	List<ReplyListModel> model = null;
	try {
		Type type = new TypeToken<List<ReplyListModel>>() {
		}.getType();

		model = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("getReplyListModelFromJSON JSON PARSER", ex.getMessage());
	}

	return model;
	}

	public Boolean getReplyAddModelFromJSON(String json) {

	Boolean isAdded = null;
	try {
		Type type = new TypeToken<Boolean>() {
		}.getType();

		isAdded = new Gson().fromJson(json, type);

	} catch (Exception ex) {
		Log.d("getReplyListModelFromJSON JSON PARSER", ex.getMessage());
	}

	return isAdded;
	}

}
