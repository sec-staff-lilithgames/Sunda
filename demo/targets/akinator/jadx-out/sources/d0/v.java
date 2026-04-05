package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final float f51638a;

    /* renamed from: b, reason: collision with root package name */
    public final j1.b0 f51639b;

    public v(float f10, j1.b0 b0Var, kotlin.jvm.internal.u uVar) {
        this.f51638a = f10;
        this.f51639b = b0Var;
    }

    /* renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ v m3731copyD5KLDUw$default(v vVar, float f10, j1.b0 b0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = vVar.f51638a;
        }
        if ((i10 & 2) != 0) {
            b0Var = vVar.f51639b;
        }
        return vVar.m3732copyD5KLDUw(f10, b0Var);
    }

    /* renamed from: copy-D5KLDUw, reason: not valid java name */
    public final v m3732copyD5KLDUw(float f10, j1.b0 brush) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        return new v(f10, brush, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return s2.i.m6822equalsimpl0(this.f51638a, vVar.f51638a) && kotlin.jvm.internal.e0.areEqual(this.f51639b, vVar.f51639b);
    }

    public final j1.b0 getBrush() {
        return this.f51639b;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m3733getWidthD9Ej5fM() {
        return this.f51638a;
    }

    public int hashCode() {
        return this.f51639b.hashCode() + (s2.i.m6823hashCodeimpl(this.f51638a) * 31);
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) s2.i.m6828toStringimpl(this.f51638a)) + ", brush=" + this.f51639b + ')';
    }
}
