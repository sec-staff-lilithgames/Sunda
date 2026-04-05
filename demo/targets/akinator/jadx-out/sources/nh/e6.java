package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e6 extends b5 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f76206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze f76207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j6 f76208h;

    public e6(j6 j6Var, int i10, int i11, ze zeVar) {
        this.f76205e = i10;
        this.f76206f = i11;
        this.f76207g = zeVar;
        this.f76208h = j6Var;
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f76205e;
    }

    @Override // java.util.List
    public ze get(int i10) {
        int i11 = this.f76205e;
        mh.p1.checkElementIndex(i10, i11);
        int i12 = this.f76206f;
        j6 j6Var = this.f76208h;
        return (i10 == 0 || i10 == i11 + (-1)) ? ((ze) j6Var.f76388b.get(i10 + i12)).intersection(this.f76207g) : (ze) j6Var.f76388b.get(i10 + i12);
    }
}
