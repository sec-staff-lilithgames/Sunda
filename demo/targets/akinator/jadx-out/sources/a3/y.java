package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public double f4054b;

    /* renamed from: c, reason: collision with root package name */
    public double f4055c;

    /* renamed from: d, reason: collision with root package name */
    public float f4056d;

    /* renamed from: e, reason: collision with root package name */
    public float f4057e;

    /* renamed from: f, reason: collision with root package name */
    public float f4058f;

    /* renamed from: g, reason: collision with root package name */
    public float f4059g;

    /* renamed from: h, reason: collision with root package name */
    public float f4060h;

    /* renamed from: a, reason: collision with root package name */
    public double f4053a = 0.5d;

    /* renamed from: i, reason: collision with root package name */
    public int f4061i = 0;

    @Override // a3.a0
    public String debug(String str, float f10) {
        return null;
    }

    public float getAcceleration() {
        return ((float) (((-this.f4054b) * (this.f4057e - this.f4055c)) - (this.f4053a * this.f4058f))) / this.f4059g;
    }

    @Override // a3.a0
    public float getInterpolation(float f10) {
        double d10 = f10 - this.f4056d;
        if (d10 > 0.0d) {
            double d11 = this.f4054b;
            double d12 = this.f4053a;
            int iSqrt = (int) ((9.0d / ((Math.sqrt(d11 / this.f4059g) * d10) * 4.0d)) + 1.0d);
            double d13 = d10 / iSqrt;
            int i10 = 0;
            while (i10 < iSqrt) {
                float f11 = this.f4057e;
                double d14 = f11;
                double d15 = this.f4055c;
                double d16 = d13;
                float f12 = this.f4058f;
                double d17 = f12;
                double d18 = ((-d11) * (d14 - d15)) - (d12 * d17);
                double d19 = this.f4059g;
                double d20 = (((d18 / d19) * d16) / 2.0d) + d17;
                double d21 = ((((-((((d16 * d20) / 2.0d) + d14) - d15)) * d11) - (d20 * d12)) / d19) * d16;
                float f13 = f12 + ((float) d21);
                this.f4058f = f13;
                float f14 = f11 + ((float) (((d21 / 2.0d) + d17) * d16));
                this.f4057e = f14;
                int i11 = this.f4061i;
                if (i11 > 0) {
                    if (f14 < 0.0f && (i11 & 1) == 1) {
                        this.f4057e = -f14;
                        this.f4058f = -f13;
                    }
                    float f15 = this.f4057e;
                    if (f15 > 1.0f && (i11 & 2) == 2) {
                        this.f4057e = 2.0f - f15;
                        this.f4058f = -this.f4058f;
                    }
                }
                i10++;
                d13 = d16;
            }
        }
        this.f4056d = f10;
        if (isStopped()) {
            this.f4057e = (float) this.f4055c;
        }
        return this.f4057e;
    }

    @Override // a3.a0
    public float getVelocity(float f10) {
        return this.f4058f;
    }

    @Override // a3.a0
    public boolean isStopped() {
        double d10 = this.f4057e - this.f4055c;
        double d11 = this.f4054b;
        double d12 = this.f4058f;
        return Math.sqrt((((d11 * d10) * d10) + ((d12 * d12) * ((double) this.f4059g))) / d11) <= ((double) this.f4060h);
    }

    public void springConfig(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f4055c = f11;
        this.f4053a = f15;
        this.f4057e = f10;
        this.f4054b = f14;
        this.f4059g = f13;
        this.f4060h = f16;
        this.f4061i = i10;
        this.f4056d = 0.0f;
    }

    @Override // a3.a0
    public float getVelocity() {
        return 0.0f;
    }
}
