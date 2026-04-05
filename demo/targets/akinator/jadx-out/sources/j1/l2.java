package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: b, reason: collision with root package name */
    public static final k2 f68912b = new k2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68913c = m4842constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68914d = m4842constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f68915e = m4842constructorimpl(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f68916a;

    public /* synthetic */ l2(int i10) {
        this.f68916a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ l2 m4841boximpl(int i10) {
        return new l2(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4843equalsimpl(int i10, Object obj) {
        return (obj instanceof l2) && i10 == ((l2) obj).m4847unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4844equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4845hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4846toStringimpl(int i10) {
        return m4844equalsimpl0(i10, f68913c) ? "Butt" : m4844equalsimpl0(i10, f68914d) ? "Round" : m4844equalsimpl0(i10, f68915e) ? "Square" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4843equalsimpl(this.f68916a, obj);
    }

    public int hashCode() {
        return m4845hashCodeimpl(this.f68916a);
    }

    public String toString() {
        return m4846toStringimpl(this.f68916a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4847unboximpl() {
        return this.f68916a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4842constructorimpl(int i10) {
        return i10;
    }
}
