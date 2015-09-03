package com.itbarx.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;

import com.itbarx.R;


public class T_RecordActivity extends BaseActivity  {


    @Override
    protected int getLayoutResourceId() {
        return R.layout.t_record_activity;
    }

    @Override
    protected Context getContext() {
        return T_RecordActivity.this;
    }

    @Override
    protected void initViews() {

        setFragment(new F_RecordFragment(T_RecordActivity.this));
    }

    //adds fragments into activity.
    protected void setFragment(Fragment fragment1) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.record1_fragment_container, fragment1, "record");

        fragmentTransaction.commit();
    }
}
