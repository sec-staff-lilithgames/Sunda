package yt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d4 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e4 f95338b;

    public d4(e4 e4Var) {
        this.f95338b = e4Var;
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
        e4 e4Var = this.f95338b;
        e4Var.f95416g.delete(this);
        e4Var.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        e4 e4Var = this.f95338b;
        e4Var.f95416g.delete(this);
        e4Var.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
