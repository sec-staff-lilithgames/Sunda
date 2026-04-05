package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class TimeIntervalMetric extends DualValueMetric {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        e0.checkNotNullParameter(metricType, "metricType");
    }

    private final long calculateIntervalDuration() {
        long currentTime = getCurrentTime();
        Long valueSecond = getValueSecond();
        long jLongValue = valueSecond != null ? valueSecond.longValue() : currentTime;
        Long valueFirst = getValueFirst();
        if (valueFirst != null) {
            currentTime = valueFirst.longValue();
        }
        return (jLongValue - currentTime) / 1000000;
    }

    private final long getCurrentTime() {
        return System.nanoTime();
    }

    @Override // com.vungle.ads.Metric
    public long getValue() {
        return calculateIntervalDuration();
    }

    public void markEnd() {
        setValueSecond(Long.valueOf(getCurrentTime()));
    }

    public void markStart() {
        setValueFirst(Long.valueOf(getCurrentTime()));
    }
}
