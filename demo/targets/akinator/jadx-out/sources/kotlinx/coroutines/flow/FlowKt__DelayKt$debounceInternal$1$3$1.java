package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kv.l;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends n implements l {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ b1 $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$1(FlowCollector<? super T> flowCollector, b1 b1Var, zu.d<? super FlowKt__DelayKt$debounceInternal$1$3$1> dVar) {
        super(1, dVar);
        this.$downstream = flowCollector;
        this.$lastValue = b1Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(zu.d<?> dVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, this.$lastValue, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            FlowCollector<T> flowCollector = this.$downstream;
            Symbol symbol = NullSurrogateKt.NULL;
            Object obj2 = this.$lastValue.f71816b;
            if (obj2 == symbol) {
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
        this.$lastValue.f71816b = null;
        return x0.f87415a;
    }

    @Override // kv.l
    public final Object invoke(zu.d<? super x0> dVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(dVar)).invokeSuspend(x0.f87415a);
    }
}
