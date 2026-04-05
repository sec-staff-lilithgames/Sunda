package com.amazon.aps.shared.metrics.model;

import com.amazon.aps.shared.ApsMetrics;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsSdkInfo {
    private String appid;
    private String version;

    /* JADX WARN: Multi-variable type inference failed */
    public ApsMetricsSdkInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ApsMetricsSdkInfo copy$default(ApsMetricsSdkInfo apsMetricsSdkInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsSdkInfo.version;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsSdkInfo.appid;
        }
        return apsMetricsSdkInfo.copy(str, str2);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.appid;
    }

    public final ApsMetricsSdkInfo copy(String str, String str2) {
        return new ApsMetricsSdkInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsSdkInfo)) {
            return false;
        }
        ApsMetricsSdkInfo apsMetricsSdkInfo = (ApsMetricsSdkInfo) obj;
        return e0.areEqual(this.version, apsMetricsSdkInfo.version) && e0.areEqual(this.appid, apsMetricsSdkInfo.appid);
    }

    public final String getAppid() {
        return this.appid;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appid;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAppid(String str) {
        this.appid = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.version;
        if (str != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_APSVERSION, str);
        }
        String adapterVersion = ApsMetrics.Companion.getAdapterVersion();
        if (adapterVersion != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTERVERSION, adapterVersion);
        }
        String str2 = this.appid;
        if (str2 != null) {
            jSONObject.put("aid", str2);
        }
        return jSONObject;
    }

    public String toString() {
        return g.l("ApsMetricsSdkInfo(version=", this.version, ", appid=", this.appid, ")");
    }

    public ApsMetricsSdkInfo(String str, String str2) {
        this.version = str;
        this.appid = str2;
    }

    public /* synthetic */ ApsMetricsSdkInfo(String str, String str2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
