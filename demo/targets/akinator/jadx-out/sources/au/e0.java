package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e0 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f8036b;

    public e0(f0 f0Var) {
        this.f8036b = f0Var;
    }

    @Override // mt.v
    public void onComplete() {
        f0 f0Var = this.f8036b;
        f0Var.f8059m = 0;
        f0Var.a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        f0 f0Var = this.f8036b;
        if (!f0Var.f8051e.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (f0Var.f8054h != iu.k.f68413e) {
            f0Var.f8055i.dispose();
        }
        f0Var.f8059m = 0;
        f0Var.a();
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        f0 f0Var = this.f8036b;
        f0Var.f8058l = obj;
        f0Var.f8059m = 2;
        f0Var.a();
    }
}
