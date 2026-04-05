package io.ktor.utils.io.charsets;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import e3.g;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.e0;
import kv.l;
import sv.e;
import sv.n0;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UTFKt {
    private static final int HighSurrogateMagic = 55232;
    private static final int MaxCodePoint = 1114111;
    private static final int MinHighSurrogate = 55296;
    private static final int MinLowSurrogate = 56320;
    private static final int MinSupplementary = 65536;

    public static final long decodeUTF(ByteBuffer byteBuffer, char[] out, int i10, int i11) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(out, "out");
        int iDecodeASCII = StringsKt.decodeASCII(byteBuffer, out, i10, i11);
        return (!byteBuffer.hasRemaining() || iDecodeASCII == i11) ? decodeUtf8Result(iDecodeASCII, 0) : byteBuffer.hasArray() ? decodeUtf8ResultAcc(iDecodeASCII, decodeUTF8_array(byteBuffer, out, i10 + iDecodeASCII, i11 - iDecodeASCII)) : decodeUtf8ResultAcc(iDecodeASCII, decodeUTF8_buffer(byteBuffer, out, i10 + iDecodeASCII, i11 - iDecodeASCII));
    }

    public static /* synthetic */ long decodeUTF8Line$default(ByteBuffer byteBuffer, char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cArr.length;
        }
        return decodeUTF8Line(byteBuffer, cArr, i10, i11);
    }

    private static final long decodeUTF8Line_array(ByteBuffer byteBuffer, char[] cArr, int i10, int i11) throws Throwable {
        int i12;
        long jY;
        boolean z10;
        char c10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (iPosition > iRemaining) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRemaining > bArrArray.length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = i10 + i11;
        if (i13 > cArr.length) {
            throw indexOutOfBounds(i10, i11, cArr.length);
        }
        int i14 = i10;
        boolean z15 = false;
        while (iPosition < iRemaining && i14 < i13) {
            int i15 = iPosition + 1;
            byte b10 = bArrArray[iPosition];
            i12 = 1;
            if (b10 >= 0) {
                char c11 = (char) b10;
                if (c11 == '\r') {
                    z15 = true;
                    z10 = true;
                } else {
                    if (c11 == '\n') {
                        z15 = false;
                    } else if (!z15) {
                        z10 = true;
                    }
                    z10 = false;
                }
                if (!z10) {
                    jY = g.y(byteBuffer, iPosition, i14, i10, -1);
                    break;
                }
                cArr[i14] = c11;
                i14++;
                iPosition = i15;
            } else if ((b10 & 224) == 192) {
                if (i15 >= iRemaining) {
                    jY = g.y(byteBuffer, iPosition, i14, i10, 2);
                    break;
                }
                int i16 = iPosition + 2;
                char c12 = (char) ((bArrArray[i15] & Utf8.REPLACEMENT_BYTE) | ((b10 & 31) << 6));
                if (c12 == '\r') {
                    z15 = true;
                    z14 = true;
                } else {
                    if (c12 == '\n') {
                        z15 = false;
                    } else if (!z15) {
                        z14 = true;
                    }
                    z14 = false;
                }
                if (!z14) {
                    jY = g.y(byteBuffer, iPosition, i14, i10, -1);
                    break;
                }
                cArr[i14] = c12;
                i14++;
                iPosition = i16;
            } else {
                if ((b10 & 240) != 224) {
                    if ((b10 & 248) != 240) {
                        unsupportedByteCount(b10);
                        throw new k();
                    }
                    if (iRemaining - i15 < 3) {
                        jY = g.y(byteBuffer, iPosition, i14, i10, 4);
                        break;
                    }
                    byte b11 = bArrArray[i15];
                    byte b12 = bArrArray[iPosition + 2];
                    i15 = iPosition + 4;
                    byte b13 = bArrArray[iPosition + 3];
                    int i17 = ((b12 & Utf8.REPLACEMENT_BYTE) << 6) | ((b11 & Utf8.REPLACEMENT_BYTE) << 12) | ((b10 & 7) << 18) | (b13 & Utf8.REPLACEMENT_BYTE);
                    if (!isValidCodePoint(i17)) {
                        malformedCodePoint(i17);
                        throw new k();
                    }
                    if (i13 - i14 < 2) {
                        jY = g.y(byteBuffer, iPosition, i14, i10, 0);
                        break;
                    }
                    char cHighSurrogate = (char) highSurrogate(i17);
                    char cLowSurrogate = (char) lowSurrogate(i17);
                    if (cHighSurrogate == '\r') {
                        z15 = true;
                        z11 = true;
                        c10 = '\n';
                    } else {
                        c10 = '\n';
                        if (cHighSurrogate == '\n') {
                            z15 = false;
                        } else if (!z15) {
                            z11 = true;
                        }
                        z11 = false;
                    }
                    if (z11) {
                        if (cLowSurrogate == '\r') {
                            z15 = true;
                            z12 = true;
                        } else {
                            if (cLowSurrogate == c10) {
                                z15 = false;
                            } else if (!z15) {
                                z12 = true;
                            }
                            z12 = false;
                        }
                        if (z12) {
                            int i18 = i14 + 1;
                            cArr[i14] = cHighSurrogate;
                            i14 += 2;
                            cArr[i18] = cLowSurrogate;
                            iPosition = i15;
                        }
                    }
                    jY = g.y(byteBuffer, iPosition, i14, i10, -1);
                    break;
                }
                if (iRemaining - i15 < 2) {
                    jY = g.y(byteBuffer, iPosition, i14, i10, 3);
                    break;
                }
                byte b14 = bArrArray[i15];
                int i19 = iPosition + 3;
                int i20 = b10 & 15;
                int i21 = (bArrArray[iPosition + 2] & Utf8.REPLACEMENT_BYTE) | ((b14 & Utf8.REPLACEMENT_BYTE) << 6) | (i20 << 12);
                if (i20 != 0 && !isBmpCodePoint(i21)) {
                    malformedCodePoint(i21);
                    throw new k();
                }
                char c13 = (char) i21;
                if (c13 == '\r') {
                    z15 = true;
                    z13 = true;
                } else {
                    if (c13 == '\n') {
                        z15 = false;
                    } else if (!z15) {
                        z13 = true;
                    }
                    z13 = false;
                }
                if (!z13) {
                    jY = g.y(byteBuffer, iPosition - 1, i14, i10, -1);
                    break;
                }
                cArr[i14] = c13;
                i14++;
                iPosition = i19;
            }
        }
        i12 = 1;
        jY = g.y(byteBuffer, iPosition, i14, i10, 0);
        int i22 = (int) (4294967295L & jY);
        if (i22 == -1) {
            int i23 = (int) (jY >> 32);
            if (z15) {
                return decodeUtf8Result(i23 - 1, -1);
            }
            byteBuffer.position(byteBuffer.position() + 1);
            if (i23 > 0) {
                int i24 = i23 - 1;
                if (cArr[i24] == '\r') {
                    return decodeUtf8Result(i24, -1);
                }
            }
        } else if (i22 == 0 && z15) {
            int i25 = (int) (jY >> 32);
            int i26 = i12;
            return g.f(byteBuffer, i26, i25, i26, 2);
        }
        return jY;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final long decodeUTF8Line_buffer(java.nio.ByteBuffer r17, char[] r18, int r19, int r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.charsets.UTFKt.decodeUTF8Line_buffer(java.nio.ByteBuffer, char[], int, int):long");
    }

    private static final long decodeUTF8_array(ByteBuffer byteBuffer, char[] cArr, int i10, int i11) throws Throwable {
        int i12;
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (iPosition > iRemaining) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iRemaining > bArrArray.length) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i13 = i10 + i11;
        if (i13 > cArr.length) {
            throw indexOutOfBounds(i10, i11, cArr.length);
        }
        int i14 = i10;
        while (iPosition < iRemaining && i14 < i13) {
            int i15 = iPosition + 1;
            byte b10 = bArrArray[iPosition];
            if (b10 >= 0) {
                cArr[i14] = (char) b10;
                i14++;
                iPosition = i15;
            } else {
                if ((b10 & 224) == 192) {
                    if (i15 >= iRemaining) {
                        return g.y(byteBuffer, iPosition, i14, i10, 2);
                    }
                    iPosition += 2;
                    byte b11 = bArrArray[i15];
                    i12 = i14 + 1;
                    cArr[i14] = (char) ((b11 & Utf8.REPLACEMENT_BYTE) | ((b10 & 31) << 6));
                } else if ((b10 & 240) == 224) {
                    if (iRemaining - i15 < 2) {
                        return g.y(byteBuffer, iPosition, i14, i10, 3);
                    }
                    int i16 = iPosition + 2;
                    byte b12 = bArrArray[i15];
                    iPosition += 3;
                    byte b13 = bArrArray[i16];
                    int i17 = b10 & 15;
                    int i18 = (b12 & Utf8.REPLACEMENT_BYTE) << 6;
                    int i19 = (b13 & Utf8.REPLACEMENT_BYTE) | i18 | (i17 << 12);
                    if (i17 != 0 && !isBmpCodePoint(i19)) {
                        malformedCodePoint(i19);
                        throw new k();
                    }
                    i12 = i14 + 1;
                    cArr[i14] = (char) i19;
                } else {
                    if ((b10 & 248) != 240) {
                        unsupportedByteCount(b10);
                        throw new k();
                    }
                    if (iRemaining - i15 < 3) {
                        return g.y(byteBuffer, iPosition, i14, i10, 4);
                    }
                    byte b14 = bArrArray[i15];
                    byte b15 = bArrArray[iPosition + 2];
                    int i20 = iPosition + 4;
                    byte b16 = bArrArray[iPosition + 3];
                    int i21 = ((b14 & Utf8.REPLACEMENT_BYTE) << 12) | ((b10 & 7) << 18) | ((b15 & Utf8.REPLACEMENT_BYTE) << 6) | (b16 & Utf8.REPLACEMENT_BYTE);
                    if (!isValidCodePoint(i21)) {
                        malformedCodePoint(i21);
                        throw new k();
                    }
                    if (i13 - i14 < 2) {
                        return g.y(byteBuffer, iPosition, i14, i10, 0);
                    }
                    int iHighSurrogate = highSurrogate(i21);
                    int iLowSurrogate = lowSurrogate(i21);
                    int i22 = i14 + 1;
                    cArr[i14] = (char) iHighSurrogate;
                    i14 += 2;
                    cArr[i22] = (char) iLowSurrogate;
                    iPosition = i20;
                }
                i14 = i12;
            }
        }
        return g.y(byteBuffer, iPosition, i14, i10, 0);
    }

    private static final long decodeUTF8_buffer(ByteBuffer byteBuffer, char[] cArr, int i10, int i11) throws Throwable {
        int i12 = i10 + i11;
        if (i12 > cArr.length) {
            throw indexOutOfBounds(i10, i11, cArr.length);
        }
        int i13 = i10;
        while (byteBuffer.hasRemaining() && i13 < i12) {
            byte b10 = byteBuffer.get();
            if (b10 >= 0) {
                cArr[i13] = (char) b10;
                i13++;
            } else if ((b10 & 224) == 192) {
                if (byteBuffer.hasRemaining()) {
                    return g.f(byteBuffer, 1, i13, i10, 2);
                }
                cArr[i13] = (char) (((b10 & 31) << 6) | (byteBuffer.get() & Utf8.REPLACEMENT_BYTE));
                i13++;
            } else if ((b10 & 240) == 224) {
                if (byteBuffer.remaining() < 2) {
                    return g.f(byteBuffer, 1, i13, i10, 3);
                }
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                int i14 = b10 & 15;
                int i15 = ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (i14 << 12) | (b12 & Utf8.REPLACEMENT_BYTE);
                if (i14 != 0 && !isBmpCodePoint(i15)) {
                    malformedCodePoint(i15);
                    throw new k();
                }
                cArr[i13] = (char) i15;
                i13++;
            } else {
                if ((b10 & 248) != 240) {
                    unsupportedByteCount(b10);
                    throw new k();
                }
                if (byteBuffer.remaining() < 3) {
                    return g.f(byteBuffer, 1, i13, i10, 4);
                }
                int i16 = ((b10 & 7) << 18) | ((byteBuffer.get() & Utf8.REPLACEMENT_BYTE) << 12) | ((byteBuffer.get() & Utf8.REPLACEMENT_BYTE) << 6) | (byteBuffer.get() & Utf8.REPLACEMENT_BYTE);
                if (!isValidCodePoint(i16)) {
                    malformedCodePoint(i16);
                    throw new k();
                }
                if (i12 - i13 < 2) {
                    return g.f(byteBuffer, 4, i13, i10, 0);
                }
                int iHighSurrogate = highSurrogate(i16);
                int iLowSurrogate = lowSurrogate(i16);
                int i17 = i13 + 1;
                cArr[i13] = (char) iHighSurrogate;
                i13 += 2;
                cArr[i17] = (char) iLowSurrogate;
            }
        }
        return decodeUtf8Result(i13 - i10, 0);
    }

    public static final long decodeUtf8Result(int i10, int i11) {
        return (i11 & 4294967295L) | (i10 << 32);
    }

    public static final long decodeUtf8ResultAcc(int i10, long j10) {
        return decodeUtf8Result(i10 + ((int) (j10 >> 32)), (int) (j10 & 4294967295L));
    }

    private static final int highSurrogate(int i10) {
        return (i10 >>> 10) + 55232;
    }

    private static final Throwable indexOutOfBounds(int i10, int i11, int i12) {
        return new IndexOutOfBoundsException(i10 + " (offset) + " + i11 + " (length) > " + i12 + " (array.length)");
    }

    private static final boolean isBmpCodePoint(int i10) {
        return (i10 >>> 16) == 0;
    }

    private static final boolean isValidCodePoint(int i10) {
        return i10 <= MaxCodePoint;
    }

    private static final int lowSurrogate(int i10) {
        return (i10 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320;
    }

    private static final Void malformedCodePoint(int i10) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i10) + " found");
    }

    private static final Void unsupportedByteCount(byte b10) {
        StringBuilder sb2 = new StringBuilder("Unsupported byte code, first byte is 0x");
        String string = Integer.toString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, e.checkRadix(16));
        e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
        sb2.append(n0.padStart(string, 2, '0'));
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static final long decodeUTF8Line(ByteBuffer byteBuffer, char[] cArr, int i10, int i11) {
        e0.checkNotNullParameter(byteBuffer, "<this>");
        e0.checkNotNullParameter(cArr, SFPXhf.xEEDsExIX);
        return byteBuffer.hasArray() ? decodeUTF8Line_array(byteBuffer, cArr, i10, i11) : decodeUTF8Line_buffer(byteBuffer, cArr, i10, i11);
    }

    private static final long decodeUTF8_buffer(ByteBuffer byteBuffer, char[] cArr, int i10, int i11, l lVar) throws Throwable {
        int i12;
        int i13 = i10 + i11;
        if (i13 <= cArr.length) {
            int i14 = i10;
            while (byteBuffer.hasRemaining() && i14 < i13) {
                byte b10 = byteBuffer.get();
                if (b10 >= 0) {
                    char c10 = (char) b10;
                    if (!((Boolean) lVar.invoke(Character.valueOf(c10))).booleanValue()) {
                        return g.f(byteBuffer, 1, i14, i10, -1);
                    }
                    i12 = i14 + 1;
                    cArr[i14] = c10;
                } else if ((b10 & 224) == 192) {
                    if (!byteBuffer.hasRemaining()) {
                        return g.f(byteBuffer, 1, i14, i10, 2);
                    }
                    char c11 = (char) (((b10 & 31) << 6) | (byteBuffer.get() & Utf8.REPLACEMENT_BYTE));
                    if (!((Boolean) lVar.invoke(Character.valueOf(c11))).booleanValue()) {
                        return g.f(byteBuffer, 2, i14, i10, -1);
                    }
                    i12 = i14 + 1;
                    cArr[i14] = c11;
                } else if ((b10 & 240) == 224) {
                    if (byteBuffer.remaining() < 2) {
                        return g.f(byteBuffer, 1, i14, i10, 3);
                    }
                    byte b11 = byteBuffer.get();
                    byte b12 = byteBuffer.get();
                    int i15 = b10 & 15;
                    int i16 = ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (i15 << 12) | (b12 & Utf8.REPLACEMENT_BYTE);
                    if (i15 != 0 && !isBmpCodePoint(i16)) {
                        malformedCodePoint(i16);
                        throw new k();
                    }
                    char c12 = (char) i16;
                    if (!((Boolean) lVar.invoke(Character.valueOf(c12))).booleanValue()) {
                        return g.f(byteBuffer, 3, i14, i10, -1);
                    }
                    i12 = i14 + 1;
                    cArr[i14] = c12;
                } else if ((b10 & 248) == 240) {
                    if (byteBuffer.remaining() < 3) {
                        return g.f(byteBuffer, 1, i14, i10, 4);
                    }
                    int i17 = ((b10 & 7) << 18) | ((byteBuffer.get() & Utf8.REPLACEMENT_BYTE) << 12) | ((byteBuffer.get() & Utf8.REPLACEMENT_BYTE) << 6) | (byteBuffer.get() & Utf8.REPLACEMENT_BYTE);
                    if (!isValidCodePoint(i17)) {
                        malformedCodePoint(i17);
                        throw new k();
                    }
                    if (i13 - i14 >= 2) {
                        char cHighSurrogate = (char) highSurrogate(i17);
                        char cLowSurrogate = (char) lowSurrogate(i17);
                        if (((Boolean) lVar.invoke(Character.valueOf(cHighSurrogate))).booleanValue() && ((Boolean) lVar.invoke(Character.valueOf(cLowSurrogate))).booleanValue()) {
                            int i18 = i14 + 1;
                            cArr[i14] = cHighSurrogate;
                            i14 += 2;
                            cArr[i18] = cLowSurrogate;
                        } else {
                            return g.f(byteBuffer, 4, i14, i10, -1);
                        }
                    } else {
                        return g.f(byteBuffer, 4, i14, i10, 0);
                    }
                } else {
                    unsupportedByteCount(b10);
                    throw new k();
                }
                i14 = i12;
            }
            return decodeUtf8Result(i14 - i10, 0);
        }
        throw indexOutOfBounds(i10, i11, cArr.length);
    }

    private static final long decodeUTF8_array(ByteBuffer byteBuffer, char[] cArr, int i10, int i11, l lVar) throws Throwable {
        byte[] bArrArray = byteBuffer.array();
        int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
        int iRemaining = byteBuffer.remaining() + iPosition;
        if (iPosition <= iRemaining) {
            if (iRemaining <= bArrArray.length) {
                int i12 = i10 + i11;
                if (i12 <= cArr.length) {
                    int i13 = i10;
                    while (iPosition < iRemaining && i13 < i12) {
                        int i14 = iPosition + 1;
                        byte b10 = bArrArray[iPosition];
                        if (b10 >= 0) {
                            char c10 = (char) b10;
                            if (!((Boolean) lVar.invoke(Character.valueOf(c10))).booleanValue()) {
                                return g.y(byteBuffer, iPosition, i13, i10, -1);
                            }
                            cArr[i13] = c10;
                            i13++;
                            iPosition = i14;
                        } else if ((b10 & 224) == 192) {
                            if (i14 >= iRemaining) {
                                return g.y(byteBuffer, iPosition, i13, i10, 2);
                            }
                            int i15 = iPosition + 2;
                            char c11 = (char) ((bArrArray[i14] & Utf8.REPLACEMENT_BYTE) | ((b10 & 31) << 6));
                            if (!((Boolean) lVar.invoke(Character.valueOf(c11))).booleanValue()) {
                                return g.y(byteBuffer, iPosition, i13, i10, -1);
                            }
                            cArr[i13] = c11;
                            i13++;
                            iPosition = i15;
                        } else if ((b10 & 240) == 224) {
                            if (iRemaining - i14 < 2) {
                                return g.y(byteBuffer, iPosition, i13, i10, 3);
                            }
                            byte b11 = bArrArray[i14];
                            int i16 = iPosition + 3;
                            int i17 = b10 & 15;
                            int i18 = (bArrArray[iPosition + 2] & Utf8.REPLACEMENT_BYTE) | ((b11 & Utf8.REPLACEMENT_BYTE) << 6) | (i17 << 12);
                            if (i17 != 0 && !isBmpCodePoint(i18)) {
                                malformedCodePoint(i18);
                                throw new k();
                            }
                            char c12 = (char) i18;
                            if (!((Boolean) lVar.invoke(Character.valueOf(c12))).booleanValue()) {
                                return g.y(byteBuffer, iPosition - 1, i13, i10, -1);
                            }
                            cArr[i13] = c12;
                            i13++;
                            iPosition = i16;
                        } else {
                            if ((b10 & 248) != 240) {
                                unsupportedByteCount(b10);
                                throw new k();
                            }
                            if (iRemaining - i14 < 3) {
                                return g.y(byteBuffer, iPosition, i13, i10, 4);
                            }
                            byte b12 = bArrArray[i14];
                            byte b13 = bArrArray[iPosition + 2];
                            int i19 = iPosition + 4;
                            byte b14 = bArrArray[iPosition + 3];
                            int i20 = ((b13 & Utf8.REPLACEMENT_BYTE) << 6) | ((b12 & Utf8.REPLACEMENT_BYTE) << 12) | ((b10 & 7) << 18) | (b14 & Utf8.REPLACEMENT_BYTE);
                            if (!isValidCodePoint(i20)) {
                                malformedCodePoint(i20);
                                throw new k();
                            }
                            if (i12 - i13 >= 2) {
                                char cHighSurrogate = (char) highSurrogate(i20);
                                char cLowSurrogate = (char) lowSurrogate(i20);
                                if (((Boolean) lVar.invoke(Character.valueOf(cHighSurrogate))).booleanValue() && ((Boolean) lVar.invoke(Character.valueOf(cLowSurrogate))).booleanValue()) {
                                    int i21 = i13 + 1;
                                    cArr[i13] = cHighSurrogate;
                                    i13 += 2;
                                    cArr[i21] = cLowSurrogate;
                                    iPosition = i19;
                                } else {
                                    return g.y(byteBuffer, iPosition, i13, i10, -1);
                                }
                            } else {
                                return g.y(byteBuffer, iPosition, i13, i10, 0);
                            }
                        }
                    }
                    return g.y(byteBuffer, iPosition, i13, i10, 0);
                }
                throw indexOutOfBounds(i10, i11, cArr.length);
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
