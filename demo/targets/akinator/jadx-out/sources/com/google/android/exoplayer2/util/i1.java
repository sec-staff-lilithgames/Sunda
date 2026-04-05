package com.google.android.exoplayer2.util;

import android.os.Trace;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i1 {
    public static void beginSection(String str) {
        if (n1.f28506a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void endSection() {
        if (n1.f28506a >= 18) {
            Trace.endSection();
        }
    }
}
