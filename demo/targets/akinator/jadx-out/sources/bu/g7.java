package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g7 extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10353b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f10354c;

    public g7(mt.i0 i0Var) {
        this.f10353b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        this.f10354c.dispose();
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10354c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.dispose(this);
        this.f10353b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this);
        this.f10353b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10353b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10354c, cVar)) {
            this.f10354c = cVar;
            this.f10353b.onSubscribe(this);
        }
    }
}
