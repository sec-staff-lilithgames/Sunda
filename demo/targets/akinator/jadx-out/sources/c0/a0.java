package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f11391a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11392b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11393c;

    /* renamed from: d, reason: collision with root package name */
    public final float f11394d;

    public a0(float f10, float f11, float f12, float f13) {
        this.f11391a = f10;
        this.f11392b = f11;
        this.f11393c = f12;
        this.f11394d = f13;
    }

    public static float a(float f10, float f11, float f12) {
        float f13 = 3;
        float f14 = 1 - f12;
        return (f12 * f12 * f12) + (f13 * f11 * f14 * f12 * f12) + (f10 * f13 * f14 * f14 * f12);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f11391a == a0Var.f11391a && this.f11392b == a0Var.f11392b && this.f11393c == a0Var.f11393c && this.f11394d == a0Var.f11394d;
    }

    public int hashCode() {
        return Float.hashCode(this.f11394d) + b0.e2.b(this.f11393c, b0.e2.b(this.f11392b, Float.hashCode(this.f11391a) * 31, 31), 31);
    }

    @Override // c0.g0
    public float transform(float f10) {
        float f11 = 0.0f;
        if (f10 > 0.0f) {
            float f12 = 1.0f;
            if (f10 < 1.0f) {
                while (true) {
                    float f13 = (f11 + f12) / 2;
                    float fA = a(this.f11391a, this.f11393c, f13);
                    if (Math.abs(f10 - fA) < 0.001f) {
                        return a(this.f11392b, this.f11394d, f13);
                    }
                    if (fA < f10) {
                        f11 = f13;
                    } else {
                        f12 = f13;
                    }
                }
            }
        }
        return f10;
    }
}
