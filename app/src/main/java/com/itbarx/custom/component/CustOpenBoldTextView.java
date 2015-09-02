package com.itbarx.custom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustOpenBoldTextView extends TextView {

	public CustOpenBoldTextView(Context context) {
	super(context);
	init();
	}

	public CustOpenBoldTextView(Context context, AttributeSet attrs) {
	super(context, attrs);
	init();
	}

	public CustOpenBoldTextView(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	init();
	}

	private void init() {
	if (!isInEditMode()) {
		Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSansBold.ttf");
		setTypeface(tf);

	}

	}

}
