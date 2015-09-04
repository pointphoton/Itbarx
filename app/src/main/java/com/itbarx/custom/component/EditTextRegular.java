package com.itbarx.custom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * TODO: Add a class header comment!
 */
public class EditTextRegular extends EditText {
    public EditTextRegular(Context context) {
        super(context);   setFont();
    }

    public EditTextRegular(Context context, AttributeSet attrs) {
        super(context, attrs);   setFont();
    }

    public EditTextRegular(Context context, AttributeSet attrs, int defStyle) {
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
