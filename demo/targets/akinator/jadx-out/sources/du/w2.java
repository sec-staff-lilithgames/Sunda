package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w2 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52868b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f52869c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f52870e;

    /* renamed from: f, reason: collision with root package name */
    public pt.c f52871f;

    public w2(mt.q0 q0Var, Object obj, boolean z10, st.g gVar) {
        super(obj);
        this.f52868b = q0Var;
        this.f52870e = z10;
        this.f52869c = gVar;
    }

    public final void a() {
        Object andSet = getAndSet(this);
        if (andSet != this) {
            try {
                this.f52869c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f52871f.dispose();
        this.f52871f = tt.d.f87352b;
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52871f.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52871f = tt.d.f87352b;
        boolean z10 = this.f52870e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f52869c.accept(andSet);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                th2 = new qt.c(th2, th3);
            }
        }
        this.f52868b.onError(th2);
        if (z10) {
            return;
        }
        a();
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52871f, cVar)) {
            this.f52871f = cVar;
            this.f52868b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52871f = tt.d.f87352b;
        mt.q0 q0Var = this.f52868b;
        boolean z10 = this.f52870e;
        if (z10) {
            Object andSet = getAndSet(this);
            if (andSet == this) {
                return;
            }
            try {
                this.f52869c.accept(andSet);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                q0Var.onError(th2);
                return;
            }
        }
        q0Var.onSuccess(obj);
        if (z10) {
            return;
        }
        a();
    }
}
