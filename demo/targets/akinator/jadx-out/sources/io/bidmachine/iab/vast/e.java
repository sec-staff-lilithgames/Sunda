package io.bidmachine.iab.vast;

import um.c0;
import um.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f60484a = new e0("VastLog");

    public static void addLogListener(um.b0 b0Var) {
        f60484a.addLogListener(b0Var);
    }

    public static boolean canSendDLog() {
        return f60484a.canSendDLog();
    }

    public static boolean canSendELog() {
        return f60484a.canSendELog();
    }

    public static boolean canSendWLog() {
        return f60484a.canSendWLog();
    }

    public static void d(String str, String str2, Object... objArr) {
        f60484a.d(str, str2, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        f60484a.e(str, str2, objArr);
    }

    public static boolean removeLogListener(um.b0 b0Var) {
        return f60484a.removeLogListener(b0Var);
    }

    public static void setLoggingLevel(c0 c0Var) {
        f60484a.setLoggingLevel(c0Var);
    }

    public static void e(String str, Throwable th2) {
        f60484a.e(str, th2);
    }
}
