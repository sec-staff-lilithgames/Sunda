package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q3 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final r3 f98737b;

    public q3(r3 r3Var) {
        this.f98737b = r3Var;
    }

    @Override // mt.v
    public void onComplete() {
        r3 r3Var = this.f98737b;
        r3Var.getClass();
        if (tt.d.dispose(r3Var)) {
            r3Var.f98758b.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        r3 r3Var = this.f98737b;
        r3Var.getClass();
        if (tt.d.dispose(r3Var)) {
            r3Var.f98758b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        r3 r3Var = this.f98737b;
        r3Var.getClass();
        if (tt.d.dispose(r3Var)) {
            r3Var.f98758b.onComplete();
        }
    }
}
