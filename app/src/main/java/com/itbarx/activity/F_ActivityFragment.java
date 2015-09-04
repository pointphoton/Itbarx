package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.adapter.ActivityFragmentListAdapter;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.enums.Fragments;
import com.itbarx.listener.ActivityProcessesServiceListener;
import com.itbarx.listener.OneShotOnClickListener;
import com.itbarx.model.activity.ActivityListModel;
import com.itbarx.model.activity.ActivityModel;
import com.itbarx.sl.ActivityProcessesServiceSL;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class F_ActivityFragment extends Fragment {

	Button btnOpenRequest;
	Communicator comm;

	ListView activityListView;
	List<ActivityListModel> activityListModels;

	T_SecondActivity t_secondActivity;

	public F_ActivityFragment()
	{


	}
	public F_ActivityFragment(T_SecondActivity activity)
	{
		t_secondActivity =activity;

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

	return inflater.inflate(R.layout.fragment_activity_screen, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);
		//sends the message via communicator interface.
		comm = (Communicator) getActivity();
		btnOpenRequest = (Button) getActivity().findViewById(R.id.activity_fragment_request_button);
		btnOpenRequest.setOnClickListener(openRequestClickListener);
		//fills up the listview
		activityListView =(ListView)getActivity().findViewById(R.id.fragment_activity_screen_activities_listview);

		//activityListView.setAdapter(null);
		getActivityList(sendModel());
	}

	//send data to web service
	private ActivityModel sendModel(){
		ActivityModel requestModel = new ActivityModel();
		requestModel.setPage("1");
		requestModel.setRecPerPage("10");
		//requestModel.setUserID("10027");
	//	requestModel.setUserID("10032");
		requestModel.setUserID(ItbarxGlobal.getInstance().getAccountModel().getUserID());
		return requestModel;
	}

	public void getActivityList(ActivityModel activityModel) {
		ActivityProcessesServiceSL activityProcessesServiceSL = new ActivityProcessesServiceSL(t_secondActivity.getContext(), activityProcessesServiceListener, R.string.root_service_url);
		activityProcessesServiceSL.setActivityList(activityModel);
		t_secondActivity.showProgress( getString( R.string.ItbarxConnecting));
	}

	OneShotOnClickListener openRequestClickListener = new OneShotOnClickListener(500) {

		@Override
		public void onOneShotClick(View v) {
			comm.choose(Fragments.ACTIVITY.name());
		}
	};

	ActivityProcessesServiceListener<String> activityProcessesServiceListener = new ActivityProcessesServiceListener<String>() {

		@Override
		public void onComplete(ResponseServiceModel<String> onComplete) {
			t_secondActivity.dismissProgress();

		}

		@Override
		public void onError(ServiceErrorModel onError) {
			t_secondActivity.dismissProgress();

		}

		@Override
		public void getActivityList(List<ActivityListModel> activityListModel) {
			t_secondActivity.dismissProgress();
			activityListModels = activityListModel;
			activityListView.setAdapter(new ActivityFragmentListAdapter(t_secondActivity.getContext(),activityListModel));
		}
	};

}