package com.itbarx.activity;

import android.content.Context;
import android.util.TypedValue;

import com.itbarx.R;
import com.itbarx.custom.component.TextViewBold;
import com.itbarx.custom.component.TextViewRegular;
import com.itbarx.utils.TextSizeUtil;

/**
 * TODO: Add a class header comment!
 */
public class BarkActivity extends BaseActivity {

    private TextViewRegular txtToolbar,  txtSubtitle,txtLike,txtReBark,txtReply;
    private TextViewBold txtLikeCount,txtReBarkCount,txtReplyCount;

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_bark_screen;
    }

    @Override
    protected Context getContext() {
        return BarkActivity.this;
    }

    @Override
    protected void initViews() {
        txtToolbar = (TextViewRegular) findViewById(R.id.bark_activity_screen_toolbar_textView);
        txtSubtitle = (TextViewRegular) findViewById(R.id.bark_activity_screen_subtitle_TextView);
        txtLike = (TextViewRegular) findViewById(R.id.bark_activity_screen_like_text_TextView);
        txtReBark = (TextViewRegular) findViewById(R.id.bark_activity_screen_rebark_text_TextView);
        txtReply = (TextViewRegular) findViewById(R.id.bark_activity_screen_reply_text_TextView);
        txtLikeCount = (TextViewBold) findViewById(R.id.bark_activity_screen_like_count_TextView);
        txtReBarkCount = (TextViewBold) findViewById(R.id.bark_activity_screen_rebark_count_TextView);
        txtReplyCount = (TextViewBold) findViewById(R.id.bark_activity_screen_reply_count_TextView);
        setCompText();
    }

    private void setCompText() {
        txtToolbar.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        txtSubtitle.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkSubtitleTextSize());
        txtLike.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkMiniBtnTextSize());
        txtReBark.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkMiniBtnTextSize());
        txtReply.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkMiniBtnTextSize());
        txtLikeCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkCountTextSize());
        txtReBarkCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkCountTextSize());
        txtReplyCount.setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getBarkCountTextSize());

    }
}
