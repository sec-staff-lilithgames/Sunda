package q0;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f82386a;

    public /* synthetic */ w(int i10) {
        this.f82386a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ w m5951boximpl(int i10) {
        return new w(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5953equalsimpl(int i10, Object obj) {
        return (obj instanceof w) && i10 == ((w) obj).m5957unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5954equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5955hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5956toStringimpl(int i10) {
        return e2.h(')', "ObjectParameter(offset=", i10);
    }

    public boolean equals(Object obj) {
        return m5953equalsimpl(this.f82386a, obj);
    }

    public final int getOffset() {
        return this.f82386a;
    }

    public int hashCode() {
        return m5955hashCodeimpl(this.f82386a);
    }

    public String toString() {
        return m5956toStringimpl(this.f82386a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5957unboximpl() {
        return this.f82386a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> int m5952constructorimpl(int i10) {
        return i10;
    }
}
