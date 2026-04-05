package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__DelayKt$sample$2$1$2 extends n implements p {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ b1 $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$1$2(b1 b1Var, FlowCollector<? super T> flowCollector, zu.d<? super FlowKt__DelayKt$sample$2$1$2> dVar) {
        super(2, dVar);
        this.$lastValue = b1Var;
        this.$downstream = flowCollector;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        x0 x0Var = x0.f87415a;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            b1 b1Var = this.$lastValue;
            Object obj2 = b1Var.f71816b;
            if (obj2 == null) {
                return x0Var;
            }
            b1Var.f71816b = null;
            FlowCollector<T> flowCollector = this.$downstream;
            if (obj2 == NullSurrogateKt.NULL) {
                obj2 = null;
            }
            this.label = 1;
            if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0Var;
    }

    @Override // kv.p
    public final Object invoke(x0 x0Var, zu.d<? super x0> dVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(x0Var, dVar)).invokeSuspend(x0.f87415a);
    }
}
