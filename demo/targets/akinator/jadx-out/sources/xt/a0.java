package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93366b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f93367c;

    public a0(mt.i iVar, st.g gVar) {
        this.f93366b = iVar;
        this.f93367c = gVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93366b.subscribe(new z(this, fVar));
    }
}
