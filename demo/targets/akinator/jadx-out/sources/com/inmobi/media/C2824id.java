package com.inmobi.media;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2824id {

    /* renamed from: a, reason: collision with root package name */
    public final C2976re f32932a;

    /* renamed from: b, reason: collision with root package name */
    public final double f32933b;

    /* renamed from: c, reason: collision with root package name */
    public final List f32934c;

    public C2824id(C2976re telemetryConfigMetaData, double d10, List samplingEvents) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.e0.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f32932a = telemetryConfigMetaData;
        this.f32933b = d10;
        this.f32934c = samplingEvents;
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("id", "getSimpleName(...)");
    }
}
