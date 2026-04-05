package kotlinx.coroutines.flow;

import av.e;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class SafeFlow<T> extends AbstractFlow<T> {
    private final p block;

    public SafeFlow(p pVar) {
        this.block = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector<? super T> flowCollector, zu.d<? super x0> dVar) {
        Object objInvoke = this.block.invoke(flowCollector, dVar);
        return objInvoke == e.getCOROUTINE_SUSPENDED() ? objInvoke : x0.f87415a;
    }
}
