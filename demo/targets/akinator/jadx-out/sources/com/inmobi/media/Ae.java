package com.inmobi.media;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Ae {

    /* renamed from: a, reason: collision with root package name */
    public final C2976re f31633a;

    /* renamed from: b, reason: collision with root package name */
    public final C2824id f31634b;

    /* renamed from: c, reason: collision with root package name */
    public final Be f31635c;

    public Ae(C2976re telemetryConfigMetaData, List samplingEvents) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.e0.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f31633a = telemetryConfigMetaData;
        double dRandom = Math.random();
        this.f31634b = new C2824id(telemetryConfigMetaData, dRandom, samplingEvents);
        this.f31635c = new Be(telemetryConfigMetaData, dRandom);
    }

    public final int a(EnumC2993se telemetryEventType, String eventType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(telemetryEventType, "telemetryEventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        int iOrdinal = telemetryEventType.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new tu.t();
            }
            Be be2 = this.f31635c;
            be2.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
            if (be2.f31690b >= be2.f31689a.f33331g) {
                return 0;
            }
            C2926oe c2926oe = C2926oe.f33217a;
            return 2;
        }
        C2824id c2824id = this.f31634b;
        c2824id.getClass();
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        if (!c2824id.f32934c.contains(eventType)) {
            return 1;
        }
        if (c2824id.f32933b >= c2824id.f32932a.f33331g) {
            return 0;
        }
        C2926oe c2926oe2 = C2926oe.f33217a;
        return 2;
    }
}
