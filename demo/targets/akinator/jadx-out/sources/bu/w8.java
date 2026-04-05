package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w8 extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x8 f11177b;

    public w8(x8 x8Var) {
        this.f11177b = x8Var;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        x8 x8Var = this.f11177b;
        tt.d.dispose(x8Var.f11216h);
        iu.n.onComplete(x8Var.f11211b, x8Var, x8Var.f11213e);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        x8 x8Var = this.f11177b;
        tt.d.dispose(x8Var.f11216h);
        iu.n.onError(x8Var.f11211b, th2, x8Var, x8Var.f11213e);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        this.f11177b.a();
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
