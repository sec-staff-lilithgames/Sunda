package xt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Callable f93392b;

    public d0(Callable<? extends Throwable> callable) {
        this.f93392b = callable;
    }

    @Override // mt.c
    public final void subscribeActual(mt.f fVar) {
        try {
            th = (Throwable) ut.o0.requireNonNull(this.f93392b.call(), "The error returned is null");
        } catch (Throwable th2) {
            th = th2;
            qt.d.throwIfFatal(th);
        }
        tt.e.error(th, fVar);
    }
}
