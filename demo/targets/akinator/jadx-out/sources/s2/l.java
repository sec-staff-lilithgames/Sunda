package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final k f85340b = new k(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85341c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f85342d;

    /* renamed from: a, reason: collision with root package name */
    public final long f85343a;

    static {
        float f10 = 0;
        f85341c = j.m6832DpOffsetYgX7TsA(i.m6817constructorimpl(f10), i.m6817constructorimpl(f10));
        h hVar = i.f85335c;
        f85342d = j.m6832DpOffsetYgX7TsA(hVar.m6814getUnspecifiedD9Ej5fM(), hVar.m6814getUnspecifiedD9Ej5fM());
    }

    public /* synthetic */ l(long j10) {
        this.f85343a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ l m6868boximpl(long j10) {
        return new l(j10);
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m6870copytPigGR8(long j10, float f10, float f11) {
        return j.m6832DpOffsetYgX7TsA(f10, f11);
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m6871copytPigGR8$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m6874getXD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m6876getYD9Ej5fM(j10);
        }
        return m6870copytPigGR8(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6872equalsimpl(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).m6882unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6873equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m6874getXD9Ej5fM(long j10) {
        if (j10 != f85342d) {
            return i.m6817constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m6876getYD9Ej5fM(long j10) {
        if (j10 != f85342d) {
            return i.m6817constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6878hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m6879minusCBMgk4(long j10, long j11) {
        return j.m6832DpOffsetYgX7TsA(i.m6817constructorimpl(m6874getXD9Ej5fM(j10) - m6874getXD9Ej5fM(j11)), i.m6817constructorimpl(m6876getYD9Ej5fM(j10) - m6876getYD9Ej5fM(j11)));
    }

    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m6880plusCBMgk4(long j10, long j11) {
        return j.m6832DpOffsetYgX7TsA(i.m6817constructorimpl(m6874getXD9Ej5fM(j11) + m6874getXD9Ej5fM(j10)), i.m6817constructorimpl(m6876getYD9Ej5fM(j11) + m6876getYD9Ej5fM(j10)));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6881toStringimpl(long j10) {
        if (j10 == f85340b.m6866getUnspecifiedRKDOV3M()) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) i.m6828toStringimpl(m6874getXD9Ej5fM(j10))) + ", " + ((Object) i.m6828toStringimpl(m6876getYD9Ej5fM(j10))) + ')';
    }

    public boolean equals(Object obj) {
        return m6872equalsimpl(this.f85343a, obj);
    }

    public int hashCode() {
        return m6878hashCodeimpl(this.f85343a);
    }

    public String toString() {
        return m6881toStringimpl(this.f85343a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6882unboximpl() {
        return this.f85343a;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6875getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6877getYD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6869constructorimpl(long j10) {
        return j10;
    }
}
