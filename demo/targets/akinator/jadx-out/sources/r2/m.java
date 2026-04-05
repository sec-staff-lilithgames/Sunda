package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final l f83701b = new l(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f83702c = m6073constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f83703d = m6073constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f83704e = m6073constructorimpl(3);

    /* renamed from: f, reason: collision with root package name */
    public static final int f83705f = m6073constructorimpl(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f83706g = m6073constructorimpl(5);

    /* renamed from: h, reason: collision with root package name */
    public static final int f83707h = m6073constructorimpl(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f83708a;

    public /* synthetic */ m(int i10) {
        this.f83708a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m m6072boximpl(int i10) {
        return new m(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6074equalsimpl(int i10, Object obj) {
        return (obj instanceof m) && i10 == ((m) obj).m6078unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6075equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6076hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6077toStringimpl(int i10) {
        return m6075equalsimpl0(i10, f83702c) ? "Left" : m6075equalsimpl0(i10, f83703d) ? "Right" : m6075equalsimpl0(i10, f83704e) ? "Center" : m6075equalsimpl0(i10, f83705f) ? "Justify" : m6075equalsimpl0(i10, f83706g) ? "Start" : m6075equalsimpl0(i10, f83707h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6074equalsimpl(this.f83708a, obj);
    }

    public int hashCode() {
        return m6076hashCodeimpl(this.f83708a);
    }

    public String toString() {
        return m6077toStringimpl(this.f83708a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6078unboximpl() {
        return this.f83708a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6073constructorimpl(int i10) {
        return i10;
    }
}
