package cu;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends AtomicReference implements mt.q {

    /* renamed from: b, reason: collision with root package name */
    public final s0 f51067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51068c;

    public r0(s0 s0Var, int i10) {
        this.f51067b = s0Var;
        this.f51068c = i10;
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        s0 s0Var = this.f51067b;
        AtomicReference atomicReference = s0Var.f51080k;
        while (!atomicReference.compareAndSet(null, th2)) {
            if (atomicReference.get() != null) {
                if (th2 != atomicReference.get()) {
                    mu.a.onError(th2);
                    return;
                }
                return;
            }
        }
        s0Var.b();
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        hu.g.setOnce(this, dVar, Long.MAX_VALUE);
    }

    @Override // mt.q, tw.c
    public void onNext(List<Object> list) {
        int i10 = this.f51068c;
        s0 s0Var = this.f51067b;
        s0Var.f51074e[i10] = list;
        if (s0Var.f51079j.decrementAndGet() == 0) {
            s0Var.b();
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
    }
}
