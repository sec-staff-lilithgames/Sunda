package com.fyber.inneractive.sdk.protobuf;

import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a4 extends z3 {
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String a(byte[] bArr, int i10, int i11) throws n1 {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!y3.a(b10)) {
                break;
            }
            i10++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (y3.a(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                i10 = i15;
                while (i10 < i12) {
                    byte b12 = bArr[i10];
                    if (!y3.a(b12)) {
                        break;
                    }
                    i10++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                i10 += 2;
                y3.a(b11, bArr[i15], cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                int i16 = i10 + 2;
                i10 += 3;
                y3.a(b11, bArr[i15], bArr[i16], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw new n1("Protocol message had invalid UTF-8.");
                }
                byte b13 = bArr[i15];
                int i17 = i10 + 3;
                byte b14 = bArr[i10 + 2];
                i10 += 4;
                y3.a(b11, b13, b14, bArr[i17], cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final String b(ByteBuffer byteBuffer, int i10, int i11) {
        return z3.a(byteBuffer, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0098 A[RETURN] */
    @Override // com.fyber.inneractive.sdk.protobuf.z3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
        L0:
            if (r11 >= r12) goto L9
            r0 = r10[r11]
            if (r0 < 0) goto L9
            int r11 = r11 + 1
            goto L0
        L9:
            if (r11 < r12) goto Lc
            goto Le
        Lc:
            if (r11 < r12) goto L10
        Le:
            r10 = 0
            return r10
        L10:
            int r0 = r11 + 1
            r1 = r10[r11]
            if (r1 >= 0) goto Lb5
            r2 = -1
            r3 = -32
            r4 = -65
            if (r1 >= r3) goto L2d
            if (r0 < r12) goto L21
            goto L98
        L21:
            r3 = -62
            if (r1 < r3) goto Lb4
            int r11 = r11 + 2
            r0 = r10[r0]
            if (r0 <= r4) goto Lc
            goto Lb4
        L2d:
            r5 = -16
            r6 = -12
            r7 = 1
            r8 = 2
            if (r1 >= r5) goto L73
            int r5 = r12 + (-1)
            if (r0 < r5) goto L5a
            int r12 = r12 - r0
            if (r12 == 0) goto L57
            if (r12 == r7) goto L50
            if (r12 != r8) goto L4a
            r12 = r10[r0]
            int r11 = r11 + r8
            r10 = r10[r11]
            int r10 = com.fyber.inneractive.sdk.protobuf.d4.a(r1, r12, r10)
            return r10
        L4a:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L50:
            r10 = r10[r0]
            int r10 = com.fyber.inneractive.sdk.protobuf.d4.a(r1, r10)
            return r10
        L57:
            if (r1 <= r6) goto L98
            goto L97
        L5a:
            int r5 = r11 + 2
            r0 = r10[r0]
            if (r0 > r4) goto Lb4
            r6 = -96
            if (r1 != r3) goto L66
            if (r0 < r6) goto Lb4
        L66:
            r3 = -19
            if (r1 != r3) goto L6c
            if (r0 >= r6) goto Lb4
        L6c:
            int r11 = r11 + 3
            r0 = r10[r5]
            if (r0 <= r4) goto Lc
            goto Lb4
        L73:
            int r3 = r12 + (-2)
            if (r0 < r3) goto L99
            int r12 = r12 - r0
            if (r12 == 0) goto L95
            if (r12 == r7) goto L8e
            if (r12 != r8) goto L88
            r12 = r10[r0]
            int r11 = r11 + r8
            r10 = r10[r11]
            int r10 = com.fyber.inneractive.sdk.protobuf.d4.a(r1, r12, r10)
            return r10
        L88:
            java.lang.AssertionError r10 = new java.lang.AssertionError
            r10.<init>()
            throw r10
        L8e:
            r10 = r10[r0]
            int r10 = com.fyber.inneractive.sdk.protobuf.d4.a(r1, r10)
            return r10
        L95:
            if (r1 <= r6) goto L98
        L97:
            return r2
        L98:
            return r1
        L99:
            int r3 = r11 + 2
            r0 = r10[r0]
            if (r0 > r4) goto Lb4
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto Lb4
            int r0 = r11 + 3
            r1 = r10[r3]
            if (r1 > r4) goto Lb4
            int r11 = r11 + 4
            r0 = r10[r0]
            if (r0 <= r4) goto Lc
        Lb4:
            return r2
        Lb5:
            r11 = r0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.a4.c(byte[], int, int):int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.z3
    public final int a(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = charSequence.charAt(i15);
            if (cCharAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                    if (i16 <= i14 - 4) {
                        int i18 = i15 + 1;
                        if (i18 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new b4(i15 - 1, length);
                    }
                    if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                        throw new b4(i15, length);
                    }
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | DtbConstants.DEFAULT_PLAYER_HEIGHT);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }
}
