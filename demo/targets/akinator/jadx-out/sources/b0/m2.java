package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final kv.l f8436a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.j0 f8437b;

    public m2(kv.l slideOffset, c0.j0 animationSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(slideOffset, "slideOffset");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        this.f8436a = slideOffset;
        this.f8437b = animationSpec;
    }

    public static /* synthetic */ m2 copy$default(m2 m2Var, kv.l lVar, c0.j0 j0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = m2Var.f8436a;
        }
        if ((i10 & 2) != 0) {
            j0Var = m2Var.f8437b;
        }
        return m2Var.copy(lVar, j0Var);
    }

    public final kv.l component1() {
        return this.f8436a;
    }

    public final c0.j0 component2() {
        return this.f8437b;
    }

    public final m2 copy(kv.l slideOffset, c0.j0 animationSpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(slideOffset, "slideOffset");
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new m2(slideOffset, animationSpec);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f8436a, m2Var.f8436a) && kotlin.jvm.internal.e0.areEqual(this.f8437b, m2Var.f8437b);
    }

    public final c0.j0 getAnimationSpec() {
        return this.f8437b;
    }

    public final kv.l getSlideOffset() {
        return this.f8436a;
    }

    public int hashCode() {
        return this.f8437b.hashCode() + (this.f8436a.hashCode() * 31);
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f8436a + ", animationSpec=" + this.f8437b + ')';
    }
}
