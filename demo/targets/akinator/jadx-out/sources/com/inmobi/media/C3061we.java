package com.inmobi.media;

import android.os.Build;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.we, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3061we {

    /* renamed from: a, reason: collision with root package name */
    public TelemetryConfig f33550a;

    public C3061we(TelemetryConfig telemetryConfig) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryConfig, "telemetryConfig");
        this.f33550a = telemetryConfig;
    }

    public final void a(C2761f1 c2761f1) {
        if (Build.VERSION.SDK_INT < 30 || c2761f1 == null || c2761f1.f32828g != 6) {
            return;
        }
        a("ANREvent", c2761f1);
    }

    public final void a(String str, Z5 z52) {
        if (this.f33550a.getPriorityEventsList().contains(str) && z52 != null && AbstractC2809hf.a(z52)) {
            C2926oe.b(str, new LinkedHashMap(), EnumC2993se.f33373a);
        }
    }
}
