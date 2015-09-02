package com.itbarx.sl;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.itbarx.R;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.common.ServiceResponseModel;
import com.itbarx.enums.AccountProcessesLinks;
import com.itbarx.enums.GlobalDataForWS;
import com.itbarx.json.AccountModelParserJSON;
import com.itbarx.listener.AccountProcessesServiceListener;
import com.itbarx.model.account.AccountForgotSendMailModel;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.account.AccountSendEmailCodeModel;
import com.itbarx.model.account.AccountSignUpModel;
import com.itbarx.model.account.DeleteProfileModel;
import com.itbarx.model.account.EditProfileModel;
import com.itbarx.model.account.GetEditProfileIdModel;
import com.itbarx.model.account.GetEditProfileModel;
import com.itbarx.model.account.LoginModel;
import com.itbarx.utils.ItbarxUtils;

import android.content.Context;

public class AccountProcessesServiceSL extends BasePostServiceSL<String> {

	// private final String NAME_OF_THE_CLASS = this.getClass().getSimpleName();
	private static final String NAME_OF_THE_CLASS = AccountProcessesServiceSL.class.getSimpleName();
	AccountProcessesServiceListener<String> accountServiceListener;

	public AccountProcessesServiceSL(Context appContext, AccountProcessesServiceListener<String> listener, int serviceResUriId) {
	super(appContext, listener, serviceResUriId);
	accountServiceListener = listener;
	setOnServiceErrorClientListener(this);

	}

	// **********************************//
	// ---SEND DATA WEBSERVICE METHODS---
	// **********************************//

