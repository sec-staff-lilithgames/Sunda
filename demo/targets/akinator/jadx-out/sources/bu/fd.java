package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class fd extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10321b;

    /* renamed from: c, reason: collision with root package name */
    public final st.c f10322c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f10323e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10324f = new AtomicReference();

    public fd(ku.m mVar, st.c cVar) {
        this.f10321b = mVar;
        this.f10322c = cVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10323e);
        tt.d.dispose(this.f10324f);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10323e.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.dispose(this.f10324f);
        this.f10321b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f10324f);
        this.f10321b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        ku.m mVar = this.f10321b;
        Object obj2 = get();
        if (obj2 != null) {
            try {
                mVar.onNext(ut.o0.requireNonNull(this.f10322c.apply(obj, obj2), "The combiner returned a null value"));
            } catch (Throwable th2) {
                qt.d.throwIfFatal(th2);
                dispose();
                mVar.onError(th2);
            }
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10323e, cVar);
    }

    public void otherError(Throwable th2) {
        tt.d.dispose(this.f10323e);
        this.f10321b.onError(th2);
    }

    public boolean setOther(pt.c cVar) {
        return tt.d.setOnce(this.f10324f, cVar);
    }
}
