package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3460t8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Logger {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f38846a;

    public static void d(String str, String str2) {
        if (f38846a) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (f38846a) {
            Log.e(str, str2);
        }
    }

    public static void enableLogging(int i10) {
        f38846a = C3460t8.d.MODE_0.b() != i10;
    }

    public static void i(String str, String str2) {
        if (f38846a) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (f38846a) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (f38846a) {
            Log.w(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (f38846a) {
            Log.d(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (f38846a) {
            Log.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (!f38846a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(str, str2, th2);
    }

    public static void v(String str, String str2, Throwable th2) {
        if (f38846a) {
            Log.v(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (f38846a) {
            Log.w(str, str2, th2);
        }
    }
}
