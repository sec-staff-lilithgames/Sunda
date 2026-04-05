package com.fyber.inneractive.sdk.protobuf;

import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c4 extends z3 {
    public static int a(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            z3 z3Var = d4.f26366a;
            if (i10 > -12) {
                return -1;
            }
            return i10;
        }
        if (i11 == 1) {
            return d4.a(i10, x3.f26537c.b(bArr, x3.f26540f + j10));
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        w3 w3Var = x3.f26537c;
        long j11 = x3.f26540f;
        return d4.a(i10, w3Var.b(bArr, j11 + j10), w3Var.b(bArr, j10 + 1 + j11));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i10, int i11) throws n1 {
        long j10;
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long j11 = x3.f26537c.f26523a.getLong(byteBuffer, x3.f26541g) + i10;
        long j12 = i11 + j11;
        char[] cArr = new char[i11];
        int i12 = 0;
        while (true) {
            j10 = 1;
            if (j11 >= j12) {
                break;
            }
            byte bA = x3.f26537c.a(j11);
            if (!y3.a(bA)) {
                break;
            }
            j11++;
            cArr[i12] = (char) bA;
            i12++;
        }
        int i13 = i12;
        while (j11 < j12) {
            long j13 = j11 + j10;
            w3 w3Var = x3.f26537c;
            byte bA2 = w3Var.a(j11);
            if (y3.a(bA2)) {
                cArr[i13] = (char) bA2;
                i13++;
                j11 = j13;
                while (j11 < j12) {
                    byte bA3 = x3.f26537c.a(j11);
                    if (!y3.a(bA3)) {
                        break;
                    }
                    j11 += j10;
                    cArr[i13] = (char) bA3;
                    i13++;
                }
            } else if (bA2 < -32) {
                if (j13 >= j12) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                j11 += 2;
                y3.a(bA2, w3Var.a(j13), cArr, i13);
                i13++;
            } else if (bA2 < -16) {
                if (j13 >= j12 - j10) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                long j14 = j11 + 2;
                j11 += 3;
                y3.a(bA2, w3Var.a(j13), w3Var.a(j14), cArr, i13);
                i13++;
            } else {
                if (j13 >= j12 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte bA4 = w3Var.a(j13);
                long j15 = j11 + 3;
                byte bA5 = w3Var.a(j11 + 2);
                j11 += 4;
                y3.a(bA2, bA4, bA5, w3Var.a(j15), cArr, i13);
                i13 += 2;
                j10 = 1;
            }
        }
        return new String(cArr, 0, i13);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int c(byte[] bArr, int i10, int i11) {
        int i12;
        long j10;
        if ((i10 | i11 | (bArr.length - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        long j11 = i10;
        int i13 = (int) (i11 - j11);
        byte b10 = 0;
        long j12 = 1;
        if (i13 >= 16) {
            long j13 = j11;
            i12 = 0;
            while (true) {
                if (i12 >= i13) {
                    i12 = i13;
                    break;
                }
                long j14 = j13 + 1;
                if (x3.f26537c.b(bArr, x3.f26540f + j13) < 0) {
                    break;
                }
                i12++;
                j13 = j14;
            }
        } else {
            i12 = 0;
        }
        int i14 = i13 - i12;
        long j15 = j11 + i12;
        while (true) {
            byte b11 = b10;
            while (true) {
                if (i14 <= 0) {
                    break;
                }
                long j16 = j15 + j12;
                b11 = x3.f26537c.b(bArr, x3.f26540f + j15);
                if (b11 < 0) {
                    j15 = j16;
                    break;
                }
                i14--;
                j15 = j16;
            }
            if (i14 == 0) {
                return b10;
            }
            int i15 = i14 - 1;
            if (b11 >= -32) {
                if (b11 >= -16) {
                    j10 = j12;
                    if (i15 < 3) {
                        return a(bArr, b11, j15, i15);
                    }
                    i14 -= 4;
                    long j17 = j15 + j10;
                    w3 w3Var = x3.f26537c;
                    long j18 = x3.f26540f;
                    byte b12 = w3Var.b(bArr, j18 + j15);
                    if (b12 > -65) {
                        return -1;
                    }
                    if ((((b12 + 112) + (b11 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    long j19 = 2 + j15;
                    if (w3Var.b(bArr, j17 + j18) > -65) {
                        return -1;
                    }
                    j15 += 3;
                    if (w3Var.b(bArr, j18 + j19) > -65) {
                        return -1;
                    }
                } else {
                    if (i15 < 2) {
                        return a(bArr, b11, j15, i15);
                    }
                    i14 -= 3;
                    long j20 = j15 + j12;
                    w3 w3Var2 = x3.f26537c;
                    long j21 = x3.f26540f;
                    j10 = j12;
                    byte b13 = w3Var2.b(bArr, j21 + j15);
                    if (b13 > -65) {
                        return -1;
                    }
                    if (b11 == -32 && b13 < -96) {
                        return -1;
                    }
                    if (b11 == -19 && b13 >= -96) {
                        return -1;
                    }
                    j15 += 2;
                    if (w3Var2.b(bArr, j21 + j20) > -65) {
                        return -1;
                    }
                }
                j12 = j10;
                b10 = 0;
            } else {
                if (i15 == 0) {
                    return b11;
                }
                i14 -= 2;
                if (b11 < -62) {
                    return -1;
                }
                long j22 = j15 + j12;
                if (x3.f26537c.b(bArr, x3.f26540f + j15) > -65) {
                    return -1;
                }
                j15 = j22;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i10, int i11) throws n1 {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = i10;
            int i14 = 0;
            while (i13 < i12) {
                byte b10 = x3.f26537c.b(bArr, x3.f26540f + i13);
                if (!y3.a(b10)) {
                    break;
                }
                i13++;
                cArr[i14] = (char) b10;
                i14++;
            }
            int i15 = i14;
            while (i13 < i12) {
                int i16 = i13 + 1;
                w3 w3Var = x3.f26537c;
                long j10 = x3.f26540f;
                byte b11 = w3Var.b(bArr, i13 + j10);
                if (y3.a(b11)) {
                    cArr[i15] = (char) b11;
                    i15++;
                    i13 = i16;
                    while (i13 < i12) {
                        byte b12 = x3.f26537c.b(bArr, x3.f26540f + i13);
                        if (!y3.a(b12)) {
                            break;
                        }
                        i13++;
                        cArr[i15] = (char) b12;
                        i15++;
                    }
                } else if (b11 < -32) {
                    if (i16 < i12) {
                        i13 += 2;
                        y3.a(b11, w3Var.b(bArr, j10 + i16), cArr, i15);
                        i15++;
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                } else if (b11 < -16) {
                    if (i16 < i12 - 1) {
                        int i17 = i13 + 2;
                        i13 += 3;
                        y3.a(b11, w3Var.b(bArr, i16 + j10), w3Var.b(bArr, j10 + i17), cArr, i15);
                        i15++;
                    } else {
                        throw new n1("Protocol message had invalid UTF-8.");
                    }
                } else if (i16 < i12 - 2) {
                    y3.a(b11, w3Var.b(bArr, i16 + j10), w3Var.b(bArr, i13 + 2 + j10), w3Var.b(bArr, j10 + i13 + 3), cArr, i15);
                    i15 += 2;
                    i13 += 4;
                } else {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
            }
            return new String(cArr, 0, i15);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        char c10;
        long j11;
        long j12;
        int i12;
        char c11;
        char cCharAt;
        long j13 = i10;
        long j14 = i11 + j13;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            c10 = 128;
            if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            x3.f26537c.a((Object) bArr, x3.f26540f + j13, (byte) cCharAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 >= c10 || j13 >= j14) {
                j11 = j10;
                if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    long j15 = j13;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j15 > j14 - 3) {
                        if (j15 <= j14 - 4) {
                            int i14 = i13 + 1;
                            if (i14 != length) {
                                char cCharAt3 = charSequence.charAt(i14);
                                if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                    int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                    byte b10 = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    w3 w3Var = x3.f26537c;
                                    long j16 = x3.f26540f;
                                    w3Var.a((Object) bArr, j16 + j15, b10);
                                    c11 = 128;
                                    w3Var.a((Object) bArr, j16 + j15 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                    w3Var.a((Object) bArr, j16 + j15 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    w3Var.a((Object) bArr, j16 + j15 + 3, (byte) ((codePoint & 63) | 128));
                                    i13 = i14;
                                    j13 = j15 + 4;
                                    i13++;
                                    j10 = j11;
                                    c10 = c11;
                                } else {
                                    i13 = i14;
                                }
                            }
                            throw new b4(i13 - 1, length);
                        }
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new b4(i13, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j15);
                    }
                    byte b11 = (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                    w3 w3Var2 = x3.f26537c;
                    long j17 = x3.f26540f;
                    w3Var2.a((Object) bArr, j17 + j15, b11);
                    w3Var2.a((Object) bArr, j17 + j15 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    w3Var2.a((Object) bArr, j17 + j15 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j15 + 3;
                } else {
                    long j18 = j13 + j11;
                    w3 w3Var3 = x3.f26537c;
                    long j19 = x3.f26540f;
                    long j20 = j13;
                    w3Var3.a((Object) bArr, j19 + j20, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 = j20 + 2;
                    w3Var3.a((Object) bArr, j19 + j18, (byte) ((cCharAt2 & '?') | 128));
                    c11 = 128;
                    i13++;
                    j10 = j11;
                    c10 = c11;
                }
            } else {
                j12 = j13 + j10;
                j11 = j10;
                x3.f26537c.a((Object) bArr, x3.f26540f + j13, (byte) cCharAt2);
            }
            j13 = j12;
            c11 = 128;
            i13++;
            j10 = j11;
            c10 = c11;
        }
        return (int) j13;
    }
}
