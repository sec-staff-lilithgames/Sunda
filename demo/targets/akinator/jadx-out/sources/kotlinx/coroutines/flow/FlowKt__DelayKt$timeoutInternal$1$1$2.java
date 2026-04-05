package kotlinx.coroutines.flow;

import av.e;
import bv.f;
import bv.n;
import kotlinx.coroutines.TimeoutCancellationException;
import kv.l;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends n implements l {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j10, zu.d<? super FlowKt__DelayKt$timeoutInternal$1$1$2> dVar) {
        super(1, dVar);
        this.$timeout = j10;
    }

    @Override // bv.a
    public final zu.d<x0> create(zu.d<?> dVar) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        a0.throwOnFailure(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) tv.f.m7219toStringimpl(this.$timeout)));
    }

    @Override // kv.l
    public final Object invoke(zu.d<?> dVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(dVar)).invokeSuspend(x0.f87415a);
    }
}
