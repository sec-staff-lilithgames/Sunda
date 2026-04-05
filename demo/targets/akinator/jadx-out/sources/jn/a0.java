package jn;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f69713a;

    /* renamed from: b, reason: collision with root package name */
    public int f69714b;

    /* renamed from: c, reason: collision with root package name */
    public int f69715c;

    /* renamed from: d, reason: collision with root package name */
    public int f69716d;

    public a0(byte[] bArr, int i10, int i11) {
        reset(bArr, i10, i11);
    }

    public final void a() {
        int i10;
        int i11 = this.f69715c;
        io.bidmachine.media3.common.util.a.checkState(i11 >= 0 && (i11 < (i10 = this.f69714b) || (i11 == i10 && this.f69716d == 0)));
    }

    public final boolean b(int i10) {
        if (2 > i10 || i10 >= this.f69714b) {
            return false;
        }
        byte[] bArr = this.f69713a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 - 1] == 0;
    }

    public void byteAlign() {
        int i10 = this.f69716d;
        if (i10 > 0) {
            skipBits(8 - i10);
        }
    }

    public boolean canReadBits(int i10) {
        int i11 = this.f69715c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f69716d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f69714b) {
                break;
            }
            if (b(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f69714b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean canReadExpGolombCodedNum() {
        int i10 = this.f69715c;
        int i11 = this.f69716d;
        int i12 = 0;
        while (this.f69715c < this.f69714b && !readBit()) {
            i12++;
        }
        boolean z10 = this.f69715c == this.f69714b;
        this.f69715c = i10;
        this.f69716d = i11;
        return !z10 && canReadBits((i12 * 2) + 1);
    }

    public boolean readBit() {
        boolean z10 = (this.f69713a[this.f69715c] & (128 >> this.f69716d)) != 0;
        skipBit();
        return z10;
    }

    public int readBits(int i10) {
        int i11;
        this.f69716d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f69716d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f69716d = i13;
            byte[] bArr = this.f69713a;
            int i14 = this.f69715c;
            i12 |= (bArr[i14] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << i13;
            if (!b(i14 + 1)) {
                i = 1;
            }
            this.f69715c = i14 + i;
        }
        byte[] bArr2 = this.f69713a;
        int i15 = this.f69715c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> (8 - i11)));
        if (i11 == 8) {
            this.f69716d = 0;
            this.f69715c = i15 + (b(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public int readSignedExpGolombCodedInt() {
        int i10 = 0;
        while (!readBit()) {
            i10++;
        }
        int bits = ((1 << i10) - 1) + (i10 > 0 ? readBits(i10) : 0);
        return ((bits + 1) / 2) * (bits % 2 == 0 ? -1 : 1);
    }

    public int readUnsignedExpGolombCodedInt() {
        int i10 = 0;
        while (!readBit()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? readBits(i10) : 0);
    }

    public void reset(byte[] bArr, int i10, int i11) {
        this.f69713a = bArr;
        this.f69715c = i10;
        this.f69714b = i11;
        this.f69716d = 0;
        a();
    }

    public void skipBit() {
        int i10 = this.f69716d + 1;
        this.f69716d = i10;
        if (i10 == 8) {
            this.f69716d = 0;
            int i11 = this.f69715c;
            this.f69715c = i11 + (b(i11 + 1) ? 2 : 1);
        }
        a();
    }

    public void skipBits(int i10) {
        int i11 = this.f69715c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f69715c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f69716d;
        this.f69716d = i14;
        if (i14 > 7) {
            this.f69715c = i13 + 1;
            this.f69716d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f69715c) {
                a();
                return;
            } else if (b(i11)) {
                this.f69715c++;
                i11 += 2;
            }
        }
    }
}
