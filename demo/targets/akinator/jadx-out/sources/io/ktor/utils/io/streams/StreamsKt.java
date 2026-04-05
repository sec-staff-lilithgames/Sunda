package io.ktor.utils.io.streams;

import b0.e2;
import com.applovin.shadow.okio.Segment;
import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.InputArraysKt;
import io.ktor.utils.io.core.InsufficientSpaceException;
import io.ktor.utils.io.core.Output;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlin.jvm.internal.e0;
import kv.l;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StreamsKt {
    private static final char[] SkipBuffer = new char[Segment.SIZE];

    public static final InputStream inputStream(final ByteReadPacket byteReadPacket) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        return new InputStream() { // from class: io.ktor.utils.io.streams.StreamsKt.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(byteReadPacket.getRemaining(), 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                byteReadPacket.release();
            }

            @Override // java.io.InputStream
            public int read() {
                if (byteReadPacket.getEndOfInput()) {
                    return -1;
                }
                return byteReadPacket.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            }
        };
    }

    public static final OutputStream outputStream(final BytePacketBuilder bytePacketBuilder) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        return new OutputStream() { // from class: io.ktor.utils.io.streams.StreamsKt.outputStream.1
            @Override // java.io.OutputStream
            public void write(int i10) throws InsufficientSpaceException {
                bytePacketBuilder.writeByte((byte) i10);
            }

            @Override // java.io.OutputStream
            public void write(byte[] b10, int i10, int i11) {
                e0.checkNotNullParameter(b10, "b");
                io.ktor.utils.io.core.OutputKt.writeFully((Output) bytePacketBuilder, b10, i10, i11);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        };
    }

    public static final ByteReadPacket readPacketAtLeast(InputStream inputStream, long j10) {
        e0.checkNotNullParameter(inputStream, "<this>");
        return readPacketImpl(inputStream, j10, Long.MAX_VALUE);
    }

    public static final ByteReadPacket readPacketAtMost(InputStream inputStream, long j10) {
        e0.checkNotNullParameter(inputStream, "<this>");
        return readPacketImpl(inputStream, 1L, j10);
    }

    public static final ByteReadPacket readPacketExact(InputStream inputStream, long j10) {
        e0.checkNotNullParameter(inputStream, "<this>");
        return readPacketImpl(inputStream, j10, j10);
    }

    private static final ByteReadPacket readPacketImpl(InputStream inputStream, long j10, long j11) {
        long j12 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException("min shouldn't be negative");
        }
        if (j10 > j11) {
            StringBuilder sbR = e2.r(j10, "min shouldn't be greater than max: ", " > ");
            sbR.append(j11);
            throw new IllegalArgumentException(sbR.toString().toString());
        }
        int iCoerceAtMost = (int) v.coerceAtMost(j11, 4096L);
        byte[] bArr = new byte[iCoerceAtMost];
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        while (true) {
            if (j12 >= j10 && (j12 != j10 || j10 != 0)) {
                break;
            }
            try {
                int i10 = inputStream.read(bArr, 0, Math.min((int) Math.min(j11 - j12, 2147483647L), iCoerceAtMost));
                if (i10 == -1) {
                    throw new EOFException("Premature end of stream: was read " + j12 + " bytes of " + j10);
                }
                j12 += i10;
                io.ktor.utils.io.core.OutputKt.writeFully((Output) bytePacketBuilder, bArr, 0, i10);
            } catch (Throwable th2) {
                bytePacketBuilder.release();
                throw th2;
            }
        }
        return bytePacketBuilder.build();
    }

    public static final Reader readerUTF8(final ByteReadPacket byteReadPacket) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        return new Reader() { // from class: io.ktor.utils.io.streams.StreamsKt.readerUTF8.1
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                byteReadPacket.release();
            }

            @Override // java.io.Reader
            public int read(char[] cbuf, int i10, int i11) {
                e0.checkNotNullParameter(cbuf, "cbuf");
                return byteReadPacket.readAvailableCharacters$ktor_io(cbuf, i10, i11);
            }

            @Override // java.io.Reader
            public long skip(long j10) {
                int i10;
                char[] cArr = StreamsKt.SkipBuffer;
                int length = cArr.length;
                long j11 = 0;
                while (j11 < j10 && (i10 = read(cArr, 0, (int) Math.min(length, j10 - j11))) != -1) {
                    j11 += i10;
                }
                return j11;
            }
        };
    }

    public static final void writePacket(OutputStream outputStream, ByteReadPacket packet) throws Throwable {
        ByteReadPacket byteReadPacket;
        e0.checkNotNullParameter(outputStream, "<this>");
        e0.checkNotNullParameter(packet, "packet");
        long remaining = packet.getRemaining();
        if (remaining == 0) {
            return;
        }
        byte[] bArr = new byte[(int) v.coerceAtMost(remaining, 4096L)];
        while (!packet.getEndOfInput()) {
            try {
                byteReadPacket = packet;
                try {
                    outputStream.write(bArr, 0, InputArraysKt.readAvailable$default((Input) byteReadPacket, bArr, 0, 0, 6, (Object) null));
                    packet = byteReadPacket;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    byteReadPacket.release();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                byteReadPacket = packet;
            }
        }
        packet.release();
    }

    public static final Writer writerUTF8(final BytePacketBuilder bytePacketBuilder) {
        e0.checkNotNullParameter(bytePacketBuilder, "<this>");
        return new Writer() { // from class: io.ktor.utils.io.streams.StreamsKt.writerUTF8.1
            @Override // java.io.Writer
            public void write(char[] cbuf, int i10, int i11) {
                e0.checkNotNullParameter(cbuf, "cbuf");
                bytePacketBuilder.append(cbuf, i10, i11 + i10);
            }

            @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.Writer, java.io.Flushable
            public void flush() {
            }
        };
    }

    public static final void writePacket(OutputStream outputStream, l builder) throws Throwable {
        e0.checkNotNullParameter(outputStream, "<this>");
        e0.checkNotNullParameter(builder, "builder");
        BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, null);
        try {
            builder.invoke(bytePacketBuilder);
            writePacket(outputStream, bytePacketBuilder.build());
        } catch (Throwable th2) {
            bytePacketBuilder.release();
            throw th2;
        }
    }
}
