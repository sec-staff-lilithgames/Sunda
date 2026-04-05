package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public float f56568a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f56569b;

    /* renamed from: c, reason: collision with root package name */
    public l0 f56570c;

    public r2() {
        this(0.0f, false, null, 7, null);
    }

    public static /* synthetic */ r2 copy$default(r2 r2Var, float f10, boolean z10, l0 l0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = r2Var.f56568a;
        }
        if ((i10 & 2) != 0) {
            z10 = r2Var.f56569b;
        }
        if ((i10 & 4) != 0) {
            l0Var = r2Var.f56570c;
        }
        return r2Var.copy(f10, z10, l0Var);
    }

    public final float component1() {
        return this.f56568a;
    }

    public final boolean component2() {
        return this.f56569b;
    }

    public final l0 component3() {
        return this.f56570c;
    }

    public final r2 copy(float f10, boolean z10, l0 l0Var) {
        return new r2(f10, z10, l0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return kotlin.jvm.internal.e0.areEqual((Object) Float.valueOf(this.f56568a), (Object) Float.valueOf(r2Var.f56568a)) && this.f56569b == r2Var.f56569b && kotlin.jvm.internal.e0.areEqual(this.f56570c, r2Var.f56570c);
    }

    public final l0 getCrossAxisAlignment() {
        return this.f56570c;
    }

    public final boolean getFill() {
        return this.f56569b;
    }

    public final float getWeight() {
        return this.f56568a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = Float.hashCode(this.f56568a) * 31;
        boolean z10 = this.f56569b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        l0 l0Var = this.f56570c;
        return i11 + (l0Var == null ? 0 : l0Var.hashCode());
    }

    public final void setCrossAxisAlignment(l0 l0Var) {
        this.f56570c = l0Var;
    }

    public final void setFill(boolean z10) {
        this.f56569b = z10;
    }

    public final void setWeight(float f10) {
        this.f56568a = f10;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f56568a + ", fill=" + this.f56569b + ", crossAxisAlignment=" + this.f56570c + ')';
    }

    public r2(float f10, boolean z10, l0 l0Var) {
        this.f56568a = f10;
        this.f56569b = z10;
        this.f56570c = l0Var;
    }

    public /* synthetic */ r2(float f10, boolean z10, l0 l0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : l0Var);
    }
}
