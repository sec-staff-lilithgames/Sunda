package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: b, reason: collision with root package name */
    public static final t2 f69011b = new t2(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f69012c = v2.TransformOrigin(0.5f, 0.5f);

    /* renamed from: a, reason: collision with root package name */
    public final long f69013a;

    public /* synthetic */ u2(long j10) {
        this.f69013a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ u2 m5005boximpl(long j10) {
        return new u2(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m5006component1impl(long j10) {
        return m5013getPivotFractionXimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m5007component2impl(long j10) {
        return m5014getPivotFractionYimpl(j10);
    }

    /* renamed from: copy-zey9I6w, reason: not valid java name */
    public static final long m5009copyzey9I6w(long j10, float f10, float f11) {
        return v2.TransformOrigin(f10, f11);
    }

    /* renamed from: copy-zey9I6w$default, reason: not valid java name */
    public static /* synthetic */ long m5010copyzey9I6w$default(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m5013getPivotFractionXimpl(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m5014getPivotFractionYimpl(j10);
        }
        return m5009copyzey9I6w(j10, f10, f11);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5011equalsimpl(long j10, Object obj) {
        return (obj instanceof u2) && j10 == ((u2) obj).m5017unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5012equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getPivotFractionX-impl, reason: not valid java name */
    public static final float m5013getPivotFractionXimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getPivotFractionY-impl, reason: not valid java name */
    public static final float m5014getPivotFractionYimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5015hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5016toStringimpl(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m5011equalsimpl(this.f69013a, obj);
    }

    public int hashCode() {
        return m5015hashCodeimpl(this.f69013a);
    }

    public String toString() {
        return m5016toStringimpl(this.f69013a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m5017unboximpl() {
        return this.f69013a;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m5008constructorimpl(long j10) {
        return j10;
    }
}
