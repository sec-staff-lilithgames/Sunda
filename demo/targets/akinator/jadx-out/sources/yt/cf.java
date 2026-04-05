package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class cf extends AtomicInteger implements vt.a, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95299b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f95300c;

    /* renamed from: e, reason: collision with root package name */
    public final df[] f95301e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f95302f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f95303g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicLong f95304h;

    /* renamed from: i, reason: collision with root package name */
    public final iu.d f95305i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f95306j;

    public cf(tw.c cVar, st.o oVar, int i10) {
        this.f95299b = cVar;
        this.f95300c = oVar;
        df[] dfVarArr = new df[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            dfVarArr[i11] = new df(this, i11);
        }
        this.f95301e = dfVarArr;
        this.f95302f = new AtomicReferenceArray(i10);
        this.f95303g = new AtomicReference();
        this.f95304h = new AtomicLong();
        this.f95305i = new iu.d();
    }

    public final void a(int i10) {
        int i11 = 0;
        while (true) {
            df[] dfVarArr = this.f95301e;
            if (i11 >= dfVarArr.length) {
                return;
            }
            if (i11 != i10) {
                df dfVar = dfVarArr[i11];
                dfVar.getClass();
                hu.g.cancel(dfVar);
            }
            i11++;
        }
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this.f95303g);
        for (df dfVar : this.f95301e) {
            dfVar.getClass();
            hu.g.cancel(dfVar);
        }
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95306j) {
            return;
        }
        this.f95306j = true;
        a(-1);
        iu.n.onComplete(this.f95299b, this, this.f95305i);
    }

    @Override // vt.a, mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95306j) {
            mu.a.onError(th2);
            return;
        }
        this.f95306j = true;
        a(-1);
        iu.n.onError(this.f95299b, th2, this, this.f95305i);
    }

    @Override // vt.a, mt.q, tw.c
    public void onNext(Object obj) {
        if (tryOnNext(obj) || this.f95306j) {
            return;
        }
        ((tw.d) this.f95303g.get()).request(1L);
    }

    @Override // vt.a, mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.deferredSetOnce(this.f95303g, this.f95304h, dVar);
    }

    @Override // tw.d
    public void request(long j10) {
        hu.g.deferredRequest(this.f95303g, this.f95304h, j10);
    }

    @Override // vt.a
    public boolean tryOnNext(Object obj) {
        if (!this.f95306j) {
            AtomicReferenceArray atomicReferenceArray = this.f95302f;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            objArr[0] = obj;
            int i10 = 0;
            while (i10 < length) {
                Object obj2 = atomicReferenceArray.get(i10);
                if (obj2 != null) {
                    i10++;
                    objArr[i10] = obj2;
                }
            }
            try {
                iu.n.onNext(this.f95299b, ut.o0.requireNonNull(this.f95300c.apply(objArr), "The combiner returned a null value"), this, this.f95305i);
                return true;
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }
        return false;
    }
}
