package com.itbarx.listener;

import java.util.EventListener;

import com.itbarx.common.ResponseServiceModel;



public interface ServiceClientListener<T> extends EventListener {

	public void onGETReceive(ResponseServiceModel<T> responseEvent);

}
