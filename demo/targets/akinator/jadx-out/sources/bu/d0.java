package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f10192b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10193c;

    public d0(c0 c0Var, long j10) {
        this.f10192b = c0Var;
        this.f10193c = j10;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj != dVar) {
            lazySet(dVar);
            this.f10192b.a(this, this.f10193c);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        Object obj = get();
        tt.d dVar = tt.d.f87352b;
        if (obj == dVar) {
            mu.a.onError(th2);
            return;
        }
        lazySet(dVar);
        c0 c0Var = this.f10192b;
        tt.d.dispose(c0Var.f10143h);
        c0Var.f10142g.delete(this);
        c0Var.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        pt.c cVar = (pt.c) get();
        tt.d dVar = tt.d.f87352b;
        if (cVar != dVar) {
            lazySet(dVar);
            cVar.dispose();
            this.f10192b.a(this, this.f10193c);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
