package l1;

import j1.b0;
import j1.l1;
import j1.m1;
import j1.n0;
import j1.y0;
import java.util.List;
import s2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface e extends i {
    @Override // l1.i
    /* renamed from: drawArc-illE91I */
    /* synthetic */ void mo5294drawArcillE91I(b0 b0Var, float f10, float f11, boolean z10, long j10, long j11, float f12, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawArc-yD3GUKo */
    /* synthetic */ void mo5295drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawCircle-V9BoPsw */
    /* synthetic */ void mo5296drawCircleV9BoPsw(b0 b0Var, float f10, long j10, float f11, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawCircle-VaOC9Bg */
    /* synthetic */ void mo5297drawCircleVaOC9Bg(long j10, float f10, long j11, float f11, j jVar, n0 n0Var, int i10);

    void drawContent();

    @Override // l1.i
    @tu.f
    /* renamed from: drawImage-9jGpkUE */
    /* synthetic */ void mo5298drawImage9jGpkUE(y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawImage-AZ2fEMs */
    /* bridge */ /* synthetic */ default void mo5299drawImageAZ2fEMs(y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, n0 n0Var, int i10, int i11) {
        super.mo5299drawImageAZ2fEMs(y0Var, j10, j11, j12, j13, f10, jVar, n0Var, i10, i11);
    }

    @Override // l1.i
    /* renamed from: drawImage-gbVJVH8 */
    /* synthetic */ void mo5300drawImagegbVJVH8(y0 y0Var, long j10, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawLine-1RTmtNc */
    /* synthetic */ void mo5301drawLine1RTmtNc(b0 b0Var, long j10, long j11, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11);

    @Override // l1.i
    /* renamed from: drawLine-NGM6Ib0 */
    /* synthetic */ void mo5302drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11);

    @Override // l1.i
    /* renamed from: drawOval-AsUm42w */
    /* synthetic */ void mo5303drawOvalAsUm42w(b0 b0Var, long j10, long j11, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawOval-n-J9OG0 */
    /* synthetic */ void mo5304drawOvalnJ9OG0(long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawPath-GBMwjPU */
    /* synthetic */ void mo5305drawPathGBMwjPU(l1 l1Var, b0 b0Var, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawPath-LG529CI */
    /* synthetic */ void mo5306drawPathLG529CI(l1 l1Var, long j10, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawPoints-F8ZwMP8 */
    /* synthetic */ void mo5307drawPointsF8ZwMP8(List list, int i10, long j10, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12);

    @Override // l1.i
    /* renamed from: drawPoints-Gsft0Ws */
    /* synthetic */ void mo5308drawPointsGsft0Ws(List list, int i10, b0 b0Var, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12);

    @Override // l1.i
    /* renamed from: drawRect-AsUm42w */
    /* synthetic */ void mo5309drawRectAsUm42w(b0 b0Var, long j10, long j11, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawRect-n-J9OG0 */
    /* synthetic */ void mo5310drawRectnJ9OG0(long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawRoundRect-ZuiqVtQ */
    /* synthetic */ void mo5311drawRoundRectZuiqVtQ(b0 b0Var, long j10, long j11, long j12, float f10, j jVar, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: drawRoundRect-u-Aw5IA */
    /* synthetic */ void mo5312drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, j jVar, float f10, n0 n0Var, int i10);

    @Override // l1.i
    /* renamed from: getCenter-F1C5BW0 */
    /* bridge */ /* synthetic */ default long mo5313getCenterF1C5BW0() {
        return super.mo5313getCenterF1C5BW0();
    }

    @Override // l1.i, s2.e
    /* synthetic */ float getDensity();

    @Override // l1.i
    /* synthetic */ f getDrawContext();

    @Override // l1.i, s2.e
    /* synthetic */ float getFontScale();

    @Override // l1.i
    /* synthetic */ x getLayoutDirection();

    @Override // l1.i
    /* renamed from: getSize-NH-jbRc */
    /* bridge */ /* synthetic */ default long mo5314getSizeNHjbRc() {
        return super.mo5314getSizeNHjbRc();
    }

    @Override // l1.i, s2.e
    /* renamed from: roundToPx--R2X_6o */
    /* bridge */ /* synthetic */ default int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: roundToPx-0680j_4 */
    /* bridge */ /* synthetic */ default int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-GaN1DYA */
    /* bridge */ /* synthetic */ default float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    /* bridge */ /* synthetic */ default long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toPx--R2X_6o */
    /* bridge */ /* synthetic */ default float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toPx-0680j_4 */
    /* bridge */ /* synthetic */ default float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // l1.i, s2.e
    /* bridge */ /* synthetic */ default i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSize-XkaWNTQ */
    /* bridge */ /* synthetic */ default long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-0xMU5do */
    /* bridge */ /* synthetic */ default long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-u2uoSUM */
    /* bridge */ /* synthetic */ default float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    /* bridge */ /* synthetic */ default long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }
}
