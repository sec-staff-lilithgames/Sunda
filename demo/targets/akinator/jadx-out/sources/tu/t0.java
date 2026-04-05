package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f87408c = new s0(null);

    /* renamed from: b, reason: collision with root package name */
    public final short f87409b;

    public /* synthetic */ t0(short s10) {
        this.f87409b = s10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ t0 m7105boximpl(short s10) {
        return new t0(s10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7107equalsimpl(short s10, Object obj) {
        return (obj instanceof t0) && s10 == ((t0) obj).m7111unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7108equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7109hashCodeimpl(short s10) {
        return Short.hashCode(s10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7110toStringimpl(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.e0.compare(m7111unboximpl() & 65535, ((t0) obj).m7111unboximpl() & 65535);
    }

    public boolean equals(Object obj) {
        return m7107equalsimpl(this.f87409b, obj);
    }

    public int hashCode() {
        return m7109hashCodeimpl(this.f87409b);
    }

    public String toString() {
        return m7110toStringimpl(this.f87409b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m7111unboximpl() {
        return this.f87409b;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m7106constructorimpl(short s10) {
        return s10;
    }
}
