package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.c f93474b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f93475c;

    public p1(mt.c cVar, mt.i iVar) {
        this.f93474b = cVar;
        this.f93475c = iVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        o1 o1Var = new o1(fVar);
        fVar.onSubscribe(o1Var);
        this.f93475c.subscribe(o1Var.f93471c);
        this.f93474b.subscribe(o1Var);
    }
}
