package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.inmobi.commons.core.configs.AdConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f25271a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25272b;

    /* renamed from: c, reason: collision with root package name */
    public int f25273c;

    /* renamed from: d, reason: collision with root package name */
    public int f25274d;

    public m(byte[] bArr) {
        this.f25271a = bArr;
        this.f25272b = bArr.length;
    }

    public final boolean a() {
        boolean z10 = (((this.f25271a[this.f25273c] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f25274d) & 1) == 1;
        b(1);
        return z10;
    }

    public final void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f25273c + i11;
        this.f25273c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f25274d;
        this.f25274d = i13;
        if (i13 > 7) {
            this.f25273c = i12 + 1;
            this.f25274d = i13 - 8;
        }
        int i14 = this.f25273c;
        if (i14 >= 0) {
            int i15 = this.f25272b;
            if (i14 < i15) {
                return;
            }
            if (i14 == i15 && this.f25274d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final int a(int i10) {
        int i11 = this.f25273c;
        int iMin = Math.min(i10, 8 - this.f25274d);
        int i12 = i11 + 1;
        int i13 = ((this.f25271a[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> this.f25274d) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i13 |= (this.f25271a[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << iMin;
            iMin += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }
}
