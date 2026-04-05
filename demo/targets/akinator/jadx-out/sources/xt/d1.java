package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d1 extends AtomicReference implements mt.f, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93393b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.m0 f93394c;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f93395e;

    public d1(mt.f fVar, mt.m0 m0Var) {
        this.f93393b = fVar;
        this.f93394c = m0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        tt.d.replace(this, this.f93394c.scheduleDirect(this));
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93395e = th2;
        tt.d.replace(this, this.f93394c.scheduleDirect(this));
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f93393b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2 = this.f93395e;
        mt.f fVar = this.f93393b;
        if (th2 == null) {
            fVar.onComplete();
        } else {
            this.f93395e = null;
            fVar.onError(th2);
        }
    }
}
