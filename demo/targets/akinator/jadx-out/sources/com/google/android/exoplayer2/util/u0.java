package com.google.android.exoplayer2.util;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f28575a;

    /* renamed from: b, reason: collision with root package name */
    public int f28576b;

    /* renamed from: c, reason: collision with root package name */
    public int f28577c;

    /* renamed from: d, reason: collision with root package name */
    public int f28578d;

    public u0() {
        this.f28575a = n1.f28511f;
    }

    public final void a() {
        int i10;
        int i11 = this.f28576b;
        a.checkState(i11 >= 0 && (i11 < (i10 = this.f28578d) || (i11 == i10 && this.f28577c == 0)));
    }

    public int bitsLeft() {
        return ((this.f28578d - this.f28576b) * 8) - this.f28577c;
    }

    public void byteAlign() {
        if (this.f28577c == 0) {
            return;
        }
        this.f28577c = 0;
        this.f28576b++;
        a();
    }

    public int getBytePosition() {
        a.checkState(this.f28577c == 0);
        return this.f28576b;
    }

    public int getPosition() {
        return (this.f28576b * 8) + this.f28577c;
    }

    public void putInt(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f28577c, i11);
        int i12 = this.f28577c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f28575a;
        int i14 = this.f28576b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f28575a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f28575a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        skipBits(i11);
        a();
    }

    public boolean readBit() {
        boolean z10 = (this.f28575a[this.f28576b] & (128 >> this.f28577c)) != 0;
        skipBit();
        return z10;
    }

    public int readBits(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f28577c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f28577c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f28577c = i13;
            byte[] bArr = this.f28575a;
            int i14 = this.f28576b;
            this.f28576b = i14 + 1;
            i12 |= (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13;
        }
        byte[] bArr2 = this.f28575a;
        int i15 = this.f28576b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f28577c = 0;
            this.f28576b = i15 + 1;
        }
        a();
        return i16;
    }

    public long readBitsToLong(int i10) {
        return i10 <= 32 ? n1.toUnsignedLong(readBits(i10)) : n1.toLong(readBits(i10 - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        a.checkState(this.f28577c == 0);
        System.arraycopy(this.f28575a, this.f28576b, bArr, i10, i11);
        this.f28576b += i11;
        a();
    }

    public String readBytesAsString(int i10) {
        return readBytesAsString(i10, mh.h0.f74628c);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i10) {
        int i11 = i10 / 8;
        this.f28576b = i11;
        this.f28577c = i10 - (i11 * 8);
        a();
    }

    public void skipBit() {
        int i10 = this.f28577c + 1;
        this.f28577c = i10;
        if (i10 == 8) {
            this.f28577c = 0;
            this.f28576b++;
        }
        a();
    }

    public void skipBits(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f28576b + i11;
        this.f28576b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f28577c;
        this.f28577c = i13;
        if (i13 > 7) {
            this.f28576b = i12 + 1;
            this.f28577c = i13 - 8;
        }
        a();
    }

    public void skipBytes(int i10) {
        a.checkState(this.f28577c == 0);
        this.f28576b += i10;
        a();
    }

    public String readBytesAsString(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void reset(v0 v0Var) {
        reset(v0Var.getData(), v0Var.limit());
        setPosition(v0Var.getPosition() * 8);
    }

    public u0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public u0(byte[] bArr, int i10) {
        this.f28575a = bArr;
        this.f28578d = i10;
    }

    public void reset(byte[] bArr, int i10) {
        this.f28575a = bArr;
        this.f28576b = 0;
        this.f28577c = 0;
        this.f28578d = i10;
    }

    public void readBits(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f28575a;
            int i13 = this.f28576b;
            int i14 = i13 + 1;
            this.f28576b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f28577c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f28577c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f28575a;
            int i18 = this.f28576b;
            this.f28576b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i17));
            this.f28577c = i17 - 8;
        }
        int i19 = this.f28577c + i16;
        this.f28577c = i19;
        byte[] bArr4 = this.f28575a;
        int i20 = this.f28576b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f28577c = 0;
            this.f28576b = i20 + 1;
        }
        a();
    }
}
