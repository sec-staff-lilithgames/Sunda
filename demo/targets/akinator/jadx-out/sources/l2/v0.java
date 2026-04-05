package l2;

import b0.e2;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f72378b = new u0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f72379c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f72380d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f72381a;

    public /* synthetic */ v0(int i10) {
        this.f72381a = i10;
    }

    public static final /* synthetic */ int access$getBlocking$cp() {
        return 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ v0 m5469boximpl(int i10) {
        return new v0(i10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5470equalsimpl(int i10, Object obj) {
        return (obj instanceof v0) && i10 == ((v0) obj).m5474unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5471equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5472hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5473toStringimpl(int i10) {
        return m5471equalsimpl0(i10, 0) ? VPCjETNfjxu.TvnfquPZcWUsx : m5471equalsimpl0(i10, f72379c) ? "Optional" : m5471equalsimpl0(i10, f72380d) ? "Async" : e2.h(')', "Invalid(value=", i10);
    }

    public boolean equals(Object obj) {
        return m5470equalsimpl(this.f72381a, obj);
    }

    public final int getValue() {
        return this.f72381a;
    }

    public int hashCode() {
        return m5472hashCodeimpl(this.f72381a);
    }

    public String toString() {
        return m5473toStringimpl(this.f72381a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5474unboximpl() {
        return this.f72381a;
    }
}
