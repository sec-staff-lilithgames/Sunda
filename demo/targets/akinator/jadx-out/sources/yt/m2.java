package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m2 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f95925c;

    public m2(Callable<? extends tw.b> callable) {
        this.f95925c = callable;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            ((tw.b) ut.o0.requireNonNull(this.f95925c.call(), "The publisher supplied is null")).subscribe(cVar);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            hu.d.error(th2, cVar);
        }
    }
}
