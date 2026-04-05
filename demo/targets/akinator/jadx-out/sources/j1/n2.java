package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: b, reason: collision with root package name */
    public static final m2 f68936b = new m2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68937c = m4879constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68938d = m4879constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f68939e = m4879constructorimpl(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f68940a;

    public /* synthetic */ n2(int i10) {
        this.f68940a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ n2 m4878boximpl(int i10) {
        return new n2(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4880equalsimpl(int i10, Object obj) {
        return (obj instanceof n2) && i10 == ((n2) obj).m4884unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4881equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4882hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4883toStringimpl(int i10) {
        return m4881equalsimpl0(i10, f68937c) ? "Miter" : m4881equalsimpl0(i10, f68938d) ? "Round" : m4881equalsimpl0(i10, f68939e) ? "Bevel" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4880equalsimpl(this.f68940a, obj);
    }

    public int hashCode() {
        return m4882hashCodeimpl(this.f68940a);
    }

    public String toString() {
        return m4883toStringimpl(this.f68940a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4884unboximpl() {
        return this.f68940a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4879constructorimpl(int i10) {
        return i10;
    }
}
