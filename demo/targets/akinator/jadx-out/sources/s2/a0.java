package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {
    /* renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m6724TextUnitanM5pPY(float f10, long j10) {
        return pack(j10, f10);
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m6725checkArithmeticR2X_6o(long j10) {
        if (m6730isUnspecifiedR2X_6o(j10)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m6726checkArithmeticNB67dxo(long j10, long j11) {
        if (m6730isUnspecifiedR2X_6o(j10) || m6730isUnspecifiedR2X_6o(j11)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (c0.m6765equalsimpl0(z.m6993getTypeUIouoOA(j10), z.m6993getTypeUIouoOA(j11))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) c0.m6767toStringimpl(z.m6993getTypeUIouoOA(j10))) + " and " + ((Object) c0.m6767toStringimpl(z.m6993getTypeUIouoOA(j11)))).toString());
    }

    /* renamed from: checkArithmetic-vU-0ePk, reason: not valid java name */
    public static final void m6727checkArithmeticvU0ePk(long j10, long j11, long j12) {
        if (m6730isUnspecifiedR2X_6o(j10) || m6730isUnspecifiedR2X_6o(j11) || m6730isUnspecifiedR2X_6o(j12)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (c0.m6765equalsimpl0(z.m6993getTypeUIouoOA(j10), z.m6993getTypeUIouoOA(j11)) && c0.m6765equalsimpl0(z.m6993getTypeUIouoOA(j11), z.m6993getTypeUIouoOA(j12))) {
            return;
        }
        throw new IllegalArgumentException(("Cannot perform operation for " + ((Object) c0.m6767toStringimpl(z.m6993getTypeUIouoOA(j10))) + " and " + ((Object) c0.m6767toStringimpl(z.m6993getTypeUIouoOA(j11)))).toString());
    }

    public static final long getEm(float f10) {
        return pack(8589934592L, f10);
    }

    public static /* synthetic */ void getEm$annotations(double d10) {
    }

    public static final long getSp(float f10) {
        return pack(4294967296L, f10);
    }

    public static /* synthetic */ void getSp$annotations(double d10) {
    }

    /* renamed from: isSpecified--R2X_6o, reason: not valid java name */
    public static final boolean m6728isSpecifiedR2X_6o(long j10) {
        return !m6730isUnspecifiedR2X_6o(j10);
    }

    /* renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m6730isUnspecifiedR2X_6o(long j10) {
        return z.m6992getRawTypeimpl(j10) == 0;
    }

    /* renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m6732lerpC3pnCVY(long j10, long j11, float f10) {
        m6726checkArithmeticNB67dxo(j10, j11);
        return pack(z.m6992getRawTypeimpl(j10), t2.a.lerp(z.m6994getValueimpl(j10), z.m6994getValueimpl(j11), f10));
    }

    public static final long pack(long j10, float f10) {
        return z.m6986constructorimpl(j10 | (Float.floatToIntBits(f10) & 4294967295L));
    }

    /* renamed from: takeOrElse-eAf_CNQ, reason: not valid java name */
    public static final long m6733takeOrElseeAf_CNQ(long j10, kv.a block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return !m6730isUnspecifiedR2X_6o(j10) ? j10 : ((z) block.invoke()).m7003unboximpl();
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6735timesmpE4wyQ(float f10, long j10) {
        m6725checkArithmeticR2X_6o(j10);
        return pack(z.m6992getRawTypeimpl(j10), z.m6994getValueimpl(j10) * f10);
    }

    public static final long getEm(double d10) {
        return pack(8589934592L, (float) d10);
    }

    public static /* synthetic */ void getEm$annotations(float f10) {
    }

    public static final long getSp(double d10) {
        return pack(4294967296L, (float) d10);
    }

    public static /* synthetic */ void getSp$annotations(float f10) {
    }

    public static final long getEm(int i10) {
        return pack(8589934592L, i10);
    }

    public static /* synthetic */ void getEm$annotations(int i10) {
    }

    public static final long getSp(int i10) {
        return pack(4294967296L, i10);
    }

    public static /* synthetic */ void getSp$annotations(int i10) {
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6734timesmpE4wyQ(double d10, long j10) {
        m6725checkArithmeticR2X_6o(j10);
        return pack(z.m6992getRawTypeimpl(j10), z.m6994getValueimpl(j10) * ((float) d10));
    }

    /* renamed from: times-mpE4wyQ, reason: not valid java name */
    public static final long m6736timesmpE4wyQ(int i10, long j10) {
        m6725checkArithmeticR2X_6o(j10);
        return pack(z.m6992getRawTypeimpl(j10), z.m6994getValueimpl(j10) * i10);
    }

    /* renamed from: isSpecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m6729isSpecifiedR2X_6o$annotations(long j10) {
    }

    /* renamed from: isUnspecified--R2X_6o$annotations, reason: not valid java name */
    public static /* synthetic */ void m6731isUnspecifiedR2X_6o$annotations(long j10) {
    }
}
