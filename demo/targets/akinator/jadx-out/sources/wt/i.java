package wt;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends AtomicReference implements i0, pt.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f91253c = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Queue f91254b;

    public i(Queue<Object> queue) {
        this.f91254b = queue;
    }

    @Override // pt.c
    public void dispose() {
        if (tt.d.dispose(this)) {
            this.f91254b.offer(f91253c);
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f91254b.offer(iu.u.complete());
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f91254b.offer(iu.u.error(th2));
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f91254b.offer(iu.u.next(obj));
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
