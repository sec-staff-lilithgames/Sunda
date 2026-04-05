package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e f58545b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f58546c = m4134constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f58547d = m4134constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f58548e = m4134constructorimpl(3);

    /* renamed from: f, reason: collision with root package name */
    public static final int f58549f = m4134constructorimpl(4);

    /* renamed from: g, reason: collision with root package name */
    public static final int f58550g = m4134constructorimpl(5);

    /* renamed from: h, reason: collision with root package name */
    public static final int f58551h = m4134constructorimpl(6);

    /* renamed from: i, reason: collision with root package name */
    public static final int f58552i = m4134constructorimpl(7);

    /* renamed from: j, reason: collision with root package name */
    public static final int f58553j = m4134constructorimpl(8);

    /* renamed from: a, reason: collision with root package name */
    public final int f58554a;

    public /* synthetic */ f(int i10) {
        this.f58554a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f m4133boximpl(int i10) {
        return new f(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4135equalsimpl(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).m4139unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4136equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4137hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4138toStringimpl(int i10) {
        return m4136equalsimpl0(i10, f58546c) ? "Next" : m4136equalsimpl0(i10, f58547d) ? "Previous" : m4136equalsimpl0(i10, f58548e) ? "Left" : m4136equalsimpl0(i10, f58549f) ? "Right" : m4136equalsimpl0(i10, f58550g) ? "Up" : m4136equalsimpl0(i10, f58551h) ? "Down" : m4136equalsimpl0(i10, f58552i) ? "In" : m4136equalsimpl0(i10, f58553j) ? "Out" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m4135equalsimpl(this.f58554a, obj);
    }

    public int hashCode() {
        return m4137hashCodeimpl(this.f58554a);
    }

    public String toString() {
        return m4138toStringimpl(this.f58554a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4139unboximpl() {
        return this.f58554a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4134constructorimpl(int i10) {
        return i10;
    }
}
