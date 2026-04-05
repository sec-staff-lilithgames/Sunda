package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final r f8162b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f8163c;

    public q(r rVar) {
        this.f8162b = rVar;
    }

    @Override // mt.v
    public void onComplete() {
        r rVar = this.f8162b;
        AtomicReference atomicReference = rVar.f8172h;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        rVar.b();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        r rVar = this.f8162b;
        AtomicReference atomicReference = rVar.f8172h;
        while (true) {
            if (atomicReference.compareAndSet(this, null)) {
                if (rVar.f8170f.addThrowable(th2)) {
                    if (!rVar.f8169e) {
                        rVar.f8173i.cancel();
                        rVar.a();
                    }
                    rVar.b();
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
        this.f8163c = obj;
        this.f8162b.b();
    }
}
