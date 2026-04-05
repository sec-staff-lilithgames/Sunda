package ko;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f71646a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71647b;

    /* renamed from: c, reason: collision with root package name */
    public int f71648c;

    /* renamed from: d, reason: collision with root package name */
    public int f71649d;

    public g1(byte[] bArr) {
        this.f71646a = bArr;
        this.f71647b = bArr.length;
    }

    public int bitsLeft() {
        return ((this.f71647b - this.f71648c) * 8) - this.f71649d;
    }

    public int getPosition() {
        return (this.f71648c * 8) + this.f71649d;
    }

    public boolean readBit() {
        boolean z10 = (((this.f71646a[this.f71648c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f71649d) & 1) == 1;
        skipBits(1);
        return z10;
    }

    public int readBits(int i10) {
        int i11 = this.f71648c;
        int iMin = Math.min(i10, 8 - this.f71649d);
        int i12 = i11 + 1;
        byte[] bArr = this.f71646a;
        int i13 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f71649d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        skipBits(i10);
        return i14;
    }

    public void reset() {
        this.f71648c = 0;
        this.f71649d = 0;
    }

    public void setPosition(int i10) {
        int i11;
        int i12 = i10 / 8;
        this.f71648c = i12;
        int i13 = i10 - (i12 * 8);
        this.f71649d = i13;
        io.bidmachine.media3.common.util.a.checkState(i12 >= 0 && (i12 < (i11 = this.f71647b) || (i12 == i11 && i13 == 0)));
    }

    public void skipBits(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f71648c + i12;
        this.f71648c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f71649d;
        this.f71649d = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f71648c = i13 + 1;
            this.f71649d = i14 - 8;
        }
        int i15 = this.f71648c;
        if (i15 < 0 || (i15 >= (i11 = this.f71647b) && (i15 != i11 || this.f71649d != 0))) {
            z10 = false;
        }
        io.bidmachine.media3.common.util.a.checkState(z10);
    }
}
