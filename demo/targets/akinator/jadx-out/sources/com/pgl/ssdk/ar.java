package com.pgl.ssdk;

import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ar {
    public static Handler a() {
        return a0.a().b();
    }

    public static Handler b() {
        return a0.a().c();
    }

    public static void a(Runnable runnable) {
        Handler handlerA;
        if (runnable == null || (handlerA = a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public static void b(Runnable runnable) {
        Handler handlerB;
        if (runnable == null || (handlerB = b()) == null) {
            return;
        }
        handlerB.post(runnable);
    }
}
