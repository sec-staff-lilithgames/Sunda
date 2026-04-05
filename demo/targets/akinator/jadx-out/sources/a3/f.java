package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: d, reason: collision with root package name */
    public final double f3972d;

    /* renamed from: e, reason: collision with root package name */
    public final double f3973e;

    /* renamed from: f, reason: collision with root package name */
    public final double f3974f;

    /* renamed from: g, reason: collision with root package name */
    public final double f3975g;

    public f(String str) {
        this.f3978a = str;
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        this.f3972d = Double.parseDouble(str.substring(iIndexOf + 1, iIndexOf2).trim());
        int i10 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf(44, i10);
        this.f3973e = Double.parseDouble(str.substring(i10, iIndexOf3).trim());
        int i11 = iIndexOf3 + 1;
        int iIndexOf4 = str.indexOf(44, i11);
        this.f3974f = Double.parseDouble(str.substring(i11, iIndexOf4).trim());
        int i12 = iIndexOf4 + 1;
        this.f3975g = Double.parseDouble(str.substring(i12, str.indexOf(41, i12)).trim());
    }

    public final double a(double d10) {
        double d11 = 1.0d - d10;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d10;
        double d14 = d12 * d10 * d10;
        return (this.f3974f * d14) + (this.f3972d * d13) + (d10 * d10 * d10);
    }

    public final double b(double d10) {
        double d11 = 1.0d - d10;
        double d12 = 3.0d * d11;
        double d13 = d11 * d12 * d10;
        double d14 = d12 * d10 * d10;
        return (this.f3975g * d14) + (this.f3973e * d13) + (d10 * d10 * d10);
    }

    @Override // a3.g
    public double get(double d10) {
        if (d10 <= 0.0d) {
            return 0.0d;
        }
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 0.01d) {
            d11 *= 0.5d;
            d12 = a(d12) < d10 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double dA = a(d13);
        double d14 = d12 + d11;
        double dA2 = a(d14);
        double dB = b(d13);
        return (((d10 - dA) * (b(d14) - dB)) / (dA2 - dA)) + dB;
    }

    @Override // a3.g
    public double getDiff(double d10) {
        double d11 = 0.5d;
        double d12 = 0.5d;
        while (d11 > 1.0E-4d) {
            d11 *= 0.5d;
            d12 = a(d12) < d10 ? d12 + d11 : d12 - d11;
        }
        double d13 = d12 - d11;
        double d14 = d12 + d11;
        return (b(d14) - b(d13)) / (a(d14) - a(d13));
    }
}
