package com.itbarx.custom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

public class CustOpenSansButton extends Button {

	public CustOpenSansButton(Context context) {
	super(context);
	init();
	}

	public CustOpenSansButton(Context context, AttributeSet attrs) {
	super(context, attrs);
	init();
	}

	public CustOpenSansButton(Context context, AttributeSet attrs, int defStyle) {
	super(context, attrs, defStyle);
	init();
	}

	private void init() {
	if (!isInEditMode()) {
		Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSansRegular.ttf");
		setTypeface(tf);

	}

	}

}
