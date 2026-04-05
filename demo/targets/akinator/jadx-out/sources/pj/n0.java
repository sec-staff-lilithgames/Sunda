package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f81456a;

    public n0(l0 l0Var) {
        this.f81456a = l0Var;
    }

    public static n0 create(l0 l0Var) {
        return new n0(l0Var);
    }

    public static mt.m0 providesIOScheduler(l0 l0Var) {
        return (mt.m0) dj.d.checkNotNullFromProvides(l0Var.providesIOScheduler());
    }

    @Override // dj.b, dj.e, ru.a
    public mt.m0 get() {
        return providesIOScheduler(this.f81456a);
    }
}
