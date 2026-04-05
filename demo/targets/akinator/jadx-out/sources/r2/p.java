package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final o f83714b = new o(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f83715c = m6085constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f83716d = m6085constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f83717e = m6085constructorimpl(3);

    /* renamed from: f, reason: collision with root package name */
    public static final int f83718f = m6085constructorimpl(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f83719g = m6085constructorimpl(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f83720a;

    public /* synthetic */ p(int i10) {
        this.f83720a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ p m6084boximpl(int i10) {
        return new p(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6086equalsimpl(int i10, Object obj) {
        return (obj instanceof p) && i10 == ((p) obj).m6090unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6087equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6088hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6089toStringimpl(int i10) {
        return m6087equalsimpl0(i10, f83715c) ? "Ltr" : m6087equalsimpl0(i10, f83716d) ? "Rtl" : m6087equalsimpl0(i10, f83717e) ? "Content" : m6087equalsimpl0(i10, f83718f) ? "ContentOrLtr" : m6087equalsimpl0(i10, f83719g) ? "ContentOrRtl" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6086equalsimpl(this.f83720a, obj);
    }

    public int hashCode() {
        return m6088hashCodeimpl(this.f83720a);
    }

    public String toString() {
        return m6089toStringimpl(this.f83720a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6090unboximpl() {
        return this.f83720a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6085constructorimpl(int i10) {
        return i10;
    }
}
