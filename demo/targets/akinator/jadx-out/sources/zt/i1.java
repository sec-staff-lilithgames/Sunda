package zt;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i1 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98645b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98646c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f98647e;

    /* renamed from: f, reason: collision with root package name */
    public final Callable f98648f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f98649g;

    public i1(mt.v vVar, st.o oVar, st.o oVar2, Callable callable) {
        this.f98645b = vVar;
        this.f98646c = oVar;
        this.f98647e = oVar2;
        this.f98648f = callable;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        this.f98649g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        try {
            ((mt.y) ut.o0.requireNonNull(this.f98648f.call(), "The onCompleteSupplier returned a null MaybeSource")).subscribe(new h1(this));
        } catch (Exception e10) {
            qt.d.throwIfFatal(e10);
            this.f98645b.onError(e10);
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        try {
            ((mt.y) ut.o0.requireNonNull(this.f98647e.apply(th2), "The onErrorMapper returned a null MaybeSource")).subscribe(new h1(this));
        } catch (Exception e10) {
            qt.d.throwIfFatal(e10);
            this.f98645b.onError(new qt.c(th2, e10));
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98649g, cVar)) {
            this.f98649g = cVar;
            this.f98645b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            ((mt.y) ut.o0.requireNonNull(this.f98646c.apply(obj), "The onSuccessMapper returned a null MaybeSource")).subscribe(new h1(this));
        } catch (Exception e10) {
            qt.d.throwIfFatal(e10);
            this.f98645b.onError(e10);
        }
    }
}
