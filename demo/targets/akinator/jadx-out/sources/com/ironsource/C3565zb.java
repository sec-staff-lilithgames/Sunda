package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3565zb {

    /* renamed from: a, reason: collision with root package name */
    private final a f39361a;

    /* renamed from: b, reason: collision with root package name */
    protected long f39362b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.zb$a */
    public class a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f39363a;

        public /* synthetic */ a(C3565zb c3565zb, int i10) {
            this();
        }

        public Handler a() {
            return this.f39363a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f39363a = new Handler();
            Looper.loop();
        }

        private a() {
        }
    }

    public C3565zb() {
        a aVar = new a(this, 0);
        this.f39361a = aVar;
        aVar.start();
        this.f39362b = new Date().getTime();
    }

    public boolean a(Object obj) {
        return (obj == null || this.f39361a == null) ? false : true;
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.f39361a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }
}
