package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final HandlerThread f13347a;

    /* renamed from: d, reason: collision with root package name */
    private volatile Handler f13350d;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<c> f13348b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final Queue<Message> f13349c = new ConcurrentLinkedQueue();

    /* renamed from: e, reason: collision with root package name */
    private final Object f13351e = new Object();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f13349c.isEmpty()) {
                if (p.this.f13350d != null) {
                    try {
                        p.this.f13350d.sendMessageAtFrontOfQueue((Message) p.this.f13349c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f13348b.isEmpty()) {
                c cVar = (c) p.this.f13348b.poll();
                if (p.this.f13350d != null) {
                    try {
                        p.this.f13350d.sendMessageAtTime(cVar.f13356a, cVar.f13357b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private volatile int f13353a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f13354b;

        public b(String str) {
            super(str);
            this.f13353a = 0;
            this.f13354b = false;
        }

        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f13351e) {
                p.this.f13350d = new Handler();
            }
            p.this.f13350d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f13353a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.f13354b) {
                            this.f13354b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f13353a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Message f13356a;

        /* renamed from: b, reason: collision with root package name */
        long f13357b;

        public c(Message message, long j10) {
            this.f13356a = message;
            this.f13357b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f13347a = new b(str);
    }

    public final void b() {
        this.f13347a.start();
    }

    public final HandlerThread c() {
        return this.f13347a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f13350d, runnable);
    }

    public final Handler a() {
        return this.f13350d;
    }

    private boolean b(Message message, long j10) {
        if (this.f13350d == null) {
            synchronized (this.f13351e) {
                try {
                    if (this.f13350d == null) {
                        this.f13348b.add(new c(message, j10));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f13350d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
