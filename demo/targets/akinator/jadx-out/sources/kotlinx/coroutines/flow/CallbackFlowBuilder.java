package kotlinx.coroutines.flow;

import bv.f;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kv.p;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class CallbackFlowBuilder<T> extends ChannelFlowBuilder<T> {
    private final p block;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends bv.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CallbackFlowBuilder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CallbackFlowBuilder<T> callbackFlowBuilder, zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = callbackFlowBuilder;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collectTo(null, this);
        }
    }

    public /* synthetic */ CallbackFlowBuilder(p pVar, m mVar, int i10, BufferOverflow bufferOverflow, int i11, u uVar) {
        this(pVar, (i11 & 2) != 0 ? n.f98854b : mVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r5, zu.d<? super tu.x0> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.CallbackFlowBuilder.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = (kotlinx.coroutines.flow.CallbackFlowBuilder.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1 r0 = new kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            tu.a0.throwOnFailure(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            tu.a0.throwOnFailure(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = super.collectTo(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.isClosedForSend()
            if (r5 == 0) goto L4c
            tu.x0 r5 = tu.x0.f87415a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.CallbackFlowBuilder.collectTo(kotlinx.coroutines.channels.ProducerScope, zu.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(m mVar, int i10, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.block, mVar, i10, bufferOverflow);
    }

    public CallbackFlowBuilder(p pVar, m mVar, int i10, BufferOverflow bufferOverflow) {
        super(pVar, mVar, i10, bufferOverflow);
        this.block = pVar;
    }
}
