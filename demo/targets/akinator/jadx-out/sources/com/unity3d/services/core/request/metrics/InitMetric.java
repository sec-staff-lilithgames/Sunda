package com.unity3d.services.core.request.metrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class InitMetric {
    private static final String INIT_METRIC_ENVIRONMENT_NOT_OK = "native_init_environment_not_ok";
    private static final String INIT_METRIC_ENVIRONMENT_OK = "native_init_environment_ok";

    public static Metric newInitEnvironmentNotOk() {
        return new Metric(INIT_METRIC_ENVIRONMENT_NOT_OK, null);
    }

    public static Metric newInitEnvironmentOk() {
        return new Metric(INIT_METRIC_ENVIRONMENT_OK, null);
    }
}
