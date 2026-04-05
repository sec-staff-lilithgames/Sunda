package yt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w3 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Callable f96484c;

    public w3(Callable<? extends Throwable> callable) {
        this.f96484c = callable;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        try {
            th = (Throwable) ut.o0.requireNonNull(this.f96484c.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th2) {
            th = th2;
            qt.d.throwIfFatal(th);
        }
        hu.d.error(th, cVar);
    }
}
