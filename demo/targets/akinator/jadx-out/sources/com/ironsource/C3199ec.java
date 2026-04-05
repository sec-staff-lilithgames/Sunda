package com.ironsource;

import android.app.Activity;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.ironsource.AbstractC3438s3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3199ec extends AbstractC3438s3<Q0> implements NativeAdListener, C0 {

    /* renamed from: r, reason: collision with root package name */
    private AdapterNativeAdData f36611r;

    /* renamed from: s, reason: collision with root package name */
    private AdapterNativeAdViewBinder f36612s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3199ec(InterfaceC3482ud threadInterface, C3312l0 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, C3325ld c3325ld, C3352n2 item, Q0 q02) {
        super(threadInterface, adSmashData, baseAdAdapter, new C3134b1(adSmashData.g(), adSmashData.g().getNativeAdSettings(), IronSource.a.NATIVE_AD), item, q02);
        kotlin.jvm.internal.e0.checkNotNullParameter(threadInterface, "threadInterface");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSmashData, "adSmashData");
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        this.f38336g = c3325ld;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3199ec this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC3438s3
    public void G() {
        C3185dg c3185dg;
        if (!(this.f38332c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(a("activity must not be null"));
            D0 d02 = this.f38333d;
            if (d02 == null || (c3185dg = d02.f33941j) == null) {
                return;
            }
            c3185dg.g("activity must not be null");
            return;
        }
        Object obj = this.f38332c;
        kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.f38340k;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    public final AdapterNativeAdViewBinder R() {
        return this.f36612s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (u().e()) {
            u().a(new lh(this, 7, adapterNativeAdData, nativeAdViewBinder));
        } else {
            a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC3438s3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (u().e()) {
            u().a(new ch(this, 9));
        } else {
            J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i10, String str) {
        throw new tu.u("An operation is not implemented: Not yet implemented");
    }

    private final void J() {
        C3185dg c3185dg;
        IronLog.INTERNAL.verbose(d());
        if (y()) {
            super.onAdOpened();
            return;
        }
        if (this.f38334e != AbstractC3438s3.h.FAILED) {
            String strM = b0.e2.m(OcvDtWCQ.wlj, "format(format, *args)", 2, new Object[]{k(), this.f38334e});
            D0 d02 = this.f38333d;
            if (d02 == null || (c3185dg = d02.f33941j) == null) {
                return;
            }
            c3185dg.q(strM);
        }
    }

    private final void a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f36611r = adapterNativeAdData;
        this.f36612s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    public final void P() {
        C3185dg c3185dg;
        Ab ab2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(k());
        a(AbstractC3438s3.h.NONE);
        Object obj = this.f38332c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.f38340k;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("destroyNativeAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(a(strK));
            D0 d02 = this.f38333d;
            if (d02 != null && (c3185dg = d02.f33941j) != null) {
                c3185dg.g(strK);
            }
        }
        D0 d03 = this.f38333d;
        if (d03 == null || (ab2 = d03.f33937f) == null) {
            return;
        }
        Integer sessionDepth = r();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        ab2.a(sessionDepth.intValue());
    }

    public final AdapterNativeAdData Q() {
        return this.f36611r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C3199ec this$0) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        this$0.J();
    }

    @Override // com.ironsource.AbstractC3438s3, com.ironsource.C0
    public Map<String, Object> a(A0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        if (this.f38336g != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(data, "data");
            data.put("placement", j());
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
