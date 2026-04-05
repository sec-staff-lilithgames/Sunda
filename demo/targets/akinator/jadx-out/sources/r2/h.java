package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final a f83689c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final h f83690d = new h(g.f83684b.m6044getProportionalPIaL0Z0(), j.f83693b.m6054getBothEVpEnUU(), null);

    /* renamed from: a, reason: collision with root package name */
    public final int f83691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83692b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final h getDefault() {
            return h.f83690d;
        }
    }

    public h(int i10, int i11, kotlin.jvm.internal.u uVar) {
        this.f83691a = i10;
        this.f83692b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g.m6048equalsimpl0(this.f83691a, hVar.f83691a) && j.m6060equalsimpl0(this.f83692b, hVar.f83692b);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final int m6052getAlignmentPIaL0Z0() {
        return this.f83691a;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m6053getTrimEVpEnUU() {
        return this.f83692b;
    }

    public int hashCode() {
        return j.m6061hashCodeimpl(this.f83692b) + (g.m6049hashCodeimpl(this.f83691a) * 31);
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) g.m6050toStringimpl(this.f83691a)) + ", trim=" + ((Object) j.m6064toStringimpl(this.f83692b)) + ')';
    }
}
