package com.itbarx.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;

import com.itbarx.R;

/**
 * TODO: Add a class header comment!
 */
public class T_ProfileActivity extends  BaseActivity {
    @Override
    protected int getLayoutResourceId() {
        return R.layout.t_profile_activity;
    }

    @Override
    protected Context getContext() {
        return T_ProfileActivity.this;
    }

    @Override
    protected void initViews() {
setFragment(new F_ProfileFragment(T_ProfileActivity.this));
    }

    protected void setFragment(Fragment fragment1) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.profile1_fragment_container, fragment1, "profile");
        fragmentTransaction.commit();
    }
}
