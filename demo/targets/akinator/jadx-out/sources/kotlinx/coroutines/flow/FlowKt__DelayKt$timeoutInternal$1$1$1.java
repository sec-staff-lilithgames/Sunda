package kotlinx.coroutines.flow;

import bv.f;
import bv.n;
import kotlinx.coroutines.channels.ChannelResult;
import kv.p;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends n implements p {
    final /* synthetic */ FlowCollector<T> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector<? super T> flowCollector, zu.d<? super FlowKt__DelayKt$timeoutInternal$1$1$1> dVar) {
        super(2, dVar);
        this.$downStream = flowCollector;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, dVar);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m5181invokeWpGqRn0(((ChannelResult) obj).m5165unboximpl(), (zu.d) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m5181invokeWpGqRn0(Object obj, zu.d<? super Boolean> dVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(ChannelResult.m5153boximpl(obj), dVar)).invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r4.L$0
            tu.a0.throwOnFailure(r5)
            goto L36
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            tu.a0.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.m5165unboximpl()
            kotlinx.coroutines.flow.FlowCollector<T> r1 = r4.$downStream
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r3 != 0) goto L37
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r1.emit(r5, r4)
            if (r1 != r0) goto L35
            return r0
        L35:
            r0 = r5
        L36:
            r5 = r0
        L37:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto L49
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.m5157exceptionOrNullimpl(r5)
            if (r5 != 0) goto L48
            r5 = 0
            java.lang.Boolean r5 = bv.b.boxBoolean(r5)
            return r5
        L48:
            throw r5
        L49:
            java.lang.Boolean r5 = bv.b.boxBoolean(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
