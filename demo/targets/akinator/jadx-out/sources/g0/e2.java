package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f56401a;

    /* renamed from: b, reason: collision with root package name */
    public final int f56402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56403c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56404d;

    public e2(int i10, int i11, int i12, int i13) {
        this.f56401a = i10;
        this.f56402b = i11;
        this.f56403c = i12;
        this.f56404d = i13;
    }

    public static /* synthetic */ e2 copy$default(e2 e2Var, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = e2Var.f56401a;
        }
        if ((i14 & 2) != 0) {
            i11 = e2Var.f56402b;
        }
        if ((i14 & 4) != 0) {
            i12 = e2Var.f56403c;
        }
        if ((i14 & 8) != 0) {
            i13 = e2Var.f56404d;
        }
        return e2Var.copy(i10, i11, i12, i13);
    }

    public final int component1() {
        return this.f56401a;
    }

    public final int component2() {
        return this.f56402b;
    }

    public final int component3() {
        return this.f56403c;
    }

    public final int component4() {
        return this.f56404d;
    }

    public final e2 copy(int i10, int i11, int i12, int i13) {
        return new e2(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return this.f56401a == e2Var.f56401a && this.f56402b == e2Var.f56402b && this.f56403c == e2Var.f56403c && this.f56404d == e2Var.f56404d;
    }

    public final int getCrossAxisMax() {
        return this.f56404d;
    }

    public final int getCrossAxisMin() {
        return this.f56403c;
    }

    public final int getMainAxisMax() {
        return this.f56402b;
    }

    public final int getMainAxisMin() {
        return this.f56401a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f56404d) + e3.g.d(this.f56403c, e3.g.d(this.f56402b, Integer.hashCode(this.f56401a) * 31, 31), 31);
    }

    public final int maxHeight(b2 orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        return orientation == b2.f56364b ? this.f56404d : this.f56402b;
    }

    public final int maxWidth(b2 orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        return orientation == b2.f56364b ? this.f56402b : this.f56404d;
    }

    public final e2 stretchCrossAxis() {
        int i10 = this.f56404d;
        return new e2(this.f56401a, this.f56402b, i10 != Integer.MAX_VALUE ? i10 : this.f56403c, i10);
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public final long m3869toBoxConstraintsOenEA2s(b2 orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        b2 b2Var = b2.f56364b;
        int i10 = this.f56404d;
        int i11 = this.f56403c;
        int i12 = this.f56402b;
        int i13 = this.f56401a;
        return orientation == b2Var ? s2.d.Constraints(i13, i12, i11, i10) : s2.d.Constraints(i11, i10, i13, i12);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrientationIndependentConstraints(mainAxisMin=");
        sb2.append(this.f56401a);
        sb2.append(", mainAxisMax=");
        sb2.append(this.f56402b);
        sb2.append(", crossAxisMin=");
        sb2.append(this.f56403c);
        sb2.append(", crossAxisMax=");
        return e3.g.m(sb2, this.f56404d, ')');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e2(long j10, b2 b2Var, kotlin.jvm.internal.u uVar) {
        b2 b2Var2 = b2.f56364b;
        this(b2Var == b2Var2 ? s2.c.m6757getMinWidthimpl(j10) : s2.c.m6756getMinHeightimpl(j10), b2Var == b2Var2 ? s2.c.m6755getMaxWidthimpl(j10) : s2.c.m6754getMaxHeightimpl(j10), b2Var == b2Var2 ? s2.c.m6756getMinHeightimpl(j10) : s2.c.m6757getMinWidthimpl(j10), b2Var == b2Var2 ? s2.c.m6754getMaxHeightimpl(j10) : s2.c.m6755getMaxWidthimpl(j10));
    }
}
