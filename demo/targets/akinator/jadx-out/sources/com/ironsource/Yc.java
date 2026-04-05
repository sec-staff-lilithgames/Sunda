package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Yc {

    /* renamed from: a, reason: collision with root package name */
    private final long f35814a;

    /* renamed from: b, reason: collision with root package name */
    private final P3 f35815b;

    public Yc(long j10, P3 unit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        this.f35814a = j10;
        this.f35815b = unit;
    }

    public final long a() {
        return this.f35814a;
    }

    public final P3 b() {
        return this.f35815b;
    }

    public String toString() {
        return "PacingCappingConfig(timeInterval=" + this.f35814a + " unit=" + this.f35815b + ")";
    }

    public /* synthetic */ Yc(long j10, P3 p32, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, (i10 & 2) != 0 ? P3.Second : p32);
    }
}
