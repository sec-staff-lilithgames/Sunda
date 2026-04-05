package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final n1 f68941b = new n1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68942c = m4896constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68943d = m4896constructorimpl(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f68944a;

    public /* synthetic */ o1(int i10) {
        this.f68944a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o1 m4895boximpl(int i10) {
        return new o1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4897equalsimpl(int i10, Object obj) {
        return (obj instanceof o1) && i10 == ((o1) obj).m4901unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4898equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4899hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4900toStringimpl(int i10) {
        return m4898equalsimpl0(i10, f68942c) ? "NonZero" : m4898equalsimpl0(i10, f68943d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4897equalsimpl(this.f68944a, obj);
    }

    public int hashCode() {
        return m4899hashCodeimpl(this.f68944a);
    }

    public String toString() {
        return m4900toStringimpl(this.f68944a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4901unboximpl() {
        return this.f68944a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4896constructorimpl(int i10) {
        return i10;
    }
}
