package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93462b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f93463c;

    public m1(mt.i iVar, mt.m0 m0Var) {
        this.f93462b = iVar;
        this.f93463c = m0Var;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        l1 l1Var = new l1(fVar, this.f93462b);
        fVar.onSubscribe(l1Var);
        l1Var.f93456c.replace(this.f93463c.scheduleDirect(l1Var));
    }
}
