package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.bb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C2703bb extends Kf {

    /* renamed from: n, reason: collision with root package name */
    public final AdConfig.ViewabilityConfig f32689n;

    /* renamed from: o, reason: collision with root package name */
    public final int f32690o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2703bb(Ef visibilityChecker, AdConfig.ViewabilityConfig viewabilityConfig, byte b10, F5 f52) {
        super(visibilityChecker, b10, f52);
        kotlin.jvm.internal.e0.checkNotNullParameter(visibilityChecker, "visibilityChecker");
        this.f32689n = viewabilityConfig;
        this.f32690o = 100;
    }

    @Override // com.inmobi.media.Kf
    public int c() {
        AdConfig.ViewabilityConfig viewabilityConfig = this.f32689n;
        return viewabilityConfig != null ? viewabilityConfig.getVisibilityThrottleMillis() : this.f32690o;
    }

    @Override // com.inmobi.media.Kf
    public final void d() {
        g();
    }
}
