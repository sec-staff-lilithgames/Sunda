package com.amazon.aps.shared.metrics.model;

import a.b;
import com.amazon.aps.ads.ApsLog;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsConfigOverride {
    private static final String CUSTOM_ONLY_KEY = "customOnly";
    public static final Companion Companion = new Companion(null);
    private static final String HAS_CUSTOM_ONLY_FLAG_KEY = "hasCustomOnlyFlag";
    private static final String SAMPLING_PERCENTAGE_KEY = "samplingPercentage";
    private boolean customOnly;
    private boolean hasCustomOnlyFlag;
    private int samplingPercentage;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final ApsMetricsConfigOverride fromJsonObject(JSONObject jSONObject) {
            u uVar = null;
            if (jSONObject == null) {
                return null;
            }
            try {
                ApsMetricsConfigOverride apsMetricsConfigOverride = new ApsMetricsConfigOverride(0, 0 == true ? 1 : 0, 3, uVar);
                if (!jSONObject.has("samplingPercentage")) {
                    return null;
                }
                apsMetricsConfigOverride.setSamplingPercentage(jSONObject.getInt("samplingPercentage"));
                apsMetricsConfigOverride.hasCustomOnlyFlag = jSONObject.optBoolean(ApsMetricsConfigOverride.HAS_CUSTOM_ONLY_FLAG_KEY, false);
                if (apsMetricsConfigOverride.getHasCustomOnlyFlag()) {
                    apsMetricsConfigOverride.setCustomOnly(jSONObject.optBoolean(ApsMetricsConfigOverride.CUSTOM_ONLY_KEY, false));
                }
                if (apsMetricsConfigOverride.isValid()) {
                    return apsMetricsConfigOverride;
                }
                return null;
            } catch (Exception e10) {
                ApsLog.e("ApsMetricsConfigOverride: Error parsing from JSON: " + e10.getMessage());
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApsMetricsConfigOverride() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ ApsMetricsConfigOverride copy$default(ApsMetricsConfigOverride apsMetricsConfigOverride, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = apsMetricsConfigOverride.samplingPercentage;
        }
        if ((i11 & 2) != 0) {
            z10 = apsMetricsConfigOverride.customOnly;
        }
        return apsMetricsConfigOverride.copy(i10, z10);
    }

    public static final ApsMetricsConfigOverride fromJsonObject(JSONObject jSONObject) {
        return Companion.fromJsonObject(jSONObject);
    }

    public final int component1() {
        return this.samplingPercentage;
    }

    public final boolean component2() {
        return this.customOnly;
    }

    public final ApsMetricsConfigOverride copy(int i10, boolean z10) {
        return new ApsMetricsConfigOverride(i10, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsConfigOverride)) {
            return false;
        }
        ApsMetricsConfigOverride apsMetricsConfigOverride = (ApsMetricsConfigOverride) obj;
        return this.samplingPercentage == apsMetricsConfigOverride.samplingPercentage && this.customOnly == apsMetricsConfigOverride.customOnly;
    }

    public final boolean getCustomOnly() {
        return this.customOnly;
    }

    public final boolean getHasCustomOnlyFlag() {
        return this.hasCustomOnlyFlag;
    }

    public final int getSamplingPercentage() {
        return this.samplingPercentage;
    }

    public int hashCode() {
        return Boolean.hashCode(this.customOnly) + (Integer.hashCode(this.samplingPercentage) * 31);
    }

    public final boolean isValid() {
        int i10 = this.samplingPercentage;
        if (i10 >= 0 && i10 <= 100) {
            return true;
        }
        ApsLog.e("ApsMetricsConfigOverride: Invalid samplingPercentage: " + i10);
        return false;
    }

    public final void setCustomOnly(boolean z10) {
        this.customOnly = z10;
    }

    public final void setSamplingPercentage(int i10) {
        this.samplingPercentage = i10;
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("samplingPercentage", this.samplingPercentage);
        jSONObject.put(HAS_CUSTOM_ONLY_FLAG_KEY, this.hasCustomOnlyFlag);
        if (this.hasCustomOnlyFlag) {
            jSONObject.put(CUSTOM_ONLY_KEY, this.customOnly);
        }
        return jSONObject;
    }

    public String toString() {
        int i10 = this.samplingPercentage;
        boolean z10 = this.customOnly;
        boolean z11 = this.hasCustomOnlyFlag;
        StringBuilder sb2 = new StringBuilder("ApsMetricsConfigOverride(samplingPercentage=");
        sb2.append(i10);
        sb2.append(", customOnly=");
        sb2.append(z10);
        sb2.append(", hasCustomOnlyFlag=");
        return b.q(sb2, z11, ")");
    }

    public ApsMetricsConfigOverride(int i10, boolean z10) {
        this.samplingPercentage = i10;
        this.customOnly = z10;
    }

    public /* synthetic */ ApsMetricsConfigOverride(int i10, boolean z10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? false : z10);
    }

    public ApsMetricsConfigOverride(JSONObject jSONObject) {
        this(0, false);
        if (jSONObject != null) {
            try {
                this.samplingPercentage = jSONObject.getInt("samplingPercentage");
                if (jSONObject.has(CUSTOM_ONLY_KEY)) {
                    try {
                        this.customOnly = jSONObject.getBoolean(CUSTOM_ONLY_KEY);
                        this.hasCustomOnlyFlag = true;
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("ApsMetricsConfigOverride: Invalid customOnly value type");
                    }
                }
                if (!isValid()) {
                    throw new IllegalArgumentException("ApsMetricsConfigOverride: Configuration validation failed");
                }
                return;
            } catch (Exception unused2) {
                throw new IllegalArgumentException("ApsMetricsConfigOverride: Missing or invalid samplingPercentage");
            }
        }
        throw new IllegalArgumentException("ApsMetricsConfigOverride: Invalid JSON object provided");
    }
}
