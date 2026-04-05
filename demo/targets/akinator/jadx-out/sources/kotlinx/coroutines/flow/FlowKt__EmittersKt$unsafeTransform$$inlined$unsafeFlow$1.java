package kotlinx.coroutines.flow;

import av.e;
import kotlin.jvm.internal.b0;
import kv.q;
import tu.x0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ q $transform$inlined;

    public FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(Flow flow, q qVar) {
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined = qVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new FlowKt__EmittersKt$unsafeTransform$1$1(this.$transform$inlined, flowCollector), dVar);
        return objCollect == e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, zu.d dVar) {
        b0.mark(4);
        new bv.d(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.1
            int label;
            /* synthetic */ Object result;

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1.this.collect(null, this);
            }
        };
        b0.mark(5);
        Flow flow = this.$this_unsafeTransform$inlined;
        FlowKt__EmittersKt$unsafeTransform$1$1 flowKt__EmittersKt$unsafeTransform$1$1 = new FlowKt__EmittersKt$unsafeTransform$1$1(this.$transform$inlined, flowCollector);
        b0.mark(0);
        flow.collect(flowKt__EmittersKt$unsafeTransform$1$1, dVar);
        b0.mark(1);
        return x0.f87415a;
    }
}
