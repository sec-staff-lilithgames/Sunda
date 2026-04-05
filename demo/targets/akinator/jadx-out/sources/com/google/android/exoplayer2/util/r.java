package com.google.android.exoplayer2.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f28549a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28550b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28551c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28552d;

    public r(int i10, int i11, float f10, long j10) {
        a.checkArgument(i10 > 0, "width must be positive, but is: " + i10);
        a.checkArgument(i11 > 0, "height must be positive, but is: " + i11);
        this.f28549a = i10;
        this.f28550b = i11;
        this.f28551c = f10;
        this.f28552d = j10;
    }
}
