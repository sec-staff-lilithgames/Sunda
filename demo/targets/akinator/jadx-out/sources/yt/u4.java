package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u4 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f96398c;

    public u4(Object[] objArr) {
        this.f96398c = objArr;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        boolean z10 = cVar instanceof vt.a;
        Object[] objArr = this.f96398c;
        if (z10) {
            cVar.onSubscribe(new s4((vt.a) cVar, objArr, 0));
        } else {
            cVar.onSubscribe(new s4(cVar, objArr, 1));
        }
    }
}
