package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f81459a;

    public o0(l0 l0Var) {
        this.f81459a = l0Var;
    }

    public static o0 create(l0 l0Var) {
        return new o0(l0Var);
    }

    public static mt.m0 providesMainThreadScheduler(l0 l0Var) {
        return (mt.m0) dj.d.checkNotNullFromProvides(l0Var.providesMainThreadScheduler());
    }

    @Override // dj.b, dj.e, ru.a
    public mt.m0 get() {
        return providesMainThreadScheduler(this.f81459a);
    }
}
