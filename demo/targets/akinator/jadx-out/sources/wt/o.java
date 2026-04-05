package wt;

import java.util.concurrent.atomic.AtomicReference;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o extends AtomicReference implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final st.q f91265b;

    /* renamed from: c, reason: collision with root package name */
    public final st.g f91266c;

    /* renamed from: e, reason: collision with root package name */
    public final st.a f91267e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91268f;

    public o(st.q qVar, st.g gVar, st.a aVar) {
        this.f91265b = qVar;
        this.f91266c = gVar;
        this.f91267e = aVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f91268f) {
            return;
        }
        this.f91268f = true;
        try {
            this.f91267e.run();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f91268f) {
            mu.a.onError(th2);
            return;
        }
        this.f91268f = true;
        try {
            this.f91266c.accept(th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f91268f) {
            return;
        }
        try {
            if (this.f91265b.test(obj)) {
                return;
            }
            dispose();
            onComplete();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
