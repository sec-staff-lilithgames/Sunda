package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.z9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3563z9 implements Fb {

    /* renamed from: a, reason: collision with root package name */
    private final InterstitialAdRequest f39357a;

    /* renamed from: b, reason: collision with root package name */
    private final InterstitialAdLoaderListener f39358b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3170d1 f39359c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3369o1 f39360d;

    public C3563z9(InterstitialAdRequest adRequest, InterstitialAdLoaderListener publisherListener, InterfaceC3170d1 adapterConfigProvider, InterfaceC3369o1 analyticsFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherListener, "publisherListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f39357a = adRequest;
        this.f39358b = publisherListener;
        this.f39359c = adapterConfigProvider;
        this.f39360d = analyticsFactory;
    }

    @Override // com.ironsource.Fb
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorB;
        String instanceId = this.f39357a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.f37252c;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC3386p1 interfaceC3386p1A = this.f39360d.a(new C3277j1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f39357a.getAdm(), this.f39357a.getProviderName$mediationsdk_release(), this.f39359c, C3306kc.f37095e.a().c().get()).a();
            new C3529x9(dbA).a();
            C3515wc c3515wc = new C3515wc();
            C3314l2 c3314l2 = new C3314l2(this.f39357a.getAdm(), this.f39357a.getProviderName$mediationsdk_release());
            InterstitialAdRequest interstitialAdRequest = this.f39357a;
            kotlin.jvm.internal.e0.checkNotNull(dbA);
            V7 v72 = V7.f35633a;
            return new C3512w9(interstitialAdRequest, dbA, new C3546y9(v72, this.f39358b), c3314l2, c3515wc, interfaceC3386p1A, new C3444s9(interfaceC3386p1A, v72.c()), null, null, 384, null);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            if (e10 instanceof C3399pe) {
                ironSourceErrorB = ((C3399pe) e10).a();
            } else {
                C3559z5 c3559z5 = C3559z5.f39348a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                ironSourceErrorB = c3559z5.b(message);
            }
            return new A5(this.f39357a, new C3546y9(V7.f35633a, this.f39358b), interfaceC3386p1A, ironSourceErrorB);
        }
    }

    public /* synthetic */ C3563z9(InterstitialAdRequest interstitialAdRequest, InterstitialAdLoaderListener interstitialAdLoaderListener, InterfaceC3170d1 interfaceC3170d1, InterfaceC3369o1 interfaceC3369o1, int i10, kotlin.jvm.internal.u uVar) {
        this(interstitialAdRequest, interstitialAdLoaderListener, interfaceC3170d1, (i10 & 8) != 0 ? new C3351n1(IronSource.a.f37252c) : interfaceC3369o1);
    }
}
