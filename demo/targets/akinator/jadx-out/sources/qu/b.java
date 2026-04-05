package qu;

import hu.g;
import iu.j;
import java.util.concurrent.atomic.AtomicReference;
import mt.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b implements q, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f83495b = new AtomicReference();

    @Override // pt.c
    public final void dispose() {
        g.cancel(this.f83495b);
    }

    @Override // pt.c
    public final boolean isDisposed() {
        return this.f83495b.get() == g.f59176b;
    }

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    public final void onSubscribe(tw.d dVar) {
        Class<?> cls = getClass();
        AtomicReference atomicReference = this.f83495b;
        if (j.setOnce((AtomicReference<tw.d>) atomicReference, dVar, cls)) {
            ((tw.d) atomicReference.get()).request(Long.MAX_VALUE);
        }
    }
}
