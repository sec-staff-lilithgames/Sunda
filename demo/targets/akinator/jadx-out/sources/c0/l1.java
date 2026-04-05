package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f11521b = new k1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f11522c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11523d = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f11524a;

    public /* synthetic */ l1(int i10) {
        this.f11524a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ l1 m171boximpl(int i10) {
        return new l1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m172equalsimpl(int i10, Object obj) {
        return (obj instanceof l1) && i10 == ((l1) obj).m176unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m173equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m174hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m175toStringimpl(int i10) {
        return b0.e2.h(')', "StartOffsetType(value=", i10);
    }

    public boolean equals(Object obj) {
        return m172equalsimpl(this.f11524a, obj);
    }

    public int hashCode() {
        return m174hashCodeimpl(this.f11524a);
    }

    public String toString() {
        return m175toStringimpl(this.f11524a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m176unboximpl() {
        return this.f11524a;
    }
}
