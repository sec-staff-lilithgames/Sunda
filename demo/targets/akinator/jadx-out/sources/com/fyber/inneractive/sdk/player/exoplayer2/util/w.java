package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w {
    public static void a(String str) {
        if (z.f26070a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.f26070a >= 18) {
            Trace.endSection();
        }
    }
}
