package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class B implements C0 {

    /* renamed from: a, reason: collision with root package name */
    private final V0 f33854a;

    /* renamed from: b, reason: collision with root package name */
    private final A f33855b;

    /* renamed from: c, reason: collision with root package name */
    private final BaseAdAdapter<?, ?> f33856c;

    public B(V0 adTools, A instanceData, BaseAdAdapter<?, ?> baseAdAdapter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        kotlin.jvm.internal.e0.checkNotNullParameter(instanceData, "instanceData");
        this.f33854a = adTools;
        this.f33855b = instanceData;
        this.f33856c = baseAdAdapter;
    }

    @Override // com.ironsource.C0
    public Map<String, Object> a(A0 event) throws JSONException {
        String adapterVersion;
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        HashMap map = new HashMap();
        try {
            BaseAdAdapter<?, ?> baseAdAdapter = this.f33856c;
            String networkSDKVersion = "";
            if (baseAdAdapter != null) {
                AdapterBaseInterface networkAdapter = baseAdAdapter.getNetworkAdapter();
                kotlin.jvm.internal.e0.checkNotNull(networkAdapter);
                adapterVersion = networkAdapter.getAdapterVersion();
            } else {
                adapterVersion = "";
            }
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(adapterVersion, "if (adapter != null) ada…!!.adapterVersion else \"\"");
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, adapterVersion);
            BaseAdAdapter<?, ?> baseAdAdapter2 = this.f33856c;
            if (baseAdAdapter2 != null) {
                AdapterBaseInterface networkAdapter2 = baseAdAdapter2.getNetworkAdapter();
                kotlin.jvm.internal.e0.checkNotNull(networkAdapter2);
                networkSDKVersion = networkAdapter2.getNetworkSDKVersion();
            }
            kotlin.jvm.internal.e0.checkNotNull(networkSDKVersion);
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, networkSDKVersion);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(C3350n0.a(this.f33854a, a.b.k("could not get adapter version for event data ", this.f33855b.w()), (String) null, 2, (Object) null));
        }
        String strI = this.f33855b.j().i();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strI, "instanceData.adapterConfig.subProviderId");
        map.put("spId", strI);
        String strA = this.f33855b.j().a();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "instanceData.adapterConfig.adSourceNameForEvents");
        map.put(IronSourceConstants.EVENTS_PROVIDER, strA);
        map.put("instanceType", Integer.valueOf(this.f33855b.s()));
        String serverData = this.f33855b.n().k();
        V0 v02 = this.f33854a;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(serverData, "serverData");
        String strE = v02.e(serverData);
        if (!TextUtils.isEmpty(strE)) {
            map.put("dynamicDemandSource", strE);
        }
        map.put("sessionDepth", Integer.valueOf(this.f33855b.v()));
        if (!TextUtils.isEmpty(this.f33855b.u().getCustomNetwork())) {
            String customNetwork = this.f33855b.u().getCustomNetwork();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(customNetwork, "instanceData.providerSettings.customNetwork");
            map.put(IronSourceConstants.EVENTS_CUSTOM_NETWORK_FIELD, customNetwork);
        }
        return map;
    }
}
