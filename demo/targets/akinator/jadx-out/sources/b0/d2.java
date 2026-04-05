package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f8353a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.j0 f8354b;

    public d2(float f10, c0.j0 animationSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        this.f8353a = f10;
        this.f8354b = animationSpec;
    }

    public static /* synthetic */ d2 copy$default(d2 d2Var, float f10, c0.j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = d2Var.f8353a;
        }
        if ((i10 & 2) != 0) {
            j0Var = d2Var.f8354b;
        }
        return d2Var.copy(f10, j0Var);
    }

    public final float component1() {
        return this.f8353a;
    }

    public final c0.j0 component2() {
        return this.f8354b;
    }

    public final d2 copy(float f10, c0.j0 animationSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new d2(f10, animationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8353a), (Object) Float.valueOf(d2Var.f8353a)) && kotlin.jvm.internal.e0.areEqual(this.f8354b, d2Var.f8354b);
    }

    public final float getAlpha() {
        return this.f8353a;
    }

    public final c0.j0 getAnimationSpec() {
        return this.f8354b;
    }

    public int hashCode() {
        return this.f8354b.hashCode() + (Float.hashCode(this.f8353a) * 31);
    }

    public String toString() {
        return "Fade(alpha=" + this.f8353a + ", animationSpec=" + this.f8354b + ')';
    }
}
