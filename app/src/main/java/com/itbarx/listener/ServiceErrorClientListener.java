package com.itbarx.listener;

import com.itbarx.common.ServiceErrorModel;


public interface ServiceErrorClientListener {

	public void onError(ServiceErrorModel responseServiceErrorModel);
}
