package zt;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends AtomicReference implements mt.v, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98771b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98772c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f98773e;

    /* renamed from: f, reason: collision with root package name */
    public final mt.m0 f98774f;

    /* renamed from: g, reason: collision with root package name */
    public Object f98775g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f98776h;

    public t(mt.v vVar, long j10, TimeUnit timeUnit, mt.m0 m0Var) {
        this.f98771b = vVar;
        this.f98772c = j10;
        this.f98773e = timeUnit;
        this.f98774f = m0Var;
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
        tt.d.replace(this, this.f98774f.scheduleDirect(this, this.f98772c, this.f98773e));
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98776h = th2;
        tt.d.replace(this, this.f98774f.scheduleDirect(this, this.f98772c, this.f98773e));
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98771b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98775g = obj;
        tt.d.replace(this, this.f98774f.scheduleDirect(this, this.f98772c, this.f98773e));
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable th2 = this.f98776h;
        mt.v vVar = this.f98771b;
        if (th2 != null) {
            vVar.onError(th2);
            return;
        }
        Object obj = this.f98775g;
        if (obj != null) {
            vVar.onSuccess(obj);
        } else {
            vVar.onComplete();
        }
    }
}
