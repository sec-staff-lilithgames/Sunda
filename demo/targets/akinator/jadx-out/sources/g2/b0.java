package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f56726b = new a0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f56727c = m3967constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f56728d = m3967constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f56729e = m3967constructorimpl(3);

    /* renamed from: f, reason: collision with root package name */
    public static final int f56730f = m3967constructorimpl(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f56731g = m3967constructorimpl(5);

    /* renamed from: h, reason: collision with root package name */
    public static final int f56732h = m3967constructorimpl(6);

    /* renamed from: i, reason: collision with root package name */
    public static final int f56733i = m3967constructorimpl(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f56734a;

    public /* synthetic */ b0(int i10) {
        this.f56734a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b0 m3966boximpl(int i10) {
        return new b0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3968equalsimpl(int i10, Object obj) {
        return (obj instanceof b0) && i10 == ((b0) obj).m3972unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3969equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3970hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3971toStringimpl(int i10) {
        return m3969equalsimpl0(i10, f56727c) ? "AboveBaseline" : m3969equalsimpl0(i10, f56728d) ? "Top" : m3969equalsimpl0(i10, f56729e) ? "Bottom" : m3969equalsimpl0(i10, f56730f) ? "Center" : m3969equalsimpl0(i10, f56731g) ? "TextTop" : m3969equalsimpl0(i10, f56732h) ? "TextBottom" : m3969equalsimpl0(i10, f56733i) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m3968equalsimpl(this.f56734a, obj);
    }

    public int hashCode() {
        return m3970hashCodeimpl(this.f56734a);
    }

    public String toString() {
        return m3971toStringimpl(this.f56734a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3972unboximpl() {
        return this.f56734a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m3967constructorimpl(int i10) {
        return i10;
    }
}
