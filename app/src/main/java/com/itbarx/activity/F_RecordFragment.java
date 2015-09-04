package com.itbarx.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.itbarx.R;

/**
 * TODO: Add a class header comment!
 */
public class F_RecordFragment extends Fragment {

    private T_RecordActivity t_recordActivity;


    public F_RecordFragment(){}

    public F_RecordFragment(T_RecordActivity t_recordActivity){

        this.t_recordActivity=t_recordActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_record_secreen, container, false);  }
}
