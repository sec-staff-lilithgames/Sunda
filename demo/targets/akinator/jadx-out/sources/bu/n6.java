package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n6 extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final o6 f10696b;

    public n6(o6 o6Var) {
        this.f10696b = o6Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        o6 o6Var = this.f10696b;
        if (!o6Var.f10745f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        tt.d.dispose(o6Var.f10743c);
        if (o6Var.getAndIncrement() == 0) {
            o6Var.a();
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        o6 o6Var = this.f10696b;
        if (o6Var.compareAndSet(0, 1)) {
            o6Var.f10742b.onNext(obj);
            o6Var.f10750k = 2;
        } else {
            o6Var.f10747h = obj;
            o6Var.f10750k = 1;
            if (o6Var.getAndIncrement() != 0) {
                return;
            }
        }
        o6Var.a();
    }
}
