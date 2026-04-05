package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d7 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f13884a;

    /* renamed from: b, reason: collision with root package name */
    private Timer f13885b;

    /* renamed from: c, reason: collision with root package name */
    private long f13886c;

    /* renamed from: d, reason: collision with root package name */
    private long f13887d;

    /* renamed from: e, reason: collision with root package name */
    private long f13888e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13889f;

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f13890g;

    /* renamed from: h, reason: collision with root package name */
    private long f13891h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f13892i = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                d7.this.f13890g.run();
                synchronized (d7.this.f13892i) {
                    try {
                        if (d7.this.f13889f) {
                            d7.this.f13886c = System.currentTimeMillis();
                            d7 d7Var = d7.this;
                            d7Var.f13887d = d7Var.f13888e;
                        } else {
                            d7.this.f13885b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (d7.this.f13884a != null) {
                        d7.this.f13884a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            d7.this.f13884a.O().a("Timer", "Encountered error while executing timed task", th2);
                        }
                        d7.this.f13884a.E().a("Timer", "executingTimedTask", th2);
                    }
                    synchronized (d7.this.f13892i) {
                        try {
                            if (d7.this.f13889f) {
                                d7.this.f13886c = System.currentTimeMillis();
                                d7 d7Var2 = d7.this;
                                d7Var2.f13887d = d7Var2.f13888e;
                            } else {
                                d7.this.f13885b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (d7.this.f13892i) {
                        try {
                            if (d7.this.f13889f) {
                                d7.this.f13886c = System.currentTimeMillis();
                                d7 d7Var3 = d7.this;
                                d7Var3.f13887d = d7Var3.f13888e;
                            } else {
                                d7.this.f13885b = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private d7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f13884a = kVar;
        this.f13890g = runnable;
    }

    public long c() {
        if (this.f13885b == null) {
            return this.f13887d - this.f13891h;
        }
        return this.f13887d - (System.currentTimeMillis() - this.f13886c);
    }

    public void d() {
        synchronized (this.f13892i) {
            Timer timer = this.f13885b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f13891h = Math.max(1L, System.currentTimeMillis() - this.f13886c);
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f13884a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f13884a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f13884a.O().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f13885b = null;
                    } finally {
                        this.f13885b = null;
                    }
                }
            }
        }
    }

    public void e() {
        d7 d7Var;
        synchronized (this.f13892i) {
            try {
                try {
                    long j10 = this.f13891h;
                    if (j10 > 0) {
                        try {
                            long j11 = this.f13887d - j10;
                            this.f13887d = j11;
                            if (j11 < 0) {
                                this.f13887d = 0L;
                            }
                            this.f13885b = new Timer();
                            d7Var = this;
                        } catch (Throwable th2) {
                            th = th2;
                            d7Var = this;
                        }
                        try {
                            d7Var.a(b(), this.f13887d, this.f13889f, this.f13888e);
                            d7Var.f13886c = System.currentTimeMillis();
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                com.applovin.impl.sdk.k kVar = d7Var.f13884a;
                                if (kVar != null) {
                                    kVar.O();
                                    if (com.applovin.impl.sdk.o.a()) {
                                        d7Var.f13884a.O();
                                        if (com.applovin.impl.sdk.o.a()) {
                                            d7Var.f13884a.O().a("Timer", "Encountered error while resuming timer", th);
                                        }
                                    }
                                }
                                d7Var.f13891h = 0L;
                            } finally {
                                d7Var.f13891h = 0L;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static d7 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static d7 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException(p0.o2.n(j10, "Cannot create a scheduled timer. Invalid fire time passed in: ", "."));
        }
        if (runnable != null) {
            d7 d7Var = new d7(kVar, runnable);
            d7Var.f13886c = System.currentTimeMillis();
            d7Var.f13887d = j10;
            d7Var.f13889f = z10;
            d7Var.f13888e = j10;
            try {
                d7Var.f13885b = new Timer();
                d7Var.a(d7Var.b(), j10, z10, d7Var.f13888e);
                return d7Var;
            } catch (OutOfMemoryError e10) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e10);
                }
                return d7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f13892i) {
            Timer timer = this.f13885b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f13885b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f13884a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f13884a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f13884a.O().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f13885b = null;
                    } catch (Throwable th3) {
                        this.f13885b = null;
                        this.f13891h = 0L;
                        throw th3;
                    }
                }
                this.f13891h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f13885b.schedule(timerTask, j10, j11);
        } else {
            this.f13885b.schedule(timerTask, j10);
        }
    }
}
