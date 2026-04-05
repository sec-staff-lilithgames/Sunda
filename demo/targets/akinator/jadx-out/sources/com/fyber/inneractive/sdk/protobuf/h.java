package com.fyber.inneractive.sdk.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26385a = true;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f26386b;

    /* renamed from: c, reason: collision with root package name */
    public int f26387c;

    /* renamed from: d, reason: collision with root package name */
    public int f26388d;

    /* renamed from: e, reason: collision with root package name */
    public int f26389e;

    /* renamed from: f, reason: collision with root package name */
    public int f26390f;

    public h(ByteBuffer byteBuffer) {
        this.f26386b = byteBuffer.array();
        this.f26387c = byteBuffer.position() + byteBuffer.arrayOffset();
        this.f26388d = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    public final String a(boolean z10) throws n1 {
        c(2);
        int iX = x();
        if (iX == 0) {
            return "";
        }
        a(iX);
        if (z10) {
            byte[] bArr = this.f26386b;
            int i10 = this.f26387c;
            if (!d4.f26366a.b(bArr, i10, i10 + iX)) {
                throw new n1("Protocol message had invalid UTF-8.");
            }
        }
        String str = new String(this.f26386b, this.f26387c, iX, l1.f26429a);
        this.f26387c += iX;
        return str;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        c(2);
        return d(p2.f26452c.a(cls), h0Var);
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i10 = this.f26390f;
        this.f26390f = ((this.f26389e >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f26389e == this.f26390f) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f26390f = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f26389e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws n1 {
        c(1);
        a(8);
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws n1 {
        c(1);
        a(8);
        return Double.longBitsToDouble(w());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    @Override // com.fyber.inneractive.sdk.protobuf.s2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r7 = this;
            boolean r0 = r7.u()
            r1 = 0
            if (r0 != 0) goto Laf
            int r0 = r7.f26389e
            int r2 = r7.f26390f
            if (r0 != r2) goto Lf
            goto Laf
        Lf:
            r3 = r0 & 7
            r4 = 1
            if (r3 == 0) goto L6e
            if (r3 == r4) goto L63
            r1 = 2
            if (r3 == r1) goto L56
            r1 = 4
            r5 = 3
            if (r3 == r5) goto L31
            r0 = 5
            if (r3 != r0) goto L29
            r7.a(r1)
            int r0 = r7.f26387c
            int r0 = r0 + r1
            r7.f26387c = r0
            return r4
        L29:
            int r0 = com.fyber.inneractive.sdk.protobuf.n1.f26441a
            com.fyber.inneractive.sdk.protobuf.m1 r0 = new com.fyber.inneractive.sdk.protobuf.m1
            r0.<init>()
            throw r0
        L31:
            int r0 = r0 >>> r5
            int r0 = r0 << r5
            r0 = r0 | r1
            r7.f26390f = r0
        L36:
            int r0 = r7.s()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L45
            boolean r0 = r7.i()
            if (r0 != 0) goto L36
        L45:
            int r0 = r7.f26389e
            int r1 = r7.f26390f
            if (r0 != r1) goto L4e
            r7.f26390f = r2
            return r4
        L4e:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            throw r0
        L56:
            int r0 = r7.x()
            r7.a(r0)
            int r1 = r7.f26387c
            int r1 = r1 + r0
            r7.f26387c = r1
            return r4
        L63:
            r0 = 8
            r7.a(r0)
            int r1 = r7.f26387c
            int r1 = r1 + r0
            r7.f26387c = r1
            return r4
        L6e:
            int r0 = r7.f26388d
            int r2 = r7.f26387c
            int r0 = r0 - r2
            r3 = 10
            if (r0 < r3) goto L89
            byte[] r0 = r7.f26386b
            r5 = r1
        L7a:
            if (r5 >= r3) goto L89
            int r6 = r2 + 1
            r2 = r0[r2]
            if (r2 < 0) goto L85
            r7.f26387c = r6
            goto L9b
        L85:
            int r5 = r5 + 1
            r2 = r6
            goto L7a
        L89:
            if (r1 >= r3) goto La7
            int r0 = r7.f26387c
            int r2 = r7.f26388d
            if (r0 == r2) goto L9f
            byte[] r2 = r7.f26386b
            int r5 = r0 + 1
            r7.f26387c = r5
            r0 = r2[r0]
            if (r0 < 0) goto L9c
        L9b:
            return r4
        L9c:
            int r1 = r1 + 1
            goto L89
        L9f:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            throw r0
        La7:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            throw r0
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.h.i():boolean");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        c(0);
        return w.b(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws n1 {
        c(5);
        a(4);
        return Float.intBitsToFloat(v());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        c(0);
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() {
        return a(false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() {
        return a(true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        c(0);
        return x() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() throws n1 {
        if (u()) {
            return Integer.MAX_VALUE;
        }
        int iX = x();
        this.f26389e = iX;
        if (iX == this.f26390f) {
            return Integer.MAX_VALUE;
        }
        return iX >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws n1 {
        c(1);
        a(8);
        return w();
    }

    public final boolean u() {
        return this.f26387c == this.f26388d;
    }

    public final int v() {
        int i10 = this.f26387c;
        byte[] bArr = this.f26386b;
        this.f26387c = i10 + 4;
        return ((bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | (bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
    }

    public final long w() {
        int i10 = this.f26387c;
        byte[] bArr = this.f26386b;
        this.f26387c = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4 A[PHI: r2
      0x00a4: PHI (r2v7 int) = (r2v6 int), (r2v9 int) binds: [B:37:0x0082, B:41:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x() throws com.fyber.inneractive.sdk.protobuf.n1 {
        /*
            r9 = this;
            int r0 = r9.f26387c
            int r1 = r9.f26388d
            java.lang.String r2 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r1 == r0) goto Laa
            byte[] r3 = r9.f26386b
            int r4 = r0 + 1
            r5 = r3[r0]
            if (r5 < 0) goto L13
            r9.f26387c = r4
            return r5
        L13:
            int r1 = r1 - r4
            java.lang.String r6 = "CodedInputStream encountered a malformed varint."
            r7 = 9
            if (r1 >= r7) goto L49
            r0 = 0
            r3 = 0
        L1d:
            r4 = 64
            if (r3 >= r4) goto L43
            int r4 = r9.f26387c
            int r5 = r9.f26388d
            if (r4 == r5) goto L3d
            byte[] r5 = r9.f26386b
            int r7 = r4 + 1
            r9.f26387c = r7
            r4 = r5[r4]
            r5 = r4 & 127(0x7f, float:1.78E-43)
            long r7 = (long) r5
            long r7 = r7 << r3
            long r0 = r0 | r7
            r4 = r4 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L3a
            int r0 = (int) r0
            return r0
        L3a:
            int r3 = r3 + 7
            goto L1d
        L3d:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r2)
            throw r0
        L43:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r6)
            throw r0
        L49:
            int r1 = r0 + 2
            r2 = r3[r4]
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L55
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La7
        L55:
            int r4 = r0 + 3
            r1 = r3[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r2
            if (r1 < 0) goto L62
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L60:
            r1 = r4
            goto La7
        L62:
            int r2 = r0 + 4
            r4 = r3[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L71
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            r1 = r2
            goto La7
        L71:
            int r4 = r0 + 5
            r2 = r3[r2]
            int r5 = r2 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r2 >= 0) goto La5
            int r2 = r0 + 6
            r4 = r3[r4]
            if (r4 >= 0) goto La4
            int r4 = r0 + 7
            r2 = r3[r2]
            if (r2 >= 0) goto La5
            int r2 = r0 + 8
            r4 = r3[r4]
            if (r4 >= 0) goto La4
            int r4 = r0 + 9
            r2 = r3[r2]
            if (r2 >= 0) goto La5
            int r0 = r0 + 10
            r2 = r3[r4]
            if (r2 < 0) goto L9e
            r4 = r0
            goto La5
        L9e:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r6)
            throw r0
        La4:
            r4 = r2
        La5:
            r0 = r1
            goto L60
        La7:
            r9.f26387c = r1
            return r0
        Laa:
            com.fyber.inneractive.sdk.protobuf.n1 r0 = new com.fyber.inneractive.sdk.protobuf.n1
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.h.x():int");
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f26387c;
        int i11 = this.f26388d;
        if (i11 == i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f26386b;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            this.f26387c = i12;
            return b10;
        }
        long j14 = 0;
        if (i11 - i12 < 9) {
            for (int i13 = 0; i13 < 64; i13 += 7) {
                int i14 = this.f26387c;
                if (i14 == this.f26388d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f26386b;
                this.f26387c = i14 + 1;
                j14 |= (r1 & AbstractJsonLexerKt.TC_INVALID) << i13;
                if ((bArr2[i14] & 128) == 0) {
                    return j14;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        int i15 = i10 + 2;
        int i16 = (bArr[i12] << 7) ^ b10;
        if (i16 < 0) {
            j10 = i16 ^ (-128);
        } else {
            int i17 = i10 + 3;
            int i18 = (bArr[i15] << 14) ^ i16;
            if (i18 >= 0) {
                j10 = i18 ^ 16256;
                i15 = i17;
            } else {
                int i19 = i10 + 4;
                int i20 = i18 ^ (bArr[i17] << 21);
                if (i20 < 0) {
                    j13 = (-2080896) ^ i20;
                } else {
                    long j15 = i20;
                    i15 = i10 + 5;
                    long j16 = j15 ^ (bArr[i19] << 28);
                    if (j16 >= 0) {
                        j12 = 266354560;
                    } else {
                        i19 = i10 + 6;
                        long j17 = j16 ^ (bArr[i15] << 35);
                        if (j17 < 0) {
                            j11 = -34093383808L;
                        } else {
                            i15 = i10 + 7;
                            j16 = j17 ^ (bArr[i19] << 42);
                            if (j16 >= 0) {
                                j12 = 4363953127296L;
                            } else {
                                i19 = i10 + 8;
                                j17 = j16 ^ (bArr[i15] << 49);
                                if (j17 < 0) {
                                    j11 = -558586000294016L;
                                } else {
                                    i15 = i10 + 9;
                                    long j18 = (j17 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                    if (j18 < 0) {
                                        int i21 = i10 + 10;
                                        if (bArr[i15] < 0) {
                                            throw new n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i15 = i21;
                                    }
                                    j10 = j18;
                                }
                            }
                        }
                        j13 = j11 ^ j17;
                    }
                    j10 = j12 ^ j16;
                }
                i15 = i19;
                j10 = j13;
            }
        }
        this.f26387c = i15;
        return j10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof a1)) {
            int i12 = this.f26389e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f26387c + iX;
                while (this.f26387c < i13) {
                    list.add(Integer.valueOf(v()));
                }
                return;
            }
            if (i12 != 5) {
                int i14 = n1.f26441a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(q()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        a1 a1Var = (a1) list;
        int i15 = this.f26389e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f26387c + iX2;
            while (this.f26387c < i16) {
                a1Var.c(v());
            }
            return;
        }
        if (i15 != 5) {
            int i17 = n1.f26441a;
            throw new m1();
        }
        do {
            a1Var.c(q());
            if (u()) {
                return;
            } else {
                i11 = this.f26387c;
            }
        } while (x() == this.f26389e);
        this.f26387c = i11;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof u1)) {
            int i12 = this.f26389e & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(g()));
                    if (u()) {
                        return;
                    } else {
                        i10 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i10;
                return;
            }
            if (i12 != 2) {
                int i13 = n1.f26441a;
                throw new m1();
            }
            int iX = x();
            e(iX);
            int i14 = this.f26387c + iX;
            while (this.f26387c < i14) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        u1 u1Var = (u1) list;
        int i15 = this.f26389e & 7;
        if (i15 == 1) {
            do {
                u1Var.a(g());
                if (u()) {
                    return;
                } else {
                    i11 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i11;
            return;
        }
        if (i15 != 2) {
            int i16 = n1.f26441a;
            throw new m1();
        }
        int iX2 = x();
        e(iX2);
        int i17 = this.f26387c + iX2;
        while (this.f26387c < i17) {
            u1Var.a(w());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof a1)) {
            int i12 = this.f26389e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    int i13 = n1.f26441a;
                    throw new m1();
                }
                int iX = this.f26387c + x();
                while (this.f26387c < iX) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        a1 a1Var = (a1) list;
        int i14 = this.f26389e & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                int i15 = n1.f26441a;
                throw new m1();
            }
            int iX2 = this.f26387c + x();
            while (this.f26387c < iX2) {
                a1Var.c(x());
            }
            return;
        }
        do {
            c(0);
            a1Var.c(x());
            if (u()) {
                return;
            } else {
                i11 = this.f26387c;
            }
        } while (x() == this.f26389e);
        this.f26387c = i11;
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iX = x();
        a(iX);
        int i10 = this.f26388d;
        int i11 = this.f26387c + iX;
        this.f26388d = i11;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f26387c == i11) {
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } finally {
            this.f26388d = i10;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f26389e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f26387c + iX;
                while (this.f26387c < i13) {
                    a1Var.c(v());
                }
                return;
            }
            if (i12 == 5) {
                do {
                    a1Var.c(m());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            int i14 = n1.f26441a;
            throw new m1();
        }
        int i15 = this.f26389e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f26387c + iX2;
            while (this.f26387c < i16) {
                list.add(Integer.valueOf(v()));
            }
            return;
        }
        if (i15 == 5) {
            do {
                list.add(Integer.valueOf(m()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        int i17 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i12 = this.f26389e & 7;
            if (i12 == 1) {
                do {
                    d0Var.a(h());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = x();
                e(iX);
                int i13 = this.f26387c + iX;
                while (this.f26387c < i13) {
                    d0Var.a(Double.longBitsToDouble(w()));
                }
                return;
            }
            int i14 = n1.f26441a;
            throw new m1();
        }
        int i15 = this.f26389e & 7;
        if (i15 == 1) {
            do {
                list.add(Double.valueOf(h()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        if (i15 == 2) {
            int iX2 = x();
            e(iX2);
            int i16 = this.f26387c + iX2;
            while (this.f26387c < i16) {
                list.add(Double.valueOf(Double.longBitsToDouble(w())));
            }
            return;
        }
        int i17 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof j) {
            j jVar = (j) list;
            int i12 = this.f26389e & 7;
            if (i12 == 0) {
                do {
                    jVar.a(r());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f26387c + x();
                while (this.f26387c < iX) {
                    jVar.a(x() != 0);
                }
                b(iX);
                return;
            }
            int i13 = n1.f26441a;
            throw new m1();
        }
        int i14 = this.f26389e & 7;
        if (i14 == 0) {
            do {
                list.add(Boolean.valueOf(r()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f26387c + x();
            while (this.f26387c < iX2) {
                list.add(Boolean.valueOf(x() != 0));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f26389e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    a1Var.c(x());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f26387c + x();
                while (this.f26387c < iX) {
                    a1Var.c(x());
                }
                b(iX);
                return;
            }
            int i13 = n1.f26441a;
            throw new m1();
        }
        int i14 = this.f26389e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f26387c + x();
            while (this.f26387c < iX2) {
                list.add(Integer.valueOf(x()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        c(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f26389e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f26387c + x();
                    while (this.f26387c < iX) {
                        u1Var.a(w.a(y()));
                    }
                    return;
                }
                int i13 = n1.f26441a;
                throw new m1();
            }
            do {
                c(0);
                u1Var.a(w.a(y()));
                if (u()) {
                    return;
                } else {
                    i11 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i11;
            return;
        }
        int i14 = this.f26389e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f26387c + x();
                while (this.f26387c < iX2) {
                    list.add(Long.valueOf(w.a(y())));
                }
                return;
            }
            int i15 = n1.f26441a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Long.valueOf(w.a(y())));
            if (u()) {
                return;
            } else {
                i10 = this.f26387c;
            }
        } while (x() == this.f26389e);
        this.f26387c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f26389e & 7;
            if (i12 == 1) {
                do {
                    u1Var.a(t());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = x();
                e(iX);
                int i13 = this.f26387c + iX;
                while (this.f26387c < i13) {
                    u1Var.a(w());
                }
                return;
            }
            int i14 = n1.f26441a;
            throw new m1();
        }
        int i15 = this.f26389e & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        if (i15 == 2) {
            int iX2 = x();
            e(iX2);
            int i16 = this.f26387c + iX2;
            while (this.f26387c < i16) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        int i17 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int i10;
        if ((this.f26389e & 7) == 2) {
            do {
                list.add(a());
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        int i11 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f26389e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f26387c + x();
                while (this.f26387c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i13 = n1.f26441a;
            throw new m1();
        }
        int i14 = this.f26389e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f26387c + x();
            while (this.f26387c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i10;
        int i11 = this.f26389e;
        if ((i11 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == i11);
            this.f26387c = i10;
            return;
        }
        int i12 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        c(3);
        return c(p2.f26452c.a(cls), h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        c(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f26389e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f26387c + x();
                    while (this.f26387c < iX) {
                        a1Var.c(w.b(x()));
                    }
                    return;
                }
                int i13 = n1.f26441a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(w.b(x()));
                if (u()) {
                    return;
                } else {
                    i11 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i11;
            return;
        }
        int i14 = this.f26389e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f26387c + x();
                while (this.f26387c < iX2) {
                    list.add(Integer.valueOf(w.b(x())));
                }
                return;
            }
            int i15 = n1.f26441a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(w.b(x())));
            if (u()) {
                return;
            } else {
                i10 = this.f26387c;
            }
        } while (x() == this.f26389e);
        this.f26387c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws n1 {
        s qVar;
        c(2);
        int iX = x();
        if (iX == 0) {
            return s.f26471b;
        }
        a(iX);
        if (this.f26385a) {
            byte[] bArr = this.f26386b;
            int i10 = this.f26387c;
            q qVar2 = s.f26471b;
            qVar = new n(bArr, i10, iX);
        } else {
            byte[] bArr2 = this.f26386b;
            int i11 = this.f26387c;
            q qVar3 = s.f26471b;
            s.a(i11, i11 + iX, bArr2.length);
            qVar = new q(s.f26472c.a(bArr2, i11, iX));
        }
        this.f26387c += iX;
        return qVar;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i12 = this.f26389e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f26387c + iX;
                while (this.f26387c < i13) {
                    q0Var.a(Float.intBitsToFloat(v()));
                }
                return;
            }
            if (i12 == 5) {
                do {
                    q0Var.a(k());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            int i14 = n1.f26441a;
            throw new m1();
        }
        int i15 = this.f26389e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f26387c + iX2;
            while (this.f26387c < i16) {
                list.add(Float.valueOf(Float.intBitsToFloat(v())));
            }
            return;
        }
        if (i15 == 5) {
            do {
                list.add(Float.valueOf(k()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        int i17 = n1.f26441a;
        throw new m1();
    }

    public final void b(int i10) throws n1 {
        if (this.f26387c != i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f26389e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f26387c + x();
                while (this.f26387c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i13 = n1.f26441a;
            throw new m1();
        }
        int i14 = this.f26389e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f26387c + x();
            while (this.f26387c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f26389e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f26387c + x();
                    while (this.f26387c < iX) {
                        a1Var.c(x());
                    }
                    return;
                }
                int i13 = n1.f26441a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(x());
                if (u()) {
                    return;
                } else {
                    i11 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i11;
            return;
        }
        int i14 = this.f26389e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f26387c + x();
                while (this.f26387c < iX2) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            int i15 = n1.f26441a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(x()));
            if (u()) {
                return;
            } else {
                i10 = this.f26387c;
            }
        } while (x() == this.f26389e);
        this.f26387c = i10;
    }

    public final void e(int i10) throws n1 {
        a(i10);
        if ((i10 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void c(int i10) throws m1 {
        if ((this.f26389e & 7) == i10) {
            return;
        }
        int i11 = n1.f26441a;
        throw new m1();
    }

    public final void d(int i10) throws n1 {
        a(i10);
        if ((i10 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void a(List list, boolean z10) throws m1 {
        int i10;
        int i11;
        if ((this.f26389e & 7) == 2) {
            if ((list instanceof q1) && !z10) {
                q1 q1Var = (q1) list;
                do {
                    q1Var.a(a());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f26387c;
                    }
                } while (x() == this.f26389e);
                this.f26387c = i11;
                return;
            }
            do {
                list.add(a(z10));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == this.f26389e);
            this.f26387c = i10;
            return;
        }
        int i12 = n1.f26441a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i10;
        int i11 = this.f26389e;
        if ((i11 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i10 = this.f26387c;
                }
            } while (x() == i11);
            this.f26387c = i10;
            return;
        }
        int i12 = n1.f26441a;
        throw new m1();
    }

    public final void a(int i10) throws n1 {
        if (i10 < 0 || i10 > this.f26388d - this.f26387c) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
