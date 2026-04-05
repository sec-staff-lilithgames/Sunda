package ku;

import java.util.concurrent.atomic.AtomicReference;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f72028b = new AtomicReference();

    @Override // pt.c
    public final void dispose() {
        tt.d.dispose(this.f72028b);
    }

    @Override // pt.c
    public final boolean isDisposed() {
        return this.f72028b.get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // mt.i0, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.i0
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.i0, mt.f
    public final void onSubscribe(pt.c cVar) {
        iu.j.setOnce((AtomicReference<pt.c>) this.f72028b, cVar, getClass());
    }
}
