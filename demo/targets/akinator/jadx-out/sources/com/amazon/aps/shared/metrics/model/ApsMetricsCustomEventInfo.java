package com.amazon.aps.shared.metrics.model;

import b3.h;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class ApsMetricsCustomEventInfo {
    private final JSONObject extraAttrs;
    private final String name;
    private final String value;

    public ApsMetricsCustomEventInfo(String name, String str, JSONObject jSONObject) {
        e0.checkNotNullParameter(name, "name");
        this.name = name;
        this.value = str;
        this.extraAttrs = jSONObject;
    }

    private final String component1() {
        return this.name;
    }

    private final String component2() {
        return this.value;
    }

    private final JSONObject component3() {
        return this.extraAttrs;
    }

    public static /* synthetic */ ApsMetricsCustomEventInfo copy$default(ApsMetricsCustomEventInfo apsMetricsCustomEventInfo, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsCustomEventInfo.name;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsCustomEventInfo.value;
        }
        if ((i10 & 4) != 0) {
            jSONObject = apsMetricsCustomEventInfo.extraAttrs;
        }
        return apsMetricsCustomEventInfo.copy(str, str2, jSONObject);
    }

    public final ApsMetricsCustomEventInfo copy(String name, String str, JSONObject jSONObject) {
        e0.checkNotNullParameter(name, "name");
        return new ApsMetricsCustomEventInfo(name, str, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsCustomEventInfo)) {
            return false;
        }
        ApsMetricsCustomEventInfo apsMetricsCustomEventInfo = (ApsMetricsCustomEventInfo) obj;
        return e0.areEqual(this.name, apsMetricsCustomEventInfo.name) && e0.areEqual(this.value, apsMetricsCustomEventInfo.value) && e0.areEqual(this.extraAttrs, apsMetricsCustomEventInfo.extraAttrs);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.value;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        JSONObject jSONObject = this.extraAttrs;
        return iHashCode2 + (jSONObject != null ? jSONObject.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.value;
        JSONObject jSONObject = this.extraAttrs;
        StringBuilder sbB = h.b("ApsMetricsCustomEventInfo(name=", str, ", value=", str2, ", extraAttrs=");
        sbB.append(jSONObject);
        sbB.append(")");
        return sbB.toString();
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SFPXhf.aIGWyVNAAjVV, this.name);
        jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, System.currentTimeMillis());
        String str = this.value;
        if (str != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_VALUE, str);
        }
        JSONObject jSONObject2 = this.extraAttrs;
        if (jSONObject2 != null) {
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_EXTRAATTRS, jSONObject2);
        }
        return jSONObject;
    }

    public /* synthetic */ ApsMetricsCustomEventInfo(String str, String str2, JSONObject jSONObject, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : jSONObject);
    }
}
