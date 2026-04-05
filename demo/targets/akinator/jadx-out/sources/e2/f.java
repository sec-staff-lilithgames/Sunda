package e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final e f53518b = new e(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f53519c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f53520a;

    public /* synthetic */ f(int i10) {
        this.f53520a = i10;
    }

    public static final /* synthetic */ int access$getPolite$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ f m3809boximpl(int i10) {
        return new f(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3810equalsimpl(int i10, Object obj) {
        return (obj instanceof f) && i10 == ((f) obj).m3814unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3811equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3812hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3813toStringimpl(int i10) {
        return m3811equalsimpl0(i10, 0) ? "Polite" : m3811equalsimpl0(i10, f53519c) ? "Assertive" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m3810equalsimpl(this.f53520a, obj);
    }

    public int hashCode() {
        return m3812hashCodeimpl(this.f53520a);
    }

    public String toString() {
        return m3813toStringimpl(this.f53520a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3814unboximpl() {
        return this.f53520a;
    }
}
