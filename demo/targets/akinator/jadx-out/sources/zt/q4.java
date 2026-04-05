package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q4 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98738b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f98739c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98740e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f98741f;

    public q4(mt.v vVar, Object obj, st.g gVar, boolean z10) {
        super(obj);
        this.f98738b = vVar;
        this.f98739c = gVar;
        this.f98740e = z10;
    }

    public final void a() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.f98739c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f98741f.dispose();
        this.f98741f = tt.d.f87352b;
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98741f.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98741f = tt.d.f87352b;
        mt.v vVar = this.f98738b;
        boolean z10 = this.f98740e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f98739c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                vVar.onError(th2);
                return;
            }
        }
        vVar.onComplete();
        if (z10) {
            return;
        }
        a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98741f = tt.d.f87352b;
        boolean z10 = this.f98740e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f98739c.accept(andSet);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                th2 = new qt.c(th2, th3);
            }
        }
        this.f98738b.onError(th2);
        if (z10) {
            return;
        }
        a();
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98741f, cVar)) {
            this.f98741f = cVar;
            this.f98738b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98741f = tt.d.f87352b;
        mt.v vVar = this.f98738b;
        boolean z10 = this.f98740e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f98739c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                vVar.onError(th2);
                return;
            }
        }
        vVar.onSuccess(obj);
        if (z10) {
            return;
        }
        a();
    }
}
