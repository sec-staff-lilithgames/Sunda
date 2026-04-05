package com.vungle.ads.internal.executor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NamedThreadFactory implements ThreadFactory {
    private final AtomicInteger atomicInteger;
    private final String name;
    private final ThreadFactory threadFactory;

    public NamedThreadFactory(String name) {
        e0.checkNotNullParameter(name, "name");
        this.name = name;
        this.threadFactory = java.util.concurrent.Executors.defaultThreadFactory();
        this.atomicInteger = new AtomicInteger(0);
    }

    public final String getName() {
        return this.name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r10) {
        e0.checkNotNullParameter(r10, "r");
        Thread t10 = this.threadFactory.newThread(r10);
        t10.setName(this.name + "-th-" + this.atomicInteger.incrementAndGet());
        e0.checkNotNullExpressionValue(t10, "t");
        return t10;
    }
}
