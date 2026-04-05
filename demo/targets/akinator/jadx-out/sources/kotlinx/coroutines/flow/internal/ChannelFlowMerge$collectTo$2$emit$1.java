package kotlinx.coroutines.flow.internal;

import bv.d;
import bv.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {62}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChannelFlowMerge.AnonymousClass2<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(ChannelFlowMerge.AnonymousClass2<? super T> anonymousClass2, zu.d<? super ChannelFlowMerge$collectTo$2$emit$1> dVar) {
        super(dVar);
        this.this$0 = anonymousClass2;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Flow) null, (zu.d<? super x0>) this);
    }
}
