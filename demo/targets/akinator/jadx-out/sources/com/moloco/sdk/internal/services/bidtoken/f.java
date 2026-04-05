package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.BidToken$BidTokenResponseV3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final g f46836a;

    /* renamed from: b, reason: collision with root package name */
    public static final l f46837b;

    static {
        g gVar = new g(false);
        f46836a = gVar;
        f46837b = new l("", "", gVar);
    }

    public static final g a() {
        return f46836a;
    }

    public static final l b() {
        return f46837b;
    }

    public static final g a(BidToken$BidTokenResponseV3 bidToken$BidTokenResponseV3) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidToken$BidTokenResponseV3, "<this>");
        return bidToken$BidTokenResponseV3.hasClientTokenConfigs() ? new g(bidToken$BidTokenResponseV3.getClientTokenConfigs().getEnableDbt()) : f46836a;
    }
}
