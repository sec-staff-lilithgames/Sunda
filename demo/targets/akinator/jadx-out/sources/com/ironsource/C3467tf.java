package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.tf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3467tf extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private static C3467tf f38957b;

    /* renamed from: a, reason: collision with root package name */
    private a f38958a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.tf$a */
    public class a extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f38959a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.f38959a;
        }

        public void b() {
            this.f38959a = new Handler(getLooper());
        }
    }

    private C3467tf() {
        a aVar = new a(getClass().getSimpleName());
        this.f38958a = aVar;
        aVar.start();
        this.f38958a.b();
    }

    public static synchronized C3467tf a() {
        try {
            if (f38957b == null) {
                f38957b = new C3467tf();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f38957b;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f38958a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
