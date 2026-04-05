package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i2 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52750b;

    /* renamed from: c, reason: collision with root package name */
    public final j2 f52751c = new j2(this);

    public i2(mt.q0 q0Var) {
        this.f52750b = q0Var;
    }

    public final void a(Throwable th2) {
        pt.c cVar;
        pt.c cVar2 = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar2 == dVar || (cVar = (pt.c) getAndSet(dVar)) == dVar) {
            mu.a.onError(th2);
            return;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        this.f52750b.onError(th2);
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        this.f52751c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52751c.dispose();
        pt.c cVar = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar == dVar || ((pt.c) getAndSet(dVar)) == dVar) {
            mu.a.onError(th2);
        } else {
            this.f52750b.onError(th2);
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52751c.dispose();
        tt.d dVar = tt.d.f87352b;
        if (((pt.c) getAndSet(dVar)) != dVar) {
            this.f52750b.onSuccess(obj);
        }
    }
}
