package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends AtomicReference implements mt.v, pt.c, ku.k {

    /* renamed from: b, reason: collision with root package name */
    public final st.g f98589b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f98590c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f98591e;

    public f(st.g gVar, st.g gVar2, st.a aVar) {
        this.f98589b = gVar;
        this.f98590c = gVar2;
        this.f98591e = aVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // ku.k
    public boolean hasCustomOnError() {
        return this.f98590c != ut.m0.f88682e;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        lazySet(tt.d.f87352b);
        try {
            this.f98591e.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        lazySet(tt.d.f87352b);
        try {
            this.f98590c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        lazySet(tt.d.f87352b);
        try {
            this.f98589b.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }
}
