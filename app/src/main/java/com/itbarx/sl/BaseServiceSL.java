package com.itbarx.sl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.itbarx.listener.BaseServiceListener;
import com.itbarx.listener.ServiceClientListener;
import com.itbarx.listener.ServiceErrorClientListener;

import android.content.Context;




public abstract class BaseServiceSL<T> implements ServiceClientListener<T>{
	

	Context context;
	private String serviceUri = "";
	private BaseServiceListener<T> serviceListener;
	private ServiceErrorClientListener serviceErrorClientListener = null;
	
	//Base Constructor
	public BaseServiceSL(Context appContext,BaseServiceListener<T> listener,int serviceResUriId)
	{
		//Base Constructor
		context = appContext;
		serviceUri=	context.getString(serviceResUriId);
		serviceListener = listener;
		addListener(serviceListener);
		
	}
	public void setOnServiceErrorClientListener(ServiceErrorClientListener onServiceErrorClientListener)
	{
		serviceErrorClientListener = onServiceErrorClientListener;
		addErrorListener(serviceErrorClientListener);
	}
	  private List<ServiceErrorClientListener> errorlisteners = new CopyOnWriteArrayList<ServiceErrorClientListener>();

	    public synchronized void addErrorListener(ServiceErrorClientListener errorlistener) {
	    	errorlisteners.add(errorlistener);
	    }    

	    public synchronized  void removeErrorListener(ServiceErrorClientListener errorlistener) {
	    	errorlisteners.remove(errorlistener);
	    }

	
	  private List<BaseServiceListener<T>> listeners = new CopyOnWriteArrayList<BaseServiceListener<T>>();

	    public synchronized void addListener(BaseServiceListener<T> listener) {
	      listeners.add(listener);
	    }    

	    public synchronized  void removeListener(BaseServiceListener<T> listener) {
	      listeners.remove(listener);
	    }

	  

	public	String getServiceUri() {
			return serviceUri;
		}

		void setServiceUri(String serviceUri) {
			this.serviceUri = serviceUri;
		}

	
		
}
