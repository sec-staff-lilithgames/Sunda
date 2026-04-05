package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class rq {
    private static String jpo;

    public static String jd(Context context) {
        if (!TextUtils.isEmpty(jpo)) {
            return jpo;
        }
        String strJpo = jpo();
        jpo = strJpo;
        if (!TextUtils.isEmpty(strJpo)) {
            return jpo;
        }
        String strJd = jd();
        jpo = strJd;
        return !TextUtils.isEmpty(strJd) ? jpo : jpo;
    }

    public static boolean jpo(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), jd(context));
    }

    private static String jpo() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String jd() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
