package io.ktor.utils.io.nio;

import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.e0;
import kv.l;
import tu.f;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChannelsKt {
    @f
    public static final int read(ReadableByteChannel readableByteChannel, Buffer buffer) throws IOException {
        e0.checkNotNullParameter(readableByteChannel, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        if (buffer.getLimit() - buffer.getWritePosition() == 0) {
            return 0;
        }
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int i10 = readableByteChannel.read(MemoryJvmKt.sliceSafe(byteBufferM4458getMemorySK3TCg8, writePosition, buffer.getLimit() - writePosition));
        if (i10 == -1) {
            return -1;
        }
        buffer.commitWritten(i10);
        return i10;
    }

    /* renamed from: read-UAd2zVI, reason: not valid java name */
    public static final int m4581readUAd2zVI(ReadableByteChannel read, ByteBuffer destination, int i10, int i11) {
        e0.checkNotNullParameter(read, "$this$read");
        e0.checkNotNullParameter(destination, "destination");
        return read.read(MemoryJvmKt.sliceSafe(destination, i10, i11));
    }

    /* renamed from: read-UAd2zVI$default, reason: not valid java name */
    public static /* synthetic */ int m4582readUAd2zVI$default(ReadableByteChannel readableByteChannel, ByteBuffer byteBuffer, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteBuffer.limit() - i10;
        }
        return m4581readUAd2zVI(readableByteChannel, byteBuffer, i10, i11);
    }

    public static final ByteReadPacket readPacketAtLeast(ReadableByteChannel readableByteChannel, long j10) {
        e0.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, j10, Long.MAX_VALUE);
    }

    public static final ByteReadPacket readPacketAtMost(ReadableByteChannel readableByteChannel, long j10) {
        e0.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, 1L, j10);
    }

    public static final ByteReadPacket readPacketExact(ReadableByteChannel readableByteChannel, long j10) {
        e0.checkNotNullParameter(readableByteChannel, "<this>");
        return readPacketImpl(readableByteChannel, j10, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return new io.ktor.utils.io.core.ByteReadPacket(r9, r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final io.ktor.utils.io.core.ByteReadPacket readPacketImpl(java.nio.channels.ReadableByteChannel r18, long r19, long r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.nio.ChannelsKt.readPacketImpl(java.nio.channels.ReadableByteChannel, long, long):io.ktor.utils.io.core.ByteReadPacket");
    }

    @f
    public static final int write(WritableByteChannel writableByteChannel, Buffer buffer) throws IOException {
        e0.checkNotNullParameter(writableByteChannel, "<this>");
        e0.checkNotNullParameter(buffer, "buffer");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int iWrite = writableByteChannel.write(MemoryJvmKt.sliceSafe(byteBufferM4458getMemorySK3TCg8, readPosition, buffer.getWritePosition() - readPosition));
        buffer.discardExact(iWrite);
        return iWrite;
    }

    /* renamed from: write-UAd2zVI, reason: not valid java name */
    public static final int m4583writeUAd2zVI(WritableByteChannel write, ByteBuffer source, int i10, int i11) {
        e0.checkNotNullParameter(write, "$this$write");
        e0.checkNotNullParameter(source, "source");
        return write.write(MemoryJvmKt.sliceSafe(source, i10, i11));
    }

    /* renamed from: write-UAd2zVI$default, reason: not valid java name */
    public static /* synthetic */ int m4584writeUAd2zVI$default(WritableByteChannel writableByteChannel, ByteBuffer byteBuffer, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteBuffer.limit() - i10;
        }
        return m4583writeUAd2zVI(writableByteChannel, byteBuffer, i10, i11);
    }

    public static final ByteReadPacket writePacket(WritableByteChannel writableByteChannel, l builder) {
        e0.checkNotNullParameter(writableByteChannel, "<this>");
        e0.checkNotNullParameter(builder, "builder");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            builder.invoke(bytePacketBuilder);
            ByteReadPacket byteReadPacketBuild = bytePacketBuilder.build();
            try {
                if (writePacket(writableByteChannel, byteReadPacketBuild)) {
                    return null;
                }
                return byteReadPacketBuild;
            } catch (Throwable th2) {
                byteReadPacketBuild.release();
                throw th2;
            }
        } catch (Throwable th3) {
            bytePacketBuilder.release();
            throw th3;
        }
    }

    public static final boolean writePacket(WritableByteChannel writableByteChannel, ByteReadPacket p10) {
        int iWrite;
        e0.checkNotNullParameter(writableByteChannel, "<this>");
        e0.checkNotNullParameter(p10, "p");
        do {
            try {
                ChunkBuffer chunkBufferPrepareRead = p10.prepareRead(1);
                if (chunkBufferPrepareRead != null) {
                    int readPosition = chunkBufferPrepareRead.getReadPosition();
                    try {
                        ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareRead.m4458getMemorySK3TCg8();
                        int readPosition2 = chunkBufferPrepareRead.getReadPosition();
                        int writePosition = chunkBufferPrepareRead.getWritePosition() - readPosition2;
                        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition2, writePosition);
                        iWrite = writableByteChannel.write(byteBufferM4324slice87lwejk);
                        if (byteBufferM4324slice87lwejk.limit() == writePosition) {
                            chunkBufferPrepareRead.discardExact(byteBufferM4324slice87lwejk.position());
                            int readPosition3 = chunkBufferPrepareRead.getReadPosition();
                            if (readPosition3 >= readPosition) {
                                if (readPosition3 == chunkBufferPrepareRead.getWritePosition()) {
                                    p10.ensureNext(chunkBufferPrepareRead);
                                } else {
                                    p10.setHeadPosition(readPosition3);
                                }
                                if (p10.getEndOfInput()) {
                                    return true;
                                }
                            } else {
                                throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                            }
                        } else {
                            throw new IllegalStateException("Buffer's limit change is not allowed");
                        }
                    } catch (Throwable th2) {
                        int readPosition4 = chunkBufferPrepareRead.getReadPosition();
                        if (readPosition4 >= readPosition) {
                            if (readPosition4 == chunkBufferPrepareRead.getWritePosition()) {
                                p10.ensureNext(chunkBufferPrepareRead);
                            } else {
                                p10.setHeadPosition(readPosition4);
                            }
                            throw th2;
                        }
                        throw new IllegalStateException("Buffer's position shouldn't be rewinded");
                    }
                } else {
                    StringsKt.prematureEndOfStream(1);
                    throw new k();
                }
            } catch (Throwable th3) {
                p10.release();
                throw th3;
            }
        } while (iWrite != 0);
        return false;
    }
}
