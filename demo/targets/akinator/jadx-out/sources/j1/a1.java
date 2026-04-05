package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f68819b = new z0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68820c = m4655constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68821d = m4655constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f68822e = m4655constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f68823f = m4655constructorimpl(3);

    /* renamed from: g, reason: collision with root package name */
    public static final int f68824g = m4655constructorimpl(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f68825a;

    public /* synthetic */ a1(int i10) {
        this.f68825a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a1 m4654boximpl(int i10) {
        return new a1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4656equalsimpl(int i10, Object obj) {
        return (obj instanceof a1) && i10 == ((a1) obj).m4660unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4657equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4658hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4659toStringimpl(int i10) {
        return m4657equalsimpl0(i10, f68820c) ? "Argb8888" : m4657equalsimpl0(i10, f68821d) ? "Alpha8" : m4657equalsimpl0(i10, f68822e) ? "Rgb565" : m4657equalsimpl0(i10, f68823f) ? "F16" : m4657equalsimpl0(i10, f68824g) ? "Gpu" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4656equalsimpl(this.f68825a, obj);
    }

    public final int getValue() {
        return this.f68825a;
    }

    public int hashCode() {
        return m4658hashCodeimpl(this.f68825a);
    }

    public String toString() {
        return m4659toStringimpl(this.f68825a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4660unboximpl() {
        return this.f68825a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4655constructorimpl(int i10) {
        return i10;
    }
}
