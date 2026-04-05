package kotlinx.serialization.json.internal;

import a.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.e0;
import p0.o2;
import qv.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonToJavaStreamWriter implements InternalJsonWriter {
    private final byte[] buffer;
    private char[] charArray;
    private int indexInBuffer;
    private final OutputStream stream;

    public JsonToJavaStreamWriter(OutputStream stream) {
        e0.checkNotNullParameter(stream, "stream");
        this.stream = stream;
        this.buffer = ByteArrayPool.INSTANCE.take();
        this.charArray = CharArrayPool.INSTANCE.take();
    }

    private final void appendStringSlowPath(int i10, String str) throws IOException {
        byte b10;
        int length = str.length();
        for (int i11 = i10 - 1; i11 < length; i11++) {
            int iEnsureTotalCapacity = ensureTotalCapacity(i10, 2);
            char cCharAt = str.charAt(i11);
            if (cCharAt >= StringOpsKt.getESCAPE_MARKERS().length || (b10 = StringOpsKt.getESCAPE_MARKERS()[cCharAt]) == 0) {
                int i12 = iEnsureTotalCapacity + 1;
                this.charArray[iEnsureTotalCapacity] = cCharAt;
                i10 = i12;
            } else {
                if (b10 == 1) {
                    String str2 = StringOpsKt.getESCAPE_STRINGS()[cCharAt];
                    e0.checkNotNull(str2);
                    int iEnsureTotalCapacity2 = ensureTotalCapacity(iEnsureTotalCapacity, str2.length());
                    str2.getChars(0, str2.length(), this.charArray, iEnsureTotalCapacity2);
                    i10 = str2.length() + iEnsureTotalCapacity2;
                } else {
                    char[] cArr = this.charArray;
                    cArr[iEnsureTotalCapacity] = AbstractJsonLexerKt.STRING_ESC;
                    cArr[iEnsureTotalCapacity + 1] = (char) b10;
                    i10 = iEnsureTotalCapacity + 2;
                }
            }
        }
        ensureTotalCapacity(i10, 1);
        char[] cArr2 = this.charArray;
        cArr2[i10] = AbstractJsonLexerKt.STRING;
        writeUtf8(cArr2, i10 + 1);
        flush();
    }

    private final void ensure(int i10) throws IOException {
        if (this.buffer.length - this.indexInBuffer < i10) {
            flush();
        }
    }

    private final int ensureTotalCapacity(int i10, int i11) {
        int i12 = i11 + i10;
        char[] cArr = this.charArray;
        if (cArr.length <= i12) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, v.coerceAtLeast(i12, i10 * 2));
            e0.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.charArray = cArrCopyOf;
        }
        return i10;
    }

    private final void flush() throws IOException {
        this.stream.write(this.buffer, 0, this.indexInBuffer);
        this.indexInBuffer = 0;
    }

    private final int rest() {
        return this.buffer.length - this.indexInBuffer;
    }

    private final void writeUtf8(char[] cArr, int i10) throws IOException {
        if (i10 < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if (i10 > cArr.length) {
            StringBuilder sbT = o2.t(i10, "count > string.length: ", " > ");
            sbT.append(cArr.length);
            throw new IllegalArgumentException(sbT.toString().toString());
        }
        int i11 = 0;
        while (i11 < i10) {
            char c10 = cArr[i11];
            if (c10 < 128) {
                if (this.buffer.length - this.indexInBuffer < 1) {
                    flush();
                }
                byte[] bArr = this.buffer;
                int i12 = this.indexInBuffer;
                int i13 = i12 + 1;
                this.indexInBuffer = i13;
                bArr[i12] = (byte) c10;
                i11++;
                int iMin = Math.min(i10, (bArr.length - i13) + i11);
                while (i11 < iMin) {
                    char c11 = cArr[i11];
                    if (c11 < 128) {
                        byte[] bArr2 = this.buffer;
                        int i14 = this.indexInBuffer;
                        this.indexInBuffer = i14 + 1;
                        bArr2[i14] = (byte) c11;
                        i11++;
                    }
                }
            } else {
                if (c10 < 2048) {
                    if (this.buffer.length - this.indexInBuffer < 2) {
                        flush();
                    }
                    int i15 = (c10 >> 6) | PsExtractor.AUDIO_STREAM;
                    byte[] bArr3 = this.buffer;
                    int i16 = this.indexInBuffer;
                    int i17 = i16 + 1;
                    this.indexInBuffer = i17;
                    bArr3[i16] = (byte) i15;
                    this.indexInBuffer = i16 + 2;
                    bArr3[i17] = (byte) ((c10 & '?') | 128);
                } else if (c10 < 55296 || c10 > 57343) {
                    if (this.buffer.length - this.indexInBuffer < 3) {
                        flush();
                    }
                    byte[] bArr4 = this.buffer;
                    int i18 = this.indexInBuffer;
                    int i19 = i18 + 1;
                    this.indexInBuffer = i19;
                    bArr4[i18] = (byte) ((c10 >> '\f') | 224);
                    int i20 = i18 + 2;
                    this.indexInBuffer = i20;
                    bArr4[i19] = (byte) (((c10 >> 6) & 63) | 128);
                    this.indexInBuffer = i18 + 3;
                    bArr4[i20] = (byte) ((c10 & '?') | 128);
                } else {
                    int i21 = i11 + 1;
                    char c12 = i21 < i10 ? cArr[i21] : (char) 0;
                    if (c10 > 56319 || 56320 > c12 || c12 >= 57344) {
                        if (this.buffer.length - this.indexInBuffer < 1) {
                            flush();
                        }
                        byte[] bArr5 = this.buffer;
                        int i22 = this.indexInBuffer;
                        this.indexInBuffer = i22 + 1;
                        bArr5[i22] = (byte) 63;
                        i11 = i21;
                    } else {
                        int i23 = (((c10 & 1023) << 10) | (c12 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                        if (this.buffer.length - this.indexInBuffer < 4) {
                            flush();
                        }
                        int i24 = (i23 >> 18) | PsExtractor.VIDEO_STREAM_MASK;
                        byte[] bArr6 = this.buffer;
                        int i25 = this.indexInBuffer;
                        int i26 = i25 + 1;
                        this.indexInBuffer = i26;
                        bArr6[i25] = (byte) i24;
                        int i27 = i25 + 2;
                        this.indexInBuffer = i27;
                        bArr6[i26] = (byte) (((i23 >> 12) & 63) | 128);
                        int i28 = i25 + 3;
                        this.indexInBuffer = i28;
                        bArr6[i27] = (byte) (((i23 >> 6) & 63) | 128);
                        this.indexInBuffer = i25 + 4;
                        bArr6[i28] = (byte) ((i23 & 63) | 128);
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
    }

    private final void writeUtf8CodePoint(int i10) throws IOException {
        if (i10 < 128) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr = this.buffer;
            int i11 = this.indexInBuffer;
            this.indexInBuffer = i11 + 1;
            bArr[i11] = (byte) i10;
            return;
        }
        if (i10 < 2048) {
            if (this.buffer.length - this.indexInBuffer < 2) {
                flush();
            }
            int i12 = (i10 >> 6) | PsExtractor.AUDIO_STREAM;
            byte[] bArr2 = this.buffer;
            int i13 = this.indexInBuffer;
            int i14 = i13 + 1;
            this.indexInBuffer = i14;
            bArr2[i13] = (byte) i12;
            this.indexInBuffer = i13 + 2;
            bArr2[i14] = (byte) ((i10 & 63) | 128);
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            if (this.buffer.length - this.indexInBuffer < 1) {
                flush();
            }
            byte[] bArr3 = this.buffer;
            int i15 = this.indexInBuffer;
            this.indexInBuffer = i15 + 1;
            bArr3[i15] = (byte) 63;
            return;
        }
        if (i10 < 65536) {
            if (this.buffer.length - this.indexInBuffer < 3) {
                flush();
            }
            byte[] bArr4 = this.buffer;
            int i16 = this.indexInBuffer;
            int i17 = i16 + 1;
            this.indexInBuffer = i17;
            bArr4[i16] = (byte) ((i10 >> 12) | 224);
            int i18 = i16 + 2;
            this.indexInBuffer = i18;
            bArr4[i17] = (byte) (((i10 >> 6) & 63) | 128);
            this.indexInBuffer = i16 + 3;
            bArr4[i18] = (byte) ((i10 & 63) | 128);
            return;
        }
        if (i10 > 1114111) {
            throw new JsonEncodingException(b.e(i10, "Unexpected code point: "));
        }
        if (this.buffer.length - this.indexInBuffer < 4) {
            flush();
        }
        int i19 = (i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK;
        byte[] bArr5 = this.buffer;
        int i20 = this.indexInBuffer;
        int i21 = i20 + 1;
        this.indexInBuffer = i21;
        bArr5[i20] = (byte) i19;
        int i22 = i20 + 2;
        this.indexInBuffer = i22;
        bArr5[i21] = (byte) (((i10 >> 12) & 63) | 128);
        int i23 = i20 + 3;
        this.indexInBuffer = i23;
        bArr5[i22] = (byte) (((i10 >> 6) & 63) | 128);
        this.indexInBuffer = i20 + 4;
        bArr5[i23] = (byte) ((i10 & 63) | 128);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() throws IOException {
        flush();
        CharArrayPool.INSTANCE.release(this.charArray);
        ByteArrayPool.INSTANCE.release(this.buffer);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(String text) throws IOException {
        e0.checkNotNullParameter(text, "text");
        int length = text.length();
        ensureTotalCapacity(0, length);
        text.getChars(0, length, this.charArray, 0);
        writeUtf8(this.charArray, length);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c10) throws IOException {
        writeUtf8CodePoint(c10);
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long j10) throws IOException {
        write(String.valueOf(j10));
    }

    @Override // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(String text) throws IOException {
        e0.checkNotNullParameter(text, "text");
        ensureTotalCapacity(0, text.length() + 2);
        char[] cArr = this.charArray;
        cArr[0] = AbstractJsonLexerKt.STRING;
        int length = text.length();
        text.getChars(0, length, cArr, 1);
        int i10 = length + 1;
        for (int i11 = 1; i11 < i10; i11++) {
            char c10 = cArr[i11];
            if (c10 < StringOpsKt.getESCAPE_MARKERS().length && StringOpsKt.getESCAPE_MARKERS()[c10] != 0) {
                appendStringSlowPath(i11, text);
                return;
            }
        }
        cArr[i10] = AbstractJsonLexerKt.STRING;
        writeUtf8(cArr, length + 2);
        flush();
    }

    private final void write(int i10) {
        byte[] bArr = this.buffer;
        int i11 = this.indexInBuffer;
        this.indexInBuffer = i11 + 1;
        bArr[i11] = (byte) i10;
    }
}
