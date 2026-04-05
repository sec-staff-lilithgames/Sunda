package xt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f93377b;

    public b1(Iterable<? extends mt.i> iterable) {
        this.f93377b = iterable;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        pt.b bVar = new pt.b();
        fVar.onSubscribe(bVar);
        try {
            Iterator it = (Iterator) ut.o0.requireNonNull(this.f93377b.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            a1 a1Var = new a1(fVar, bVar, atomicInteger);
            while (!bVar.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        a1Var.onComplete();
                        return;
                    }
                    if (bVar.isDisposed()) {
                        return;
                    }
                    try {
                        mt.i iVar = (mt.i) ut.o0.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                        if (bVar.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        iVar.subscribe(a1Var);
                    } catch (Throwable th2) {
                        qt.d.throwIfFatal(th2);
                        bVar.dispose();
                        a1Var.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    bVar.dispose();
                    a1Var.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            fVar.onError(th4);
        }
    }
}
