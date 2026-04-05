package io.bidmachine.analytics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class MonitorConfig {

    /* renamed from: a, reason: collision with root package name */
    private final String f59858a;

    /* renamed from: b, reason: collision with root package name */
    private final String f59859b;

    /* renamed from: c, reason: collision with root package name */
    private final int f59860c;

    /* renamed from: d, reason: collision with root package name */
    private final long f59861d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f59862e;

    public MonitorConfig(String str, String str2, int i10, long j10, boolean z10) {
        this.f59858a = str;
        this.f59859b = str2;
        this.f59860c = i10;
        this.f59861d = j10;
        this.f59862e = z10;
    }

    public final int getBatchSize() {
        return this.f59860c;
    }

    public final long getInterval() {
        return this.f59861d;
    }

    public final String getName() {
        return this.f59858a;
    }

    public final String getUrl() {
        return this.f59859b;
    }

    public final boolean isReportEnabled() {
        return this.f59862e;
    }
}
