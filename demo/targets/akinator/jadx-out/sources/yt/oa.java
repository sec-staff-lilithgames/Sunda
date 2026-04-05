package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class oa extends a {

    /* renamed from: e, reason: collision with root package name */
    public final st.o f96082e;

    public oa(mt.l lVar, st.o oVar) {
        super(lVar);
        this.f96082e = oVar;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        qu.d dVar = new qu.d(cVar);
        nu.a serialized = nu.d.create(8).toSerialized();
        try {
            tw.b bVar = (tw.b) ut.o0.requireNonNull(this.f96082e.apply(serialized), "handler returned a null Publisher");
            q9 q9Var = new q9(this.f95121c);
            na naVar = new na(dVar, serialized, q9Var);
            q9Var.f96198f = naVar;
            cVar.onSubscribe(naVar);
            bVar.subscribe(q9Var);
            q9Var.onNext(0);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
