package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3191e4;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nmd {

    /* renamed from: jd, reason: collision with root package name */
    private static String f19004jd = "";
    private static boolean jpo = false;

    public static void jd() {
        jpo = false;
    }

    public static void jpo() {
        jpo = true;
    }

    public static void wqx(String str, String str2) {
        if (jpo && str2 != null) {
            Log.e(jd(str), str2);
        }
    }

    public static void jd(String str, String str2) {
        if (jpo && str2 != null) {
            Log.i(jd(str), str2);
        }
    }

    public static void jpo(String str, String str2) {
        if (jpo && str2 != null) {
            Log.d(jd(str), str2);
        }
    }

    public static void wqx(String str, Object... objArr) {
        if (jpo && objArr != null) {
            Log.e(jd(str), jpo(objArr));
        }
    }

    public static void jd(String str, Object... objArr) {
        if (jpo && objArr != null) {
            Log.i(jd(str), jpo(objArr));
        }
    }

    public static void jpo(String str, Object... objArr) {
        if (jpo && objArr != null) {
            Log.d(jd(str), jpo(objArr));
        }
    }

    private static String jd(String str) {
        return TextUtils.isEmpty(f19004jd) ? str : jpo(o2.r(new StringBuilder(C3191e4.i.f36529d), f19004jd, "]-[", str, C3191e4.i.f36531e));
    }

    public static void jpo(String str, String str2, Throwable th2) {
        if (jpo) {
            if (str2 == null && th2 == null) {
                return;
            }
            Log.e(jd(str), str2, th2);
        }
    }

    public static void jpo(String str) {
        f19004jd = str;
    }

    private static String jpo(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : objArr) {
                if (obj != null) {
                    sb2.append(obj.toString());
                } else {
                    sb2.append(" null ");
                }
                sb2.append(" ");
            }
            return sb2.toString();
        }
        return "";
    }
}
