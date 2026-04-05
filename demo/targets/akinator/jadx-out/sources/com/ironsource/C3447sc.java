package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.sc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3447sc {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3202ef f38376a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38377b;

    /* renamed from: c, reason: collision with root package name */
    private final W7 f38378c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38379d;

    public C3447sc(EnumC3202ef recordType, String advertiserBundleId, W7 adProvider, String adInstanceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(recordType, "recordType");
        kotlin.jvm.internal.e0.checkNotNullParameter(advertiserBundleId, "advertiserBundleId");
        kotlin.jvm.internal.e0.checkNotNullParameter(adProvider, "adProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.f38376a = recordType;
        this.f38377b = advertiserBundleId;
        this.f38378c = adProvider;
        this.f38379d = adInstanceId;
    }

    public final String a() {
        return this.f38379d;
    }

    public final W7 b() {
        return this.f38378c;
    }

    public final String c() {
        return this.f38377b;
    }

    public final EnumC3202ef d() {
        return this.f38376a;
    }

    public final C3206f1 a(Lb<C3447sc, C3206f1> mapper) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapper, "mapper");
        return mapper.a(this);
    }
}
