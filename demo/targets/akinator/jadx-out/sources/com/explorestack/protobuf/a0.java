package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a0 extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f21837e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21838f;

    /* renamed from: g, reason: collision with root package name */
    public int f21839g;

    /* renamed from: h, reason: collision with root package name */
    public int f21840h;

    public a0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i10, 20)];
        this.f21837e = bArr;
        this.f21838f = bArr.length;
    }

    public final void d(int i10) {
        int i11 = this.f21839g;
        int i12 = i11 + 1;
        this.f21839g = i12;
        byte[] bArr = this.f21837e;
        bArr[i11] = (byte) (i10 & 255);
        int i13 = i11 + 2;
        this.f21839g = i13;
        bArr[i12] = (byte) ((i10 >> 8) & 255);
        int i14 = i11 + 3;
        this.f21839g = i14;
        bArr[i13] = (byte) ((i10 >> 16) & 255);
        this.f21839g = i11 + 4;
        bArr[i14] = (byte) ((i10 >> 24) & 255);
        this.f21840h += 4;
    }

    public final void e(long j10) {
        int i10 = this.f21839g;
        int i11 = i10 + 1;
        this.f21839g = i11;
        byte[] bArr = this.f21837e;
        bArr[i10] = (byte) (j10 & 255);
        int i12 = i10 + 2;
        this.f21839g = i12;
        bArr[i11] = (byte) ((j10 >> 8) & 255);
        int i13 = i10 + 3;
        this.f21839g = i13;
        bArr[i12] = (byte) ((j10 >> 16) & 255);
        int i14 = i10 + 4;
        this.f21839g = i14;
        bArr[i13] = (byte) (255 & (j10 >> 24));
        int i15 = i10 + 5;
        this.f21839g = i15;
        bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
        int i16 = i10 + 6;
        this.f21839g = i16;
        bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
        int i17 = i10 + 7;
        this.f21839g = i17;
        bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
        this.f21839g = i10 + 8;
        bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        this.f21840h += 8;
    }

    public final void f(int i10, int i11) {
        g((i10 << 3) | i11);
    }

    public final void g(int i10) {
        boolean z10 = h0.f22185d;
        byte[] bArr = this.f21837e;
        if (!z10) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f21839g;
                this.f21839g = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                this.f21840h++;
                i10 >>>= 7;
            }
            int i12 = this.f21839g;
            this.f21839g = i12 + 1;
            bArr[i12] = (byte) i10;
            this.f21840h++;
            return;
        }
        long j10 = this.f21839g;
        while ((i10 & (-128)) != 0) {
            int i13 = this.f21839g;
            this.f21839g = i13 + 1;
            sc.n(bArr, i13, (byte) ((i10 & 127) | 128));
            i10 >>>= 7;
        }
        int i14 = this.f21839g;
        this.f21839g = i14 + 1;
        sc.n(bArr, i14, (byte) i10);
        this.f21840h += (int) (this.f21839g - j10);
    }

    @Override // com.explorestack.protobuf.h0
    public final int getTotalBytesWritten() {
        return this.f21840h;
    }

    public final void h(long j10) {
        boolean z10 = h0.f22185d;
        byte[] bArr = this.f21837e;
        if (!z10) {
            while ((j10 & (-128)) != 0) {
                int i10 = this.f21839g;
                this.f21839g = i10 + 1;
                bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                this.f21840h++;
                j10 >>>= 7;
            }
            int i11 = this.f21839g;
            this.f21839g = i11 + 1;
            bArr[i11] = (byte) j10;
            this.f21840h++;
            return;
        }
        long j11 = this.f21839g;
        while ((j10 & (-128)) != 0) {
            int i12 = this.f21839g;
            this.f21839g = i12 + 1;
            sc.n(bArr, i12, (byte) ((((int) j10) & 127) | 128));
            j10 >>>= 7;
        }
        int i13 = this.f21839g;
        this.f21839g = i13 + 1;
        sc.n(bArr, i13, (byte) j10);
        this.f21840h += (int) (this.f21839g - j11);
    }

    @Override // com.explorestack.protobuf.h0
    public final int spaceLeft() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
