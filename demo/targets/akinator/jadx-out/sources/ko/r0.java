package ko;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int f71746a;

    /* renamed from: b, reason: collision with root package name */
    public String f71747b;

    /* renamed from: c, reason: collision with root package name */
    public int f71748c;

    /* renamed from: d, reason: collision with root package name */
    public int f71749d;

    /* renamed from: e, reason: collision with root package name */
    public int f71750e;

    /* renamed from: f, reason: collision with root package name */
    public int f71751f;

    /* renamed from: g, reason: collision with root package name */
    public int f71752g;

    public r0() {
    }

    public boolean setForHeaderData(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.f71746a = i11;
        this.f71747b = s0.f71760a[3 - i12];
        int i15 = s0.f71761b[i14];
        this.f71749d = i15;
        if (i11 == 2) {
            this.f71749d = i15 / 2;
        } else if (i11 == 0) {
            this.f71749d = i15 / 4;
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
        this.f71752g = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? s0.f71762c[i13 - 1] : s0.f71763d[i13 - 1];
            this.f71751f = i18;
            this.f71748c = (((i18 * 12) / this.f71749d) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? s0.f71764e[i13 - 1] : s0.f71765f[i13 - 1];
                this.f71751f = i19;
                this.f71748c = ((i19 * 144) / this.f71749d) + i16;
            } else {
                int i20 = s0.f71766g[i13 - 1];
                this.f71751f = i20;
                this.f71748c = (((i12 == 1 ? 72 : 144) * i20) / this.f71749d) + i16;
            }
        }
        this.f71750e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public r0(r0 r0Var) {
        this.f71746a = r0Var.f71746a;
        this.f71747b = r0Var.f71747b;
        this.f71748c = r0Var.f71748c;
        this.f71749d = r0Var.f71749d;
        this.f71750e = r0Var.f71750e;
        this.f71751f = r0Var.f71751f;
        this.f71752g = r0Var.f71752g;
    }
}
