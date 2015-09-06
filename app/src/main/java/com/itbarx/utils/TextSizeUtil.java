package com.itbarx.utils;

import com.itbarx.application.ItbarxGlobal;

/**
 * TODO: Add a class header comment!
 */
public class TextSizeUtil {

    private static float DENSITY = ItbarxGlobal.getDENSITY();

    //COMMON SD
    private static float EDIT_BOX_TEXT_SIZE = 27f;
    private static float TOOLBAR_TEXT_SIZE = 35f;
    private static float BUTTON_TEXT_SIZE = 25f;
    private static float FRAGMENT_UPPER_BUTTON = 27f;
    //COMMON HD
    private static float EDIT_BOX_TEXT_SIZE_HD = EDIT_BOX_TEXT_SIZE * 1.4f;
    private static float TOOLBAR_TEXT_SIZE_HD = TOOLBAR_TEXT_SIZE * 1.4f;
    private static float BUTTON_TEXT_SIZE_HD = BUTTON_TEXT_SIZE * 1.4f;
    private static float FRAGMENT_UPPER_BUTTON_HD = FRAGMENT_UPPER_BUTTON*1.4f;
    //COMMON FULL HD
    private static float EDIT_BOX_TEXT_SIZE_FULL_HD = EDIT_BOX_TEXT_SIZE * 2f;
    private static float TOOLBAR_TEXT_SIZE_FULL_HD = TOOLBAR_TEXT_SIZE * 2f;
    private static float BUTTON_TEXT_SIZE_FULL_HD = BUTTON_TEXT_SIZE * 2f;
    private static float FRAGMENT_UPPER_BUTTON_FULL_HD_ = FRAGMENT_UPPER_BUTTON*2f;
    //-------------------------------------------------------------------------------------------
    //LOGIN SD
    private static float LOGIN_OR_TEXT_SIZE = 27f;
    private static float LOGIN_REMEMBER_ME_TEXT_SIZE = 30f;
    //LOGIN HD
    private static float LOGIN_OR_TEXT_SIZE_HD = LOGIN_OR_TEXT_SIZE * 1.4f;
    private static float LOGIN_REMEMBER_ME_TEXT_SIZE_HD = LOGIN_REMEMBER_ME_TEXT_SIZE * 1.4f;
    //LOGIN FULL HD
    private static float LOGIN_OR_TEXT_SIZE_FULL_HD = LOGIN_OR_TEXT_SIZE * 2f;
    private static float LOGIN_REMEMBER_ME_TEXT_SIZE_FULL_HD = LOGIN_REMEMBER_ME_TEXT_SIZE * 2f;


    //PROFILE FRAGMENT
    private static float PROFILE_USERNAME_TEXT_SIZE = 19f;
    private static float PROFILE_USER_BIO_TEXT_SIZE = 17f;
    private static float PROFILE_USER_PLACE_TEXT_SIZE = 17f;
    private static float PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE = 19f;
    private static float PROFILE_MINI_BUTTON_TEXT_SIZE = 19f;

    //PROFILE FRAGMENT HD
    private static float PROFILE_USERNAME_TEXT_SIZE_HD = PROFILE_USERNAME_TEXT_SIZE * 1.4f;
    private static float PROFILE_USER_BIO_TEXT_SIZE_HD = PROFILE_USER_BIO_TEXT_SIZE * 1.4f;
    private static float PROFILE_USER_PLACE_TEXT_SIZE_HD = PROFILE_USER_PLACE_TEXT_SIZE * 1.4f;
    private static float PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE_HD = PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE * 1.4f;
    private static float PROFILE_MINI_BUTTON_TEXT_SIZE_HD = PROFILE_MINI_BUTTON_TEXT_SIZE * 1.4f;

    //PROFILE FRAGMENT FULL HD
    private static float PROFILE_USERNAME_TEXT_SIZE_FULL_HD = PROFILE_USERNAME_TEXT_SIZE * 2f;
    private static float PROFILE_USER_BIO_TEXT_SIZE_FULL_HD = PROFILE_USER_BIO_TEXT_SIZE * 2f;
    private static float PROFILE_USER_PLACE_TEXT_SIZE_FULL_HD = PROFILE_USER_PLACE_TEXT_SIZE * 2f;
    private static float PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE_FULL_HD = PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE * 2f;
    private static float PROFILE_MINI_BUTTON_TEXT_SIZE_FULL_HD = PROFILE_MINI_BUTTON_TEXT_SIZE * 2f;

