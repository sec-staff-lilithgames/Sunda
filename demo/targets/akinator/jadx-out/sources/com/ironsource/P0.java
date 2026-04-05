package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class P0 {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f35161a;

    /* renamed from: b, reason: collision with root package name */
    private final Gb f35162b;

    /* renamed from: c, reason: collision with root package name */
    private final C3531xb f35163c = c();

    /* renamed from: d, reason: collision with root package name */
    private Timer f35164d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            P0.this.f35162b.b();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            P0.this.f35162b.b();
        }
    }

    public P0(N0 n02, Gb gb2) {
        this.f35161a = n02;
        this.f35162b = gb2;
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f35164d = timer;
        timer.schedule(new b(), j10);
    }

    private C3531xb c() {
        return new C3531xb(new a(), com.ironsource.lifecycle.b.d(), new Wf());
    }

    private synchronized void j() {
        Timer timer = this.f35164d;
        if (timer != null) {
            timer.cancel();
            this.f35164d = null;
        }
    }

    public boolean d() {
        return this.f35161a.c() > 0;
    }

    public void e() {
        if (this.f35161a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f35161a.c());
        }
    }

    public void f() {
        if (this.f35161a.a() == N0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f35161a.d());
        }
    }

    public void g() {
        if (this.f35161a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f35161a.a() != N0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f35161a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f35161a.d());
    }

    public void i() {
        C3531xb c3531xb = this.f35163c;
        if (c3531xb != null) {
            c3531xb.b();
        }
    }

    public void k() {
        if (this.f35161a.a() != N0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f35161a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f35161a.b());
    }

    public void a() {
        if (this.f35161a.a() == N0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    public N0 b() {
        return this.f35161a;
    }

    public void a(long j10) {
        C3531xb c3531xb = this.f35163c;
        if (c3531xb != null) {
            c3531xb.a(j10);
        }
    }
}
