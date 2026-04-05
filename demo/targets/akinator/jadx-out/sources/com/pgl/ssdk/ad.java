package com.pgl.ssdk;

import android.content.Context;
import android.os.LocaleList;
import android.provider.Settings;
import java.lang.reflect.Method;
import java.util.TimeZone;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ad {

    /* renamed from: a, reason: collision with root package name */
    private static double f50367a = -1.0d;

    public static String a() {
        return LocaleList.getDefault().get(0).getLanguage();
    }

    public static String b() {
        String displayName;
        try {
            displayName = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            displayName = null;
        }
        return displayName == null ? "" : displayName.trim();
    }

    public static String c() {
        return "";
    }

    public static String c(Context context) {
        return "";
    }

    public static String a(Context context) {
        String string;
        try {
            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            string = null;
        }
        return string == null ? "" : string.trim();
    }

    public static String b(Context context) {
        double d10 = f50367a;
        double dDoubleValue = 0.0d;
        if (d10 >= 0.0d) {
            return Integer.toString((int) d10);
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", String.class);
            declaredMethod.setAccessible(true);
            dDoubleValue = ((Double) declaredMethod.invoke(objNewInstance, "battery.capacity")).doubleValue();
        } catch (Throwable unused) {
        }
        f50367a = dDoubleValue;
        return Integer.toString((int) dDoubleValue);
    }
}
