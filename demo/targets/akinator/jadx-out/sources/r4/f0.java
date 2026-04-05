package r4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public double f83750a;

    /* renamed from: b, reason: collision with root package name */
    public double f83751b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83752c;

    /* renamed from: d, reason: collision with root package name */
    public double f83753d;

    /* renamed from: e, reason: collision with root package name */
    public double f83754e;

    /* renamed from: f, reason: collision with root package name */
    public double f83755f;

    /* renamed from: g, reason: collision with root package name */
    public double f83756g;

    /* renamed from: h, reason: collision with root package name */
    public double f83757h;

    /* renamed from: i, reason: collision with root package name */
    public double f83758i;

    /* renamed from: j, reason: collision with root package name */
    public final u f83759j;

    public f0() {
        this.f83750a = Math.sqrt(1500.0d);
        this.f83751b = 0.5d;
        this.f83752c = false;
        this.f83758i = Double.MAX_VALUE;
        this.f83759j = new u();
    }

    public final u a(long j10, double d10, double d11) {
        double dSin;
        double dCos;
        if (!this.f83752c) {
            if (this.f83758i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d12 = this.f83751b;
            if (d12 > 1.0d) {
                double d13 = this.f83750a;
                this.f83755f = (Math.sqrt((d12 * d12) - 1.0d) * d13) + ((-d12) * d13);
                double d14 = this.f83751b;
                double d15 = this.f83750a;
                this.f83756g = ((-d14) * d15) - (Math.sqrt((d14 * d14) - 1.0d) * d15);
            } else if (d12 >= 0.0d && d12 < 1.0d) {
                this.f83757h = Math.sqrt(1.0d - (d12 * d12)) * this.f83750a;
            }
            this.f83752c = true;
        }
        double d16 = j10 / 1000.0d;
        double d17 = d10 - this.f83758i;
        double d18 = this.f83751b;
        if (d18 > 1.0d) {
            double d19 = this.f83756g;
            double d20 = ((d19 * d17) - d11) / (d19 - this.f83755f);
            double d21 = d17 - d20;
            dSin = (Math.pow(2.718281828459045d, this.f83755f * d16) * d20) + (Math.pow(2.718281828459045d, d19 * d16) * d21);
            double d22 = this.f83756g;
            double dPow = Math.pow(2.718281828459045d, d22 * d16) * d21 * d22;
            double d23 = this.f83755f;
            dCos = (Math.pow(2.718281828459045d, d23 * d16) * d20 * d23) + dPow;
        } else if (d18 == 1.0d) {
            double d24 = this.f83750a;
            double d25 = (d24 * d17) + d11;
            double d26 = (d25 * d16) + d17;
            double dPow2 = Math.pow(2.718281828459045d, (-d24) * d16) * d26;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f83750a) * d16) * d26;
            double d27 = -this.f83750a;
            dCos = (Math.pow(2.718281828459045d, d27 * d16) * d25) + (dPow3 * d27);
            dSin = dPow2;
        } else {
            double d28 = 1.0d / this.f83757h;
            double d29 = this.f83750a;
            double d30 = ((d18 * d29 * d17) + d11) * d28;
            dSin = ((Math.sin(this.f83757h * d16) * d30) + (Math.cos(this.f83757h * d16) * d17)) * Math.pow(2.718281828459045d, (-d18) * d29 * d16);
            double d31 = this.f83750a;
            double d32 = this.f83751b;
            double d33 = (-d31) * dSin * d32;
            double dPow4 = Math.pow(2.718281828459045d, (-d32) * d31 * d16);
            double d34 = this.f83757h;
            double dSin2 = Math.sin(d34 * d16) * (-d34) * d17;
            double d35 = this.f83757h;
            dCos = (((Math.cos(d35 * d16) * d30 * d35) + dSin2) * dPow4) + d33;
        }
        float f10 = (float) (dSin + this.f83758i);
        u uVar = this.f83759j;
        uVar.f83761a = f10;
        uVar.f83762b = (float) dCos;
        return uVar;
    }

    @Override // r4.c0
    public float getAcceleration(float f10, float f11) {
        float finalPosition = f10 - getFinalPosition();
        double d10 = this.f83750a;
        return (float) (((-(d10 * d10)) * finalPosition) - (((d10 * 2.0d) * this.f83751b) * f11));
    }

    public float getDampingRatio() {
        return (float) this.f83751b;
    }

    public float getFinalPosition() {
        return (float) this.f83758i;
    }

    public float getStiffness() {
        double d10 = this.f83750a;
        return (float) (d10 * d10);
    }

    @Override // r4.c0
    public boolean isAtEquilibrium(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f83754e && ((double) Math.abs(f10 - getFinalPosition())) < this.f83753d;
    }

    public f0 setDampingRatio(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f83751b = f10;
        this.f83752c = false;
        return this;
    }

    public f0 setFinalPosition(float f10) {
        this.f83758i = f10;
        return this;
    }

    public f0 setStiffness(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f83750a = Math.sqrt(f10);
        this.f83752c = false;
        return this;
    }

    public f0(float f10) {
        this.f83750a = Math.sqrt(1500.0d);
        this.f83751b = 0.5d;
        this.f83752c = false;
        this.f83759j = new u();
        this.f83758i = f10;
    }
}
