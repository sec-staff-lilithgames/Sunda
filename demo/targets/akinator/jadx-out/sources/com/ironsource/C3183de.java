package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3183de {

    /* renamed from: a, reason: collision with root package name */
    private C3387p2 f36303a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3201ee f36304b;

    /* renamed from: c, reason: collision with root package name */
    private Timer f36305c = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.de$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3183de.this.f36304b.b();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.de$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3183de.this.f36304b.b();
        }
    }

    public C3183de(C3387p2 c3387p2, InterfaceC3201ee interfaceC3201ee) {
        this.f36303a = c3387p2;
        this.f36304b = interfaceC3201ee;
    }

    private void d() {
        Timer timer = this.f36305c;
        if (timer != null) {
            timer.cancel();
            this.f36305c = null;
        }
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f36304b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f36305c = timer;
        timer.schedule(new a(), this.f36303a.j());
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f36305c = timer;
        timer.schedule(new b(), this.f36303a.b());
    }
}
