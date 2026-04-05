package io.ktor.websocket;

import av.e;
import bv.f;
import bv.n;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", i = {0, 0}, l = {40}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes10.dex */
public final class WebSocketWriter$writeLoopJob$1 extends n implements p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WebSocketWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketWriter$writeLoopJob$1(WebSocketWriter webSocketWriter, d<? super WebSocketWriter$writeLoopJob$1> dVar) {
        super(2, dVar);
        this.this$0 = webSocketWriter;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new WebSocketWriter$writeLoopJob$1(this.this$0, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ObjectPool pool;
        Object obj2;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.L$1;
            pool = (ObjectPool) this.L$0;
            try {
                a0.throwOnFailure(obj);
                pool.recycle(obj2);
                return x0.f87415a;
            } catch (Throwable th2) {
                th = th2;
                pool.recycle(obj2);
                throw th;
            }
        }
        a0.throwOnFailure(obj);
        pool = this.this$0.getPool();
        WebSocketWriter webSocketWriter = this.this$0;
        Object objBorrow = pool.borrow();
        try {
            this.L$0 = pool;
            this.L$1 = objBorrow;
            this.label = 1;
            if (webSocketWriter.writeLoop((ByteBuffer) objBorrow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = objBorrow;
            pool.recycle(obj2);
            return x0.f87415a;
        } catch (Throwable th3) {
            th = th3;
            obj2 = objBorrow;
            pool.recycle(obj2);
            throw th;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((WebSocketWriter$writeLoopJob$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
