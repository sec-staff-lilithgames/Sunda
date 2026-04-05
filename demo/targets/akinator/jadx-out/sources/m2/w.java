package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final v f73983b = new v(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f73984c = m5636constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f73985d = m5636constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f73986e = m5636constructorimpl(3);

    /* renamed from: f, reason: collision with root package name */
    public static final int f73987f = m5636constructorimpl(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f73988g = m5636constructorimpl(5);

    /* renamed from: h, reason: collision with root package name */
    public static final int f73989h = m5636constructorimpl(6);

    /* renamed from: i, reason: collision with root package name */
    public static final int f73990i = m5636constructorimpl(7);

    /* renamed from: j, reason: collision with root package name */
    public static final int f73991j = m5636constructorimpl(8);

    /* renamed from: k, reason: collision with root package name */
    public static final int f73992k = m5636constructorimpl(9);

    /* renamed from: a, reason: collision with root package name */
    public final int f73993a;

    public /* synthetic */ w(int i10) {
        this.f73993a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ w m5635boximpl(int i10) {
        return new w(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5637equalsimpl(int i10, Object obj) {
        return (obj instanceof w) && i10 == ((w) obj).m5641unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5638equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5639hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5640toStringimpl(int i10) {
        return m5638equalsimpl0(i10, f73984c) ? "Text" : m5638equalsimpl0(i10, f73985d) ? "Ascii" : m5638equalsimpl0(i10, f73986e) ? "Number" : m5638equalsimpl0(i10, f73987f) ? "Phone" : m5638equalsimpl0(i10, f73988g) ? "Uri" : m5638equalsimpl0(i10, f73989h) ? "Email" : m5638equalsimpl0(i10, f73990i) ? "Password" : m5638equalsimpl0(i10, f73991j) ? "NumberPassword" : m5638equalsimpl0(i10, f73992k) ? "Decimal" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5637equalsimpl(this.f73993a, obj);
    }

    public int hashCode() {
        return m5639hashCodeimpl(this.f73993a);
    }

    public String toString() {
        return m5640toStringimpl(this.f73993a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5641unboximpl() {
        return this.f73993a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5636constructorimpl(int i10) {
        return i10;
    }
}
