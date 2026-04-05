package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.d5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2731d5 extends C2703bb {

    /* renamed from: p, reason: collision with root package name */
    public final int f32732p;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2731d5(AdConfig.ViewabilityConfig viewabilityConfig, byte b10, F5 f52) {
        V4 visibilityChecker = Y4.f32552k;
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        super(visibilityChecker, viewabilityConfig, b10, f52);
        this.f32732p = 1000;
    }

    @Override // com.inmobi.media.C2703bb, com.inmobi.media.Kf
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f32689n;
        return viewabilityConfig != null ? viewabilityConfig.getWebVisibilityThrottleMillis() : this.f32732p;
    }
}
