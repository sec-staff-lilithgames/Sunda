package com.bytedance.sdk.component.my.jpo;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements ThreadFactory {

    /* renamed from: jd, reason: collision with root package name */
    private final AtomicInteger f18878jd = new AtomicInteger(1);
    private final ThreadGroup jpo;

    public jpo(String str) {
        this.jpo = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.jpo, runnable, "tt_img_" + this.f18878jd.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
