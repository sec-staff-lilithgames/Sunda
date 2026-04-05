package kotlinx.coroutines.flow.internal;

import bv.d;
import bv.f;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1<? super T> anonymousClass1, zu.d<? super ChannelFlowTransformLatest$flowCollect$3$1$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
