package com.amazon.aps.shared.metrics;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAaxBidEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAdClickEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAdFetchEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfAdapterEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfEventBase;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfImpressionFiredEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfModel;
import com.amazon.aps.shared.metrics.model.ApsMetricsPerfVideoCompletedEvent;
import com.amazon.aps.shared.metrics.model.ApsMetricsResult;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import kotlin.jvm.internal.e0;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ApsMetricsPerfEventModelBuilder {
    private final ApsMetricsPerfModel perfModel = new ApsMetricsPerfModel(null, 1, 0 == true ? 1 : 0);

    private final String getFunnelEventName() {
        return this.perfModel.getFetchEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_FETCHEVENT : this.perfModel.getAdapterEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT : this.perfModel.getAdClickEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_ADCLICKEVENT : this.perfModel.getBidEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT : this.perfModel.getImpressionEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT : this.perfModel.getVideoCompletedEvent() != null ? ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOCOMPLETEDEVENT : "";
    }

    public static /* synthetic */ ApsMetricsPerfEventModelBuilder withAdClickEvent$default(ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withAdClickEvent");
        }
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return apsMetricsPerfEventModelBuilder.withAdClickEvent(j10);
    }

    public static /* synthetic */ ApsMetricsPerfEventModelBuilder withVideoCompletedEvent$default(ApsMetricsPerfEventModelBuilder apsMetricsPerfEventModelBuilder, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withVideoCompletedEvent");
        }
        if ((i10 & 1) != 0) {
            j10 = System.currentTimeMillis();
        }
        return apsMetricsPerfEventModelBuilder.withVideoCompletedEvent(j10);
    }

    public final JSONObject build() {
        try {
            return new ApsMetricsTahoeDataModel(ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_FUNNEL, getFunnelEventName(), new ApsMetricsDataModel(new ApsMetricsEvent(this.perfModel)).toJsonObject()).toJsonObject();
        } catch (RuntimeException e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error building the perf metrics object from builder", e10);
            return null;
        }
    }

    public final ApsMetricsPerfEventModelBuilder withAdClickEvent(long j10) {
        this.perfModel.setAdClickEvent(new ApsMetricsPerfAdClickEvent(j10));
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withAdFetchEndTime(ApsMetricsResult result, long j10) {
        e0.checkNotNullParameter(result, "result");
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdFetchEvent fetchEvent = apsMetricsPerfModel.getFetchEvent();
        if (fetchEvent == null) {
            fetchEvent = new ApsMetricsPerfAdFetchEvent(result);
        }
        apsMetricsPerfModel.setFetchEvent(fetchEvent);
        ApsMetricsPerfAdFetchEvent fetchEvent2 = this.perfModel.getFetchEvent();
        if (fetchEvent2 != null) {
            fetchEvent2.setResult(result);
        }
        ApsMetricsPerfAdFetchEvent fetchEvent3 = this.perfModel.getFetchEvent();
        if (fetchEvent3 != null) {
            fetchEvent3.setEndTime(j10);
        }
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withAdFetchStartTime(long j10) {
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdFetchEvent fetchEvent = apsMetricsPerfModel.getFetchEvent();
        if (fetchEvent == null) {
            fetchEvent = new ApsMetricsPerfAdFetchEvent(null, 1, null);
        }
        apsMetricsPerfModel.setFetchEvent(fetchEvent);
        ApsMetricsPerfAdFetchEvent fetchEvent2 = this.perfModel.getFetchEvent();
        if (fetchEvent2 != null) {
            fetchEvent2.setStartTime(j10);
        }
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withAdFormat(String adFormat) {
        e0.checkNotNullParameter(adFormat, "adFormat");
        this.perfModel.setAdFormat(adFormat);
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withAdImpressionEndTime(ApsMetricsResult result, long j10) {
        e0.checkNotNullParameter(result, "result");
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfImpressionFiredEvent apsMetricsPerfImpressionFiredEvent = new ApsMetricsPerfImpressionFiredEvent(result);
        apsMetricsPerfImpressionFiredEvent.setEndTime(j10);
        apsMetricsPerfModel.setImpressionEvent(apsMetricsPerfImpressionFiredEvent);
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withAdapterEndTime(ApsMetricsResult result, long j10) {
        e0.checkNotNullParameter(result, "result");
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdapterEvent adapterEvent = apsMetricsPerfModel.getAdapterEvent();
        if (adapterEvent == null) {
            adapterEvent = new ApsMetricsPerfAdapterEvent(null, 1, null);
        }
        apsMetricsPerfModel.setAdapterEvent(adapterEvent);
        ApsMetricsPerfAdapterEvent adapterEvent2 = this.perfModel.getAdapterEvent();
        if (adapterEvent2 != null) {
            adapterEvent2.setResult(result);
        }
        ApsMetricsPerfAdapterEvent adapterEvent3 = this.perfModel.getAdapterEvent();
        if (adapterEvent3 != null) {
            adapterEvent3.setEndTime(j10);
        }
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withAdapterStartTime(long j10) {
        ApsMetricsPerfModel apsMetricsPerfModel = this.perfModel;
        ApsMetricsPerfAdapterEvent adapterEvent = apsMetricsPerfModel.getAdapterEvent();
        if (adapterEvent == null) {
            adapterEvent = new ApsMetricsPerfAdapterEvent(null, 1, null);
        }
        apsMetricsPerfModel.setAdapterEvent(adapterEvent);
        ApsMetricsPerfAdapterEvent adapterEvent2 = this.perfModel.getAdapterEvent();
        if (adapterEvent2 != null) {
            adapterEvent2.setStartTime(j10);
        }
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withBidId(String str) {
        if (str != null) {
            this.perfModel.setBidId(str);
        }
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withCorrelationId(String correlationId) {
        e0.checkNotNullParameter(correlationId, "correlationId");
        this.perfModel.setCorrelationId(correlationId);
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withEvent(ApsMetricsPerfEventBase event) {
        e0.checkNotNullParameter(event, "event");
        if (event instanceof ApsMetricsPerfAaxBidEvent) {
            this.perfModel.setBidEvent((ApsMetricsPerfAaxBidEvent) event);
            return this;
        }
        if (event instanceof ApsMetricsPerfImpressionFiredEvent) {
            this.perfModel.setImpressionEvent((ApsMetricsPerfImpressionFiredEvent) event);
            return this;
        }
        if (event instanceof ApsMetricsPerfAdFetchEvent) {
            this.perfModel.setFetchEvent((ApsMetricsPerfAdFetchEvent) event);
            return this;
        }
        if (event instanceof ApsMetricsPerfAdapterEvent) {
            this.perfModel.setAdapterEvent((ApsMetricsPerfAdapterEvent) event);
        }
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withMediationName(String str) {
        this.perfModel.setNetworkName(str);
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withVideoCompletedEvent(long j10) {
        this.perfModel.setVideoCompletedEvent(new ApsMetricsPerfVideoCompletedEvent(j10));
        return this;
    }

    public final ApsMetricsPerfEventModelBuilder withVideoFlag(boolean z10) {
        this.perfModel.setVideoFlag(Boolean.valueOf(z10));
        return this;
    }
}
