package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f80389b = new o1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f80390c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f80391d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f80392a;

    public /* synthetic */ p1(int i10) {
        this.f80392a = i10;
    }

    public static final /* synthetic */ int access$getGroup$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ p1 m5822boximpl(int i10) {
        return new p1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5823equalsimpl(int i10, Object obj) {
        return (obj instanceof p1) && i10 == ((p1) obj).m5829unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5824equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5825hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isNode-impl, reason: not valid java name */
    public static final boolean m5826isNodeimpl(int i10) {
        return i10 != f80389b.m5819getGroupULZAiWs();
    }

    /* renamed from: isReusable-impl, reason: not valid java name */
    public static final boolean m5827isReusableimpl(int i10) {
        return i10 != f80389b.m5820getNodeULZAiWs();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5828toStringimpl(int i10) {
        return b0.e2.h(')', "GroupKind(value=", i10);
    }

    public boolean equals(Object obj) {
        return m5823equalsimpl(this.f80392a, obj);
    }

    public final int getValue() {
        return this.f80392a;
    }

    public int hashCode() {
        return m5825hashCodeimpl(this.f80392a);
    }

    public String toString() {
        return m5828toStringimpl(this.f80392a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5829unboximpl() {
        return this.f80392a;
    }
}
