package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final v3 f56561a;

    /* renamed from: b, reason: collision with root package name */
    public final v3 f56562b;

    public q0(v3 included, v3 excluded) {
        kotlin.jvm.internal.e0.checkNotNullParameter(included, "included");
        kotlin.jvm.internal.e0.checkNotNullParameter(excluded, "excluded");
        this.f56561a = included;
        this.f56562b = excluded;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.e0.areEqual(q0Var.f56561a, this.f56561a) && kotlin.jvm.internal.e0.areEqual(q0Var.f56562b, this.f56562b);
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return qv.v.coerceAtLeast(this.f56561a.getBottom(density) - this.f56562b.getBottom(density), 0);
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return qv.v.coerceAtLeast(this.f56561a.getLeft(density, layoutDirection) - this.f56562b.getLeft(density, layoutDirection), 0);
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return qv.v.coerceAtLeast(this.f56561a.getRight(density, layoutDirection) - this.f56562b.getRight(density, layoutDirection), 0);
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return qv.v.coerceAtLeast(this.f56561a.getTop(density) - this.f56562b.getTop(density), 0);
    }

    public int hashCode() {
        return this.f56562b.hashCode() + (this.f56561a.hashCode() * 31);
    }

    public String toString() {
        return "(" + this.f56561a + " - " + this.f56562b + ')';
    }
}
