package ee;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f54249a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54250b;

    /* renamed from: c, reason: collision with root package name */
    public int f54251c;

    /* renamed from: d, reason: collision with root package name */
    public int f54252d;

    public n0(byte[] bArr) {
        this.f54249a = bArr;
        this.f54250b = bArr.length;
    }

    public int bitsLeft() {
        return ((this.f54250b - this.f54251c) * 8) - this.f54252d;
    }

    public int getPosition() {
        return (this.f54251c * 8) + this.f54252d;
    }

    public boolean readBit() {
        boolean z10 = (((this.f54249a[this.f54251c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f54252d) & 1) == 1;
        skipBits(1);
        return z10;
    }

    public int readBits(int i10) {
        int i11 = this.f54251c;
        int iMin = Math.min(i10, 8 - this.f54252d);
        int i12 = i11 + 1;
        byte[] bArr = this.f54249a;
        int i13 = ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f54252d) & (255 >> (8 - iMin));
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
        this.f54251c = 0;
        this.f54252d = 0;
    }

    public void setPosition(int i10) {
        int i11;
        int i12 = i10 / 8;
        this.f54251c = i12;
        int i13 = i10 - (i12 * 8);
        this.f54252d = i13;
        com.google.android.exoplayer2.util.a.checkState(i12 >= 0 && (i12 < (i11 = this.f54250b) || (i12 == i11 && i13 == 0)));
    }

    public void skipBits(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f54251c + i12;
        this.f54251c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f54252d;
        this.f54252d = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f54251c = i13 + 1;
            this.f54252d = i14 - 8;
        }
        int i15 = this.f54251c;
        if (i15 < 0 || (i15 >= (i11 = this.f54250b) && (i15 != i11 || this.f54252d != 0))) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.checkState(z10);
    }
}
