package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f83728c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final x f83729d = new x(0, 0, 3, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f83730a;

    /* renamed from: b, reason: collision with root package name */
    public final long f83731b;

    public x(long j10, long j11, kotlin.jvm.internal.u uVar) {
        this.f83730a = j10;
        this.f83731b = j11;
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ x m6092copyNB67dxo$default(x xVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = xVar.f83730a;
        }
        if ((i10 & 2) != 0) {
            j11 = xVar.f83731b;
        }
        return xVar.m6093copyNB67dxo(j10, j11);
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final x m6093copyNB67dxo(long j10, long j11) {
        return new x(j10, j11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return s2.z.m6991equalsimpl0(this.f83730a, xVar.f83730a) && s2.z.m6991equalsimpl0(this.f83731b, xVar.f83731b);
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m6094getFirstLineXSAIIZE() {
        return this.f83730a;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m6095getRestLineXSAIIZE() {
        return this.f83731b;
    }

    public int hashCode() {
        return s2.z.m6995hashCodeimpl(this.f83731b) + (s2.z.m6995hashCodeimpl(this.f83730a) * 31);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) s2.z.m7001toStringimpl(this.f83730a)) + ", restLine=" + ((Object) s2.z.m7001toStringimpl(this.f83731b)) + ')';
    }

    public /* synthetic */ x(long j10, long j11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? s2.a0.getSp(0) : j10, (i10 & 2) != 0 ? s2.a0.getSp(0) : j11, null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final x getNone() {
            return x.f83729d;
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }
}
