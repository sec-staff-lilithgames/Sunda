package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3204f<T> {

    /* renamed from: a, reason: collision with root package name */
    private Object f36659a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Timer f36660b;

    /* renamed from: c, reason: collision with root package name */
    protected long f36661c;

    /* renamed from: d, reason: collision with root package name */
    protected T f36662d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.f$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            AbstractC3204f.this.b();
        }
    }

    public AbstractC3204f() {
    }

    public boolean a() {
        return this.f36661c <= 0;
    }

    public abstract void b();

    public void c() {
        synchronized (this.f36659a) {
            try {
                Timer timer = this.f36660b;
                if (timer != null) {
                    timer.cancel();
                    this.f36660b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        this.f36662d = null;
    }

    public void a(T t10) {
        if (a() || t10 == null) {
            return;
        }
        this.f36662d = t10;
        c();
        synchronized (this.f36659a) {
            Timer timer = new Timer();
            this.f36660b = timer;
            timer.schedule(new a(), this.f36661c);
        }
    }

    public AbstractC3204f(long j10) {
        this.f36661c = j10;
    }
}
