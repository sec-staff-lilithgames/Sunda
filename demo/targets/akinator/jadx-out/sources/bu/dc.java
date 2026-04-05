package bu;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class dc implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f10221b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f10222c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f10223e;

    public dc(mt.q0 q0Var, Collection collection) {
        this.f10221b = q0Var;
        this.f10222c = collection;
    }

    @Override // pt.c
    public void dispose() {
        this.f10223e.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10223e.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Collection collection = this.f10222c;
        this.f10222c = null;
        this.f10221b.onSuccess(collection);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10222c = null;
        this.f10221b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10222c.add(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10223e, cVar)) {
            this.f10223e = cVar;
            this.f10221b.onSubscribe(this);
        }
    }
}
