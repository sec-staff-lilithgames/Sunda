package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final d2 f8521a;

    /* renamed from: b, reason: collision with root package name */
    public final m2 f8522b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f8523c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f8524d;

    public u2() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ u2 copy$default(u2 u2Var, d2 d2Var, m2 m2Var, i0 i0Var, i2 i2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = u2Var.f8521a;
        }
        if ((i10 & 2) != 0) {
            m2Var = u2Var.f8522b;
        }
        if ((i10 & 4) != 0) {
            i0Var = u2Var.f8523c;
        }
        if ((i10 & 8) != 0) {
            i2Var = u2Var.f8524d;
        }
        return u2Var.copy(d2Var, m2Var, i0Var, i2Var);
    }

    public final d2 component1() {
        return this.f8521a;
    }

    public final m2 component2() {
        return this.f8522b;
    }

    public final i0 component3() {
        return this.f8523c;
    }

    public final i2 component4() {
        return this.f8524d;
    }

    public final u2 copy(d2 d2Var, m2 m2Var, i0 i0Var, i2 i2Var) {
        return new u2(d2Var, m2Var, i0Var, i2Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f8521a, u2Var.f8521a) && kotlin.jvm.internal.e0.areEqual(this.f8522b, u2Var.f8522b) && kotlin.jvm.internal.e0.areEqual(this.f8523c, u2Var.f8523c) && kotlin.jvm.internal.e0.areEqual(this.f8524d, u2Var.f8524d);
    }

    public final i0 getChangeSize() {
        return this.f8523c;
    }

    public final d2 getFade() {
        return this.f8521a;
    }

    public final i2 getScale() {
        return this.f8524d;
    }

    public final m2 getSlide() {
        return this.f8522b;
    }

    public int hashCode() {
        d2 d2Var = this.f8521a;
        int iHashCode = (d2Var == null ? 0 : d2Var.hashCode()) * 31;
        m2 m2Var = this.f8522b;
        int iHashCode2 = (iHashCode + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        i0 i0Var = this.f8523c;
        int iHashCode3 = (iHashCode2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        i2 i2Var = this.f8524d;
        return iHashCode3 + (i2Var != null ? i2Var.hashCode() : 0);
    }

    public String toString() {
        return "TransitionData(fade=" + this.f8521a + ", slide=" + this.f8522b + ", changeSize=" + this.f8523c + ", scale=" + this.f8524d + ')';
    }

    public u2(d2 d2Var, m2 m2Var, i0 i0Var, i2 i2Var) {
        this.f8521a = d2Var;
        this.f8522b = m2Var;
        this.f8523c = i0Var;
        this.f8524d = i2Var;
    }

    public /* synthetic */ u2(d2 d2Var, m2 m2Var, i0 i0Var, i2 i2Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : d2Var, (i10 & 2) != 0 ? null : m2Var, (i10 & 4) != 0 ? null : i0Var, (i10 & 8) != 0 ? null : i2Var);
    }
}
