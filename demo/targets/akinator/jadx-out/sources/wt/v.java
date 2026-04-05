package wt;

import java.util.concurrent.atomic.AtomicReference;
import mt.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f91290b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f91291c;

    public v(AtomicReference<pt.c> atomicReference, q0 q0Var) {
        this.f91290b = atomicReference;
        this.f91291c = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f91291c.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this.f91290b, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f91291c.onSuccess(obj);
    }
}
