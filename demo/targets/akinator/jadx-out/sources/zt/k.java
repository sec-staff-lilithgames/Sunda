package zt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends AtomicInteger implements mt.v, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f98662b;

    /* renamed from: g, reason: collision with root package name */
    public final Iterator f98666g;

    /* renamed from: h, reason: collision with root package name */
    public long f98667h;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f98663c = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public final tt.h f98665f = new tt.h();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f98664e = new AtomicReference(iu.u.f68424b);

    public k(tw.c cVar, Iterator it) {
        this.f98662b = cVar;
        this.f98666g = it;
    }

    public final void a() {
        Iterator it = this.f98666g;
        if (getAndIncrement() != 0) {
            return;
        }
        do {
            tt.h hVar = this.f98665f;
            boolean zIsDisposed = hVar.isDisposed();
            AtomicReference atomicReference = this.f98664e;
            if (zIsDisposed) {
                atomicReference.lazySet(null);
                return;
            }
            Object obj = atomicReference.get();
            if (obj != null) {
                iu.u uVar = iu.u.f68424b;
                tw.c cVar = this.f98662b;
                if (obj != uVar) {
                    long j10 = this.f98667h;
                    if (j10 != this.f98663c.get()) {
                        this.f98667h = j10 + 1;
                        atomicReference.lazySet(null);
                        cVar.onNext(obj);
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                if (!hVar.isDisposed()) {
                    try {
                        if (it.hasNext()) {
                            try {
                                ((mt.y) ut.o0.requireNonNull(it.next(), "The source Iterator returned a null MaybeSource")).subscribe(this);
                            } catch (Throwable th2) {
                                qt.d.throwIfFatal(th2);
                                cVar.onError(th2);
                                return;
                            }
                        } else {
                            cVar.onComplete();
                        }
                    } catch (Throwable th3) {
                        qt.d.throwIfFatal(th3);
                        cVar.onError(th3);
                        return;
                    }
                }
            }
        } while (decrementAndGet() != 0);
    }

    @Override // tw.d
    public void cancel() {
        this.f98665f.dispose();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98664e.lazySet(iu.u.f68424b);
        a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98662b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        this.f98665f.replace(cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98664e.lazySet(obj);
        a();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f98663c, j10);
            a();
        }
    }
}
