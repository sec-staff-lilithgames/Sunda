package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SharedFlowSlot extends AbstractSharedFlowSlot<SharedFlowImpl<?>> {
    public zu.d<? super x0> cont;
    public long index = -1;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(SharedFlowImpl<?> sharedFlowImpl) {
        if (this.index >= 0) {
            return false;
        }
        this.index = sharedFlowImpl.updateNewCollectorIndexLocked$kotlinx_coroutines_core();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public zu.d<x0>[] freeLocked(SharedFlowImpl<?> sharedFlowImpl) {
        long j10 = this.index;
        this.index = -1L;
        this.cont = null;
        return sharedFlowImpl.updateCollectorIndexLocked$kotlinx_coroutines_core(j10);
    }
}
