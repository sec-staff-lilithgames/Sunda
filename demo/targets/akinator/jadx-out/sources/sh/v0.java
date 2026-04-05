package sh;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class v0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final Future f85870b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f85871c;

    public v0(n1 n1Var, t0 t0Var) {
        this.f85870b = n1Var;
        this.f85871c = t0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        Throwable thTryInternalFastPathGetFailure;
        Future future = this.f85870b;
        boolean z10 = future instanceof th.a;
        t0 t0Var = this.f85871c;
        if (z10 && (thTryInternalFastPathGetFailure = th.b.tryInternalFastPathGetFailure((th.a) future)) != null) {
            t0Var.onFailure(thTryInternalFastPathGetFailure);
            return;
        }
        try {
            t0Var.onSuccess(b1.getDone(future));
        } catch (ExecutionException e10) {
            t0Var.onFailure(e10.getCause());
        } catch (Throwable th2) {
            t0Var.onFailure(th2);
        }
    }

    public String toString() {
        return mh.g1.toStringHelper(this).addValue(this.f85871c).toString();
    }
}
