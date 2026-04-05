package b1;

import b0.e2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f8621a;

    static {
        new i(null);
    }

    public /* synthetic */ j(int i10) {
        this.f8621a = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ j m116boximpl(int i10) {
        return new j(i10);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m118constructorimpl$default(int i10, int i11, kotlin.jvm.internal.u uVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return m117constructorimpl(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m119equalsimpl(int i10, Object obj) {
        return (obj instanceof j) && i10 == ((j) obj).m125unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m120equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m121hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m122isReadInh_f27i8(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m123toStringimpl(int i10) {
        return e2.h(')', "ReaderKind(mask=", i10);
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m124withReadIn3QSx2Dw(int i10, int i11) {
        return m117constructorimpl(i10 | i11);
    }

    public boolean equals(Object obj) {
        return m119equalsimpl(this.f8621a, obj);
    }

    public final int getMask() {
        return this.f8621a;
    }

    public int hashCode() {
        return m121hashCodeimpl(this.f8621a);
    }

    public String toString() {
        return m123toStringimpl(this.f8621a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m125unboximpl() {
        return this.f8621a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m117constructorimpl(int i10) {
        return i10;
    }
}
