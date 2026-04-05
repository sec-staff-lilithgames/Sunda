package m2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final t f73967b = new t(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f73968c = m5620constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f73969d = m5620constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f73970e = m5620constructorimpl(2);

    /* renamed from: f, reason: collision with root package name */
    public static final int f73971f = m5620constructorimpl(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f73972a;

    public /* synthetic */ u(int i10) {
        this.f73972a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u m5619boximpl(int i10) {
        return new u(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5621equalsimpl(int i10, Object obj) {
        return (obj instanceof u) && i10 == ((u) obj).m5625unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5622equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5623hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5624toStringimpl(int i10) {
        return m5622equalsimpl0(i10, f73968c) ? "None" : m5622equalsimpl0(i10, f73969d) ? "Characters" : m5622equalsimpl0(i10, f73970e) ? "Words" : m5622equalsimpl0(i10, f73971f) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m5621equalsimpl(this.f73972a, obj);
    }

    public int hashCode() {
        return m5623hashCodeimpl(this.f73972a);
    }

    public String toString() {
        return m5624toStringimpl(this.f73972a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5625unboximpl() {
        return this.f73972a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5620constructorimpl(int i10) {
        return i10;
    }
}
