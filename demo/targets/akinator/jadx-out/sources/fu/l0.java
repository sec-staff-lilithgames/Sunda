package fu;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l0 extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f56052b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final nu.a f56053c;

    /* renamed from: e, reason: collision with root package name */
    public final m0.a f56054e;

    public l0(nu.a aVar, m0.a aVar2) {
        this.f56053c = aVar;
        this.f56054e = aVar2;
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        if (this.f56052b.compareAndSet(false, true)) {
            this.f56053c.onComplete();
            this.f56054e.dispose();
        }
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f56052b.get();
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        i0 i0Var = new i0(runnable, j10, timeUnit);
        this.f56053c.onNext(i0Var);
        return i0Var;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable) {
        j0 j0Var = new j0(runnable);
        this.f56053c.onNext(j0Var);
        return j0Var;
    }
}
