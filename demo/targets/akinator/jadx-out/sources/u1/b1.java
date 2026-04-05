package u1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f87521a;

    public /* synthetic */ b1(int i10) {
        this.f87521a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b1 m7262boximpl(int i10) {
        return new b1(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7264equalsimpl(int i10, Object obj) {
        return (obj instanceof b1) && i10 == ((b1) obj).m7270unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7265equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m7266getAnyMovementConsumedimpl(int i10) {
        return (i10 & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m7267getDispatchedToAPointerInputModifierimpl(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7268hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7269toStringimpl(int i10) {
        return e2.h(')', "ProcessResult(value=", i10);
    }

    public boolean equals(Object obj) {
        return m7264equalsimpl(this.f87521a, obj);
    }

    public int hashCode() {
        return m7268hashCodeimpl(this.f87521a);
    }

    public String toString() {
        return m7269toStringimpl(this.f87521a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7270unboximpl() {
        return this.f87521a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7263constructorimpl(int i10) {
        return i10;
    }
}
