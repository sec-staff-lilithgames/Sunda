package du;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f0 extends AtomicReference implements mt.q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52723b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f52724c;

    public f0(mt.q0 q0Var, st.a aVar) {
        this.f52723b = q0Var;
        lazySet(aVar);
    }

    @Override // pt.c
    public void dispose() {
        st.a aVar = (st.a) getAndSet(null);
        if (aVar != null) {
            try {
                aVar.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
            this.f52724c.dispose();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f52724c.isDisposed();
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        this.f52723b.onError(th2);
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f52724c, cVar)) {
            this.f52724c = cVar;
            this.f52723b.onSubscribe(this);
        }
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        this.f52723b.onSuccess(obj);
    }
}
