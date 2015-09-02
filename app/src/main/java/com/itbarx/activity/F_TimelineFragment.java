package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.enums.Fragments;
import com.itbarx.listener.OneShotOnClickListener;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class F_TimelineFragment extends Fragment {

	Button btnOpenPopular;
	Communicator comm;
	T_HomeActivity t_homeActivity;
	@SuppressLint("ValidFragment")
	F_TimelineFragment(){}
	F_TimelineFragment(T_HomeActivity t_homeActivity){
		this.t_homeActivity=t_homeActivity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

	return inflater.inflate(R.layout.fragment_timeline_screen, container, false);
	}


	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
	super.onActivityCreated(savedInstanceState);
	// t1 = (TextView) getActivity().findViewById(R.id.txt1);
	comm = (Communicator) getActivity();
	btnOpenPopular = (Button) getActivity().findViewById(R.id.timeline_fragment_popular_button);
	btnOpenPopular.setOnClickListener(openPopularClickListener);
	}



	OneShotOnClickListener openPopularClickListener = new OneShotOnClickListener(500) {

	@Override
	public void onOneShotClick(View v) {
		comm.choose(Fragments.TIMELINE.name());
	}
	}

	;

}