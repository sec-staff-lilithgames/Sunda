package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f68948b = new q0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68949c = m4920constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68950d = m4920constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f68951e = m4920constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f68952f = m4920constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f68953a;

    public /* synthetic */ r0(int i10) {
        this.f68953a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r0 m4919boximpl(int i10) {
        return new r0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4921equalsimpl(int i10, Object obj) {
        return (obj instanceof r0) && i10 == ((r0) obj).m4925unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4922equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4923hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4924toStringimpl(int i10) {
        return m4922equalsimpl0(i10, f68949c) ? "None" : m4922equalsimpl0(i10, f68950d) ? "Low" : m4922equalsimpl0(i10, f68951e) ? "Medium" : m4922equalsimpl0(i10, f68952f) ? "High" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4921equalsimpl(this.f68953a, obj);
    }

    public final int getValue() {
        return this.f68953a;
    }

    public int hashCode() {
        return m4923hashCodeimpl(this.f68953a);
    }

    public String toString() {
        return m4924toStringimpl(this.f68953a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4925unboximpl() {
        return this.f68953a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4920constructorimpl(int i10) {
        return i10;
    }
}
