package s1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f85306b = new d(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f85307c = m6707constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f85308d = m6707constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f85309e = m6707constructorimpl(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f85310a;

    public /* synthetic */ e(int i10) {
        this.f85310a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e m6706boximpl(int i10) {
        return new e(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6708equalsimpl(int i10, Object obj) {
        return (obj instanceof e) && i10 == ((e) obj).m6712unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6709equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6710hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6711toStringimpl(int i10) {
        return m6709equalsimpl0(i10, f85308d) ? "KeyUp" : m6709equalsimpl0(i10, f85309e) ? "KeyDown" : m6709equalsimpl0(i10, f85307c) ? "Unknown" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m6708equalsimpl(this.f85310a, obj);
    }

    public int hashCode() {
        return m6710hashCodeimpl(this.f85310a);
    }

    public String toString() {
        return m6711toStringimpl(this.f85310a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6712unboximpl() {
        return this.f85310a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6707constructorimpl(int i10) {
        return i10;
    }
}
