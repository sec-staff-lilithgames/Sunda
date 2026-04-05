package cu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final lu.b f51020c;

    /* renamed from: e, reason: collision with root package name */
    public final st.c f51021e;

    public l0(lu.b bVar, st.c cVar) {
        this.f51020c = bVar;
        this.f51021e = cVar;
    }

    @Override // mt.l
    public final void subscribeActual(tw.c cVar) {
        lu.b bVar = this.f51020c;
        j0 j0Var = new j0(cVar, bVar.parallelism(), this.f51021e);
        cVar.onSubscribe(j0Var);
        bVar.subscribe(j0Var.f51007e);
    }
}
