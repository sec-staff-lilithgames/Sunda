package bu;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d4 extends mt.b0 {

    /* renamed from: b, reason: collision with root package name */
    public final Future f10204b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10205c;

    /* renamed from: e, reason: collision with root package name */
    public final TimeUnit f10206e;

    public d4(Future<Object> future, long j10, TimeUnit timeUnit) {
        this.f10204b = future;
        this.f10205c = j10;
        this.f10206e = timeUnit;
    }

    @Override // mt.b0
    public void subscribeActual(mt.i0 i0Var) {
        wt.l lVar = new wt.l(i0Var);
        i0Var.onSubscribe(lVar);
        if (lVar.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.f10206e;
            Future future = this.f10204b;
            lVar.complete(ut.o0.requireNonNull(timeUnit != null ? future.get(this.f10205c, timeUnit) : future.get(), "Future returned null"));
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            if (lVar.isDisposed()) {
                return;
            }
            i0Var.onError(th2);
        }
    }
}
