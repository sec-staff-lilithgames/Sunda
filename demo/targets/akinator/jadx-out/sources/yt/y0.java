package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final x0 f96586b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96587c;

    /* renamed from: e, reason: collision with root package name */
    public final int f96588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f96589f;

    /* renamed from: g, reason: collision with root package name */
    public int f96590g;

    public y0(x0 x0Var, int i10, int i11) {
        this.f96586b = x0Var;
        this.f96587c = i10;
        this.f96588e = i11;
        this.f96589f = i11 - (i11 >> 2);
    }

    public void cancel() {
        hu.g.cancel(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        this.f96586b.c(this.f96587c);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        x0 x0Var = this.f96586b;
        int i10 = this.f96587c;
        if (!iu.m.addThrowable(x0Var.f96539o, th2)) {
            mu.a.onError(th2);
        } else {
            if (x0Var.f96532h) {
                x0Var.c(i10);
                return;
            }
            x0Var.a();
            x0Var.f96538n = true;
            x0Var.drain();
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        boolean z10;
        x0 x0Var = this.f96586b;
        int i10 = this.f96587c;
        synchronized (x0Var) {
            try {
                Object[] objArr = x0Var.f96531g;
                int i11 = x0Var.f96534j;
                if (objArr[i10] == null) {
                    i11++;
                    x0Var.f96534j = i11;
                }
                objArr[i10] = obj;
                if (objArr.length == i11) {
                    x0Var.f96530f.offer(x0Var.f96529e[i10], objArr.clone());
                    z10 = false;
                } else {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            x0Var.f96529e[i10].requestOne();
        } else {
            x0Var.drain();
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, this.f96588e);
    }

    public void requestOne() {
        int i10 = this.f96590g + 1;
        if (i10 != this.f96589f) {
            this.f96590g = i10;
        } else {
            this.f96590g = 0;
            ((tw.d) get()).request(i10);
        }
    }
}