	// ---LOGIN---KULLANICI GİRİŞİ
	public void setLogInAccount(LoginModel loginModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USERNAME.toString(), loginModel.getUsername()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PASSWORD.toString(), loginModel.getPassword()));
	String postData = ItbarxUtils.formattedData(params);
	// Post service CALL
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.LOGIN_LINK.toString());
	}

	// ---SIGNUP---KULLANICI KAYIT
	public void setSignUpAccount(AccountSignUpModel signupModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USERNAME.toString(), signupModel.getUsername()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PASSWORD.toString(), signupModel.getPassword()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PASSWORD_CONFIRM.toString(), signupModel.getPasswordConfirm()));
	params.add(new BasicNameValuePair(GlobalDataForWS.EMAIL.toString(), signupModel.getEmail()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PHOTO_BASE64_STRING.toString(), signupModel.getPhoto()));
	String postData = ItbarxUtils.formattedData(params);
	// Post service CALL
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.SIGNUP_LINK.toString());
	}

	// ---FORGOT---KULLANICI ŞİFRE UNUTTUM
	public void setForgotAccount(AccountForgotSendMailModel accountForgotSendMailModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.EMAIL.toString(), accountForgotSendMailModel.getEmail()));
	String postData = ItbarxUtils.formattedData(params);
	// Post service CALL
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.FORGOT_PASSWORD_LINK.toString());
	}

	// ---CHANGE BY CODE---KULLANICI SİFRE DEĞİŞTİRME
	public void setChangePassByCodeAccount(AccountSendEmailCodeModel accountSendEmailCodeModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.EMAIL_CODE.toString(), accountSendEmailCodeModel.getEmailCode()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PASSWORD.toString(), accountSendEmailCodeModel.getPassword()));
	params.add(new BasicNameValuePair(GlobalDataForWS.PASSWORD_CONFIRM.toString(), accountSendEmailCodeModel.getPasswordConfirm()));
	String postData = ItbarxUtils.formattedData(params);
	// Post service CALL
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.FORGOT_PASSWORD_LINK.toString());
	}

	// ---GET_EDIT_PROFILE---KULLANICI EDİT SAYFASI BİLGİLERİ AL
	public void setGetEditProfile(GetEditProfileIdModel gEditProfileIdModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), gEditProfileIdModel.getUserID()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.GET_EDIT_PROFILE_LINK.toString());
	}

	// ---EDIT_PROFILE---
	public void setEditProfile(EditProfileModel editProfileModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), editProfileModel.getUserId()));
	params.add(new BasicNameValuePair(GlobalDataForWS.NAME.toString(), editProfileModel.getName()));
	params.add(new BasicNameValuePair(GlobalDataForWS.USERNAME.toString(), editProfileModel.getUserName()));
	params.add(new BasicNameValuePair(GlobalDataForWS.LOCATION.toString(), editProfileModel.getLocation()));
	params.add(new BasicNameValuePair(GlobalDataForWS.WEBSITE.toString(), editProfileModel.getWebSite()));
	params.add(new BasicNameValuePair(GlobalDataForWS.OLD_PASSWORD.toString(), editProfileModel.getOldPassword()));
	params.add(new BasicNameValuePair(GlobalDataForWS.NEW_PASSWORD.toString(), editProfileModel.getNewPassword()));
	params.add(new BasicNameValuePair(GlobalDataForWS.CONFIRM_PASSWORD.toString(), editProfileModel.getConfirmPassword()));
	params.add(new BasicNameValuePair(GlobalDataForWS.OLD_PHOTO_URL.toString(), editProfileModel.getOldPhotoUrl()));
	params.add(new BasicNameValuePair(GlobalDataForWS.NEW_PHOTO_BYTES.toString(), editProfileModel.getNewPhotoBase64String()));
	params.add(new BasicNameValuePair(GlobalDataForWS.IS_NOTIFICATION_ACTIVE.toString(), editProfileModel.getIsNotificationActive()));
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_BIO.toString(), editProfileModel.getUserBio()));

	String postData = ItbarxUtils.formattedData(params);
	// Post service CALL
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.EDIT_PROFILE_LINK.toString());
	}

	// ---DELETE_PROFILE---
	public void setDeleteProfile(DeleteProfileModel deleteProfileModel) {

	List<NameValuePair> params = new ArrayList<NameValuePair>();
	params.add(new BasicNameValuePair(GlobalDataForWS.USER_ID.toString(), deleteProfileModel.getUserID()));
	String postData = ItbarxUtils.formattedData(params);
	BaseServicePostClientSL<String> postClient = new BaseServicePostClientSL<String>(context, NAME_OF_THE_CLASS, postData);
	postClient.addServiceClientListener(this);
	postClient.addErrorErrorServiceClientListener(this);
	postClient.setBasicHttpBinding(true);
	String uri = getServiceUri();
	postClient.execute(uri, AccountProcessesLinks.DELETE_PROFILE_LINK.toString());
	}

	// ************************//
	// ---OVERRIDED METHODS---
	// ************************//

	@Override
	public void onPOSTCommit(ResponseServiceModel<String> responseEvent) {

	String result = responseEvent.getResponseData();
	// ---LOGIN---
	if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.LOGIN_LINK.toString())) {
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModel(result, "SpUserGetUserByLoginInfosResult");

		if (model != null) {

		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		AccountGetUserByLoginInfoModel loginModelResponse = accountModelParserJSON.getUserLoginInfoModelFromJSON(model.getModel());
		if (loginModelResponse == null) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.logInAccount(loginModelResponse);
		}

		}
	}

	// ---SIGNUP---
	else if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.SIGNUP_LINK.toString()))

	{
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModel(result, "SpUserGetUserByLoginInfosResult");

		if (model != null) {
		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		AccountGetUserByLoginInfoModel loginModelResponse = accountModelParserJSON.getUserLoginInfoModelFromJSON(model.getModel());
		if (loginModelResponse == null) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.signUpAccount(loginModelResponse);
		}
		}

	}
	// ---FORGOT---
	else if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.FORGOT_PASSWORD_LINK.toString()))

	{
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModelDataKey(result);

		if (model != null) {
		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		String forgotResponse = accountModelParserJSON.getForgotProfileModelFromJSON(model.getModel());
		if (forgotResponse == null) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.forgotAccount(forgotResponse);
		}
		}

	}

	// ---CHANGE PASS BY CODE---
	else if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.CHANGE_PASS_BY_CODE.toString()))

	{
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModel(result, "SpUserGetUserByLoginInfosResult");

		if (model != null) {
		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		AccountGetUserByLoginInfoModel loginModelResponse = accountModelParserJSON.getUserLoginInfoModelFromJSON(model.getModel());
		if (loginModelResponse == null) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.changePassByCode(loginModelResponse);
		}
		}

	}
	// ---GETEDITPROFILE---
	else if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.GET_EDIT_PROFILE_LINK.toString()))

	{
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModelDataKey(result);

		if (model != null) {
		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		GetEditProfileModel getEditProfileModelResponse = accountModelParserJSON.getGetEditProfileModelFromJSON(model.getModel());
		if (getEditProfileModelResponse == null) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.getEditProfileAccount(getEditProfileModelResponse);
		}

		}
	} // ---EDIT_PROFILE---
	else if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.EDIT_PROFILE_LINK.toString()))

	{
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModelDataKey(result);

		if (model != null) {
		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		EditProfileModel editProfileModelResponse = accountModelParserJSON.getEditProfileModelFromJSON(model.getModel());
		if (editProfileModelResponse == null) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.editProfileAccount(editProfileModelResponse);
		}

		}
	} // ---DELETE_PROFILE---
	else if (responseEvent.getMethodName().equalsIgnoreCase(AccountProcessesLinks.DELETE_PROFILE_LINK.toString()))

	{
		ServiceResponseModel model = ItbarxUtils.getServiceResponseModelDataKey(result);
		Boolean isDeletedResponse = null;
		if (model != null) {
		AccountModelParserJSON accountModelParserJSON = new AccountModelParserJSON();
		isDeletedResponse = accountModelParserJSON.getDeleteProfileModelFromJSON(model.getModel());
		if (isDeletedResponse == null || isDeletedResponse == false) {
			ServiceErrorModel<String> errorModel = new ServiceErrorModel<String>();
			errorModel.setDescription(context.getString(R.string.BrokenData));
			accountServiceListener.onError(errorModel);
		} else {
			accountServiceListener.deleteProfileAccount(isDeletedResponse);
		}

		}
	}

	}

	@Override
	public void onGETReceive(ResponseServiceModel<String> responseEvent) {
	// TODO Auto-generated method stub
	String result = responseEvent.getResponseData();

	}

	@Override
	public void onError(ServiceErrorModel serviceErrorModel) {

	accountServiceListener.onError(serviceErrorModel);

	}

}
