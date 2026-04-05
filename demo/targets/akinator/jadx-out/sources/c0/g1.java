package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public float f11463a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11465c;

    /* renamed from: d, reason: collision with root package name */
    public double f11466d;

    /* renamed from: e, reason: collision with root package name */
    public double f11467e;

    /* renamed from: f, reason: collision with root package name */
    public double f11468f;

    /* renamed from: b, reason: collision with root package name */
    public double f11464b = Math.sqrt(50.0d);

    /* renamed from: g, reason: collision with root package name */
    public float f11469g = 1.0f;

    public g1(float f10) {
        this.f11463a = f10;
    }

    public final float getAcceleration(float f10, float f11) {
        float f12 = f10 - this.f11463a;
        double d10 = this.f11464b;
        return (float) (((-(d10 * d10)) * f12) - (((d10 * 2.0d) * this.f11469g) * f11));
    }

    public final float getDampingRatio() {
        return this.f11469g;
    }

    public final float getFinalPosition() {
        return this.f11463a;
    }

    public final float getStiffness() {
        double d10 = this.f11464b;
        return (float) (d10 * d10);
    }

    public final void setDampingRatio(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f11469g = f10;
        this.f11465c = false;
    }

    public final void setFinalPosition(float f10) {
        this.f11463a = f10;
    }

    public final void setStiffness(float f10) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f11464b = Math.sqrt(f10);
        this.f11465c = false;
    }

    /* renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m157updateValuesIJZedt4$animation_core_release(float f10, float f11, long j10) {
        double dCos;
        double dExp;
        if (!this.f11465c) {
            if (this.f11463a == h1.getUNSET()) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f12 = this.f11469g;
            double d10 = f12;
            double d11 = d10 * d10;
            if (f12 > 1.0f) {
                double d12 = this.f11464b;
                double d13 = d11 - 1;
                this.f11466d = (Math.sqrt(d13) * d12) + ((-f12) * d12);
                double d14 = -this.f11469g;
                double d15 = this.f11464b;
                this.f11467e = (d14 * d15) - (Math.sqrt(d13) * d15);
            } else if (f12 >= 0.0f && f12 < 1.0f) {
                this.f11468f = Math.sqrt(1 - d11) * this.f11464b;
            }
            this.f11465c = true;
        }
        float f13 = f10 - this.f11463a;
        double d16 = j10 / 1000.0d;
        float f14 = this.f11469g;
        if (f14 > 1.0f) {
            double d17 = f13;
            double d18 = this.f11467e;
            double d19 = ((d18 * d17) - f11) / (d18 - this.f11466d);
            double d20 = d17 - d19;
            dExp = (Math.exp(this.f11466d * d16) * d19) + (Math.exp(d18 * d16) * d20);
            double d21 = this.f11467e;
            double dExp2 = Math.exp(d21 * d16) * d20 * d21;
            double d22 = this.f11466d;
            dCos = (Math.exp(d22 * d16) * d19 * d22) + dExp2;
        } else if (f14 == 1.0f) {
            double d23 = this.f11464b;
            double d24 = f13;
            double d25 = (d23 * d24) + f11;
            double d26 = (d25 * d16) + d24;
            dExp = Math.exp((-d23) * d16) * d26;
            double dExp3 = Math.exp((-this.f11464b) * d16) * d26;
            double d27 = -this.f11464b;
            dCos = (dExp3 * d27) + (Math.exp(d27 * d16) * d25);
        } else {
            double d28 = 1 / this.f11468f;
            double d29 = this.f11464b;
            double d30 = f13;
            double d31 = ((f14 * d29 * d30) + f11) * d28;
            double dExp4 = Math.exp((-f14) * d29 * d16) * ((Math.sin(this.f11468f * d16) * d31) + (Math.cos(this.f11468f * d16) * d30));
            double d32 = this.f11464b;
            double d33 = (-d32) * dExp4 * this.f11469g;
            double dExp5 = Math.exp((-r7) * d32 * d16);
            double d34 = this.f11468f;
            double dSin = Math.sin(d34 * d16) * (-d34) * d30;
            double d35 = this.f11468f;
            dCos = (((Math.cos(d35 * d16) * d31 * d35) + dSin) * dExp5) + d33;
            dExp = dExp4;
        }
        return h1.Motion((float) (dExp + this.f11463a), (float) dCos);
    }
}
