package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.mf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ThreadFactoryC2893mf implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f33105a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(r10, "r");
        return new Thread(r10, "VastNetworkTask #" + this.f33105a.getAndIncrement());
    }
}
