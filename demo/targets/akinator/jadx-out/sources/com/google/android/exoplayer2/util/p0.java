package com.google.android.exoplayer2.util;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f28540a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f28541b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    public static final Object f28542c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static int[] f28543d = new int[10];

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i10 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    public static int findNalUnit(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        a.checkState(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    clearPrefixFlags(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    public static int getH265NalUnitType(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean isNalUnitSei(String str, byte b10) {
        return ("video/avc".equals(str) && (b10 & 31) == 6) || ("video/hevc".equals(str) && ((b10 & 126) >> 1) == 39);
    }

    public static m0 parseH265SpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseH265SpsNalUnitPayload(bArr, i10 + 2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.util.m0 parseH265SpsNalUnitPayload(byte[] r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.p0.parseH265SpsNalUnitPayload(byte[], int, int):com.google.android.exoplayer2.util.m0");
    }

    public static n0 parsePpsNalUnit(byte[] bArr, int i10, int i11) {
        return parsePpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    public static n0 parsePpsNalUnitPayload(byte[] bArr, int i10, int i11) {
        w0 w0Var = new w0(bArr, i10, i11);
        int unsignedExpGolombCodedInt = w0Var.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = w0Var.readUnsignedExpGolombCodedInt();
        w0Var.skipBit();
        return new n0(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, w0Var.readBit());
    }

    public static o0 parseSpsNalUnit(byte[] bArr, int i10, int i11) {
        return parseSpsNalUnitPayload(bArr, i10 + 1, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01da A[PHI: r3
      0x01da: PHI (r3v3 float) = (r3v2 float), (r3v6 float) binds: [B:81:0x0169, B:98:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.util.o0 parseSpsNalUnitPayload(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.p0.parseSpsNalUnitPayload(byte[], int, int):com.google.android.exoplayer2.util.o0");
    }

    public static int unescapeStream(byte[] bArr, int i10) {
        int i11;
        synchronized (f28542c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    }
                    try {
                        if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                            break;
                        }
                        i12++;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = f28543d;
                    if (iArr.length <= i13) {
                        f28543d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f28543d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f28543d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i18 + 2;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
