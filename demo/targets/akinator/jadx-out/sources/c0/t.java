package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends v {

    /* renamed from: a, reason: collision with root package name */
    public float f11613a;

    /* renamed from: b, reason: collision with root package name */
    public float f11614b;

    /* renamed from: c, reason: collision with root package name */
    public float f11615c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11616d;

    public t(float f10, float f11, float f12) {
        super(null);
        this.f11613a = f10;
        this.f11614b = f11;
        this.f11615c = f12;
        this.f11616d = 3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return tVar.f11613a == this.f11613a && tVar.f11614b == this.f11614b && tVar.f11615c == this.f11615c;
    }

    @Override // c0.v
    public float get$animation_core_release(int i10) {
        if (i10 == 0) {
            return this.f11613a;
        }
        if (i10 == 1) {
            return this.f11614b;
        }
        if (i10 != 2) {
            return 0.0f;
        }
        return this.f11615c;
    }

    @Override // c0.v
    public int getSize$animation_core_release() {
        return this.f11616d;
    }

    public final float getV1() {
        return this.f11613a;
    }

    public final float getV2() {
        return this.f11614b;
    }

    public final float getV3() {
        return this.f11615c;
    }

    public int hashCode() {
        return Float.hashCode(this.f11615c) + b0.e2.b(this.f11614b, Float.hashCode(this.f11613a) * 31, 31);
    }

    @Override // c0.v
    public void reset$animation_core_release() {
        this.f11613a = 0.0f;
        this.f11614b = 0.0f;
        this.f11615c = 0.0f;
    }

    @Override // c0.v
    public void set$animation_core_release(int i10, float f10) {
        if (i10 == 0) {
            this.f11613a = f10;
        } else if (i10 == 1) {
            this.f11614b = f10;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f11615c = f10;
        }
    }

    public final void setV1$animation_core_release(float f10) {
        this.f11613a = f10;
    }

    public final void setV2$animation_core_release(float f10) {
        this.f11614b = f10;
    }

    public final void setV3$animation_core_release(float f10) {
        this.f11615c = f10;
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f11613a + ", v2 = " + this.f11614b + ", v3 = " + this.f11615c;
    }

    @Override // c0.v
    public t newVector$animation_core_release() {
        return new t(0.0f, 0.0f, 0.0f);
    }
}
