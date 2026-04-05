package io.ktor.utils.io;

import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kv.l;
import kv.p;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ByteWriteChannel {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static /* synthetic */ Object write$default(ByteWriteChannel byteWriteChannel, int i10, l lVar, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return byteWriteChannel.write(i10, lVar, dVar);
        }

        public static /* synthetic */ int writeAvailable$default(ByteWriteChannel byteWriteChannel, int i10, l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writeAvailable");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return byteWriteChannel.writeAvailable(i10, lVar);
        }
    }

    Object awaitFreeSpace(d<? super x0> dVar);

    boolean close(Throwable th2);

    void flush();

    boolean getAutoFlush();

    int getAvailableForWrite();

    Throwable getClosedCause();

    long getTotalBytesWritten();

    boolean isClosedForWrite();

    Object write(int i10, l lVar, d<? super x0> dVar);

    int writeAvailable(int i10, l lVar);

    Object writeAvailable(ChunkBuffer chunkBuffer, d<? super Integer> dVar);

    Object writeAvailable(ByteBuffer byteBuffer, d<? super Integer> dVar);

    Object writeAvailable(byte[] bArr, int i10, int i11, d<? super Integer> dVar);

    Object writeByte(byte b10, d<? super x0> dVar);

    Object writeDouble(double d10, d<? super x0> dVar);

    Object writeFloat(float f10, d<? super x0> dVar);

    Object writeFully(Buffer buffer, d<? super x0> dVar);

    Object writeFully(ByteBuffer byteBuffer, d<? super x0> dVar);

    Object writeFully(byte[] bArr, int i10, int i11, d<? super x0> dVar);

    /* renamed from: writeFully-JT6ljtQ */
    Object mo4304writeFullyJT6ljtQ(ByteBuffer byteBuffer, int i10, int i11, d<? super x0> dVar);

    Object writeInt(int i10, d<? super x0> dVar);

    Object writeLong(long j10, d<? super x0> dVar);

    Object writePacket(ByteReadPacket byteReadPacket, d<? super x0> dVar);

    Object writeShort(short s10, d<? super x0> dVar);

    @f
    Object writeSuspendSession(p pVar, d<? super x0> dVar);

    Object writeWhile(l lVar, d<? super x0> dVar);
}
