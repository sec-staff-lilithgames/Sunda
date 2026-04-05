package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: b, reason: collision with root package name */
    public static final q1 f68954b = new q1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68955c = m4927constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68956d = m4927constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f68957e = m4927constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f68958f = m4927constructorimpl(3);

    /* renamed from: g, reason: collision with root package name */
    public static final int f68959g = m4927constructorimpl(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f68960a;

    public /* synthetic */ r1(int i10) {
        this.f68960a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r1 m4926boximpl(int i10) {
        return new r1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4928equalsimpl(int i10, Object obj) {
        return (obj instanceof r1) && i10 == ((r1) obj).m4932unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4929equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4930hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4931toStringimpl(int i10) {
        return m4929equalsimpl0(i10, f68955c) ? "Difference" : m4929equalsimpl0(i10, f68956d) ? "Intersect" : m4929equalsimpl0(i10, f68957e) ? "Union" : m4929equalsimpl0(i10, f68958f) ? "Xor" : m4929equalsimpl0(i10, f68959g) ? "ReverseDifference" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4928equalsimpl(this.f68960a, obj);
    }

    public int hashCode() {
        return m4930hashCodeimpl(this.f68960a);
    }

    public String toString() {
        return m4931toStringimpl(this.f68960a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4932unboximpl() {
        return this.f68960a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4927constructorimpl(int i10) {
        return i10;
    }
}
