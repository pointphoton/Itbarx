package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.custom.component.EditTextRegular;
import com.itbarx.custom.component.TextViewRegular;

import android.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class F_SearchFragment extends Fragment {

    private static float EDIT_BOX_TEXT_SIZE =25;
    private static float TOOLBAR_TEXT_SIZE=33;
    private static float BUTTON_TEXT_SIZE = 27;
    private static float TEXTVIEW_TEXT_SIZE =30;
    private float textSizeEdtTxt = 0;
    private float textSizeBtn = 0;
    private float textSizeTextView = 0;
    private float textSizeToolbar = 0;
    TextViewRegular txtToolbar;
    EditTextRegular searchPersonEdtTxt;

    private T_SearchActivity t_searchActivity;

    public F_SearchFragment() {
    }

    public F_SearchFragment(T_SearchActivity t_searchActivity) {
        this.t_searchActivity = t_searchActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        return inflater.inflate(R.layout.fragment_search_screen, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textSizeToolbar = TOOLBAR_TEXT_SIZE / (getResources().getDisplayMetrics().density);
        textSizeEdtTxt = EDIT_BOX_TEXT_SIZE / (getResources().getDisplayMetrics().density);
        txtToolbar = (TextViewRegular) t_searchActivity.findViewById(R.id.search_fragment__toolbar_textView);
        searchPersonEdtTxt = (EditTextRegular) t_searchActivity.findViewById(R.id.search_fragment_screen_search_edittext);
        txtToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeToolbar);
        searchPersonEdtTxt.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSizeEdtTxt);

    }
}