package com.itbarx.custom.component;

/**
 * Created by Photon on 31.08.2015.
 */
public class ActivityFragmentItem {


    private int imgURL;
    private String fullName;
    private String action;
    private String your;
    private String bark;

    public ActivityFragmentItem( String fullName, String action, String your, String bark) {

        this.fullName = fullName;
        this.action = action;
        this.your = your;
        this.bark = bark;
    }

    public ActivityFragmentItem(int imgURL, String fullName, String action, String your, String bark) {
        this.imgURL = imgURL;
        this.fullName = fullName;
        this.action = action;
        this.your = your;
        this.bark = bark;
    }

    public int getImgURL() {
        return imgURL;
    }

    public void setImgURL(int imgURL) {
        this.imgURL = imgURL;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getYour() {
        return your;
    }

    public void setYour(String your) {
        this.your = your;
    }

    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}
