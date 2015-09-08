package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.custom.component.ButtonBold;
import com.itbarx.custom.component.EditTextRegular;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.utils.TextSizeUtil;

import android.content.Context;
import android.util.TypedValue;
import android.widget.ImageView;

public class CreateNewAccountActivity extends BaseActivity {

    // ************************//
    // ---ATTRIBUTES---
    // ************************//
    private TextViewRegular txtToolbar, txtAccept, txtUserAgrrement, txtRememberMe;
    private EditTextRegular edtUserName, edtEmail, edtPassword, edtRePassword;
    private ButtonBold btnOk, btnTwitter, btnFacebook;
    private TextViewBold txtViewOr, txtAddPhoto;
    private ImageView rememberMeIcon;

    @Override
    protected int getLayoutResourceId() {
        // TODO Auto-generated method stub
        return R.layout.activity_create_new_account_screen;
    }

    @Override
    protected Context getContext() {
        // TODO Auto-generated method stub
        return CreateNewAccountActivity.this;
    }

    @Override
    protected void initViews() {
        txtToolbar = (TextViewRegular) findViewById(R.id.create_new_account_activity_screen_toolbar_textView);
        edtUserName = (EditTextRegular) findViewById(R.id.create_new_account_activity_screen_userName_editText);
        edtEmail = (EditTextRegular) findViewById(R.id.create_new_account_activity_screen_eMail_editText);
        edtPassword = (EditTextRegular) findViewById(R.id.create_new_account_activity_screen_password_editText);
        edtRePassword = (EditTextRegular) findViewById(R.id.create_new_account_activity_screen_rePassword_editText);
        btnOk = (ButtonBold) findViewById(R.id.create_new_account_activity_screen_ok_button);
        btnTwitter = (ButtonBold) findViewById(R.id.create_new_account_activity_screen_twitter_button);
        btnFacebook = (ButtonBold) findViewById(R.id.create_new_account_activity_screen_facebook_button);
        txtViewOr = (TextViewBold) findViewById(R.id.create_new_account_activity_screen_or_textView);
        txtAddPhoto = (TextViewBold) findViewById(R.id.create_new_account_activity_screen_addPhoto_textView);
        txtAccept = (TextViewRegular) findViewById(R.id.create_new_account_activity_screen_agreeTo_textView);
        txtUserAgrrement = (TextViewRegular) findViewById(R.id.create_new_account_activity_screen_userAgreement_textView);
        txtRememberMe = (TextViewRegular) findViewById(R.id.create_new_account_activity_screen_rememberMe_textView);
        rememberMeIcon = (ImageView) findViewById(R.id.create_new_account_activity_screen_rememberMe_imageView);
        setCompText();
    }

    private void setCompText() {

        btnOk.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        btnFacebook.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        btnTwitter.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
        txtViewOr.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getLoginOrTextSize());
        txtToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        edtUserName.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
        edtPassword.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
        edtEmail.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
        edtRePassword.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getEditBoxTextSize());
        txtAddPhoto.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getCreateAddphotoTextSize());
        txtAccept.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getCreateMiddleInfoTextSize());
        txtUserAgrrement.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getCreateMiddleInfoTextSize());
        txtRememberMe.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getCreateMiddleInfoTextSize());

    }
}
