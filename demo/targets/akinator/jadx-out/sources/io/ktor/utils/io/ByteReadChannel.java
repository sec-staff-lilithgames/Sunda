package io.ktor.utils.io;

import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.nio.ByteBuffer;
import kv.l;
import kv.p;
import tu.f;
import tu.o;
import tu.q;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface ByteReadChannel {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final o Empty$delegate = q.lazy(ByteReadChannel$Companion$Empty$2.INSTANCE);

        private Companion() {
        }

        public final ByteReadChannel getEmpty() {
            return (ByteReadChannel) Empty$delegate.getValue();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        /* renamed from: peekTo-lBXzO7A$default, reason: not valid java name */
        public static /* synthetic */ Object m4306peekTolBXzO7A$default(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, long j10, long j11, long j12, long j13, d dVar, int i10, Object obj) {
            if (obj == null) {
                return byteReadChannel.mo4303peekTolBXzO7A(byteBuffer, j10, (i10 & 4) != 0 ? 0L : j11, (i10 & 8) != 0 ? 1L : j12, (i10 & 16) != 0 ? Long.MAX_VALUE : j13, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekTo-lBXzO7A");
        }

        public static /* synthetic */ Object read$default(ByteReadChannel byteReadChannel, int i10, l lVar, d dVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: read");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return byteReadChannel.read(i10, lVar, dVar);
        }

        public static /* synthetic */ int readAvailable$default(ByteReadChannel byteReadChannel, int i10, l lVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readAvailable");
            }
            if ((i11 & 1) != 0) {
                i10 = 1;
            }
            return byteReadChannel.readAvailable(i10, lVar);
        }

        public static /* synthetic */ Object readRemaining$default(ByteReadChannel byteReadChannel, long j10, d dVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i10 & 1) != 0) {
                j10 = Long.MAX_VALUE;
            }
            return byteReadChannel.readRemaining(j10, dVar);
        }
    }

    Object awaitContent(d<? super x0> dVar);

    boolean cancel(Throwable th2);

    Object discard(long j10, d<? super Long> dVar);

    int getAvailableForRead();

    Throwable getClosedCause();

    long getTotalBytesRead();

    boolean isClosedForRead();

    boolean isClosedForWrite();

    @f
    <R> R lookAhead(l lVar);

    @f
    <R> Object lookAheadSuspend(p pVar, d<? super R> dVar);

    /* renamed from: peekTo-lBXzO7A */
    Object mo4303peekTolBXzO7A(ByteBuffer byteBuffer, long j10, long j11, long j12, long j13, d<? super Long> dVar);

    Object read(int i10, l lVar, d<? super x0> dVar);

    int readAvailable(int i10, l lVar);

    Object readAvailable(ChunkBuffer chunkBuffer, d<? super Integer> dVar);

    Object readAvailable(ByteBuffer byteBuffer, d<? super Integer> dVar);

    Object readAvailable(byte[] bArr, int i10, int i11, d<? super Integer> dVar);

    Object readBoolean(d<? super Boolean> dVar);

    Object readByte(d<? super Byte> dVar);

    Object readDouble(d<? super Double> dVar);

    Object readFloat(d<? super Float> dVar);

    Object readFully(ChunkBuffer chunkBuffer, int i10, d<? super x0> dVar);

    Object readFully(ByteBuffer byteBuffer, d<? super Integer> dVar);

    Object readFully(byte[] bArr, int i10, int i11, d<? super x0> dVar);

    Object readInt(d<? super Integer> dVar);

    Object readLong(d<? super Long> dVar);

    Object readPacket(int i10, d<? super ByteReadPacket> dVar);

    Object readRemaining(long j10, d<? super ByteReadPacket> dVar);

    @f
    void readSession(l lVar);

    Object readShort(d<? super Short> dVar);

    @f
    Object readSuspendableSession(p pVar, d<? super x0> dVar);

    Object readUTF8Line(int i10, d<? super String> dVar);

    <A extends Appendable> Object readUTF8LineTo(A a10, int i10, d<? super Boolean> dVar);
}
