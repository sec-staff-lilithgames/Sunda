package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f93494b;

    public s0(t0 t0Var) {
        this.f93494b = t0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        t0 t0Var = this.f93494b;
        mt.f fVar = t0Var.f93500b;
        t0Var.f93504g.delete(this);
        if (t0Var.decrementAndGet() != 0) {
            if (t0Var.f93501c != Integer.MAX_VALUE) {
                t0Var.f93505h.request(1L);
            }
        } else {
            Throwable th2 = (Throwable) t0Var.f93503f.get();
            if (th2 != null) {
                fVar.onError(th2);
            } else {
                fVar.onComplete();
            }
        }
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        t0 t0Var = this.f93494b;
        mt.f fVar = t0Var.f93500b;
        iu.d dVar = t0Var.f93503f;
        pt.b bVar = t0Var.f93504g;
        bVar.delete(this);
        if (!t0Var.f93502e) {
            t0Var.f93505h.cancel();
            bVar.dispose();
            if (!dVar.addThrowable(th2)) {
                mu.a.onError(th2);
                return;
            } else {
                if (t0Var.getAndSet(0) > 0) {
                    fVar.onError(dVar.terminate());
                    return;
                }
                return;
            }
        }
        if (!dVar.addThrowable(th2)) {
            mu.a.onError(th2);
        } else if (t0Var.decrementAndGet() == 0) {
            fVar.onError(dVar.terminate());
        } else if (t0Var.f93501c != Integer.MAX_VALUE) {
            t0Var.f93505h.request(1L);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
