package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l1 extends AtomicReference implements mt.f, pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93455b;

    /* renamed from: c, reason: collision with root package name */
    public final tt.h f93456c = new tt.h();

    /* renamed from: e, reason: collision with root package name */
    public final mt.i f93457e;

    public l1(mt.f fVar, mt.i iVar) {
        this.f93455b = fVar;
        this.f93457e = iVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
        this.f93456c.dispose();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        this.f93455b.onComplete();
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93455b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93457e.subscribe(this);
    }
}
