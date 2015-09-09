package com.itbarx.utils;

import com.itbarx.application.ItbarxGlobal;

/**
 * TODO: Add a class header comment!
 */
public class TextSizeUtil {

    private static float DENSITY = ItbarxGlobal.getDENSITY();

    //COMMON SD
    private static float EDIT_BOX_TEXT_SIZE = 24f;
    private static float TOOLBAR_TEXT_SIZE = 30f;
    private static float BUTTON_TEXT_SIZE = 24f;
    private static float FRAGMENT_UPPER_BUTTON = 24f;
    //COMMON HD
    private static float EDIT_BOX_TEXT_SIZE_HD = EDIT_BOX_TEXT_SIZE * 1.4f;
    private static float TOOLBAR_TEXT_SIZE_HD = TOOLBAR_TEXT_SIZE * 1.4f;
    private static float BUTTON_TEXT_SIZE_HD = BUTTON_TEXT_SIZE * 1.4f;
    private static float FRAGMENT_UPPER_BUTTON_HD = FRAGMENT_UPPER_BUTTON * 1.4f;
    //COMMON FULL HD
    private static float EDIT_BOX_TEXT_SIZE_FULL_HD = EDIT_BOX_TEXT_SIZE * 2f;
    private static float TOOLBAR_TEXT_SIZE_FULL_HD = TOOLBAR_TEXT_SIZE * 2f;
    private static float BUTTON_TEXT_SIZE_FULL_HD = BUTTON_TEXT_SIZE * 2f;
    private static float FRAGMENT_UPPER_BUTTON_FULL_HD_ = FRAGMENT_UPPER_BUTTON * 2f;
    //-------------------------------------------------------------------------------------------

    //LIST VIEW ITEM SD
    private static float LIST_VIEW_REG_ITEM_TEXT_SIZE = 19f;
    private static float LIST_VIEW_BOLD_ITEM_TEXT_SIZE = 19f;
    //LIST VIEW ITEM HD
    private static float LIST_VIEW_REG_ITEM_TEXT_SIZE_HD = LIST_VIEW_REG_ITEM_TEXT_SIZE * 1.4f;
    private static float LIST_VIEW_BOLD_ITEM_TEXT_SIZE_HD = LIST_VIEW_BOLD_ITEM_TEXT_SIZE * 1.4f;
    //LIST VIEW ITEM FULL_HD
    private static float LIST_VIEW_REG_ITEM_TEXT_SIZE_FULL_HD = LIST_VIEW_REG_ITEM_TEXT_SIZE * 2f;
    private static float LIST_VIEW_BOLD_ITEM_TEXT_SIZE_FULL_HD = LIST_VIEW_BOLD_ITEM_TEXT_SIZE * 2f;

    //-------------------------------------------------------------------------------------------
    //LOGIN SD
    private static float LOGIN_OR_TEXT_SIZE = 27f;
    private static float LOGIN_REMEMBER_ME_TEXT_SIZE = 23f;
    //LOGIN HD
    private static float LOGIN_OR_TEXT_SIZE_HD = LOGIN_OR_TEXT_SIZE * 1.4f;
    private static float LOGIN_REMEMBER_ME_TEXT_SIZE_HD = LOGIN_REMEMBER_ME_TEXT_SIZE * 1.4f;
    //LOGIN FULL HD
    private static float LOGIN_OR_TEXT_SIZE_FULL_HD = LOGIN_OR_TEXT_SIZE * 2f;
    private static float LOGIN_REMEMBER_ME_TEXT_SIZE_FULL_HD = LOGIN_REMEMBER_ME_TEXT_SIZE * 2f;
    //-------------------------------------------------------------------------------------------
    //CREATE NEW USER SD
    private static float FORGOT_CHANGE_PASSWORD_TEXT_SIZE = 23f;
    private static float FORGOT_UPPER_INFO_TEXT_SIZE = 19f;
    //CREATE NEW USERHD
    private static float FORGOT_CHANGE_PASSWORD_TEXT_SIZE_HD = FORGOT_CHANGE_PASSWORD_TEXT_SIZE * 1.4f;
    private static float FORGOT_UPPER_INFO_TEXT_SIZE_HD = FORGOT_UPPER_INFO_TEXT_SIZE * 1.4f;
    //CREATE NEW USER FULL HD
    private static float FORGOT_CHANGE_PASSWORD_TEXT_SIZE_FULL_HD = FORGOT_CHANGE_PASSWORD_TEXT_SIZE * 2f;
    private static float FORGOT_UPPER_INFO_TEXT_SIZE_FULL_HD = FORGOT_UPPER_INFO_TEXT_SIZE * 2f;

    //-------------------------------------------------------------------------------------------

    //CREATE NEW USER SD
    private static float CREATE_ADDPHOTO_TEXT_SIZE = 20f;
    private static float CREATE_MIDDLE_INFO_TEXT_SIZE = 19f;
    //CREATE NEW USERHD
    private static float CREATE_ADDPHOTO_TEXT_SIZE_HD = CREATE_ADDPHOTO_TEXT_SIZE * 1.4f;
    private static float CREATE_MIDDLE_INFO_TEXT_SIZE_HD = CREATE_MIDDLE_INFO_TEXT_SIZE * 1.4f;
    //CREATE NEW USER FULL HD
    private static float CREATE_ADDPHOTO_TEXT_SIZE_FULL_HD = CREATE_ADDPHOTO_TEXT_SIZE * 2f;
    private static float CREATE_MIDDLE_INFO_TEXT_SIZE_FULL_HD = CREATE_MIDDLE_INFO_TEXT_SIZE * 2f;

