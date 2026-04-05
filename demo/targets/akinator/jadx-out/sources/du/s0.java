package du;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.t0 f52838b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.t0 f52839c;

    public s0(mt.t0 t0Var, mt.t0 t0Var2) {
        this.f52838b = t0Var;
        this.f52839c = t0Var2;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        AtomicInteger atomicInteger = new AtomicInteger();
        Object[] objArr = {null, null};
        pt.b bVar = new pt.b();
        q0Var.onSubscribe(bVar);
        this.f52838b.subscribe(new r0(0, bVar, objArr, q0Var, atomicInteger));
        this.f52839c.subscribe(new r0(1, bVar, objArr, q0Var, atomicInteger));
    }
}
