package xt;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f93464b;

    public n(Iterable<? extends mt.i> iterable) {
        this.f93464b = iterable;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        try {
            m mVar = new m(fVar, (Iterator) ut.o0.requireNonNull(this.f93464b.iterator(), "The iterator returned is null"));
            fVar.onSubscribe(mVar.f93460e);
            mVar.a();
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            tt.e.error(th2, fVar);
        }
    }
}
