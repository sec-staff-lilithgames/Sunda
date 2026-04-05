package io.ktor.utils.io.core;

import com.inmobi.commons.core.configs.AdConfig;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.internal.CharArraySequence;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.EncodeResult;
import io.ktor.utils.io.core.internal.UTF8Kt;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import p0.o2;
import qv.v;
import sv.g;
import sv.k0;
import sv.n0;
import tu.f;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StringsKt {
    private static final Void bufferLimitExceeded(int i10) throws BufferLimitExceededException {
        throw new BufferLimitExceededException(o2.k(i10, "Too many characters before delimiter: limit ", " exceeded"));
    }

    private static final boolean isAsciiChar(char c10) {
        return c10 <= 127;
    }

    public static final Void prematureEndOfStream(int i10) {
        throw new EOFException(o2.k(i10, "Premature end of stream: expected ", " bytes"));
    }

    private static final Void prematureEndOfStreamToReadChars(int i10) throws EOFException {
        throw new EOFException(o2.k(i10, "Not enough input bytes to read ", " characters."));
    }

    public static final byte[] readBytes(ByteReadPacket byteReadPacket, int i10) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        if (i10 == 0) {
            return UnsafeKt.EmptyByteArray;
        }
        byte[] bArr = new byte[i10];
        InputArraysKt.readFully((Input) byteReadPacket, bArr, 0, i10);
        return bArr;
    }

    public static /* synthetic */ byte[] readBytes$default(ByteReadPacket byteReadPacket, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            long remaining = byteReadPacket.getRemaining();
            if (remaining > 2147483647L) {
                throw new IllegalArgumentException("Unable to convert to a ByteArray: packet is too big");
            }
            i10 = (int) remaining;
        }
        return readBytes(byteReadPacket, i10);
    }

    public static final byte[] readBytesOf(Input input, int i10, int i11) throws EOFException {
        int available;
        e0.checkNotNullParameter(input, "<this>");
        if (i10 == i11 && i10 == 0) {
            return UnsafeKt.EmptyByteArray;
        }
        int i12 = 0;
        if (i10 == i11) {
            byte[] bArr = new byte[i10];
            InputArraysKt.readFully(input, bArr, 0, i10);
            return bArr;
        }
        byte[] bArrCopyOf = new byte[(int) v.coerceAtLeast(v.coerceAtMost(i11, EncodingKt.sizeEstimate(input)), i10)];
        while (i12 < i11 && (available = InputArraysKt.readAvailable(input, bArrCopyOf, i12, Math.min(i11, bArrCopyOf.length) - i12)) > 0) {
            i12 += available;
            if (bArrCopyOf.length == i12) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12 * 2);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
            }
        }
        if (i12 < i10) {
            StringBuilder sbT = o2.t(i10, "Not enough bytes available to read ", " bytes: ");
            sbT.append(i10 - i12);
            sbT.append(" more required");
            throw new EOFException(sbT.toString());
        }
        if (i12 == bArrCopyOf.length) {
            return bArrCopyOf;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i12);
        e0.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    public static /* synthetic */ byte[] readBytesOf$default(Input input, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return readBytesOf(input, i10, i11);
    }

    public static final int readText(Input input, Appendable out, Charset charset, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(out, "out");
        e0.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        e0.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return CharsetJVMKt.decode(charsetDecoderNewDecoder, input, out, i10);
    }

    public static /* synthetic */ int readText$default(Input input, Appendable appendable, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = g.f86134b;
        }
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readText(input, appendable, charset, i10);
    }

    @f
    public static final String readTextExact(Input input, Charset charset, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return readTextExactCharacters(input, i10, charset);
    }

    public static /* synthetic */ String readTextExact$default(Input input, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = g.f86134b;
        }
        return readTextExact(input, charset, i10);
    }

    @f
    public static final String readTextExactBytes(Input input, Charset charset, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return readTextExactBytes(input, i10, charset);
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = g.f86134b;
        }
        return readTextExactBytes(input, charset, i10);
    }

    public static final String readTextExactCharacters(Input input, int i10, Charset charset) throws EOFException {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        String text = readText(input, charset, i10);
        if (text.length() >= i10) {
            return text;
        }
        prematureEndOfStreamToReadChars(i10);
        throw new k();
    }

    public static /* synthetic */ String readTextExactCharacters$default(Input input, int i10, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = g.f86134b;
        }
        return readTextExactCharacters(input, i10, charset);
    }

    public static final String readUTF8Line(Input input, int i10, int i11) {
        e0.checkNotNullParameter(input, "<this>");
        StringBuilder sb2 = new StringBuilder(i10);
        if (readUTF8LineTo(input, sb2, i11)) {
            return sb2.toString();
        }
        return null;
    }

    public static /* synthetic */ String readUTF8Line$default(ByteReadPacket byteReadPacket, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 16;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return readUTF8Line(byteReadPacket, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x017b A[EDGE_INSN: B:176:0x017b->B:102:0x017b BREAK  A[LOOP:1: B:11:0x003f->B:107:0x0196], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0143 A[Catch: all -> 0x008a, TryCatch #1 {all -> 0x008a, blocks: (B:9:0x002d, B:31:0x0080, B:112:0x01b0, B:115:0x01b8, B:107:0x0196, B:29:0x0079, B:35:0x008d, B:36:0x0095, B:37:0x0096, B:38:0x009e, B:43:0x00a9, B:45:0x00ad, B:46:0x00b6, B:48:0x00bc, B:50:0x00c9, B:52:0x00d3, B:54:0x00d9, B:67:0x0100, B:65:0x00f7, B:68:0x0109, B:69:0x0111, B:70:0x0112, B:72:0x0118, B:85:0x0143, B:96:0x0165, B:100:0x0172, B:101:0x017a, B:102:0x017b, B:83:0x013a, B:103:0x0184, B:104:0x018c, B:105:0x018d, B:106:0x0195, B:110:0x01a2), top: B:156:0x002d }] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean readUTF8LineTo(io.ktor.utils.io.core.Input r22, java.lang.Appendable r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.StringsKt.readUTF8LineTo(io.ktor.utils.io.core.Input, java.lang.Appendable, int):boolean");
    }

    public static final String readUTF8UntilDelimiter(Input input, String delimiters, int i10) throws Throwable {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(delimiters, "delimiters");
        StringBuilder sb2 = new StringBuilder();
        readUTF8UntilDelimiterTo(input, sb2, delimiters, i10);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String readUTF8UntilDelimiter$default(Input input, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiter(input, str, i10);
    }

    public static final int readUTF8UntilDelimiterTo(Input input, Output out, String delimiters, int i10) {
        long untilDelimiters;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(out, "out");
        e0.checkNotNullParameter(delimiters, "delimiters");
        int length = delimiters.length();
        if (length == 1 && delimiters.charAt(0) <= 127) {
            untilDelimiters = ScannerKt.readUntilDelimiter(input, (byte) delimiters.charAt(0), out);
        } else {
            if (length != 2 || delimiters.charAt(0) > 127 || delimiters.charAt(1) > 127) {
                return readUTFUntilDelimiterToSlowAscii(input, delimiters, i10, out);
            }
            untilDelimiters = ScannerKt.readUntilDelimiters(input, (byte) delimiters.charAt(0), (byte) delimiters.charAt(1), out);
        }
        return (int) untilDelimiters;
    }

    public static /* synthetic */ int readUTF8UntilDelimiterTo$default(Input input, Appendable appendable, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiterTo(input, appendable, str, i10);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int readUTF8UntilDelimiterToSlowUtf8(io.ktor.utils.io.core.Input r19, io.ktor.utils.io.core.Output r20, java.lang.String r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.StringsKt.readUTF8UntilDelimiterToSlowUtf8(io.ktor.utils.io.core.Input, io.ktor.utils.io.core.Output, java.lang.String, int, int):int");
    }

    private static final int readUTFUntilDelimiterToSlowAscii(Input input, String str, int i10, Output output) throws Throwable {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        boolean z13 = false;
        if (chunkBufferPrepareReadFirstHead == null) {
            i11 = 0;
        } else {
            i11 = 0;
            boolean z14 = false;
            while (true) {
                try {
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition();
                    ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8();
                    int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                    int writePosition2 = chunkBufferPrepareReadFirstHead.getWritePosition();
                    for (int i12 = readPosition; i12 < writePosition2; i12++) {
                        byte b10 = byteBufferM4458getMemorySK3TCg8.get(i12);
                        int i13 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if ((b10 & 128) != 128) {
                            if (n0.contains$default((CharSequence) str, (char) i13, false, 2, (Object) null)) {
                                z12 = false;
                                z14 = true;
                            } else {
                                if (i11 == i10) {
                                    bufferLimitExceeded(i10);
                                    throw new k();
                                }
                                i11++;
                                z12 = true;
                            }
                            if (z12) {
                            }
                        }
                        chunkBufferPrepareReadFirstHead.discardExact(i12 - readPosition);
                        z11 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead.discardExact(writePosition2 - readPosition);
                    z11 = true;
                    int writePosition3 = writePosition - (chunkBufferPrepareReadFirstHead.getWritePosition() - chunkBufferPrepareReadFirstHead.getReadPosition());
                    if (writePosition3 > 0) {
                        chunkBufferPrepareReadFirstHead.rewind(writePosition3);
                        OutputKt.writeFully(output, chunkBufferPrepareReadFirstHead, writePosition3);
                    }
                    if (!z11) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = true;
                }
            }
            z13 = z14;
        }
        return (z13 || input.getEndOfInput()) ? i11 : readUTF8UntilDelimiterToSlowUtf8(input, output, str, i10, i11);
    }

    public static final byte[] toByteArray(String str, Charset charset) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        if (e0.areEqual(charset, g.f86134b)) {
            return k0.encodeToByteArray(str);
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        return CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
    }

    public static /* synthetic */ byte[] toByteArray$default(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = g.f86134b;
        }
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        if (e0.areEqual(charset, g.f86134b)) {
            return k0.encodeToByteArray(str);
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        return CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
    }

    public static final void writeText(Output output, CharSequence text, int i10, int i11, Charset charset) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        if (charset == g.f86134b) {
            writeTextUtf8(output, text, i10, i11);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        EncodingKt.encodeToImpl(charsetEncoderNewEncoder, output, text, i10, i11);
    }

    public static /* synthetic */ void writeText$default(Output output, CharSequence charSequence, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = charSequence.length();
        }
        if ((i12 & 8) != 0) {
            charset = g.f86134b;
        }
        writeText(output, charSequence, i10, i11, charset);
    }

    private static final void writeTextUtf8(Output output, CharSequence charSequence, int i10, int i11) {
        ChunkBuffer chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, 1, null);
        int i12 = i10;
        while (true) {
            try {
                CharSequence charSequence2 = charSequence;
                int i13 = i11;
                int iM4576encodeUTF8lBXzO7A = UTF8Kt.m4576encodeUTF8lBXzO7A(chunkBufferPrepareWriteHead.m4458getMemorySK3TCg8(), charSequence2, i12, i13, chunkBufferPrepareWriteHead.getWritePosition(), chunkBufferPrepareWriteHead.getLimit());
                int iM4565component1Mh2AYeg = EncodeResult.m4565component1Mh2AYeg(iM4576encodeUTF8lBXzO7A) & 65535;
                i12 += iM4565component1Mh2AYeg;
                chunkBufferPrepareWriteHead.commitWritten(EncodeResult.m4566component2Mh2AYeg(iM4576encodeUTF8lBXzO7A) & 65535);
                int i14 = (iM4565component1Mh2AYeg != 0 || i12 >= i13) ? i12 < i13 ? 1 : 0 : 8;
                if (i14 <= 0) {
                    return;
                }
                chunkBufferPrepareWriteHead = UnsafeKt.prepareWriteHead(output, i14, chunkBufferPrepareWriteHead);
                charSequence = charSequence2;
                i11 = i13;
            } finally {
                output.afterHeadWrite();
            }
        }
    }

    @f
    public static final String readText(Input input, CharsetDecoder decoder, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(decoder, "decoder");
        return EncodingKt.decode(decoder, input, i10);
    }

    public static /* synthetic */ String readText$default(Input input, CharsetDecoder charsetDecoder, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readText(input, charsetDecoder, i10);
    }

    public static final String readTextExactBytes(Input input, int i10, Charset charset) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        e0.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return CharsetJVMKt.decodeExactBytes(charsetDecoderNewDecoder, input, i10);
    }

    public static /* synthetic */ String readTextExactBytes$default(Input input, int i10, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = g.f86134b;
        }
        return readTextExactBytes(input, i10, charset);
    }

    public static /* synthetic */ String readUTF8Line$default(Input input, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 16;
        }
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return readUTF8Line(input, i10, i11);
    }

    public static /* synthetic */ int readUTF8UntilDelimiterTo$default(Input input, Output output, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readUTF8UntilDelimiterTo(input, output, str, i10);
    }

    public static final byte[] readBytes(Input input, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        return readBytesOf(input, i10, i10);
    }

    public static final String readText(Input input, Charset charset, int i10) {
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        e0.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        return EncodingKt.decode(charsetDecoderNewDecoder, input, i10);
    }

    public static /* synthetic */ String readText$default(Input input, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = g.f86134b;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readText(input, charset, i10);
    }

    public static final String readUTF8Line(ByteReadPacket byteReadPacket, int i10, int i11) {
        e0.checkNotNullParameter(byteReadPacket, "<this>");
        if (byteReadPacket.getEndOfInput()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        if (readUTF8LineTo(byteReadPacket, sb2, i11)) {
            return sb2.toString();
        }
        return null;
    }

    public static final byte[] readBytes(Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return readBytesOf$default(input, 0, 0, 3, null);
    }

    public static final String readText(Buffer buffer, Charset charset, int i10) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        e0.checkNotNullExpressionValue(charsetDecoderNewDecoder, "charset.newDecoder()");
        CharsetJVMKt.decodeBuffer(charsetDecoderNewDecoder, buffer, sb2, true, i10);
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String readText$default(Buffer buffer, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = g.f86134b;
        }
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return readText(buffer, charset, i10);
    }

    public static final void writeText(Output output, char[] text, int i10, int i11, Charset charset) {
        e0.checkNotNullParameter(output, "<this>");
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(charset, "charset");
        if (charset == g.f86134b) {
            writeTextUtf8(output, new CharArraySequence(text, 0, text.length), i10, i11);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        EncodingKt.encode(charsetEncoderNewEncoder, text, i10, i11, output);
    }

    public static /* synthetic */ void writeText$default(Output output, char[] cArr, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        if ((i12 & 8) != 0) {
            charset = g.f86134b;
        }
        writeText(output, cArr, i10, i11, charset);
    }

    public static final int readUTF8UntilDelimiterTo(Input input, Appendable out, String delimiters, int i10) throws Throwable {
        int i11;
        boolean z10;
        boolean z11;
        e0.checkNotNullParameter(input, "<this>");
        e0.checkNotNullParameter(out, "out");
        e0.checkNotNullParameter(delimiters, "delimiters");
        boolean z12 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(input, 1);
        boolean z13 = false;
        if (chunkBufferPrepareReadFirstHead == null) {
            i11 = 0;
        } else {
            i11 = 0;
            boolean z14 = false;
            while (true) {
                try {
                    ByteBuffer byteBufferM4458getMemorySK3TCg8 = chunkBufferPrepareReadFirstHead.m4458getMemorySK3TCg8();
                    int readPosition = chunkBufferPrepareReadFirstHead.getReadPosition();
                    int writePosition = chunkBufferPrepareReadFirstHead.getWritePosition();
                    for (int i12 = readPosition; i12 < writePosition; i12++) {
                        byte b10 = byteBufferM4458getMemorySK3TCg8.get(i12);
                        int i13 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        if ((b10 & 128) != 128) {
                            char c10 = (char) i13;
                            if (n0.contains$default((CharSequence) delimiters, c10, false, 2, (Object) null)) {
                                z14 = true;
                                z11 = false;
                            } else if (i11 != i10) {
                                i11++;
                                out.append(c10);
                                z11 = true;
                            } else {
                                bufferLimitExceeded(i10);
                                throw new k();
                            }
                            if (z11) {
                            }
                        }
                        chunkBufferPrepareReadFirstHead.discardExact(i12 - readPosition);
                        z10 = false;
                        break;
                    }
                    chunkBufferPrepareReadFirstHead.discardExact(writePosition - readPosition);
                    z10 = true;
                    if (!z10) {
                        UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        break;
                    }
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(input, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z12 = false;
                        if (z12) {
                            UnsafeKt.completeReadHead(input, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            z13 = z14;
        }
        return !z13 ? readUTF8UntilDelimiterToSlowUtf8(input, out, delimiters, i10, i11) : i11;
    }

    public static final Void prematureEndOfStream(long j10) throws EOFException {
        throw new EOFException(o2.n(j10, "Premature end of stream: expected ", " bytes"));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int readUTF8UntilDelimiterToSlowUtf8(io.ktor.utils.io.core.Input r19, java.lang.Appendable r20, java.lang.String r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.StringsKt.readUTF8UntilDelimiterToSlowUtf8(io.ktor.utils.io.core.Input, java.lang.Appendable, java.lang.String, int, int):int");
    }
}
