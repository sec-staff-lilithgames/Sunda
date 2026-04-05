package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f56753a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f56754b;

    public f0(d0 d0Var, c0 c0Var) {
        this.f56753a = d0Var;
        this.f56754b = c0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f56754b, f0Var.f56754b) && kotlin.jvm.internal.e0.areEqual(this.f56753a, f0Var.f56753a);
    }

    public final c0 getParagraphStyle() {
        return this.f56754b;
    }

    public final d0 getSpanStyle() {
        return this.f56753a;
    }

    public int hashCode() {
        d0 d0Var = this.f56753a;
        int iHashCode = (d0Var != null ? d0Var.hashCode() : 0) * 31;
        c0 c0Var = this.f56754b;
        return iHashCode + (c0Var != null ? c0Var.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f56753a + ", paragraphSyle=" + this.f56754b + ')';
    }

    public /* synthetic */ f0(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    @tu.f
    public f0(boolean z10) {
        this(null, new c0(z10));
    }
}
