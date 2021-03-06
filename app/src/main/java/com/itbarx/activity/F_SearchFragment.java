package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.custom.component.EditTextRegular;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.utils.TextSizeUtil;

import android.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class F_SearchFragment extends Fragment {

 private   TextViewRegular txtToolbar;
  private  EditTextRegular searchPersonEdtTxt;

    private T_SearchActivity t_searchActivity;

    public F_SearchFragment() {
    }

    public F_SearchFragment(T_SearchActivity t_searchActivity) {
        this.t_searchActivity = t_searchActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_search_screen, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
       txtToolbar = (TextViewRegular) t_searchActivity.findViewById(R.id.search_fragment__toolbar_textView);
        searchPersonEdtTxt = (EditTextRegular) t_searchActivity.findViewById(R.id.search_fragment_screen_search_edittext);
        setTextSize();

    }

    private void setTextSize(){
        txtToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        searchPersonEdtTxt.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
    }
}