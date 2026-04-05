package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ax {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f50428a;

    public static String a(Context context, String str) {
        return a(context, str, "");
    }

    public static void b(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putString(str, str2).apply();
        }
    }

    public static String a(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getString(str, str2) : str2;
    }

    public static void b(Context context, String str, int i10) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putInt(str, i10).apply();
        }
    }

    public static int a(Context context, String str, int i10) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getInt(str, i10) : i10;
    }

    public static void b(Context context, String str, long j10) {
        SharedPreferences sharedPreferencesA = a(context);
        if (sharedPreferencesA != null) {
            sharedPreferencesA.edit().putLong(str, j10).apply();
        }
    }

    public static long a(Context context, String str, long j10) {
        SharedPreferences sharedPreferencesA = a(context);
        return sharedPreferencesA != null ? sharedPreferencesA.getLong(str, j10) : j10;
    }

    public static SharedPreferences a(Context context) {
        if (f50428a == null) {
            f50428a = context.getSharedPreferences("ss_config", 0);
        }
        return f50428a;
    }
}
