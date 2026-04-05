package kotlinx.coroutines;

import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ResumeOnCompletion extends JobNode {
    private final d<x0> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(d<? super x0> dVar) {
        this.continuation = dVar;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th2) {
        d<x0> dVar = this.continuation;
        int i10 = z.f87419c;
        dVar.resumeWith(z.m7131constructorimpl(x0.f87415a));
    }
}
