package g3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends v {

    /* renamed from: a, reason: collision with root package name */
    public float f56893a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f56894b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f56895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f56896d;

    public a0(i0 i0Var) {
        this.f56896d = i0Var;
    }

    public void config(float f10, float f11, float f12) {
        this.f56893a = f10;
        this.f56894b = f11;
        this.f56895c = f12;
    }

    @Override // g3.v, android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        float f11 = this.f56893a;
        i0 i0Var = this.f56896d;
        if (f11 > 0.0f) {
            float f12 = this.f56895c;
            if (f11 / f12 < f10) {
                f10 = f11 / f12;
            }
            i0Var.f56989f = f11 - (f12 * f10);
            return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f56894b;
        }
        float f13 = this.f56895c;
        if ((-f11) / f13 < f10) {
            f10 = (-f11) / f13;
        }
        i0Var.f56989f = (f13 * f10) + f11;
        return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f56894b;
    }

    @Override // g3.v
    public float getVelocity() {
        return this.f56896d.f56989f;
    }
}
