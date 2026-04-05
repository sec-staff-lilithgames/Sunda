package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f26337d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26338e;

    /* renamed from: f, reason: collision with root package name */
    public int f26339f;

    /* renamed from: g, reason: collision with root package name */
    public final OutputStream f26340g;

    public a0(OutputStream outputStream, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f26337d = new byte[iMax];
        this.f26338e = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f26340g = outputStream;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, int i11) {
        j(14);
        e(i10, 5);
        h(i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, int i11) {
        j(20);
        e(i10, 0);
        if (i11 >= 0) {
            i(i11);
        } else {
            f(i11);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(int i10, int i11) {
        j(5);
        i((i10 << 3) | i11);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(int i10, int i11) {
        j(20);
        e(i10, 0);
        i(i11);
    }

    public final void e(int i10, int i11) {
        i((i10 << 3) | i11);
    }

    public final void f(long j10) {
        if (!b0.f26349c) {
            while ((j10 & (-128)) != 0) {
                byte[] bArr = this.f26337d;
                int i10 = this.f26339f;
                this.f26339f = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                j10 >>>= 7;
            }
            byte[] bArr2 = this.f26337d;
            int i11 = this.f26339f;
            this.f26339f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while ((j10 & (-128)) != 0) {
            byte[] bArr3 = this.f26337d;
            int i12 = this.f26339f;
            this.f26339f = i12 + 1;
            x3.f26537c.a((Object) bArr3, x3.f26540f + i12, (byte) ((((int) j10) & 127) | 128));
            j10 >>>= 7;
        }
        byte[] bArr4 = this.f26337d;
        int i13 = this.f26339f;
        this.f26339f = i13 + 1;
        x3.f26537c.a((Object) bArr4, x3.f26540f + i13, (byte) j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void g(int i10) {
        j(5);
        i(i10);
    }

    public final void h(int i10) {
        byte[] bArr = this.f26337d;
        int i11 = this.f26339f;
        int i12 = i11 + 1;
        this.f26339f = i12;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f26339f = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f26339f = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f26339f = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
    }

    public final void i(int i10) {
        if (!b0.f26349c) {
            while ((i10 & (-128)) != 0) {
                byte[] bArr = this.f26337d;
                int i11 = this.f26339f;
                this.f26339f = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            byte[] bArr2 = this.f26337d;
            int i12 = this.f26339f;
            this.f26339f = i12 + 1;
            bArr2[i12] = (byte) i10;
            return;
        }
        while ((i10 & (-128)) != 0) {
            byte[] bArr3 = this.f26337d;
            int i13 = this.f26339f;
            this.f26339f = i13 + 1;
            x3.f26537c.a((Object) bArr3, x3.f26540f + i13, (byte) ((i10 & 127) | 128));
            i10 >>>= 7;
        }
        byte[] bArr4 = this.f26337d;
        int i14 = this.f26339f;
        this.f26339f = i14 + 1;
        x3.f26537c.a((Object) bArr4, x3.f26540f + i14, (byte) i10);
    }

    public final void j(int i10) {
        if (this.f26338e - this.f26339f < i10) {
            a();
        }
    }

    public final void e(long j10) {
        byte[] bArr = this.f26337d;
        int i10 = this.f26339f;
        int i11 = i10 + 1;
        this.f26339f = i11;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f26339f = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f26339f = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f26339f = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f26339f = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f26339f = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f26339f = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f26339f = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void c(long j10) {
        j(8);
        e(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, long j10) {
        j(18);
        e(i10, 1);
        e(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void d(long j10) {
        j(10);
        f(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, long j10) {
        j(20);
        e(i10, 0);
        f(j10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, boolean z10) {
        j(11);
        e(i10, 0);
        byte b10 = z10 ? (byte) 1 : (byte) 0;
        byte[] bArr = this.f26337d;
        int i11 = this.f26339f;
        this.f26339f = i11 + 1;
        bArr[i11] = b10;
    }

    public final void b(s sVar) {
        int size = sVar.size();
        j(5);
        i(size);
        sVar.a(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void f(int i10) {
        if (i10 >= 0) {
            j(5);
            i(i10);
        } else {
            j(10);
            f(i10);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(String str, int i10) throws IOException {
        c(i10, 2);
        b(str);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void e(int i10) {
        j(4);
        h(i10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, s sVar) {
        c(i10, 2);
        b(sVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void b(int i10, s sVar) {
        c(1, 3);
        d(2, i10);
        c(3, 2);
        b(sVar);
        c(1, 4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var, t2 t2Var) {
        c(i10, 2);
        int serializedSize = ((b) d2Var).getSerializedSize(t2Var);
        j(5);
        i(serializedSize);
        t2Var.a((Object) d2Var, this.f26350a);
    }

    public final void b(String str) throws IOException {
        try {
            int length = str.length() * 3;
            int iC = b0.c(length);
            int i10 = iC + length;
            int i11 = this.f26338e;
            if (i10 > i11) {
                byte[] bArr = new byte[length];
                int iA = d4.f26366a.a(str, bArr, 0, length);
                j(5);
                i(iA);
                b(bArr, 0, iA);
                return;
            }
            if (i10 > i11 - this.f26339f) {
                a();
            }
            int iC2 = b0.c(str.length());
            int i12 = this.f26339f;
            try {
                if (iC2 == iC) {
                    int i13 = i12 + iC2;
                    this.f26339f = i13;
                    int iA2 = d4.f26366a.a(str, this.f26337d, i13, this.f26338e - i13);
                    this.f26339f = i12;
                    i((iA2 - i12) - iC2);
                    this.f26339f = iA2;
                    return;
                }
                int iA3 = d4.a(str);
                i(iA3);
                this.f26339f = d4.f26366a.a(str, this.f26337d, this.f26339f, iA3);
            } catch (b4 e10) {
                this.f26339f = i12;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new z(e11);
            }
        } catch (b4 e12) {
            a(str, e12);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(int i10, d2 d2Var) {
        c(1, 3);
        d(2, i10);
        c(3, 2);
        a(d2Var);
        c(1, 4);
    }

    public final void a(d2 d2Var) {
        int serializedSize = d2Var.getSerializedSize();
        j(5);
        i(serializedSize);
        d2Var.writeTo(this);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public final void a(byte b10) {
        if (this.f26339f == this.f26338e) {
            a();
        }
        byte[] bArr = this.f26337d;
        int i10 = this.f26339f;
        this.f26339f = i10 + 1;
        bArr[i10] = b10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k
    public final void a(byte[] bArr, int i10, int i11) throws IOException {
        b(bArr, i10, i11);
    }

    public final void a() {
        this.f26340g.write(this.f26337d, 0, this.f26339f);
        this.f26339f = 0;
    }

    public final void b(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f26338e;
        int i13 = this.f26339f;
        int i14 = i12 - i13;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, this.f26337d, i13, i11);
            this.f26339f += i11;
            return;
        }
        System.arraycopy(bArr, i10, this.f26337d, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.f26339f = this.f26338e;
        a();
        if (i16 <= this.f26338e) {
            System.arraycopy(bArr, i15, this.f26337d, 0, i16);
            this.f26339f = i16;
        } else {
            this.f26340g.write(bArr, i15, i16);
        }
    }
}
