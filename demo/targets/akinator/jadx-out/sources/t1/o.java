package t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f86279b = new n(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f86280c = m7024constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f86281d = m7024constructorimpl(2);

    /* renamed from: e, reason: collision with root package name */
    public static final int f86282e = m7024constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f86283a;

    public /* synthetic */ o(int i10) {
        this.f86283a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o m7023boximpl(int i10) {
        return new o(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7025equalsimpl(int i10, Object obj) {
        return (obj instanceof o) && i10 == ((o) obj).m7029unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7026equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7027hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7028toStringimpl(int i10) {
        return m7026equalsimpl0(i10, f86280c) ? "Drag" : m7026equalsimpl0(i10, f86281d) ? "Fling" : m7026equalsimpl0(i10, f86282e) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m7025equalsimpl(this.f86283a, obj);
    }

    public int hashCode() {
        return m7027hashCodeimpl(this.f86283a);
    }

    public String toString() {
        return m7028toStringimpl(this.f86283a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7029unboximpl() {
        return this.f86283a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7024constructorimpl(int i10) {
        return i10;
    }
}
