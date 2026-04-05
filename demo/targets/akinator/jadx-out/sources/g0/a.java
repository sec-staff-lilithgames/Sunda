package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final v3 f56328a;

    /* renamed from: b, reason: collision with root package name */
    public final v3 f56329b;

    public a(v3 first, v3 second) {
        kotlin.jvm.internal.e0.checkNotNullParameter(first, "first");
        kotlin.jvm.internal.e0.checkNotNullParameter(second, "second");
        this.f56328a = first;
        this.f56329b = second;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.e0.areEqual(aVar.f56328a, this.f56328a) && kotlin.jvm.internal.e0.areEqual(aVar.f56329b, this.f56329b);
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return this.f56329b.getBottom(density) + this.f56328a.getBottom(density);
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f56329b.getLeft(density, layoutDirection) + this.f56328a.getLeft(density, layoutDirection);
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f56329b.getRight(density, layoutDirection) + this.f56328a.getRight(density, layoutDirection);
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return this.f56329b.getTop(density) + this.f56328a.getTop(density);
    }

    public int hashCode() {
        return (this.f56329b.hashCode() * 31) + this.f56328a.hashCode();
    }

    public String toString() {
        return "(" + this.f56328a + " + " + this.f56329b + ')';
    }
}
