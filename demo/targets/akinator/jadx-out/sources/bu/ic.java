package bu;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ic extends AtomicBoolean implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10434b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10435c;

    /* renamed from: e, reason: collision with root package name */
    public final st.g f10436e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10437f;

    /* renamed from: g, reason: collision with root package name */
    public pt.c f10438g;

    public ic(mt.i0 i0Var, Object obj, st.g gVar, boolean z10) {
        this.f10434b = i0Var;
        this.f10435c = obj;
        this.f10436e = gVar;
        this.f10437f = z10;
    }

    public final void a() {
        if (compareAndSet(false, true)) {
            try {
                this.f10436e.accept(this.f10435c);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        a();
        this.f10438g.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        boolean z10 = this.f10437f;
        mt.i0 i0Var = this.f10434b;
        if (!z10) {
            i0Var.onComplete();
            this.f10438g.dispose();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f10436e.accept(this.f10435c);
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                i0Var.onError(th2);
                return;
            }
        }
        this.f10438g.dispose();
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f10437f;
        mt.i0 i0Var = this.f10434b;
        if (!z10) {
            i0Var.onError(th2);
            this.f10438g.dispose();
            a();
            return;
        }
        if (compareAndSet(false, true)) {
            try {
                this.f10436e.accept(this.f10435c);
            } catch (Throwable th3) {
                qt.d.throwIfFatal(th3);
                th2 = new qt.c(th2, th3);
            }
        }
        this.f10438g.dispose();
        i0Var.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10434b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10438g, cVar)) {
            this.f10438g = cVar;
            this.f10434b.onSubscribe(this);
        }
    }
}
