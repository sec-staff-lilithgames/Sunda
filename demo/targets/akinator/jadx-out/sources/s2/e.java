package s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface e {
    float getDensity();

    float getFontScale();

    /* renamed from: roundToPx--R2X_6o */
    default int mo3418roundToPxR2X_6o(long j10) {
        return mv.d.roundToInt(mo3424toPxR2X_6o(j10));
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo3419roundToPx0680j_4(float f10) {
        float fMo3425toPx0680j_4 = mo3425toPx0680j_4(f10);
        if (Float.isInfinite(fMo3425toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return mv.d.roundToInt(fMo3425toPx0680j_4);
    }

    /* renamed from: toDp-GaN1DYA */
    default float mo3420toDpGaN1DYA(long j10) {
        if (!c0.m6765equalsimpl0(z.m6993getTypeUIouoOA(j10), c0.f85325b.m6742getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return i.m6817constructorimpl(getFontScale() * z.m6994getValueimpl(j10));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo3422toDpu2uoSUM(int i10) {
        return i.m6817constructorimpl(i10 / getDensity());
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo3423toDpSizekrfVVM(long j10) {
        return j10 != i1.o.f59366b.m4238getUnspecifiedNHjbRc() ? j.m6833DpSizeYgX7TsA(mo3421toDpu2uoSUM(i1.o.m4252getWidthimpl(j10)), mo3421toDpu2uoSUM(i1.o.m4249getHeightimpl(j10))) : o.f85348b.m6897getUnspecifiedMYxV2XQ();
    }

    /* renamed from: toPx--R2X_6o */
    default float mo3424toPxR2X_6o(long j10) {
        if (!c0.m6765equalsimpl0(z.m6993getTypeUIouoOA(j10), c0.f85325b.m6742getSpUIouoOA())) {
            throw new IllegalStateException("Only Sp can convert to Px");
        }
        return getDensity() * getFontScale() * z.m6994getValueimpl(j10);
    }

    /* renamed from: toPx-0680j_4 */
    default float mo3425toPx0680j_4(float f10) {
        return getDensity() * f10;
    }

    default i1.j toRect(m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return new i1.j(mo3425toPx0680j_4(mVar.m6894getLeftD9Ej5fM()), mo3425toPx0680j_4(mVar.m6896getTopD9Ej5fM()), mo3425toPx0680j_4(mVar.m6895getRightD9Ej5fM()), mo3425toPx0680j_4(mVar.m6893getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo3426toSizeXkaWNTQ(long j10) {
        return j10 != o.f85348b.m6897getUnspecifiedMYxV2XQ() ? i1.p.Size(mo3425toPx0680j_4(o.m6911getWidthD9Ej5fM(j10)), mo3425toPx0680j_4(o.m6909getHeightD9Ej5fM(j10))) : i1.o.f59366b.m4238getUnspecifiedNHjbRc();
    }

    /* renamed from: toSp-0xMU5do */
    default long mo3427toSp0xMU5do(float f10) {
        return a0.getSp(f10 / getFontScale());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo3429toSpkPz2Gy4(int i10) {
        return a0.getSp(i10 / (getDensity() * getFontScale()));
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo3428toSpkPz2Gy4(float f10) {
        return a0.getSp(f10 / (getDensity() * getFontScale()));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo3421toDpu2uoSUM(float f10) {
        return i.m6817constructorimpl(f10 / getDensity());
    }
}
