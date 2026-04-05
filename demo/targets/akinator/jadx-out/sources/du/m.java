package du;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52777b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52778c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f52779e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f52780f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f52781g;

    public m(mt.t0 t0Var, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        this.f52777b = t0Var;
        this.f52778c = j10;
        this.f52779e = timeUnit;
        this.f52780f = m0Var;
        this.f52781g = z10;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        tt.h hVar = new tt.h();
        q0Var.onSubscribe(hVar);
        this.f52777b.subscribe(new l(this, hVar, q0Var));
    }
}
