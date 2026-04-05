package q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f82390b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f82391c = m5966constructorimpl(1);

    /* renamed from: d, reason: collision with root package name */
    public static final int f82392d = m5966constructorimpl(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f82393a;

    public /* synthetic */ b(int i10) {
        this.f82393a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m5965boximpl(int i10) {
        return new b(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5967equalsimpl(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).m5971unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5968equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5969hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5970toStringimpl(int i10) {
        return m5968equalsimpl0(i10, f82391c) ? "Touch" : m5968equalsimpl0(i10, f82392d) ? "Keyboard" : "Error";
    }

    public boolean equals(Object obj) {
        return m5967equalsimpl(this.f82393a, obj);
    }

    public int hashCode() {
        return m5969hashCodeimpl(this.f82393a);
    }

    public String toString() {
        return m5970toStringimpl(this.f82393a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5971unboximpl() {
        return this.f82393a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5966constructorimpl(int i10) {
        return i10;
    }
}
