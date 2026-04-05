package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final float f8386a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8387b;

    /* renamed from: c, reason: collision with root package name */
    public final c0.j0 f8388c;

    public i2(float f10, long j10, c0.j0 j0Var, kotlin.jvm.internal.u uVar) {
        this.f8386a = f10;
        this.f8387b = j10;
        this.f8388c = j0Var;
    }

    /* renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ i2 m82copybnNdC4k$default(i2 i2Var, float f10, long j10, c0.j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = i2Var.f8386a;
        }
        if ((i10 & 2) != 0) {
            j10 = i2Var.f8387b;
        }
        if ((i10 & 4) != 0) {
            j0Var = i2Var.f8388c;
        }
        return i2Var.m84copybnNdC4k(f10, j10, j0Var);
    }

    public final float component1() {
        return this.f8386a;
    }

    /* renamed from: component2-SzJe1aQ, reason: not valid java name */
    public final long m83component2SzJe1aQ() {
        return this.f8387b;
    }

    public final c0.j0 component3() {
        return this.f8388c;
    }

    /* renamed from: copy-bnNdC4k, reason: not valid java name */
    public final i2 m84copybnNdC4k(float f10, long j10, c0.j0 animationSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new i2(f10, j10, animationSpec, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f8386a), (Object) Float.valueOf(i2Var.f8386a)) && j1.u2.m5012equalsimpl0(this.f8387b, i2Var.f8387b) && kotlin.jvm.internal.e0.areEqual(this.f8388c, i2Var.f8388c);
    }

    public final c0.j0 getAnimationSpec() {
        return this.f8388c;
    }

    public final float getScale() {
        return this.f8386a;
    }

    /* renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m85getTransformOriginSzJe1aQ() {
        return this.f8387b;
    }

    public int hashCode() {
        return this.f8388c.hashCode() + ((j1.u2.m5015hashCodeimpl(this.f8387b) + (Float.hashCode(this.f8386a) * 31)) * 31);
    }

    public String toString() {
        return "Scale(scale=" + this.f8386a + ", transformOrigin=" + ((Object) j1.u2.m5016toStringimpl(this.f8387b)) + ", animationSpec=" + this.f8388c + ')';
    }
}
