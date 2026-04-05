package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93399b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f93400c;

    public e1(mt.i iVar, mt.m0 m0Var) {
        this.f93399b = iVar;
        this.f93400c = m0Var;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93399b.subscribe(new d1(fVar, this.f93400c));
    }
}
