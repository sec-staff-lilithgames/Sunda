package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile p f13329a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f13330b;

    public static p a() {
        if (f13329a == null) {
            b();
        }
        return f13329a;
    }

    private static HandlerThread b() {
        if (f13329a == null) {
            synchronized (m.class) {
                try {
                    if (f13329a == null) {
                        p pVar = new p("default_npth_thread");
                        f13329a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return f13329a.c();
    }
}
