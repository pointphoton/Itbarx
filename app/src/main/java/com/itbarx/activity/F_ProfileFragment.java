package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.adapter.PopularFragmentListAdapter;
import com.itbarx.adapter.ProfilFragmentListAdapter;
import com.itbarx.application.ItbarxGlobal;
import com.itbarx.custom.component.CustOpenBoldTextView;
import com.itbarx.custom.component.CustOpenRegularTextView;
import com.itbarx.model.account.AccountGetUserByLoginInfoModel;
import com.itbarx.model.post.PostPopularPostListModel;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class F_ProfileFragment extends Fragment {

    private T_ProfileActivity t_profileActivity;
    private AccountGetUserByLoginInfoModel accLoginInfoModel;
    private List<PostPopularPostListModel> postPopularPostListModels;
    private CustOpenBoldTextView userNameTextView;
    private CustOpenRegularTextView userLocationTextView;
    private CustOpenRegularTextView userBioTextView;
ListView userProfilePopularPostsListView;
    public F_ProfileFragment() {

    }

    public F_ProfileFragment(T_ProfileActivity t_profileActivity) {
        this.t_profileActivity = t_profileActivity;
    }
    /*
	 * public F_ProfileFragment(FiveTabFragmentsContainerActivity container) { mainActivity = container; }
	 */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_profile_screen, container, false);
        return rootView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (null != ItbarxGlobal.getInstance().getAccountModel()) {
            accLoginInfoModel = ItbarxGlobal.getInstance().getAccountModel();
        }

        // set user name
        userNameTextView = (CustOpenBoldTextView) t_profileActivity.findViewById(R.id.profile_fragment_screen_username_text);
        userNameTextView.setText((null != accLoginInfoModel.getName() && !accLoginInfoModel.getName().equals("")) ? accLoginInfoModel.getName() : userNameTextView.getText());
        //set user location
        userLocationTextView = (CustOpenRegularTextView) t_profileActivity.findViewById(R.id.profile_fragment_screen_place_text);
        userLocationTextView.setText((null != accLoginInfoModel.getLocationName() && !accLoginInfoModel.getLocationName().equals("")) ? accLoginInfoModel.getLocationName() : userLocationTextView.getText());
        //set user biography
        userBioTextView = (CustOpenRegularTextView) t_profileActivity.findViewById(R.id.profile_fragment_screen_user_bio_text);
        userBioTextView.setText((null != accLoginInfoModel.getUserBio() && !accLoginInfoModel.getUserBio().equals("")) ? accLoginInfoModel.getUserBio() : userBioTextView.getText());

        //fills up the listview
        userProfilePopularPostsListView= (ListView) t_profileActivity.findViewById(R.id.profile_fragment_screen_listView);
        postPopularPostListModels=ItbarxGlobal.getPopularListModel();
        userProfilePopularPostsListView.setAdapter(new ProfilFragmentListAdapter(t_profileActivity.getContext(), postPopularPostListModels));

    }
}
