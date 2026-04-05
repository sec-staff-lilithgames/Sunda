package zt;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x3 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98826b;

    /* renamed from: c, reason: collision with root package name */
    public final y3 f98827c = new y3(this);

    /* renamed from: e, reason: collision with root package name */
    public final mt.y f98828e;

    /* renamed from: f, reason: collision with root package name */
    public final w3 f98829f;

    public x3(mt.v vVar, mt.y yVar) {
        this.f98826b = vVar;
        this.f98828e = yVar;
        this.f98829f = yVar != null ? new w3(vVar) : null;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        tt.d.dispose(this.f98827c);
        w3 w3Var = this.f98829f;
        if (w3Var != null) {
            tt.d.dispose(w3Var);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        tt.d.dispose(this.f98827c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98826b.onComplete();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        tt.d.dispose(this.f98827c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98826b.onError(th2);
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
        tt.d.dispose(this.f98827c);
        tt.d dVar = tt.d.f87352b;
        if (getAndSet(dVar) != dVar) {
            this.f98826b.onSuccess(obj);
        }
    }

    public void otherComplete() {
        if (tt.d.dispose(this)) {
            mt.y yVar = this.f98828e;
            if (yVar != null) {
                yVar.subscribe(this.f98829f);
            } else {
                this.f98826b.onError(new TimeoutException());
            }
        }
    }

    public void otherError(Throwable th2) {
        if (tt.d.dispose(this)) {
            this.f98826b.onError(th2);
        } else {
            mu.a.onError(th2);
        }
    }
}
