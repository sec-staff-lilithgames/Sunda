package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final r0 f8164b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f8165c;

    public q0(r0 r0Var) {
        this.f8164b = r0Var;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        r0 r0Var = this.f8164b;
        AtomicReference atomicReference = r0Var.f8182g;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                if (r0Var.f8181f.addThrowable(th2)) {
                    if (!r0Var.f8180e) {
                        r0Var.f8183h.dispose();
                        r0Var.a();
                    }
                    r0Var.b();
                    return;
                }
            } else if (atomicReference.get() != this) {
                break;
            }
        }
        mu.a.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f8165c = obj;
        this.f8164b.b();
    }
}
