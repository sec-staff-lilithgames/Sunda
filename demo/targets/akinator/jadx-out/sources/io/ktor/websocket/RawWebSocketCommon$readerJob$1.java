package io.ktor.websocket;

import bv.f;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {88, 92, 95, 99}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
/* loaded from: classes10.dex */
public final class RawWebSocketCommon$readerJob$1 extends n implements p {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawWebSocketCommon$readerJob$1(RawWebSocketCommon rawWebSocketCommon, d<? super RawWebSocketCommon$readerJob$1> dVar) {
        super(2, dVar);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new RawWebSocketCommon$readerJob$1(this.this$0, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[Catch: all -> 0x0036, CancellationException -> 0x0038, ProtocolViolationException -> 0x003b, FrameTooBigException -> 0x003e, ChannelIOException -> 0x009f, EOFException | ClosedReceiveChannelException -> 0x00a8, EOFException | ClosedReceiveChannelException -> 0x00a8, PHI: r10
      0x0064: PHI (r10v15 java.lang.Object) = (r10v20 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x0060, B:27:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {EOFException | ClosedReceiveChannelException -> 0x00a8, blocks: (B:18:0x0032, B:30:0x0048, B:30:0x0048, B:33:0x0064, B:33:0x0064, B:35:0x0070, B:35:0x0070, B:39:0x0082, B:39:0x0082, B:38:0x007a, B:38:0x007a, B:40:0x0085, B:40:0x0085, B:27:0x0041), top: B:64:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070 A[Catch: all -> 0x0036, CancellationException -> 0x0038, ProtocolViolationException -> 0x003b, FrameTooBigException -> 0x003e, ChannelIOException -> 0x009f, EOFException | ClosedReceiveChannelException -> 0x00a8, EOFException | ClosedReceiveChannelException -> 0x00a8, TryCatch #2 {EOFException | ClosedReceiveChannelException -> 0x00a8, blocks: (B:18:0x0032, B:30:0x0048, B:30:0x0048, B:33:0x0064, B:33:0x0064, B:35:0x0070, B:35:0x0070, B:39:0x0082, B:39:0x0082, B:38:0x007a, B:38:0x007a, B:40:0x0085, B:40:0x0085, B:27:0x0041), top: B:64:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0091 -> B:30:0x0048). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.RawWebSocketCommon$readerJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((RawWebSocketCommon$readerJob$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
