package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    /* renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m6832DpOffsetYgX7TsA(float f10, float f11) {
        return l.m6869constructorimpl((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m6833DpSizeYgX7TsA(float f10, float f11) {
        return o.m6902constructorimpl((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    /* renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m6834coerceAtLeastYgX7TsA(float f10, float f11) {
        return i.m6817constructorimpl(qv.v.coerceAtLeast(f10, f11));
    }

    /* renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m6835coerceAtMostYgX7TsA(float f10, float f11) {
        return i.m6817constructorimpl(qv.v.coerceAtMost(f10, f11));
    }

    /* renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m6836coerceIn2z7ARbQ(float f10, float f11, float f12) {
        return i.m6817constructorimpl(qv.v.coerceIn(f10, f11, f12));
    }

    /* renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m6837getCenterEaSLcWc(long j10) {
        return m6832DpOffsetYgX7TsA(i.m6817constructorimpl(o.m6911getWidthD9Ej5fM(j10) / 2.0f), i.m6817constructorimpl(o.m6909getHeightD9Ej5fM(j10) / 2.0f));
    }

    public static final float getDp(int i10) {
        return i.m6817constructorimpl(i10);
    }

    public static /* synthetic */ void getDp$annotations(double d10) {
    }

    public static final float getHeight(m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return i.m6817constructorimpl(mVar.m6893getBottomD9Ej5fM() - mVar.m6896getTopD9Ej5fM());
    }

    public static final long getSize(m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return m6833DpSizeYgX7TsA(i.m6817constructorimpl(mVar.m6895getRightD9Ej5fM() - mVar.m6894getLeftD9Ej5fM()), i.m6817constructorimpl(mVar.m6893getBottomD9Ej5fM() - mVar.m6896getTopD9Ej5fM()));
    }

    public static final float getWidth(m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return i.m6817constructorimpl(mVar.m6895getRightD9Ej5fM() - mVar.m6894getLeftD9Ej5fM());
    }

    /* renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m6839isFinite0680j_4(float f10) {
        return !(f10 == Float.POSITIVE_INFINITY);
    }

    /* renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m6841isSpecified0680j_4(float f10) {
        return !Float.isNaN(f10);
    }

    /* renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6843isSpecifiedEaSLcWc(long j10) {
        return j10 != o.f85348b.m6897getUnspecifiedMYxV2XQ();
    }

    /* renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6845isSpecifiedjoFl9I(long j10) {
        return j10 != l.f85340b.m6866getUnspecifiedRKDOV3M();
    }

    /* renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m6847isUnspecified0680j_4(float f10) {
        return Float.isNaN(f10);
    }

    /* renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6849isUnspecifiedEaSLcWc(long j10) {
        return j10 == o.f85348b.m6897getUnspecifiedMYxV2XQ();
    }

    /* renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6851isUnspecifiedjoFl9I(long j10) {
        return j10 == l.f85340b.m6866getUnspecifiedRKDOV3M();
    }

    /* renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m6853lerpIDex15A(long j10, long j11, float f10) {
        return m6833DpSizeYgX7TsA(m6854lerpMdfbLM(o.m6911getWidthD9Ej5fM(j10), o.m6911getWidthD9Ej5fM(j11), f10), m6854lerpMdfbLM(o.m6909getHeightD9Ej5fM(j10), o.m6909getHeightD9Ej5fM(j11), f10));
    }

    /* renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m6854lerpMdfbLM(float f10, float f11, float f12) {
        return i.m6817constructorimpl(t2.a.lerp(f10, f11, f12));
    }

    /* renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m6855lerpxhh869w(long j10, long j11, float f10) {
        return m6832DpOffsetYgX7TsA(m6854lerpMdfbLM(l.m6874getXD9Ej5fM(j10), l.m6874getXD9Ej5fM(j11), f10), m6854lerpMdfbLM(l.m6876getYD9Ej5fM(j10), l.m6876getYD9Ej5fM(j11), f10));
    }

    /* renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m6856maxYgX7TsA(float f10, float f11) {
        return i.m6817constructorimpl(Math.max(f10, f11));
    }

    /* renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m6857minYgX7TsA(float f10, float f11) {
        return i.m6817constructorimpl(Math.min(f10, f11));
    }

    /* renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m6858takeOrElseD5KLDUw(float f10, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return !Float.isNaN(f10) ? f10 : ((i) block.invoke()).m6831unboximpl();
    }

    /* renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m6859takeOrElsegVKV90s(long j10, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return j10 != l.f85340b.m6866getUnspecifiedRKDOV3M() ? j10 : ((l) block.invoke()).m6882unboximpl();
    }

    /* renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m6860takeOrElseitqla9I(long j10, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return j10 != o.f85348b.m6897getUnspecifiedMYxV2XQ() ? j10 : ((o) block.invoke()).m6919unboximpl();
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6862times3ABfNKs(float f10, float f11) {
        return i.m6817constructorimpl(f10 * f11);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6865times6HolHcs(int i10, long j10) {
        return o.m6917timesGh9hcWk(j10, i10);
    }

    public static final float getDp(double d10) {
        return i.m6817constructorimpl((float) d10);
    }

    public static /* synthetic */ void getDp$annotations(float f10) {
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6861times3ABfNKs(double d10, float f10) {
        return i.m6817constructorimpl(((float) d10) * f10);
    }

    /* renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6864times6HolHcs(float f10, long j10) {
        return o.m6916timesGh9hcWk(j10, f10);
    }

    public static final float getDp(float f10) {
        return i.m6817constructorimpl(f10);
    }

    public static /* synthetic */ void getDp$annotations(int i10) {
    }

    /* renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6863times3ABfNKs(int i10, float f10) {
        return i.m6817constructorimpl(i10 * f10);
    }

    /* renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6838getCenterEaSLcWc$annotations(long j10) {
    }

    public static /* synthetic */ void getHeight$annotations(m mVar) {
    }

    public static /* synthetic */ void getSize$annotations(m mVar) {
    }

    public static /* synthetic */ void getWidth$annotations(m mVar) {
    }

    /* renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6840isFinite0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6842isSpecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6844isSpecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6846isSpecifiedjoFl9I$annotations(long j10) {
    }

    /* renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6848isUnspecified0680j_4$annotations(float f10) {
    }

    /* renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6850isUnspecifiedEaSLcWc$annotations(long j10) {
    }

    /* renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6852isUnspecifiedjoFl9I$annotations(long j10) {
    }
}
