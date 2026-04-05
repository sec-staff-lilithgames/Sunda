package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f72244b = new z0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f72245c = m5424constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f72246d = m5424constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f72247e = m5424constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f72248f = m5424constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f72249a;

    public /* synthetic */ a1(int i10) {
        this.f72249a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ a1 m5423boximpl(int i10) {
        return new a1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5425equalsimpl(int i10, Object obj) {
        return (obj instanceof a1) && i10 == ((a1) obj).m5431unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5426equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5427hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isStyleOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m5428isStyleOnimpl$ui_text_release(int i10) {
        return m5426equalsimpl0(i10, f72246d) || m5426equalsimpl0(i10, f72248f);
    }

    /* renamed from: isWeightOn-impl$ui_text_release, reason: not valid java name */
    public static final boolean m5429isWeightOnimpl$ui_text_release(int i10) {
        return m5426equalsimpl0(i10, f72246d) || m5426equalsimpl0(i10, f72247e);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5430toStringimpl(int i10) {
        return m5426equalsimpl0(i10, f72245c) ? "None" : m5426equalsimpl0(i10, f72246d) ? "All" : m5426equalsimpl0(i10, f72247e) ? "Weight" : m5426equalsimpl0(i10, f72248f) ? "Style" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5425equalsimpl(this.f72249a, obj);
    }

    public int hashCode() {
        return m5427hashCodeimpl(this.f72249a);
    }

    public String toString() {
        return m5430toStringimpl(this.f72249a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5431unboximpl() {
        return this.f72249a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5424constructorimpl(int i10) {
        return i10;
    }
}
