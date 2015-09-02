package com.itbarx.activity;

import com.itbarx.R;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;

public class Tab5Activity extends BaseActivity {

	private static final String HOME = "0";
	private static final String ACTIVITY = "1";
	private static final String RECORD = "2";
	private static final String SEARCH = "3";
	private static final String PROFILE = "4";

	TabHost tabHost;

	private void setTabs() {
	tabHost = (TabHost) findViewById(android.R.id.tabhost);

	// tabHost.setup();

	tabHost.setup(this.getLocalActivityManager());
	tabHost.setOnTabChangedListener(onTabChangeListener);
	addTab(HOME, R.drawable.tab_home, T_HomeActivity.class);
	addTab(ACTIVITY, R.drawable.tab_activity, T_HomeActivity.class);
	addTab(RECORD, R.drawable.tab_record, T_HomeActivity.class);
	addTab(SEARCH, R.drawable.tab_search, T_HomeActivity.class);
	addTab(PROFILE, R.drawable.tab_profile, T_HomeActivity.class);

	}

	private void addTab(String labelId, int drawableId, Class<?> c) {
	Intent intent = new Intent(this, c);
	TabHost.TabSpec spec = tabHost.newTabSpec(labelId);

	View tabIndicator = LayoutInflater.from(this).inflate(R.layout.tab_indicator, tabHost.getTabWidget(), false);

	ImageView icon = (ImageView) tabIndicator.findViewById(R.id.icon);
	icon.setImageResource(drawableId);

	spec.setIndicator(tabIndicator);
	spec.setContent(intent);
	tabHost.addTab(spec);
	}

	@Override
	protected int getLayoutResourceId() {
	// TODO Auto-generated method stub
	return R.layout.tab_activity;
	}

	@Override
	protected Context getContext() {
	// TODO Auto-generated method stub
	return Tab5Activity.this;
	}

	@Override
	protected void initViews() {

	setTabs();

	}

	OnTabChangeListener onTabChangeListener = new OnTabChangeListener() {

	@Override
	public void onTabChanged(String tabId) {
		switch (Integer.parseInt(tabId)) {
		case 0:
		// POPULAR
		chooseFragment(0);
		break;
		case 1:
		// ACTIVITY
		chooseFragment(1);
		break;
		case 2:
		// RECORD-NEW BARK
		chooseFragment(2);
		break;
		case 3:
		// SEARCH
		chooseFragment(3);
		break;
		case 4:
		// WALL - PROFILE
		chooseFragment(4);
		break;

		}

	}
	};

	Fragment fragment = null;
	FragmentManager fragmentManager = null;
	static int currentId = 0;
	static int counter = 0;

	private void chooseFragment(int position) {

	if (counter == 0) {

		counter++;
		return;
	}
	currentId = position;

	switch (currentId) {
	case 0:
		fragment = new F_PopularFragment();
		break;

	case 1:
		fragment = new F_ActivityFragment();
		break;

	case 2:
		fragment = new F_NewBarkFragment();
		break;
	case 3:
		fragment = new F_SearchFragment();
		break;
	case 4:
		fragment = new F_ProfileFragment();
		break;
	}

	if (fragment != null) {
		fragmentManager = getFragmentManager();
		//fragmentManager.beginTransaction().replace(R.id.tab5_activity_screen_tab_fagment_container, fragment).commit();
	} else {
		// fragment cagirirken ve olusturulurken hata olustu
		Log.e("Tab5Activity", "A Error occured while being created a fragment.");
	}

	}
}
