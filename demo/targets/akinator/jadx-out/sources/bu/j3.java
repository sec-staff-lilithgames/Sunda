package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j3 extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final long f10450b;

    /* renamed from: c, reason: collision with root package name */
    public final k3 f10451c;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10452e;

    /* renamed from: f, reason: collision with root package name */
    public volatile vt.o f10453f;

    /* renamed from: g, reason: collision with root package name */
    public int f10454g;

    public j3(k3 k3Var, long j10) {
        this.f10450b = j10;
        this.f10451c = k3Var;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10452e = true;
        this.f10451c.c();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (!this.f10451c.f10507j.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        k3 k3Var = this.f10451c;
        if (!k3Var.f10502e) {
            k3Var.b();
        }
        this.f10452e = true;
        this.f10451c.c();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10454g != 0) {
            this.f10451c.c();
            return;
        }
        k3 k3Var = this.f10451c;
        if (k3Var.get() == 0 && k3Var.compareAndSet(0, 1)) {
            k3Var.f10500b.onNext(obj);
            if (k3Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            vt.o dVar = this.f10453f;
            if (dVar == null) {
                dVar = new eu.d(k3Var.f10504g);
                this.f10453f = dVar;
            }
            dVar.offer(obj);
            if (k3Var.getAndIncrement() != 0) {
                return;
            }
        }
        k3Var.d();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar) && (cVar instanceof vt.j)) {
            vt.j jVar = (vt.j) cVar;
            int iRequestFusion = jVar.requestFusion(7);
            if (iRequestFusion == 1) {
                this.f10454g = iRequestFusion;
                this.f10453f = jVar;
                this.f10452e = true;
                this.f10451c.c();
                return;
            }
            if (iRequestFusion == 2) {
                this.f10454g = iRequestFusion;
                this.f10453f = jVar;
            }
        }
    }
}
