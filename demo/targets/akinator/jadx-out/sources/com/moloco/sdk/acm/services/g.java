package com.moloco.sdk.acm.services;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f45665a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f45666b;

    public g(h timeProviderService) {
        e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f45665a = timeProviderService;
        this.f45666b = new AtomicLong(0L);
    }

    public final long a() {
        return this.f45665a.invoke() - this.f45666b.get();
    }

    public final AtomicLong b() {
        return this.f45666b;
    }

    public final void c() {
        this.f45666b.set(this.f45665a.invoke());
    }
}
