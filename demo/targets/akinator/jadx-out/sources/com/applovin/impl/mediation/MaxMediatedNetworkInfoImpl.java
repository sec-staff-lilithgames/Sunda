package com.applovin.impl.mediation;

import bp.oM.DwaEpyvxz;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f14492a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.f14492a = jSONObject;
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterClassName() {
        return JsonUtils.getString(this.f14492a, "class", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getAdapterVersion() {
        return JsonUtils.getString(this.f14492a, "version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getName() {
        return JsonUtils.getString(this.f14492a, "name", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public String getSdkVersion() {
        return JsonUtils.getString(this.f14492a, "sdk_version", "");
    }

    @Override // com.applovin.mediation.MaxMediatedNetworkInfo
    public MaxMediatedNetworkInfo.InitializationStatus getInitializationStatus() {
        return MaxMediatedNetworkInfo.InitializationStatus.fromCode(JsonUtils.getInt(this.f14492a, DwaEpyvxz.teMufsNszExXrWN, MaxMediatedNetworkInfo.InitializationStatus.NOT_INITIALIZED.getCode()));
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + gjnZrsdA.CtSZRTCNKAfqzWt + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + ", initializationStatus=" + getInitializationStatus() + AbstractJsonLexerKt.END_OBJ;
    }
}
