package u1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f87622a;

    public /* synthetic */ l(int i10) {
        this.f87622a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ l m7336boximpl(int i10) {
        return new l(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7338equalsimpl(int i10, Object obj) {
        return (obj instanceof l) && i10 == ((l) obj).m7342unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7339equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7340hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7341toStringimpl(int i10) {
        return e2.h(')', "PointerButtons(packedValue=", i10);
    }

    public boolean equals(Object obj) {
        return m7338equalsimpl(this.f87622a, obj);
    }

    public int hashCode() {
        return m7340hashCodeimpl(this.f87622a);
    }

    public String toString() {
        return m7341toStringimpl(this.f87622a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7342unboximpl() {
        return this.f87622a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7337constructorimpl(int i10) {
        return i10;
    }
}
