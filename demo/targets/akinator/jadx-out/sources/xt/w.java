package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93526b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f93527c;

    public w(mt.i iVar, mt.m0 m0Var) {
        this.f93526b = iVar;
        this.f93527c = m0Var;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93526b.subscribe(new v(fVar, this.f93527c));
    }
}
