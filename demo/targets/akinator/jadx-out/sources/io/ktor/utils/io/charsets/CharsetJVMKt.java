package io.ktor.utils.io.charsets;

import io.ktor.utils.io.bits.Memory;
import io.ktor.utils.io.core.Buffer;
import io.ktor.utils.io.core.BufferPrimitivesKt;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CharsetJVMKt {
    private static final int DECODE_CHAR_BUFFER_SIZE = 8192;
    private static final ByteBuffer EmptyByteBuffer;
    private static final CharBuffer EmptyCharBuffer = CharBuffer.allocate(0);

    static {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0);
        e0.checkNotNull(byteBufferAllocate);
        EmptyByteBuffer = byteBufferAllocate;
    }

    public static /* synthetic */ void Charset$annotations() {
    }

    public static final int decode(CharsetDecoder charsetDecoder, Input input, Appendable dst, int i10) {
        CoderResult cr2;
        ChunkBuffer chunkBufferPrepareReadNextHead;
        e0.checkNotNullParameter(charsetDecoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        int iRemaining = 0;
        if (chunkBufferPrepareReadFirstHead != null) {
            int i11 = 1;
            int i12 = 1;
            int iRemaining2 = 0;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    if (writePosition >= i11) {
                        int i13 = i10 - iRemaining2;
                        if (i13 == 0) {
                            i11 = 0;
                        } else {
                            try {
                                ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8();
                                int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                                int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition() - readPosition;
                                ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition, writePosition2);
                                charBufferAllocate.clear();
                                if (i13 < 8192) {
                                    charBufferAllocate.limit(i13);
                                }
                                CoderResult rc2 = charsetDecoder.decode(byteBufferM4324slice87lwejk, charBufferAllocate, false);
                                charBufferAllocate.flip();
                                iRemaining2 += charBufferAllocate.remaining();
                                dst.append(charBufferAllocate);
                                if (rc2.isMalformed() || rc2.isUnmappable()) {
                                    e0.checkNotNullExpressionValue(rc2, "rc");
                                    throwExceptionWrapped(rc2);
                                }
                                i12 = (rc2.isUnderflow() && byteBufferM4324slice87lwejk.hasRemaining()) ? i12 + 1 : 1;
                                if (byteBufferM4324slice87lwejk.limit() != writePosition2) {
                                    throw new IllegalStateException("Buffer's limit change is not allowed");
                                }
                                chunkBufferPrepareReadFirstHead.discardExact(byteBufferM4324slice87lwejk.position());
                                i11 = i12;
                            } finally {
                                chunkBufferPrepareReadFirstHead.getWritePosition();
                                chunkBufferPrepareReadFirstHead.getReadPosition();
                            }
                        }
                        writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    }
                    if (writePosition == 0) {
                        try {
                            chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = false;
                            if (z10) {
                                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                            }
                            throw th;
                        }
                    } else if (writePosition < i11 || chunkBufferPrepareReadFirstHead.getCapacity() - chunkBufferPrepareReadFirstHead.getLimit() < 8) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        chunkBufferPrepareReadNextHead = UnsafeKt.prepareReadFirstHead(input, i11);
                    } else {
                        chunkBufferPrepareReadNextHead = chunkBufferPrepareReadFirstHead;
                    }
                    if (chunkBufferPrepareReadNextHead == null) {
                        break;
                    }
                    if (i11 <= 0) {
                        iRemaining = 1;
                        chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead = chunkBufferPrepareReadNextHead;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (iRemaining != 0) {
                UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
            }
            iRemaining = iRemaining2;
        }
        do {
            charBufferAllocate.clear();
            int i14 = i10 - iRemaining;
            if (i14 == 0) {
                break;
            }
            if (i14 < 8192) {
                charBufferAllocate.limit(i14);
            }
            cr2 = charsetDecoder.decode(EmptyByteBuffer, charBufferAllocate, true);
            charBufferAllocate.flip();
            iRemaining += charBufferAllocate.remaining();
            dst.append(charBufferAllocate);
            if (cr2.isUnmappable() || cr2.isMalformed()) {
                e0.checkNotNullExpressionValue(cr2, "cr");
                throwExceptionWrapped(cr2);
            }
        } while (cr2.isOverflow());
        return iRemaining;
    }

    public static final int decodeBuffer(CharsetDecoder charsetDecoder, Buffer input, Appendable out, boolean z10, int i10) {
        e0.checkNotNullParameter(charsetDecoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(out, "out");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = input.m4458getMemorySK3TCg8();
        int readPosition = input.getReadPosition();
        int writePosition = input.getWritePosition() - readPosition;
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, readPosition, writePosition);
        ChunkBuffer chunkBufferBorrow = ChunkBuffer.Companion.getPool().borrow();
        CharBuffer charBufferAsCharBuffer = chunkBufferBorrow.m4458getMemorySK3TCg8().asCharBuffer();
        int i11 = 0;
        while (byteBufferM4324slice87lwejk.hasRemaining() && i11 < i10) {
            try {
                int iMin = Math.min(charBufferAsCharBuffer.capacity(), i10 - i11);
                charBufferAsCharBuffer.clear();
                charBufferAsCharBuffer.limit(iMin);
                CoderResult result = charsetDecoder.decode(byteBufferM4324slice87lwejk, charBufferAsCharBuffer, z10);
                if (result.isMalformed() || result.isUnmappable()) {
                    e0.checkNotNullExpressionValue(result, "result");
                    throwExceptionWrapped(result);
                }
                i11 += iMin;
            } catch (Throwable th2) {
                chunkBufferBorrow.release(ChunkBuffer.Companion.getPool());
                throw th2;
            }
        }
        chunkBufferBorrow.release(ChunkBuffer.Companion.getPool());
        if (byteBufferM4324slice87lwejk.limit() != writePosition) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        input.discardExact(byteBufferM4324slice87lwejk.position());
        return i11;
    }

    public static /* synthetic */ int decodeBuffer$default(CharsetDecoder charsetDecoder, Buffer buffer, Appendable appendable, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return decodeBuffer(charsetDecoder, buffer, appendable, z10, i10);
    }

    public static final String decodeExactBytes(CharsetDecoder charsetDecoder, Input input, int i10) {
        e0.checkNotNullParameter(charsetDecoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        if (i10 == 0) {
            return "";
        }
        if (input.getHeadEndExclusive() - input.getHeadPosition() < i10) {
            return decodeImplSlow(charsetDecoder, input, i10);
        }
        if (!input.m4497getHeadMemorySK3TCg8().hasArray()) {
            return decodeImplByteBuffer(charsetDecoder, input, i10);
        }
        ByteBuffer byteBufferM4497getHeadMemorySK3TCg8 = input.m4497getHeadMemorySK3TCg8();
        byte[] bArrArray = byteBufferM4497getHeadMemorySK3TCg8.array();
        e0.checkNotNullExpressionValue(bArrArray, "bb.array()");
        int readPosition = input.getHead().getReadPosition() + byteBufferM4497getHeadMemorySK3TCg8.position() + byteBufferM4497getHeadMemorySK3TCg8.arrayOffset();
        Charset charset = charsetDecoder.charset();
        e0.checkNotNullExpressionValue(charset, "charset()");
        String str = new String(bArrArray, readPosition, i10, charset);
        input.discardExact(i10);
        return str;
    }

    private static final String decodeImplByteBuffer(CharsetDecoder charsetDecoder, Input input, int i10) throws CharacterCodingException {
        CharBuffer charBufferAllocate = CharBuffer.allocate(i10);
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(input.m4497getHeadMemorySK3TCg8(), input.getHead().getReadPosition(), i10);
        CoderResult rc2 = charsetDecoder.decode(byteBufferM4324slice87lwejk, charBufferAllocate, true);
        if (rc2.isMalformed() || rc2.isUnmappable()) {
            e0.checkNotNullExpressionValue(rc2, "rc");
            throwExceptionWrapped(rc2);
        }
        charBufferAllocate.flip();
        input.discardExact(byteBufferM4324slice87lwejk.position());
        String string = charBufferAllocate.toString();
        e0.checkNotNullExpressionValue(string, "cb.toString()");
        return string;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String decodeImplSlow(java.nio.charset.CharsetDecoder r17, io.ktor.utils.io.core.Input r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.charsets.CharsetJVMKt.decodeImplSlow(java.nio.charset.CharsetDecoder, io.ktor.utils.io.core.Input, int):java.lang.String");
    }

    public static final boolean encodeComplete(CharsetEncoder charsetEncoder, Buffer dst) throws CharacterCodingException {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(dst, "dst");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = dst.m4458getMemorySK3TCg8();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
        CoderResult result = charsetEncoder.encode(EmptyCharBuffer, byteBufferM4324slice87lwejk, true);
        if (result.isMalformed() || result.isUnmappable()) {
            e0.checkNotNullExpressionValue(result, "result");
            throwExceptionWrapped(result);
        }
        boolean zIsUnderflow = result.isUnderflow();
        if (byteBufferM4324slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.commitWritten(byteBufferM4324slice87lwejk.position());
        return zIsUnderflow;
    }

    public static final int encodeImpl(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11, Buffer dst) throws CharacterCodingException {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        e0.checkNotNullParameter(dst, "dst");
        CharBuffer charBufferWrap = CharBuffer.wrap(input, i10, i11);
        int iRemaining = charBufferWrap.remaining();
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = dst.m4458getMemorySK3TCg8();
        int writePosition = dst.getWritePosition();
        int limit = dst.getLimit() - writePosition;
        ByteBuffer byteBufferM4324slice87lwejk = Memory.m4324slice87lwejk(byteBufferM4458getMemorySK3TCg8, writePosition, limit);
        CoderResult result = charsetEncoder.encode(charBufferWrap, byteBufferM4324slice87lwejk, false);
        if (result.isMalformed() || result.isUnmappable()) {
            e0.checkNotNullExpressionValue(result, "result");
            throwExceptionWrapped(result);
        }
        if (byteBufferM4324slice87lwejk.limit() != limit) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        dst.commitWritten(byteBufferM4324slice87lwejk.position());
        return iRemaining - charBufferWrap.remaining();
    }

    public static final byte[] encodeToByteArray(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        if (!(input instanceof String)) {
            return encodeToByteArraySlow(charsetEncoder, input, i10, i11);
        }
        if (i10 == 0) {
            String str = (String) input;
            if (i11 == str.length()) {
                byte[] bytes = str.getBytes(charsetEncoder.charset());
                e0.checkNotNullExpressionValue(bytes, "input as java.lang.String).getBytes(charset())");
                return bytes;
            }
        }
        String strSubstring = ((String) input).substring(i10, i11);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        e0.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes2 = strSubstring.getBytes(charsetEncoder.charset());
        e0.checkNotNullExpressionValue(bytes2, "input.substring(fromInde…ring).getBytes(charset())");
        return bytes2;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return encodeToByteArray(charsetEncoder, charSequence, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final byte[] encodeToByteArrayImpl1(CharsetEncoder charsetEncoder, CharSequence input, int i10, int i11) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        e0.checkNotNullParameter(input, "input");
        if (i10 >= i11) {
            return UnsafeKt.EmptyByteArray;
        }
        ChunkBuffer.Companion companion = ChunkBuffer.Companion;
        ChunkBuffer chunkBufferBorrow = companion.getPool().borrow();
        try {
            int iEncodeImpl = i10 + encodeImpl(charsetEncoder, input, i10, i11, chunkBufferBorrow);
            if (iEncodeImpl == i11) {
                int writePosition = chunkBufferBorrow.getWritePosition() - chunkBufferBorrow.getReadPosition();
                byte[] bArr = new byte[writePosition];
                e0.checkNotNull(chunkBufferBorrow, "null cannot be cast to non-null type io.ktor.utils.io.core.Buffer");
                BufferPrimitivesKt.readFully((Buffer) chunkBufferBorrow, bArr, 0, writePosition);
                chunkBufferBorrow.release(companion.getPool());
                return bArr;
            }
            BytePacketBuilder bytePacketBuilder = new BytePacketBuilder(null, 1, 0 == true ? 1 : 0);
            try {
                bytePacketBuilder.appendSingleChunk$ktor_io(chunkBufferBorrow.duplicate());
                EncodingKt.encodeToImpl(charsetEncoder, bytePacketBuilder, input, iEncodeImpl, i11);
                byte[] bytes$default = io.ktor.utils.io.core.StringsKt.readBytes$default(bytePacketBuilder.build(), 0, 1, null);
                chunkBufferBorrow.release(companion.getPool());
                return bytes$default;
            } catch (Throwable th2) {
                bytePacketBuilder.release();
                throw th2;
            }
        } catch (Throwable th3) {
            chunkBufferBorrow.release(ChunkBuffer.Companion.getPool());
            throw th3;
        }
    }

    public static /* synthetic */ byte[] encodeToByteArrayImpl1$default(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        return encodeToByteArrayImpl1(charsetEncoder, charSequence, i10, i11);
    }

    private static final byte[] encodeToByteArraySlow(CharsetEncoder charsetEncoder, CharSequence charSequence, int i10, int i11) throws CharacterCodingException {
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, i10, i11));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final Charset getCharset(CharsetEncoder charsetEncoder) {
        e0.checkNotNullParameter(charsetEncoder, "<this>");
        Charset charset = charsetEncoder.charset();
        e0.checkNotNullExpressionValue(charset, "charset()");
        return charset;
    }

    public static final String getName(Charset charset) {
        e0.checkNotNullParameter(charset, "<this>");
        String strName = charset.name();
        e0.checkNotNullExpressionValue(strName, "name()");
        return strName;
    }

    private static final void throwExceptionWrapped(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (java.nio.charset.MalformedInputException e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new MalformedInputException(message);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        r20 = r3;
        r21 = r6;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void encodeUTF8(java.nio.charset.CharsetEncoder r24, io.ktor.utils.io.core.ByteReadPacket r25, io.ktor.utils.io.core.Output r26) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.charsets.CharsetJVMKt.encodeUTF8(java.nio.charset.CharsetEncoder, io.ktor.utils.io.core.ByteReadPacket, io.ktor.utils.io.core.Output):void");
    }

    public static final Charset getCharset(CharsetDecoder charsetDecoder) {
        e0.checkNotNullParameter(charsetDecoder, "<this>");
        Charset charset = charsetDecoder.charset();
        e0.checkNotNull(charset);
        return charset;
    }
}
