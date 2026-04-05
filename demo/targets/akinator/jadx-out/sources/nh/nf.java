package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class nf extends d6 {

    /* renamed from: j, reason: collision with root package name */
    public static final nf f76507j = new nf(new re());

    /* renamed from: g, reason: collision with root package name */
    public final transient re f76508g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f76509h;

    /* renamed from: i, reason: collision with root package name */
    public transient mf f76510i;

    public nf(re reVar) {
        this.f76508g = reVar;
        long jD = 0;
        for (int i10 = 0; i10 < reVar.f76606c; i10++) {
            jD += reVar.d(i10);
        }
        this.f76509h = rh.w.saturatedCast(jD);
    }

    @Override // nh.d6, nh.ud
    public int count(Object obj) {
        return this.f76508g.get(obj);
    }

    @Override // nh.d6
    public final td h(int i10) {
        re reVar = this.f76508g;
        mh.p1.checkElementIndex(i10, reVar.f76606c);
        return new qe(reVar, i10);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, nh.ud
    public int size() {
        return this.f76509h;
    }

    @Override // nh.d6, nh.ud
    public l6 elementSet() {
        mf mfVar = this.f76510i;
        if (mfVar != null) {
            return mfVar;
        }
        mf mfVar2 = new mf(this);
        this.f76510i = mfVar2;
        return mfVar2;
    }
}
