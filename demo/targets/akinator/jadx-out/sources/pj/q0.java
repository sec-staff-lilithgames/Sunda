package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f81464a;

    public q0(p0 p0Var) {
        this.f81464a = p0Var;
    }

    public static q0 create(p0 p0Var) {
        return new q0(p0Var);
    }

    public static qj.a providesSystemClockModule(p0 p0Var) {
        return (qj.a) dj.d.checkNotNullFromProvides(p0Var.providesSystemClockModule());
    }

    @Override // dj.b, dj.e, ru.a
    public qj.a get() {
        return providesSystemClockModule(this.f81464a);
    }
}
