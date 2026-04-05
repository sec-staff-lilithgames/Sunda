package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends AtomicReference implements mt.i0, mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f8214b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f8215c;

    public x(mt.i0 i0Var, st.o oVar) {
        this.f8214b = i0Var;
        this.f8215c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f8214b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f8214b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f8214b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            ((mt.g0) ut.o0.requireNonNull(this.f8215c.apply(obj), "The mapper returned a null Publisher")).subscribe(this);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f8214b.onError(th2);
        }
    }
}
