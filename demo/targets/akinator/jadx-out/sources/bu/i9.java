package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i9 extends AtomicInteger implements vt.j, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10424b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10425c;

    public i9(mt.i0 i0Var, Object obj) {
        this.f10424b = i0Var;
        this.f10425c = obj;
    }

    @Override // vt.j, vt.k, vt.o
    public void clear() {
        lazySet(3);
    }

    @Override // vt.j, pt.c
    public void dispose() {
        set(3);
    }

    @Override // vt.j, pt.c
    public boolean isDisposed() {
        return get() == 3;
    }

    @Override // vt.j, vt.k, vt.o
    public boolean isEmpty() {
        return get() != 1;
    }

    @Override // vt.j, vt.k, vt.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.j, vt.k, vt.o
    public Object poll() throws Exception {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.f10425c;
    }

    @Override // vt.j, vt.k
    public int requestFusion(int i10) {
        if ((i10 & 1) == 0) {
            return 0;
        }
        lazySet(1);
        return 1;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.f10425c;
            mt.i0 i0Var = this.f10424b;
            i0Var.onNext(obj);
            if (get() == 2) {
                lazySet(3);
                i0Var.onComplete();
            }
        }
    }

    @Override // vt.j, vt.k, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
