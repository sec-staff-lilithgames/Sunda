package com.ironsource;

import com.ironsource.N0;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Wd extends AbstractC3405q3<Xd> {
    public Wd(List<NetworkSettings> list, Zd zd2, String str, boolean z10, C3360na c3360na, C3161ca c3161ca) {
        super(new Ud(str, list, zd2, z10), c3360na, c3161ca);
    }

    @Override // com.ironsource.AbstractC3388p3
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Xd a(NetworkSettings networkSettings, BaseAdAdapter<?, AdapterAdRewardListener> baseAdAdapter, int i10, String str, C3352n2 c3352n2) {
        return new Xd(this, new C3312l0(IronSource.a.REWARDED_VIDEO, this.f38095o.o(), i10, this.f38087g, str, this.f38085e, this.f38086f, networkSettings, this.f38095o.n()), baseAdAdapter, c3352n2, this);
    }

    @Override // com.ironsource.AbstractC3388p3
    public K0 g() {
        return new C3165ce();
    }

    @Override // com.ironsource.AbstractC3388p3
    public String l() {
        return IronSourceConstants.REWARDED_VIDEO_EVENT_TYPE;
    }

    @Override // com.ironsource.AbstractC3388p3
    public String o() {
        return IronSourceConstants.OPW_RV_MANAGER_NAME;
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean q() {
        return this.f38095o.h().a() == N0.a.MANUAL;
    }

    @Override // com.ironsource.AbstractC3388p3
    public boolean t() {
        return this.f38095o.h().a() == N0.a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    @Override // com.ironsource.AbstractC3388p3
    public LoadWhileShowSupportState a(NetworkSettings networkSettings, AdapterBaseInterface adapterBaseInterface) {
        return LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.AbstractC3388p3
    public void a(IronSourceError ironSourceError) {
        N0.a aVarA = this.f38095o.h().a();
        if (aVarA != N0.a.AUTOMATIC_LOAD_AFTER_CLOSE && aVarA != N0.a.AUTOMATIC_LOAD_WHILE_SHOW) {
            super.a(ironSourceError);
        } else {
            this.f38100t.a(false, (AdInfo) null);
        }
    }

    @Override // com.ironsource.AbstractC3388p3
    public JSONObject b(NetworkSettings networkSettings) {
        return networkSettings.getRewardedVideoSettings();
    }
}
