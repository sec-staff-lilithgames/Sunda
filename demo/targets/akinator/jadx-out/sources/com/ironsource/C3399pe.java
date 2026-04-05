package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.pe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3399pe extends IllegalArgumentException {

    /* renamed from: a, reason: collision with root package name */
    private final IronSourceError f38187a;

    /* renamed from: b, reason: collision with root package name */
    private final int f38188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3399pe(IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f38187a = error;
        this.f38188b = error.getErrorCode();
    }

    public final IronSourceError a() {
        return this.f38187a;
    }

    public final int b() {
        return this.f38188b;
    }
}
