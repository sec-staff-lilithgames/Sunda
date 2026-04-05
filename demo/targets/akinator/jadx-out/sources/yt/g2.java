package yt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g2 extends qu.b {

    /* renamed from: c, reason: collision with root package name */
    public final h2 f95509c;

    /* renamed from: e, reason: collision with root package name */
    public final long f95510e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f95511f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f95512g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f95513h = new AtomicBoolean();

    public g2(h2 h2Var, long j10, Object obj) {
        this.f95509c = h2Var;
        this.f95510e = j10;
        this.f95511f = obj;
    }

    public final void a() {
        if (this.f95513h.compareAndSet(false, true)) {
            h2 h2Var = this.f95509c;
            long j10 = this.f95510e;
            Object obj = this.f95511f;
            if (j10 == h2Var.f95575g) {
                if (h2Var.get() != 0) {
                    h2Var.f95571b.onNext(obj);
                    iu.e.produced(h2Var, 1L);
                } else {
                    h2Var.cancel();
                    h2Var.f95571b.onError(new qt.e("Could not deliver value due to lack of requests"));
                }
            }
        }
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95512g) {
            return;
        }
        this.f95512g = true;
        a();
    }

    @Override // qu.b, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95512g) {
            mu.a.onError(th2);
        } else {
            this.f95512g = true;
            this.f95509c.onError(th2);
        }
    }

    @Override // qu.b, mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95512g) {
            return;
        }
        this.f95512g = true;
        dispose();
        a();
    }
}
