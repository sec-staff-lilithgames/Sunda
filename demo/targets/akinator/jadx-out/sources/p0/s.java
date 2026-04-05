package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final z.f1 f80444b;

    /* renamed from: c, reason: collision with root package name */
    public final z.f1 f80445c;

    /* renamed from: e, reason: collision with root package name */
    public final z.o f80446e;

    /* renamed from: f, reason: collision with root package name */
    public final int f80447f;

    public s(z.f1 f1Var, z.f1 f1Var2, z.o oVar, int i10, Throwable th2) {
        super(th2);
        this.f80444b = f1Var;
        this.f80445c = f1Var2;
        this.f80446e = oVar;
        this.f80447f = i10;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return sv.d0.trimMargin$default(j1.o2.o(new StringBuilder("\n            |Exception while applying pausable composition. Last 10 operations:\n            |"), uu.y0.joinToString$default(uu.y0.takeLast(rv.f0.toList(rv.w.sequence(new r(this, null))), 10), "\n", null, null, 0, null, null, 62, null), "\n            "), null, 1, null);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
