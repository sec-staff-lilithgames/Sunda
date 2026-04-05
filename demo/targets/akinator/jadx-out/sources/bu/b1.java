package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10109b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f10110c;

    public b1(mt.i0 i0Var, c1 c1Var) {
        this.f10109b = i0Var;
        this.f10110c = c1Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        c1 c1Var = this.f10110c;
        c1Var.f10158k = false;
        c1Var.a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        c1 c1Var = this.f10110c;
        if (!c1Var.f10153f.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!c1Var.f10155h) {
            c1Var.f10157j.dispose();
        }
        c1Var.f10158k = false;
        c1Var.a();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10109b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
