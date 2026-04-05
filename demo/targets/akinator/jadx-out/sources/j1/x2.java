package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: b, reason: collision with root package name */
    public static final w2 f69047b = new w2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f69048c = m5075constructorimpl(0);

    /* renamed from: d, reason: collision with root package name */
    public static final int f69049d = m5075constructorimpl(1);

    /* renamed from: e, reason: collision with root package name */
    public static final int f69050e = m5075constructorimpl(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f69051a;

    public /* synthetic */ x2(int i10) {
        this.f69051a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x2 m5074boximpl(int i10) {
        return new x2(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5076equalsimpl(int i10, Object obj) {
        return (obj instanceof x2) && i10 == ((x2) obj).m5080unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5077equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5078hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5079toStringimpl(int i10) {
        return m5077equalsimpl0(i10, f69048c) ? "Triangles" : m5077equalsimpl0(i10, f69049d) ? "TriangleStrip" : m5077equalsimpl0(i10, f69050e) ? "TriangleFan" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5076equalsimpl(this.f69051a, obj);
    }

    public int hashCode() {
        return m5078hashCodeimpl(this.f69051a);
    }

    public String toString() {
        return m5079toStringimpl(this.f69051a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5080unboximpl() {
        return this.f69051a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5075constructorimpl(int i10) {
        return i10;
    }
}
