package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t3 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final u3 f98779b;

    public t3(u3 u3Var) {
        this.f98779b = u3Var;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        u3 u3Var = this.f98779b;
        u3Var.getClass();
        if (tt.d.dispose(u3Var)) {
            u3Var.f98792b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        u3 u3Var = this.f98779b;
        u3Var.getClass();
        if (tt.d.dispose(u3Var)) {
            u3Var.f98792b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        hu.g.cancel(this);
        u3 u3Var = this.f98779b;
        u3Var.getClass();
        if (tt.d.dispose(u3Var)) {
            u3Var.f98792b.onComplete();
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }
}
