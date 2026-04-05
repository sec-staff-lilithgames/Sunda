package zt;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x1 extends mt.s {

    /* renamed from: b, reason: collision with root package name */
    public final Future f98822b;

    /* renamed from: c, reason: collision with root package name */
    public final long f98823c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f98824e;

    public x1(Future<Object> future, long j10, TimeUnit timeUnit) {
        this.f98822b = future;
        this.f98823c = j10;
        this.f98824e = timeUnit;
    }

    @Override // mt.s
    public final void subscribeActual(mt.v vVar) {
        pt.c cVarEmpty = pt.d.empty();
        vVar.onSubscribe(cVarEmpty);
        if (cVarEmpty.isDisposed()) {
            return;
        }
        try {
            long j10 = this.f98823c;
            Future future = this.f98822b;
            Object obj = j10 <= 0 ? future.get() : future.get(j10, this.f98824e);
            if (cVarEmpty.isDisposed()) {
                return;
            }
            if (obj == null) {
                vVar.onComplete();
            } else {
                vVar.onSuccess(obj);
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            qt.d.throwIfFatal(th);
            if (cVarEmpty.isDisposed()) {
                return;
            }
            vVar.onError(th);
        }
    }
}
