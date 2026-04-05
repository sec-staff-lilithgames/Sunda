package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class SingleValueMetric extends Metric {
    private Long value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleValueMetric(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        e0.checkNotNullParameter(metricType, "metricType");
    }

    public final void addValue(long j10) {
        Long l9 = this.value;
        this.value = Long.valueOf((l9 != null ? l9.longValue() : 0L) + j10);
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final Long m3566getValue() {
        return this.value;
    }

    public final void markTime() {
        this.value = Long.valueOf(System.currentTimeMillis());
    }

    public final void setValue(Long l9) {
        this.value = l9;
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        Long l9 = this.value;
        if (l9 != null) {
            return l9.longValue();
        }
        return 0L;
    }
}
