package io.bidmachine.media3.common.util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f60786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f60788c;

    /* renamed from: d, reason: collision with root package name */
    public final int f60789d;

    public r(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public r(int i10, int i11, int i12, int i13) {
        a.checkArgument(i10 <= i12 && i11 <= i13);
        this.f60786a = i10;
        this.f60787b = i11;
        this.f60788c = i12;
        this.f60789d = i13;
    }
}
