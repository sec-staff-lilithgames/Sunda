package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class FlashPreferences {
    public static final String PREFERENCES_FILE = "com.facebook.ads.flash";
    public static final String SP_KEY_FLASH_CONFIG = "flash_config";
    public static final String SP_KEY_LAST_CONFIG_UPDATE_TIMESTAMP = "update_timestamp";
    public static final String SP_KEY_LAST_RESULT = "last_result";

    public static SharedPreferences getSharedPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES_FILE, 0);
    }
}
