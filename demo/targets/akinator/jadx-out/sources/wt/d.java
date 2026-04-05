package wt;

import java.util.concurrent.atomic.AtomicReference;
import mt.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends AtomicReference implements q0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final st.b f91244b;

    public d(st.b bVar) {
        this.f91244b = bVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        try {
            lazySet(tt.d.f87352b);
            this.f91244b.accept(null, th2);
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            mu.a.onError(new qt.c(th2, th3));
        }
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        try {
            lazySet(tt.d.f87352b);
            this.f91244b.accept(obj, null);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            mu.a.onError(th2);
        }
    }
}
