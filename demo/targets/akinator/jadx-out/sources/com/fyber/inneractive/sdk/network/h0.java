package com.fyber.inneractive.sdk.network;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h0 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f24229a = new AtomicInteger(100);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", Integer.valueOf(this.f24229a.getAndIncrement())));
    }
}
