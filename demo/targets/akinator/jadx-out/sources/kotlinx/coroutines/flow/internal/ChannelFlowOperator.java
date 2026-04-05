package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class ChannelFlowOperator<S, T> extends ChannelFlow<T> {
    protected final Flow<S> flow;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    public static final class AnonymousClass2 extends n implements p {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowOperator<S, T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChannelFlowOperator<S, T> channelFlowOperator, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.this$0 = channelFlowOperator;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                FlowCollector<? super T> flowCollector = (FlowCollector) this.L$0;
                ChannelFlowOperator<S, T> channelFlowOperator = this.this$0;
                this.label = 1;
                if (channelFlowOperator.flowCollect(flowCollector, this) == coroutine_suspended) {
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
        public final Object invoke(FlowCollector<? super T> flowCollector, d<? super x0> dVar) {
            return ((AnonymousClass2) create(flowCollector, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(Flow<? extends S> flow, m mVar, int i10, BufferOverflow bufferOverflow) {
        super(mVar, i10, bufferOverflow);
        this.flow = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <S, T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, zu.d<? super tu.x0> r6) {
        /*
            int r0 = r4.capacity
            r1 = -3
            if (r0 != r1) goto L3b
            zu.m r0 = r6.getContext()
            zu.m r1 = r4.context
            zu.m r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r0, r1)
            boolean r2 = kotlin.jvm.internal.e0.areEqual(r1, r0)
            if (r2 == 0) goto L20
            java.lang.Object r4 = r4.flowCollect(r5, r6)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L46
            return r4
        L20:
            zu.f r2 = zu.f.f98853b
            zu.k r3 = r1.get(r2)
            zu.k r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r3, r0)
            if (r0 == 0) goto L3b
            java.lang.Object r4 = r4.collectWithContextUndispatched(r5, r1, r6)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L46
            return r4
        L3b:
            java.lang.Object r4 = super.collect(r5, r6)
            java.lang.Object r5 = av.e.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L46
            return r4
        L46:
            tu.x0 r4 = tu.x0.f87415a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowOperator.collect$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator, kotlinx.coroutines.flow.FlowCollector, zu.d):java.lang.Object");
    }

    public static /* synthetic */ <S, T> Object collectTo$suspendImpl(ChannelFlowOperator<S, T> channelFlowOperator, ProducerScope<? super T> producerScope, d<? super x0> dVar) {
        Object objFlowCollect = channelFlowOperator.flowCollect(new SendingCollector(producerScope), dVar);
        return objFlowCollect == e.getCOROUTINE_SUSPENDED() ? objFlowCollect : x0.f87415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectWithContextUndispatched(FlowCollector<? super T> flowCollector, m mVar, d<? super x0> dVar) {
        return ChannelFlowKt.withContextUndispatched$default(mVar, ChannelFlowKt.withUndispatchedContextCollector(flowCollector, dVar.getContext()), null, new AnonymousClass2(this, null), dVar, 4, null);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, d<? super x0> dVar) {
        return collect$suspendImpl((ChannelFlowOperator) this, (FlowCollector) flowCollector, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, d<? super x0> dVar) {
        return collectTo$suspendImpl(this, producerScope, dVar);
    }

    public abstract Object flowCollect(FlowCollector<? super T> flowCollector, d<? super x0> dVar);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return this.flow + " -> " + super.toString();
    }
}
