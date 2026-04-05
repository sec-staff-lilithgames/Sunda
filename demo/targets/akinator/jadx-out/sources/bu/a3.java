package bu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a3 extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10065c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10066e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10067f;

    public a3(mt.g0 g0Var, long j10, Object obj, boolean z10) {
        super(g0Var);
        this.f10065c = j10;
        this.f10066e = obj;
        this.f10067f = z10;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        this.f10053b.subscribe(new z2(i0Var, this.f10065c, this.f10066e, this.f10067f));
    }
}
