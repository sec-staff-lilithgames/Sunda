package wt;

import java.util.concurrent.atomic.AtomicReference;
import mt.q0;
import ut.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends AtomicReference implements q0, pt.c, ku.k {

    /* renamed from: b, reason: collision with root package name */
    public final st.g f91257b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f91258c;

    public k(st.g gVar, st.g gVar2) {
        this.f91257b = gVar;
        this.f91258c = gVar2;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // ku.k
    public boolean hasCustomOnError() {
        return this.f91258c != m0.f88682e;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        lazySet(tt.d.f87352b);
        try {
            this.f91258c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        lazySet(tt.d.f87352b);
        try {
            this.f91257b.accept(obj);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }
}
