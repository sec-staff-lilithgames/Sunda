package kotlinx.coroutines.flow;

import av.e;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.internal.CombineKt;
import kv.p;
import tu.x0;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flowArray$inlined;
    final /* synthetic */ p $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$3(Flow[] flowArr, p pVar) {
        this.$flowArray$inlined = flowArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, zu.d<? super x0> dVar) {
        Flow[] flowArr = this.$flowArray$inlined;
        e0.needClassReification();
        FlowKt__ZipKt$combine$6$1 flowKt__ZipKt$combine$6$1 = new FlowKt__ZipKt$combine$6$1(this.$flowArray$inlined);
        e0.needClassReification();
        Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$6$1, new FlowKt__ZipKt$combine$6$2(this.$transform$inlined, null), dVar);
        return objCombineInternal == e.getCOROUTINE_SUSPENDED() ? objCombineInternal : x0.f87415a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, zu.d dVar) {
        b0.mark(4);
        new bv.d(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3.1
            int label;
            /* synthetic */ Object result;

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$3.this.collect(null, this);
            }
        };
        b0.mark(5);
        Flow[] flowArr = this.$flowArray$inlined;
        e0.needClassReification();
        FlowKt__ZipKt$combine$6$1 flowKt__ZipKt$combine$6$1 = new FlowKt__ZipKt$combine$6$1(this.$flowArray$inlined);
        e0.needClassReification();
        FlowKt__ZipKt$combine$6$2 flowKt__ZipKt$combine$6$2 = new FlowKt__ZipKt$combine$6$2(this.$transform$inlined, null);
        b0.mark(0);
        CombineKt.combineInternal(flowCollector, flowArr, flowKt__ZipKt$combine$6$1, flowKt__ZipKt$combine$6$2, dVar);
        b0.mark(1);
        return x0.f87415a;
    }
}
