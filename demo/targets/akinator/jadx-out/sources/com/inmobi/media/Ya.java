package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Ya {

    /* renamed from: a, reason: collision with root package name */
    public static TelemetryConfig f32581a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2840jd f32582b;

    static {
        Xa xa2 = new Xa();
        LinkedHashMap linkedHashMap = Q2.f32149a;
        Config configA = O2.a("telemetry", C2925od.b(), xa2);
        kotlin.jvm.internal.e0.checkNotNull(configA, "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig");
        TelemetryConfig telemetryConfig = (TelemetryConfig) configA;
        f32581a = telemetryConfig;
        f32582b = new C2840jd(1 - telemetryConfig.getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(keyValueMap, "keyValueMap");
        if (kotlin.jvm.internal.e0.areEqual(eventType, "PingDBMaxLimitReached")) {
            C2926oe c2926oe = C2926oe.f33217a;
            C2926oe.b(eventType, keyValueMap, EnumC2993se.f33373a);
        } else if (f32582b.a()) {
            double d10 = 1;
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d10 - f32581a.getSamplingFactor()) * (d10 - f32581a.getPingSamplingFactor()) * 100)));
            C2926oe c2926oe2 = C2926oe.f33217a;
            C2926oe.b(eventType, keyValueMap, EnumC2993se.f33373a);
        }
    }
}
