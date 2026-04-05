package k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static final q f70087b = new q(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f70088c = m5119constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f70089d = m5119constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f70090e = m5119constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f70091f = m5119constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f70092a;

    public /* synthetic */ r(int i10) {
        this.f70092a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r m5118boximpl(int i10) {
        return new r(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5120equalsimpl(int i10, Object obj) {
        return (obj instanceof r) && i10 == ((r) obj).m5124unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5121equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5122hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5123toStringimpl(int i10) {
        return m5121equalsimpl0(i10, f70088c) ? "Perceptual" : m5121equalsimpl0(i10, f70089d) ? "Relative" : m5121equalsimpl0(i10, f70090e) ? "Saturation" : m5121equalsimpl0(i10, f70091f) ? "Absolute" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5120equalsimpl(this.f70092a, obj);
    }

    public int hashCode() {
        return m5122hashCodeimpl(this.f70092a);
    }

    public String toString() {
        return m5123toStringimpl(this.f70092a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5124unboximpl() {
        return this.f70092a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5119constructorimpl(int i10) {
        return i10;
    }
}
