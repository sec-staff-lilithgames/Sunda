package io.ktor.websocket;

import av.e;
import bv.f;
import bv.n;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1", f = "DefaultWebSocketSession.kt", i = {}, l = {Sdk.SDKError.Reason.MRAID_ERROR_VALUE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 extends n implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, d<? super DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1 = new DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1(this.this$0, dVar);
        defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1;
    }

    @Override // kv.p
    public final Object invoke(CloseReason closeReason, d<? super x0> dVar) {
        return ((DefaultWebSocketSessionImpl$runOrCancelPinger$newPinger$1) create(closeReason, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CloseReason closeReason = (CloseReason) this.L$0;
            DefaultWebSocketSessionImpl defaultWebSocketSessionImpl = this.this$0;
            IOException iOException = new IOException("Ping timeout");
            this.label = 1;
            if (defaultWebSocketSessionImpl.sendCloseSequence(closeReason, iOException, this) == coroutine_suspended) {
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
}
