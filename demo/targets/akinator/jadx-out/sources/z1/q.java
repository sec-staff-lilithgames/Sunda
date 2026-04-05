package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f97379a;

    public /* synthetic */ q(int i10) {
        this.f97379a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ q m8061boximpl(int i10) {
        return new q(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8063equalsimpl(int i10, Object obj) {
        return (obj instanceof q) && i10 == ((q) obj).m8067unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8064equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8065hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8066toStringimpl(int i10) {
        return b0.e2.h(')', "EntityType(index=", i10);
    }

    public boolean equals(Object obj) {
        return m8063equalsimpl(this.f97379a, obj);
    }

    public final int getIndex() {
        return this.f97379a;
    }

    public int hashCode() {
        return m8065hashCodeimpl(this.f97379a);
    }

    public String toString() {
        return m8066toStringimpl(this.f97379a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8067unboximpl() {
        return this.f97379a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T extends o0, M extends e1.v> int m8062constructorimpl(int i10) {
        return i10;
    }
}
