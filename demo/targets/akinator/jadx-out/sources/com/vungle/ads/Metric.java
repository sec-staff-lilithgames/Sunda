package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class Metric {
    private String meta;
    private Sdk.SDKMetric.SDKMetricType metricType;

    public Metric(Sdk.SDKMetric.SDKMetricType metricType) {
        e0.checkNotNullParameter(metricType, "metricType");
        this.metricType = metricType;
    }

    public final String getMeta() {
        return this.meta;
    }

    public final Sdk.SDKMetric.SDKMetricType getMetricType() {
        return this.metricType;
    }

    public abstract long getValue();

    public final void setMeta(String str) {
        this.meta = str;
    }

    public final void setMetricType(Sdk.SDKMetric.SDKMetricType sDKMetricType) {
        e0.checkNotNullParameter(sDKMetricType, "<set-?>");
        this.metricType = sDKMetricType;
    }
}
