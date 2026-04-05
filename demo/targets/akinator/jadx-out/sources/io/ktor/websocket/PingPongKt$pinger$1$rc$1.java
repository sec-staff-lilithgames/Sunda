package io.ktor.websocket;

import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import io.ktor.websocket.Frame;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kv.p;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@f(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, 79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
public final class PingPongKt$pinger$1$rc$1 extends n implements p {
    final /* synthetic */ Channel<Frame.Pong> $channel;
    final /* synthetic */ SendChannel<Frame> $outgoing;
    final /* synthetic */ String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PingPongKt$pinger$1$rc$1(SendChannel<? super Frame> sendChannel, String str, Channel<Frame.Pong> channel, d<? super PingPongKt$pinger$1$rc$1> dVar) {
        super(2, dVar);
        this.$outgoing = sendChannel;
        this.$pingMessage = str;
        this.$channel = channel;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, dVar);
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((PingPongKt$pinger$1$rc$1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0065 -> B:20:0x0068). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            tu.a0.throwOnFailure(r9)
            goto L68
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1b:
            tu.a0.throwOnFailure(r9)
            goto L5d
        L1f:
            tu.a0.throwOnFailure(r9)
            bx.a r9 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.String r1 = "WebSocket Pinger: sending ping frame"
            r9.trace(r1)
            kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame> r9 = r8.$outgoing
            io.ktor.websocket.Frame$Ping r1 = new io.ktor.websocket.Frame$Ping
            java.lang.String r5 = r8.$pingMessage
            java.nio.charset.Charset r6 = sv.g.f86137e
            java.nio.charset.Charset r7 = sv.g.f86134b
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r6, r7)
            if (r7 == 0) goto L40
            byte[] r5 = sv.k0.encodeToByteArray(r5)
            goto L51
        L40:
            java.nio.charset.CharsetEncoder r6 = r6.newEncoder()
            java.lang.String r7 = "charset.newEncoder()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r6, r7)
            int r7 = r5.length()
            byte[] r5 = io.ktor.utils.io.charsets.CharsetJVMKt.encodeToByteArray(r6, r5, r2, r7)
        L51:
            r1.<init>(r5)
            r8.label = r4
            java.lang.Object r9 = r9.send(r1, r8)
            if (r9 != r0) goto L5d
            goto L67
        L5d:
            kotlinx.coroutines.channels.Channel<io.ktor.websocket.Frame$Pong> r9 = r8.$channel
            r8.label = r3
            java.lang.Object r9 = r9.receive(r8)
            if (r9 != r0) goto L68
        L67:
            return r0
        L68:
            io.ktor.websocket.Frame$Pong r9 = (io.ktor.websocket.Frame.Pong) r9
            byte[] r1 = r9.getData()
            java.nio.charset.Charset r4 = sv.g.f86137e
            int r5 = r1.length
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2, r5, r4)
            java.lang.String r1 = r8.$pingMessage
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r6, r1)
            if (r1 == 0) goto L96
            bx.a r0 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WebSocket Pinger: received valid pong frame "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.trace(r9)
            tu.x0 r9 = tu.x0.f87415a
            return r9
        L96:
            bx.a r1 = io.ktor.websocket.DefaultWebSocketSessionKt.getLOGGER()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "WebSocket Pinger: received invalid pong frame "
            r4.<init>(r5)
            r4.append(r9)
            r9 = 0
            java.lang.String r9 = com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA.gWWomVkCYii
            r4.append(r9)
            java.lang.String r9 = r4.toString()
            r1.trace(r9)
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.PingPongKt$pinger$1$rc$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
