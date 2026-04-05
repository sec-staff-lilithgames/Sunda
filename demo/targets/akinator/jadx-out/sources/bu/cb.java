package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class cb extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10182b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10183c = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final bb f10184e = new bb(this);

    /* renamed from: f, reason: collision with root package name */
    public final iu.d f10185f = new iu.d();

    public cb(mt.i0 i0Var) {
        this.f10182b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10183c);
        tt.d.dispose(this.f10184e);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10183c.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        tt.d.dispose(this.f10184e);
        iu.n.onComplete(this.f10182b, this, this.f10185f);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        tt.d.dispose(this.f10184e);
        iu.n.onError(this.f10182b, th2, this, this.f10185f);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        iu.n.onNext(this.f10182b, obj, this, this.f10185f);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10183c, cVar);
    }
}
