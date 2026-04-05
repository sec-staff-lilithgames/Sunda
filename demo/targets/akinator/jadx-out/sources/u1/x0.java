package u1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f87695a;

    public /* synthetic */ x0(int i10) {
        this.f87695a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ x0 m7383boximpl(int i10) {
        return new x0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7385equalsimpl(int i10, Object obj) {
        return (obj instanceof x0) && i10 == ((x0) obj).m7389unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7386equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7387hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7388toStringimpl(int i10) {
        return e2.h(')', "PointerKeyboardModifiers(packedValue=", i10);
    }

    public boolean equals(Object obj) {
        return m7385equalsimpl(this.f87695a, obj);
    }

    public int hashCode() {
        return m7387hashCodeimpl(this.f87695a);
    }

    public String toString() {
        return m7388toStringimpl(this.f87695a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7389unboximpl() {
        return this.f87695a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7384constructorimpl(int i10) {
        return i10;
    }
}
