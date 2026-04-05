package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Tb extends AbstractC3329m implements InterfaceC3253hc, L0, InterfaceC3520x0 {

    /* renamed from: b, reason: collision with root package name */
    private final Wb f35494b;

    /* renamed from: c, reason: collision with root package name */
    private final C3350n0 f35495c;

    /* renamed from: d, reason: collision with root package name */
    private final C3181dc f35496d;

    /* renamed from: e, reason: collision with root package name */
    private C3217fc f35497e;

    /* renamed from: f, reason: collision with root package name */
    private LevelPlayAdInfo f35498f;

    public Tb(Wb listener, C3350n0 adTools, C3181dc nativeAdProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdProperties, "nativeAdProperties");
        this.f35494b = listener;
        this.f35495c = adTools;
        this.f35496d = nativeAdProperties;
        this.f35498f = p();
    }

    private final LevelPlayAdInfo p() {
        String string = this.f35496d.b().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "nativeAdProperties.adId.toString()");
        String strC = this.f35496d.c();
        String string2 = this.f35496d.a().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "nativeAdProperties.adFormat.toString()");
        return new LevelPlayAdInfo(string, strC, string2, null, null, null, null, null, 248, null);
    }

    public final void a(Qb nativeAdBinder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        C3217fc c3217fc = this.f35497e;
        if (c3217fc == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nativeAdUnit");
            c3217fc = null;
        }
        c3217fc.a(new Yb(nativeAdBinder), this);
    }

    @Override // com.ironsource.InterfaceC3520x0
    public void c(IronSourceError ironSourceError) {
        throw new tu.u("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.InterfaceC3520x0
    public void f() {
        throw new tu.u("An operation is not implemented: Not yet implemented");
    }

    @Override // com.ironsource.J0
    public void g() {
        this.f35494b.b(this.f35498f);
    }

    public final void q() {
        this.f35498f = p();
        C3217fc c3217fc = this.f35497e;
        if (c3217fc == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nativeAdUnit");
            c3217fc = null;
        }
        c3217fc.a(true);
    }

    public final void r() {
        C3217fc c3217fcA = a(this.f35495c, this.f35496d);
        this.f35497e = c3217fcA;
        if (c3217fcA == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("nativeAdUnit");
            c3217fcA = null;
        }
        c3217fcA.a((L0) this);
    }

    private final C3217fc a(C3350n0 c3350n0, C3181dc c3181dc) {
        IronLog.INTERNAL.verbose();
        return new C3217fc(c3350n0, C3235gc.f36804y.a(c3181dc, o().a()), this);
    }

    @Override // com.ironsource.L0
    public void a(C3435s0 adUnitCallback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitCallback, "adUnitCallback");
        LevelPlayAdInfo levelPlayAdInfoC = adUnitCallback.c();
        if (levelPlayAdInfoC != null) {
            this.f35498f = levelPlayAdInfoC;
            this.f35494b.a(levelPlayAdInfoC);
        }
    }

    @Override // com.ironsource.L0
    public void a(IronSourceError ironSourceError) {
        this.f35494b.onNativeAdLoadFailed(ironSourceError);
    }
}
