package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends n implements p {
    final /* synthetic */ SendingCollector<T> $collector;
    final /* synthetic */ Flow<T> $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge$collectTo$2$1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, d<? super ChannelLimitedFlowMerge$collectTo$2$1> dVar) {
        super(2, dVar);
        this.$flow = flow;
        this.$collector = sendingCollector;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.$flow, this.$collector, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Flow<T> flow = this.$flow;
            FlowCollector flowCollector = this.$collector;
            this.label = 1;
            if (flow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
