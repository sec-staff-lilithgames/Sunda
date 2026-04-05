package xt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends AtomicReference implements mt.f, Runnable, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93478b;

    /* renamed from: c, reason: collision with root package name */
    public final long f93479c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f93480e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f93481f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f93482g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f93483h;

    public r(mt.f fVar, long j10, TimeUnit timeUnit, mt.m0 m0Var, boolean z10) {
        this.f93478b = fVar;
        this.f93479c = j10;
        this.f93480e = timeUnit;
        this.f93481f = m0Var;
        this.f93482g = z10;
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
        tt.d.replace(this, this.f93481f.scheduleDirect(this, this.f93479c, this.f93480e));
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93483h = th2;
        tt.d.replace(this, this.f93481f.scheduleDirect(this, this.f93482g ? this.f93479c : 0L, this.f93480e));
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f93478b.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2 = this.f93483h;
        this.f93483h = null;
        mt.f fVar = this.f93478b;
        if (th2 != null) {
            fVar.onError(th2);
        } else {
            fVar.onComplete();
        }
    }
}
