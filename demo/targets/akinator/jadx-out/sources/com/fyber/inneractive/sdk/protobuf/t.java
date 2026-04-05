package com.fyber.inneractive.sdk.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t extends w {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f26475e;

    /* renamed from: f, reason: collision with root package name */
    public int f26476f;

    /* renamed from: g, reason: collision with root package name */
    public int f26477g;

    /* renamed from: h, reason: collision with root package name */
    public int f26478h;

    /* renamed from: i, reason: collision with root package name */
    public final int f26479i;

    /* renamed from: j, reason: collision with root package name */
    public int f26480j;

    /* renamed from: k, reason: collision with root package name */
    public int f26481k = Integer.MAX_VALUE;

    public t(byte[] bArr, int i10, int i11, boolean z10) {
        this.f26475e = bArr;
        this.f26476f = i11 + i10;
        this.f26478h = i10;
        this.f26479i = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f26480j != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return this.f26478h - this.f26479i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f26481k = i10;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i10) throws n1 {
        int iT;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f26476f - this.f26478h >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f26475e;
                    int i13 = this.f26478h;
                    this.f26478h = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                int i14 = this.f26478h;
                if (i14 == this.f26476f) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f26475e;
                this.f26478h = i14 + 1;
                if (bArr2[i14] < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            f(8);
            return true;
        }
        if (i11 == 2) {
            f(m());
            return true;
        }
        if (i11 == 3) {
            do {
                iT = t();
                if (iT == 0) {
                    break;
                }
            } while (e(iT));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 == 5) {
            f(4);
            return true;
        }
        int i15 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2 A[PHI: r3
      0x00a2: PHI (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r6 = this;
            int r0 = r6.f26478h
            int r1 = r6.f26476f
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r6.f26475e
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L12
            r6.f26478h = r3
            return r4
        L12:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L18
            goto L6d
        L18:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L25
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La5
        L25:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            if (r1 < 0) goto L33
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L30:
            r1 = r4
            goto La5
        L33:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L42
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            r1 = r3
            goto La5
        L42:
            int r4 = r0 + 5
            r3 = r2[r3]
            int r5 = r3 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r3 >= 0) goto La3
            int r3 = r0 + 6
            r4 = r2[r4]
            if (r4 >= 0) goto La2
            int r4 = r0 + 7
            r3 = r2[r3]
            if (r3 >= 0) goto La3
            int r3 = r0 + 8
            r4 = r2[r4]
            if (r4 >= 0) goto La2
            int r4 = r0 + 9
            r3 = r2[r3]
            if (r3 >= 0) goto La3
            int r0 = r0 + 10
            r2 = r2[r4]
            if (r2 >= 0) goto La0
        L6d:
            r0 = 0
            r2 = 0
        L70:
            r3 = 64
            if (r2 >= r3) goto L98
            int r3 = r6.f26478h
            int r4 = r6.f26476f
            if (r3 == r4) goto L90
            byte[] r4 = r6.f26475e
            int r5 = r3 + 1
            r6.f26478h = r5
            r3 = r4[r3]
            r4 = r3 & 127(0x7f, float:1.78E-43)
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 != 0) goto L8d
            int r0 = (int) r0
            return r0
        L8d:
            int r2 = r2 + 7
            goto L70
        L90:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        L98:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            throw r0
        La0:
            r4 = r0
            goto La3
        La2:
            r4 = r3
        La3:
            r0 = r1
            goto L30
        La5:
            r6.f26478h = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t.m():int");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() throws n1 {
        int iM = m();
        if (iM > 0) {
            int i10 = this.f26476f;
            int i11 = this.f26478h;
            if (iM <= i10 - i11) {
                String str = new String(this.f26475e, i11, iM, l1.f26429a);
                this.f26478h += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws n1 {
        int iM = m();
        if (iM > 0) {
            int i10 = this.f26476f;
            int i11 = this.f26478h;
            if (iM <= i10 - i11) {
                String strA = d4.f26366a.a(this.f26475e, i11, iM);
                this.f26478h += iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f26480j = 0;
            return 0;
        }
        int iM = m();
        this.f26480j = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    public final int w() throws n1 {
        int i10 = this.f26478h;
        if (this.f26476f - i10 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f26475e;
        this.f26478h = i10 + 4;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long x() throws n1 {
        int i10 = this.f26478h;
        if (this.f26476f - i10 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f26475e;
        this.f26478h = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        int i10 = this.f26478h;
        int i11 = this.f26476f;
        long j13 = 0;
        if (i11 != i10) {
            byte[] bArr = this.f26475e;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f26478h = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j10 = (-2080896) ^ i18;
                            i13 = i17;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (bArr[i17] << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j16 = j15 ^ (bArr[i13] << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (bArr[i19] << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j16 = j15 ^ (bArr[i13] << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i20;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j10 = j16 ^ j11;
                                i13 = i19;
                            }
                            j10 = j12 ^ j15;
                        }
                    }
                }
                this.f26478h = i13;
                return j10;
            }
        }
        for (int i21 = 0; i21 < 64; i21 += 7) {
            int i22 = this.f26478h;
            if (i22 == this.f26476f) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f26475e;
            this.f26478h = i22 + 1;
            j13 |= (r1 & AbstractJsonLexerKt.TC_INVALID) << i21;
            if ((bArr2[i22] & 128) == 0) {
                return j13;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i10 = this.f26476f + this.f26477g;
        this.f26476f = i10;
        int i11 = i10 - this.f26479i;
        int i12 = this.f26481k;
        if (i11 <= i12) {
            this.f26477g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f26477g = i13;
        this.f26476f = i10 - i13;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = (this.f26478h - this.f26479i) + i10;
        int i12 = this.f26481k;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f26481k = i11;
        z();
        return i12;
    }

    public final void f(int i10) throws n1 {
        if (i10 >= 0) {
            int i11 = this.f26476f;
            int i12 = this.f26478h;
            if (i10 <= i11 - i12) {
                this.f26478h = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f26478h == this.f26476f;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10, c2 c2Var, h0 h0Var) throws IOException {
        int i11 = this.f26510a;
        if (i11 < this.f26511b) {
            this.f26510a = i11 + 1;
            ((t0) c2Var).a(this, h0Var);
            a((i10 << 3) | 4);
            this.f26510a--;
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) throws IOException {
        int iM = m();
        if (this.f26510a < this.f26511b) {
            int iD = d(iM);
            this.f26510a++;
            ((t0) c2Var).a(this, h0Var);
            a(0);
            this.f26510a--;
            this.f26481k = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fyber.inneractive.sdk.protobuf.q e() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r5 = this;
            int r0 = r5.m()
            if (r0 <= 0) goto L28
            int r1 = r5.f26476f
            int r2 = r5.f26478h
            int r1 = r1 - r2
            if (r0 > r1) goto L28
            byte[] r1 = r5.f26475e
            com.fyber.inneractive.sdk.protobuf.q r3 = com.fyber.inneractive.sdk.protobuf.s.f26471b
            int r3 = r2 + r0
            int r4 = r1.length
            com.fyber.inneractive.sdk.protobuf.s.a(r2, r3, r4)
            com.fyber.inneractive.sdk.protobuf.q r3 = new com.fyber.inneractive.sdk.protobuf.q
            com.fyber.inneractive.sdk.protobuf.o r4 = com.fyber.inneractive.sdk.protobuf.s.f26472c
            byte[] r1 = r4.a(r1, r2, r0)
            r3.<init>(r1)
            int r1 = r5.f26478h
            int r1 = r1 + r0
            r5.f26478h = r1
            return r3
        L28:
            if (r0 != 0) goto L2d
            com.fyber.inneractive.sdk.protobuf.q r0 = com.fyber.inneractive.sdk.protobuf.s.f26471b
            return r0
        L2d:
            if (r0 <= 0) goto L40
            int r1 = r5.f26476f
            int r2 = r5.f26478h
            int r1 = r1 - r2
            if (r0 > r1) goto L40
            int r0 = r0 + r2
            r5.f26478h = r0
            byte[] r1 = r5.f26475e
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L46
        L40:
            if (r0 > 0) goto L56
            if (r0 != 0) goto L4e
            byte[] r0 = com.fyber.inneractive.sdk.protobuf.l1.f26430b
        L46:
            com.fyber.inneractive.sdk.protobuf.q r1 = com.fyber.inneractive.sdk.protobuf.s.f26471b
            com.fyber.inneractive.sdk.protobuf.q r1 = new com.fyber.inneractive.sdk.protobuf.q
            r1.<init>(r0)
            return r1
        L4e:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            throw r0
        L56:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.t.e():com.fyber.inneractive.sdk.protobuf.q");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f26481k;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f26478h - this.f26479i);
    }
}
