package io.ktor.utils.io;

import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteChannelKt {
    public static final ByteChannel ByteChannel(boolean z10) {
        return new ByteBufferChannel(z10, null, 0, 6, null);
    }

    public static /* synthetic */ ByteChannel ByteChannel$default(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return ByteChannel(z10);
    }

    public static final ByteReadChannel ByteReadChannel(ByteBuffer content) {
        e0.checkNotNullParameter(content, "content");
        return new ByteBufferChannel(content);
    }

    public static final ByteChannel ByteChannel(boolean z10, final l exceptionMapper) {
        e0.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        return new ByteBufferChannel(z10) { // from class: io.ktor.utils.io.ByteChannelKt.ByteChannel.1
            {
                int i10 = 6;
                u uVar = null;
                ObjectPool objectPool = null;
                int i11 = 0;
            }

            @Override // io.ktor.utils.io.ByteBufferChannel, io.ktor.utils.io.ByteWriteChannel
            public boolean close(Throwable th2) {
                return super.close((Throwable) exceptionMapper.invoke(th2));
            }
        };
    }

    public static /* synthetic */ ByteChannel ByteChannel$default(boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return ByteChannel(z10, lVar);
    }

    public static final ByteReadChannel ByteReadChannel(byte[] content, int i10, int i11) {
        e0.checkNotNullParameter(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, i10, i11);
        e0.checkNotNullExpressionValue(byteBufferWrap, "wrap(content, offset, length)");
        return new ByteBufferChannel(byteBufferWrap);
    }
}
