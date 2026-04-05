package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f46871a = tu.q.lazy(new a1.k(19));

    public static final m a() {
        return c();
    }

    public static final n b() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "BidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        return new n(d0.f46793a.a(), u.f46943a.a());
    }

    public static final n c() {
        return (n) f46871a.getValue();
    }
}
