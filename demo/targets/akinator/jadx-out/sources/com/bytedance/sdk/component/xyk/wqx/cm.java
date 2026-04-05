package com.bytedance.sdk.component.xyk.wqx;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm implements ThreadFactory {
    public static volatile boolean wqx;

    /* renamed from: cm, reason: collision with root package name */
    private final AtomicInteger f19042cm = new AtomicInteger(1);

    /* renamed from: jd, reason: collision with root package name */
    protected final String f19043jd;
    protected final ThreadGroup jpo;

    public cm(String str) {
        this.jpo = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.f19043jd = jpo(str);
    }

    public Thread jpo(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (wqx) {
            return null;
        }
        Thread threadJpo = jpo(this.jpo, runnable, this.f19043jd + "_" + this.f19042cm.getAndIncrement());
        if (threadJpo.isDaemon()) {
            threadJpo.setDaemon(false);
        }
        return threadJpo;
    }

    public static String jpo(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
