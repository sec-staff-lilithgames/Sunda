package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y7 extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z7 f11255b;

    public y7(z7 z7Var) {
        this.f11255b = z7Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        z7 z7Var = this.f11255b;
        tt.d.dispose(z7Var.f11312h);
        iu.n.onComplete(z7Var.f11307b, z7Var, z7Var.f11309e);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        z7 z7Var = this.f11255b;
        tt.d.dispose(z7Var.f11312h);
        iu.n.onError(z7Var.f11307b, th2, z7Var, z7Var.f11309e);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11255b.a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
