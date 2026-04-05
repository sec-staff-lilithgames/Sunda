package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
    }

    @Deprecated
    public static void publishWorldReadableSharedPreferences(Context context, SharedPreferences.Editor editor, String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
