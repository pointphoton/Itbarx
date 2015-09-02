package com.itbarx.sl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.itbarx.listener.BaseServiceListener;
import com.itbarx.listener.ServiceClientListener;
import com.itbarx.listener.ServiceErrorClientListener;
import com.itbarx.listener.ServicePostClientListener;

import android.content.Context;

public abstract class BasePostServiceSL<T> implements ServicePostClientListener<T>, ServiceClientListener<T>, ServiceErrorClientListener {

	Context context;
	private String serviceUri = "";
	private String serviceGetUri = "";
	private BaseServiceListener<T> serviceListener;
	private ServiceErrorClientListener serviceErrorClientListener = null;

	// Base Constructor
	public BasePostServiceSL(Context appContext, BaseServiceListener<T> listener, int serviceResUriId) {
	// Base Constructor
	context = appContext;
	serviceUri = context.getString(serviceResUriId);
	serviceListener = listener;
	addListener(serviceListener);

	}

	public void setOnServiceErrorClientListener(ServiceErrorClientListener onServiceErrorClientListener) {
	serviceErrorClientListener = onServiceErrorClientListener;
	addErrorListener(serviceErrorClientListener);
	}

	private List<ServiceErrorClientListener> errorlisteners = new CopyOnWriteArrayList<ServiceErrorClientListener>();

	public synchronized void addErrorListener(ServiceErrorClientListener errorlistener) {
	errorlisteners.add(errorlistener);
	}

	public synchronized void removeErrorListener(ServiceErrorClientListener errorlistener) {
	errorlisteners.remove(errorlistener);
	}

	private List<BaseServiceListener<T>> listeners = new CopyOnWriteArrayList<BaseServiceListener<T>>();

	public synchronized void addListener(BaseServiceListener<T> listener) {
	listeners.add(listener);
	}

	public synchronized void removeListener(BaseServiceListener<T> listener) {
	listeners.remove(listener);
	}

	public String getServiceUri() {
	return serviceUri;
	}

	void setServiceUri(String serviceUri) {
	this.serviceUri = serviceUri;
	}

	public String getServiceGETUri() {
	return serviceUri;
	}

	public void setServiceGETUri(int serviceResUriId) {
	this.serviceUri = context.getString(serviceResUriId);
	}

}
