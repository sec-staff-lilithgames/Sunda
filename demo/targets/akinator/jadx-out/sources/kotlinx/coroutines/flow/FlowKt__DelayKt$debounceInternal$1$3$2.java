package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
/* loaded from: classes10.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends n implements p {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ b1 $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(b1 b1Var, FlowCollector<? super T> flowCollector, zu.d<? super FlowKt__DelayKt$debounceInternal$1$3$2> dVar) {
        super(2, dVar);
        this.$lastValue = b1Var;
        this.$downstream = flowCollector;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, dVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m5179invokeWpGqRn0(((ChannelResult) obj).m5165unboximpl(), (zu.d) obj2);
    }

    /* renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m5179invokeWpGqRn0(Object obj, zu.d<? super x0> dVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(ChannelResult.m5153boximpl(obj), dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        b1 b1Var;
        b1 b1Var2;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Object objM5165unboximpl = ((ChannelResult) this.L$0).m5165unboximpl();
            b1Var = this.$lastValue;
            boolean z10 = objM5165unboximpl instanceof ChannelResult.Failed;
            if (!z10) {
                b1Var.f71816b = objM5165unboximpl;
            }
            FlowCollector<T> flowCollector = this.$downstream;
            if (z10) {
                Throwable thM5157exceptionOrNullimpl = ChannelResult.m5157exceptionOrNullimpl(objM5165unboximpl);
                if (thM5157exceptionOrNullimpl != null) {
                    throw thM5157exceptionOrNullimpl;
                }
                Object obj2 = b1Var.f71816b;
                if (obj2 != null) {
                    if (obj2 == NullSurrogateKt.NULL) {
                        obj2 = null;
                    }
                    this.L$0 = objM5165unboximpl;
                    this.L$1 = b1Var;
                    this.label = 1;
                    if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    b1Var2 = b1Var;
                }
                b1Var.f71816b = NullSurrogateKt.DONE;
            }
            return x0.f87415a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b1Var2 = (b1) this.L$1;
        a0.throwOnFailure(obj);
        b1Var = b1Var2;
        b1Var.f71816b = NullSurrogateKt.DONE;
        return x0.f87415a;
    }
}
