package pn;

import nh.b5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f81493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81495c;

    /* renamed from: d, reason: collision with root package name */
    public final int f81496d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81497e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81498f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81499g;

    /* renamed from: h, reason: collision with root package name */
    public final b5 f81500h;

    public e(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15, b5 b5Var) {
        this.f81494b = i10;
        this.f81493a = iArr;
        this.f81495c = i11;
        this.f81497e = i12;
        this.f81498f = i13;
        this.f81499g = i14;
        this.f81496d = i15;
        this.f81500h = b5Var;
    }

    public static e embeddedClosedCaptionTrack(int[] iArr, int i10, b5 b5Var) {
        return new e(3, 1, iArr, i10, -1, -1, -1, b5Var);
    }

    public static e embeddedEmsgTrack(int[] iArr, int i10) {
        return new e(5, 1, iArr, i10, -1, -1, -1, b5.of());
    }

    public static e mpdEventTrack(int i10) {
        return new e(5, 2, new int[0], -1, -1, -1, i10, b5.of());
    }

    public static e primaryTrack(int i10, int[] iArr, int i11, int i12, int i13) {
        return new e(i10, 0, iArr, i11, i12, i13, -1, b5.of());
    }
}
