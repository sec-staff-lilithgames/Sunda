package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f68900b = new j0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f68901c = m4789constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f68902d = m4789constructorimpl(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f68903a;

    public /* synthetic */ k0(int i10) {
        this.f68903a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ k0 m4788boximpl(int i10) {
        return new k0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4790equalsimpl(int i10, Object obj) {
        return (obj instanceof k0) && i10 == ((k0) obj).m4794unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4791equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4792hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4793toStringimpl(int i10) {
        return m4791equalsimpl0(i10, f68901c) ? "Difference" : m4791equalsimpl0(i10, f68902d) ? "Intersect" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m4790equalsimpl(this.f68903a, obj);
    }

    public int hashCode() {
        return m4792hashCodeimpl(this.f68903a);
    }

    public String toString() {
        return m4793toStringimpl(this.f68903a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4794unboximpl() {
        return this.f68903a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4789constructorimpl(int i10) {
        return i10;
    }
}
