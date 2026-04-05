package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public float f3990a;

    /* renamed from: b, reason: collision with root package name */
    public float f3991b;

    /* renamed from: c, reason: collision with root package name */
    public float f3992c;

    /* renamed from: d, reason: collision with root package name */
    public float f3993d;

    /* renamed from: e, reason: collision with root package name */
    public float f3994e;

    /* renamed from: f, reason: collision with root package name */
    public float f3995f;

    public void applyTransform(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f11 - 0.5f) * 2.0f;
        float f15 = f12 + this.f3992c;
        float f16 = f13 + this.f3993d;
        float f17 = (this.f3990a * (f10 - 0.5f) * 2.0f) + f15;
        float f18 = (this.f3991b * f14) + f16;
        float radians = (float) Math.toRadians(this.f3995f);
        float radians2 = (float) Math.toRadians(this.f3994e);
        double d10 = radians;
        double d11 = i11 * f14;
        float fSin = (((float) ((Math.sin(d10) * ((-i10) * r7)) - (Math.cos(d10) * d11))) * radians2) + f17;
        float fCos = (radians2 * ((float) ((Math.cos(d10) * (i10 * r7)) - (Math.sin(d10) * d11)))) + f18;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void clear() {
        this.f3994e = 0.0f;
        this.f3993d = 0.0f;
        this.f3992c = 0.0f;
        this.f3991b = 0.0f;
        this.f3990a = 0.0f;
    }

    public void setRotationVelocity(x xVar, float f10) {
        if (xVar != null) {
            this.f3994e = xVar.getSlope(f10);
            this.f3995f = xVar.get(f10);
        }
    }

    public void setScaleVelocity(x xVar, x xVar2, float f10) {
        if (xVar != null) {
            this.f3990a = xVar.getSlope(f10);
        }
        if (xVar2 != null) {
            this.f3991b = xVar2.getSlope(f10);
        }
    }

    public void setTranslationVelocity(x xVar, x xVar2, float f10) {
        if (xVar != null) {
            this.f3992c = xVar.getSlope(f10);
        }
        if (xVar2 != null) {
            this.f3993d = xVar2.getSlope(f10);
        }
    }

    public void setRotationVelocity(m mVar, float f10) {
        if (mVar != null) {
            this.f3994e = mVar.getSlope(f10);
        }
    }

    public void setScaleVelocity(m mVar, m mVar2, float f10) {
        if (mVar != null) {
            this.f3990a = mVar.getSlope(f10);
        }
        if (mVar2 != null) {
            this.f3991b = mVar2.getSlope(f10);
        }
    }

    public void setTranslationVelocity(m mVar, m mVar2, float f10) {
        if (mVar != null) {
            this.f3992c = mVar.getSlope(f10);
        }
        if (mVar2 != null) {
            this.f3993d = mVar2.getSlope(f10);
        }
    }
}
