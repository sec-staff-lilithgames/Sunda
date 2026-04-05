package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s8 extends AtomicInteger implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10963b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f10964c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f10965e;

    /* renamed from: f, reason: collision with root package name */
    public final st.d f10966f;

    /* renamed from: g, reason: collision with root package name */
    public int f10967g;

    public s8(mt.i0 i0Var, st.d dVar, tt.h hVar, mt.g0 g0Var) {
        this.f10963b = i0Var;
        this.f10964c = hVar;
        this.f10965e = g0Var;
        this.f10966f = dVar;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.f10964c.isDisposed()) {
                this.f10965e.subscribe(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10963b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        mt.i0 i0Var = this.f10963b;
        try {
            st.d dVar = this.f10966f;
            int i10 = this.f10967g + 1;
            this.f10967g = i10;
            if (((ut.n0) dVar).test(Integer.valueOf(i10), th2)) {
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
        this.f10963b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f10964c.replace(cVar);
    }
}
