package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j1 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93443b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f93444c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93445e;

    public j1(mt.f fVar, st.o oVar) {
        this.f93443b = fVar;
        this.f93444c = oVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        this.f93443b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        boolean z10 = this.f93445e;
        mt.f fVar = this.f93443b;
        if (z10) {
            fVar.onError(th2);
            return;
        }
        this.f93445e = true;
        try {
            ((mt.i) ut.o0.requireNonNull(this.f93444c.apply(th2), "The errorMapper returned a null CompletableSource")).subscribe(this);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            fVar.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
