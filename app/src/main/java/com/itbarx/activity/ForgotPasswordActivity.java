package com.itbarx.activity;

import com.itbarx.R;
import com.itbarx.custom.component.ButtonBold;
import com.itbarx.custom.component.EditTextRegular;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.utils.TextSizeUtil;

import android.content.Context;
import android.util.TypedValue;

public class ForgotPasswordActivity extends BaseActivity {

	private TextViewRegular txtToolbar,  txtInfo;
	private TextViewBold txtChangePass;
	private EditTextRegular edtEmailCode, edtEmail, edtNewPassword, edtRePassword;
	private ButtonBold  btnSendEmailCode, btnChange;


	@Override
	protected int getLayoutResourceId() {
	// TODO Auto-generated method stub
	return R.layout.activity_forgot_password_screen;
	}

	@Override
	protected Context getContext() {
	// TODO Auto-generated method stub
	return ForgotPasswordActivity.this;
	}

	@Override
	protected void initViews() {
		txtToolbar = (TextViewRegular) findViewById(R.id.forgot_password_activity_screen_toolbar_textView);
		edtEmailCode = (EditTextRegular) findViewById(R.id.forgot_password_activity_screen_eMailCode_editText);
		edtEmail = (EditTextRegular) findViewById(R.id.forgot_password_activity_screen_eMail_editText);
		edtNewPassword = (EditTextRegular) findViewById(R.id.forgot_password_activity_screen_newPassword_editText);
		edtRePassword = (EditTextRegular) findViewById(R.id.forgot_password_activity_screen_rePassword_editText);
		btnSendEmailCode = (ButtonBold) findViewById(R.id.forgot_password_activity_screen_sendMe_eMailCode_button);
		btnChange = (ButtonBold) findViewById(R.id.forgot_password_activity_screen_change_button);
		txtChangePass = (TextViewBold) findViewById(R.id.forgot_password_activity_screen_change_password_text);
		txtInfo = (TextViewRegular) findViewById(R.id.forgot_password_activity_screen_info_textView);
		setCompText();


	}

	private void setCompText() {

		btnSendEmailCode.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
		btnChange.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getButtonTextSize());
		txtInfo.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getForgotUpperInfoTextSize());
		txtToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
		txtChangePass.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getForgotChangePasswordTextSize());


	}

}
