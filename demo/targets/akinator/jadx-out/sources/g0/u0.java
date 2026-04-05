package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f56597a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56598b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56599c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56600d;

    public u0(int i10, int i11, int i12, int i13) {
        this.f56597a = i10;
        this.f56598b = i11;
        this.f56599c = i12;
        this.f56600d = i13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f56597a == u0Var.f56597a && this.f56598b == u0Var.f56598b && this.f56599c == u0Var.f56599c && this.f56600d == u0Var.f56600d;
    }

    @Override // g0.v3
    public int getBottom(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return this.f56600d;
    }

    @Override // g0.v3
    public int getLeft(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f56597a;
    }

    @Override // g0.v3
    public int getRight(s2.e density, s2.x layoutDirection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        return this.f56599c;
    }

    @Override // g0.v3
    public int getTop(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return this.f56598b;
    }

    public int hashCode() {
        return (((((this.f56597a * 31) + this.f56598b) * 31) + this.f56599c) * 31) + this.f56600d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Insets(left=");
        sb2.append(this.f56597a);
        sb2.append(", top=");
        sb2.append(this.f56598b);
        sb2.append(", right=");
        sb2.append(this.f56599c);
        sb2.append(", bottom=");
        return e3.g.m(sb2, this.f56600d, ')');
    }
}
