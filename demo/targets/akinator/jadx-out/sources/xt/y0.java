package xt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i[] f93541b;

    public y0(mt.i[] iVarArr) {
        this.f93541b = iVarArr;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        pt.b bVar = new pt.b();
        mt.i[] iVarArr = this.f93541b;
        AtomicInteger atomicInteger = new AtomicInteger(iVarArr.length + 1);
        iu.d dVar = new iu.d();
        fVar.onSubscribe(bVar);
        for (mt.i iVar : iVarArr) {
            if (bVar.isDisposed()) {
                return;
            }
            if (iVar == null) {
                dVar.addThrowable(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                iVar.subscribe(new x0(fVar, bVar, dVar, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable thTerminate = dVar.terminate();
            if (thTerminate == null) {
                fVar.onComplete();
            } else {
                fVar.onError(thTerminate);
            }
        }
    }
}
