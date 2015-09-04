package com.itbarx.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;

import com.itbarx.R;

/**
 * TODO: Add a class header comment!
 */
public class T_SearchActivity extends  BaseActivity {
    @Override
    protected int getLayoutResourceId() {
        return R.layout.t_search_activity;
    }

    @Override
    protected Context getContext() {
        return T_SearchActivity.this;
    }

    @Override
    protected void initViews() {

        setFragment(new F_SearchFragment(T_SearchActivity.this));
    }

    protected void setFragment(Fragment fragment1) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.search1_fragment_container, fragment1, "search");
        fragmentTransaction.commit();
    }
}
