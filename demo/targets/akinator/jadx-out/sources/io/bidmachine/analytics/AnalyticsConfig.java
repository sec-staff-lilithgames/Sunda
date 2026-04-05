package io.bidmachine.analytics;

import com.explorestack.protobuf.Struct;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AnalyticsConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f59843a;

    /* renamed from: b, reason: collision with root package name */
    private final List f59844b;

    /* renamed from: c, reason: collision with root package name */
    private final List f59845c;

    /* renamed from: d, reason: collision with root package name */
    private final String f59846d;

    /* renamed from: e, reason: collision with root package name */
    private final Struct f59847e;

    public AnalyticsConfig(String str, List<MonitorConfig> list, List<ReaderConfig> list2, String str2, Struct struct) {
        this.f59843a = str;
        this.f59844b = list;
        this.f59845c = list2;
        this.f59846d = str2;
        this.f59847e = struct;
    }

    public final String getBpk() {
        return this.f59846d;
    }

    public final Struct getExtras() {
        return this.f59847e;
    }

    public final List<MonitorConfig> getMonitorConfigList() {
        return this.f59844b;
    }

    public final List<ReaderConfig> getReaderConfigList() {
        return this.f59845c;
    }

    public final String getSessionId() {
        return this.f59843a;
    }
}
