package kotlinx.coroutines;

import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class InvokeOnCompletion extends JobNode {
    private final l handler;

    public InvokeOnCompletion(l lVar) {
        this.handler = lVar;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th2) {
        this.handler.invoke(th2);
    }
}
