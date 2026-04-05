package com.explorestack.protobuf;

import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Utf8;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class tc {

    /* renamed from: b, reason: collision with root package name */
    public static final bb f22674b = new bb();

    /* renamed from: c, reason: collision with root package name */
    public static final cb f22675c = new cb();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22676a;

    public /* synthetic */ tc(int i10) {
        this.f22676a = i10;
    }

    public static void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (!i(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !i(b12) && !i(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | (b13 & Utf8.REPLACEMENT_BYTE);
                cArr[i10] = (char) ((i11 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i10 + 1] = (char) ((i11 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public static void b(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (b10 < -62 || i(b11)) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Utf8.REPLACEMENT_BYTE));
    }

    public static void c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (i(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || i(b12)))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (b12 & Utf8.REPLACEMENT_BYTE));
    }

    public static String e(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = byteBuffer.get(i10);
            if (b10 < 0) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = byteBuffer.get(i10);
            if (b11 >= 0) {
                int i16 = i14 + 1;
                cArr[i14] = (char) b11;
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = byteBuffer.get(i17);
                    if (b12 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i16] = (char) b12;
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                i10 += 2;
                b(b11, byteBuffer.get(i15), cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                int i18 = i10 + 2;
                i10 += 3;
                c(b11, byteBuffer.get(i15), byteBuffer.get(i18), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b13 = byteBuffer.get(i15);
                int i19 = i10 + 3;
                byte b14 = byteBuffer.get(i10 + 2);
                i10 += 4;
                a(b11, b13, b14, byteBuffer.get(i19), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    public static void g(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i10;
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i11 = 0;
        while (i11 < length) {
            try {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i11, (byte) cCharAt);
                i11++;
            } catch (IndexOutOfBoundsException unused) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
            }
        }
        if (i11 == length) {
            byteBuffer.position(iPosition + i11);
            return;
        }
        iPosition += i11;
        while (i11 < length) {
            char cCharAt2 = charSequence.charAt(i11);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i12 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | PsExtractor.AUDIO_STREAM));
                    byteBuffer.put(i12, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i12;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i12;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i13 = i11 + 1;
                    if (i13 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i13);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i14 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    i10 = iPosition + 2;
                                } catch (IndexOutOfBoundsException unused3) {
                                    iPosition = i14;
                                    i11 = i13;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                                try {
                                    byteBuffer.put(i14, (byte) (((codePoint >>> 12) & 63) | 128));
                                    iPosition += 3;
                                    byteBuffer.put(i10, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                    i11 = i13;
                                } catch (IndexOutOfBoundsException unused4) {
                                    i11 = i13;
                                    iPosition = i10;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i11) + " at index " + (Math.max(i11, (iPosition - byteBuffer.position()) + 1) + byteBuffer.position()));
                                }
                            } else {
                                i11 = i13;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                    }
                    throw new uc(i11, length);
                }
                int i15 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i11++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    public static String h(qb qbVar) {
        StringBuilder sb2 = new StringBuilder(qbVar.size());
        for (int i10 = 0; i10 < qbVar.size(); i10++) {
            byte bByteAt = qbVar.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append(AbstractJsonLexerKt.STRING_ESC);
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bByteAt);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean i(byte b10) {
        return b10 > -65;
    }

    public static int l(int i10, ByteBuffer byteBuffer, int i11, int i12) {
        byte b10;
        int i13;
        byte b11;
        int i14;
        int i15 = i11;
        if (i10 != 0) {
            if (i15 >= i12) {
                return i10;
            }
            byte b12 = (byte) i10;
            if (b12 < -32) {
                if (b12 < -62) {
                    return -1;
                }
                int i16 = i15 + 1;
                if (byteBuffer.get(i11) > -65) {
                    return -1;
                }
                i15 = i16;
            } else if (b12 < -16) {
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    i14 = i15 + 1;
                    b11 = byteBuffer.get(i11);
                    if (i14 >= i12) {
                        return vc.f(b12, b11);
                    }
                } else {
                    b11 = b13;
                    i14 = i15;
                }
                if (b11 > -65) {
                    return -1;
                }
                if (b12 == -32 && b11 < -96) {
                    return -1;
                }
                if (b12 == -19 && b11 >= -96) {
                    return -1;
                }
                i15 = i14 + 1;
                if (byteBuffer.get(i14) > -65) {
                    return -1;
                }
            } else {
                byte b14 = (byte) (~(i10 >> 8));
                if (b14 == 0) {
                    i13 = i15 + 1;
                    b14 = byteBuffer.get(i11);
                    if (i13 >= i12) {
                        return vc.f(b12, b14);
                    }
                    b10 = 0;
                } else {
                    b10 = (byte) (i10 >> 16);
                    i13 = i15;
                }
                if (b10 == 0) {
                    int i17 = i13 + 1;
                    byte b15 = byteBuffer.get(i13);
                    if (i17 >= i12) {
                        return vc.g(b12, b14, b15);
                    }
                    b10 = b15;
                    i13 = i17;
                }
                if (b14 > -65) {
                    return -1;
                }
                if ((((b14 + 112) + (b12 << 28)) >> 30) != 0 || b10 > -65) {
                    return -1;
                }
                i15 = i13 + 1;
                if (byteBuffer.get(i13) > -65) {
                    return -1;
                }
            }
        }
        tc tcVar = vc.f22784a;
        int i18 = i12 - 7;
        int i19 = i15;
        while (i19 < i18 && (byteBuffer.getLong(i19) & (-9187201950435737472L)) == 0) {
            i19 += 8;
        }
        int i20 = (i19 - i15) + i15;
        while (i20 < i12) {
            int i21 = i20 + 1;
            byte b16 = byteBuffer.get(i20);
            if (b16 >= 0) {
                i20 = i21;
            } else if (b16 < -32) {
                if (i21 >= i12) {
                    return b16;
                }
                if (b16 < -62 || byteBuffer.get(i21) > -65) {
                    return -1;
                }
                i20 += 2;
            } else if (b16 < -16) {
                if (i21 >= i12 - 1) {
                    return vc.b(byteBuffer, b16, i21, i12 - i21);
                }
                int i22 = i20 + 2;
                byte b17 = byteBuffer.get(i21);
                if (b17 > -65) {
                    return -1;
                }
                if (b16 == -32 && b17 < -96) {
                    return -1;
                }
                if ((b16 == -19 && b17 >= -96) || byteBuffer.get(i22) > -65) {
                    return -1;
                }
                i20 += 3;
            } else {
                if (i21 >= i12 - 2) {
                    return vc.b(byteBuffer, b16, i21, i12 - i21);
                }
                int i23 = i20 + 2;
                byte b18 = byteBuffer.get(i21);
                if (b18 > -65) {
                    return -1;
                }
                if ((((b18 + 112) + (b16 << 28)) >> 30) != 0) {
                    return -1;
                }
                int i24 = i20 + 3;
                if (byteBuffer.get(i23) > -65) {
                    return -1;
                }
                i20 += 4;
                if (byteBuffer.get(i24) > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static int m(long j10, int i10, int i11) {
        if (i11 == 0) {
            tc tcVar = vc.f22784a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return vc.f(i10, sc.f22643c.getByte(j10));
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        rc rcVar = sc.f22643c;
        return vc.g(i10, rcVar.getByte(j10), rcVar.getByte(j10 + 1));
    }

    public static int n(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            tc tcVar = vc.f22784a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return vc.f(i10, sc.i(bArr, j10));
        }
        if (i11 == 2) {
            return vc.g(i10, sc.i(bArr, j10), sc.i(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(byte[] r11, int r12, int r13) throws com.explorestack.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.tc.d(byte[], int, int):java.lang.String");
    }

    public final int f(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        long j10;
        char c10;
        long j11;
        long j12;
        char c11;
        int i14;
        char cCharAt2;
        switch (this.f22676a) {
            case 0:
                int length = charSequence.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = charSequence.charAt(i16);
                    if (cCharAt3 < 128 && i17 < i15) {
                        bArr[i17] = (byte) cCharAt3;
                        i17++;
                    } else if (cCharAt3 < 2048 && i17 <= i15 - 2) {
                        int i18 = i17 + 1;
                        bArr[i17] = (byte) ((cCharAt3 >>> 6) | 960);
                        i17 += 2;
                        bArr[i18] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i17 > i15 - 3) {
                            if (i17 > i15 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i12)))) {
                                    throw new uc(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != charSequence.length()) {
                                char cCharAt4 = charSequence.charAt(i19);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i17] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i20 = i17 + 3;
                                    bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i17 += 4;
                                    bArr[i20] = (byte) ((codePoint & 63) | 128);
                                    i16 = i19;
                                } else {
                                    i16 = i19;
                                }
                            }
                            throw new uc(i16 - 1, length);
                        }
                        bArr[i17] = (byte) ((cCharAt3 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                        int i21 = i17 + 2;
                        bArr[i17 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i17 += 3;
                        bArr[i21] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i16++;
                }
                return i17;
            default:
                long j13 = i10;
                long j14 = i11 + j13;
                int length2 = charSequence.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    c10 = 128;
                    if (i22 < length2 && (cCharAt2 = charSequence.charAt(i22)) < 128) {
                        sc.n(bArr, j13, (byte) cCharAt2);
                        i22++;
                        j13 = 1 + j13;
                    }
                }
                if (i22 == length2) {
                    return (int) j13;
                }
                while (i22 < length2) {
                    char cCharAt5 = charSequence.charAt(i22);
                    if (cCharAt5 < c10 && j13 < j14) {
                        sc.n(bArr, j13, (byte) cCharAt5);
                        c11 = c10;
                        j11 = j10;
                        j12 = j13 + j10;
                    } else if (cCharAt5 >= 2048 || j13 > j14 - 2) {
                        j11 = j10;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j13 > j14 - 3) {
                            long j15 = j13;
                            if (j15 > j14 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, charSequence.charAt(i14)))) {
                                    throw new uc(i22, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j15);
                            }
                            int i23 = i22 + 1;
                            if (i23 != length2) {
                                char cCharAt6 = charSequence.charAt(i23);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    sc.n(bArr, j15, (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    c11 = 128;
                                    sc.n(bArr, j15 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    sc.n(bArr, j15 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    sc.n(bArr, j15 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j12 = j15 + 4;
                                    i22 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            throw new uc(i22 - 1, length2);
                        }
                        sc.n(bArr, j13, (byte) ((cCharAt5 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT));
                        long j16 = j13;
                        sc.n(bArr, j13 + j11, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j12 = j16 + 3;
                        sc.n(bArr, j16 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c11 = 128;
                    } else {
                        j11 = j10;
                        sc.n(bArr, j13, (byte) ((cCharAt5 >>> 6) | 960));
                        sc.n(bArr, j13 + j11, (byte) ((cCharAt5 & '?') | c10));
                        j12 = j13 + 2;
                        c11 = c10;
                    }
                    i22++;
                    c10 = c11;
                    j13 = j12;
                    j10 = j11;
                }
                return (int) j13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (com.explorestack.protobuf.sc.f22643c.getByte(r3) > (-65)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (com.explorestack.protobuf.sc.f22643c.getByte(r3) > (-65)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e3, code lost:
    
        if (com.explorestack.protobuf.sc.f22643c.getByte(r3) > (-65)) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(int r23, java.nio.ByteBuffer r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.tc.j(int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (com.explorestack.protobuf.sc.i(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (com.explorestack.protobuf.sc.i(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (com.explorestack.protobuf.sc.i(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021e A[ADDED_TO_REGION, LOOP:4: B:165:0x021e->B:247:0x021e, LOOP_START, PHI: r2
      0x021e: PHI (r2v3 int) = (r2v2 int), (r2v7 int) binds: [B:163:0x021b, B:247:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[PHI: r2
      PHI (r2v1 int) = (r2v0 int), (r2v13 int), (r2v19 int), (r2v22 int) binds: [B:114:0x018d, B:157:0x020f, B:138:0x01cc, B:123:0x019f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(int r23, byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.tc.k(int, byte[], int, int):int");
    }
}
