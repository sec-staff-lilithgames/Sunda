package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f26016a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26017b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26018c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26019d;

    public f(byte[] bArr) {
        m mVar = new m(bArr);
        mVar.b(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
        mVar.a(16);
        mVar.a(16);
        mVar.a(24);
        mVar.a(24);
        this.f26016a = mVar.a(20);
        this.f26017b = mVar.a(3) + 1;
        this.f26018c = mVar.a(5) + 1;
        this.f26019d = ((mVar.a(4) & 15) << 32) | (mVar.a(32) & 4294967295L);
    }
}
