package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b3 extends AtomicReference implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98544b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98545c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f98546e;

    public b3(mt.v vVar, st.o oVar, boolean z10) {
        this.f98544b = vVar;
        this.f98545c = oVar;
        this.f98546e = z10;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.v
    public void onComplete() {
        this.f98544b.onComplete();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        boolean z10 = this.f98546e;
        mt.v vVar = this.f98544b;
        if (!z10 && !(th2 instanceof Exception)) {
            vVar.onError(th2);
            return;
        }
        try {
            mt.y yVar = (mt.y) ut.o0.requireNonNull(this.f98545c.apply(th2), "The resumeFunction returned a null MaybeSource");
            tt.d.replace(this, null);
            yVar.subscribe(new a3(vVar, this));
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            vVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98544b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98544b.onSuccess(obj);
    }
}
