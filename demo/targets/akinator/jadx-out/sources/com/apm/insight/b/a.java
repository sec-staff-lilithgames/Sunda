package com.apm.insight.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a {
    public a() {
        com.apm.insight.f.a.a();
    }

    public static void a(String str) {
        if (com.apm.insight.e.i().isEnsureEnable()) {
            com.apm.insight.f.b.a(Thread.currentThread().getStackTrace(), str, "EnsureNotReachHere");
        }
    }
}
