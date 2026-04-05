package bu;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b0 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final c0 f10108b;

    public b0(c0 c0Var) {
        this.f10108b = c0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        lazySet(tt.d.f87352b);
        c0 c0Var = this.f10108b;
        c0Var.f10142g.delete(this);
        if (c0Var.f10142g.size() == 0) {
            tt.d.dispose(c0Var.f10143h);
            c0Var.f10145j = true;
            c0Var.b();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        lazySet(tt.d.f87352b);
        c0 c0Var = this.f10108b;
        tt.d.dispose(c0Var.f10143h);
        c0Var.f10142g.delete(this);
        c0Var.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        c0 c0Var = this.f10108b;
        c0Var.getClass();
        try {
            Collection collection = (Collection) ut.o0.requireNonNull(c0Var.f10139c.call(), "The bufferSupplier returned a null Collection");
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(c0Var.f10141f.apply(obj), "The bufferClose returned a null ObservableSource");
            long j10 = c0Var.f10148m;
            c0Var.f10148m = 1 + j10;
            synchronized (c0Var) {
                try {
                    LinkedHashMap linkedHashMap = c0Var.f10149n;
                    if (linkedHashMap == null) {
                        return;
                    }
                    linkedHashMap.put(Long.valueOf(j10), collection);
                    d0 d0Var = new d0(c0Var, j10);
                    c0Var.f10142g.add(d0Var);
                    g0Var.subscribe(d0Var);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            qt.d.throwIfFatal(th3);
            tt.d.dispose(c0Var.f10143h);
            c0Var.onError(th3);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
