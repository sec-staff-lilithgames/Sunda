package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3202ef f34234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34235b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34236c;

    /* renamed from: d, reason: collision with root package name */
    private final W7 f34237d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34238e;

    public E0(EnumC3202ef recordType, String advertiserBundleId, String networkInstanceId, W7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.e0.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.e0.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f34234a = recordType;
        this.f34235b = advertiserBundleId;
        this.f34236c = networkInstanceId;
        this.f34237d = adProvider;
        this.f34238e = adInstanceId;
    }

    public final String a() {
        return this.f34238e;
    }

    public final W7 b() {
        return this.f34237d;
    }

    public final String c() {
        return this.f34235b;
    }

    public final String d() {
        return this.f34236c;
    }

    public final EnumC3202ef e() {
        return this.f34234a;
    }

    public final C3447sc a(Lb<E0, C3447sc> mapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
