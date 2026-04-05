package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ironsourceads.AdSize;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.g3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3226g3 implements Fb {

    /* renamed from: a, reason: collision with root package name */
    private final BannerAdRequest f36743a;

    /* renamed from: b, reason: collision with root package name */
    private final BannerAdLoaderListener f36744b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3170d1 f36745c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3369o1 f36746d;

    public C3226g3(BannerAdRequest adRequest, BannerAdLoaderListener publisherListener, InterfaceC3170d1 adapterConfigProvider, InterfaceC3369o1 analyticsFactory) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adRequest, "adRequest");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherListener, "publisherListener");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterConfigProvider, "adapterConfigProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(analyticsFactory, "analyticsFactory");
        this.f36743a = adRequest;
        this.f36744b = publisherListener;
        this.f36745c = adapterConfigProvider;
        this.f36746d = analyticsFactory;
    }

    @Override // com.ironsource.Fb
    public Cb a() throws Exception {
        IronSourceError ironSourceErrorA;
        String instanceId = this.f36743a.getInstanceId();
        String sDKVersion = SDKUtils.getSDKVersion();
        IronSource.a aVar = IronSource.a.BANNER;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        InterfaceC3386p1 interfaceC3386p1A = this.f36746d.a(new C3277j1(sDKVersion, instanceId, aVar, false, false, false, 56, null));
        try {
            Db dbA = new Eb(this.f36743a.getAdm(), this.f36743a.getProviderName$mediationsdk_release(), this.f36745c, C3306kc.f37095e.a().c().get()).a();
            new C3190e3(dbA, this.f36743a.getSize()).a();
            C3515wc c3515wc = new C3515wc();
            C3314l2 c3314l2 = new C3314l2(this.f36743a.getAdm(), this.f36743a.getProviderName$mediationsdk_release());
            BannerAdRequest bannerAdRequest = this.f36743a;
            AdSize size = bannerAdRequest.getSize();
            kotlin.jvm.internal.e0.checkNotNull(dbA);
            V7 v72 = V7.f35633a;
            return new C3172d3(bannerAdRequest, size, c3314l2, dbA, c3515wc, interfaceC3386p1A, new C3208f3(v72, this.f36744b), new F2(interfaceC3386p1A, v72.c()), null, null, 768, null);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            if (e10 instanceof C3399pe) {
                ironSourceErrorA = ((C3399pe) e10).a();
            } else {
                C3559z5 c3559z5 = C3559z5.f39348a;
                String message = e10.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                ironSourceErrorA = c3559z5.a(message);
            }
            return new C3542y5(ironSourceErrorA, new C3208f3(V7.f35633a, this.f36744b), interfaceC3386p1A);
        }
    }

    public /* synthetic */ C3226g3(BannerAdRequest bannerAdRequest, BannerAdLoaderListener bannerAdLoaderListener, InterfaceC3170d1 interfaceC3170d1, InterfaceC3369o1 interfaceC3369o1, int i10, kotlin.jvm.internal.u uVar) {
        this(bannerAdRequest, bannerAdLoaderListener, interfaceC3170d1, (i10 & 8) != 0 ? new C3351n1(IronSource.a.BANNER) : interfaceC3369o1);
    }
}
