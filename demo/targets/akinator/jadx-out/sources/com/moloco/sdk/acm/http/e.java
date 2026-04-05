package com.moloco.sdk.acm.http;

import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f45626a;

    /* renamed from: b, reason: collision with root package name */
    public final List f45627b;

    public e(List<MetricsRequest$PostMetricsRequest.CountEvent> counts, List<MetricsRequest$PostMetricsRequest.TimerEvent> timers) {
        e0.checkNotNullParameter(counts, "counts");
        e0.checkNotNullParameter(timers, "timers");
        this.f45626a = counts;
        this.f45627b = timers;
    }

    public final List<MetricsRequest$PostMetricsRequest.CountEvent> a() {
        return this.f45626a;
    }

    public final List<MetricsRequest$PostMetricsRequest.TimerEvent> b() {
        return this.f45627b;
    }
}
