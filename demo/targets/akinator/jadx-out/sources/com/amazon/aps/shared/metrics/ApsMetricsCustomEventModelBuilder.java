package com.amazon.aps.shared.metrics;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsCustomEventInfo;
import com.amazon.aps.shared.metrics.model.ApsMetricsCustomModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsMetricsCustomEventModelBuilder {
    private String eventCategory = ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM;
    private String eventName;
    private String eventValue;
    private JSONObject extraAttrs;

    public final JSONObject build() {
        try {
            String str = this.eventName;
            if (str != null) {
                return new ApsMetricsTahoeDataModel(this.eventCategory, str, new ApsMetricsDataModel(new ApsMetricsEvent(new ApsMetricsCustomModel(new ApsMetricsCustomEventInfo(str, this.eventValue, this.extraAttrs)))).toJsonObject()).toJsonObject();
            }
            return null;
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error builing the custom metrics object from builder", e10);
            return null;
        }
    }

    public final ApsMetricsCustomEventModelBuilder withEventCategory(String eventCategory) {
        e0.checkNotNullParameter(eventCategory, "eventCategory");
        this.eventCategory = eventCategory;
        return this;
    }

    public final ApsMetricsCustomEventModelBuilder withEventDetail(JSONObject extraAttributes) {
        e0.checkNotNullParameter(extraAttributes, "extraAttributes");
        this.extraAttrs = extraAttributes;
        return this;
    }

    public final ApsMetricsCustomEventModelBuilder withEventName(String eventName) {
        e0.checkNotNullParameter(eventName, "eventName");
        this.eventName = eventName;
        return this;
    }

    public final ApsMetricsCustomEventModelBuilder withEventValue(String eventValue) {
        e0.checkNotNullParameter(eventValue, "eventValue");
        this.eventValue = eventValue;
        return this;
    }
}
