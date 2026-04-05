package kotlinx.coroutines.flow;

import bv.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {34, 35, 37}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
public final class FlowKt__LimitKt$dropWhile$1$1$emit$1 extends bv.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__LimitKt$dropWhile$1$1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1$emit$1(FlowKt__LimitKt$dropWhile$1$1<? super T> flowKt__LimitKt$dropWhile$1$1, zu.d<? super FlowKt__LimitKt$dropWhile$1$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = flowKt__LimitKt$dropWhile$1$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
