package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l2 extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52776b;

    public l2(mt.q0 q0Var) {
        this.f52776b = q0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52776b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52776b.onSuccess(obj);
    }
}
