package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f53544b = new l(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f53545c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f53546d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f53547e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f53548f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f53549g = 5;

    /* renamed from: a, reason: collision with root package name */
    public final int f53550a;

    public /* synthetic */ m(int i10) {
        this.f53550a = i10;
    }

    public static final /* synthetic */ int access$getButton$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m m3822boximpl(int i10) {
        return new m(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3823equalsimpl(int i10, Object obj) {
        return (obj instanceof m) && i10 == ((m) obj).m3827unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3824equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3825hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3826toStringimpl(int i10) {
        return m3824equalsimpl0(i10, 0) ? "Button" : m3824equalsimpl0(i10, f53545c) ? "Checkbox" : m3824equalsimpl0(i10, f53546d) ? "Switch" : m3824equalsimpl0(i10, f53547e) ? "RadioButton" : m3824equalsimpl0(i10, f53548f) ? "Tab" : m3824equalsimpl0(i10, f53549g) ? "Image" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3823equalsimpl(this.f53550a, obj);
    }

    public int hashCode() {
        return m3825hashCodeimpl(this.f53550a);
    }

    public String toString() {
        return m3826toStringimpl(this.f53550a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3827unboximpl() {
        return this.f53550a;
    }
}
