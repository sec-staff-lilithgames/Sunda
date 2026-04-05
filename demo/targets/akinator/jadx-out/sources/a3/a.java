package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: s, reason: collision with root package name */
    public static final double[] f3906s = new double[91];

    /* renamed from: a, reason: collision with root package name */
    public double[] f3907a;

    /* renamed from: b, reason: collision with root package name */
    public double f3908b;

    /* renamed from: c, reason: collision with root package name */
    public double f3909c;

    /* renamed from: d, reason: collision with root package name */
    public double f3910d;

    /* renamed from: e, reason: collision with root package name */
    public double f3911e;

    /* renamed from: f, reason: collision with root package name */
    public double f3912f;

    /* renamed from: g, reason: collision with root package name */
    public double f3913g;

    /* renamed from: h, reason: collision with root package name */
    public double f3914h;

    /* renamed from: i, reason: collision with root package name */
    public double f3915i;

    /* renamed from: j, reason: collision with root package name */
    public double f3916j;

    /* renamed from: k, reason: collision with root package name */
    public double f3917k;

    /* renamed from: l, reason: collision with root package name */
    public double f3918l;

    /* renamed from: m, reason: collision with root package name */
    public double f3919m;

    /* renamed from: n, reason: collision with root package name */
    public double f3920n;

    /* renamed from: o, reason: collision with root package name */
    public double f3921o;

    /* renamed from: p, reason: collision with root package name */
    public double f3922p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3923q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3924r;

    public final double a() {
        double d10 = this.f3916j * this.f3922p;
        double dHypot = this.f3920n / Math.hypot(d10, (-this.f3917k) * this.f3921o);
        return this.f3923q ? (-d10) * dHypot : d10 * dHypot;
    }

    public final double b() {
        double d10 = this.f3916j * this.f3922p;
        double d11 = (-this.f3917k) * this.f3921o;
        double dHypot = this.f3920n / Math.hypot(d10, d11);
        return this.f3923q ? (-d11) * dHypot : d11 * dHypot;
    }

    public final double c() {
        return (this.f3916j * this.f3921o) + this.f3918l;
    }

    public final double d() {
        return (this.f3917k * this.f3922p) + this.f3919m;
    }

    public final void e(double d10) {
        double d11 = (this.f3923q ? this.f3910d - d10 : d10 - this.f3909c) * this.f3915i;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            d12 = 1.0d;
            if (d11 < 1.0d) {
                double[] dArr = this.f3907a;
                double length = d11 * (dArr.length - 1);
                int i10 = (int) length;
                double d13 = dArr[i10];
                d12 = ((dArr[i10 + 1] - d13) * (length - i10)) + d13;
            }
        }
        double d14 = d12 * 1.5707963267948966d;
        this.f3921o = Math.sin(d14);
        this.f3922p = Math.cos(d14);
    }

    public double getLinearDX(double d10) {
        return this.f3918l;
    }

    public double getLinearDY(double d10) {
        return this.f3919m;
    }

    public double getLinearX(double d10) {
        double d11 = (d10 - this.f3909c) * this.f3915i;
        double d12 = this.f3911e;
        return ((this.f3912f - d12) * d11) + d12;
    }

    public double getLinearY(double d10) {
        double d11 = (d10 - this.f3909c) * this.f3915i;
        double d12 = this.f3913g;
        return ((this.f3914h - d12) * d11) + d12;
    }
}
