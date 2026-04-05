package a2;

import android.view.Choreographer;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 implements Choreographer.FrameCallback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f3854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.l f3855c;

    public u1(CancellableContinuationImpl cancellableContinuationImpl, v1 v1Var, kv.l lVar) {
        this.f3854b = cancellableContinuationImpl;
        this.f3855c = lVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        Object objM7131constructorimpl;
        kv.l lVar = this.f3855c;
        try {
            int i10 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(lVar.invoke(Long.valueOf(j10)));
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        this.f3854b.resumeWith(objM7131constructorimpl);
    }
}
