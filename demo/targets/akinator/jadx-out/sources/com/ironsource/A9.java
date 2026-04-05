package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class A9 extends AbstractC3353n3<C9, AdapterAdInteractionListener> {
    public A9(List<NetworkSettings> list, F9 f92, String str, C3360na c3360na, C3161ca c3161ca) {
        super(new B9(str, list, f92), c3360na, c3161ca);
    }

    @Override // com.ironsource.AbstractC3388p3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C9 a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdInteractionListener> baseAdAdapter, int i10, String str, C3352n2 c3352n2) {
        return new C9(this, new C3312l0(IronSource.a.f37252c, this.f38095o.o(), i10, this.f38087g, str, this.f38085e, this.f38086f, networkSettings, this.f38095o.n()), baseAdAdapter, c3352n2, this);
    }

    @Override // com.ironsource.AbstractC3388p3
    public K0 g() {
        return new J9();
    }

    @Override // com.ironsource.AbstractC3388p3
    public String l() {
        return IronSourceConstants.INTERSTITIAL_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC3388p3
    public String o() {
        return IronSourceConstants.OPW_IS_MANAGER_NAME;
    }

    public A9(L7 l72, K7 k72, List<NetworkSettings> list, F9 f92, String str, C3360na c3360na, C3161ca c3161ca) {
        super(l72, k72, new B9(str, list, f92), c3360na, c3161ca);
    }

    @Override // com.ironsource.AbstractC3388p3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getInterstitialSettings();
    }
}
