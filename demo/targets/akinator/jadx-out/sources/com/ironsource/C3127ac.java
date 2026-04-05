package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3388p3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ac, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3127ac extends AbstractC3388p3<C3199ec, AdapterAdListener> implements Q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3127ac(List<? extends NetworkSettings> list, Rb configs, String str, C3360na publisherDataHolder, C3161ca c3161ca) {
        super(new C3145bc(str, list, configs), publisherDataHolder, c3161ca);
        kotlin.jvm.internal.e0.checkNotNullParameter(configs, "configs");
        kotlin.jvm.internal.e0.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean H() {
        return false;
    }

    public final void M() {
        C3185dg c3185dg;
        int iIntValue;
        Ab ab2;
        IronLog.INTERNAL.verbose();
        try {
            C3199ec c3199ec = (C3199ec) this.f38081a.d();
            if (c3199ec != null) {
                Integer numR = c3199ec.r();
                if (numR == null) {
                    iIntValue = this.C.a(this.f38095o.b());
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(numR, "it.sessionDepth ?: sessi…epth(mManagerData.adUnit)");
                    iIntValue = numR.intValue();
                }
                D0 d02 = this.f38099s;
                if (d02 != null && (ab2 = d02.f33937f) != null) {
                    ab2.a(iIntValue);
                }
                c3199ec.P();
                this.f38081a.a(null);
                this.f38081a.b(null);
            }
            this.f38089i = null;
            a(AbstractC3388p3.f.NONE);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            String strK = a.b.k("destroyNativeAd - exception = ", th2.getLocalizedMessage());
            IronLog.INTERNAL.error(b(strK));
            D0 d03 = this.f38099s;
            if (d03 == null || (c3185dg = d03.f33941j) == null) {
                return;
            }
            c3185dg.g(strK);
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3199ec a(NetworkSettings providerSettings, BaseAdAdapter<?, AdapterAdListener> adapter, int i10, String currentAuctionId, C3352n2 item) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        kotlin.jvm.internal.e0.checkNotNullParameter(adapter, "adapter");
        kotlin.jvm.internal.e0.checkNotNullParameter(currentAuctionId, "currentAuctionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(item, "item");
        return new C3199ec(this, new C3312l0(IronSource.a.NATIVE_AD, this.f38095o.o(), i10, this.f38087g, currentAuctionId, this.f38085e, this.f38086f, providerSettings, this.f38095o.n()), adapter, this.f38089i, item, this);
    }

    @Override // com.ironsource.AbstractC3388p3
    public K0 g() {
        return new C3335m5();
    }

    @Override // com.ironsource.AbstractC3388p3
    public String l() {
        return "NA";
    }

    @Override // com.ironsource.AbstractC3388p3
    public String o() {
        return IronSourceConstants.OPW_NT_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean v() {
        return false;
    }

    public final void a(C3325ld c3325ld) {
        String strM;
        int iB;
        IronLog.INTERNAL.verbose("placement = " + c3325ld);
        if (c3325ld == null || TextUtils.isEmpty(c3325ld.c())) {
            strM = b0.e2.m("can't load native ad - %s", "format(format, *args)", 1, new Object[]{c3325ld == null ? "placement is null" : "placement name is empty"});
            iB = C3554z0.b(this.f38095o.b());
        } else if (this.E.c(ContextProvider.getInstance().getApplicationContext(), c3325ld, this.f38095o.b())) {
            strM = b0.e2.m("placement %s is capped", "format(format, *args)", 1, new Object[]{c3325ld.c()});
            iB = C3554z0.f(this.f38095o.b());
        } else {
            strM = null;
            iB = 510;
        }
        if (TextUtils.isEmpty(strM)) {
            this.f38089i = c3325ld;
            A();
        } else {
            IronLog.API.error(b(strM));
            a(iB, strM, false);
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    public JSONObject b(NetworkSettings providerSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(providerSettings, "providerSettings");
        JSONObject nativeAdSettings = providerSettings.getNativeAdSettings();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(nativeAdSettings, "providerSettings.nativeAdSettings");
        return nativeAdSettings;
    }

    @Override // com.ironsource.AbstractC3388p3
    public void G() {
    }

    public final void a(InternalNativeAdListener nativeAdListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nativeAdListener, "nativeAdListener");
        a(new Zb(nativeAdListener));
    }

    @Override // com.ironsource.AbstractC3388p3
    public void a(AbstractC3438s3<?> abstractC3438s3, AdInfo adInfo) {
        if (abstractC3438s3 instanceof C3199ec) {
            C3199ec c3199ec = (C3199ec) abstractC3438s3;
            this.f38100t.a(c3199ec.Q(), c3199ec.R(), adInfo);
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    public void a(IronSourceError ironSourceError) {
        this.f38100t.a(ironSourceError);
    }

    @Override // com.ironsource.AbstractC3388p3, com.ironsource.C0
    public Map<String, Object> a(A0 event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.a(event);
        C3325ld c3325ld = this.f38089i;
        if (c3325ld != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(data, "data");
            data.put("placement", c3325ld.c());
        }
        UUID uuid = this.f38103w;
        if (uuid != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(data, "data");
            data.put("objectId", uuid);
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
