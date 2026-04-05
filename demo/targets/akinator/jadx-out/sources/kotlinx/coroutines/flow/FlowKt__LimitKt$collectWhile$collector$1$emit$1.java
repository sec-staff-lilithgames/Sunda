package kotlinx.coroutines.flow;

import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {128}, m = "emit", n = {"this"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class FlowKt__LimitKt$collectWhile$collector$1$emit$1 extends bv.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__LimitKt$collectWhile$collector$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__LimitKt$collectWhile$collector$1$emit$1(FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1, zu.d<? super FlowKt__LimitKt$collectWhile$collector$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = flowKt__LimitKt$collectWhile$collector$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
