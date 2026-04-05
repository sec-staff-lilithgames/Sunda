package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public int f24666i;

    /* renamed from: j, reason: collision with root package name */
    public int f24667j;

    /* renamed from: k, reason: collision with root package name */
    public int f24668k;

    /* renamed from: l, reason: collision with root package name */
    public int f24669l;

    /* renamed from: q, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o f24674q;

    /* renamed from: r, reason: collision with root package name */
    public int f24675r;

    /* renamed from: a, reason: collision with root package name */
    public int f24658a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public int[] f24659b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    public long[] f24660c = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    public long[] f24663f = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    public int[] f24662e = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    public int[] f24661d = new int[1000];

    /* renamed from: g, reason: collision with root package name */
    public byte[][] f24664g = new byte[1000][];

    /* renamed from: h, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] f24665h = new com.fyber.inneractive.sdk.player.exoplayer2.o[1000];

    /* renamed from: m, reason: collision with root package name */
    public long f24670m = Long.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public long f24671n = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public boolean f24673p = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f24672o = true;

    public final synchronized void a(long j10, int i10, long j11, int i11, byte[] bArr) {
        try {
            if (this.f24672o) {
                if ((i10 & 1) == 0) {
                    return;
                } else {
                    this.f24672o = false;
                }
            }
            if (this.f24673p) {
                throw new IllegalStateException();
            }
            b(j10);
            long[] jArr = this.f24663f;
            int i12 = this.f24669l;
            jArr[i12] = j10;
            long[] jArr2 = this.f24660c;
            jArr2[i12] = j11;
            this.f24661d[i12] = i11;
            this.f24662e[i12] = i10;
            this.f24664g[i12] = bArr;
            this.f24665h[i12] = this.f24674q;
            this.f24659b[i12] = this.f24675r;
            int i13 = this.f24666i + 1;
            this.f24666i = i13;
            int i14 = this.f24658a;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                int[] iArr = new int[i15];
                long[] jArr3 = new long[i15];
                long[] jArr4 = new long[i15];
                int[] iArr2 = new int[i15];
                int[] iArr3 = new int[i15];
                byte[][] bArr2 = new byte[i15][];
                com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = new com.fyber.inneractive.sdk.player.exoplayer2.o[i15];
                int i16 = this.f24668k;
                int i17 = i14 - i16;
                System.arraycopy(jArr2, i16, jArr3, 0, i17);
                System.arraycopy(this.f24663f, this.f24668k, jArr4, 0, i17);
                System.arraycopy(this.f24662e, this.f24668k, iArr2, 0, i17);
                System.arraycopy(this.f24661d, this.f24668k, iArr3, 0, i17);
                System.arraycopy(this.f24664g, this.f24668k, bArr2, 0, i17);
                System.arraycopy(this.f24665h, this.f24668k, oVarArr, 0, i17);
                System.arraycopy(this.f24659b, this.f24668k, iArr, 0, i17);
                int i18 = this.f24668k;
                System.arraycopy(this.f24660c, 0, jArr3, i17, i18);
                System.arraycopy(this.f24663f, 0, jArr4, i17, i18);
                System.arraycopy(this.f24662e, 0, iArr2, i17, i18);
                System.arraycopy(this.f24661d, 0, iArr3, i17, i18);
                System.arraycopy(this.f24664g, 0, bArr2, i17, i18);
                System.arraycopy(this.f24665h, 0, oVarArr, i17, i18);
                System.arraycopy(this.f24659b, 0, iArr, i17, i18);
                this.f24660c = jArr3;
                this.f24663f = jArr4;
                this.f24662e = iArr2;
                this.f24661d = iArr3;
                this.f24664g = bArr2;
                this.f24665h = oVarArr;
                this.f24659b = iArr;
                this.f24668k = 0;
                int i19 = this.f24658a;
                this.f24669l = i19;
                this.f24666i = i19;
                this.f24658a = i15;
            } else {
                int i20 = i12 + 1;
                this.f24669l = i20;
                if (i20 == i14) {
                    this.f24669l = 0;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(long j10) {
        this.f24671n = Math.max(this.f24671n, j10);
    }

    public final synchronized boolean a(long j10) {
        try {
            if (this.f24670m >= j10) {
                return false;
            }
            int i10 = this.f24666i;
            while (i10 > 0 && this.f24663f[((this.f24668k + i10) - 1) % this.f24658a] >= j10) {
                i10--;
            }
            int i11 = this.f24667j;
            int i12 = this.f24666i;
            int i13 = (i11 + i12) - (i10 + i11);
            if (i13 < 0 || i13 > i12) {
                throw new IllegalArgumentException();
            }
            if (i13 != 0) {
                int i14 = i12 - i13;
                this.f24666i = i14;
                int i15 = this.f24669l;
                int i16 = this.f24658a;
                this.f24669l = e3.g.x(i15, i16, i13, i16);
                this.f24671n = Long.MIN_VALUE;
                for (int i17 = i14 - 1; i17 >= 0; i17--) {
                    int i18 = (this.f24668k + i17) % this.f24658a;
                    this.f24671n = Math.max(this.f24671n, this.f24663f[i18]);
                    if ((this.f24662e[i18] & 1) != 0) {
                        break;
                    }
                }
                long j11 = this.f24660c[this.f24669l];
            } else if (i11 != 0) {
                int i19 = this.f24669l;
                if (i19 == 0) {
                    i19 = this.f24658a;
                }
                int i20 = i19 - 1;
                long j12 = this.f24660c[i20];
                int i21 = this.f24661d[i20];
            }
            return true;
        } finally {
        }
    }
}
