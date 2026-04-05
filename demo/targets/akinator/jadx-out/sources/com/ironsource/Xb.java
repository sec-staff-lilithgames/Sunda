package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Xb extends AbstractC3553z implements NativeAdListener {

    /* renamed from: x, reason: collision with root package name */
    private AdapterNativeAdData f35707x;

    /* renamed from: y, reason: collision with root package name */
    private AdapterNativeAdViewBinder f35708y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(V0 adTools, A instanceData, G adInstancePayload, D listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.AbstractC3553z
    public void A() {
        if (!(g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData adDataI = i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            f().e().h().g("activity must not be null");
            return;
        }
        Object objG = g();
        kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) objG).loadAd(adDataI, activeContext, this);
    }

    public final AdapterNativeAdData I() {
        return this.f35707x;
    }

    public final AdapterNativeAdViewBinder J() {
        return this.f35708y;
    }

    @Override // com.ironsource.AbstractC3553z
    public void a(I adInstancePresenter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.a(this);
    }

    @Override // com.ironsource.AbstractC3553z
    public void b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(q());
        if (g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (g() instanceof AdapterNativeAdInterface) {
                Object objG = g();
                kotlin.jvm.internal.e0.checkNotNull(objG, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objG).destroyAd(i());
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("destroyNativeAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strK));
            f().e().h().g(strK);
        }
        super.b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f35707x = adapterNativeAdData;
        this.f35708y = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void a(Qb nativeAdBinder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.a(this.f35707x);
        nativeAdBinder.a(this.f35708y);
    }
}
