package au;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends AtomicReference implements mt.v {

    /* renamed from: b, reason: collision with root package name */
    public final i f8068b;

    public h(i iVar) {
        this.f8068b = iVar;
    }

    @Override // mt.v
    public void onComplete() {
        i iVar = this.f8068b;
        iVar.f8084q = 0;
        iVar.a();
    }

    @Override // mt.v
    public void onError(Throwable th2) {
        i iVar = this.f8068b;
        if (!iVar.f8074g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (iVar.f8077j != iu.k.f68413e) {
            iVar.f8078k.cancel();
        }
        iVar.f8084q = 0;
        iVar.a();
    }

    @Override // mt.v
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }

    @Override // mt.v
    public void onSuccess(Object obj) {
        i iVar = this.f8068b;
        iVar.f8083p = obj;
        iVar.f8084q = 2;
        iVar.a();
    }
}
