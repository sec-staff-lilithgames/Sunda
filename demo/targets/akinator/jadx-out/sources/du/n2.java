package du;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52797b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52798c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f52799e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f52800f;

    /* renamed from: g, reason: collision with root package name */
    public final mt.t0 f52801g;

    public n2(mt.t0 t0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, mt.t0 t0Var2) {
        this.f52797b = t0Var;
        this.f52798c = j10;
        this.f52799e = timeUnit;
        this.f52800f = m0Var;
        this.f52801g = t0Var2;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        m2 m2Var = new m2(q0Var, this.f52801g, this.f52798c, this.f52799e);
        q0Var.onSubscribe(m2Var);
        tt.d.replace(m2Var.f52787c, this.f52800f.scheduleDirect(m2Var, this.f52798c, this.f52799e));
        this.f52797b.subscribe(m2Var);
    }
}
