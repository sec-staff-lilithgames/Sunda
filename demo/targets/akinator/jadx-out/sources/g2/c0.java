package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f56737b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f56738c = new c0();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56739a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final c0 getDefault() {
            return c0.f56738c;
        }
    }

    @tu.f
    public c0(boolean z10) {
        this.f56739a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return this.f56739a == ((c0) obj).f56739a;
        }
        return false;
    }

    public final boolean getIncludeFontPadding() {
        return this.f56739a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f56739a);
    }

    public final c0 merge(c0 c0Var) {
        return c0Var == null ? this : c0Var;
    }

    public String toString() {
        return a.b.p(new StringBuilder("PlatformParagraphStyle(includeFontPadding="), this.f56739a, ')');
    }

    public /* synthetic */ c0(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }

    public c0() {
        this(true);
    }

    @tu.f
    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }
}
