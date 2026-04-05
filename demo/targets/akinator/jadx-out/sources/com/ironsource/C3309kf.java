package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.kf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3309kf {

    /* renamed from: a, reason: collision with root package name */
    private final int f37108a;

    /* renamed from: b, reason: collision with root package name */
    private final P3 f37109b;

    public C3309kf(int i10, P3 unit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        this.f37108a = i10;
        this.f37109b = unit;
    }

    public final int a() {
        return this.f37108a;
    }

    public final P3 b() {
        return this.f37109b;
    }

    public String toString() {
        return "ShowCountCappingConfig(maxImpressions=" + this.f37108a + ", unit=" + this.f37109b + ")";
    }
}
