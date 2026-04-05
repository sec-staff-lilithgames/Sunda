package kotlinx.coroutines.flow;

import java.util.List;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ReadonlyStateFlow<T> implements StateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private final /* synthetic */ StateFlow<T> $$delegate_0;
    private final Job job;

    /* JADX WARN: Multi-variable type inference failed */
    public ReadonlyStateFlow(StateFlow<? extends T> stateFlow, Job job) {
        this.$$delegate_0 = stateFlow;
        this.job = job;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, zu.d<?> dVar) {
        return this.$$delegate_0.collect(flowCollector, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(m mVar, int i10, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, mVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return this.$$delegate_0.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        return this.$$delegate_0.getValue();
    }
}
