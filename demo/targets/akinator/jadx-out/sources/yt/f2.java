package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f2 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.o f95465c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.b f95466e;

    public f2(mt.o oVar, mt.b bVar) {
        this.f95465c = oVar;
        this.f95466e = bVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        int iOrdinal = this.f95466e.ordinal();
        y1 z1Var = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 3 ? iOrdinal != 4 ? new z1(cVar, mt.l.bufferSize()) : new b2(cVar) : new a2(cVar, 0) : new a2(cVar, 1) : new c2(cVar);
        cVar.onSubscribe(z1Var);
        try {
            this.f95465c.subscribe(z1Var);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            z1Var.onError(th2);
        }
    }
}
