package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r1 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98746b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98747c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98748e;

    public r1(mt.v vVar, st.o oVar) {
        this.f98746b = vVar;
        this.f98747c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        this.f98748e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98746b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98746b.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98748e, cVar)) {
            this.f98748e = cVar;
            this.f98746b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f98747c.apply(obj), "The mapper returned a null MaybeSource");
            if (isDisposed()) {
                return;
            }
            yVar.subscribe(new q1(this));
        } catch (Exception e10) {
            qt.d.throwIfFatal(e10);
            this.f98746b.onError(e10);
        }
    }
}