    //RECORD FRAGMENT SD
    private static float RECORD_START_TEXT_SIZE = 23f;
    //RECORD FRAGMENT HD
    private static float RECORD_START_TEXT_SIZE_HD=RECORD_START_TEXT_SIZE*1.4f;
    //RECORD FRAGMENT FULL HD
    private static float RECORD_START_TEXT_SIZE_FULL_HD = RECORD_START_TEXT_SIZE * 2f;


    //COMMON COMPONENTS METHODS
    public static float getEditBoxTextSize() {
        if (DENSITY > 2.0) {
            return (EDIT_BOX_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (EDIT_BOX_TEXT_SIZE_HD / DENSITY);
        }
        return EDIT_BOX_TEXT_SIZE;
    }

    public static float getToolbarTextSize() {
        if (DENSITY > 2.0) {
            return (TOOLBAR_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (TOOLBAR_TEXT_SIZE_HD / DENSITY);
        }
        return (TOOLBAR_TEXT_SIZE / DENSITY);
    }

    public static float getButtonTextSize() {
        if (DENSITY > 2.0) {
            return (BUTTON_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (BUTTON_TEXT_SIZE_HD / DENSITY);
        }

        return (BUTTON_TEXT_SIZE / DENSITY);
    }

    public static float getFragBtnTextSize() {
        if (DENSITY > 2.0) {
            return (FRAGMENT_UPPER_BUTTON_FULL_HD_ / DENSITY);
        } else if (DENSITY > 1.0) {
            return (FRAGMENT_UPPER_BUTTON_HD / DENSITY);
        }
        return FRAGMENT_UPPER_BUTTON;
    }


    // LOGIN COMPONENTS METHODS
    public static float getLoginOrTextSize() {
        if (DENSITY > 2.0) {
            return (LOGIN_OR_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (LOGIN_OR_TEXT_SIZE_HD / DENSITY);
        }

        return (LOGIN_OR_TEXT_SIZE / DENSITY);
    }

    public static float getLoginRememberMeTextSize() {
        if (DENSITY > 2.0) {
            return (LOGIN_REMEMBER_ME_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (LOGIN_REMEMBER_ME_TEXT_SIZE_HD / DENSITY);
        }

        return LOGIN_REMEMBER_ME_TEXT_SIZE;
    }


  //  RECORD FRAGMENT COMPONENTS METHODS
    public static float getRecordStartTextSize(){
        if (DENSITY > 2.0) {
            return (RECORD_START_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (RECORD_START_TEXT_SIZE_HD / DENSITY);
        }

        return (RECORD_START_TEXT_SIZE / DENSITY);
    }

    //PROFILE FRAGMENT COMPONENTS METHODS
    public static float getProfileUsernameTextSize() {
        if (DENSITY > 2.0) {
            return (PROFILE_USERNAME_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (PROFILE_USERNAME_TEXT_SIZE_HD / DENSITY);
        }

        return PROFILE_USERNAME_TEXT_SIZE;
    }

    public static float getProfileUserBioTextSize() {
        if (DENSITY > 2.0) {
            return (PROFILE_USER_BIO_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (PROFILE_USER_BIO_TEXT_SIZE_HD / DENSITY);
        }
        return PROFILE_USER_BIO_TEXT_SIZE;
    }

    public static float getProfileUserPlaceTextSize() {
        if (DENSITY > 2.0) {
            return (PROFILE_USER_PLACE_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (PROFILE_USER_PLACE_TEXT_SIZE_HD / DENSITY);
        }
        return PROFILE_USER_PLACE_TEXT_SIZE;
    }

    public static float getProfileMiniButtonCountTextSize() {
        if (DENSITY > 2.0) {
            return (PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE_HD / DENSITY);
        }
        return PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE;
    }

    public static float getProfileMiniButtonTextSize() {
        if (DENSITY > 2.0) {
            return (PROFILE_MINI_BUTTON_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (PROFILE_MINI_BUTTON_TEXT_SIZE_HD / DENSITY);
        }
        return PROFILE_MINI_BUTTON_TEXT_SIZE;
    }




}
