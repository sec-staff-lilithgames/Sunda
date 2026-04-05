package l1;

import i1.o;
import j1.b0;
import j1.i1;
import j1.k1;
import j1.l1;
import j1.l2;
import j1.m0;
import j1.m1;
import j1.n0;
import j1.n2;
import j1.r0;
import j1.x;
import j1.y0;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements i {

    /* renamed from: b, reason: collision with root package name */
    public final C0738a f72219b = new C0738a(null, null, null, 0, 15, null);

    /* renamed from: c, reason: collision with root package name */
    public final b f72220c = new b(this);

    /* renamed from: e, reason: collision with root package name */
    public i1 f72221e;

    /* renamed from: f, reason: collision with root package name */
    public i1 f72222f;

    public static i1 b(a aVar, long j10, j jVar, float f10, n0 n0Var, int i10) {
        int iM5345getDefaultFilterQualityfv9h1I = i.O8.m5345getDefaultFilterQualityfv9h1I();
        i1 i1VarH = aVar.h(jVar);
        if (f10 != 1.0f) {
            j10 = m0.m4857copywmQWz5c$default(j10, m0.m4860getAlphaimpl(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
        }
        if (!m0.m4859equalsimpl0(i1VarH.mo4766getColor0d7_KjU(), j10)) {
            i1VarH.mo4772setColor8_81llA(j10);
        }
        if (i1VarH.getShader() != null) {
            i1VarH.setShader(null);
        }
        if (!e0.areEqual(i1VarH.getColorFilter(), n0Var)) {
            i1VarH.setColorFilter(n0Var);
        }
        if (!x.m5070equalsimpl0(i1VarH.mo4765getBlendMode0nO6VwU(), i10)) {
            i1VarH.mo4771setBlendModes9anfk8(i10);
        }
        if (!r0.m4922equalsimpl0(i1VarH.mo4767getFilterQualityfv9h1I(), iM5345getDefaultFilterQualityfv9h1I)) {
            i1VarH.mo4773setFilterQualityvDHp3xo(iM5345getDefaultFilterQualityfv9h1I);
        }
        return i1VarH;
    }

    public static /* synthetic */ i1 d(a aVar, b0 b0Var, j jVar, float f10, n0 n0Var, int i10) {
        return aVar.c(b0Var, jVar, f10, n0Var, i10, i.O8.m5345getDefaultFilterQualityfv9h1I());
    }

    public static i1 e(a aVar, long j10, float f10, int i10, int i11, m1 m1Var, float f11, n0 n0Var, int i12) {
        int iM5345getDefaultFilterQualityfv9h1I = i.O8.m5345getDefaultFilterQualityfv9h1I();
        i1 i1VarG = aVar.g();
        long jM4857copywmQWz5c$default = f11 == 1.0f ? j10 : m0.m4857copywmQWz5c$default(j10, m0.m4860getAlphaimpl(j10) * f11, 0.0f, 0.0f, 0.0f, 14, null);
        if (!m0.m4859equalsimpl0(i1VarG.mo4766getColor0d7_KjU(), jM4857copywmQWz5c$default)) {
            i1VarG.mo4772setColor8_81llA(jM4857copywmQWz5c$default);
        }
        if (i1VarG.getShader() != null) {
            i1VarG.setShader(null);
        }
        if (!e0.areEqual(i1VarG.getColorFilter(), n0Var)) {
            i1VarG.setColorFilter(n0Var);
        }
        if (!x.m5070equalsimpl0(i1VarG.mo4765getBlendMode0nO6VwU(), i12)) {
            i1VarG.mo4771setBlendModes9anfk8(i12);
        }
        if (i1VarG.getStrokeWidth() != f10) {
            i1VarG.setStrokeWidth(f10);
        }
        if (i1VarG.getStrokeMiterLimit() != 4.0f) {
            i1VarG.setStrokeMiterLimit(4.0f);
        }
        if (!l2.m4844equalsimpl0(i1VarG.mo4768getStrokeCapKaPHkGw(), i10)) {
            i1VarG.mo4774setStrokeCapBeK7IIE(i10);
        }
        if (!n2.m4881equalsimpl0(i1VarG.mo4769getStrokeJoinLxFBmk8(), i11)) {
            i1VarG.mo4775setStrokeJoinWw9F2mQ(i11);
        }
        if (!e0.areEqual(i1VarG.getPathEffect(), m1Var)) {
            i1VarG.setPathEffect(m1Var);
        }
        if (!r0.m4922equalsimpl0(i1VarG.mo4767getFilterQualityfv9h1I(), iM5345getDefaultFilterQualityfv9h1I)) {
            i1VarG.mo4773setFilterQualityvDHp3xo(iM5345getDefaultFilterQualityfv9h1I);
        }
        return i1VarG;
    }

    public static i1 f(a aVar, b0 b0Var, float f10, int i10, int i11, m1 m1Var, float f11, n0 n0Var, int i12) {
        int iM5345getDefaultFilterQualityfv9h1I = i.O8.m5345getDefaultFilterQualityfv9h1I();
        i1 i1VarG = aVar.g();
        if (b0Var != null) {
            b0Var.mo4671applyToPq9zytI(aVar.mo5314getSizeNHjbRc(), i1VarG, f11);
        } else if (i1VarG.getAlpha() != f11) {
            i1VarG.setAlpha(f11);
        }
        if (!e0.areEqual(i1VarG.getColorFilter(), n0Var)) {
            i1VarG.setColorFilter(n0Var);
        }
        if (!x.m5070equalsimpl0(i1VarG.mo4765getBlendMode0nO6VwU(), i12)) {
            i1VarG.mo4771setBlendModes9anfk8(i12);
        }
        if (i1VarG.getStrokeWidth() != f10) {
            i1VarG.setStrokeWidth(f10);
        }
        if (i1VarG.getStrokeMiterLimit() != 4.0f) {
            i1VarG.setStrokeMiterLimit(4.0f);
        }
        if (!l2.m4844equalsimpl0(i1VarG.mo4768getStrokeCapKaPHkGw(), i10)) {
            i1VarG.mo4774setStrokeCapBeK7IIE(i10);
        }
        if (!n2.m4881equalsimpl0(i1VarG.mo4769getStrokeJoinLxFBmk8(), i11)) {
            i1VarG.mo4775setStrokeJoinWw9F2mQ(i11);
        }
        if (!e0.areEqual(i1VarG.getPathEffect(), m1Var)) {
            i1VarG.setPathEffect(m1Var);
        }
        if (!r0.m4922equalsimpl0(i1VarG.mo4767getFilterQualityfv9h1I(), iM5345getDefaultFilterQualityfv9h1I)) {
            i1VarG.mo4773setFilterQualityvDHp3xo(iM5345getDefaultFilterQualityfv9h1I);
        }
        return i1VarG;
    }

    public final i1 c(b0 b0Var, j jVar, float f10, n0 n0Var, int i10, int i11) {
        i1 i1VarH = h(jVar);
        if (b0Var != null) {
            b0Var.mo4671applyToPq9zytI(mo5314getSizeNHjbRc(), i1VarH, f10);
        } else if (i1VarH.getAlpha() != f10) {
            i1VarH.setAlpha(f10);
        }
        if (!e0.areEqual(i1VarH.getColorFilter(), n0Var)) {
            i1VarH.setColorFilter(n0Var);
        }
        if (!x.m5070equalsimpl0(i1VarH.mo4765getBlendMode0nO6VwU(), i10)) {
            i1VarH.mo4771setBlendModes9anfk8(i10);
        }
        if (!r0.m4922equalsimpl0(i1VarH.mo4767getFilterQualityfv9h1I(), i11)) {
            i1VarH.mo4773setFilterQualityvDHp3xo(i11);
        }
        return i1VarH;
    }

    /* renamed from: draw-yzxVdVo, reason: not valid java name */
    public final void m5293drawyzxVdVo(s2.e density, s2.x layoutDirection, j1.e0 canvas, long j10, kv.l block) {
        e0.checkNotNullParameter(density, "density");
        e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        e0.checkNotNullParameter(canvas, "canvas");
        e0.checkNotNullParameter(block, "block");
        C0738a drawParams = getDrawParams();
        s2.e eVarComponent1 = drawParams.component1();
        s2.x xVarComponent2 = drawParams.component2();
        j1.e0 e0VarComponent3 = drawParams.component3();
        long jM5316component4NHjbRc = drawParams.m5316component4NHjbRc();
        C0738a drawParams2 = getDrawParams();
        drawParams2.setDensity(density);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m5319setSizeuvyYCjk(j10);
        canvas.save();
        block.invoke(this);
        canvas.restore();
        C0738a drawParams3 = getDrawParams();
        drawParams3.setDensity(eVarComponent1);
        drawParams3.setLayoutDirection(xVarComponent2);
        drawParams3.setCanvas(e0VarComponent3);
        drawParams3.m5319setSizeuvyYCjk(jM5316component4NHjbRc);
    }

    @Override // l1.i
    /* renamed from: drawArc-illE91I, reason: not valid java name */
    public void mo5294drawArcillE91I(b0 brush, float f10, float f11, boolean z10, long j10, long j11, float f12, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(brush, "brush");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawArc(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), o.m4252getWidthimpl(j11) + i1.h.m4185getXimpl(j10), o.m4249getHeightimpl(j11) + i1.h.m4186getYimpl(j10), f10, f11, z10, d(this, brush, style, f12, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawArc-yD3GUKo, reason: not valid java name */
    public void mo5295drawArcyD3GUKo(long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawArc(i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11), o.m4252getWidthimpl(j12) + i1.h.m4185getXimpl(j11), o.m4249getHeightimpl(j12) + i1.h.m4186getYimpl(j11), f10, f11, z10, b(this, j10, style, f12, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawCircle-V9BoPsw, reason: not valid java name */
    public void mo5296drawCircleV9BoPsw(b0 brush, float f10, long j10, float f11, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(brush, "brush");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().mo4700drawCircle9KIMszo(j10, f10, d(this, brush, style, f11, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawCircle-VaOC9Bg, reason: not valid java name */
    public void mo5297drawCircleVaOC9Bg(long j10, float f10, long j11, float f11, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().mo4700drawCircle9KIMszo(j11, f10, b(this, j10, style, f11, n0Var, i10));
    }

    @Override // l1.i
    @tu.f
    /* renamed from: drawImage-9jGpkUE, reason: not valid java name */
    public /* synthetic */ void mo5298drawImage9jGpkUE(y0 image, long j10, long j11, long j12, long j13, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(image, "image");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().mo4702drawImageRectHPBpro0(image, j10, j11, j12, j13, d(this, null, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
    public void mo5299drawImageAZ2fEMs(y0 image, long j10, long j11, long j12, long j13, float f10, j style, n0 n0Var, int i10, int i11) {
        e0.checkNotNullParameter(image, "image");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().mo4702drawImageRectHPBpro0(image, j10, j11, j12, j13, c(null, style, f10, n0Var, i10, i11));
    }

    @Override // l1.i
    /* renamed from: drawImage-gbVJVH8, reason: not valid java name */
    public void mo5300drawImagegbVJVH8(y0 image, long j10, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(image, "image");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().mo4701drawImaged4ec7I(image, j10, d(this, null, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawLine-1RTmtNc, reason: not valid java name */
    public void mo5301drawLine1RTmtNc(b0 brush, long j10, long j11, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11) {
        e0.checkNotNullParameter(brush, "brush");
        this.f72219b.getCanvas().mo4703drawLineWko1d7g(j10, j11, f(this, brush, f10, i10, n2.f68936b.m4870getMiterLxFBmk8(), m1Var, f11, n0Var, i11));
    }

    @Override // l1.i
    /* renamed from: drawLine-NGM6Ib0, reason: not valid java name */
    public void mo5302drawLineNGM6Ib0(long j10, long j11, long j12, float f10, int i10, m1 m1Var, float f11, n0 n0Var, int i11) {
        this.f72219b.getCanvas().mo4703drawLineWko1d7g(j11, j12, e(this, j10, f10, i10, n2.f68936b.m4870getMiterLxFBmk8(), m1Var, f11, n0Var, i11));
    }

    @Override // l1.i
    /* renamed from: drawOval-AsUm42w, reason: not valid java name */
    public void mo5303drawOvalAsUm42w(b0 brush, long j10, long j11, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(brush, "brush");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawOval(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), o.m4252getWidthimpl(j11) + i1.h.m4185getXimpl(j10), o.m4249getHeightimpl(j11) + i1.h.m4186getYimpl(j10), d(this, brush, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawOval-n-J9OG0, reason: not valid java name */
    public void mo5304drawOvalnJ9OG0(long j10, long j11, long j12, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawOval(i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11), o.m4252getWidthimpl(j12) + i1.h.m4185getXimpl(j11), o.m4249getHeightimpl(j12) + i1.h.m4186getYimpl(j11), b(this, j10, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawPath-GBMwjPU, reason: not valid java name */
    public void mo5305drawPathGBMwjPU(l1 path, b0 brush, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(brush, "brush");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawPath(path, d(this, brush, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawPath-LG529CI, reason: not valid java name */
    public void mo5306drawPathLG529CI(l1 path, long j10, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(path, "path");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawPath(path, b(this, j10, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawPoints-F8ZwMP8, reason: not valid java name */
    public void mo5307drawPointsF8ZwMP8(List<i1.h> points, int i10, long j10, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12) {
        e0.checkNotNullParameter(points, "points");
        this.f72219b.getCanvas().mo4704drawPointsO7TthRY(i10, points, e(this, j10, f10, i11, n2.f68936b.m4870getMiterLxFBmk8(), m1Var, f11, n0Var, i12));
    }

    @Override // l1.i
    /* renamed from: drawPoints-Gsft0Ws, reason: not valid java name */
    public void mo5308drawPointsGsft0Ws(List<i1.h> points, int i10, b0 brush, float f10, int i11, m1 m1Var, float f11, n0 n0Var, int i12) {
        e0.checkNotNullParameter(points, "points");
        e0.checkNotNullParameter(brush, "brush");
        this.f72219b.getCanvas().mo4704drawPointsO7TthRY(i10, points, f(this, brush, f10, i11, n2.f68936b.m4870getMiterLxFBmk8(), m1Var, f11, n0Var, i12));
    }

    @Override // l1.i
    /* renamed from: drawRect-AsUm42w, reason: not valid java name */
    public void mo5309drawRectAsUm42w(b0 brush, long j10, long j11, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(brush, "brush");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawRect(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), o.m4252getWidthimpl(j11) + i1.h.m4185getXimpl(j10), o.m4249getHeightimpl(j11) + i1.h.m4186getYimpl(j10), d(this, brush, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawRect-n-J9OG0, reason: not valid java name */
    public void mo5310drawRectnJ9OG0(long j10, long j11, long j12, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawRect(i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11), o.m4252getWidthimpl(j12) + i1.h.m4185getXimpl(j11), o.m4249getHeightimpl(j12) + i1.h.m4186getYimpl(j11), b(this, j10, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawRoundRect-ZuiqVtQ, reason: not valid java name */
    public void mo5311drawRoundRectZuiqVtQ(b0 brush, long j10, long j11, long j12, float f10, j style, n0 n0Var, int i10) {
        e0.checkNotNullParameter(brush, "brush");
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawRoundRect(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), o.m4252getWidthimpl(j11) + i1.h.m4185getXimpl(j10), o.m4249getHeightimpl(j11) + i1.h.m4186getYimpl(j10), i1.b.m4156getXimpl(j12), i1.b.m4157getYimpl(j12), d(this, brush, style, f10, n0Var, i10));
    }

    @Override // l1.i
    /* renamed from: drawRoundRect-u-Aw5IA, reason: not valid java name */
    public void mo5312drawRoundRectuAw5IA(long j10, long j11, long j12, long j13, j style, float f10, n0 n0Var, int i10) {
        e0.checkNotNullParameter(style, "style");
        this.f72219b.getCanvas().drawRoundRect(i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11), o.m4252getWidthimpl(j12) + i1.h.m4185getXimpl(j11), o.m4249getHeightimpl(j12) + i1.h.m4186getYimpl(j11), i1.b.m4156getXimpl(j13), i1.b.m4157getYimpl(j13), b(this, j10, style, f10, n0Var, i10));
    }

    public final i1 g() {
        i1 i1Var = this.f72222f;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1VarPaint = j1.k.Paint();
        i1VarPaint.mo4776setStylek9PVt8s(k1.f68904b.m4780getStrokeTiuSbCo());
        this.f72222f = i1VarPaint;
        return i1VarPaint;
    }

    @Override // l1.i
    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public /* bridge */ /* synthetic */ long mo5313getCenterF1C5BW0() {
        return super.mo5313getCenterF1C5BW0();
    }

    @Override // l1.i, s2.e
    public float getDensity() {
        return this.f72219b.getDensity().getDensity();
    }

    @Override // l1.i
    public f getDrawContext() {
        return this.f72220c;
    }

    public final C0738a getDrawParams() {
        return this.f72219b;
    }

    @Override // l1.i, s2.e
    public float getFontScale() {
        return this.f72219b.getDensity().getFontScale();
    }

    @Override // l1.i
    public s2.x getLayoutDirection() {
        return this.f72219b.getLayoutDirection();
    }

    @Override // l1.i
    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public /* bridge */ /* synthetic */ long mo5314getSizeNHjbRc() {
        return super.mo5314getSizeNHjbRc();
    }

    public final i1 h(j jVar) {
        if (e0.areEqual(jVar, m.f72234a)) {
            i1 i1Var = this.f72221e;
            if (i1Var != null) {
                return i1Var;
            }
            i1 i1VarPaint = j1.k.Paint();
            i1VarPaint.mo4776setStylek9PVt8s(k1.f68904b.m4779getFillTiuSbCo());
            this.f72221e = i1VarPaint;
            return i1VarPaint;
        }
        if (!(jVar instanceof n)) {
            throw new t();
        }
        i1 i1VarG = g();
        n nVar = (n) jVar;
        if (i1VarG.getStrokeWidth() != nVar.getWidth()) {
            i1VarG.setStrokeWidth(nVar.getWidth());
        }
        if (!l2.m4844equalsimpl0(i1VarG.mo4768getStrokeCapKaPHkGw(), nVar.m5419getCapKaPHkGw())) {
            i1VarG.mo4774setStrokeCapBeK7IIE(nVar.m5419getCapKaPHkGw());
        }
        if (i1VarG.getStrokeMiterLimit() != nVar.getMiter()) {
            i1VarG.setStrokeMiterLimit(nVar.getMiter());
        }
        if (!n2.m4881equalsimpl0(i1VarG.mo4769getStrokeJoinLxFBmk8(), nVar.m5420getJoinLxFBmk8())) {
            i1VarG.mo4775setStrokeJoinWw9F2mQ(nVar.m5420getJoinLxFBmk8());
        }
        if (!e0.areEqual(i1VarG.getPathEffect(), nVar.getPathEffect())) {
            i1VarG.setPathEffect(nVar.getPathEffect());
        }
        return i1VarG;
    }

    @Override // l1.i, s2.e
    /* renamed from: roundToPx--R2X_6o */
    public /* bridge */ /* synthetic */ int mo3418roundToPxR2X_6o(long j10) {
        return super.mo3418roundToPxR2X_6o(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: roundToPx-0680j_4 */
    public /* bridge */ /* synthetic */ int mo3419roundToPx0680j_4(float f10) {
        return super.mo3419roundToPx0680j_4(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-GaN1DYA */
    public /* bridge */ /* synthetic */ float mo3420toDpGaN1DYA(long j10) {
        return super.mo3420toDpGaN1DYA(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3421toDpu2uoSUM(float f10) {
        return super.mo3421toDpu2uoSUM(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public /* bridge */ /* synthetic */ long mo3423toDpSizekrfVVM(long j10) {
        return super.mo3423toDpSizekrfVVM(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toPx--R2X_6o */
    public /* bridge */ /* synthetic */ float mo3424toPxR2X_6o(long j10) {
        return super.mo3424toPxR2X_6o(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toPx-0680j_4 */
    public /* bridge */ /* synthetic */ float mo3425toPx0680j_4(float f10) {
        return super.mo3425toPx0680j_4(f10);
    }

    @Override // l1.i, s2.e
    public /* bridge */ /* synthetic */ i1.j toRect(s2.m mVar) {
        return super.toRect(mVar);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSize-XkaWNTQ */
    public /* bridge */ /* synthetic */ long mo3426toSizeXkaWNTQ(long j10) {
        return super.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-0xMU5do */
    public /* bridge */ /* synthetic */ long mo3427toSp0xMU5do(float f10) {
        return super.mo3427toSp0xMU5do(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3428toSpkPz2Gy4(float f10) {
        return super.mo3428toSpkPz2Gy4(f10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toDp-u2uoSUM */
    public /* bridge */ /* synthetic */ float mo3422toDpu2uoSUM(int i10) {
        return super.mo3422toDpu2uoSUM(i10);
    }

    @Override // l1.i, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public /* bridge */ /* synthetic */ long mo3429toSpkPz2Gy4(int i10) {
        return super.mo3429toSpkPz2Gy4(i10);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: l1.a$a, reason: collision with other inner class name */
    public static final class C0738a {

        /* renamed from: a, reason: collision with root package name */
        public s2.e f72223a;

        /* renamed from: b, reason: collision with root package name */
        public s2.x f72224b;

        /* renamed from: c, reason: collision with root package name */
        public j1.e0 f72225c;

        /* renamed from: d, reason: collision with root package name */
        public long f72226d;

        public C0738a(s2.e eVar, s2.x xVar, j1.e0 e0Var, long j10, u uVar) {
            this.f72223a = eVar;
            this.f72224b = xVar;
            this.f72225c = e0Var;
            this.f72226d = j10;
        }

        /* renamed from: copy-Ug5Nnss$default, reason: not valid java name */
        public static /* synthetic */ C0738a m5315copyUg5Nnss$default(C0738a c0738a, s2.e eVar, s2.x xVar, j1.e0 e0Var, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = c0738a.f72223a;
            }
            if ((i10 & 2) != 0) {
                xVar = c0738a.f72224b;
            }
            if ((i10 & 4) != 0) {
                e0Var = c0738a.f72225c;
            }
            if ((i10 & 8) != 0) {
                j10 = c0738a.f72226d;
            }
            j1.e0 e0Var2 = e0Var;
            return c0738a.m5317copyUg5Nnss(eVar, xVar, e0Var2, j10);
        }

        public final s2.e component1() {
            return this.f72223a;
        }

        public final s2.x component2() {
            return this.f72224b;
        }

        public final j1.e0 component3() {
            return this.f72225c;
        }

        /* renamed from: component4-NH-jbRc, reason: not valid java name */
        public final long m5316component4NHjbRc() {
            return this.f72226d;
        }

        /* renamed from: copy-Ug5Nnss, reason: not valid java name */
        public final C0738a m5317copyUg5Nnss(s2.e density, s2.x layoutDirection, j1.e0 canvas, long j10) {
            e0.checkNotNullParameter(density, "density");
            e0.checkNotNullParameter(layoutDirection, "layoutDirection");
            e0.checkNotNullParameter(canvas, "canvas");
            return new C0738a(density, layoutDirection, canvas, j10, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0738a)) {
                return false;
            }
            C0738a c0738a = (C0738a) obj;
            return e0.areEqual(this.f72223a, c0738a.f72223a) && this.f72224b == c0738a.f72224b && e0.areEqual(this.f72225c, c0738a.f72225c) && o.m4248equalsimpl0(this.f72226d, c0738a.f72226d);
        }

        public final j1.e0 getCanvas() {
            return this.f72225c;
        }

        public final s2.e getDensity() {
            return this.f72223a;
        }

        public final s2.x getLayoutDirection() {
            return this.f72224b;
        }

        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public final long m5318getSizeNHjbRc() {
            return this.f72226d;
        }

        public int hashCode() {
            return o.m4253hashCodeimpl(this.f72226d) + ((this.f72225c.hashCode() + ((this.f72224b.hashCode() + (this.f72223a.hashCode() * 31)) * 31)) * 31);
        }

        public final void setCanvas(j1.e0 e0Var) {
            e0.checkNotNullParameter(e0Var, "<set-?>");
            this.f72225c = e0Var;
        }

        public final void setDensity(s2.e eVar) {
            e0.checkNotNullParameter(eVar, "<set-?>");
            this.f72223a = eVar;
        }

        public final void setLayoutDirection(s2.x xVar) {
            e0.checkNotNullParameter(xVar, "<set-?>");
            this.f72224b = xVar;
        }

        /* renamed from: setSize-uvyYCjk, reason: not valid java name */
        public final void m5319setSizeuvyYCjk(long j10) {
            this.f72226d = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.f72223a + ", layoutDirection=" + this.f72224b + ", canvas=" + this.f72225c + ", size=" + ((Object) o.m4256toStringimpl(this.f72226d)) + ')';
        }

        public /* synthetic */ C0738a(s2.e eVar, s2.x xVar, j1.e0 e0Var, long j10, int i10, u uVar) {
            this((i10 & 1) != 0 ? d.f72230a : eVar, (i10 & 2) != 0 ? s2.x.f85363b : xVar, (i10 & 4) != 0 ? new l() : e0Var, (i10 & 8) != 0 ? o.f59366b.m4239getZeroNHjbRc() : j10, null);
        }
    }

    public static /* synthetic */ void getDrawParams$annotations() {
    }
}
