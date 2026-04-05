package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.MessageOrBuilder;
import io.bidmachine.protobuf.analytics.SDKAnalyticPayload;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface SDKAnalyticPayloadOrBuilder extends MessageOrBuilder {
    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ MessageLite getDefaultInstanceForType();

    SDKAnalyticPayload.Metric getMetrics(int i10);

    int getMetricsCount();

    List<SDKAnalyticPayload.Metric> getMetricsList();

    SDKAnalyticPayload.MetricOrBuilder getMetricsOrBuilder(int i10);

    List<? extends SDKAnalyticPayload.MetricOrBuilder> getMetricsOrBuilderList();

    @Override // com.explorestack.protobuf.MessageOrBuilder
    /* synthetic */ boolean isInitialized();
}
