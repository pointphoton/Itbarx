package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.adapter.PopularFragmentListAdapter;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.common.ResponseServiceModel;
import com.itbarx.common.ServiceErrorModel;
import com.itbarx.custom.component.ActivityFragmentItem;
import com.itbarx.custom.component.ActivityFragmentItemAdapter;
import com.itbarx.enums.Fragments;
import com.itbarx.listener.OneShotOnClickListener;
import com.itbarx.listener.PostProcessesServiceListener;
import com.itbarx.model.post.PostGetPostDetailModel;
import com.itbarx.model.post.PostGetWallInfoModel;
import com.itbarx.model.post.PostNewPostListModel;
import com.itbarx.model.post.PostPopularModel;
import com.itbarx.model.post.PostPopularPostListModel;
import com.itbarx.model.post.PostTimelineListForUserModel;
import com.itbarx.model.post.PostWallListForUserModel;
import com.itbarx.sl.PostProcessesServiceSL;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class F_PopularFragment extends Fragment {

    Button btnOpenTimeline;
    Communicator comm;
    T_HomeActivity t_homeActivity;
    List<PostPopularPostListModel> postPopularPostListModels;
    //VideoView video;
    ListView reqVidListView;

    F_PopularFragment() {
    }

    F_PopularFragment(T_HomeActivity t_homeActivity) {
        this.t_homeActivity = t_homeActivity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_popular_screen, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



		/*
        test=(ListView) getActivity().findViewById(R.id.test_listView);
		ArrayList<ActivityFragmentItem> listOfItems=new ArrayList<ActivityFragmentItem>();
		ActivityFragmentItem item;
		for(int i=1;i<11;i++){
			fullName=String.valueOf(i)+" full name";
			if(i/2==0) {
				action =  " liked";
			}
			else{
				action =  " rebark";
			}
			your=" your";
			bark=" bark";
			//item = new ActivityFragmentItem(R.drawable.user_male_icon,fullName,action,your,bark);,
			item = new ActivityFragmentItem(fullName,action,your,bark);
			if(item!=null) {
				listOfItems.add(item);
			}

		}

		ActivityFragmentItemAdapter afa= new ActivityFragmentItemAdapter(getActivity(),listOfItems);
		//	ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, stringArray);
		test.setAdapter(afa);
		//	test.setAdapter(adapter);
*/

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        //sends the message via communicator interface.
        comm = (Communicator) getActivity();
        btnOpenTimeline = (Button) getActivity().findViewById(R.id.popular_fragment_timeline_button);
        btnOpenTimeline.setOnClickListener(openTimelineClickListener);

        //fills up the listview
        reqVidListView = (ListView) getActivity().findViewById(R.id.popular_fragment_screen_listview);
        getPopularList(sendModel());

        //video = (VideoView)t_homeActivity.findViewById(R.id.row_fragment_popular_screen_user_videoView);
        //Uri uri = Uri.parse("android.resource://" + t_homeActivity.getPackageName() + "/" + R.raw.sample);
        //video.setVideoURI(uri);
        //video.start();
    }

    private PostPopularModel sendModel() {
        PostPopularModel model = new PostPopularModel("10032", "1", "10");
        //	PostPopularModel model = new  PostPopularModel("10027","1","10");
        return model;
    }

    public void getPopularList(PostPopularModel model) {

        PostProcessesServiceSL postProcessesServiceSL = new PostProcessesServiceSL(t_homeActivity.getContext(), postProcessesServiceListener, R.string.root_service_url);
        postProcessesServiceSL.setPopular(model);
        t_homeActivity.showProgress(getString(R.string.ItbarxConnecting));
    }


    OneShotOnClickListener openTimelineClickListener = new OneShotOnClickListener(500) {

        @Override
        public void onOneShotClick(View v) {
            comm.choose(Fragments.POPULAR.name());
        }
    };

    PostProcessesServiceListener<String> postProcessesServiceListener = new PostProcessesServiceListener<String>() {
        @Override
        public void getTimelineListForUser(List<PostTimelineListForUserModel> postTimelineListForUserModel) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void getWallListForUser(List<PostWallListForUserModel> postWallListForUserModel) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void getPopularPostList(List<PostPopularPostListModel> popularPostListModel) {
            t_homeActivity.dismissProgress();
            postPopularPostListModels = popularPostListModel;
            ItbarxGlobal.setPopularListModel(popularPostListModel);
            reqVidListView.setAdapter(new PopularFragmentListAdapter(t_homeActivity.getContext(), postPopularPostListModels));

        }

        @Override
        public void getNewPostList(List<PostNewPostListModel> postNewPostListModels) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void getWallInfo(PostGetWallInfoModel postGetWallInfoModel) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void getPostDetail(PostGetPostDetailModel postDetailModel) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void isAdded(Boolean isAdded) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void onComplete(ResponseServiceModel<String> onComplete) {
            t_homeActivity.dismissProgress();
        }

        @Override
        public void onError(ServiceErrorModel onError) {
            t_homeActivity.dismissProgress();
        }
    };

}