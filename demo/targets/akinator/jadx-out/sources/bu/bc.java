package bu;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class bc implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10131b;

    /* renamed from: c, reason: collision with root package name */
    public pt.c f10132c;

    /* renamed from: e, reason: collision with root package name */
    public Collection f10133e;

    public bc(mt.i0 i0Var, Collection collection) {
        this.f10131b = i0Var;
        this.f10133e = collection;
    }

    @Override // pt.c
    public void dispose() {
        this.f10132c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10132c.isDisposed();
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        Collection collection = this.f10133e;
        this.f10133e = null;
        mt.i0 i0Var = this.f10131b;
        i0Var.onNext(collection);
        i0Var.onComplete();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10133e = null;
        this.f10131b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10133e.add(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10132c, cVar)) {
            this.f10132c = cVar;
            this.f10131b.onSubscribe(this);
        }
    }
}
