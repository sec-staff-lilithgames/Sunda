package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h0 extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f8069b;

    public h0(i0 i0Var) {
        this.f8069b = i0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        i0 i0Var = this.f8069b;
        if (!i0Var.f8087e.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (i0Var.f8090h != iu.k.f68413e) {
            i0Var.f8091i.dispose();
        }
        i0Var.f8095m = 0;
        i0Var.a();
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        i0 i0Var = this.f8069b;
        i0Var.f8094l = obj;
        i0Var.f8095m = 2;
        i0Var.a();
    }
}
