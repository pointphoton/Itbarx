package com.itbarx.listener;

import java.util.EventListener;

import com.itbarx.common.ResponseServiceModel;



public interface ServicePostClientListener<T> extends EventListener {

	public void onPOSTCommit(ResponseServiceModel<T> responseEvent);

}
