package com.itbarx.custom.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.itbarx.R;


public class ActivityFragmentItemView extends RelativeLayout {

 //   private ImageView mImageView;
    private TextView mFullnameTextView;
    private TextView mActionTextView;
    private TextView mYourTextView;
    private TextView mBarkTextView;

    public ActivityFragmentItemView(Context c) {
        this(c, null);
    }

    public ActivityFragmentItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ActivityFragmentItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        LayoutInflater.from(context).inflate(R.layout.cust_activity_fragment_item_view_children, this, true);
        setupChildren();
    }

    public static ActivityFragmentItemView inflate(ViewGroup parent) {

        ActivityFragmentItemView itemView = (ActivityFragmentItemView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cust_activity_fragment_item_view,parent,false);
        return itemView;
                   }

    private void setupChildren() {
        mFullnameTextView = (TextView) findViewById(R.id.item_fullNameTextView);
        mActionTextView = (TextView) findViewById(R.id.item_actionTextView);
        mYourTextView = (TextView) findViewById(R.id.item_yourTextView);
        mBarkTextView = (TextView) findViewById(R.id.item_barkTextView);
    //    mImageView = (ImageView) findViewById(R.id.item_imageView);
    }

    public void setItem(ActivityFragmentItem item) {
        mFullnameTextView.setText(item.getFullName());
        mActionTextView.setText(item.getAction());
       mYourTextView.setText(item.getYour());
        mBarkTextView.setText(item.getBark());
     //   mImageView.setImageResource(item.getImgURL());
            }


/*
    public ImageView getmImageView() {
        return mImageView;
    }
*/
    public TextView getmFullnameTextView() {
        return mFullnameTextView;
    }

    public TextView getmActionTextView() {
        return mActionTextView;
    }

    public TextView getmYourTextView() {
        return mYourTextView;
    }

    public TextView getmBarkTextView() {
        return mBarkTextView;
    }
}
