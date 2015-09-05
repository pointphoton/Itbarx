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
    //COMMON HD
    private static float EDIT_BOX_TEXT_SIZE_HD = EDIT_BOX_TEXT_SIZE * 1.4f;
    private static float TOOLBAR_TEXT_SIZE_HD = TOOLBAR_TEXT_SIZE * 1.4f;
    private static float BUTTON_TEXT_SIZE_HD = BUTTON_TEXT_SIZE * 1.4f;
    //COMMON FULL HD
    private static float EDIT_BOX_TEXT_SIZE_FULL_HD = EDIT_BOX_TEXT_SIZE * 2f;
    private static float TOOLBAR_TEXT_SIZE_FULL_HD = TOOLBAR_TEXT_SIZE * 2f;
    private static float BUTTON_TEXT_SIZE_FULL_HD = BUTTON_TEXT_SIZE * 2f;
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
    private static float PROFILE_USERNAME_TEXT_SIZE = 14;
    private static float PROFILE_USER_BIO_TEXT_SIZE = 12;
    private static float PROFILE_USER_PLACE_TEXT_SIZE = 12;
    private static float PROFILE_MINI_BUTTON_COUNT_TEXT_SIZE = 15;
    private static float PROFILE_MINI_BUTTON_TEXT_SIZE = 14;

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
