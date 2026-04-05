package du;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends AtomicInteger implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52702b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f52703c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f52704e;

    public d0(mt.q0 q0Var, st.a aVar) {
        this.f52702b = q0Var;
        this.f52703c = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f52703c.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f52704e.dispose();
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52704e.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52702b.onError(th2);
        a();
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52704e, cVar)) {
            this.f52704e = cVar;
            this.f52702b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52702b.onSuccess(obj);
        a();
    }
}
