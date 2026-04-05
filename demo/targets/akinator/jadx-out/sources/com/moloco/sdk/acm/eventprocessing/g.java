package com.moloco.sdk.acm.eventprocessing;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.services.h f45560a;

    /* renamed from: b, reason: collision with root package name */
    public final long f45561b;

    public g(com.moloco.sdk.acm.services.h timeProviderService, long j10) {
        e0.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f45560a = timeProviderService;
        this.f45561b = j10;
    }

    public final boolean a(com.moloco.sdk.acm.db.b eventEntity) {
        e0.checkNotNullParameter(eventEntity, "eventEntity");
        return this.f45560a.invoke() - eventEntity.l() >= this.f45561b * ((long) 1000);
    }
}
