package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93451b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f93452c;

    public k1(mt.i iVar, st.o oVar) {
        this.f93451b = iVar;
        this.f93452c = oVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        j1 j1Var = new j1(fVar, this.f93452c);
        fVar.onSubscribe(j1Var);
        this.f93451b.subscribe(j1Var);
    }
}
