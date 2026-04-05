package zt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c0 extends AtomicReference implements mt.f, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98553b;

    /* renamed from: c, reason: collision with root package name */
    public final mt.y f98554c;

    public c0(mt.v vVar, mt.y yVar) {
        this.f98553b = vVar;
        this.f98554c = yVar;
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
        this.f98554c.subscribe(new b0(this, this.f98553b));
    }

    @Override // mt.f
    public void onError(Throwable th2) {
        this.f98553b.onError(th2);
    }

    @Override // mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            this.f98553b.onSubscribe(this);
        }
    }
}
