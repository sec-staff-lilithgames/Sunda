package oe;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f79107a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79109c;

    /* renamed from: d, reason: collision with root package name */
    public int f79110d;

    /* renamed from: e, reason: collision with root package name */
    public String f79111e;

    public i0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public void generateNewId() {
        int i10 = this.f79110d;
        this.f79110d = i10 == Integer.MIN_VALUE ? this.f79108b : i10 + this.f79109c;
        this.f79111e = this.f79107a + this.f79110d;
    }

    public String getFormatId() {
        if (this.f79110d != Integer.MIN_VALUE) {
            return this.f79111e;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public int getTrackId() {
        int i10 = this.f79110d;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public i0(int i10, int i11, int i12) {
        this.f79107a = i10 != Integer.MIN_VALUE ? o2.j(i10, "/") : "";
        this.f79108b = i11;
        this.f79109c = i12;
        this.f79110d = Integer.MIN_VALUE;
        this.f79111e = "";
    }
}
