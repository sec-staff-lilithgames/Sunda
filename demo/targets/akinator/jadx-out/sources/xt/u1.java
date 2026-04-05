package xt;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class u1 extends AtomicReference implements pt.c, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final mt.f f93515b;

    public u1(mt.f fVar) {
        this.f93515b = fVar;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f93515b.onComplete();
    }
}
