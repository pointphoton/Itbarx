package com.itbarx.common;

import com.itbarx.json.ErrorMessageParserJSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ServiceErrorHelper {

	public boolean hasJsonErrorCode(String response) {
	boolean status = false;

	if (isJSONValid(response)) {
		status = true;

	}

	return status;

	}

	public boolean hasSoapXMLErrorCode(String response) {
	boolean status = false;

	String tag = "s:Envelope";

	if (response.indexOf(tag) != -1)
		status = true;

	return status;

	}

	public ServiceErrorModel getServiceErrorModel(String response) {
	ServiceErrorModel errorModel = null;
	if (hasJsonErrorCode(response)) {

		 ErrorMessageParserJSON parser = new ErrorMessageParserJSON();

		 errorModel= parser.getServiceErrorModelFromJSON(response);


	}

	return errorModel;
	}

	public boolean isJSONValid(String json) {
	try {
		new JSONObject(json);
	} catch (JSONException ex) {

		try {
		new JSONArray(json);
		} catch (JSONException ex1) {
		return false;
		}
	}
	return true;
	}

}
