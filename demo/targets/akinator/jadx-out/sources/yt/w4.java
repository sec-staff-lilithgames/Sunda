package yt;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w4 extends mt.l {

    /* renamed from: c, reason: collision with root package name */
    public final Future f96485c;

    /* renamed from: e, reason: collision with root package name */
    public final long f96486e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeUnit f96487f;

    public w4(Future<Object> future, long j10, TimeUnit timeUnit) {
        this.f96485c = future;
        this.f96486e = j10;
        this.f96487f = timeUnit;
    }

    @Override // mt.l
    public void subscribeActual(tw.c cVar) {
        hu.c cVar2 = new hu.c(cVar);
        cVar.onSubscribe(cVar2);
        try {
            TimeUnit timeUnit = this.f96487f;
            Future future = this.f96485c;
            Object obj = timeUnit != null ? future.get(this.f96486e, timeUnit) : future.get();
            if (obj == null) {
                cVar.onError(new NullPointerException("The future returned null"));
            } else {
                cVar2.complete(obj);
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (cVar2.isCancelled()) {
                return;
            }
            cVar.onError(th2);
        }
    }
}
