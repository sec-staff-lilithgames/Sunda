package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: d, reason: collision with root package name */
    public static final a f68857d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final d2 f68858e = new d2(0, 0, 0.0f, 7, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f68859a;

    /* renamed from: b, reason: collision with root package name */
    public final long f68860b;

    /* renamed from: c, reason: collision with root package name */
    public final float f68861c;

    public d2(long j10, long j11, float f10, kotlin.jvm.internal.u uVar) {
        this.f68859a = j10;
        this.f68860b = j11;
        this.f68861c = f10;
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ d2 m4716copyqcb84PM$default(d2 d2Var, long j10, long j11, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = d2Var.f68859a;
        }
        long j12 = j10;
        if ((i10 & 2) != 0) {
            j11 = d2Var.f68860b;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            f10 = d2Var.f68861c;
        }
        return d2Var.m4719copyqcb84PM(j12, j13, f10);
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final d2 m4719copyqcb84PM(long j10, long j11, float f10) {
        return new d2(j10, j11, f10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return m0.m4859equalsimpl0(this.f68859a, d2Var.f68859a) && i1.h.m4182equalsimpl0(this.f68860b, d2Var.f68860b) && this.f68861c == d2Var.f68861c;
    }

    public final float getBlurRadius() {
        return this.f68861c;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m4720getColor0d7_KjU() {
        return this.f68859a;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m4721getOffsetF1C5BW0() {
        return this.f68860b;
    }

    public int hashCode() {
        return Float.hashCode(this.f68861c) + ((i1.h.m4187hashCodeimpl(this.f68860b) + (m0.m4865hashCodeimpl(this.f68859a) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) m0.m4866toStringimpl(this.f68859a));
        sb2.append(", offset=");
        sb2.append((Object) i1.h.m4193toStringimpl(this.f68860b));
        sb2.append(", blurRadius=");
        return a.b.n(sb2, this.f68861c, ')');
    }

    public /* synthetic */ d2(long j10, long j11, float f10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? o0.Color(4278190080L) : j10, (i10 & 2) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final d2 getNone() {
            return d2.f68858e;
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m4717getColor0d7_KjU$annotations() {
    }

    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m4718getOffsetF1C5BW0$annotations() {
    }
}
