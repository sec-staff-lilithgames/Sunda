package kotlinx.coroutines.flow;

import bv.f;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__ReduceKt$reduce$2$emit$1 extends bv.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__ReduceKt.C41682<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$reduce$2$emit$1(FlowKt__ReduceKt.C41682<? super T> c41682, zu.d<? super FlowKt__ReduceKt$reduce$2$emit$1> dVar) {
        super(dVar);
        this.this$0 = c41682;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
