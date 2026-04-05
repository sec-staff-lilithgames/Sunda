package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final u f8192b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f8193c;

    public t(u uVar) {
        this.f8192b = uVar;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        u uVar = this.f8192b;
        AtomicReference atomicReference = uVar.f8202h;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                if (uVar.f8200f.addThrowable(th2)) {
                    if (!uVar.f8199e) {
                        uVar.f8203i.cancel();
                        uVar.a();
                    }
                    uVar.b();
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
        this.f8193c = obj;
        this.f8192b.b();
    }
}
