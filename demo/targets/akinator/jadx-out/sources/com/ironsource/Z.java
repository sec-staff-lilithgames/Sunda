package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z implements Y {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3498vc f35817a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35818a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f35819b = 1000;

        private a() {
        }
    }

    public Z(InterfaceC3498vc networkLoadApi) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkLoadApi, "networkLoadApi");
        this.f35817a = networkLoadApi;
    }

    @Override // com.ironsource.Y
    public String a() {
        return this.f35817a.a();
    }

    @Override // com.ironsource.Y
    public void a(M9 adInstance, Map<String, String> loadParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstance, "adInstance");
        kotlin.jvm.internal.e0.checkNotNullParameter(loadParams, "loadParams");
        try {
            this.f35817a.a(adInstance, new C3532xc(null, false, 3, null));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.ADAPTER_API.verbose("load ad with identifier: " + adInstance.e() + " failed. error: " + e10.getMessage());
            String strK = a.b.k("1000: loadAd failed: ", e10.getMessage());
            Ic icB = adInstance.b();
            if (icB instanceof C3193e6) {
                Ic icB2 = adInstance.b();
                kotlin.jvm.internal.e0.checkNotNull(icB2, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.FullScreenAdInstanceListenerWrapper");
                ((C3193e6) icB2).onInterstitialLoadFailed(strK);
            } else if (icB instanceof Kc) {
                Ic icB3 = adInstance.b();
                kotlin.jvm.internal.e0.checkNotNull(icB3, "null cannot be cast to non-null type com.unity3d.ironsourceads.internal.OnBannerListenerWrapper");
                ((Kc) icB3).onBannerLoadFail(strK);
            }
        }
    }
}
