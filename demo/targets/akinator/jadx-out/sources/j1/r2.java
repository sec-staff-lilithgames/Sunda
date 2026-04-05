package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: b, reason: collision with root package name */
    public static final q2 f68961b = new q2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68962c = m4934constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68963d = m4934constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f68964e = m4934constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f68965f = m4934constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f68966a;

    public /* synthetic */ r2(int i10) {
        this.f68966a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ r2 m4933boximpl(int i10) {
        return new r2(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4935equalsimpl(int i10, Object obj) {
        return (obj instanceof r2) && i10 == ((r2) obj).m4939unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4936equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4937hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4938toStringimpl(int i10) {
        return m4936equalsimpl0(i10, f68962c) ? "Clamp" : m4936equalsimpl0(i10, f68963d) ? "Repeated" : m4936equalsimpl0(i10, f68964e) ? "Mirror" : m4936equalsimpl0(i10, f68965f) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4935equalsimpl(this.f68966a, obj);
    }

    public int hashCode() {
        return m4937hashCodeimpl(this.f68966a);
    }

    public String toString() {
        return m4938toStringimpl(this.f68966a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4939unboximpl() {
        return this.f68966a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4934constructorimpl(int i10) {
        return i10;
    }
}
