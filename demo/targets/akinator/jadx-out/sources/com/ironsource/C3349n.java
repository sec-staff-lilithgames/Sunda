package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3349n extends J5 {

    /* renamed from: a, reason: collision with root package name */
    private final IronSource.a f37910a;

    /* renamed from: b, reason: collision with root package name */
    private final UUID f37911b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37912c;

    public C3349n(IronSource.a adFormat, UUID adId, String adUnitId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormat, "adFormat");
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        this.f37910a = adFormat;
        this.f37911b = adId;
        this.f37912c = adUnitId;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 a02) {
        return a(new C3205f0(this.f37910a, this.f37911b, this.f37912c, null, null, null, 56, null));
    }
}
