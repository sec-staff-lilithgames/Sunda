package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o3 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final v3 f56546a;

    /* renamed from: b, reason: collision with root package name */
    public final v3 f56547b;

    public o3(v3 first, v3 second) {
        kotlin.jvm.internal.e0.checkNotNullParameter(first, "first");
        kotlin.jvm.internal.e0.checkNotNullParameter(second, "second");
        this.f56546a = first;
        this.f56547b = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return kotlin.jvm.internal.e0.areEqual(o3Var.f56546a, this.f56546a) && kotlin.jvm.internal.e0.areEqual(o3Var.f56547b, this.f56547b);
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return Math.max(this.f56546a.getBottom(density), this.f56547b.getBottom(density));
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f56546a.getLeft(density, layoutDirection), this.f56547b.getLeft(density, layoutDirection));
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return Math.max(this.f56546a.getRight(density, layoutDirection), this.f56547b.getRight(density, layoutDirection));
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return Math.max(this.f56546a.getTop(density), this.f56547b.getTop(density));
    }

    public int hashCode() {
        return (this.f56547b.hashCode() * 31) + this.f56546a.hashCode();
    }

    public String toString() {
        return "(" + this.f56546a + " ∪ " + this.f56547b + ')';
    }
}
