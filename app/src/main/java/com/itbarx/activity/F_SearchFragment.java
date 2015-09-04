package com.itbarx.activity;

import com.itbarx.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class F_SearchFragment extends Fragment {

	private T_SearchActivity t_searchActivity;

	public F_SearchFragment(){}
	public F_SearchFragment( T_SearchActivity t_searchActivity){ this.t_searchActivity=t_searchActivity;}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	return inflater.inflate(R.layout.fragment_request_screen, container, false);
	}

}