package com.itbarx.custom.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

import com.itbarx.utils.TextSizeUtil;

/**
 * TODO: Add a class header comment!
 */
public class TextViewListItemReg extends TextView {
    public TextViewListItemReg(Context context) {
        super(context);
        setFont();
        setTextSizeList();
    }

    public TextViewListItemReg(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFont();
        setTextSizeList();
    }

    public TextViewListItemReg(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        setFont();
        setTextSizeList();
    }

    private void setFont() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSansRegular.ttf");
            setTypeface(tf);
        }
    }
    private void setTextSizeList(){
        if (!isInEditMode()) {
      setTextSize(TypedValue.COMPLEX_UNIT_SP, TextSizeUtil.getToolbarTextSize());
        }
        }

    }
