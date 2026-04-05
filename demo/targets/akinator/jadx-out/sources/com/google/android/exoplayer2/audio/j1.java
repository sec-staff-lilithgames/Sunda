package com.google.android.exoplayer2.audio;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public int f27145a;

    /* renamed from: b, reason: collision with root package name */
    public String f27146b;

    /* renamed from: c, reason: collision with root package name */
    public int f27147c;

    /* renamed from: d, reason: collision with root package name */
    public int f27148d;

    /* renamed from: e, reason: collision with root package name */
    public int f27149e;

    /* renamed from: f, reason: collision with root package name */
    public int f27150f;

    /* renamed from: g, reason: collision with root package name */
    public int f27151g;

    public boolean setForHeaderData(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f27145a = i11;
        this.f27146b = k1.f27190a[3 - i12];
        int i15 = k1.f27191b[i14];
        this.f27148d = i15;
        if (i11 == 2) {
            this.f27148d = i15 / 2;
        } else if (i11 == 0) {
            this.f27148d = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f27151g = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? k1.f27192c[i13 - 1] : k1.f27193d[i13 - 1];
            this.f27150f = i18;
            this.f27147c = (((i18 * 12) / this.f27148d) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? k1.f27194e[i13 - 1] : k1.f27195f[i13 - 1];
                this.f27150f = i19;
                this.f27147c = ((i19 * 144) / this.f27148d) + i16;
            } else {
                int i20 = k1.f27196g[i13 - 1];
                this.f27150f = i20;
                this.f27147c = (((i12 == 1 ? 72 : 144) * i20) / this.f27148d) + i16;
            }
        }
        this.f27149e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
