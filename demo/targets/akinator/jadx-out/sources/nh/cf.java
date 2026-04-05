package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class cf extends p4 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df f76158e;

    public cf(df dfVar) {
        this.f76158e = dfVar;
    }

    @Override // java.util.List
    public Comparable get(int i10) {
        mh.p1.checkElementIndex(i10, size());
        df dfVar = this.f76158e;
        return dfVar.f76576g.a(dfVar.first(), i10);
    }
}
