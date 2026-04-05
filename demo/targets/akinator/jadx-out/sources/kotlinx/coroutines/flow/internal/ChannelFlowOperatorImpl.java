package kotlinx.coroutines.flow.internal;

import av.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tu.x0;
import zu.d;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ ChannelFlowOperatorImpl(Flow flow, m mVar, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(flow, (i11 & 2) != 0 ? n.f98854b : mVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(m mVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(this.flow, mVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return (Flow<T>) this.flow;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super T> flowCollector, d<? super x0> dVar) {
        Object objCollect = this.flow.collect(flowCollector, dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    public ChannelFlowOperatorImpl(Flow<? extends T> flow, m mVar, int i10, BufferOverflow bufferOverflow) {
        super(flow, mVar, i10, bufferOverflow);
    }
}
