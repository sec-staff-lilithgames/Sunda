package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends AtomicReference implements mt.f {

    /* renamed from: b, reason: collision with root package name */
    public final i f93415b;

    public h(i iVar) {
        this.f93415b = iVar;
    }

    @Override // mt.f
    public void onComplete() {
        i iVar = this.f93415b;
        iVar.f93430m = false;
        iVar.a();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        i iVar = this.f93415b;
        if (!iVar.f93424g.compareAndSet(false, true)) {
            mu.a.onError(th2);
        } else {
            iVar.f93428k.cancel();
            iVar.f93420b.onError(th2);
        }
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.replace(this, cVar);
    }
}
