package io.ktor.websocket.internals;

import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.OutputArraysJVMKt;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.jvm.internal.e0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DeflaterUtilsKt {
    private static final byte[] PADDED_EMPTY_CHUNK = {0, 0, 0, -1, -1};
    private static final byte[] EMPTY_CHUNK = {0, 0, -1, -1};

    public static final byte[] deflateFully(Deflater deflater, byte[] data) {
        e0.checkNotNullParameter(deflater, "<this>");
        e0.checkNotNullParameter(data, "data");
        deflater.setInput(data);
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            ObjectPool<ByteBuffer> ktorDefaultPool = ByteBufferPoolKt.getKtorDefaultPool();
            ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
            try {
                ByteBuffer byteBuffer = byteBufferBorrow;
                while (!deflater.needsInput()) {
                    deflateTo(bytePacketBuilder, deflater, byteBuffer, false);
                }
                do {
                } while (deflateTo(bytePacketBuilder, deflater, byteBuffer, true) != 0);
                ktorDefaultPool.recycle(byteBufferBorrow);
                ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
                if (BytePacketUtilsKt.endsWith(byteReadPacketBuild, PADDED_EMPTY_CHUNK)) {
                    byte[] bytes = StringsKt.readBytes(byteReadPacketBuild, ((int) byteReadPacketBuild.getRemaining()) - EMPTY_CHUNK.length);
                    byteReadPacketBuild.release();
                    return bytes;
                }
                bytePacketBuilder = new BytePacketBuilder(null, 1, null);
                try {
                    bytePacketBuilder.writePacket(byteReadPacketBuild);
                    bytePacketBuilder.writeByte((byte) 0);
                    return StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null);
                } finally {
                }
            } catch (Throwable th2) {
                ktorDefaultPool.recycle(byteBufferBorrow);
                throw th2;
            }
        } finally {
        }
    }

    private static final int deflateTo(BytePacketBuilder bytePacketBuilder, Deflater deflater, ByteBuffer byteBuffer, boolean z10) {
        byteBuffer.clear();
        int iDeflate = z10 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBuffer);
        return iDeflate;
    }

    public static final byte[] inflateFully(Inflater inflater, byte[] data) {
        e0.checkNotNullParameter(inflater, "<this>");
        e0.checkNotNullParameter(data, "data");
        inflater.setInput(f0.plus(data, EMPTY_CHUNK));
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            ObjectPool<ByteBuffer> ktorDefaultPool = ByteBufferPoolKt.getKtorDefaultPool();
            ByteBuffer byteBufferBorrow = ktorDefaultPool.borrow();
            try {
                ByteBuffer byteBuffer = byteBufferBorrow;
                long length = r11.length + inflater.getBytesRead();
                while (inflater.getBytesRead() < length) {
                    byteBuffer.clear();
                    byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                    byteBuffer.flip();
                    OutputArraysJVMKt.writeFully(bytePacketBuilder, byteBuffer);
                }
                ktorDefaultPool.recycle(byteBufferBorrow);
                return StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null);
            } catch (Throwable th2) {
                ktorDefaultPool.recycle(byteBufferBorrow);
                throw th2;
            }
        } catch (Throwable th3) {
            bytePacketBuilder.release();
            throw th3;
        }
    }
}
