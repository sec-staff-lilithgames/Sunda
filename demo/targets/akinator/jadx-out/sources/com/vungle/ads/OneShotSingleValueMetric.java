package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class OneShotSingleValueMetric extends SingleValueMetric {
    private boolean alreadyLogged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneShotSingleValueMetric(Sdk.SDKMetric.SDKMetricType metricType) {
        super(metricType);
        e0.checkNotNullParameter(metricType, "metricType");
    }

    public final boolean isLogged() {
        return this.alreadyLogged;
    }

    public final void markLogged() {
        this.alreadyLogged = true;
    }
}
