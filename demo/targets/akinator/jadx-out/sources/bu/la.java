package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class la extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10607b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10608c = new AtomicReference();

    public la(mt.i0 i0Var) {
        this.f10607b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10608c);
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f10607b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10607b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10607b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10608c, cVar);
    }
}
