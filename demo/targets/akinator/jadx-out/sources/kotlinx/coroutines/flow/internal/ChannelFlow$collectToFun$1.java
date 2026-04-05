package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.channels.ProducerScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class ChannelFlow$collectToFun$1 extends n implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlow<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(ChannelFlow<T> channelFlow, d<? super ChannelFlow$collectToFun$1> dVar) {
        super(2, dVar);
        this.this$0 = channelFlow;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.this$0, dVar);
        channelFlow$collectToFun$1.L$0 = obj;
        return channelFlow$collectToFun$1;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            ChannelFlow<T> channelFlow = this.this$0;
            this.label = 1;
            if (channelFlow.collectTo(producerScope, this) == coroutine_suspended) {
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
    public final Object invoke(ProducerScope<? super T> producerScope, d<? super x0> dVar) {
        return ((ChannelFlow$collectToFun$1) create(producerScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
