package bu;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class yb extends a {

    /* renamed from: c, reason: collision with root package name */
    public final long f11262c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f11263e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f11264f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.g0 f11265g;

    public yb(mt.b0 b0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, mt.g0 g0Var) {
        super(b0Var);
        this.f11262c = j10;
        this.f11263e = timeUnit;
        this.f11264f = m0Var;
        this.f11265g = g0Var;
    }

    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        mt.g0 g0Var = this.f11265g;
        mt.g0 g0Var2 = this.f10053b;
        mt.m0 m0Var = this.f11264f;
        if (g0Var == null) {
            vb vbVar = new vb(i0Var, this.f11262c, this.f11263e, m0Var.createWorker());
            i0Var.onSubscribe(vbVar);
            vbVar.f11134g.replace(vbVar.f11133f.schedule(new xb(0L, vbVar), vbVar.f11131c, vbVar.f11132e));
            g0Var2.subscribe(vbVar);
            return;
        }
        ub ubVar = new ub(i0Var, this.f11262c, this.f11263e, m0Var.createWorker(), this.f11265g);
        i0Var.onSubscribe(ubVar);
        ubVar.f11099g.replace(ubVar.f11098f.schedule(new xb(0L, ubVar), ubVar.f11096c, ubVar.f11097e));
        g0Var2.subscribe(ubVar);
    }
}
