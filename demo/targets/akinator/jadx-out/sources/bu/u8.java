package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u8 extends AtomicInteger implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11085b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f11086c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f11087e;

    /* renamed from: f, reason: collision with root package name */
    public final st.q f11088f;

    /* renamed from: g, reason: collision with root package name */
    public long f11089g;

    public u8(mt.i0 i0Var, long j10, st.q qVar, tt.h hVar, mt.g0 g0Var) {
        this.f11085b = i0Var;
        this.f11086c = hVar;
        this.f11087e = g0Var;
        this.f11088f = qVar;
        this.f11089g = j10;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f11086c.isDisposed()) {
                this.f11087e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11085b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        long j10 = this.f11089g;
        if (j10 != Long.MAX_VALUE) {
            this.f11089g = j10 - 1;
        }
        mt.i0 i0Var = this.f11085b;
        if (j10 == 0) {
            i0Var.onError(th2);
            return;
        }
        try {
            if (this.f11088f.test(th2)) {
                a();
            } else {
                i0Var.onError(th2);
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            i0Var.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11085b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11086c.replace(cVar);
    }
}
