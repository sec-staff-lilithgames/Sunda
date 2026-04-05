package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class wa extends a {

    /* renamed from: c, reason: collision with root package name */
    public final int f11182c;

    public wa(mt.g0 g0Var, int i10) {
        super(g0Var);
        this.f11182c = i10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new va(i0Var, this.f11182c));
    }
}
