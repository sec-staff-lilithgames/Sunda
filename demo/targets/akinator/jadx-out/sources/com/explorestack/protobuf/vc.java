package com.explorestack.protobuf;

import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class vc {

    /* renamed from: a, reason: collision with root package name */
    public static final tc f22784a;

    static {
        f22784a = (sc.f22645e && sc.f22644d && !f.a()) ? new tc(1) : new tc(0);
    }

    public static int a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return f(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return g(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(ByteBuffer byteBuffer, int i10, int i11, int i12) {
        if (i12 == 0) {
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i12 == 1) {
            return f(i10, byteBuffer.get(i11));
        }
        if (i12 == 2) {
            return g(i10, byteBuffer.get(i11), byteBuffer.get(i11 + 1));
        }
        throw new AssertionError();
    }

    public static String c(ByteBuffer byteBuffer, int i10, int i11) throws InvalidProtocolBufferException {
        long j10;
        byte b10;
        byte b11;
        tc tcVar = f22784a;
        tcVar.getClass();
        if (byteBuffer.hasArray()) {
            return tcVar.d(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        }
        if (!byteBuffer.isDirect()) {
            return tc.e(byteBuffer, i10, i11);
        }
        switch (tcVar.f22676a) {
            case 0:
                return tc.e(byteBuffer, i10, i11);
            default:
                if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
                }
                long jB = sc.b(byteBuffer) + i10;
                long j11 = i11 + jB;
                char[] cArr = new char[i11];
                int i12 = 0;
                while (true) {
                    j10 = 1;
                    if (jB < j11 && (b11 = sc.f22643c.getByte(jB)) >= 0) {
                        jB++;
                        cArr[i12] = (char) b11;
                        i12++;
                    }
                }
                int i13 = i12;
                while (jB < j11) {
                    long j12 = jB + j10;
                    rc rcVar = sc.f22643c;
                    byte b12 = rcVar.getByte(jB);
                    if (b12 >= 0) {
                        int i14 = i13 + 1;
                        cArr[i13] = (char) b12;
                        while (j12 < j11 && (b10 = sc.f22643c.getByte(j12)) >= 0) {
                            j12 += j10;
                            cArr[i14] = (char) b10;
                            i14++;
                        }
                        i13 = i14;
                        jB = j12;
                    } else if (b12 < -32) {
                        if (j12 >= j11) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        jB += 2;
                        tc.b(b12, rcVar.getByte(j12), cArr, i13);
                        i13++;
                    } else if (b12 < -16) {
                        if (j12 >= j11 - j10) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        long j13 = 2 + jB;
                        jB += 3;
                        tc.c(b12, rcVar.getByte(j12), rcVar.getByte(j13), cArr, i13);
                        i13++;
                    } else {
                        if (j12 >= j11 - 2) {
                            throw InvalidProtocolBufferException.invalidUtf8();
                        }
                        byte b13 = rcVar.getByte(j12);
                        long j14 = jB + 3;
                        byte b14 = rcVar.getByte(2 + jB);
                        jB += 4;
                        tc.a(b12, b13, b14, rcVar.getByte(j14), cArr, i13);
                        i13 += 2;
                    }
                    j10 = 1;
                }
                return new String(cArr, 0, i13);
        }
    }

    public static void d(String str, ByteBuffer byteBuffer) {
        long j10;
        char c10;
        long j11;
        long j12;
        long j13;
        int i10;
        char c11;
        char cCharAt;
        tc tcVar = f22784a;
        tcVar.getClass();
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(tcVar.f(str, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
            return;
        }
        if (!byteBuffer.isDirect()) {
            tc.g(str, byteBuffer);
            return;
        }
        switch (tcVar.f22676a) {
            case 0:
                tc.g(str, byteBuffer);
                return;
            default:
                long jB = sc.b(byteBuffer);
                long jPosition = byteBuffer.position() + jB;
                long jLimit = byteBuffer.limit() + jB;
                int length = str.length();
                if (length > jLimit - jPosition) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + byteBuffer.limit());
                }
                int i11 = 0;
                while (true) {
                    j10 = 1;
                    c10 = 128;
                    if (i11 < length && (cCharAt = str.charAt(i11)) < 128) {
                        sc.m(jPosition, (byte) cCharAt);
                        i11++;
                        jPosition = 1 + jPosition;
                    }
                }
                if (i11 == length) {
                    byteBuffer.position((int) (jPosition - jB));
                    return;
                }
                while (i11 < length) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 >= c10 || jPosition >= jLimit) {
                        j11 = j10;
                        if (cCharAt2 < 2048 && jPosition <= jLimit - 2) {
                            long j14 = jPosition + j11;
                            sc.m(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                            jPosition += 2;
                            sc.m(j14, (byte) ((cCharAt2 & '?') | 128));
                            j12 = jB;
                            j13 = jLimit;
                        } else {
                            if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                                j12 = jB;
                                j13 = jLimit;
                                if (jPosition > j13 - 4) {
                                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i10)))) {
                                        throw new uc(i11, length);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                                }
                                int i12 = i11 + 1;
                                if (i12 != length) {
                                    char cCharAt3 = str.charAt(i12);
                                    if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                        int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                        sc.m(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                        c11 = 128;
                                        sc.m(jPosition + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j15 = jPosition + 3;
                                        sc.m(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                        jPosition += 4;
                                        sc.m(j15, (byte) ((codePoint & 63) | 128));
                                        i11 = i12;
                                    } else {
                                        i11 = i12;
                                    }
                                }
                                throw new uc(i11 - 1, length);
                            }
                            sc.m(jPosition, (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT));
                            j12 = jB;
                            long j16 = jPosition + 2;
                            j13 = jLimit;
                            sc.m(jPosition + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                            jPosition += 3;
                            sc.m(j16, (byte) ((cCharAt2 & '?') | 128));
                        }
                        c11 = 128;
                    } else {
                        sc.m(jPosition, (byte) cCharAt2);
                        j12 = jB;
                        j13 = jLimit;
                        c11 = c10;
                        jPosition += j10;
                        j11 = j10;
                    }
                    i11++;
                    c10 = c11;
                    j10 = j11;
                    jB = j12;
                    jLimit = j13;
                }
                byteBuffer.position((int) (jPosition - jB));
                return;
        }
    }

    public static int e(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new uc(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int f(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int g(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return f22784a.k(0, bArr, 0, bArr.length) == 0;
    }

    public static int partialIsValidUtf8(int i10, byte[] bArr, int i11, int i12) {
        return f22784a.k(i10, bArr, i11, i12);
    }

    public static boolean isValidUtf8(byte[] bArr, int i10, int i11) {
        return f22784a.k(0, bArr, i10, i11) == 0;
    }
}
