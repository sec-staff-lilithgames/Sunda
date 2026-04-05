package kotlinx.coroutines.flow.internal;

import av.e;
import bv.h;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kv.p;
import kv.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowCoroutineKt {
    public static final <R> Object flowScope(p pVar, d<? super R> dVar) {
        FlowCoroutine flowCoroutine = new FlowCoroutine(dVar.getContext(), dVar);
        Object objStartUndispatchedOrReturn = UndispatchedKt.startUndispatchedOrReturn(flowCoroutine, flowCoroutine, pVar);
        if (objStartUndispatchedOrReturn == e.getCOROUTINE_SUSPENDED()) {
            h.probeCoroutineSuspended(dVar);
        }
        return objStartUndispatchedOrReturn;
    }

    public static final <R> Flow<R> scopedFlow(final q qVar) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, d<? super x0> dVar) {
                Object objFlowScope = FlowCoroutineKt.flowScope(new FlowCoroutineKt$scopedFlow$1$1(qVar, flowCollector, null), dVar);
                return objFlowScope == e.getCOROUTINE_SUSPENDED() ? objFlowScope : x0.f87415a;
            }
        };
    }
}
