package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.TelemetryConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Xa implements P2 {
    @Override // com.inmobi.media.P2
    public final void a(Config config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        if (config instanceof TelemetryConfig) {
            Ya.f32581a = (TelemetryConfig) config;
            Ya.f32582b.f32981a = 1 - Ya.f32581a.getPingSamplingFactor();
        }
    }
}
