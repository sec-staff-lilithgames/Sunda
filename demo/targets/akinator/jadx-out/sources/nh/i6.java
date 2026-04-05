package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i6 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final b5 f76350e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f76351f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f76352g;

    /* renamed from: h, reason: collision with root package name */
    public final int f76353h;

    public i6(b5 b5Var) {
        this.f76350e = b5Var;
        boolean zHasLowerBound = ((ze) b5Var.get(0)).hasLowerBound();
        this.f76351f = zHasLowerBound;
        boolean zHasUpperBound = ((ze) i7.getLast(b5Var)).hasUpperBound();
        this.f76352g = zHasUpperBound;
        int size = b5Var.size();
        size = zHasLowerBound ? size : size - 1;
        this.f76353h = zHasUpperBound ? size + 1 : size;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76353h;
    }

    @Override // java.util.List
    public ze get(int i10) {
        int i11 = this.f76353h;
        mh.p1.checkElementIndex(i10, i11);
        b5 b5Var = this.f76350e;
        boolean z10 = this.f76351f;
        return new ze(z10 ? i10 == 0 ? t2.f76651c : ((ze) b5Var.get(i10 - 1)).f76828c : ((ze) b5Var.get(i10)).f76828c, (this.f76352g && i10 == i11 + (-1)) ? r2.f76594c : ((ze) b5Var.get(i10 + (!z10 ? 1 : 0))).f76827b);
    }
}
