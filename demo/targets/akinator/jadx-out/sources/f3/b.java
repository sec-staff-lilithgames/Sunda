package f3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends g3.v {

    /* renamed from: a, reason: collision with root package name */
    public final a3.b0 f55321a;

    /* renamed from: b, reason: collision with root package name */
    public a3.y f55322b;

    /* renamed from: c, reason: collision with root package name */
    public a3.a0 f55323c;

    public b() {
        a3.b0 b0Var = new a3.b0();
        this.f55321a = b0Var;
        this.f55323c = b0Var;
    }

    public void config(float f10, float f11, float f12, float f13, float f14, float f15) {
        a3.b0 b0Var = this.f55321a;
        this.f55323c = b0Var;
        b0Var.config(f10, f11, f12, f13, f14, f15);
    }

    public String debug(String str, float f10) {
        return this.f55323c.debug(str, f10);
    }

    @Override // g3.v, android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f55323c.getInterpolation(f10);
    }

    public float getVelocity(float f10) {
        return this.f55323c.getVelocity(f10);
    }

    public boolean isStopped() {
        return this.f55323c.isStopped();
    }

    public void springConfig(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        if (this.f55322b == null) {
            this.f55322b = new a3.y();
        }
        a3.y yVar = this.f55322b;
        this.f55323c = yVar;
        yVar.springConfig(f10, f11, f12, f13, f14, f15, f16, i10);
    }

    @Override // g3.v
    public float getVelocity() {
        return this.f55323c.getVelocity();
    }
}
