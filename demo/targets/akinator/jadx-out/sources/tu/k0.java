package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f87387c = new j0(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f87388b;

    public /* synthetic */ k0(int i10) {
        this.f87388b = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k0 m7055boximpl(int i10) {
        return new k0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7057equalsimpl(int i10, Object obj) {
        return (obj instanceof k0) && i10 == ((k0) obj).m7061unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7058equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7059hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7060toStringimpl(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return z0.uintCompare(m7061unboximpl(), ((k0) obj).m7061unboximpl());
    }

    public boolean equals(Object obj) {
        return m7057equalsimpl(this.f87388b, obj);
    }

    public int hashCode() {
        return m7059hashCodeimpl(this.f87388b);
    }

    public String toString() {
        return m7060toStringimpl(this.f87388b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7061unboximpl() {
        return this.f87388b;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7056constructorimpl(int i10) {
        return i10;
    }
}
