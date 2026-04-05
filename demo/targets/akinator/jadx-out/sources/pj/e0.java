package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f81434a;

    public e0(c0 c0Var) {
        this.f81434a = c0Var;
    }

    public static e0 create(c0 c0Var) {
        return new e0(c0Var);
    }

    public static nj.p0 providesProgramaticContextualTriggers(c0 c0Var) {
        return (nj.p0) dj.d.checkNotNullFromProvides(c0Var.providesProgramaticContextualTriggers());
    }

    @Override // dj.b, dj.e, ru.a
    public nj.p0 get() {
        return providesProgramaticContextualTriggers(this.f81434a);
    }
}
