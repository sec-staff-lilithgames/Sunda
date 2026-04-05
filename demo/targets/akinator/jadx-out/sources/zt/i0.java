package zt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i0 extends AtomicInteger implements mt.v, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98642b;

    /* renamed from: c, reason: collision with root package name */
    public final st.a f98643c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f98644e;

    public i0(mt.v vVar, st.a aVar) {
        this.f98642b = vVar;
        this.f98643c = aVar;
    }

    public final void a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f98643c.run();
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                mu.a.onError(th2);
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f98644e.dispose();
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f98644e.isDisposed();
    }

    @Override // mt.v
    public void onComplete() {
        this.f98642b.onComplete();
        a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        this.f98642b.onError(th2);
        a();
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f98644e, cVar)) {
            this.f98644e = cVar;
            this.f98642b.onSubscribe(this);
        }
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        this.f98642b.onSuccess(obj);
        a();
    }
}
