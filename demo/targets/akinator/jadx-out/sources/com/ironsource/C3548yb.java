package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3548yb implements InterfaceC3304ka {

    /* renamed from: b, reason: collision with root package name */
    private Timer f39273b;

    /* renamed from: e, reason: collision with root package name */
    private long f39276e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f39277f;

    /* renamed from: a, reason: collision with root package name */
    private String f39272a = "INTERNAL";

    /* renamed from: c, reason: collision with root package name */
    private boolean f39274c = false;

    /* renamed from: d, reason: collision with root package name */
    private Long f39275d = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.yb$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3548yb.this.f39277f.run();
        }
    }

    public C3548yb(long j10, Runnable runnable, boolean z10) {
        this.f39276e = j10;
        this.f39277f = runnable;
        if (z10) {
            g();
        }
    }

    private synchronized void f() {
        Timer timer = this.f39273b;
        if (timer != null) {
            timer.cancel();
            this.f39273b = null;
        }
    }

    private synchronized void h() {
        if (this.f39273b == null) {
            Timer timer = new Timer();
            this.f39273b = timer;
            timer.schedule(new a(), this.f39276e);
            Calendar.getInstance().setTimeInMillis(this.f39275d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void b() {
        Long l9;
        if (this.f39273b == null && (l9 = this.f39275d) != null) {
            long jLongValue = l9.longValue() - System.currentTimeMillis();
            this.f39276e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f39277f.run();
            }
        }
    }

    public void e() {
        f();
        this.f39274c = false;
        this.f39275d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }

    public void g() {
        if (this.f39274c) {
            return;
        }
        this.f39274c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f39275d = Long.valueOf(System.currentTimeMillis() + this.f39276e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void a() {
        if (this.f39273b != null) {
            f();
        }
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void c() {
    }

    @Override // com.ironsource.InterfaceC3304ka
    public void d() {
    }
}
