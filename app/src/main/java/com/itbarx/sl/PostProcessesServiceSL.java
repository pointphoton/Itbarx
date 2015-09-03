package com.itbarx.sl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.itbarx.R;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.common.ServiceResponseModel;
import com.itbarx.enums.GlobalDataForWS;
import com.itbarx.enums.PostProcessLinks;
import com.itbarx.json.PostModelParserJSON;
import com.itbarx.listener.PostProcessesServiceListener;
import com.itbarx.model.post.PostAddPostModel;
import com.itbarx.model.post.PostGetPostDetailModel;
import com.itbarx.model.post.PostGetWallInfoModel;
import com.itbarx.model.post.PostNewModel;
import com.itbarx.model.post.PostNewPostListModel;
import com.itbarx.model.post.PostPopularModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.model.post.PostPostDetailModel;
import com.itbarx.model.post.PostTimelineListForUserModel;
import com.itbarx.model.post.PostTimelineModel;
import com.itbarx.model.post.PostWallInfoModel;
import com.itbarx.model.post.PostWallListForUserModel;
import com.itbarx.model.post.PostWallModel;
import com.itbarx.utils.ItbarxUtils;

import android.content.Context;

public class PostProcessesServiceSL extends BasePostServiceSL<String> {

	private static final String NAME_OF_THE_CLASS = PostProcessesServiceSL.class.getSimpleName();
	PostProcessesServiceListener<String> postProcessesServiceListener;

	public PostProcessesServiceSL(Context appContext, PostProcessesServiceListener<String> listener, int serviceResUriId) {
	super(appContext, listener, serviceResUriId);
	postProcessesServiceListener = listener;
	setOnServiceErrorClientListener(this);
	}

	// **********************************//
	// ---SEND DATA WEBSERVICE METHODS---
	// **********************************//

