package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final n f85348b = new n(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85349c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f85350d;

    /* renamed from: a, reason: collision with root package name */
    public final long f85351a;

    static {
        float f10 = 0;
        f85349c = j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(f10), i.m6817constructorimpl(f10));
        h hVar = i.f85335c;
        f85350d = j.m6833DpSizeYgX7TsA(hVar.m6814getUnspecifiedD9Ej5fM(), hVar.m6814getUnspecifiedD9Ej5fM());
    }

    public /* synthetic */ o(long j10) {
        this.f85351a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ o m6899boximpl(long j10) {
        return new o(j10);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public static final float m6900component1D9Ej5fM(long j10) {
        return m6911getWidthD9Ej5fM(j10);
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name */
    public static final float m6901component2D9Ej5fM(long j10) {
        return m6909getHeightD9Ej5fM(j10);
    }

    /* renamed from: copy-DwJknco, reason: not valid java name */
    public static final long m6903copyDwJknco(long j10, float f10, float f11) {
        return j.m6833DpSizeYgX7TsA(f10, f11);
    }

    /* renamed from: copy-DwJknco$default, reason: not valid java name */
    public static /* synthetic */ long m6904copyDwJknco$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m6911getWidthD9Ej5fM(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m6909getHeightD9Ej5fM(j10);
        }
        return m6903copyDwJknco(j10, f10, f11);
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m6906divGh9hcWk(long j10, int i10) {
        float f10 = i10;
        return j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(m6911getWidthD9Ej5fM(j10) / f10), i.m6817constructorimpl(m6909getHeightD9Ej5fM(j10) / f10));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6907equalsimpl(long j10, Object obj) {
        return (obj instanceof o) && j10 == ((o) obj).m6919unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6908equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getHeight-D9Ej5fM, reason: not valid java name */
    public static final float m6909getHeightD9Ej5fM(long j10) {
        if (j10 != f85350d) {
            return i.m6817constructorimpl(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public static final float m6911getWidthD9Ej5fM(long j10) {
        if (j10 != f85350d) {
            return i.m6817constructorimpl(Float.intBitsToFloat((int) (j10 >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6913hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: minus-e_xh8Ic, reason: not valid java name */
    public static final long m6914minuse_xh8Ic(long j10, long j11) {
        return j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(m6911getWidthD9Ej5fM(j10) - m6911getWidthD9Ej5fM(j11)), i.m6817constructorimpl(m6909getHeightD9Ej5fM(j10) - m6909getHeightD9Ej5fM(j11)));
    }

    /* renamed from: plus-e_xh8Ic, reason: not valid java name */
    public static final long m6915pluse_xh8Ic(long j10, long j11) {
        return j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(m6911getWidthD9Ej5fM(j11) + m6911getWidthD9Ej5fM(j10)), i.m6817constructorimpl(m6909getHeightD9Ej5fM(j11) + m6909getHeightD9Ej5fM(j10)));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m6917timesGh9hcWk(long j10, int i10) {
        float f10 = i10;
        return j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(m6911getWidthD9Ej5fM(j10) * f10), i.m6817constructorimpl(m6909getHeightD9Ej5fM(j10) * f10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6918toStringimpl(long j10) {
        if (j10 == f85348b.m6897getUnspecifiedMYxV2XQ()) {
            return "DpSize.Unspecified";
        }
        return ((Object) i.m6828toStringimpl(m6911getWidthD9Ej5fM(j10))) + " x " + ((Object) i.m6828toStringimpl(m6909getHeightD9Ej5fM(j10)));
    }

    public boolean equals(Object obj) {
        return m6907equalsimpl(this.f85351a, obj);
    }

    public int hashCode() {
        return m6913hashCodeimpl(this.f85351a);
    }

    public String toString() {
        return m6918toStringimpl(this.f85351a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6919unboximpl() {
        return this.f85351a;
    }

    /* renamed from: div-Gh9hcWk, reason: not valid java name */
    public static final long m6905divGh9hcWk(long j10, float f10) {
        return j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(m6911getWidthD9Ej5fM(j10) / f10), i.m6817constructorimpl(m6909getHeightD9Ej5fM(j10) / f10));
    }

    /* renamed from: times-Gh9hcWk, reason: not valid java name */
    public static final long m6916timesGh9hcWk(long j10, float f10) {
        return j.m6833DpSizeYgX7TsA(i.m6817constructorimpl(m6911getWidthD9Ej5fM(j10) * f10), i.m6817constructorimpl(m6909getHeightD9Ej5fM(j10) * f10));
    }

    /* renamed from: getHeight-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6910getHeightD9Ej5fM$annotations() {
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getWidth-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m6912getWidthD9Ej5fM$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6902constructorimpl(long j10) {
        return j10;
    }
}
