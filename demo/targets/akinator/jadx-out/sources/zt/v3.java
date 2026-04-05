package zt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final tw.b f98803c;

    public v3(mt.y yVar, tw.b bVar) {
        super(yVar);
        this.f98803c = bVar;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        u3 u3Var = new u3(vVar);
        vVar.onSubscribe(u3Var);
        this.f98803c.subscribe(u3Var.f98793c);
        this.f98526b.subscribe(u3Var);
    }
}
