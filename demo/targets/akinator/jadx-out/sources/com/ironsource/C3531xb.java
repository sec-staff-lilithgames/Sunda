package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3531xb {

    /* renamed from: g, reason: collision with root package name */
    private static final String f39205g = "xb";

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f39206a;

    /* renamed from: b, reason: collision with root package name */
    private final Runnable f39207b;

    /* renamed from: c, reason: collision with root package name */
    private final Wf f39208c;

    /* renamed from: e, reason: collision with root package name */
    private Timer f39210e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f39209d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3304ka f39211f = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.xb$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3531xb c3531xb = C3531xb.this;
            c3531xb.f39206a.b(c3531xb.f39211f);
            C3531xb.this.f39208c.b();
            C3531xb.this.f39207b.run();
        }
    }

    public C3531xb(Runnable runnable, com.ironsource.lifecycle.b bVar, Wf wf2) {
        this.f39207b = runnable;
        this.f39206a = bVar;
        this.f39208c = wf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f39209d) {
            try {
                Timer timer = this.f39210e;
                if (timer != null) {
                    timer.cancel();
                    this.f39210e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f39206a.b(this.f39211f);
        this.f39208c.b();
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f39205g, "cannot start timer with delay < 0");
            return;
        }
        this.f39206a.a(this.f39211f);
        this.f39208c.a(j10);
        if (this.f39206a.e()) {
            this.f39208c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f39209d) {
            c();
            Timer timer = new Timer();
            this.f39210e = timer;
            timer.schedule(new b(), j10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.xb$a */
    public class a implements InterfaceC3304ka {
        public a() {
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void a() {
            C3531xb.this.f39208c.c(System.currentTimeMillis());
            C3531xb.this.c();
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void b() {
            C3531xb.this.f39208c.b(System.currentTimeMillis());
            C3531xb c3531xb = C3531xb.this;
            c3531xb.b(c3531xb.f39208c.a());
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void c() {
        }

        @Override // com.ironsource.InterfaceC3304ka
        public void d() {
        }
    }
}
