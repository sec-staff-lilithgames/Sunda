package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f41159a = true;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f41160b = true;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f41161c = true;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f41162d = false;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f41163e = true;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f41164f = false;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f41165g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f41166h = true;

    static {
        if (MBridgeConstans.DEBUG) {
            return;
        }
        f41165g = false;
        f41159a = false;
        f41161c = false;
        f41166h = false;
        f41160b = false;
        f41164f = false;
        f41163e = false;
        f41162d = false;
    }

    public static void a(String str, String str2) {
        if (!f41159a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2);
    }

    public static void b(String str, String str2) {
        if (!f41160b || str2 == null) {
            return;
        }
        Log.e(a(str), str2);
    }

    public static void c(String str, String str2) {
        if (!f41161c || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.i(a(str), str2);
    }

    public static void d(String str, String str2) {
        if (!f41166h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2);
    }

    public static void b(String str, String str2, Throwable th2) {
        if (!f41160b || str2 == null || th2 == null) {
            return;
        }
        Log.e(a(str), str2, th2);
    }

    private static String a(String str) {
        return !TextUtils.isEmpty(str) ? a.b.k("MBRIDGE_", str) : str;
    }

    public static void c(String str, String str2, Throwable th2) {
        if (!f41166h || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.w(a(str), str2, th2);
    }

    public static void a(String str, String str2, Throwable th2) {
        if (!f41159a || TextUtils.isEmpty(str2)) {
            return;
        }
        Log.d(a(str), str2, th2);
    }

    public static void a(String str, Throwable th2) {
        if (!f41166h || th2 == null) {
            return;
        }
        Log.w(a(str), th2);
    }
}
