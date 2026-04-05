package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26543d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26544e;

    /* renamed from: f, reason: collision with root package name */
    public int f26545f;

    public y(int i10, byte[] bArr) {
        if (((bArr.length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i10)));
        }
        this.f26543d = bArr;
        this.f26545f = 0;
        this.f26544e = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, int i11) throws z {
        c(i10, 5);
        e(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, int i11) throws z {
        c(i10, 0);
        f(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i10, int i11) throws z {
        g((i10 << 3) | i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j10) throws z {
        if (!b0.f26349c || this.f26544e - this.f26545f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f26543d;
                    int i10 = this.f26545f;
                    this.f26545f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26545f), Integer.valueOf(this.f26544e), 1), e10);
                }
            }
            byte[] bArr2 = this.f26543d;
            int i11 = this.f26545f;
            this.f26545f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while ((j10 & (-128)) != 0) {
            byte[] bArr3 = this.f26543d;
            int i12 = this.f26545f;
            this.f26545f = i12 + 1;
            x3.f26537c.a((Object) bArr3, x3.f26540f + i12, (byte) ((((int) j10) & 127) | 128));
            j10 >>>= 7;
        }
        byte[] bArr4 = this.f26543d;
        int i13 = this.f26545f;
        this.f26545f = i13 + 1;
        x3.f26537c.a((Object) bArr4, x3.f26540f + i13, (byte) j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i10) throws z {
        try {
            byte[] bArr = this.f26543d;
            int i11 = this.f26545f;
            int i12 = i11 + 1;
            this.f26545f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f26545f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f26545f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f26545f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26545f), Integer.valueOf(this.f26544e), 1), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i10) throws z {
        if (i10 >= 0) {
            g(i10);
        } else {
            d(i10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i10) throws z {
        if (b0.f26349c && !d.a()) {
            int i11 = this.f26544e;
            int i12 = this.f26545f;
            if (i11 - i12 >= 5) {
                if ((i10 & (-128)) == 0) {
                    byte[] bArr = this.f26543d;
                    this.f26545f = i12 + 1;
                    x3.f26537c.a((Object) bArr, x3.f26540f + i12, (byte) i10);
                    return;
                }
                byte[] bArr2 = this.f26543d;
                this.f26545f = i12 + 1;
                w3 w3Var = x3.f26537c;
                long j10 = x3.f26540f;
                w3Var.a((Object) bArr2, i12 + j10, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & (-128)) == 0) {
                    byte[] bArr3 = this.f26543d;
                    int i14 = this.f26545f;
                    this.f26545f = i14 + 1;
                    w3Var.a((Object) bArr3, j10 + i14, (byte) i13);
                    return;
                }
                byte[] bArr4 = this.f26543d;
                int i15 = this.f26545f;
                this.f26545f = i15 + 1;
                w3Var.a((Object) bArr4, i15 + j10, (byte) (i13 | 128));
                int i16 = i10 >>> 14;
                if ((i16 & (-128)) == 0) {
                    byte[] bArr5 = this.f26543d;
                    int i17 = this.f26545f;
                    this.f26545f = i17 + 1;
                    w3Var.a((Object) bArr5, j10 + i17, (byte) i16);
                    return;
                }
                byte[] bArr6 = this.f26543d;
                int i18 = this.f26545f;
                this.f26545f = i18 + 1;
                w3Var.a((Object) bArr6, i18 + j10, (byte) (i16 | 128));
                int i19 = i10 >>> 21;
                if ((i19 & (-128)) == 0) {
                    byte[] bArr7 = this.f26543d;
                    int i20 = this.f26545f;
                    this.f26545f = i20 + 1;
                    w3Var.a((Object) bArr7, j10 + i20, (byte) i19);
                    return;
                }
                byte[] bArr8 = this.f26543d;
                int i21 = this.f26545f;
                this.f26545f = i21 + 1;
                w3Var.a((Object) bArr8, i21 + j10, (byte) (i19 | 128));
                byte[] bArr9 = this.f26543d;
                int i22 = this.f26545f;
                this.f26545f = i22 + 1;
                w3Var.a((Object) bArr9, j10 + i22, (byte) (i10 >>> 28));
                return;
            }
        }
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr10 = this.f26543d;
                int i23 = this.f26545f;
                this.f26545f = i23 + 1;
                bArr10[i23] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26545f), Integer.valueOf(this.f26544e), 1), e10);
            }
        }
        byte[] bArr11 = this.f26543d;
        int i24 = this.f26545f;
        this.f26545f = i24 + 1;
        bArr11[i24] = (byte) i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j10) throws z {
        try {
            byte[] bArr = this.f26543d;
            int i10 = this.f26545f;
            int i11 = i10 + 1;
            this.f26545f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f26545f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f26545f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f26545f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f26545f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f26545f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f26545f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f26545f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26545f), Integer.valueOf(this.f26544e), 1), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, long j10) throws z {
        c(i10, 1);
        c(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, long j10) throws z {
        c(i10, 0);
        d(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, boolean z10) throws z {
        c(i10, 0);
        a(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, s sVar) throws z {
        c(1, 3);
        c(2, 0);
        g(i10);
        a(3, sVar);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i10) throws z {
        c(i10, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, s sVar) throws z {
        c(i10, 2);
        g(sVar.size());
        sVar.a(this);
    }

    public final void b(byte[] bArr, int i10, int i11) throws z {
        try {
            System.arraycopy(bArr, i10, this.f26543d, this.f26545f, i11);
            this.f26545f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26545f), Integer.valueOf(this.f26544e), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i10, int i11) throws z {
        c(i10, 0);
        g(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var, t2 t2Var) throws z {
        c(i10, 2);
        g(((b) d2Var).getSerializedSize(t2Var));
        t2Var.a((Object) d2Var, this.f26350a);
    }

    public final void b(String str) throws z {
        int i10 = this.f26545f;
        try {
            int iC = b0.c(str.length() * 3);
            int iC2 = b0.c(str.length());
            if (iC2 == iC) {
                int i11 = i10 + iC2;
                this.f26545f = i11;
                int iA = d4.f26366a.a(str, this.f26543d, i11, this.f26544e - i11);
                this.f26545f = i10;
                g((iA - i10) - iC2);
                this.f26545f = iA;
                return;
            }
            g(d4.a(str));
            byte[] bArr = this.f26543d;
            int i12 = this.f26545f;
            this.f26545f = d4.f26366a.a(str, bArr, i12, this.f26544e - i12);
        } catch (b4 e10) {
            this.f26545f = i10;
            a(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new z(e11);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var) throws z {
        c(1, 3);
        c(2, 0);
        g(i10);
        c(3, 2);
        g(d2Var.getSerializedSize());
        d2Var.writeTo(this);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b10) throws z {
        try {
            byte[] bArr = this.f26543d;
            int i10 = this.f26545f;
            this.f26545f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new z(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f26545f), Integer.valueOf(this.f26544e), 1), e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i10, int i11) throws z {
        b(bArr, i10, i11);
    }

    public final int a() {
        return this.f26544e - this.f26545f;
    }
}
