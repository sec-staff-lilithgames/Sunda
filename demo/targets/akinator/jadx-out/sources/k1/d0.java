package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f70026a;

    /* renamed from: b, reason: collision with root package name */
    public final float f70027b;

    public d0(float f10, float f11) {
        this.f70026a = f10;
        this.f70027b = f11;
    }

    public static /* synthetic */ d0 copy$default(d0 d0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = d0Var.f70026a;
        }
        if ((i10 & 2) != 0) {
            f11 = d0Var.f70027b;
        }
        return d0Var.copy(f10, f11);
    }

    public final float component1() {
        return this.f70026a;
    }

    public final float component2() {
        return this.f70027b;
    }

    public final d0 copy(float f10, float f11) {
        return new d0(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f70026a), (Object) Float.valueOf(d0Var.f70026a)) && kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f70027b), (Object) Float.valueOf(d0Var.f70027b));
    }

    public final float getX() {
        return this.f70026a;
    }

    public final float getY() {
        return this.f70027b;
    }

    public int hashCode() {
        return Float.hashCode(this.f70027b) + (Float.hashCode(this.f70026a) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WhitePoint(x=");
        sb2.append(this.f70026a);
        sb2.append(", y=");
        return a.b.n(sb2, this.f70027b, ')');
    }

    public final float[] toXyz$ui_graphics_release() {
        float f10 = this.f70026a;
        float f11 = this.f70027b;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d0(float f10, float f11, float f12) {
        float f13 = f10 + f11 + f12;
        this(f10 / f13, f11 / f13);
    }
}
