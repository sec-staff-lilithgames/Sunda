package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class zb extends AtomicReference implements pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11328b;

    public zb(mt.i0 i0Var) {
        this.f11328b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isDisposed()) {
            return;
        }
        mt.i0 i0Var = this.f11328b;
        i0Var.onNext(0L);
        lazySet(tt.e.f87354b);
        i0Var.onComplete();
    }

    public void setResource(pt.c cVar) {
        tt.d.trySet(this, cVar);
    }
}
