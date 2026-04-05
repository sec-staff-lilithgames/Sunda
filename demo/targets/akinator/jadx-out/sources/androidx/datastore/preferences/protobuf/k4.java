package androidx.datastore.preferences.protobuf;

import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k4 extends kc.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5946i;

    public /* synthetic */ k4(int i10) {
        this.f5946i = i10;
    }

    public static int Z(long j10, int i10, int i11) {
        if (i11 == 0) {
            kc.p pVar = m4.f5958a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return m4.f(i10, j4.f5924c.getByte(j10));
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        i4 i4Var = j4.f5924c;
        return m4.g(i10, i4Var.getByte(j10), i4Var.getByte(j10 + 1));
    }

    public static int a0(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            kc.p pVar = m4.f5958a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return m4.f(i10, j4.i(bArr, j10));
        }
        if (i11 == 2) {
            return m4.g(i10, j4.i(bArr, j10), j4.i(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.j4.i(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (androidx.datastore.preferences.protobuf.j4.i(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (androidx.datastore.preferences.protobuf.j4.i(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x025f A[ADDED_TO_REGION, LOOP:6: B:176:0x025f->B:263:0x025f, LOOP_START, PHI: r2
      0x025f: PHI (r2v3 int) = (r2v2 int), (r2v7 int) binds: [B:174:0x025c, B:263:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[PHI: r2
      PHI (r2v1 int) = (r2v0 int), (r2v13 int), (r2v19 int), (r2v22 int) binds: [B:125:0x01ce, B:168:0x0250, B:149:0x020d, B:134:0x01e0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0127  */
    @Override // kc.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int I(int r23, byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k4.I(int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (androidx.datastore.preferences.protobuf.j4.f5924c.getByte(r3) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (androidx.datastore.preferences.protobuf.j4.f5924c.getByte(r3) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
    
        if (androidx.datastore.preferences.protobuf.j4.f5924c.getByte(r3) > (-65)) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x012a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012d  */
    @Override // kc.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int K(int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k4.K(int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // kc.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String g(byte[] r8, int r9, int r10) throws androidx.datastore.preferences.protobuf.u1 {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k4.g(byte[], int, int):java.lang.String");
    }

    @Override // kc.p
    public final String i(ByteBuffer byteBuffer, int i10, int i11) throws u1 {
        long j10;
        byte b10;
        byte b11;
        switch (this.f5946i) {
            case 0:
                return kc.p.h(byteBuffer, i10, i11);
            default:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long jB = j4.b(byteBuffer) + i10;
                long j11 = i11 + jB;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (true) {
                    j10 = 1;
                    if (jB < j11 && (b11 = j4.f5924c.getByte(jB)) >= 0) {
                        jB++;
                        cArr[i12] = (char) b11;
                        i12++;
                    }
                }
                int i13 = i12;
                while (jB < j11) {
                    long j12 = jB + j10;
                    i4 i4Var = j4.f5924c;
                    byte b12 = i4Var.getByte(jB);
                    if (b12 >= 0) {
                        int i14 = i13 + 1;
                        cArr[i13] = (char) b12;
                        while (j12 < j11 && (b10 = j4.f5924c.getByte(j12)) >= 0) {
                            j12 += j10;
                            cArr[i14] = (char) b10;
                            i14++;
                        }
                        i13 = i14;
                        jB = j12;
                    } else if (b12 < -32) {
                        if (j12 >= j11) {
                            throw u1.c();
                        }
                        jB += 2;
                        jh.i.e(b12, i4Var.getByte(j12), cArr, i13);
                        i13++;
                    } else if (b12 < -16) {
                        if (j12 >= j11 - j10) {
                            throw u1.c();
                        }
                        long j13 = jB + 2;
                        jB += 3;
                        jh.i.f(b12, i4Var.getByte(j12), i4Var.getByte(j13), cArr, i13);
                        i13++;
                    } else {
                        if (j12 >= j11 - 2) {
                            throw u1.c();
                        }
                        byte b13 = i4Var.getByte(j12);
                        long j14 = jB + 3;
                        byte b14 = i4Var.getByte(jB + 2);
                        jB += 4;
                        jh.i.a(b12, b13, b14, i4Var.getByte(j14), cArr, i13);
                        i13 += 2;
                    }
                    j10 = 1;
                }
                return new String(cArr, 0, i13);
        }
    }

    @Override // kc.p
    public final int k(String str, byte[] bArr, int i10, int i11) {
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
        switch (this.f5946i) {
            case 0:
                int length = str.length();
                int i15 = i11 + i10;
                int i16 = 0;
                while (i16 < length && (i13 = i16 + i10) < i15 && (cCharAt = str.charAt(i16)) < 128) {
                    bArr[i13] = (byte) cCharAt;
                    i16++;
                }
                if (i16 == length) {
                    return i10 + length;
                }
                int i17 = i10 + i16;
                while (i16 < length) {
                    char cCharAt3 = str.charAt(i16);
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
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i16 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i12)))) {
                                    throw new l4(i16, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i17);
                            }
                            int i19 = i16 + 1;
                            if (i19 != str.length()) {
                                char cCharAt4 = str.charAt(i19);
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
                            throw new l4(i16 - 1, length);
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
                int length2 = str.length();
                if (length2 > i11 || bArr.length - i11 < i10) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i10 + i11));
                }
                int i22 = 0;
                while (true) {
                    j10 = 1;
                    c10 = 128;
                    if (i22 < length2 && (cCharAt2 = str.charAt(i22)) < 128) {
                        j4.n(bArr, j13, (byte) cCharAt2);
                        i22++;
                        j13 = 1 + j13;
                    }
                }
                if (i22 == length2) {
                    return (int) j13;
                }
                while (i22 < length2) {
                    char cCharAt5 = str.charAt(i22);
                    if (cCharAt5 < c10 && j13 < j14) {
                        j4.n(bArr, j13, (byte) cCharAt5);
                        c11 = c10;
                        j11 = j10;
                        j12 = j13 + j10;
                    } else if (cCharAt5 >= 2048 || j13 > j14 - 2) {
                        j11 = j10;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j13 > j14 - 3) {
                            long j15 = j13;
                            if (j15 > j14 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i14 = i22 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i14)))) {
                                    throw new l4(i22, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j15);
                            }
                            int i23 = i22 + 1;
                            if (i23 != length2) {
                                char cCharAt6 = str.charAt(i23);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    j4.n(bArr, j15, (byte) ((codePoint2 >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    c11 = 128;
                                    j4.n(bArr, j15 + j11, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    j4.n(bArr, j15 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    j4.n(bArr, j15 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j12 = j15 + 4;
                                    i22 = i23;
                                } else {
                                    i22 = i23;
                                }
                            }
                            throw new l4(i22 - 1, length2);
                        }
                        j4.n(bArr, j13, (byte) ((cCharAt5 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT));
                        long j16 = j13;
                        j4.n(bArr, j13 + j11, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j12 = j16 + 3;
                        j4.n(bArr, j16 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c11 = 128;
                    } else {
                        j11 = j10;
                        j4.n(bArr, j13, (byte) ((cCharAt5 >>> 6) | 960));
                        j4.n(bArr, j13 + j11, (byte) ((cCharAt5 & '?') | c10));
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

    @Override // kc.p
    public final void m(String str, ByteBuffer byteBuffer) {
        long j10;
        long j11;
        int i10;
        char cCharAt;
        switch (this.f5946i) {
            case 0:
                kc.p.l(str, byteBuffer);
                return;
            default:
                long jB = j4.b(byteBuffer);
                long jPosition = byteBuffer.position() + jB;
                long jLimit = byteBuffer.limit() + jB;
                int length = str.length();
                if (length > jLimit - jPosition) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
                }
                int i11 = 0;
                while (i11 < length && (cCharAt = str.charAt(i11)) < 128) {
                    j4.m(jPosition, (byte) cCharAt);
                    i11++;
                    jPosition++;
                }
                if (i11 == length) {
                    byteBuffer.position((int) (jPosition - jB));
                    return;
                }
                while (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 128 && jPosition < jLimit) {
                        j4.m(jPosition, (byte) cCharAt2);
                        j10 = jB;
                        j11 = jLimit;
                        jPosition++;
                    } else if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                        j10 = jB;
                        if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                            j11 = jLimit;
                            if (jPosition > j11 - 4) {
                                if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i10)))) {
                                    throw new l4(i11, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                            }
                            int i12 = i11 + 1;
                            if (i12 != length) {
                                char cCharAt3 = str.charAt(i12);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    j4.m(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                    j4.m(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = jPosition + 3;
                                    j4.m(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    jPosition += 4;
                                    j4.m(j12, (byte) ((codePoint & 63) | 128));
                                    i11 = i12;
                                } else {
                                    i11 = i12;
                                }
                            }
                            throw new l4(i11 - 1, length);
                        }
                        j4.m(jPosition, (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT));
                        j11 = jLimit;
                        long j13 = jPosition + 2;
                        j4.m(jPosition + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        jPosition += 3;
                        j4.m(j13, (byte) ((cCharAt2 & '?') | 128));
                    } else {
                        j10 = jB;
                        long j14 = jPosition + 1;
                        j4.m(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                        jPosition += 2;
                        j4.m(j14, (byte) ((cCharAt2 & '?') | 128));
                        j11 = jLimit;
                    }
                    i11++;
                    jB = j10;
                    jLimit = j11;
                }
                byteBuffer.position((int) (jPosition - jB));
                return;
        }
    }
}
