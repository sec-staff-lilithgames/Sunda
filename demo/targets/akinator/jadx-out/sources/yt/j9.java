package yt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j9 extends AtomicBoolean implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95739b;

    /* renamed from: c, reason: collision with root package name */
    public final k9 f95740c;

    /* renamed from: e, reason: collision with root package name */
    public final i9 f95741e;

    /* renamed from: f, reason: collision with root package name */
    public tw.d f95742f;

    public j9(tw.c cVar, k9 k9Var, i9 i9Var) {
        this.f95739b = cVar;
        this.f95740c = k9Var;
        this.f95741e = i9Var;
    }

    @Override // tw.d
    public void cancel() {
        this.f95742f.cancel();
        if (compareAndSet(false, true)) {
            k9 k9Var = this.f95740c;
            i9 i9Var = this.f95741e;
            synchronized (k9Var) {
                try {
                    i9 i9Var2 = k9Var.f95819i;
                    if (i9Var2 != null && i9Var2 == i9Var) {
                        long j10 = i9Var.f95680e - 1;
                        i9Var.f95680e = j10;
                        if (j10 == 0 && i9Var.f95681f) {
                            if (k9Var.f95816f == 0) {
                                k9Var.f(i9Var);
                                return;
                            }
                            tt.h hVar = new tt.h();
                            i9Var.f95679c = hVar;
                            hVar.replace(k9Var.f95818h.scheduleDirect(i9Var, k9Var.f95816f, k9Var.f95817g));
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (compareAndSet(false, true)) {
            this.f95740c.e(this.f95741e);
            this.f95739b.onComplete();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (!compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            this.f95740c.e(this.f95741e);
            this.f95739b.onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        this.f95739b.onNext(obj);
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f95742f, dVar)) {
            this.f95742f = dVar;
            this.f95739b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public void request(long j10) {
        this.f95742f.request(j10);
    }
}
