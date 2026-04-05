package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class DualValueMetric extends Metric {
    private Long valueFirst;
    private Long valueSecond;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DualValueMetric(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        e0.checkNotNullParameter(metricType, "metricType");
    }

    public final Long getValueFirst() {
        return this.valueFirst;
    }

    public final Long getValueSecond() {
        return this.valueSecond;
    }

    public final void setValueFirst(Long l9) {
        this.valueFirst = l9;
    }

    public final void setValueSecond(Long l9) {
        this.valueSecond = l9;
    }
}
