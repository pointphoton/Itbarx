package com.itbarx.application;


import android.content.Context;

public class IApplication extends android.app.Application {

	private static IApplication appInstance;

	public static IApplication getInstance() {
		return  appInstance;
	}

	public static Context getContext(){
		return appInstance;
	}

	@Override
	public void onCreate() {
		appInstance = this;
	super.onCreate();



		//FontUtil.setDefaultFont(this, "DEFAULT", "src/main/assets/OpenSansRegular.ttf");

	// CalligraphyConfig.initDefault("OpenSansBold.ttf");
	//CalligraphyConfig.initDefault("fonts/OpenSansRegular.ttf");

//	 CalligraphyConfig.initDefault(new CalligraphyConfig.Builder().setDefaultFontPath("fonts/OpenSansBold.ttf").build());
	}

}
