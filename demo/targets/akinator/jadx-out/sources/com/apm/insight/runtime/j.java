package com.apm.insight.runtime;

import com.apm.insight.MonitorCrash;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MonitorCrash f13313a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f13314b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static int f13315c;

    public static MonitorCrash a() {
        if (f13313a == null) {
            MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(com.apm.insight.e.g(), "239017", 20089L, "2008-20250701130429", "com.apm.insight");
            f13313a = monitorCrashInitSDK;
            monitorCrashInitSDK.config().setChannel("release");
        }
        return f13313a;
    }

    public static void a(Throwable th2, String str) {
        if (com.apm.insight.e.g() == null) {
            return;
        }
        if (f13314b == -1) {
            f13314b = 5;
        }
        int i10 = f13315c;
        if (i10 < f13314b) {
            f13315c = i10 + 1;
            a().reportCustomErr(str, "INNER", th2);
        }
    }
}
