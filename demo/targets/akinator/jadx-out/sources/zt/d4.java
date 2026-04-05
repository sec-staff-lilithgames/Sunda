package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d4 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f98575c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.y f98576e;

    public d4(mt.y yVar, tw.b bVar, mt.y yVar2) {
        super(yVar);
        this.f98575c = bVar;
        this.f98576e = yVar2;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        b4 b4Var = new b4(vVar, this.f98576e);
        vVar.onSubscribe(b4Var);
        this.f98575c.subscribe(b4Var.f98548c);
        this.f98526b.subscribe(b4Var);
    }
}
