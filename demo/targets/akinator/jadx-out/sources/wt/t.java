package wt;

import java.util.concurrent.atomic.AtomicReference;
import mt.i0;
import ut.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends AtomicReference implements i0, pt.c, ku.k {

    /* renamed from: b, reason: collision with root package name */
    public final st.g f91280b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f91281c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f91282e;

    /* renamed from: f, reason: collision with root package name */
    public final st.g f91283f;

    public t(st.g gVar, st.g gVar2, st.a aVar, st.g gVar3) {
        this.f91280b = gVar;
        this.f91281c = gVar2;
        this.f91282e = aVar;
        this.f91283f = gVar3;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // ku.k
    public boolean hasCustomOnError() {
        return this.f91281c != m0.f88682e;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (isDisposed()) {
            return;
        }
        lazySet(tt.d.f87352b);
        try {
            this.f91282e.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (isDisposed()) {
            mu.a.onError(th2);
            return;
        }
        lazySet(tt.d.f87352b);
        try {
            this.f91281c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f91280b.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            ((pt.c) get()).dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            try {
                this.f91283f.accept(this);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                cVar.dispose();
                onError(th2);
            }
        }
    }
}
