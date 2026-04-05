package com.applovin.impl;

import android.adservices.AdServicesState;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class o4 {
    public static boolean a(Context context) {
        return o0.a("android.permission.ACCESS_ADSERVICES_AD_ID", context);
    }

    public static boolean b(Context context) {
        return o0.a("android.permission.ACCESS_ADSERVICES_ATTRIBUTION", context);
    }

    public static boolean c(Context context) {
        return o0.a("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE", context);
    }

    public static boolean d(Context context) {
        return o0.a("android.permission.ACCESS_ADSERVICES_TOPICS", context);
    }

    public static boolean e(Context context) {
        return f(context) && AdServicesState.isAdServicesStateEnabled();
    }

    public static boolean f(Context context) {
        return o0.d() && !AppLovinSdkUtils.isFireOS(context);
    }
}
