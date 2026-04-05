package io.ktor.websocket;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.jvm.internal.e0;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class RawWebSocketJvmKt {
    public static final WebSocketSession RawWebSocket(ByteReadChannel input, ByteWriteChannel output, long j10, boolean z10, m coroutineContext) {
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(output, "output");
        e0.checkNotNullParameter(coroutineContext, "coroutineContext");
        return new RawWebSocketJvm(input, output, j10, z10, coroutineContext, null, 32, null);
    }

    public static /* synthetic */ WebSocketSession RawWebSocket$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j10, boolean z10, m mVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j10 = 2147483647L;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return RawWebSocket(byteReadChannel, byteWriteChannel, j11, z10, mVar);
    }
}
