package com.mbridge.msdk.tracker;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f43912a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeTrackThread");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f43914a;

        public b(Runnable runnable) {
            this.f43914a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.b(this.f43914a)) {
                return;
            }
            try {
                this.f43914a.run();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    Log.e("TrackManager", "execute error", e10);
                }
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.f43912a == null) {
            this.f43912a = a();
        }
        if (this.f43912a.isShutdown()) {
            return;
        }
        this.f43912a.execute(new b(runnable));
    }

    private ThreadPoolExecutor a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }
}
