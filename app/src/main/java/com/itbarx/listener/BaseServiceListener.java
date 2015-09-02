package com.itbarx.listener;

import java.util.EventListener;

import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;



public interface BaseServiceListener<TModel> extends EventListener {
	
	public void onComplete(ResponseServiceModel<TModel> onComplete);
	public void onError(ServiceErrorModel onError);

}
