package yt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u2 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f96393c;

    /* renamed from: e, reason: collision with root package name */
    public final tw.b f96394e;

    public u2(tw.b bVar, tw.b bVar2) {
        this.f96393c = bVar;
        this.f96394e = bVar2;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        t2 t2Var = new t2(this.f96393c, cVar);
        cVar.onSubscribe(t2Var);
        this.f96394e.subscribe(t2Var.f96348e);
    }
}
