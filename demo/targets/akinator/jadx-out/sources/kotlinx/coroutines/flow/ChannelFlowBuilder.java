package kotlinx.coroutines.flow;

import av.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kv.p;
import tu.x0;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
class ChannelFlowBuilder<T> extends ChannelFlow<T> {
    private final p block;

    public /* synthetic */ ChannelFlowBuilder(p pVar, m mVar, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(pVar, (i11 & 2) != 0 ? n.f98854b : mVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static /* synthetic */ <T> Object collectTo$suspendImpl(ChannelFlowBuilder<T> channelFlowBuilder, ProducerScope<? super T> producerScope, zu.d<? super x0> dVar) {
        Object objInvoke = ((ChannelFlowBuilder) channelFlowBuilder).block.invoke(producerScope, dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, zu.d<? super x0> dVar) {
        return collectTo$suspendImpl(this, producerScope, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(m mVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.block, mVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    public ChannelFlowBuilder(p pVar, m mVar, int i10, BufferOverflow bufferOverflow) {
        super(mVar, i10, bufferOverflow);
        this.block = pVar;
    }
}
