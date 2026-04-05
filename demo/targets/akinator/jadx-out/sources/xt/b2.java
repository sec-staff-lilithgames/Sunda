package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b2 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93378b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f93379c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f93380e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f93381f;

    public b2(mt.f fVar, Object obj, st.g gVar, boolean z10) {
        super(obj);
        this.f93378b = fVar;
        this.f93379c = gVar;
        this.f93380e = z10;
    }

    public final void a() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.f93379c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f93381f.dispose();
        this.f93381f = tt.d.f87352b;
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f93381f.isDisposed();
    }

    @Override // mt.f
    public void onComplete() {
        this.f93381f = tt.d.f87352b;
        mt.f fVar = this.f93378b;
        boolean z10 = this.f93380e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f93379c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                fVar.onError(th2);
                return;
            }
        }
        fVar.onComplete();
        if (z10) {
            return;
        }
        a();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93381f = tt.d.f87352b;
        boolean z10 = this.f93380e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f93379c.accept(andSet);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                th2 = new qt.c(th2, th3);
            }
        }
        this.f93378b.onError(th2);
        if (z10) {
            return;
        }
        a();
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f93381f, cVar)) {
            this.f93381f = cVar;
            this.f93378b.onSubscribe(this);
        }
    }
}
