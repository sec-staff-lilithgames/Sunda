package gu;

import java.util.concurrent.atomic.AtomicReference;
import ut.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m extends AtomicReference implements mt.q, tw.d, pt.c, ku.k {

    /* renamed from: b, reason: collision with root package name */
    public final st.g f58448b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f58449c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f58450e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f58451f;

    public m(st.g gVar, st.g gVar2, st.a aVar, st.g gVar3) {
        this.f58448b = gVar;
        this.f58449c = gVar2;
        this.f58450e = aVar;
        this.f58451f = gVar3;
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this);
    }

    @Override // pt.c
    public void dispose() {
        cancel();
    }

    @Override // ku.k
    public boolean hasCustomOnError() {
        return this.f58449c != m0.f88682e;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == hu.g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj != gVar) {
            lazySet(gVar);
            try {
                this.f58450e.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        Object obj = get();
        hu.g gVar = hu.g.f59176b;
        if (obj == gVar) {
            mu.a.onError(th2);
            return;
        }
        lazySet(gVar);
        try {
            this.f58449c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f58448b.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            ((tw.d) get()).cancel();
            onError(th2);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            try {
                this.f58451f.accept(this);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                dVar.cancel();
                onError(th2);
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        ((tw.d) get()).request(j10);
    }
}
