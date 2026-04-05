package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends v {

    /* renamed from: a, reason: collision with root package name */
    public float f11584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11585b;

    public r(float f10) {
        super(null);
        this.f11584a = f10;
        this.f11585b = 1;
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).f11584a == this.f11584a;
    }

    @Override // c0.v
    public float get$animation_core_release(int i10) {
        if (i10 == 0) {
            return this.f11584a;
        }
        return 0.0f;
    }

    @Override // c0.v
    public int getSize$animation_core_release() {
        return this.f11585b;
    }

    public final float getValue() {
        return this.f11584a;
    }

    public int hashCode() {
        return Float.hashCode(this.f11584a);
    }

    @Override // c0.v
    public void reset$animation_core_release() {
        this.f11584a = 0.0f;
    }

    @Override // c0.v
    public void set$animation_core_release(int i10, float f10) {
        if (i10 == 0) {
            this.f11584a = f10;
        }
    }

    public final void setValue$animation_core_release(float f10) {
        this.f11584a = f10;
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f11584a;
    }

    @Override // c0.v
    public r newVector$animation_core_release() {
        return new r(0.0f);
    }
}
