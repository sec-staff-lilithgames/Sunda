package com.applovin.impl;

import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Thread f14230a = Looper.getMainLooper().getThread();

    public static void a(Throwable th2) {
    }

    public static void a(Throwable th2, String str, Object... objArr) {
    }

    public static boolean a(boolean z10) {
        return a(z10, "Assertion failed", new Object[0]);
    }

    public static boolean a(boolean z10, String str, Object... objArr) {
        if (!z10) {
            a(str, objArr);
        }
        return z10;
    }

    public static boolean a(Object obj) {
        return a(obj, "Null value not expected", new Object[0]);
    }

    public static boolean a(Object obj, String str, Object... objArr) {
        return a(obj != null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        a((Throwable) null, str, objArr);
    }
}
