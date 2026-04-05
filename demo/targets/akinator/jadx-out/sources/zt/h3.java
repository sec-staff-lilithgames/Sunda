package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h3 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final tt.h f98631b = new tt.h();

    /* renamed from: c, reason: collision with root package name */
    public final mt.v f98632c;

    public h3(mt.v vVar) {
        this.f98632c = vVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        this.f98631b.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98632c.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98632c.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98632c.onSuccess(obj);
    }
}
