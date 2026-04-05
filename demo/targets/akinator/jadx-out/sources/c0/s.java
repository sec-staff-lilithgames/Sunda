package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends v {

    /* renamed from: a, reason: collision with root package name */
    public float f11599a;

    /* renamed from: b, reason: collision with root package name */
    public float f11600b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11601c;

    public s(float f10, float f11) {
        super(null);
        this.f11599a = f10;
        this.f11600b = f11;
        this.f11601c = 2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return sVar.f11599a == this.f11599a && sVar.f11600b == this.f11600b;
    }

    @Override // c0.v
    public float get$animation_core_release(int i10) {
        if (i10 == 0) {
            return this.f11599a;
        }
        if (i10 != 1) {
            return 0.0f;
        }
        return this.f11600b;
    }

    @Override // c0.v
    public int getSize$animation_core_release() {
        return this.f11601c;
    }

    public final float getV1() {
        return this.f11599a;
    }

    public final float getV2() {
        return this.f11600b;
    }

    public int hashCode() {
        return Float.hashCode(this.f11600b) + (Float.hashCode(this.f11599a) * 31);
    }

    @Override // c0.v
    public void reset$animation_core_release() {
        this.f11599a = 0.0f;
        this.f11600b = 0.0f;
    }

    @Override // c0.v
    public void set$animation_core_release(int i10, float f10) {
        if (i10 == 0) {
            this.f11599a = f10;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f11600b = f10;
        }
    }

    public final void setV1$animation_core_release(float f10) {
        this.f11599a = f10;
    }

    public final void setV2$animation_core_release(float f10) {
        this.f11600b = f10;
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f11599a + ", v2 = " + this.f11600b;
    }

    @Override // c0.v
    public s newVector$animation_core_release() {
        return new s(0.0f, 0.0f);
    }
}