	// TIMELINE
	public void setTimeline(PostTimelineModel postTimelineModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), postTimelineModel.getUserID()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PAGE.toString(), postTimelineModel.getPage()));
	params.add(new BasicNameValuePair(GlobalDataForWS.REC_PER_PAGE.toString(), postTimelineModel.getRecPerPage()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.GET_TIMELINE.toString());
	}

	// WALL
	public void setWall(PostWallModel postWallModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), postWallModel.getUserID()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PAGE.toString(), postWallModel.getPage()));
	params.add(new BasicNameValuePair(GlobalDataForWS.REC_PER_PAGE.toString(), postWallModel.getRecPerPage()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.GET_WALL.toString());
	}

	// POPULAR POST
	public void setPopular(PostPopularModel postPopularModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), postPopularModel.getUserID()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PAGE.toString(), postPopularModel.getPage()));
	params.add(new BasicNameValuePair(GlobalDataForWS.REC_PER_PAGE.toString(), postPopularModel.getRecPerPage()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.GET_POPULAR.toString());
	}

	// NEW POST
	public void setNew(PostNewModel postNewModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), postNewModel.getUserID()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PAGE.toString(), postNewModel.getPage()));
	params.add(new BasicNameValuePair(GlobalDataForWS.REC_PER_PAGE.toString(), postNewModel.getRecPerPage()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.GET_NEW_POST.toString());
	}

	// WALL INFO
	public void setWallInfo(PostWallInfoModel postWallInfoModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.SEARCHER_ID.toString(), postWallInfoModel.getSearcherID()));
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), postWallInfoModel.getUserID()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.GET_WALL_INFO.toString());
	}

	// POST DETAIL
	public void setGetPostDetail(PostPostDetailModel postPostDetailModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.POST_ID.toString(), postPostDetailModel.getPostID()));

	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.GET_POST_DETAIL.toString());
	}

	// ADD POST
	public void setAddPost(PostAddPostModel postAddPostModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.POST_SPEECH_TEXT.toString(), postAddPostModel.getPostSpeechText()));
	params.add(new BasicNameValuePair(GlobalDataForWS.POST_SENDER_USER_ID.toString(), postAddPostModel.getPostSenderUserId()));
	params.add(new BasicNameValuePair(GlobalDataForWS.POST_SENDER_IP.toString(), postAddPostModel.getPostSenderIp()));
	params.add(new BasicNameValuePair(GlobalDataForWS.VIDEO_BYTES.toString(), postAddPostModel.getVideoBytes()));

	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, PostProcessLinks.ADD_POST.toString());
	}
	// ************************//
	// ---OVERRIDED METHODS---
	// ************************//

	@Override
	public void onPOSTCommit(ResponseServiceModel<String> responseEvent) {
	String result = responseEvent.getResponseData();

	// ---GET TIMELINE LIST FOR USER---
	if (responseEvent.getMethodName().equalsIgnoreCase(PostProcessLinks.GET_TIMELINE.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseArrayModelDataKey(result);
		List<PostTimelineListForUserModel> postTimelineListForUserModelResponse = null;
		if (model != null) {
		postTimelineListForUserModelResponse = new PostModelParserJSON().getPostTimelineListForUserModelFromJSON(model.getModel());
		}
		if (postTimelineListForUserModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		postProcessesServiceListener.onError(errorModel);
		} else {
		postProcessesServiceListener.getTimelineListForUser(postTimelineListForUserModelResponse);
		}
	} // ---GET WALL LIST FOR USER---
	else if (responseEvent.getMethodName().equalsIgnoreCase(PostProcessLinks.GET_WALL.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseArrayModelDataKey(result);
		List<PostWallListForUserModel> postWallListForUserModelResponse = null;
		if (model != null) {
		postWallListForUserModelResponse = new PostModelParserJSON().getPostWallListForUserModelFromJSON(model.getModel());
		}
		if (postWallListForUserModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		postProcessesServiceListener.onError(errorModel);
		} else {
		postProcessesServiceListener.getWallListForUser(postWallListForUserModelResponse);
		}

	} // ---GET POPULAR POST LIST FOR USER---
	else if (responseEvent.getMethodName().equalsIgnoreCase(PostProcessLinks.GET_POPULAR.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseArrayModelDataKey(result);
		List<PostPopularPostListModel> postPopularPostListModelResponse = null;
		if (model != null) {
		postPopularPostListModelResponse = new PostModelParserJSON().getPostPopularPostListModelFromJSON(model.getModel());
		}
		if (postPopularPostListModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		postProcessesServiceListener.onError(errorModel);
		} else {
		postProcessesServiceListener.getPopularPostList(postPopularPostListModelResponse);
		}

	} // ---GET NEW POST LIST FOR USER---
	else if (responseEvent.getMethodName().equalsIgnoreCase(PostProcessLinks.GET_NEW_POST.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseArrayModelDataKey(result);
		List<PostNewPostListModel> postNewPostListModelResponse = null;
		if (model != null) {
		postNewPostListModelResponse = new PostModelParserJSON().getPostNewPostListModelFromJSON(model.getModel());
		}
		if (postNewPostListModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		postProcessesServiceListener.onError(errorModel);
		} else {
		postProcessesServiceListener.getNewPostList(postNewPostListModelResponse);
		}

	}
	// GET WALL INFO
	else if (responseEvent.getMethodName().equalsIgnoreCase(PostProcessLinks.GET_WALL_INFO.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModelDataKey(result);
		PostGetWallInfoModel postGetWallInfoModelResponse = null;
		if (model != null) {
		postGetWallInfoModelResponse = new PostModelParserJSON().getPostGetWallInfoModelFromJSON(model.getModel());
		}
		if (postGetWallInfoModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		postProcessesServiceListener.onError(errorModel);
		} else {
		postProcessesServiceListener.getWallInfo(postGetWallInfoModelResponse);
		}
	}
	// GET POST DETAIL
	else if (responseEvent.getMethodName().equalsIgnoreCase(PostProcessLinks.GET_POST_DETAIL.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModelDataKey(result);
		PostGetPostDetailModel postGetPostDetailModelResponse = null;
		if (model != null) {
		postGetPostDetailModelResponse = new PostModelParserJSON().getPostGetPostDetailModelFromJSON(model.getModel());
		}
		if (postGetPostDetailModelResponse == null) {
		ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
		errorModel.setDescription(context.getString(R.string.BrokenData));
		postProcessesServiceListener.onError(errorModel);
		} else {
		postProcessesServiceListener.getPostDetail(postGetPostDetailModelResponse);
		}
	}
	}

	@Override
	public void onGETReceive(ResponseServiceModel<String> responseEvent) {
	// TODO Auto-generated method stub

	}

	@Override
	public void onError(ServiceErrorModel responseServiceErrorModel) {
	postProcessesServiceListener.onError(responseServiceErrorModel);

	}

}
