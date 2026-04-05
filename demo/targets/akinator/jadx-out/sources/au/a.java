package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends AtomicReference implements mt.i0, mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f8007b;

    /* renamed from: c, reason: collision with root package name */
    public mt.g0 f8008c;

    public a(mt.g0 g0Var, mt.i0 i0Var) {
        this.f8008c = g0Var;
        this.f8007b = i0Var;
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
        mt.g0 g0Var = this.f8008c;
        if (g0Var == null) {
            this.f8007b.onComplete();
        } else {
            this.f8008c = null;
            g0Var.subscribe(this);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f8007b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f8007b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
