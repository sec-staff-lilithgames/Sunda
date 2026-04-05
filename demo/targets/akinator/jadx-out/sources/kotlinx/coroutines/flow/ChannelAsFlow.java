package kotlinx.coroutines.flow;

import av.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.flow.internal.SendingCollector;
import tu.x0;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ChannelAsFlow<T> extends ChannelFlow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(ChannelAsFlow.class, "consumed$volatile");
    private final ReceiveChannel<T> channel;
    private final boolean consume;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ ChannelAsFlow(ReceiveChannel receiveChannel, boolean z10, m mVar, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(receiveChannel, z10, (i11 & 4) != 0 ? n.f98854b : mVar, (i11 & 8) != 0 ? -3 : i10, (i11 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final void markConsumed() {
        if (this.consume && consumed$volatile$FU.getAndSet(this, 1) == 1) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
    }

    private final /* synthetic */ void setConsumed$volatile(int i10) {
        this.consumed$volatile = i10;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "channel=" + this.channel;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
        int i10 = this.capacity;
        x0 x0Var = x0.f87415a;
        if (i10 != -3) {
            Object objCollect = super.collect(flowCollector, dVar);
            return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0Var;
        }
        markConsumed();
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(flowCollector, this.channel, this.consume, dVar);
        return objEmitAllImpl$FlowKt__ChannelsKt == e.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : x0Var;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, zu.d<? super x0> dVar) {
        Object objEmitAllImpl$FlowKt__ChannelsKt = FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(new SendingCollector(producerScope), this.channel, this.consume, dVar);
        return objEmitAllImpl$FlowKt__ChannelsKt == e.getCOROUTINE_SUSPENDED() ? objEmitAllImpl$FlowKt__ChannelsKt : x0.f87415a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(m mVar, int i10, BufferOverflow bufferOverflow) {
        return new ChannelAsFlow(this.channel, this.consume, mVar, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return new ChannelAsFlow(this.channel, this.consume, null, 0, null, 28, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        markConsumed();
        return this.capacity == -3 ? this.channel : super.produceImpl(coroutineScope);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelAsFlow(ReceiveChannel<? extends T> receiveChannel, boolean z10, m mVar, int i10, BufferOverflow bufferOverflow) {
        super(mVar, i10, bufferOverflow);
        this.channel = receiveChannel;
        this.consume = z10;
    }
}
