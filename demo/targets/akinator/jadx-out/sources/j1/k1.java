package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: b, reason: collision with root package name */
    public static final j1 f68904b = new j1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68905c = m4796constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68906d = m4796constructorimpl(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f68907a;

    public /* synthetic */ k1(int i10) {
        this.f68907a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k1 m4795boximpl(int i10) {
        return new k1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4797equalsimpl(int i10, Object obj) {
        return (obj instanceof k1) && i10 == ((k1) obj).m4801unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4798equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4799hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4800toStringimpl(int i10) {
        return m4798equalsimpl0(i10, f68905c) ? "Fill" : m4798equalsimpl0(i10, f68906d) ? "Stroke" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4797equalsimpl(this.f68907a, obj);
    }

    public int hashCode() {
        return m4799hashCodeimpl(this.f68907a);
    }

    public String toString() {
        return m4800toStringimpl(this.f68907a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4801unboximpl() {
        return this.f68907a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4796constructorimpl(int i10) {
        return i10;
    }
}
