package kotlinx.coroutines.flow.internal;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.flow.FlowCollector;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class UndispatchedContextCollector$emitRef$1 extends n implements p {
    final /* synthetic */ FlowCollector<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(FlowCollector<? super T> flowCollector, d<? super UndispatchedContextCollector$emitRef$1> dVar) {
        super(2, dVar);
        this.$downstream = flowCollector;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, dVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((UndispatchedContextCollector$emitRef$1) obj, (d<? super x0>) obj2);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            Object obj2 = this.L$0;
            FlowCollector<T> flowCollector = this.$downstream;
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
        return x0.f87415a;
    }

    public final Object invoke(T t10, d<? super x0> dVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(t10, dVar)).invokeSuspend(x0.f87415a);
    }
}
