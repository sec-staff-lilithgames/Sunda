package kotlinx.coroutines.flow;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import tu.f;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final /* synthetic */ class FlowKt__ContextKt {
    public static final <T> Flow<T> buffer(Flow<? extends T> flow, int i10, BufferOverflow bufferOverflow) {
        if (i10 < 0 && i10 != -2 && i10 != -1) {
            throw new IllegalArgumentException(a.b.e(i10, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i10 == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == -1) {
            bufferOverflow = BufferOverflow.DROP_OLDEST;
            i10 = 0;
        }
        int i11 = i10;
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if (flow instanceof FusibleFlow) {
            return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, null, i11, bufferOverflow2, 1, null);
        }
        return new ChannelFlowOperatorImpl(flow, null, i11, bufferOverflow2, 2, null);
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i10, BufferOverflow bufferOverflow, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        if ((i11 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow, i10, bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> cancellable(Flow<? extends T> flow) {
        return flow instanceof CancellableFlow ? flow : new CancellableFlowImpl(flow);
    }

    private static final void checkFlowContext$FlowKt__ContextKt(m mVar) {
        if (mVar.get(Job.Key) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + mVar).toString());
    }

    public static final <T> Flow<T> conflate(Flow<? extends T> flow) {
        return buffer$default(flow, -1, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> flowOn(Flow<? extends T> flow, m mVar) {
        checkFlowContext$FlowKt__ContextKt(mVar);
        if (e0.areEqual(mVar, n.f98854b)) {
            return flow;
        }
        if (flow instanceof FusibleFlow) {
            return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, mVar, 0, null, 6, null);
        }
        return new ChannelFlowOperatorImpl(flow, mVar, 0, null, 12, null);
    }

    public static /* synthetic */ Flow buffer$default(Flow flow, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -2;
        }
        return buffer(flow, i10);
    }

    @f
    public static final /* synthetic */ Flow buffer(Flow flow, int i10) {
        return buffer$default(flow, i10, null, 2, null);
    }
}
