package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d1 extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final ku.m f10194b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f10195c;

    public d1(ku.m mVar, e1 e1Var) {
        this.f10194b = mVar;
        this.f10195c = e1Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        e1 e1Var = this.f10195c;
        e1Var.f10242i = false;
        e1Var.a();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f10195c.dispose();
        this.f10194b.onError(th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f10194b.onNext(obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
