package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3468u {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3202ef f38963a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38964b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38965c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38966d;

    /* renamed from: e, reason: collision with root package name */
    private final W7 f38967e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38968f;

    public C3468u(EnumC3202ef recordType, String advertiserBundleId, String networkInstanceId, String adUnitId, W7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.e0.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f38963a = recordType;
        this.f38964b = advertiserBundleId;
        this.f38965c = networkInstanceId;
        this.f38966d = adUnitId;
        this.f38967e = adProvider;
        this.f38968f = adInstanceId;
    }

    public final String a() {
        return this.f38968f;
    }

    public final W7 b() {
        return this.f38967e;
    }

    public final String c() {
        return this.f38966d;
    }

    public final String d() {
        return this.f38964b;
    }

    public final String e() {
        return this.f38965c;
    }

    public final EnumC3202ef f() {
        return this.f38963a;
    }

    public final E0 a(Lb<C3468u, E0> mapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
