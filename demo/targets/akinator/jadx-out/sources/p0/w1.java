package p0;

import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x1 f80566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f80567c;

    public w1(x1 x1Var, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f80566b = x1Var;
        this.f80567c = cancellableContinuationImpl;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        Object obj = this.f80566b.f80586a;
        x1 x1Var = this.f80566b;
        CancellableContinuationImpl cancellableContinuationImpl = this.f80567c;
        synchronized (obj) {
            x1Var.f80587b.remove(cancellableContinuationImpl);
        }
    }
}
