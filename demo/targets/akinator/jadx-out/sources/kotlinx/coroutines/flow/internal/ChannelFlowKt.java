package kotlinx.coroutines.flow.internal;

import av.b;
import av.e;
import bv.a;
import bv.h;
import kotlin.jvm.internal.h1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import kv.p;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelFlowKt {
    public static final <T> ChannelFlow<T> asChannelFlow(Flow<? extends T> flow) {
        ChannelFlow<T> channelFlow = flow instanceof ChannelFlow ? (ChannelFlow) flow : null;
        if (channelFlow == null) {
            return new ChannelFlowOperatorImpl(flow, null, 0, null, 14, null);
        }
        return channelFlow;
    }

    public static final <T, V> Object withContextUndispatched(m mVar, V v10, Object obj, p pVar, d<? super T> dVar) {
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(mVar, obj);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(dVar, mVar);
            Object objWrapWithContinuationImpl = !(pVar instanceof a) ? b.wrapWithContinuationImpl(pVar, v10, stackFrameContinuation) : ((p) h1.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(v10, stackFrameContinuation);
            ThreadContextKt.restoreThreadContext(mVar, objUpdateThreadContext);
            if (objWrapWithContinuationImpl == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return objWrapWithContinuationImpl;
        } catch (Throwable th2) {
            ThreadContextKt.restoreThreadContext(mVar, objUpdateThreadContext);
            throw th2;
        }
    }

    public static /* synthetic */ Object withContextUndispatched$default(m mVar, Object obj, Object obj2, p pVar, d dVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = ThreadContextKt.threadContextElements(mVar);
        }
        return withContextUndispatched(mVar, obj, obj2, pVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> FlowCollector<T> withUndispatchedContextCollector(FlowCollector<? super T> flowCollector, m mVar) {
        return ((flowCollector instanceof SendingCollector) || (flowCollector instanceof NopCollector)) ? flowCollector : new UndispatchedContextCollector(flowCollector, mVar);
    }
}
