package zt;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b4 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98547b;

    /* renamed from: c, reason: collision with root package name */
    public final c4 f98548c = new c4(this);

    /* renamed from: e, reason: collision with root package name */
    public final mt.y f98549e;

    /* renamed from: f, reason: collision with root package name */
    public final a4 f98550f;

    public b4(mt.v vVar, mt.y yVar) {
        this.f98547b = vVar;
        this.f98549e = yVar;
        this.f98550f = yVar != null ? new a4(vVar) : null;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        hu.g.cancel(this.f98548c);
        a4 a4Var = this.f98550f;
        if (a4Var != null) {
            tt.d.dispose(a4Var);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        hu.g.cancel(this.f98548c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98547b.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        hu.g.cancel(this.f98548c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98547b.onError(th2);
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
        hu.g.cancel(this.f98548c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98547b.onSuccess(obj);
        }
    }

    public void otherComplete() {
        if (tt.d.dispose(this)) {
            mt.y yVar = this.f98549e;
            if (yVar != null) {
                yVar.subscribe(this.f98550f);
            } else {
                this.f98547b.onError(new TimeoutException());
            }
        }
    }

    public void otherError(Throwable th2) {
        if (tt.d.dispose(this)) {
            this.f98547b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }
}
