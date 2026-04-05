package com.mbridge.msdk.tracker.network;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<t<?>> f43970a;

    /* renamed from: b, reason: collision with root package name */
    private final m f43971b;

    /* renamed from: c, reason: collision with root package name */
    private final b f43972c;

    /* renamed from: d, reason: collision with root package name */
    private final w f43973d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f43974e = false;

    public n(BlockingQueue<t<?>> blockingQueue, m mVar, b bVar, w wVar) {
        this.f43970a = blockingQueue;
        this.f43971b = mVar;
        this.f43972c = bVar;
        this.f43973d = wVar;
    }

    private void a(t<?> tVar) {
        TrafficStats.setThreadStatsTag(tVar.s());
    }

    public void b(t<?> tVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        tVar.a(3);
        try {
            try {
                try {
                    tVar.a("network-queue-take");
                } catch (Exception e10) {
                    c0.a(e10, "Unhandled exception %s", e10.toString());
                    a0 a0Var = new a0(e10);
                    a0Var.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    this.f43973d.a(tVar, a0Var);
                    tVar.x();
                }
            } catch (b0 e11) {
                e11.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
                a(tVar, e11);
                tVar.x();
            }
            if (tVar.v()) {
                tVar.c("network-discard-cancelled");
                tVar.x();
                return;
            }
            if (tVar.y()) {
                a(tVar);
            }
            q qVarA = this.f43971b.a(tVar);
            tVar.a("network-http-complete");
            if (qVarA.f44005e && tVar.u()) {
                tVar.c("not-modified");
                tVar.x();
                return;
            }
            v<?> vVarA = tVar.a(qVarA);
            tVar.a("network-parse-complete");
            if (tVar.z() && vVarA.f44078b != null) {
                this.f43972c.a(tVar.e(), vVarA.f44078b);
                tVar.a("network-cache-written");
            }
            tVar.w();
            this.f43973d.a(tVar, vVarA);
            tVar.a(vVarA);
        } finally {
            tVar.a(4);
        }
    }

    @Override // java.lang.Runnable
    public void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f43974e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                c0.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    private void a() throws InterruptedException {
        b(this.f43970a.take());
    }

    private void a(t<?> tVar, b0 b0Var) {
        this.f43973d.a(tVar, tVar.c(b0Var));
    }
}
