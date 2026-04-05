package io.odeeo.internal.g;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f64190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64191b;

    /* renamed from: c, reason: collision with root package name */
    public int f64192c;

    /* renamed from: d, reason: collision with root package name */
    public int f64193d;

    public z(byte[] bArr) {
        this.f64190a = bArr;
        this.f64191b = bArr.length;
    }

    public final void a() {
        int i10;
        int i11 = this.f64192c;
        io.odeeo.internal.q0.a.checkState(i11 >= 0 && (i11 < (i10 = this.f64191b) || (i11 == i10 && this.f64193d == 0)));
    }

    public int bitsLeft() {
        return ((this.f64191b - this.f64192c) * 8) - this.f64193d;
    }

    public int getPosition() {
        return (this.f64192c * 8) + this.f64193d;
    }

    public boolean readBit() {
        boolean z10 = (((this.f64190a[this.f64192c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f64193d) & 1) == 1;
        skipBits(1);
        return z10;
    }

    public int readBits(int i10) {
        int i11 = this.f64192c;
        int iMin = Math.min(i10, 8 - this.f64193d);
        int i12 = i11 + 1;
        int i13 = ((this.f64190a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f64193d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f64190a[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        skipBits(i10);
        return i14;
    }

    public void reset() {
        this.f64192c = 0;
        this.f64193d = 0;
    }

    public void setPosition(int i10) {
        int i11 = i10 / 8;
        this.f64192c = i11;
        this.f64193d = i10 - (i11 * 8);
        a();
    }

    public void skipBits(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f64192c + i11;
        this.f64192c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f64193d;
        this.f64193d = i13;
        if (i13 > 7) {
            this.f64192c = i12 + 1;
            this.f64193d = i13 - 8;
        }
        a();
    }
}
