package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.4J, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4J {
    public static byte[] A03;
    public static String[] A04 = {"RlBAQ9etSzb6rKOU0OwTULVtudJYJZp0", "XAmGWsEC26u1mjqUpAPP", "gKAOne2sLRpvkAzkWDtxdYOHT1y3K7xN", "iu", "f0TxnfWyKi4JtHzbatu6pF78XF274ljv", "5Aw1jR83b8etF7", "lH1Eai5bIm9O9MK22LfAWzb", "DxY4VOe5grYAJX95lLrlpegM3yyEwSTm"};
    public static final Set<Charset> A05;
    public static final char[] A06;
    public static final char[] A07;
    public byte[] A00;
    public int A01;
    public int A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{64, 103, AbstractJsonLexerKt.TC_INVALID, 104, 101, 96, 109, 41, 92, 93, 79, 36, 49, 41, 122, 108, 120, 124, 108, 103, 106, 108, 41, 106, 102, 103, 125, 96, 103, 124, 104, 125, 96, 102, 103, 41, 107, 112, 125, 108, 51, 41, 88, AbstractJsonLexerKt.TC_INVALID, 103, 112, 125, 120, 117, 49, 68, 69, 87, 60, 41, 49, 98, 116, 96, 100, 116, AbstractJsonLexerKt.TC_INVALID, 114, 116, 49, 119, 120, 99, 98, 101, 49, 115, 104, 101, 116, 43, 49, 2, 57, 38, 118, 52, Utf8.REPLACEMENT_BYTE, 34, 118, 56, 57, 34, 118, 44, 51, 36, 57, 108, 118, 38, 29, 0, 6, 3, 3, 28, 1, 7, 22, 23, 83, 16, 27, 18, 1, 0, 22, 7, 73, 83};
    }

    static {
        A04();
        A06 = new char[]{'\r', '\n'};
        A07 = new char[]{'\n'};
        A05 = MetaExoPlayerCustomizedCollections.A05(AbstractC2246ia.A02, AbstractC2246ia.A06, AbstractC2246ia.A03, AbstractC2246ia.A04, AbstractC2246ia.A05);
    }

    public C4J() {
        this.A00 = AbstractC09264a.A07;
    }

    public C4J(int i10) {
        this.A00 = new byte[i10];
        this.A01 = i10;
    }

    public C4J(byte[] bArr) {
        this.A00 = bArr;
        this.A01 = bArr.length;
    }

    public C4J(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
    }

    private char A00(Charset charset, char[] cArr) {
        char cA01;
        int i10;
        if ((charset.equals(AbstractC2246ia.A06) || charset.equals(AbstractC2246ia.A02)) && A07() >= 1) {
            cA01 = AbstractC2048fA.A01(AbstractC2669q6.A00(this.A00[this.A02]));
            i10 = 1;
        } else if ((charset.equals(AbstractC2246ia.A03) || charset.equals(AbstractC2246ia.A04)) && A07() >= 2) {
            cA01 = AbstractC2048fA.A00(this.A00[this.A02], this.A00[this.A02 + 1]);
            i10 = 2;
        } else {
            if (!charset.equals(AbstractC2246ia.A05) || A07() < 2) {
                return (char) 0;
            }
            cA01 = AbstractC2048fA.A00(this.A00[this.A02 + 1], this.A00[this.A02]);
            i10 = 2;
        }
        if (!AbstractC2048fA.A04(cArr, cA01)) {
            return (char) 0;
        }
        this.A02 += i10;
        char character = AbstractC2048fA.A01(cA01);
        return character;
    }

    /* JADX WARN: Incorrect condition in loop: B:9:0x0018 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int A01(java.nio.charset.Charset r5) {
        /*
            r4 = this;
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A06
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L10
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L75
        L10:
            r3 = 1
        L11:
            int r2 = r4.A02
        L13:
            int r1 = r4.A01
            int r0 = r3 + (-1)
            int r1 = r1 - r0
            if (r2 >= r1) goto L8f
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A06
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L2a
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A02
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L35
        L2a:
            byte[] r0 = r4.A00
            r0 = r0[r2]
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A16(r0)
            if (r0 == 0) goto L35
            return r2
        L35:
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L45
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L58
        L45:
            byte[] r0 = r4.A00
            r0 = r0[r2]
            if (r0 != 0) goto L58
            byte[] r1 = r4.A00
            int r0 = r2 + 1
            r0 = r1[r0]
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A16(r0)
            if (r0 == 0) goto L58
            return r2
        L58:
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A05
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L73
            byte[] r1 = r4.A00
            int r0 = r2 + 1
            r0 = r1[r0]
            if (r0 != 0) goto L73
            byte[] r0 = r4.A00
            r0 = r0[r2]
            boolean r0 = com.facebook.ads.redexgen.core.AbstractC09264a.A16(r0)
            if (r0 == 0) goto L73
            return r2
        L73:
            int r2 = r2 + r3
            goto L13
        L75:
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A05
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L8d
            java.nio.charset.Charset r0 = com.facebook.ads.redexgen.core.AbstractC2246ia.A04
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L92
        L8d:
            r3 = 2
            goto L11
        L8f:
            int r0 = r4.A01
            return r0
        L92:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 95
            r1 = 21
            r0 = 50
            java.lang.String r0 = A03(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C4J.A01(java.nio.charset.Charset):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A02(char r5) {
        /*
            r4 = this;
            int r0 = r4.A07()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r3 = r4.A02
        La:
            int r0 = r4.A01
            if (r3 >= r0) goto L17
            byte[] r0 = r4.A00
            r0 = r0[r3]
            if (r0 == r5) goto L17
            int r3 = r3 + 1
            goto La
        L17:
            byte[] r2 = r4.A00
            int r1 = r4.A02
            int r0 = r4.A02
            int r0 = r3 - r0
            java.lang.String r2 = com.facebook.ads.redexgen.core.AbstractC09264a.A0r(r2, r1, r0)
            r4.A02 = r3
            int r1 = r4.A02
            int r0 = r4.A01
            if (r1 >= r0) goto L31
            int r0 = r4.A02
            int r0 = r0 + 1
            r4.A02 = r0
        L31:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C4J.A02(char):java.lang.String");
    }

    private void A05(Charset charset) {
        if (A00(charset, A06) == '\r') {
            A00(charset, A07);
        }
    }

    public final double A06() {
        return Double.longBitsToDouble(A0P());
    }

    public final int A07() {
        return this.A01 - this.A02;
    }

    public final int A08() {
        return this.A00.length;
    }

    public final int A09() {
        return this.A02;
    }

    public final int A0A() {
        return this.A01;
    }

    public final int A0B() {
        return this.A00[this.A02] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0C() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | (bArr4[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0D() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0E() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        int i15 = i13 | ((bArr3[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
        byte[] bArr4 = this.A00;
        int i16 = this.A02;
        this.A02 = i16 + 1;
        return i15 | ((bArr4[i16] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
    }

    public final int A0F() {
        int iA0E = A0E();
        if (iA0E >= 0) {
            return iA0E;
        }
        throw new IllegalStateException(A03(77, 18, 23) + iA0E);
    }

    public final int A0G() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public final int A0H() {
        int b22 = A0I();
        int b12 = A0I();
        int b42 = A0I();
        int b32 = A0I();
        int b23 = (b22 << 21) | (b12 << 14);
        int b13 = b42 << 7;
        return b23 | b13 | b32;
    }

    public final int A0I() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        return bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final int A0J() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | (bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        int result = this.A02;
        this.A02 = result + 2;
        return i13;
    }

    public final int A0K() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        int i13 = i11 | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
        byte[] bArr3 = this.A00;
        int i14 = this.A02;
        this.A02 = i14 + 1;
        return i13 | (bArr3[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final int A0L() {
        int iA0C = A0C();
        if (iA0C >= 0) {
            return iA0C;
        }
        throw new IllegalStateException(A03(77, 18, 23) + iA0C);
    }

    public final int A0M() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return i11 | (bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final long A0N() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j13 = j12 | ((bArr4[r1] & 255) << 24);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j14 = j13 | ((bArr5[r1] & 255) << 32);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j15 = j14 | ((bArr6[r1] & 255) << 40);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j16 = j15 | ((bArr7[r1] & 255) << 48);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j16 | ((255 & bArr8[r1]) << 56);
    }

    public final long A0O() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = bArr[r1] & 255;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr2[r1] & 255) << 8);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr3[r1] & 255) << 16);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j12 | ((255 & bArr4[r1]) << 24);
    }

    public final long A0P() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = (bArr[r1] & 255) << 56;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr2[r1] & 255) << 48);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr3[r1] & 255) << 40);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        long j13 = j12 | ((bArr4[r1] & 255) << 32);
        byte[] bArr5 = this.A00;
        this.A02 = this.A02 + 1;
        long j14 = j13 | ((bArr5[r1] & 255) << 24);
        byte[] bArr6 = this.A00;
        this.A02 = this.A02 + 1;
        long j15 = j14 | ((bArr6[r1] & 255) << 16);
        byte[] bArr7 = this.A00;
        this.A02 = this.A02 + 1;
        long j16 = j15 | ((bArr7[r1] & 255) << 8);
        byte[] bArr8 = this.A00;
        this.A02 = this.A02 + 1;
        return j16 | (255 & bArr8[r1]);
    }

    public final long A0Q() {
        byte[] bArr = this.A00;
        this.A02 = this.A02 + 1;
        long j10 = (bArr[r1] & 255) << 24;
        byte[] bArr2 = this.A00;
        this.A02 = this.A02 + 1;
        long j11 = j10 | ((bArr2[r1] & 255) << 16);
        byte[] bArr3 = this.A00;
        this.A02 = this.A02 + 1;
        long j12 = j11 | ((bArr3[r1] & 255) << 8);
        byte[] bArr4 = this.A00;
        this.A02 = this.A02 + 1;
        return j12 | (255 & bArr4[r1]);
    }

    public final long A0R() {
        long jA0P = A0P();
        if (jA0P >= 0) {
            return jA0P;
        }
        throw new IllegalStateException(A03(77, 18, 23) + jA0P);
    }

    public final long A0S() {
        int i10 = 0;
        byte[] bArr = this.A00;
        int length = this.A02;
        long j10 = bArr[length];
        int i11 = 7;
        while (A04[3].length() != 11) {
            A04[0] = "oMNWSgm03bScuVXxVZmUeRStw4NVi0TN";
            if (i11 >= 0) {
                int length2 = 1 << i11;
                long value = length2;
                if ((value & j10) == 0) {
                    if (i11 < 6) {
                        int length3 = 1 << i11;
                        j10 &= length3 - 1;
                        i10 = 7 - i11;
                    } else if (i11 == 7) {
                        i10 = 1;
                    }
                } else {
                    i11--;
                }
            }
            if (i10 != 0) {
                int i12 = 1;
                while (i12 < i10) {
                    byte[] bArr2 = this.A00;
                    int length4 = this.A02;
                    byte b10 = bArr2[length4 + i12];
                    if ((b10 & 192) == 128) {
                        int length5 = b10 & Utf8.REPLACEMENT_BYTE;
                        j10 = (j10 << 6) | length5;
                        if (A04[3].length() != 11) {
                            A04[2] = "QkYn4WhdN3Bc00ITVAtZ7M0H0JKEG2qx";
                            i12++;
                        } else {
                            i12++;
                        }
                    } else {
                        throw new NumberFormatException(A03(0, 42, 72) + j10);
                    }
                }
                int length6 = this.A02;
                this.A02 = length6 + i10;
                return j10;
            }
            throw new NumberFormatException(A03(42, 35, 80) + j10);
        }
        throw new RuntimeException();
    }

    public final String A0T() {
        return A0Y(AbstractC2246ia.A06);
    }

    public final String A0U() {
        return A02((char) 0);
    }

    public final String A0V(int i10) {
        if (i10 == 0) {
            return A03(0, 0, 97);
        }
        int i11 = i10;
        int stringLength = this.A02;
        int lastIndex = (stringLength + i10) - 1;
        int stringLength2 = this.A01;
        if (lastIndex < stringLength2) {
            int stringLength3 = this.A00[lastIndex];
            if (stringLength3 == 0) {
                i11--;
            }
        }
        byte[] bArr = this.A00;
        int stringLength4 = this.A02;
        String strA0r = AbstractC09264a.A0r(bArr, stringLength4, i11);
        int stringLength5 = this.A02;
        this.A02 = stringLength5 + i10;
        return strA0r;
    }

    public final String A0W(int i10) {
        return A0X(i10, AbstractC2246ia.A06);
    }

    public final String A0X(int i10, Charset charset) {
        String str = new String(this.A00, this.A02, i10, charset);
        this.A02 += i10;
        return str;
    }

    public final String A0Y(Charset charset) {
        C3M.A09(A05.contains(charset), A03(95, 21, 50) + charset);
        if (A07() == 0) {
            return null;
        }
        if (!charset.equals(AbstractC2246ia.A02)) {
            A0Z();
        }
        int iA01 = A01(charset);
        int lineLimit = this.A02;
        String strA0X = A0X(iA01 - lineLimit, charset);
        int i10 = this.A02;
        int lineLimit2 = this.A01;
        if (i10 == lineLimit2) {
            return strA0X;
        }
        A05(charset);
        return strA0X;
    }

    public final Charset A0Z() {
        if (A07() >= 3 && this.A00[this.A02] == -17 && this.A00[this.A02 + 1] == -69 && this.A00[this.A02 + 2] == -65) {
            this.A02 += 3;
            return AbstractC2246ia.A06;
        }
        if (A07() >= 2) {
            if (this.A00[this.A02] == -2) {
                byte[] bArr = this.A00;
                int i10 = this.A02;
                if (A04[0].charAt(23) != 't') {
                    throw new RuntimeException();
                }
                A04[1] = "9QZAaK9H1E15SkUu26Oe";
                if (bArr[i10 + 1] == -1) {
                    this.A02 += 2;
                    return AbstractC2246ia.A04;
                }
            }
            if (this.A00[this.A02] == -1 && this.A00[this.A02 + 1] == -2) {
                this.A02 += 2;
                return AbstractC2246ia.A05;
            }
            return null;
        }
        return null;
    }

    public final short A0a() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | ((bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8));
    }

    public final short A0b() {
        byte[] bArr = this.A00;
        int i10 = this.A02;
        this.A02 = i10 + 1;
        int i11 = (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8;
        byte[] bArr2 = this.A00;
        int i12 = this.A02;
        this.A02 = i12 + 1;
        return (short) (i11 | (bArr2[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public final void A0c(int i10) {
        if (i10 > A08()) {
            this.A00 = Arrays.copyOf(this.A00, i10);
        }
    }

    public final void A0d(int i10) {
        A0j(A08() < i10 ? new byte[i10] : this.A00, i10);
        String[] strArr = A04;
        if (strArr[5].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A04[3] = "3F79npZxDc4PfqkC8vfulVLdM";
    }

    public final void A0e(int i10) {
        C3M.A07(i10 >= 0 && i10 <= this.A00.length);
        this.A01 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0f(int r5) {
        /*
            r4 = this;
            if (r5 < 0) goto L1e
            int r3 = r4.A01
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C4J.A04
            r0 = 4
            r1 = r2[r0]
            r0 = 7
            r2 = r2[r0]
            r0 = 20
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L20
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1e:
            r0 = 0
            goto L2a
        L20:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C4J.A04
            java.lang.String r1 = "UMwuHioqOI4Z"
            r0 = 3
            r2[r0] = r1
            if (r5 > r3) goto L1e
            r0 = 1
        L2a:
            com.facebook.ads.redexgen.core.C3M.A07(r0)
            r4.A02 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C4J.A0f(int):void");
    }

    public final void A0g(int i10) {
        A0f(this.A02 + i10);
    }

    public final void A0h(C4I c4i, int i10) {
        A0k(c4i.A00, 0, i10);
        c4i.A08(0);
    }

    public final void A0i(byte[] bArr) {
        A0j(bArr, bArr.length);
    }

    public final void A0j(byte[] bArr, int i10) {
        this.A00 = bArr;
        this.A01 = i10;
        this.A02 = 0;
    }

    public final void A0k(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.A00, this.A02, bArr, i10, i11);
        this.A02 += i11;
    }

    public final byte[] A0l() {
        return this.A00;
    }
}
