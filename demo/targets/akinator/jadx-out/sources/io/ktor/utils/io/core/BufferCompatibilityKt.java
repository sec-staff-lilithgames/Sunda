package io.ktor.utils.io.core;

import a.b;
import bp.oM.DwaEpyvxz;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import e3.g;
import i2.hQ.aTNDubNmpwAqdU;
import io.ktor.utils.io.bits.MemoryJvmKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.EncodeResult;
import io.ktor.utils.io.core.internal.UTF8Kt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.e0;
import p0.o2;
import tu.f;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BufferCompatibilityKt {
    @f
    public static final Buffer append(Buffer buffer, CharSequence charSequence) {
        e0.checkNotNullParameter(buffer, "<this>");
        throw new IllegalStateException("This is no longer supported. Use a packet builder to append characters instead.");
    }

    public static final int appendChars(Buffer buffer, CharSequence csq, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(csq, "csq");
        int iM4576encodeUTF8lBXzO7A = UTF8Kt.m4576encodeUTF8lBXzO7A(buffer.m4458getMemorySK3TCg8(), csq, i10, i11, buffer.getWritePosition(), buffer.getLimit());
        int iM4572getCharactersMh2AYeg = EncodeResult.m4572getCharactersMh2AYeg(iM4576encodeUTF8lBXzO7A) & 65535;
        buffer.commitWritten(EncodeResult.m4571getBytesMh2AYeg(iM4576encodeUTF8lBXzO7A) & 65535);
        return iM4572getCharactersMh2AYeg + i10;
    }

    public static /* synthetic */ int appendChars$default(Buffer buffer, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return appendChars(buffer, charSequence, i10, i11);
    }

    private static final Void appendFailed(int i10) throws BufferLimitExceededException {
        throw new BufferLimitExceededException(o2.k(i10, "Not enough free space available to write ", " character(s)."));
    }

    @f
    public static final void fill(Buffer buffer, long j10, byte b10) {
        e0.checkNotNullParameter(buffer, "<this>");
        if (j10 >= 2147483647L) {
            throw g.r(j10, "n");
        }
        fill(buffer, (int) j10, b10);
    }

    /* renamed from: fill-sEu17AQ, reason: not valid java name */
    public static final void m4459fillsEu17AQ(Buffer fill, int i10, byte b10) {
        e0.checkNotNullParameter(fill, "$this$fill");
        fill(fill, i10, b10);
    }

    @f
    public static final void flush(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
    }

    @f
    public static final Buffer makeView(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return buffer.duplicate();
    }

    @f
    public static final void pushBack(Buffer buffer, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        buffer.rewind(i10);
    }

    public static final void readFully(Buffer buffer, Byte[] dst, int i10, int i11) throws EOFException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        if (buffer.getWritePosition() - readPosition < i11) {
            throw new EOFException(o2.k(i11, "Not enough bytes available to read ", " bytes"));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            dst[i12 + i10] = Byte.valueOf(byteBufferM4458getMemorySK3TCg8.get(i12 + readPosition));
        }
        buffer.discardExact(i11);
    }

    public static /* synthetic */ void readFully$default(Buffer buffer, Byte[] bArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length - i10;
        }
        readFully(buffer, bArr, i10, i11);
    }

    public static /* synthetic */ int readText$default(Buffer buffer, CharsetDecoder charsetDecoder, Appendable appendable, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readText(buffer, charsetDecoder, appendable, z10, i10);
    }

    @f
    public static final int tryPeek(Buffer buffer) {
        e0.checkNotNullParameter(buffer, "<this>");
        return buffer.tryPeekByte();
    }

    @f
    public static final Buffer append(Buffer buffer, CharSequence charSequence, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        throw new IllegalStateException("This is no longer supported. Use a packet builder to append characters instead.");
    }

    @f
    public static final ChunkBuffer makeView(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return chunkBuffer.duplicate();
    }

    @f
    public static final int readText(Buffer buffer, CharsetDecoder decoder, Appendable out, boolean z10, int i10) {
        e0.checkNotNullParameter(buffer, aTNDubNmpwAqdU.fnDsNsnMcY);
        e0.checkNotNullParameter(decoder, "decoder");
        e0.checkNotNullParameter(out, "out");
        return CharsetJVMKt.decodeBuffer(decoder, buffer, out, z10, i10);
    }

    @f
    public static final Buffer append(Buffer buffer, char[] csq, int i10, int i11) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(csq, "csq");
        throw new IllegalStateException("This is no longer supported. Use a packet builder to append characters instead.");
    }

    @f
    public static final Buffer append(Buffer buffer, char c10) throws BufferLimitExceededException {
        int i10;
        e0.checkNotNullParameter(buffer, "<this>");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int writePosition = buffer.getWritePosition();
        int limit = buffer.getLimit();
        if (c10 >= 0 && c10 < 128) {
            byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) c10);
            i10 = 1;
        } else if (128 <= c10 && c10 < 2048) {
            byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) (((c10 >> 6) & 31) | PsExtractor.AUDIO_STREAM));
            byteBufferM4458getMemorySK3TCg8.put(writePosition + 1, (byte) ((c10 & '?') | 128));
            i10 = 2;
        } else if (2048 <= c10 && c10 < 0) {
            byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) (((c10 >> '\f') & 15) | 224));
            byteBufferM4458getMemorySK3TCg8.put(writePosition + 1, (byte) (((c10 >> 6) & 63) | 128));
            byteBufferM4458getMemorySK3TCg8.put(writePosition + 2, (byte) ((c10 & '?') | 128));
            i10 = 3;
        } else {
            if (0 > c10 || c10 >= 0) {
                UTF8Kt.malformedCodePoint(c10);
                throw new k();
            }
            byteBufferM4458getMemorySK3TCg8.put(writePosition, (byte) (((c10 >> 18) & 7) | PsExtractor.VIDEO_STREAM_MASK));
            byteBufferM4458getMemorySK3TCg8.put(writePosition + 1, (byte) (((c10 >> '\f') & 63) | 128));
            byteBufferM4458getMemorySK3TCg8.put(writePosition + 2, (byte) (((c10 >> 6) & 63) | 128));
            byteBufferM4458getMemorySK3TCg8.put(writePosition + 3, (byte) ((c10 & '?') | 128));
            i10 = 4;
        }
        if (i10 <= limit - writePosition) {
            buffer.commitWritten(i10);
            return buffer;
        }
        appendFailed(1);
        throw new k();
    }

    public static final void fill(Buffer buffer, int i10, byte b10) {
        e0.checkNotNullParameter(buffer, "<this>");
        if (i10 >= 0) {
            if (i10 <= buffer.getLimit() - buffer.getWritePosition()) {
                MemoryJvmKt.m4336fillJT6ljtQ(buffer.m4458getMemorySK3TCg8(), buffer.getWritePosition(), i10, b10);
                buffer.commitWritten(i10);
                return;
            } else {
                StringBuilder sbT = o2.t(i10, "times shouldn't be greater than the write remaining space: ", DwaEpyvxz.PRpfBlkuxY);
                sbT.append(buffer.getLimit() - buffer.getWritePosition());
                throw new IllegalArgumentException(sbT.toString().toString());
            }
        }
        throw new IllegalArgumentException(b.e(i10, "times shouldn't be negative: ").toString());
    }
}
