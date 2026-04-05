package a3;

import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public float f3928a;

    /* renamed from: b, reason: collision with root package name */
    public float f3929b;

    /* renamed from: c, reason: collision with root package name */
    public float f3930c;

    /* renamed from: d, reason: collision with root package name */
    public float f3931d;

    /* renamed from: e, reason: collision with root package name */
    public float f3932e;

    /* renamed from: f, reason: collision with root package name */
    public float f3933f;

    /* renamed from: g, reason: collision with root package name */
    public float f3934g;

    /* renamed from: h, reason: collision with root package name */
    public float f3935h;

    /* renamed from: i, reason: collision with root package name */
    public float f3936i;

    /* renamed from: j, reason: collision with root package name */
    public int f3937j;

    /* renamed from: k, reason: collision with root package name */
    public String f3938k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3939l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f3940m;

    /* renamed from: n, reason: collision with root package name */
    public float f3941n;

    /* renamed from: o, reason: collision with root package name */
    public float f3942o;

    public final void a(float f10, float f11, float f12, float f13, float f14) {
        this.f3936i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12);
            if (fSqrt < f13) {
                this.f3938k = "backward accelerate, decelerate";
                this.f3937j = 2;
                this.f3928a = f10;
                this.f3929b = fSqrt;
                this.f3930c = 0.0f;
                float f17 = (fSqrt - f10) / f12;
                this.f3931d = f17;
                this.f3932e = fSqrt / f12;
                this.f3934g = ((f10 + fSqrt) * f17) / 2.0f;
                this.f3935h = f11;
                this.f3936i = f11;
                return;
            }
            this.f3938k = "backward accelerate cruse decelerate";
            this.f3937j = 3;
            this.f3928a = f10;
            this.f3929b = f13;
            this.f3930c = f13;
            float f18 = (f13 - f10) / f12;
            this.f3931d = f18;
            float f19 = f13 / f12;
            this.f3933f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f3932e = ((f11 - f20) - f21) / f13;
            this.f3934g = f20;
            this.f3935h = f11 - f21;
            this.f3936i = f11;
            return;
        }
        if (f16 >= f11) {
            this.f3938k = "hard stop";
            this.f3937j = 1;
            this.f3928a = f10;
            this.f3929b = 0.0f;
            this.f3934g = f11;
            this.f3931d = (2.0f * f11) / f10;
            return;
        }
        float f22 = f11 - f16;
        float f23 = f22 / f10;
        if (f23 + f15 < f14) {
            this.f3938k = "cruse decelerate";
            this.f3937j = 2;
            this.f3928a = f10;
            this.f3929b = f10;
            this.f3930c = 0.0f;
            this.f3934g = f22;
            this.f3935h = f11;
            this.f3931d = f23;
            this.f3932e = f15;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f10 * f10) / 2.0f) + (f12 * f11));
        float f24 = (fSqrt2 - f10) / f12;
        this.f3931d = f24;
        float f25 = fSqrt2 / f12;
        this.f3932e = f25;
        if (fSqrt2 < f13) {
            this.f3938k = "accelerate decelerate";
            this.f3937j = 2;
            this.f3928a = f10;
            this.f3929b = fSqrt2;
            this.f3930c = 0.0f;
            this.f3931d = f24;
            this.f3932e = f25;
            this.f3934g = ((f10 + fSqrt2) * f24) / 2.0f;
            this.f3935h = f11;
            return;
        }
        this.f3938k = "accelerate cruse decelerate";
        this.f3937j = 3;
        this.f3928a = f10;
        this.f3929b = f13;
        this.f3930c = f13;
        float f26 = (f13 - f10) / f12;
        this.f3931d = f26;
        float f27 = f13 / f12;
        this.f3933f = f27;
        float f28 = ((f10 + f13) * f26) / 2.0f;
        float f29 = (f27 * f13) / 2.0f;
        this.f3932e = ((f11 - f28) - f29) / f13;
        this.f3934g = f28;
        this.f3935h = f11 - f29;
        this.f3936i = f11;
    }

    public void config(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f3940m = f10;
        boolean z10 = f10 > f11;
        this.f3939l = z10;
        if (z10) {
            a(-f12, f10 - f11, f14, f15, f13);
        } else {
            a(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // a3.a0
    public String debug(String str, float f10) {
        StringBuilder sbT = a.b.t(o2.o(a.b.t(str, " ===== "), this.f3938k, "\n"), str);
        sbT.append(this.f3939l ? "backwards" : "forward ");
        sbT.append(" time = ");
        sbT.append(f10);
        sbT.append("  stages ");
        String str2 = a.b.f(this.f3937j, "\n", sbT) + str + " dur " + this.f3931d + " vel " + this.f3928a + " pos " + this.f3934g + "\n";
        if (this.f3937j > 1) {
            str2 = str2 + str + " dur " + this.f3932e + " vel " + this.f3929b + " pos " + this.f3935h + "\n";
        }
        if (this.f3937j > 2) {
            str2 = str2 + str + " dur " + this.f3933f + " vel " + this.f3930c + " pos " + this.f3936i + "\n";
        }
        float f11 = this.f3931d;
        if (f10 <= f11) {
            return w0.i.d(str2, str, "stage 0\n");
        }
        int i10 = this.f3937j;
        if (i10 == 1) {
            return w0.i.d(str2, str, "end stage 0\n");
        }
        float f12 = f10 - f11;
        float f13 = this.f3932e;
        return f12 < f13 ? w0.i.d(str2, str, " stage 1\n") : i10 == 2 ? w0.i.d(str2, str, "end stage 1\n") : f12 - f13 < this.f3933f ? w0.i.d(str2, str, " stage 2\n") : w0.i.d(str2, str, " end stage 2\n");
    }

    @Override // a3.a0
    public float getInterpolation(float f10) {
        float f11;
        float f12 = this.f3931d;
        if (f10 <= f12) {
            float f13 = this.f3928a;
            f11 = ((((this.f3929b - f13) * f10) * f10) / (f12 * 2.0f)) + (f13 * f10);
        } else {
            int i10 = this.f3937j;
            if (i10 == 1) {
                f11 = this.f3934g;
            } else {
                float f14 = f10 - f12;
                float f15 = this.f3932e;
                if (f14 < f15) {
                    float f16 = this.f3934g;
                    float f17 = this.f3929b;
                    f11 = ((((this.f3930c - f17) * f14) * f14) / (f15 * 2.0f)) + (f17 * f14) + f16;
                } else if (i10 == 2) {
                    f11 = this.f3935h;
                } else {
                    float f18 = f14 - f15;
                    float f19 = this.f3933f;
                    if (f18 <= f19) {
                        float f20 = this.f3935h;
                        float f21 = this.f3930c * f18;
                        f11 = (f20 + f21) - ((f21 * f18) / (f19 * 2.0f));
                    } else {
                        f11 = this.f3936i;
                    }
                }
            }
        }
        this.f3941n = f11;
        this.f3942o = f10;
        return this.f3939l ? this.f3940m - f11 : this.f3940m + f11;
    }

    @Override // a3.a0
    public float getVelocity(float f10) {
        float f11;
        float f12;
        float f13 = this.f3931d;
        if (f10 <= f13) {
            f11 = this.f3928a;
            f12 = this.f3929b;
        } else {
            int i10 = this.f3937j;
            if (i10 == 1) {
                return 0.0f;
            }
            f10 -= f13;
            f13 = this.f3932e;
            if (f10 >= f13) {
                if (i10 == 2) {
                    return 0.0f;
                }
                float f14 = f10 - f13;
                float f15 = this.f3933f;
                if (f14 >= f15) {
                    return 0.0f;
                }
                float f16 = this.f3930c;
                return f16 - ((f14 * f16) / f15);
            }
            f11 = this.f3929b;
            f12 = this.f3930c;
        }
        return (((f12 - f11) * f10) / f13) + f11;
    }

    @Override // a3.a0
    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.f3936i - this.f3941n) < 1.0E-5f;
    }

    @Override // a3.a0
    public float getVelocity() {
        return this.f3939l ? -getVelocity(this.f3942o) : getVelocity(this.f3942o);
    }
}
