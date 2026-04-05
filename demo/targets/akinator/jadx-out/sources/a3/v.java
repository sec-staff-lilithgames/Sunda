package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v extends g {

    /* renamed from: d, reason: collision with root package name */
    public double f4041d;

    /* renamed from: e, reason: collision with root package name */
    public double f4042e;

    @Override // a3.g
    public double get(double d10) {
        double d11 = this.f4041d;
        double d12 = this.f4042e;
        if (d10 < d12) {
            return (d12 * d10) / (((d12 - d10) * d11) + d10);
        }
        return ((d10 - 1.0d) * (1.0d - d12)) / ((1.0d - d10) - ((d12 - d10) * d11));
    }

    @Override // a3.g
    public double getDiff(double d10) {
        double d11 = this.f4041d;
        double d12 = this.f4042e;
        if (d10 < d12) {
            double d13 = d11 * d12 * d12;
            double d14 = ((d12 - d10) * d11) + d10;
            return d13 / (d14 * d14);
        }
        double d15 = d12 - 1.0d;
        double d16 = (((d12 - d10) * (-d11)) - d10) + 1.0d;
        return ((d15 * d11) * d15) / (d16 * d16);
    }
}
