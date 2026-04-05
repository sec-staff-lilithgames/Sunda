package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class mf extends w6 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf f76482e;

    public mf(nf nfVar) {
        this.f76482e = nfVar;
    }

    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f76482e.contains(obj);
    }

    @Override // nh.w6
    public final Object get(int i10) {
        return this.f76482e.f76508g.c(i10);
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f76482e.f76508g.f76606c;
    }
}
