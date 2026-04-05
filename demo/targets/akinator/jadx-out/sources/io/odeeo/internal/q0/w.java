package io.odeeo.internal.q0;

import com.inmobi.commons.core.configs.AdConfig;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f65964a;

    /* renamed from: b, reason: collision with root package name */
    public int f65965b;

    /* renamed from: c, reason: collision with root package name */
    public int f65966c;

    /* renamed from: d, reason: collision with root package name */
    public int f65967d;

    public w() {
        this.f65964a = g0.f65866f;
    }

    public final void a() {
        int i10;
        int i11 = this.f65965b;
        a.checkState(i11 >= 0 && (i11 < (i10 = this.f65967d) || (i11 == i10 && this.f65966c == 0)));
    }

    public int bitsLeft() {
        return ((this.f65967d - this.f65965b) * 8) - this.f65966c;
    }

    public void byteAlign() {
        if (this.f65966c == 0) {
            return;
        }
        this.f65966c = 0;
        this.f65965b++;
        a();
    }

    public int getBytePosition() {
        a.checkState(this.f65966c == 0);
        return this.f65965b;
    }

    public int getPosition() {
        return (this.f65965b * 8) + this.f65966c;
    }

    public void putInt(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int iMin = Math.min(8 - this.f65966c, i11);
        int i12 = this.f65966c;
        int i13 = (8 - i12) - iMin;
        byte[] bArr = this.f65964a;
        int i14 = this.f65965b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - iMin;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f65964a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f65964a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        skipBits(i11);
        a();
    }

    public boolean readBit() {
        boolean z10 = (this.f65964a[this.f65965b] & (128 >> this.f65966c)) != 0;
        skipBit();
        return z10;
    }

    public int readBits(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f65966c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f65966c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f65966c = i13;
            byte[] bArr = this.f65964a;
            int i14 = this.f65965b;
            this.f65965b = i14 + 1;
            i12 |= (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13;
        }
        byte[] bArr2 = this.f65964a;
        int i15 = this.f65965b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f65966c = 0;
            this.f65965b = i15 + 1;
        }
        a();
        return i16;
    }

    public long readBitsToLong(int i10) {
        return i10 <= 32 ? g0.toUnsignedLong(readBits(i10)) : g0.toLong(readBits(i10 - 32), readBits(32));
    }

    public void readBytes(byte[] bArr, int i10, int i11) {
        a.checkState(this.f65966c == 0);
        System.arraycopy(this.f65964a, this.f65965b, bArr, i10, i11);
        this.f65965b += i11;
        a();
    }

    public String readBytesAsString(int i10) {
        return readBytesAsString(i10, io.odeeo.internal.t0.e.f66406c);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void setPosition(int i10) {
        int i11 = i10 / 8;
        this.f65965b = i11;
        this.f65966c = i10 - (i11 * 8);
        a();
    }

    public void skipBit() {
        int i10 = this.f65966c + 1;
        this.f65966c = i10;
        if (i10 == 8) {
            this.f65966c = 0;
            this.f65965b++;
        }
        a();
    }

    public void skipBits(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f65965b + i11;
        this.f65965b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f65966c;
        this.f65966c = i13;
        if (i13 > 7) {
            this.f65965b = i12 + 1;
            this.f65966c = i13 - 8;
        }
        a();
    }

    public void skipBytes(int i10) {
        a.checkState(this.f65966c == 0);
        this.f65965b += i10;
        a();
    }

    public String readBytesAsString(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        readBytes(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void reset(x xVar) {
        reset(xVar.getData(), xVar.limit());
        setPosition(xVar.getPosition() * 8);
    }

    public w(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public w(byte[] bArr, int i10) {
        this.f65964a = bArr;
        this.f65967d = i10;
    }

    public void reset(byte[] bArr, int i10) {
        this.f65964a = bArr;
        this.f65965b = 0;
        this.f65966c = 0;
        this.f65967d = i10;
    }

    public void readBits(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f65964a;
            int i13 = this.f65965b;
            int i14 = i13 + 1;
            this.f65965b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f65966c;
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
        int i17 = this.f65966c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f65964a;
            int i18 = this.f65965b;
            this.f65965b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i17));
            this.f65966c = i17 - 8;
        }
        int i19 = this.f65966c + i16;
        this.f65966c = i19;
        byte[] bArr4 = this.f65964a;
        int i20 = this.f65965b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f65966c = 0;
            this.f65965b = i20 + 1;
        }
        a();
    }
}
