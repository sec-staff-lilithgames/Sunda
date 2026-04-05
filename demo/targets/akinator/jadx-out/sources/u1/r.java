package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final q f87659b = new q(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f87660c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f87661d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f87662e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f87663f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f87664g = 5;

    /* renamed from: h, reason: collision with root package name */
    public static final int f87665h = 6;

    /* renamed from: a, reason: collision with root package name */
    public final int f87666a;

    public /* synthetic */ r(int i10) {
        this.f87666a = i10;
    }

    public static final /* synthetic */ int access$getUnknown$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r m7356boximpl(int i10) {
        return new r(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7357equalsimpl(int i10, Object obj) {
        return (obj instanceof r) && i10 == ((r) obj).m7361unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7358equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7359hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7360toStringimpl(int i10) {
        return m7358equalsimpl0(i10, f87660c) ? "Press" : m7358equalsimpl0(i10, f87661d) ? "Release" : m7358equalsimpl0(i10, f87662e) ? "Move" : m7358equalsimpl0(i10, f87663f) ? "Enter" : m7358equalsimpl0(i10, f87664g) ? "Exit" : m7358equalsimpl0(i10, f87665h) ? "Scroll" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m7357equalsimpl(this.f87666a, obj);
    }

    public int hashCode() {
        return m7359hashCodeimpl(this.f87666a);
    }

    public String toString() {
        return m7360toStringimpl(this.f87666a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7361unboximpl() {
        return this.f87666a;
    }
}
