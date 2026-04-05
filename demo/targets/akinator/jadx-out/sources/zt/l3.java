package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l3 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98683b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98684c;

    public l3(mt.v vVar, mt.y yVar) {
        this.f98683b = vVar;
        this.f98684c = yVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        pt.c cVar = (pt.c) get();
        if (cVar == tt.d.f87352b || !compareAndSet(cVar, null)) {
            return;
        }
        this.f98684c.subscribe(new k3(this.f98683b, this));
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98683b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98683b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98683b.onSuccess(obj);
    }
}
