package o5;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zu.m f77646b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f77647c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f77648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f77649f;

    public l1(zu.m mVar, CancellableContinuationImpl cancellableContinuationImpl, y0 y0Var, kv.p pVar) {
        this.f77646b = mVar;
        this.f77647c = cancellableContinuationImpl;
        this.f77648e = y0Var;
        this.f77649f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CancellableContinuationImpl cancellableContinuationImpl = this.f77647c;
        try {
            BuildersKt.runBlocking(this.f77646b.minusKey(zu.f.f98853b), new k1(this.f77648e, cancellableContinuationImpl, this.f77649f, null));
        } catch (Throwable th2) {
            cancellableContinuationImpl.cancel(th2);
        }
    }
}
