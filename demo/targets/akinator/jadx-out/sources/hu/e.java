package hu;

import java.util.concurrent.atomic.AtomicInteger;
import vt.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends AtomicInteger implements l {

    /* renamed from: b, reason: collision with root package name */
    public final Object f59166b;

    /* renamed from: c, reason: collision with root package name */
    public final tw.c f59167c;

    public e(tw.c cVar, Object obj) {
        this.f59167c = cVar;
        this.f59166b = obj;
    }

    @Override // vt.l, tw.d
    public void cancel() {
        lazySet(2);
    }

    @Override // vt.l, vt.k, vt.o
    public void clear() {
        lazySet(1);
    }

    public boolean isCancelled() {
        return get() == 2;
    }

    @Override // vt.l, vt.k, vt.o
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // vt.l, vt.k, vt.o
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // vt.l, vt.k, vt.o
    public Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f59166b;
    }

    @Override // vt.l, tw.d
    public void request(long j10) {
        if (g.validate(j10) && compareAndSet(0, 1)) {
            Object obj = this.f59166b;
            tw.c cVar = this.f59167c;
            cVar.onNext(obj);
            if (get() != 2) {
                cVar.onComplete();
            }
        }
    }

    @Override // vt.l, vt.k
    public int requestFusion(int i10) {
        return i10 & 1;
    }

    @Override // vt.l, vt.k, vt.o
    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
