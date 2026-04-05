package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final z f83672b = new z(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f83673c = m6025constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f83674d = m6025constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f83675e = m6025constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f83676a;

    public /* synthetic */ a0(int i10) {
        this.f83676a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a0 m6024boximpl(int i10) {
        return new a0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6026equalsimpl(int i10, Object obj) {
        return (obj instanceof a0) && i10 == ((a0) obj).m6030unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6027equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6028hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6029toStringimpl(int i10) {
        return m6027equalsimpl0(i10, f83673c) ? "Clip" : m6027equalsimpl0(i10, f83674d) ? "Ellipsis" : m6027equalsimpl0(i10, f83675e) ? "Visible" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6026equalsimpl(this.f83676a, obj);
    }

    public int hashCode() {
        return m6028hashCodeimpl(this.f83676a);
    }

    public String toString() {
        return m6029toStringimpl(this.f83676a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6030unboximpl() {
        return this.f83676a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6025constructorimpl(int i10) {
        return i10;
    }
}
