package com.inmobi.media;

import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2681a6 {

    /* renamed from: a, reason: collision with root package name */
    public final C2840jd f32643a;

    /* renamed from: b, reason: collision with root package name */
    public final C2840jd f32644b;

    /* renamed from: c, reason: collision with root package name */
    public final C2840jd f32645c;

    /* renamed from: d, reason: collision with root package name */
    public final C2840jd f32646d;

    public C2681a6(CrashConfig config) {
        kotlin.jvm.internal.e0.checkNotNullParameter(config, "config");
        this.f32643a = new C2840jd(config.getCrashConfig().getSamplingPercent());
        this.f32644b = new C2840jd(config.getCatchConfig().getSamplingPercent());
        this.f32645c = new C2840jd(config.getANRConfig().getWatchdog().getSamplingPercent());
        this.f32646d = new C2840jd(config.getANRConfig().getAppExitReason().getSamplingPercent());
    }
}
