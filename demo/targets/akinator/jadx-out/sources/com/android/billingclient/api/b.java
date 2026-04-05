package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    public final ThreadFactory f12719b = Executors.defaultThreadFactory();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f12720c = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f12719b.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + this.f12720c.getAndIncrement());
        return threadNewThread;
    }
}
