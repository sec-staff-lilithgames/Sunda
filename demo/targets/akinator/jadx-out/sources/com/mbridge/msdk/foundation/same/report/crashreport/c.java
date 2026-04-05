package com.mbridge.msdk.foundation.same.report.crashreport;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c extends Thread {

    /* renamed from: e, reason: collision with root package name */
    private static volatile c f40899e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f40900a;

    /* renamed from: b, reason: collision with root package name */
    private volatile b f40901b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f40902c;

    /* renamed from: d, reason: collision with root package name */
    private int f40903d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private long f40904a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f40905b;

        /* renamed from: c, reason: collision with root package name */
        private long f40906c;

        private b() {
            this.f40904a = SystemClock.uptimeMillis();
        }

        public void b() {
            this.f40905b = false;
            this.f40906c = SystemClock.uptimeMillis();
            c.this.f40900a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f40905b = true;
                this.f40904a = SystemClock.uptimeMillis();
            }
        }

        public boolean a() {
            return !this.f40905b || this.f40904a - this.f40906c >= ((long) c.this.f40903d);
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f40900a = new Handler(Looper.getMainLooper());
        this.f40903d = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws InterruptedException, SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            if (isInterrupted() || !(this.f40901b == null || this.f40901b.f40905b)) {
                try {
                    Thread.sleep(this.f40903d);
                } catch (Exception unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        if (this.f40901b == null) {
                            this.f40901b = new b();
                        }
                        this.f40901b.b();
                        long jUptimeMillis = this.f40903d;
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        while (jUptimeMillis > 0) {
                            try {
                                wait(jUptimeMillis);
                            } catch (InterruptedException e10) {
                                Log.w("AnrMonitor", e10.toString());
                            }
                            jUptimeMillis = this.f40903d - (SystemClock.uptimeMillis() - jUptimeMillis2);
                        }
                        if (!this.f40901b.a()) {
                            com.mbridge.msdk.foundation.same.report.crashreport.a aVar = this.f40902c;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f40902c != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f40902c.a(d.b(stackTrace), stackTrace);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static c a() {
        if (f40899e == null) {
            synchronized (c.class) {
                try {
                    if (f40899e == null) {
                        f40899e = new c();
                    }
                } finally {
                }
            }
        }
        return f40899e;
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f40903d = i10;
        this.f40902c = aVar;
        return this;
    }
}