    // -------------------------------------------------------------------------------------------
    //TIMELINE FRAGMENT SD
    private static float TIMELINE_USERNAME_TEXT_SIZE = 19f;
    private static float TIMELINE_MINS_TEXT_SIZE = 17f;
    private static float TIMELINE_MINI_BUTTON_TEXT_SIZE = 21f;
    //TIMELINE FRAGMENT HD
    private static float TIMELINE_USERNAME_TEXT_SIZE_HD = TIMELINE_MINS_TEXT_SIZE * 1.4f;
    private static float TIMELINE_MINS_TEXT_SIZE_HD = LOGIN_OR_TEXT_SIZE * 1.4f;
    private static float TIMELINE_MINI_BUTTON_TEXT_SIZE_HD = TIMELINE_MINI_BUTTON_TEXT_SIZE * 1.4f;
    //TIMELINE FRAGMENT FULL HD
    private static float TIMELINE_USERNAME_TEXT_SIZE_FULL_HD = TIMELINE_USERNAME_TEXT_SIZE * 2f;
    private static float TIMELINE_MINS_TEXT_SIZE_FULL_HD = TIMELINE_MINS_TEXT_SIZE * 2f;
    private static float TIMELINE_MINI_BUTTON_TEXT_SIZE_FULL_HD = TIMELINE_MINI_BUTTON_TEXT_SIZE * 2f;

    //-------------------------------------------------------------------------------------------
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
    //-------------------------------------------------------------------------------------------
    //RECORD FRAGMENT SD
    private static float RECORD_START_TEXT_SIZE = 23f;
    //RECORD FRAGMENT HD
    private static float RECORD_START_TEXT_SIZE_HD = RECORD_START_TEXT_SIZE * 1.4f;
    //RECORD FRAGMENT FULL HD
    private static float RECORD_START_TEXT_SIZE_FULL_HD = RECORD_START_TEXT_SIZE * 2f;
    //-------------------------------------------------------------------------------------------

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

    //-------------------------------------------------------------------------------------------
    //LIST VIEW ITEM TEXTVIEW METHODS
    public static float getListItemRegTextSize() {
        if (DENSITY > 2.0) {
            return (LIST_VIEW_REG_ITEM_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (LIST_VIEW_REG_ITEM_TEXT_SIZE_HD / DENSITY);
        }
        return LIST_VIEW_REG_ITEM_TEXT_SIZE;
    }

    public static float getListItemBoldTextSize() {
        if (DENSITY > 2.0) {
            return (LIST_VIEW_BOLD_ITEM_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (LIST_VIEW_BOLD_ITEM_TEXT_SIZE_HD / DENSITY);
        }
        return LIST_VIEW_BOLD_ITEM_TEXT_SIZE;

    }
    //-------------------------------------------------------------------------------------------

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
    //-------------------------------------------------------------------------------------------
    //CREATE NEW USER COMPONENTS METHODS
    public static float getCreateAddPhotoTextSize() {
        if (DENSITY > 2.0) {
            return (CREATE_ADDPHOTO_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (CREATE_ADDPHOTO_TEXT_SIZE_HD / DENSITY);
        }

        return (CREATE_ADDPHOTO_TEXT_SIZE / DENSITY);
    }

    public static float getCreateMiddleInfoTextSize() {
        if (DENSITY > 2.0) {
            return (CREATE_MIDDLE_INFO_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (CREATE_MIDDLE_INFO_TEXT_SIZE_HD / DENSITY);
        }

        return CREATE_MIDDLE_INFO_TEXT_SIZE;
    }
    //-------------------------------------------------------------------------------------------

    //CREATE NEW USER COMPONENTS METHODS
    public static float getForgotChangePasswordTextSize() {
        if (DENSITY > 2.0) {
            return (FORGOT_CHANGE_PASSWORD_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (FORGOT_CHANGE_PASSWORD_TEXT_SIZE_HD / DENSITY);
        }

        return (FORGOT_CHANGE_PASSWORD_TEXT_SIZE / DENSITY);
    }

    public static float getForgotUpperInfoTextSize() {
        if (DENSITY > 2.0) {
            return (FORGOT_UPPER_INFO_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (FORGOT_UPPER_INFO_TEXT_SIZE_HD / DENSITY);
        }

        return FORGOT_UPPER_INFO_TEXT_SIZE;
    }

    //-------------------------------------------------------------------------------------------
    //  TIMELINE FRAGMENT METHODS

    public static float getTimelineUsernameTextSize(){
        if (DENSITY > 2.0) {
            return (TIMELINE_USERNAME_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (TIMELINE_USERNAME_TEXT_SIZE_HD / DENSITY);
        }
        return TIMELINE_USERNAME_TEXT_SIZE;
    }
    public static float getTimelineMinsTextSize(){
        if (DENSITY > 2.0) {
            return (TIMELINE_MINS_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (TIMELINE_MINS_TEXT_SIZE_HD / DENSITY);
        }
        return TIMELINE_MINS_TEXT_SIZE;

    }

    public static float getTimelineMiniButtonTextSize(){
        if (DENSITY > 2.0) {
            return (TIMELINE_MINI_BUTTON_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (TIMELINE_MINI_BUTTON_TEXT_SIZE_HD / DENSITY);
        }
        return TIMELINE_MINI_BUTTON_TEXT_SIZE;


    }

    //-------------------------------------------------------------------------------------------
    //  RECORD FRAGMENT COMPONENTS METHODS
    public static float getRecordStartTextSize() {
        if (DENSITY > 2.0) {
            return (RECORD_START_TEXT_SIZE_FULL_HD / DENSITY);
        } else if (DENSITY > 1.0) {
            return (RECORD_START_TEXT_SIZE_HD / DENSITY);
        }

        return (RECORD_START_TEXT_SIZE / DENSITY);
    }

    //-------------------------------------------------------------------------------------------
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
