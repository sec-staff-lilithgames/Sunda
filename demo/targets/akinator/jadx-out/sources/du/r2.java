package du;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r2 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52835c;

    public r2(mt.t0 t0Var) {
        this.f52835c = t0Var;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        this.f52835c.subscribe(new q2(cVar));
    }
}
