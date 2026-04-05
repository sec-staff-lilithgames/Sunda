package du;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m2 extends AtomicReference implements mt.q0, Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52786b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f52787c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final l2 f52788e;

    /* renamed from: f, reason: collision with root package name */
    public mt.t0 f52789f;

    /* renamed from: g, reason: collision with root package name */
    public final long f52790g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeUnit f52791h;

    public m2(mt.q0 q0Var, mt.t0 t0Var, long j10, TimeUnit timeUnit) {
        this.f52786b = q0Var;
        this.f52789f = t0Var;
        this.f52790g = j10;
        this.f52791h = timeUnit;
        if (t0Var != null) {
            this.f52788e = new l2(q0Var);
        } else {
            this.f52788e = null;
        }
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        tt.d.dispose(this.f52787c);
        l2 l2Var = this.f52788e;
        if (l2Var != null) {
            tt.d.dispose(l2Var);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        pt.c cVar = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar || !compareAndSet(cVar, dVar)) {
            mu.a.onError(th2);
        } else {
            tt.d.dispose(this.f52787c);
            this.f52786b.onError(th2);
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        pt.c cVar = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar || !compareAndSet(cVar, dVar)) {
            return;
        }
        tt.d.dispose(this.f52787c);
        this.f52786b.onSuccess(obj);
    }

    @Override // java.lang.Runnable
    public void run() {
        pt.c cVar = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar || !compareAndSet(cVar, dVar)) {
            return;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        mt.t0 t0Var = this.f52789f;
        if (t0Var == null) {
            this.f52786b.onError(new TimeoutException(iu.m.timeoutMessage(this.f52790g, this.f52791h)));
        } else {
            this.f52789f = null;
            t0Var.subscribe(this.f52788e);
        }
    }
}
