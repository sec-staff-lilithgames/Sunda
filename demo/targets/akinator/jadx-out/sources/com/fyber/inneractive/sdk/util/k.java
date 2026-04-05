package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class k extends o {
    public static String i() {
        try {
            return ((TelephonyManager) o.f26796a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String j() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static int k() {
        try {
            if (o.a("android.permission.READ_PHONE_STATE")) {
                return ((TelephonyManager) o.f26796a.getSystemService("phone")).getDataNetworkType();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String l() {
        try {
            return o.f26796a.getPackageManager().getPackageInfo(o.f26796a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean m() {
        boolean z10 = (o.f26796a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.e("This device has a tablet resolution? %s", Boolean.valueOf(z10));
        return z10;
    }

    public static boolean n() {
        TelephonyManager telephonyManager = (TelephonyManager) o.f26796a.getSystemService("phone");
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
