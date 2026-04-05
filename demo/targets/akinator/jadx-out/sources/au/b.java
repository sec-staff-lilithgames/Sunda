package au;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f8011b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.g0 f8012c;

    public b(mt.i iVar, mt.g0 g0Var) {
        this.f8011b = iVar;
        this.f8012c = g0Var;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        a aVar = new a(this.f8012c, i0Var);
        i0Var.onSubscribe(aVar);
        this.f8011b.subscribe(aVar);
    }
}
