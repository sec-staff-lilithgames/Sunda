package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class L extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f31980a;

    /* renamed from: b, reason: collision with root package name */
    public final short f31981b;

    public L(InMobiAdRequestStatus status, short s10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(status, "status");
        this.f31980a = status;
        this.f31981b = s10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f31980a.getMessage();
    }
}
