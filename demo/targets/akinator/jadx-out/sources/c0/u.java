package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends v {

    /* renamed from: a, reason: collision with root package name */
    public float f11627a;

    /* renamed from: b, reason: collision with root package name */
    public float f11628b;

    /* renamed from: c, reason: collision with root package name */
    public float f11629c;

    /* renamed from: d, reason: collision with root package name */
    public float f11630d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11631e;

    public u(float f10, float f11, float f12, float f13) {
        super(null);
        this.f11627a = f10;
        this.f11628b = f11;
        this.f11629c = f12;
        this.f11630d = f13;
        this.f11631e = 4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return uVar.f11627a == this.f11627a && uVar.f11628b == this.f11628b && uVar.f11629c == this.f11629c && uVar.f11630d == this.f11630d;
    }

    @Override // c0.v
    public float get$animation_core_release(int i10) {
        if (i10 == 0) {
            return this.f11627a;
        }
        if (i10 == 1) {
            return this.f11628b;
        }
        if (i10 == 2) {
            return this.f11629c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f11630d;
    }

    @Override // c0.v
    public int getSize$animation_core_release() {
        return this.f11631e;
    }

    public final float getV1() {
        return this.f11627a;
    }

    public final float getV2() {
        return this.f11628b;
    }

    public final float getV3() {
        return this.f11629c;
    }

    public final float getV4() {
        return this.f11630d;
    }

    public int hashCode() {
        return Float.hashCode(this.f11630d) + b0.e2.b(this.f11629c, b0.e2.b(this.f11628b, Float.hashCode(this.f11627a) * 31, 31), 31);
    }

    @Override // c0.v
    public void reset$animation_core_release() {
        this.f11627a = 0.0f;
        this.f11628b = 0.0f;
        this.f11629c = 0.0f;
        this.f11630d = 0.0f;
    }

    @Override // c0.v
    public void set$animation_core_release(int i10, float f10) {
        if (i10 == 0) {
            this.f11627a = f10;
            return;
        }
        if (i10 == 1) {
            this.f11628b = f10;
        } else if (i10 == 2) {
            this.f11629c = f10;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f11630d = f10;
        }
    }

    public final void setV1$animation_core_release(float f10) {
        this.f11627a = f10;
    }

    public final void setV2$animation_core_release(float f10) {
        this.f11628b = f10;
    }

    public final void setV3$animation_core_release(float f10) {
        this.f11629c = f10;
    }

    public final void setV4$animation_core_release(float f10) {
        this.f11630d = f10;
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f11627a + ", v2 = " + this.f11628b + ", v3 = " + this.f11629c + ", v4 = " + this.f11630d;
    }

    @Override // c0.v
    public u newVector$animation_core_release() {
        return new u(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
