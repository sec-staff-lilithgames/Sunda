package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final o0 f8137b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f8138c;

    public n0(o0 o0Var) {
        this.f8137b = o0Var;
    }

    @Override // mt.v
    public void onComplete() {
        o0 o0Var = this.f8137b;
        AtomicReference atomicReference = o0Var.f8152g;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        o0Var.b();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        o0 o0Var = this.f8137b;
        AtomicReference atomicReference = o0Var.f8152g;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                if (o0Var.f8151f.addThrowable(th2)) {
                    if (!o0Var.f8150e) {
                        o0Var.f8153h.dispose();
                        o0Var.a();
                    }
                    o0Var.b();
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        mu.a.onError(th2);
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f8138c = obj;
        this.f8137b.b();
    }
}
