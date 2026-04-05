package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u2 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.y[] f98791c;

    public u2(mt.y[] yVarArr) {
        this.f98791c = yVarArr;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        mt.y[] yVarArr = this.f98791c;
        int length = yVarArr.length;
        r2 r2Var = new r2(cVar, length, length <= mt.l.bufferSize() ? new s2(length) : new q2());
        cVar.onSubscribe(r2Var);
        iu.d dVar = r2Var.f98753g;
        for (mt.y yVar : yVarArr) {
            if (r2Var.f98755i || dVar.get() != null) {
                return;
            }
            yVar.subscribe(r2Var);
        }
    }
}
