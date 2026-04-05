package z1;

import java.util.List;
import l1.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 implements l1.i, l1.e {

    /* renamed from: b, reason: collision with root package name */
    public final l1.a f97359b;

    /* renamed from: c, reason: collision with root package name */
    public m f97360c;

    /* JADX WARN: Multi-variable type inference failed */
    public n0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: draw-eZhPAX0$ui_release, reason: not valid java name */
    public final void m8047draweZhPAX0$ui_release(j1.e0 canvas, long j10, u0 layoutNodeWrapper, m drawEntity, kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNodeWrapper, "layoutNodeWrapper");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawEntity, "drawEntity");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        m mVar = this.f97360c;
        this.f97360c = drawEntity;
        l1.a aVar = this.f97359b;
        x1.a1 measureScope = layoutNodeWrapper.getMeasureScope();
        s2.x layoutDirection = layoutNodeWrapper.getMeasureScope().getLayoutDirection();
        a.C0738a drawParams = aVar.getDrawParams();
        s2.e eVarComponent1 = drawParams.component1();
        s2.x xVarComponent2 = drawParams.component2();
        j1.e0 e0VarComponent3 = drawParams.component3();
        long jM5316component4NHjbRc = drawParams.m5316component4NHjbRc();
        a.C0738a drawParams2 = aVar.getDrawParams();
        drawParams2.setDensity(measureScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5319setSizeuvyYCjk(j10);
        canvas.save();
        block.invoke(aVar);
        canvas.restore();
        a.C0738a drawParams3 = aVar.getDrawParams();
        drawParams3.setDensity(eVarComponent1);
        drawParams3.setLayoutDirection(xVarComponent2);
        drawParams3.setCanvas(e0VarComponent3);
        drawParams3.m5319setSizeuvyYCjk(jM5316component4NHjbRc);
        this.f97360c = mVar;
    }

    @Override // l1.i
    /* renamed from: drawArc-illE91I */
    public void mo5294drawArcillE91I(j1.b0 brush, float f10, float f11, boolean z10, long j10, long j11, float f12, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5294drawArcillE91I(brush, f10, f11, z10, j10, j11, f12, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawArc-yD3GUKo */
    public void mo5295drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5295drawArcyD3GUKo(j10, f10, f11, z10, j11, j12, f12, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawCircle-V9BoPsw */
    public void mo5296drawCircleV9BoPsw(j1.b0 brush, float f10, long j10, float f11, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5296drawCircleV9BoPsw(brush, f10, j10, f11, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawCircle-VaOC9Bg */
    public void mo5297drawCircleVaOC9Bg(long j10, float f10, long j11, float f11, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5297drawCircleVaOC9Bg(j10, f10, j11, f11, style, n0Var, i10);
    }

    @Override // l1.e
    public void drawContent() {
        j1.e0 canvas = ((l1.b) getDrawContext()).getCanvas();
        m mVar = this.f97360c;
        kotlin.jvm.internal.e0.checkNotNull(mVar);
        m mVar2 = (m) mVar.getNext();
        if (mVar2 != null) {
            mVar2.draw(canvas);
        } else {
            mVar.getLayoutNodeWrapper().performDraw(canvas);
        }
    }

    @Override // l1.i
    @tu.f
    /* renamed from: drawImage-9jGpkUE */
    public /* synthetic */ void mo5298drawImage9jGpkUE(j1.y0 image, long j10, long j11, long j12, long j13, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5298drawImage9jGpkUE(image, j10, j11, j12, j13, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawImage-AZ2fEMs */
    public void mo5299drawImageAZ2fEMs(j1.y0 image, long j10, long j11, long j12, long j13, float f10, l1.j style, j1.n0 n0Var, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5299drawImageAZ2fEMs(image, j10, j11, j12, j13, f10, style, n0Var, i10, i11);
    }

    @Override // l1.i
    /* renamed from: drawImage-gbVJVH8 */
    public void mo5300drawImagegbVJVH8(j1.y0 image, long j10, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5300drawImagegbVJVH8(image, j10, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawLine-1RTmtNc */
    public void mo5301drawLine1RTmtNc(j1.b0 brush, long j10, long j11, float f10, int i10, j1.m1 m1Var, float f11, j1.n0 n0Var, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        this.f97359b.mo5301drawLine1RTmtNc(brush, j10, j11, f10, i10, m1Var, f11, n0Var, i11);
    }

    @Override // l1.i
    /* renamed from: drawLine-NGM6Ib0 */
    public void mo5302drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, j1.m1 m1Var, float f11, j1.n0 n0Var, int i11) {
        this.f97359b.mo5302drawLineNGM6Ib0(j10, j11, j12, f10, i10, m1Var, f11, n0Var, i11);
    }

    @Override // l1.i
    /* renamed from: drawOval-AsUm42w */
    public void mo5303drawOvalAsUm42w(j1.b0 brush, long j10, long j11, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5303drawOvalAsUm42w(brush, j10, j11, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawOval-n-J9OG0 */
    public void mo5304drawOvalnJ9OG0(long j10, long j11, long j12, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5304drawOvalnJ9OG0(j10, j11, j12, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawPath-GBMwjPU */
    public void mo5305drawPathGBMwjPU(j1.l1 path, j1.b0 brush, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5305drawPathGBMwjPU(path, brush, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawPath-LG529CI */
    public void mo5306drawPathLG529CI(j1.l1 path, long j10, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(path, "path");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5306drawPathLG529CI(path, j10, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawPoints-F8ZwMP8 */
    public void mo5307drawPointsF8ZwMP8(List<i1.h> points, int i10, long j10, float f10, int i11, j1.m1 m1Var, float f11, j1.n0 n0Var, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(points, "points");
        this.f97359b.mo5307drawPointsF8ZwMP8(points, i10, j10, f10, i11, m1Var, f11, n0Var, i12);
    }

    @Override // l1.i
    /* renamed from: drawPoints-Gsft0Ws */
    public void mo5308drawPointsGsft0Ws(List<i1.h> points, int i10, j1.b0 brush, float f10, int i11, j1.m1 m1Var, float f11, j1.n0 n0Var, int i12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(points, "points");
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        this.f97359b.mo5308drawPointsGsft0Ws(points, i10, brush, f10, i11, m1Var, f11, n0Var, i12);
    }

    @Override // l1.i
    /* renamed from: drawRect-AsUm42w */
    public void mo5309drawRectAsUm42w(j1.b0 brush, long j10, long j11, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5309drawRectAsUm42w(brush, j10, j11, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawRect-n-J9OG0 */
    public void mo5310drawRectnJ9OG0(long j10, long j11, long j12, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5310drawRectnJ9OG0(j10, j11, j12, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawRoundRect-ZuiqVtQ */
    public void mo5311drawRoundRectZuiqVtQ(j1.b0 brush, long j10, long j11, long j12, float f10, l1.j style, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(brush, "brush");
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5311drawRoundRectZuiqVtQ(brush, j10, j11, j12, f10, style, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: drawRoundRect-u-Aw5IA */
    public void mo5312drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, l1.j style, float f10, j1.n0 n0Var, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(style, "style");
        this.f97359b.mo5312drawRoundRectuAw5IA(j10, j11, j12, j13, style, f10, n0Var, i10);
    }

    @Override // l1.i
    /* renamed from: getCenter-F1C5BW0 */
    public long mo5313getCenterF1C5BW0() {
        return this.f97359b.mo5313getCenterF1C5BW0();
    }

    @Override // l1.i, s2.e
    public float getDensity() {
        return this.f97359b.getDensity();
    }

    @Override // l1.i
    public l1.f getDrawContext() {
        return this.f97359b.getDrawContext();
    }

    @Override // l1.i, s2.e
    public float getFontScale() {
        return this.f97359b.getFontScale();
    }

    @Override // l1.i
    public s2.x getLayoutDirection() {
        return this.f97359b.getLayoutDirection();
    }

    @Override // l1.i
    /* renamed from: getSize-NH-jbRc */
    public long mo5314getSizeNHjbRc() {
        return this.f97359b.mo5314getSizeNHjbRc();
    }

    @Override // l1.i, s2.e
    /* renamed from: roundToPx--R2X_6o */
    public int mo3418roundToPxR2X_6o(long j10) {
        return this.f97359b.mo3418roundToPxR2X_6o(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: roundToPx-0680j_4 */
    public int mo3419roundToPx0680j_4(float f10) {
        return this.f97359b.mo3419roundToPx0680j_4(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-GaN1DYA */
    public float mo3420toDpGaN1DYA(long j10) {
        return this.f97359b.mo3420toDpGaN1DYA(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3421toDpu2uoSUM(float f10) {
        return this.f97359b.mo3421toDpu2uoSUM(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public long mo3423toDpSizekrfVVM(long j10) {
        return this.f97359b.mo3423toDpSizekrfVVM(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toPx--R2X_6o */
    public float mo3424toPxR2X_6o(long j10) {
        return this.f97359b.mo3424toPxR2X_6o(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toPx-0680j_4 */
    public float mo3425toPx0680j_4(float f10) {
        return this.f97359b.mo3425toPx0680j_4(f10);
    }

    @Override // l1.i, s2.e
    public i1.j toRect(s2.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return this.f97359b.toRect(mVar);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSize-XkaWNTQ */
    public long mo3426toSizeXkaWNTQ(long j10) {
        return this.f97359b.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-0xMU5do */
    public long mo3427toSp0xMU5do(float f10) {
        return this.f97359b.mo3427toSp0xMU5do(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3428toSpkPz2Gy4(float f10) {
        return this.f97359b.mo3428toSpkPz2Gy4(f10);
    }

    public n0(l1.a canvasDrawScope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvasDrawScope, "canvasDrawScope");
        this.f97359b = canvasDrawScope;
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3422toDpu2uoSUM(int i10) {
        return this.f97359b.mo3422toDpu2uoSUM(i10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3429toSpkPz2Gy4(int i10) {
        return this.f97359b.mo3429toSpkPz2Gy4(i10);
    }

    public /* synthetic */ n0(l1.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? new l1.a() : aVar);
    }
}
