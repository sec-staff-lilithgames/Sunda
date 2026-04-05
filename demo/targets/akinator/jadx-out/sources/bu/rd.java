package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class rd extends AtomicReference implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10935b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10936c = new AtomicReference();

    public rd(mt.i0 i0Var) {
        this.f10935b = i0Var;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10936c);
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10936c.get() == tt.d.f87352b;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        dispose();
        this.f10935b.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        dispose();
        this.f10935b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10935b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this.f10936c, cVar)) {
            this.f10935b.onSubscribe(this);
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.set(this, cVar);
    }
}
