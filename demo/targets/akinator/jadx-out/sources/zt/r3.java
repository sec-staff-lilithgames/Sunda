package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r3 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98758b;

    /* renamed from: c, reason: collision with root package name */
    public final q3 f98759c = new q3(this);

    public r3(mt.v vVar) {
        this.f98758b = vVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        tt.d.dispose(this.f98759c);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        tt.d.dispose(this.f98759c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98758b.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        tt.d.dispose(this.f98759c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98758b.onError(th2);
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
        tt.d.dispose(this.f98759c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98758b.onSuccess(obj);
        }
    }
}
