package io.odeeo.sdk;

import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdUnit$buildAudioAd$1 extends f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdUnit f67864a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdUnit$buildAudioAd$1(AdUnit adUnit) {
        super(0);
        this.f67864a = adUnit;
    }

    @Override // kv.a
    public final Boolean invoke() {
        io.odeeo.internal.w1.j rootViewChecker$odeeoSdk_release;
        AdUnitBase adUnit$odeeoSdk_release = this.f67864a.getAdUnit$odeeoSdk_release();
        return Boolean.valueOf((adUnit$odeeoSdk_release == null || (rootViewChecker$odeeoSdk_release = adUnit$odeeoSdk_release.getRootViewChecker$odeeoSdk_release()) == null) ? false : rootViewChecker$odeeoSdk_release.isCurrentlyCovered());
    }
}
