package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k6 extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final l6 f10520b;

    public k6(l6 l6Var) {
        this.f10520b = l6Var;
    }

    @Override // mt.v
    public void onComplete() {
        l6 l6Var = this.f10520b;
        l6Var.f10597k = 2;
        if (l6Var.getAndIncrement() == 0) {
            l6Var.a();
        }
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        l6 l6Var = this.f10520b;
        if (!l6Var.f10592f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        tt.d.dispose(l6Var.f10590c);
        if (l6Var.getAndIncrement() == 0) {
            l6Var.a();
        }
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        l6 l6Var = this.f10520b;
        if (l6Var.compareAndSet(0, 1)) {
            l6Var.f10589b.onNext(obj);
            l6Var.f10597k = 2;
        } else {
            l6Var.f10594h = obj;
            l6Var.f10597k = 1;
            if (l6Var.getAndIncrement() != 0) {
                return;
            }
        }
        l6Var.a();
    }
}
