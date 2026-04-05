package zt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends AtomicInteger implements mt.v, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f98634b;

    /* renamed from: g, reason: collision with root package name */
    public final mt.y[] f98638g;

    /* renamed from: i, reason: collision with root package name */
    public int f98640i;

    /* renamed from: j, reason: collision with root package name */
    public long f98641j;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f98635c = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final tt.h f98637f = new tt.h();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f98636e = new AtomicReference(iu.u.f68424b);

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f98639h = new iu.d();

    public i(tw.c cVar, mt.y[] yVarArr) {
        this.f98634b = cVar;
        this.f98638g = yVarArr;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        do {
            tt.h hVar = this.f98637f;
            boolean zIsDisposed = hVar.isDisposed();
            AtomicReference atomicReference = this.f98636e;
            if (zIsDisposed) {
                atomicReference.lazySet(null);
                return;
            }
            Object obj = atomicReference.get();
            if (obj != null) {
                iu.u uVar = iu.u.f68424b;
                tw.c cVar = this.f98634b;
                if (obj != uVar) {
                    long j10 = this.f98641j;
                    if (j10 != this.f98635c.get()) {
                        this.f98641j = j10 + 1;
                        atomicReference.lazySet(null);
                        cVar.onNext(obj);
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                if (!hVar.isDisposed()) {
                    int i10 = this.f98640i;
                    mt.y[] yVarArr = this.f98638g;
                    if (i10 == yVarArr.length) {
                        iu.d dVar = this.f98639h;
                        if (((Throwable) dVar.get()) != null) {
                            cVar.onError(dVar.terminate());
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                    this.f98640i = i10 + 1;
                    yVarArr[i10].subscribe(this);
                }
            }
        } while (decrementAndGet() != 0);
    }

    @Override // tw.d
    public void cancel() {
        this.f98637f.dispose();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98636e.lazySet(iu.u.f68424b);
        a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98636e.lazySet(iu.u.f68424b);
        if (this.f98639h.addThrowable(th2)) {
            a();
        } else {
            mu.a.onError(th2);
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        this.f98637f.replace(cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98636e.lazySet(obj);
        a();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f98635c, j10);
            a();
        }
    }
}
