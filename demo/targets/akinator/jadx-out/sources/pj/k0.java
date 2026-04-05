package pj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k0 implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f81451a;

    public k0(j0 j0Var) {
        this.f81451a = j0Var;
    }

    public static k0 create(j0 j0Var) {
        return new k0(j0Var);
    }

    public static rj.v providesAppForegroundRateLimit(j0 j0Var) {
        return (rj.v) dj.d.checkNotNullFromProvides(j0Var.providesAppForegroundRateLimit());
    }

    @Override // dj.b, dj.e, ru.a
    public rj.v get() {
        return providesAppForegroundRateLimit(this.f81451a);
    }
}
