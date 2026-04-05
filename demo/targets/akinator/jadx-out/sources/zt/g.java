package zt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g extends AtomicInteger implements mt.v, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f98606b;

    /* renamed from: g, reason: collision with root package name */
    public final mt.y[] f98610g;

    /* renamed from: h, reason: collision with root package name */
    public int f98611h;

    /* renamed from: i, reason: collision with root package name */
    public long f98612i;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f98607c = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final tt.h f98609f = new tt.h();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f98608e = new AtomicReference(iu.u.f68424b);

    public g(tw.c cVar, mt.y[] yVarArr) {
        this.f98606b = cVar;
        this.f98610g = yVarArr;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        do {
            tt.h hVar = this.f98609f;
            boolean zIsDisposed = hVar.isDisposed();
            AtomicReference atomicReference = this.f98608e;
            if (zIsDisposed) {
                atomicReference.lazySet(null);
                return;
            }
            Object obj = atomicReference.get();
            if (obj != null) {
                iu.u uVar = iu.u.f68424b;
                tw.c cVar = this.f98606b;
                if (obj != uVar) {
                    long j10 = this.f98612i;
                    if (j10 != this.f98607c.get()) {
                        this.f98612i = j10 + 1;
                        atomicReference.lazySet(null);
                        cVar.onNext(obj);
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                if (!hVar.isDisposed()) {
                    int i10 = this.f98611h;
                    mt.y[] yVarArr = this.f98610g;
                    if (i10 == yVarArr.length) {
                        cVar.onComplete();
                        return;
                    } else {
                        this.f98611h = i10 + 1;
                        yVarArr[i10].subscribe(this);
                    }
                }
            }
        } while (decrementAndGet() != 0);
    }

    @Override // tw.d
    public void cancel() {
        this.f98609f.dispose();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98608e.lazySet(iu.u.f68424b);
        a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98606b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        this.f98609f.replace(cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98608e.lazySet(obj);
        a();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f98607c, j10);
            a();
        }
    }
}
