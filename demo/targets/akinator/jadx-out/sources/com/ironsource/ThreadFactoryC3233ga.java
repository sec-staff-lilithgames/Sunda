package com.ironsource;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class ThreadFactoryC3233ga implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f36802a = new AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable r10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(r10, "r");
        String str = String.format(Locale.ENGLISH, "%s-%d", Arrays.copyOf(new Object[]{"IronSourceThread", Integer.valueOf(this.f36802a.incrementAndGet())}, 2));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return new Thread(r10, str);
    }
}
