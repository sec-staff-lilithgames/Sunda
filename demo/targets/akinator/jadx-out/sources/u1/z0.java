package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f87698b = new y0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f87699c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f87700d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f87701e = 3;

    /* renamed from: f, reason: collision with root package name */
    public static final int f87702f = 4;

    /* renamed from: a, reason: collision with root package name */
    public final int f87703a;

    public /* synthetic */ z0(int i10) {
        this.f87703a = i10;
    }

    public static final /* synthetic */ int access$getUnknown$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ z0 m7395boximpl(int i10) {
        return new z0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7396equalsimpl(int i10, Object obj) {
        return (obj instanceof z0) && i10 == ((z0) obj).m7400unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7397equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7398hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7399toStringimpl(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }

    public boolean equals(Object obj) {
        return m7396equalsimpl(this.f87703a, obj);
    }

    public int hashCode() {
        return m7398hashCodeimpl(this.f87703a);
    }

    public String toString() {
        return m7399toStringimpl(this.f87703a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7400unboximpl() {
        return this.f87703a;
    }
}
