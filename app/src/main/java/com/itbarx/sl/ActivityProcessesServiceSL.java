package com.itbarx.sl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.itbarx.R;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.common.ServiceResponseModel;
import com.itbarx.enums.ActivityProcessesLinks;
import com.itbarx.enums.GlobalDataForWS;
import com.itbarx.json.ActivityModelParserJSON;
import com.itbarx.listener.ActivityProcessesServiceListener;
import com.itbarx.model.activity.ActivityListModel;
import com.itbarx.model.activity.ActivityModel;
import com.itbarx.utils.ItbarxUtils;

import android.content.Context;

public class ActivityProcessesServiceSL extends BasePostServiceSL<String> {

	private static final String NAME_OF_THE_CLASS = ActivityProcessesServiceSL.class.getSimpleName();
	ActivityProcessesServiceListener<String> activityProcessesServiceListener;

	public ActivityProcessesServiceSL(Context appContext, ActivityProcessesServiceListener<String> listener, int serviceResUriId) {
	super(appContext, listener, serviceResUriId);
	this.activityProcessesServiceListener = listener;
	setOnServiceErrorClientListener(this);
	}

	// **********************************//
	// ---SEND DATA WEBSERVICE METHODS---
	// **********************************//

	// SEARCHAUTOCOMPLETE
	public void setActivityList(ActivityModel activityModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), activityModel.getUserID()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PAGE.toString(), activityModel.getPage()));
	params.add(new BasicNameValuePair(GlobalDataForWS.REC_PER_PAGE.toString(), activityModel.getRecPerPage()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, ActivityProcessesLinks.ACTIVITY_LIST.toString());
	}

	// ************************//
	// ---OVERRIDED METHODS---
	// ************************//

	@Override
	public void onPOSTCommit(ResponseServiceModel<String> responseEvent) {
	String result = responseEvent.getResponseData();

	// ---GET SEARCHAUTOCOMPLETE LIST ---
	if (responseEvent.getMethodName().equalsIgnoreCase(ActivityProcessesLinks.ACTIVITY_LIST.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseArrayModelDataKey(result);
		List<ActivityListModel> activityListModelResponse = null;
		if (model != null) {
		activityListModelResponse = new ActivityModelParserJSON().getActivityListModelFromJSON(model.getModel());
		}
		if (activityListModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		activityProcessesServiceListener.onError(errorModel);
		} else {
		activityProcessesServiceListener.getActivityList(activityListModelResponse);
		}
	}
	}

	@Override
	public void onGETReceive(ResponseServiceModel<String> responseEvent) {
	// TODO Auto-generated method stub

	}

	@Override
	public void onError(ServiceErrorModel responseServiceErrorModel) {
	// TODO Auto-generated method stub
		activityProcessesServiceListener.onError(responseServiceErrorModel);
	}

}
