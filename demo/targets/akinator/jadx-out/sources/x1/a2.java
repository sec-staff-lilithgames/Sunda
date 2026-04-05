package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a2 {
    public static final long ScaleFactor(float f10, float f11) {
        return z1.m7858constructorimpl((Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32));
    }

    public static final float access$roundToTenths(float f10) {
        float f11 = 10;
        float f12 = f10 * f11;
        int i10 = (int) f12;
        if (f12 - i10 >= 0.5f) {
            i10++;
        }
        return i10 / f11;
    }

    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m7816divUQTWf7w(long j10, long j11) {
        return i1.p.Size(i1.o.m4252getWidthimpl(j10) / z1.m7864getScaleXimpl(j11), i1.o.m4249getHeightimpl(j10) / z1.m7865getScaleYimpl(j11));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m7817isSpecifiedFK8aYYs(long j10) {
        return j10 != z1.f91456b.m7854getUnspecified_hLwfpc();
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m7819isUnspecifiedFK8aYYs(long j10) {
        return j10 == z1.f91456b.m7854getUnspecified_hLwfpc();
    }

    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m7821lerpbDIf60(long j10, long j11, float f10) {
        return ScaleFactor(t2.a.lerp(z1.m7864getScaleXimpl(j10), z1.m7864getScaleXimpl(j11), f10), t2.a.lerp(z1.m7865getScaleYimpl(j10), z1.m7865getScaleYimpl(j11), f10));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m7822takeOrElseoyDd2qo(long j10, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return j10 != z1.f91456b.m7854getUnspecified_hLwfpc() ? j10 : ((z1) block.invoke()).m7869unboximpl();
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m7823timesUQTWf7w(long j10, long j11) {
        return i1.p.Size(z1.m7864getScaleXimpl(j11) * i1.o.m4252getWidthimpl(j10), z1.m7865getScaleYimpl(j11) * i1.o.m4249getHeightimpl(j10));
    }

    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m7824timesmw2e94(long j10, long j11) {
        return m7823timesUQTWf7w(j11, j10);
    }

    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m7818isSpecifiedFK8aYYs$annotations(long j10) {
    }

    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m7820isUnspecifiedFK8aYYs$annotations(long j10) {
    }
}
