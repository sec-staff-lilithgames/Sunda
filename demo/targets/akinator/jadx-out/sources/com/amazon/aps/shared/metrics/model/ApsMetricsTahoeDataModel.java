package com.amazon.aps.shared.metrics.model;

import b3.h;
import com.ironsource.C3191e4;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ApsMetricsTahoeDataModel {
    public static final Companion Companion = new Companion(null);
    public static final String TAHOE_EVENT_CATEGORY_CRASH = "crash";
    public static final String TAHOE_EVENT_CATEGORY_CUSTOM = "custom";
    public static final String TAHOE_EVENT_CATEGORY_FUNNEL = "funnel";
    private String eventCategory;
    private String eventName;
    private JSONObject eventProperties;
    private final String eventSource;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    public ApsMetricsTahoeDataModel(String eventCategory, String eventName, JSONObject eventProperties) {
        e0.checkNotNullParameter(eventCategory, "eventCategory");
        e0.checkNotNullParameter(eventName, "eventName");
        e0.checkNotNullParameter(eventProperties, "eventProperties");
        this.eventCategory = eventCategory;
        this.eventName = eventName;
        this.eventProperties = eventProperties;
        this.eventSource = "aps_android_sdk";
    }

    private final String component1() {
        return this.eventCategory;
    }

    private final String component2() {
        return this.eventName;
    }

    private final JSONObject component3() {
        return this.eventProperties;
    }

    public static /* synthetic */ ApsMetricsTahoeDataModel copy$default(ApsMetricsTahoeDataModel apsMetricsTahoeDataModel, String str, String str2, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = apsMetricsTahoeDataModel.eventCategory;
        }
        if ((i10 & 2) != 0) {
            str2 = apsMetricsTahoeDataModel.eventName;
        }
        if ((i10 & 4) != 0) {
            jSONObject = apsMetricsTahoeDataModel.eventProperties;
        }
        return apsMetricsTahoeDataModel.copy(str, str2, jSONObject);
    }

    public final ApsMetricsTahoeDataModel copy(String eventCategory, String eventName, JSONObject eventProperties) {
        e0.checkNotNullParameter(eventCategory, "eventCategory");
        e0.checkNotNullParameter(eventName, "eventName");
        e0.checkNotNullParameter(eventProperties, "eventProperties");
        return new ApsMetricsTahoeDataModel(eventCategory, eventName, eventProperties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApsMetricsTahoeDataModel)) {
            return false;
        }
        ApsMetricsTahoeDataModel apsMetricsTahoeDataModel = (ApsMetricsTahoeDataModel) obj;
        return e0.areEqual(this.eventCategory, apsMetricsTahoeDataModel.eventCategory) && e0.areEqual(this.eventName, apsMetricsTahoeDataModel.eventName) && e0.areEqual(this.eventProperties, apsMetricsTahoeDataModel.eventProperties);
    }

    public int hashCode() {
        return this.eventProperties.hashCode() + o2.e(this.eventCategory.hashCode() * 31, 31, this.eventName);
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("eventSource", this.eventSource);
        jSONObject2.put("eventTime", System.currentTimeMillis());
        jSONObject2.put(C3191e4.h.f36490j0, this.eventName);
        jSONObject2.put("eventCategory", this.eventCategory);
        jSONObject2.put("eventProperties", this.eventProperties);
        jSONObject.put("Data", jSONObject2);
        jSONObject.put("PartitionKey", System.currentTimeMillis());
        return jSONObject;
    }

    public String toString() {
        String str = this.eventCategory;
        String str2 = this.eventName;
        JSONObject jSONObject = this.eventProperties;
        StringBuilder sbB = h.b("ApsMetricsTahoeDataModel(eventCategory=", str, ", eventName=", str2, ", eventProperties=");
        sbB.append(jSONObject);
        sbB.append(")");
        return sbB.toString();
    }
}
