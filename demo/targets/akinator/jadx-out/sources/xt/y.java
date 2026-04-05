package xt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93539b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f93540c;

    public y(mt.i iVar, st.a aVar) {
        this.f93539b = iVar;
        this.f93540c = aVar;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        this.f93539b.subscribe(new x(fVar, this.f93540c));
    }
}
