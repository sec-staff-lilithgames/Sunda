package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class InvokeOnCancelling extends JobNode {
    private static final /* synthetic */ AtomicIntegerFieldUpdater _invoked$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    private final l handler;

    public InvokeOnCancelling(l lVar) {
        this.handler = lVar;
    }

    private final /* synthetic */ int get_invoked$volatile() {
        return this._invoked$volatile;
    }

    private final /* synthetic */ void set_invoked$volatile(int i10) {
        this._invoked$volatile = i10;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th2) {
        if (_invoked$volatile$FU.compareAndSet(this, 0, 1)) {
            this.handler.invoke(th2);
        }
    }
}
