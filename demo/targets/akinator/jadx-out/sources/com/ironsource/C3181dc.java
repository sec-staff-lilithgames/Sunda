package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.dc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3181dc extends C3205f0 {
    public /* synthetic */ C3181dc(UUID uuid, String str, C3325ld c3325ld, int i10, kotlin.jvm.internal.u uVar) {
        this(uuid, str, (i10 & 4) != 0 ? null : c3325ld);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3181dc(UUID adId, String adUnitId, C3325ld c3325ld) {
        super(IronSource.a.NATIVE_AD, adId, adUnitId, c3325ld, null, null, 48, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(adId, "adId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
    }

    public C3181dc() {
        this(C3561z7.f39356a.a(), "", null, 4, null);
    }
}
