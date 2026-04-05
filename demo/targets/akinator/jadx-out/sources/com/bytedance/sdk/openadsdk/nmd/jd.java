package com.bytedance.sdk.openadsdk.nmd;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    private int f21304cm;

    /* renamed from: jd, reason: collision with root package name */
    private xyk f21305jd;
    private jpo my;
    private ScheduledExecutorService jpo = null;
    private long wqx = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
    }

    public jd(xyk xykVar, int i10) {
        this.f21305jd = xykVar;
        this.f21304cm = i10;
    }

    public boolean jd() {
        ScheduledExecutorService scheduledExecutorService = this.jpo;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void jpo(long j10) {
        this.wqx = j10;
    }

    public void jpo(int i10) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.jpo = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nmd.jd.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = jd.this.wqx;
                if (System.currentTimeMillis() - jd.this.wqx > jd.this.f21304cm) {
                    jd.this.jpo.shutdown();
                    if (jd.this.f21305jd != null) {
                        jd.this.f21305jd.jd(0, "Automatic detection of stuck");
                    }
                    if (jd.this.my != null) {
                        jpo unused2 = jd.this.my;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void jpo() {
        ScheduledExecutorService scheduledExecutorService = this.jpo;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
