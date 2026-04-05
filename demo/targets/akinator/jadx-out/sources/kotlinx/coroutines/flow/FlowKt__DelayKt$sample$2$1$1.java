package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__DelayKt$sample$2$1$1 extends n implements p {
    final /* synthetic */ b1 $lastValue;
    final /* synthetic */ ReceiveChannel<x0> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(b1 b1Var, ReceiveChannel<x0> receiveChannel, zu.d<? super FlowKt__DelayKt$sample$2$1$1> dVar) {
        super(2, dVar);
        this.$lastValue = b1Var;
        this.$ticker = receiveChannel;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, dVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m5180invokeWpGqRn0(((ChannelResult) obj).m5165unboximpl(), (zu.d) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m5180invokeWpGqRn0(Object obj, zu.d<? super x0> dVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(ChannelResult.m5153boximpl(obj), dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        Object objM5165unboximpl = ((ChannelResult) this.L$0).m5165unboximpl();
        b1 b1Var = this.$lastValue;
        boolean z10 = objM5165unboximpl instanceof ChannelResult.Failed;
        if (!z10) {
            b1Var.f71816b = objM5165unboximpl;
        }
        ReceiveChannel<x0> receiveChannel = this.$ticker;
        if (z10) {
            Throwable thM5157exceptionOrNullimpl = ChannelResult.m5157exceptionOrNullimpl(objM5165unboximpl);
            if (thM5157exceptionOrNullimpl != null) {
                throw thM5157exceptionOrNullimpl;
            }
            receiveChannel.cancel((CancellationException) new ChildCancelledException());
            b1Var.f71816b = NullSurrogateKt.DONE;
        }
        return x0.f87415a;
    }
}
