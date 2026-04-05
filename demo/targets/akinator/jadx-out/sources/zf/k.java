package zf;

import j1.o2;
import yg.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class k extends yg.g implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public float f97951b;

    /* renamed from: c, reason: collision with root package name */
    public float f97952c;

    /* renamed from: e, reason: collision with root package name */
    public float f97953e;

    /* renamed from: f, reason: collision with root package name */
    public float f97954f;

    /* renamed from: g, reason: collision with root package name */
    public float f97955g;

    /* renamed from: h, reason: collision with root package name */
    public float f97956h = -1.0f;

    public k(float f10, float f11, float f12) {
        this.f97952c = f10;
        this.f97951b = f11;
        a(f12);
        this.f97955g = 0.0f;
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f97954f = f10;
    }

    @Override // yg.g
    public void getEdgePath(float f10, float f11, float f12, v vVar) {
        float f13;
        float f14;
        float f15 = this.f97953e;
        if (f15 == 0.0f) {
            vVar.lineTo(f10, 0.0f);
            return;
        }
        float f16 = ((this.f97952c * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f97951b;
        float f18 = f11 + this.f97955g;
        float fA = o2.a(1.0f, f12, f16, this.f97954f * f12);
        if (fA / f16 >= 1.0f) {
            vVar.lineTo(f10, 0.0f);
            return;
        }
        float f19 = this.f97956h;
        float f20 = f19 * f12;
        boolean z10 = f19 == -1.0f || Math.abs((f19 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = fA;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f21 = f16 + f17;
        float f22 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f21 * f21) - (f22 * f22));
        float f23 = f18 - fSqrt;
        float f24 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f22));
        float f25 = (90.0f - degrees) + f14;
        vVar.lineTo(f23, 0.0f);
        float f26 = f23 - f17;
        float f27 = f23 + f17;
        float f28 = f17 * 2.0f;
        vVar.addArc(f26, 0.0f, f27, f28, 270.0f, degrees);
        if (z10) {
            vVar.addArc(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f25, (f25 * 2.0f) - 180.0f);
        } else {
            float f29 = this.f97952c;
            float f30 = f20 * 2.0f;
            float f31 = f29 + f30;
            float f32 = f18 - f16;
            vVar.addArc(f32, -(f20 + f29), f31 + f32, f29 + f20, 180.0f - f25, ((f25 * 2.0f) - 180.0f) / 2.0f);
            float f33 = f18 + f16;
            float f34 = this.f97952c;
            vVar.lineTo(f33 - ((f34 / 2.0f) + f20), f34 + f20);
            float f35 = this.f97952c;
            vVar.addArc(f33 - (f30 + f35), -(f20 + f35), f33, f35 + f20, 90.0f, f25 - 90.0f);
        }
        vVar.addArc(f24 - f17, 0.0f, f24 + f17, f28, 270.0f - degrees, degrees);
        vVar.lineTo(f10, 0.0f);
    }

    public float getFabCornerRadius() {
        return this.f97956h;
    }

    public float getFabDiameter() {
        return this.f97953e;
    }

    public float getHorizontalOffset() {
        return this.f97955g;
    }

    public void setFabCornerSize(float f10) {
        this.f97956h = f10;
    }

    public void setFabDiameter(float f10) {
        this.f97953e = f10;
    }
}
