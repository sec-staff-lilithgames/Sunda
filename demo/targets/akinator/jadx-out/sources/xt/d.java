package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93390b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.i f93391c;

    public d(mt.f fVar, mt.i iVar) {
        this.f93390b = fVar;
        this.f93391c = iVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // mt.f
    public void onComplete() {
        this.f93391c.subscribe(new c(this, this.f93390b));
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f93390b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f93390b.onSubscribe(this);
        }
    }
}
