package io.odeeo.internal.q0;

import android.os.Trace;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void beginSection(String str) {
        if (g0.f65861a >= 18) {
            a(str);
        }
    }

    public static void endSection() {
        if (g0.f65861a >= 18) {
            a();
        }
    }

    public static void a() {
        Trace.endSection();
    }
}
