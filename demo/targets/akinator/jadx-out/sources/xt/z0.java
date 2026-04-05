package xt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f93545b;

    public z0(Iterable<? extends mt.i> iterable) {
        this.f93545b = iterable;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        pt.b bVar = new pt.b();
        fVar.onSubscribe(bVar);
        try {
            Iterator it = (Iterator) ut.o0.requireNonNull(this.f93545b.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            iu.d dVar = new iu.d();
            while (!bVar.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (bVar.isDisposed()) {
                            return;
                        }
                        try {
                            mt.i iVar = (mt.i) ut.o0.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (bVar.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            iVar.subscribe(new x0(fVar, bVar, dVar, atomicInteger));
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            dVar.addThrowable(th2);
                        }
                    }
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    dVar.addThrowable(th3);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thTerminate = dVar.terminate();
                    if (thTerminate == null) {
                        fVar.onComplete();
                        return;
                    } else {
                        fVar.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
        } catch (Throwable th4) {
            qt.d.throwIfFatal(th4);
            fVar.onError(th4);
        }
    }
}
