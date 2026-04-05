package io.ktor.utils.io.core.internal;

import bv.d;
import bv.f;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.http.ContentDisposition;
import io.ktor.utils.io.core.Buffer;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import p0.o2;
import qv.v;
import tu.k;
import tu.t0;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UTF8Kt {
    private static final int HighSurrogateMagic = 55232;
    private static final int MaxCodePoint = 1114111;
    private static final int MinHighSurrogate = 55296;
    private static final int MinLowSurrogate = 56320;
    private static final int MinSupplementary = 65536;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.ktor.utils.io.core.internal.UTF8Kt", f = "UTF8.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {37}, m = "decodeUTF8LineLoopSuspend", n = {"out", "nextChunk", "afterRead", "decoded", ContentDisposition.Parameters.Size, "cr", TtmlNode.END, "limit"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: io.ktor.utils.io.core.internal.UTF8Kt$decodeUTF8LineLoopSuspend$1, reason: invalid class name */
    public static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(zu.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UTF8Kt.decodeUTF8LineLoopSuspend(null, 0, null, null, this);
        }
    }

    public static final int byteCountUtf8(int i10) {
        int i11 = 0;
        int i12 = 128;
        for (int i13 = 1; i13 < 7 && (i10 & i12) != 0; i13++) {
            i10 &= ~i12;
            i12 >>= 1;
            i11++;
        }
        return i11;
    }

    private static final int charactersSize(int i10) {
        if (1 <= i10 && i10 < 128) {
            return 1;
        }
        if (128 <= i10 && i10 < 2048) {
            return 2;
        }
        if (2048 <= i10 && i10 < 65536) {
            return 3;
        }
        if (65536 <= i10 && i10 < 1114112) {
            return 4;
        }
        malformedCodePoint(i10);
        throw new k();
    }

    public static final int codePoint(char c10, char c11) {
        return ((c10 - 55232) << 10) | (c11 - 56320);
    }

    public static final boolean decodeASCII(Buffer buffer, l consumer) {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(consumer, "consumer");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        for (int i10 = readPosition; i10 < writePosition; i10++) {
            byte b10 = byteBufferM4458getMemorySK3TCg8.get(i10);
            int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((b10 & 128) == 128 || !((Boolean) consumer.invoke(Character.valueOf((char) i11))).booleanValue()) {
                buffer.discardExact(i10 - readPosition);
                return false;
            }
        }
        buffer.discardExact(writePosition - readPosition);
        return true;
    }

    public static final int decodeUTF8(Buffer buffer, l consumer) throws MalformedUTF8InputException {
        e0.checkNotNullParameter(buffer, "<this>");
        e0.checkNotNullParameter(consumer, "consumer");
        ByteBuffer byteBufferM4458getMemorySK3TCg8 = buffer.m4458getMemorySK3TCg8();
        int readPosition = buffer.getReadPosition();
        int writePosition = buffer.getWritePosition();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = readPosition; i13 < writePosition; i13++) {
            byte b10 = byteBufferM4458getMemorySK3TCg8.get(i13);
            int i14 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if ((b10 & 128) != 0) {
                if (i10 == 0) {
                    int i15 = 128;
                    i11 = i14;
                    for (int i16 = 1; i16 < 7 && (i11 & i15) != 0; i16++) {
                        i11 &= ~i15;
                        i15 >>= 1;
                        i10++;
                    }
                    int i17 = i10 - 1;
                    if (i10 > writePosition - i13) {
                        buffer.discardExact(i13 - readPosition);
                        return i10;
                    }
                    i12 = i10;
                    i10 = i17;
                } else {
                    i11 = (i11 << 6) | (b10 & AbstractJsonLexerKt.TC_INVALID);
                    i10--;
                    if (i10 != 0) {
                        continue;
                    } else {
                        if (!isBmpCodePoint(i11)) {
                            if (!isValidCodePoint(i11)) {
                                malformedCodePoint(i11);
                                throw new k();
                            }
                            if (!((Boolean) consumer.invoke(Character.valueOf((char) highSurrogate(i11)))).booleanValue() || !((Boolean) consumer.invoke(Character.valueOf((char) lowSurrogate(i11)))).booleanValue()) {
                                buffer.discardExact(((i13 - readPosition) - i12) + 1);
                                return -1;
                            }
                        } else if (!((Boolean) consumer.invoke(Character.valueOf((char) i11))).booleanValue()) {
                            buffer.discardExact(((i13 - readPosition) - i12) + 1);
                            return -1;
                        }
                        i11 = 0;
                    }
                }
            } else {
                if (i10 != 0) {
                    malformedByteCount(i10);
                    throw new k();
                }
                if (!((Boolean) consumer.invoke(Character.valueOf((char) i14))).booleanValue()) {
                    buffer.discardExact(i13 - readPosition);
                    return -1;
                }
            }
        }
        buffer.discardExact(writePosition - readPosition);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x021e, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x026a, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0276, code lost:
    
        r8.f71863b = true;
        r0.f71866b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x027f, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x029e, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x029f, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02ab, code lost:
    
        r8.f71863b = true;
        r0.f71866b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02b4, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
    
        r8.f71863b = true;
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014d, code lost:
    
        r8.f71863b = true;
        r0.f71866b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0156, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d4, code lost:
    
        r6.discardExact(r23 - r18);
        r2 = r2.f71866b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0200, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0201, code lost:
    
        r8.f71863b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0215, code lost:
    
        r8.f71863b = true;
        r0.f71866b = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029a A[Catch: all -> 0x020a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x020a, blocks: (B:89:0x01fc, B:114:0x0265, B:132:0x029a), top: B:215:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x032e A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x0164, blocks: (B:58:0x015c, B:157:0x0328, B:159:0x032e, B:160:0x0331, B:164:0x033e, B:163:0x0337, B:155:0x030d, B:63:0x0167, B:65:0x016d, B:67:0x017a, B:68:0x0191, B:69:0x0192, B:70:0x019c, B:71:0x019d, B:73:0x01a5, B:76:0x01ad, B:78:0x01b3, B:79:0x01c4, B:81:0x01d4, B:82:0x01dc, B:84:0x01ed, B:86:0x01f5, B:92:0x0201, B:102:0x0220, B:93:0x0204, B:148:0x02cf, B:98:0x0215, B:99:0x021a, B:101:0x021e, B:103:0x022b, B:105:0x022f, B:147:0x02c9, B:107:0x0238, B:108:0x024f, B:109:0x0250, B:111:0x025a, B:117:0x026a, B:143:0x02b6, B:118:0x026d, B:129:0x028f, B:135:0x029f, B:136:0x02a2, B:139:0x02ab, B:140:0x02b0, B:142:0x02b4, B:144:0x02c1, B:146:0x02c5, B:149:0x02d2, B:150:0x02e9, B:121:0x0276, B:122:0x027b, B:124:0x027f, B:126:0x0283, B:128:0x0287, B:151:0x02ea, B:152:0x0301, B:153:0x0302, B:154:0x030c, B:156:0x031b), top: B:212:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0337 A[Catch: all -> 0x0164, TryCatch #1 {all -> 0x0164, blocks: (B:58:0x015c, B:157:0x0328, B:159:0x032e, B:160:0x0331, B:164:0x033e, B:163:0x0337, B:155:0x030d, B:63:0x0167, B:65:0x016d, B:67:0x017a, B:68:0x0191, B:69:0x0192, B:70:0x019c, B:71:0x019d, B:73:0x01a5, B:76:0x01ad, B:78:0x01b3, B:79:0x01c4, B:81:0x01d4, B:82:0x01dc, B:84:0x01ed, B:86:0x01f5, B:92:0x0201, B:102:0x0220, B:93:0x0204, B:148:0x02cf, B:98:0x0215, B:99:0x021a, B:101:0x021e, B:103:0x022b, B:105:0x022f, B:147:0x02c9, B:107:0x0238, B:108:0x024f, B:109:0x0250, B:111:0x025a, B:117:0x026a, B:143:0x02b6, B:118:0x026d, B:129:0x028f, B:135:0x029f, B:136:0x02a2, B:139:0x02ab, B:140:0x02b0, B:142:0x02b4, B:144:0x02c1, B:146:0x02c5, B:149:0x02d2, B:150:0x02e9, B:121:0x0276, B:122:0x027b, B:124:0x027f, B:126:0x0283, B:128:0x0287, B:151:0x02ea, B:152:0x0301, B:153:0x0302, B:154:0x030c, B:156:0x031b), top: B:212:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00aa -> B:23:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object decodeUTF8LineLoopSuspend(java.lang.Appendable r28, int r29, kv.p r30, kv.l r31, zu.d<? super java.lang.Boolean> r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.internal.UTF8Kt.decodeUTF8LineLoopSuspend(java.lang.Appendable, int, kv.p, kv.l, zu.d):java.lang.Object");
    }

    /* renamed from: encodeUTF8-lBXzO7A, reason: not valid java name */
    public static final int m4576encodeUTF8lBXzO7A(ByteBuffer encodeUTF8, CharSequence text, int i10, int i11, int i12, int i13) {
        e0.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        e0.checkNotNullParameter(text, "text");
        int iMin = Math.min(i11, i10 + Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        int iCoerceAtMost = v.coerceAtMost(i13, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        int i14 = i10;
        int i15 = i12;
        while (i15 < iCoerceAtMost && i14 < iMin) {
            int i16 = i14 + 1;
            char cCharAt = text.charAt(i14);
            int i17 = cCharAt & 65535;
            if ((cCharAt & 65408) != 0) {
                return m4577encodeUTF8Stage1Vm9B2pQ(encodeUTF8, text, i14, iMin, i10, i15, iCoerceAtMost, i12);
            }
            encodeUTF8.put(i15, (byte) i17);
            i14 = i16;
            i15++;
        }
        return EncodeResult.m4568constructorimpl(t0.m7106constructorimpl((short) (i14 - i10)), t0.m7106constructorimpl((short) (i15 - i12)));
    }

    /* renamed from: encodeUTF8Stage1-Vm9B2pQ, reason: not valid java name */
    private static final int m4577encodeUTF8Stage1Vm9B2pQ(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13, int i14, int i15) {
        int iCodePoint;
        int i16;
        int i17 = i14 - 3;
        while (i17 - i13 > 0 && i10 < i11) {
            int i18 = i10 + 1;
            char cCharAt = charSequence.charAt(i10);
            if (!Character.isHighSurrogate(cCharAt)) {
                i10 = i18;
                iCodePoint = cCharAt;
            } else if (i18 == i11 || !Character.isLowSurrogate(charSequence.charAt(i18))) {
                i10 = i18;
                iCodePoint = 63;
            } else {
                i10 += 2;
                iCodePoint = codePoint(cCharAt, charSequence.charAt(i18));
            }
            if (iCodePoint >= 0 && iCodePoint < 128) {
                byteBuffer.put(i13, (byte) iCodePoint);
                i16 = 1;
            } else if (128 <= iCodePoint && iCodePoint < 2048) {
                byteBuffer.put(i13, (byte) (((iCodePoint >> 6) & 31) | PsExtractor.AUDIO_STREAM));
                byteBuffer.put(i13 + 1, (byte) (128 | (iCodePoint & 63)));
                i16 = 2;
            } else if (2048 <= iCodePoint && iCodePoint < 65536) {
                byteBuffer.put(i13, (byte) (((iCodePoint >> 12) & 15) | 224));
                byteBuffer.put(i13 + 1, (byte) ((63 & (iCodePoint >> 6)) | 128));
                byteBuffer.put(i13 + 2, (byte) (128 | (iCodePoint & 63)));
                i16 = 3;
            } else {
                if (65536 > iCodePoint || iCodePoint >= 1114112) {
                    malformedCodePoint(iCodePoint);
                    throw new k();
                }
                byteBuffer.put(i13, (byte) (((iCodePoint >> 18) & 7) | PsExtractor.VIDEO_STREAM_MASK));
                byteBuffer.put(i13 + 1, (byte) (((iCodePoint >> 12) & 63) | 128));
                byteBuffer.put(i13 + 2, (byte) ((63 & (iCodePoint >> 6)) | 128));
                byteBuffer.put(i13 + 3, (byte) (128 | (iCodePoint & 63)));
                i16 = 4;
            }
            i13 += i16;
        }
        return i13 == i17 ? m4578encodeUTF8Stage2Vm9B2pQ(byteBuffer, charSequence, i10, i11, i12, i13, i14, i15) : EncodeResult.m4568constructorimpl(t0.m7106constructorimpl((short) (i10 - i12)), t0.m7106constructorimpl((short) (i13 - i15)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        malformedCodePoint(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fd, code lost:
    
        return io.ktor.utils.io.core.internal.EncodeResult.m4568constructorimpl(tu.t0.m7106constructorimpl((short) (r3 - r20)), tu.t0.m7106constructorimpl((short) (r4 - r23)));
     */
    /* renamed from: encodeUTF8Stage2-Vm9B2pQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int m4578encodeUTF8Stage2Vm9B2pQ(java.nio.ByteBuffer r16, java.lang.CharSequence r17, int r18, int r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.core.internal.UTF8Kt.m4578encodeUTF8Stage2Vm9B2pQ(java.nio.ByteBuffer, java.lang.CharSequence, int, int, int, int, int, int):int");
    }

    public static final int highSurrogate(int i10) {
        return (i10 >>> 10) + 55232;
    }

    public static final boolean isBmpCodePoint(int i10) {
        return (i10 >>> 16) == 0;
    }

    public static final boolean isValidCodePoint(int i10) {
        return i10 <= MaxCodePoint;
    }

    public static final int lowSurrogate(int i10) {
        return (i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320;
    }

    public static final Void malformedByteCount(int i10) throws MalformedUTF8InputException {
        throw new MalformedUTF8InputException(o2.k(i10, "Expected ", " more character bytes"));
    }

    public static final Void malformedCodePoint(int i10) {
        throw new IllegalArgumentException(o2.k(i10, "Malformed code-point ", " found"));
    }

    /* renamed from: putUtf8Char-62zg_DM, reason: not valid java name */
    public static final int m4579putUtf8Char62zg_DM(ByteBuffer putUtf8Char, int i10, int i11) {
        e0.checkNotNullParameter(putUtf8Char, "$this$putUtf8Char");
        if (i11 >= 0 && i11 < 128) {
            putUtf8Char.put(i10, (byte) i11);
            return 1;
        }
        if (128 <= i11 && i11 < 2048) {
            putUtf8Char.put(i10, (byte) (((i11 >> 6) & 31) | PsExtractor.AUDIO_STREAM));
            putUtf8Char.put(i10 + 1, (byte) ((i11 & 63) | 128));
            return 2;
        }
        if (2048 <= i11 && i11 < 65536) {
            putUtf8Char.put(i10, (byte) (((i11 >> 12) & 15) | 224));
            putUtf8Char.put(i10 + 1, (byte) (((i11 >> 6) & 63) | 128));
            putUtf8Char.put(i10 + 2, (byte) ((i11 & 63) | 128));
            return 3;
        }
        if (65536 > i11 || i11 >= 1114112) {
            malformedCodePoint(i11);
            throw new k();
        }
        putUtf8Char.put(i10, (byte) (((i11 >> 18) & 7) | PsExtractor.VIDEO_STREAM_MASK));
        putUtf8Char.put(i10 + 1, (byte) (((i11 >> 12) & 63) | 128));
        putUtf8Char.put(i10 + 2, (byte) (((i11 >> 6) & 63) | 128));
        putUtf8Char.put(i10 + 3, (byte) ((i11 & 63) | 128));
        return 4;
    }

    private static final Void prematureEndOfStreamUtf(int i10) throws EOFException {
        throw new EOFException(o2.k(i10, QpyI.trHFwFHUjDB, " bytes to decode UTF-8 char"));
    }
}
