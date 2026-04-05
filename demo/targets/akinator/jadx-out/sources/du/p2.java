package du;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f52816b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f52817c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.m0 f52818e;

    public p2(long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f52816b = j10;
        this.f52817c = timeUnit;
        this.f52818e = m0Var;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        o2 o2Var = new o2(q0Var);
        q0Var.onSubscribe(o2Var);
        tt.d.replace(o2Var, this.f52818e.scheduleDirect(o2Var, this.f52816b, this.f52817c));
    }
}
