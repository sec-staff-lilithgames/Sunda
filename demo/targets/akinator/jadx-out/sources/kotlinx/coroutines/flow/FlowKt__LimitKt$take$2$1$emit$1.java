package kotlinx.coroutines.flow;

import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {59, 61}, m = "emit", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__LimitKt$take$2$1$emit$1 extends bv.d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__LimitKt$take$2$1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1$emit$1(FlowKt__LimitKt$take$2$1<? super T> flowKt__LimitKt$take$2$1, zu.d<? super FlowKt__LimitKt$take$2$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = flowKt__LimitKt$take$2$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
