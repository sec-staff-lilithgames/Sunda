package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final t1 f69006b = new t1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f69007c = m4999constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f69008d = m4999constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f69009e = m4999constructorimpl(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f69010a;

    public /* synthetic */ u1(int i10) {
        this.f69010a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u1 m4998boximpl(int i10) {
        return new u1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5000equalsimpl(int i10, Object obj) {
        return (obj instanceof u1) && i10 == ((u1) obj).m5004unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5001equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5002hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5003toStringimpl(int i10) {
        return m5001equalsimpl0(i10, f69007c) ? "Points" : m5001equalsimpl0(i10, f69008d) ? "Lines" : m5001equalsimpl0(i10, f69009e) ? "Polygon" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5000equalsimpl(this.f69010a, obj);
    }

    public int hashCode() {
        return m5002hashCodeimpl(this.f69010a);
    }

    public String toString() {
        return m5003toStringimpl(this.f69010a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5004unboximpl() {
        return this.f69010a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4999constructorimpl(int i10) {
        return i10;
    }
}
