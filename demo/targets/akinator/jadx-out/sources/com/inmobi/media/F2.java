package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class F2 extends C2731d5 {

    /* renamed from: q, reason: collision with root package name */
    public final int f31767q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(AdConfig.ViewabilityConfig viewabilityConfig, F5 f52) {
        super(viewabilityConfig, (byte) 1, f52);
        V4 visibilityChecker = Y4.f32552k;
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.f31767q = 500;
    }

    @Override // com.inmobi.media.C2731d5, com.inmobi.media.C2703bb, com.inmobi.media.Kf
    public final int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f32689n;
        return viewabilityConfig != null ? viewabilityConfig.getCompanionVisibilityThrottleMillis() : this.f31767q;
    }
}
