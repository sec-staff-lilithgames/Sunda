package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f73932b = new l(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f73933c = m5601constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f73934d = m5601constructorimpl(0);

    /* renamed from: e, reason: collision with root package name */
    public static final int f73935e = m5601constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f73936f = m5601constructorimpl(3);

    /* renamed from: g, reason: collision with root package name */
    public static final int f73937g = m5601constructorimpl(4);

    /* renamed from: h, reason: collision with root package name */
    public static final int f73938h = m5601constructorimpl(5);

    /* renamed from: i, reason: collision with root package name */
    public static final int f73939i = m5601constructorimpl(6);

    /* renamed from: j, reason: collision with root package name */
    public static final int f73940j = m5601constructorimpl(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f73941a;

    public /* synthetic */ m(int i10) {
        this.f73941a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m m5600boximpl(int i10) {
        return new m(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5602equalsimpl(int i10, Object obj) {
        return (obj instanceof m) && i10 == ((m) obj).m5606unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5603equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5604hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5605toStringimpl(int i10) {
        return m5603equalsimpl0(i10, f73934d) ? "None" : m5603equalsimpl0(i10, f73933c) ? "Default" : m5603equalsimpl0(i10, f73935e) ? "Go" : m5603equalsimpl0(i10, f73936f) ? "Search" : m5603equalsimpl0(i10, f73937g) ? "Send" : m5603equalsimpl0(i10, f73938h) ? "Previous" : m5603equalsimpl0(i10, f73939i) ? "Next" : m5603equalsimpl0(i10, f73940j) ? "Done" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5602equalsimpl(this.f73941a, obj);
    }

    public int hashCode() {
        return m5604hashCodeimpl(this.f73941a);
    }

    public String toString() {
        return m5605toStringimpl(this.f73941a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5606unboximpl() {
        return this.f73941a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5601constructorimpl(int i10) {
        return i10;
    }
}
