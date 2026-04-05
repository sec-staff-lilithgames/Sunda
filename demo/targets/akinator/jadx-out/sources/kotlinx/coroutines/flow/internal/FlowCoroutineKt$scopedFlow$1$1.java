package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowCoroutineKt$scopedFlow$1$1 extends n implements p {
    final /* synthetic */ q $block;
    final /* synthetic */ FlowCollector<R> $this_flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(q qVar, FlowCollector<? super R> flowCollector, d<? super FlowCoroutineKt$scopedFlow$1$1> dVar) {
        super(2, dVar);
        this.$block = qVar;
        this.$this_flow = flowCollector;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_flow, dVar);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            q qVar = this.$block;
            Object obj2 = this.$this_flow;
            this.label = 1;
            if (qVar.invoke(coroutineScope, obj2, this) == coroutine_suspended) {
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
        return ((FlowCoroutineKt$scopedFlow$1$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
