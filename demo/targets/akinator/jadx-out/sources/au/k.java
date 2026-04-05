package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends AtomicReference implements mt.q0 {

    /* renamed from: b, reason: collision with root package name */
    public final l f8104b;

    public k(l lVar) {
        this.f8104b = lVar;
    }

    @Override // mt.q0
    public void onError(Throwable th2) {
        l lVar = this.f8104b;
        if (!lVar.f8110g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (lVar.f8113j != iu.k.f68413e) {
            lVar.f8114k.cancel();
        }
        lVar.f8120q = 0;
        lVar.a();
    }

    @Override // mt.q0
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.q0
    public void onSuccess(Object obj) {
        l lVar = this.f8104b;
        lVar.f8119p = obj;
        lVar.f8120q = 2;
        lVar.a();
    }
}
