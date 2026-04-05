package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w7 extends AtomicInteger implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f11173b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f11174c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.g0 f11175e;

    /* renamed from: f, reason: collision with root package name */
    public final st.e f11176f;

    public w7(mt.i0 i0Var, st.e eVar, tt.h hVar, mt.g0 g0Var) {
        this.f11173b = i0Var;
        this.f11174c = hVar;
        this.f11175e = g0Var;
        this.f11176f = eVar;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        mt.i0 i0Var = this.f11173b;
        try {
            if (((yt.z) this.f11176f).getAsBoolean()) {
                i0Var.onComplete();
            } else if (getAndIncrement() == 0) {
                int iAddAndGet = 1;
                do {
                    this.f11175e.subscribe(this);
                    iAddAndGet = addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            i0Var.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11173b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11173b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        this.f11174c.replace(cVar);
    }
}
