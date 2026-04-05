package kotlinx.coroutines.flow.internal;

import av.e;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import kv.p;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    private final Object countOrElement;
    private final m emitContext;
    private final p emitRef;

    public UndispatchedContextCollector(FlowCollector<? super T> flowCollector, m mVar) {
        this.emitContext = mVar;
        this.countOrElement = ThreadContextKt.threadContextElements(mVar);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t10, d<? super x0> dVar) {
        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(this.emitContext, t10, this.countOrElement, this.emitRef, dVar);
        return objWithContextUndispatched == e.getCOROUTINE_SUSPENDED() ? objWithContextUndispatched : x0.f87415a;
    }
}
