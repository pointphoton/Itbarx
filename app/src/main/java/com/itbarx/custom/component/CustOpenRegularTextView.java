package com.itbarx.custom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Photon on 1.09.2015.
 */
public class CustOpenRegularTextView extends TextView {
    public CustOpenRegularTextView(Context context) {
        super(context);
    }

    public CustOpenRegularTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustOpenRegularTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
    }

    private void setFont() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSansRegular.ttf");
            setTypeface(tf);
        }
    }
}