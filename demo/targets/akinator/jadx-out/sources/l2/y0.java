package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final x0 f72394b = new x0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f72395c = m5483constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f72396d = m5483constructorimpl(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f72397a;

    public /* synthetic */ y0(int i10) {
        this.f72397a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ y0 m5482boximpl(int i10) {
        return new y0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5484equalsimpl(int i10, Object obj) {
        return (obj instanceof y0) && i10 == ((y0) obj).m5488unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5485equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5486hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5487toStringimpl(int i10) {
        return m5485equalsimpl0(i10, f72395c) ? "Normal" : m5485equalsimpl0(i10, f72396d) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5484equalsimpl(this.f72397a, obj);
    }

    public final int getValue() {
        return this.f72397a;
    }

    public int hashCode() {
        return m5486hashCodeimpl(this.f72397a);
    }

    public String toString() {
        return m5487toStringimpl(this.f72397a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5488unboximpl() {
        return this.f72397a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5483constructorimpl(int i10) {
        return i10;
    }
}
