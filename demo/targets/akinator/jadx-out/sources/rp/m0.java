package rp;

import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f84773a;

    /* renamed from: b, reason: collision with root package name */
    public final int f84774b;

    /* renamed from: c, reason: collision with root package name */
    public final int f84775c;

    /* renamed from: d, reason: collision with root package name */
    public int f84776d;

    /* renamed from: e, reason: collision with root package name */
    public String f84777e;

    public m0(int i10, int i11) {
        this(Integer.MIN_VALUE, i10, i11);
    }

    public void generateNewId() {
        int i10 = this.f84776d;
        this.f84776d = i10 == Integer.MIN_VALUE ? this.f84774b : i10 + this.f84775c;
        this.f84777e = this.f84773a + this.f84776d;
    }

    public String getFormatId() {
        if (this.f84776d != Integer.MIN_VALUE) {
            return this.f84777e;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public int getTrackId() {
        int i10 = this.f84776d;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    public m0(int i10, int i11, int i12) {
        this.f84773a = i10 != Integer.MIN_VALUE ? o2.j(i10, "/") : "";
        this.f84774b = i11;
        this.f84775c = i12;
        this.f84776d = Integer.MIN_VALUE;
        this.f84777e = "";
    }
}
