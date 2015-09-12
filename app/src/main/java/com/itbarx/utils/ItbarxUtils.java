package com.itbarx.utils;

import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONObject;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.itbarx.common.ServiceResponseModel;
import com.itbarx.enums.GlobalDataForWS;

import android.util.Log;

public class ItbarxUtils {

	public static ServiceResponseModel getServiceResponseModel(String jsonResult, String dataObjectKey) {

	ServiceResponseModel model = new ServiceResponseModel();

	try {
		JsonElement jelement = new JsonParser().parse(jsonResult);
		JsonObject jobject = jelement.getAsJsonObject();
		jobject = jobject.getAsJsonObject(GlobalDataForWS.DATA.toString());

		if (jobject != null) {

		if (!jobject.get(GlobalDataForWS.TOKEN.toString()).isJsonNull()) {
			model.setToken(jobject.get(GlobalDataForWS.TOKEN.toString()).toString());
		}

		if (!jobject.get(dataObjectKey).isJsonNull()) {
			model.setModel(jobject.get(dataObjectKey).toString());
		}
		}

	} catch (Exception e) {
		Log.d("ItbarxUtils getServiceResponseModel", e.getMessage());
	}

	return model;

	}

	public static ServiceResponseModel getServiceResponseModelDataKey(String jsonResult) {

	ServiceResponseModel model = new ServiceResponseModel();

	try {
		JsonElement jelement = new JsonParser().parse(jsonResult);
		JsonObject jobject = jelement.getAsJsonObject();
		JsonElement element = jobject.get(GlobalDataForWS.DATA.toString());

		if (element != null) {

		model.setModel(element.toString());

		}

	} catch (Exception e) {
		Log.d("ItbarxUtils getServiceResponseModel", e.getMessage());
	}

	return model;

	}

	public static ServiceResponseModel getServiceResponseArrayModelDataKey(String jsonResult) {

		ServiceResponseModel model = new ServiceResponseModel();

		try {
			JsonElement jelement = new JsonParser().parse(jsonResult);
			JsonObject jobject = jelement.getAsJsonObject();
			JsonElement element = jobject.get(GlobalDataForWS.DATA.toString());
			if (element != null) {

				model.setModel(element.toString());

			}

		} catch (Exception e) {
			Log.d("ItbarxUtils getServiceResponseModel", e.getMessage());
		}

		return model;

	}
	public static String formattedData(List<NameValuePair> params) {

	if (params == null) {
		return null;
	}
	String retunValue = "{ ";

	if (params != null && params.size() > 0) {

		for (int i = 0; i < params.size(); i++) {

		if (params.size() > 1) {

			if (params.size() - 1 == i) {
			retunValue += "\"" + params.get(i).getName() + "\" : ";
			retunValue += "\"" + params.get(i).getValue() + "\"";
			} else {
			retunValue += "\"" + params.get(i).getName() + "\" : ";
			retunValue += "\"" + params.get(i).getValue() + "\"";
			retunValue += " , ";
			}

		} else {
			retunValue += "\"" + params.get(i).getName() + "\" : ";
			retunValue += "\"" + params.get(i).getValue() + "\"";
		}

		}
	}
	retunValue += " }";
	return retunValue;
	}

}
