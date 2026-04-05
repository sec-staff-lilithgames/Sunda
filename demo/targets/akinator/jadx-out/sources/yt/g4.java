package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g4 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4 f95515b;

    public g4(h4 h4Var) {
        this.f95515b = h4Var;
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
        h4 h4Var = this.f95515b;
        h4Var.f95586g.delete(this);
        h4Var.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        h4 h4Var = this.f95515b;
        h4Var.f95586g.delete(this);
        h4Var.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
