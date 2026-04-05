package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class K2 extends C3205f0 {

    /* renamed from: g, reason: collision with root package name */
    private final LevelPlayAdSize f34741g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f34742h;

    /* renamed from: i, reason: collision with root package name */
    private final Long f34743i;

    public /* synthetic */ K2(UUID uuid, String str, C3325ld c3325ld, LevelPlayAdSize levelPlayAdSize, Boolean bool, Long l9, Hf hf2, Double d10, int i10, kotlin.jvm.internal.u uVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c3325ld, (i10 & 8) != 0 ? LevelPlayAdSize.BANNER : levelPlayAdSize, (i10 & 16) != 0 ? null : bool, (i10 & 32) != 0 ? null : l9, (i10 & 64) != 0 ? null : hf2, (i10 & 128) != 0 ? null : d10);
    }

    public final LevelPlayAdSize h() {
        return this.f34741g;
    }

    public final Boolean i() {
        return this.f34742h;
    }

    public final Long j() {
        return this.f34743i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K2(UUID adId, String adUnitId, C3325ld c3325ld, LevelPlayAdSize adSize, Boolean bool, Long l9, Hf hf2, Double d10) {
        super(IronSource.a.BANNER, adId, adUnitId, c3325ld, hf2, d10);
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSize, "adSize");
        this.f34741g = adSize;
        this.f34742h = bool;
        this.f34743i = l9;
    }

    public K2() {
        this(C3561z7.f39356a.a(), "", null, null, null, null, null, null, 252, null);
    }
}
