package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93413b;

    /* renamed from: c, reason: collision with root package name */
    public final st.q f93414c;

    public g1(mt.i iVar, st.q qVar) {
        this.f93413b = iVar;
        this.f93414c = qVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93413b.subscribe(new f1(this, fVar));
    }
}
