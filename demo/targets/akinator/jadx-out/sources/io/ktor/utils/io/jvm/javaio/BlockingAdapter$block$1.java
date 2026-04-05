package io.ktor.utils.io.jvm.javaio;

import av.e;
import bv.f;
import bv.n;
import kv.l;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.utils.io.jvm.javaio.BlockingAdapter$block$1", f = "Blocking.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class BlockingAdapter$block$1 extends n implements l {
    int label;
    final /* synthetic */ BlockingAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockingAdapter$block$1(BlockingAdapter blockingAdapter, d<? super BlockingAdapter$block$1> dVar) {
        super(1, dVar);
        this.this$0 = blockingAdapter;
    }

    @Override // bv.a
    public final d<x0> create(d<?> dVar) {
        return new BlockingAdapter$block$1(this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            BlockingAdapter blockingAdapter = this.this$0;
            this.label = 1;
            if (blockingAdapter.loop(this) == coroutine_suspended) {
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

    @Override // kv.l
    public final Object invoke(d<? super x0> dVar) {
        return ((BlockingAdapter$block$1) create(dVar)).invokeSuspend(x0.f87415a);
    }
}
