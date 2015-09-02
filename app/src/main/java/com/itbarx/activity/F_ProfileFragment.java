package com.itbarx.activity;

import com.itbarx.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F_ProfileFragment extends Fragment {
	// FiveTabFragmentsContainerActivity mainActivity;

	public F_ProfileFragment() {

	}
	/*
	 * public F_ProfileFragment(FiveTabFragmentsContainerActivity container) { mainActivity = container; }
	 */

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View rootView = inflater.inflate(R.layout.fragment_profile_screen, container, false);
	return rootView;
	}

}
