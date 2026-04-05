package com.pgl.ssdk;

import android.os.HandlerThread;
import com.pgl.ssdk.a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final a3<a1> f50343a;

    /* renamed from: b, reason: collision with root package name */
    private a4 f50344b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final a0 f50345a = new a0();
    }

    public static a0 a() {
        return b.f50345a;
    }

    public a4 b() {
        if (this.f50344b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f50344b == null) {
                        this.f50344b = a("ssdk_net_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f50344b;
    }

    public a4 c() {
        if (this.f50344b == null) {
            synchronized (a0.class) {
                try {
                    if (this.f50344b == null) {
                        this.f50344b = a("ssdk_handler");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f50344b;
    }

    private a0() {
        this.f50343a = a3.a(2);
    }

    public a4 a(String str) {
        return b(null, str);
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public a4 b(a4.a aVar, String str) {
        a1 a1Var = (a1) this.f50343a.a();
        if (a1Var != null) {
            a1Var.a(aVar);
            a1Var.a(str);
            return a1Var;
        }
        return a(aVar, str);
    }
}
