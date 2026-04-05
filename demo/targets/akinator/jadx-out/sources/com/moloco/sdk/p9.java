package com.moloco.sdk;

import com.google.protobuf.MessageLiteOrBuilder;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface p9 extends MessageLiteOrBuilder {
    MetricsRequest$PostMetricsRequest.CountEvent getCounts(int i10);

    int getCountsCount();

    List<MetricsRequest$PostMetricsRequest.CountEvent> getCountsList();

    MetricsRequest$PostMetricsRequest.TimerEvent getDurations(int i10);

    int getDurationsCount();

    List<MetricsRequest$PostMetricsRequest.TimerEvent> getDurationsList();
}
