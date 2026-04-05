package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w2 extends AtomicReference implements mt.v, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98813b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f98814c;

    /* renamed from: e, reason: collision with root package name */
    public Object f98815e;

    /* renamed from: f, reason: collision with root package name */
    public Throwable f98816f;

    public w2(mt.v vVar, mt.m0 m0Var) {
        this.f98813b = vVar;
        this.f98814c = m0Var;
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
        tt.d.replace(this, this.f98814c.scheduleDirect(this));
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98816f = th2;
        tt.d.replace(this, this.f98814c.scheduleDirect(this));
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98813b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98815e = obj;
        tt.d.replace(this, this.f98814c.scheduleDirect(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2 = this.f98816f;
        mt.v vVar = this.f98813b;
        if (th2 != null) {
            this.f98816f = null;
            vVar.onError(th2);
            return;
        }
        Object obj = this.f98815e;
        if (obj == null) {
            vVar.onComplete();
        } else {
            this.f98815e = null;
            vVar.onSuccess(obj);
        }
    }
}
