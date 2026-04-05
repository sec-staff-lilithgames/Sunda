package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93511b;

    public u(mt.i iVar) {
        this.f93511b = iVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        t tVar = new t();
        tVar.f93498b = fVar;
        this.f93511b.subscribe(tVar);
    }
}
