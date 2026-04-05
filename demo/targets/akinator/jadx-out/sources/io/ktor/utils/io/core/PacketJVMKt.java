package io.ktor.utils.io.core;

import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.utils.AtomicKt;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PacketJVMKt {
    private static final int PACKET_MAX_COPY_SIZE = AtomicKt.getIOIntProperty("max.copy.size", 500);

    public static final int getPACKET_MAX_COPY_SIZE() {
        return PACKET_MAX_COPY_SIZE;
    }

    public static final ByteBuffer readByteBuffer(ByteReadPacket byteReadPacket, int i10, boolean z10) {
        ByteBuffer byteBufferAllocate;
        String str;
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        if (z10) {
            byteBufferAllocate = ByteBuffer.allocateDirect(i10);
            str = "allocateDirect(n)";
        } else {
            byteBufferAllocate = ByteBuffer.allocate(i10);
            str = "allocate(n)";
        }
        e0.checkNotNullExpressionValue(byteBufferAllocate, str);
        ByteBuffersKt.readFully(byteReadPacket, byteBufferAllocate);
        byteBufferAllocate.clear();
        return byteBufferAllocate;
    }

    public static /* synthetic */ ByteBuffer readByteBuffer$default(ByteReadPacket byteReadPacket, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            long remaining = byteReadPacket.getRemaining();
            if (remaining > 2147483647L) {
                throw new IllegalArgumentException("Unable to make a ByteBuffer: packet is too big");
            }
            i10 = (int) remaining;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return readByteBuffer(byteReadPacket, i10, z10);
    }

    @f
    public static final int readText(ByteReadPacket byteReadPacket, CharsetDecoder decoder, Appendable out, int i10) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(out, "out");
        return CharsetJVMKt.decode(decoder, byteReadPacket, out, i10);
    }

    public static /* synthetic */ int readText$default(ByteReadPacket byteReadPacket, CharsetDecoder charsetDecoder, Appendable appendable, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readText(byteReadPacket, charsetDecoder, appendable, i10);
    }
}
