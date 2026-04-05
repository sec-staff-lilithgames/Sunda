package a2;

import android.graphics.Canvas;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l4 implements z1.p1, x1.w {

    /* renamed from: o, reason: collision with root package name */
    public static final k4 f3709o;

    /* renamed from: b, reason: collision with root package name */
    public final t f3710b;

    /* renamed from: c, reason: collision with root package name */
    public kv.l f3711c;

    /* renamed from: e, reason: collision with root package name */
    public kv.a f3712e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3713f;

    /* renamed from: g, reason: collision with root package name */
    public final f4 f3714g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3715h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3716i;

    /* renamed from: j, reason: collision with root package name */
    public j1.i1 f3717j;

    /* renamed from: k, reason: collision with root package name */
    public final a4 f3718k;

    /* renamed from: l, reason: collision with root package name */
    public final j1.f0 f3719l;

    /* renamed from: m, reason: collision with root package name */
    public long f3720m;

    /* renamed from: n, reason: collision with root package name */
    public final c3 f3721n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f3709o = k4.f3694e;
    }

    public l4(t ownerView, kv.l drawBlock, kv.a invalidateParentLayer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerView, "ownerView");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f3710b = ownerView;
        this.f3711c = drawBlock;
        this.f3712e = invalidateParentLayer;
        this.f3714g = new f4(ownerView.getDensity());
        this.f3718k = new a4(f3709o);
        this.f3719l = new j1.f0();
        this.f3720m = j1.u2.f69011b.m4991getCenterSzJe1aQ();
        c3 i4Var = Build.VERSION.SDK_INT >= 29 ? new i4(ownerView) : new g4(ownerView);
        i4Var.setHasOverlappingRendering(true);
        this.f3721n = i4Var;
    }

    public final void a(boolean z10) {
        if (z10 != this.f3713f) {
            this.f3713f = z10;
            this.f3710b.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    @Override // z1.p1
    public void destroy() {
        c3 c3Var = this.f3721n;
        if (c3Var.getHasDisplayList()) {
            c3Var.discardDisplayList();
        }
        this.f3711c = null;
        this.f3712e = null;
        this.f3715h = true;
        a(false);
        t tVar = this.f3710b;
        tVar.requestClearInvalidObservations();
        tVar.recycle$ui_release(this);
    }

    @Override // z1.p1
    public void drawLayer(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        Canvas nativeCanvas = j1.d.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        c3 c3Var = this.f3721n;
        if (zIsHardwareAccelerated) {
            updateDisplayList();
            boolean z10 = c3Var.getElevation() > 0.0f;
            this.f3716i = z10;
            if (z10) {
                canvas.enableZ();
            }
            c3Var.drawInto(nativeCanvas);
            if (this.f3716i) {
                canvas.disableZ();
                return;
            }
            return;
        }
        float left = c3Var.getLeft();
        float top = c3Var.getTop();
        float right = c3Var.getRight();
        float bottom = c3Var.getBottom();
        if (c3Var.getAlpha() < 1.0f) {
            j1.i1 i1VarPaint = this.f3717j;
            if (i1VarPaint == null) {
                i1VarPaint = j1.k.Paint();
                this.f3717j = i1VarPaint;
            }
            i1VarPaint.setAlpha(c3Var.getAlpha());
            nativeCanvas.saveLayer(left, top, right, bottom, i1VarPaint.asFrameworkPaint());
        } else {
            canvas.save();
        }
        canvas.translate(left, top);
        canvas.mo4699concat58bKbWc(this.f3718k.m4calculateMatrixGrdbGEg(c3Var));
        if (c3Var.getClipToOutline() || c3Var.getClipToBounds()) {
            this.f3714g.clipToOutline(canvas);
        }
        kv.l lVar = this.f3711c;
        if (lVar != null) {
            lVar.invoke(canvas);
        }
        canvas.restore();
        a(false);
    }

    @Override // x1.w
    public long getLayerId() {
        return this.f3721n.getUniqueId();
    }

    public final t getOwnerView() {
        return this.f3710b;
    }

    @Override // x1.w
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return m4.getUniqueDrawingId(this.f3710b);
        }
        return -1L;
    }

    @Override // z1.p1
    public void invalidate() {
        if (this.f3713f || this.f3715h) {
            return;
        }
        this.f3710b.invalidate();
        a(true);
    }

    @Override // z1.p1
    /* renamed from: isInLayer-k-4lQ0M */
    public boolean mo39isInLayerk4lQ0M(long j10) {
        float fM4185getXimpl = i1.h.m4185getXimpl(j10);
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        c3 c3Var = this.f3721n;
        if (c3Var.getClipToBounds()) {
            return 0.0f <= fM4185getXimpl && fM4185getXimpl < ((float) c3Var.getWidth()) && 0.0f <= fM4186getYimpl && fM4186getYimpl < ((float) c3Var.getHeight());
        }
        if (c3Var.getClipToOutline()) {
            return this.f3714g.m33isInOutlinek4lQ0M(j10);
        }
        return true;
    }

    @Override // z1.p1
    public void mapBounds(i1.e rect, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        c3 c3Var = this.f3721n;
        a4 a4Var = this.f3718k;
        if (!z10) {
            j1.e1.m4740mapimpl(a4Var.m4calculateMatrixGrdbGEg(c3Var), rect);
            return;
        }
        float[] fArrM3calculateInverseMatrixbWbORWo = a4Var.m3calculateInverseMatrixbWbORWo(c3Var);
        if (fArrM3calculateInverseMatrixbWbORWo == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            j1.e1.m4740mapimpl(fArrM3calculateInverseMatrixbWbORWo, rect);
        }
    }

    @Override // z1.p1
    /* renamed from: mapOffset-8S9VItk */
    public long mo40mapOffset8S9VItk(long j10, boolean z10) {
        c3 c3Var = this.f3721n;
        a4 a4Var = this.f3718k;
        if (!z10) {
            return j1.e1.m4738mapMKHz9U(a4Var.m4calculateMatrixGrdbGEg(c3Var), j10);
        }
        float[] fArrM3calculateInverseMatrixbWbORWo = a4Var.m3calculateInverseMatrixbWbORWo(c3Var);
        return fArrM3calculateInverseMatrixbWbORWo != null ? j1.e1.m4738mapMKHz9U(fArrM3calculateInverseMatrixbWbORWo, j10) : i1.h.f59344b.m4171getInfiniteF1C5BW0();
    }

    @Override // z1.p1
    /* renamed from: move--gyyYBs */
    public void mo41movegyyYBs(long j10) {
        c3 c3Var = this.f3721n;
        int left = c3Var.getLeft();
        int top = c3Var.getTop();
        int iM6930getXimpl = s2.q.m6930getXimpl(j10);
        int iM6931getYimpl = s2.q.m6931getYimpl(j10);
        if (left == iM6930getXimpl && top == iM6931getYimpl) {
            return;
        }
        c3Var.offsetLeftAndRight(iM6930getXimpl - left);
        c3Var.offsetTopAndBottom(iM6931getYimpl - top);
        int i10 = Build.VERSION.SDK_INT;
        t tVar = this.f3710b;
        if (i10 >= 26) {
            p6.f3775a.onDescendantInvalidated(tVar);
        } else {
            tVar.invalidate();
        }
        this.f3718k.invalidate();
    }

    @Override // z1.p1
    /* renamed from: resize-ozmzZPI */
    public void mo42resizeozmzZPI(long j10) {
        int iM6972getWidthimpl = s2.v.m6972getWidthimpl(j10);
        int iM6971getHeightimpl = s2.v.m6971getHeightimpl(j10);
        float fM5013getPivotFractionXimpl = j1.u2.m5013getPivotFractionXimpl(this.f3720m);
        float f10 = iM6972getWidthimpl;
        c3 c3Var = this.f3721n;
        c3Var.setPivotX(fM5013getPivotFractionXimpl * f10);
        float f11 = iM6971getHeightimpl;
        c3Var.setPivotY(j1.u2.m5014getPivotFractionYimpl(this.f3720m) * f11);
        if (c3Var.setPosition(c3Var.getLeft(), c3Var.getTop(), c3Var.getLeft() + iM6972getWidthimpl, c3Var.getTop() + iM6971getHeightimpl)) {
            long jSize = i1.p.Size(f10, f11);
            f4 f4Var = this.f3714g;
            f4Var.m34updateuvyYCjk(jSize);
            c3Var.setOutline(f4Var.getOutline());
            invalidate();
            this.f3718k.invalidate();
        }
    }

    @Override // z1.p1
    public void reuseLayer(kv.l drawBlock, kv.a invalidateParentLayer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        a(false);
        this.f3715h = false;
        this.f3716i = false;
        this.f3720m = j1.u2.f69011b.m4991getCenterSzJe1aQ();
        this.f3711c = drawBlock;
        this.f3712e = invalidateParentLayer;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    @Override // z1.p1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateDisplayList() {
        /*
            r4 = this;
            boolean r0 = r4.f3713f
            a2.c3 r1 = r4.f3721n
            if (r0 != 0) goto Lc
            boolean r0 = r1.getHasDisplayList()
            if (r0 != 0) goto L2d
        Lc:
            r0 = 0
            r4.a(r0)
            boolean r0 = r1.getClipToOutline()
            if (r0 == 0) goto L23
            a2.f4 r0 = r4.f3714g
            boolean r2 = r0.getOutlineClipSupported()
            if (r2 != 0) goto L23
            j1.l1 r0 = r0.getClipPath()
            goto L24
        L23:
            r0 = 0
        L24:
            kv.l r2 = r4.f3711c
            if (r2 == 0) goto L2d
            j1.f0 r3 = r4.f3719l
            r1.record(r3, r0, r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.l4.updateDisplayList():void");
    }

    @Override // z1.p1
    /* renamed from: updateLayerProperties-NHXXZp8 */
    public void mo43updateLayerPropertiesNHXXZp8(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, j1.f2 shape, boolean z10, j1.z1 z1Var, long j11, long j12, s2.x layoutDirection, s2.e density) {
        kv.a aVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f3720m = j10;
        c3 c3Var = this.f3721n;
        boolean clipToOutline = c3Var.getClipToOutline();
        f4 f4Var = this.f3714g;
        boolean z11 = false;
        boolean z12 = clipToOutline && !f4Var.getOutlineClipSupported();
        c3Var.setScaleX(f10);
        c3Var.setScaleY(f11);
        c3Var.setAlpha(f12);
        c3Var.setTranslationX(f13);
        c3Var.setTranslationY(f14);
        c3Var.setElevation(f15);
        c3Var.setAmbientShadowColor(j1.o0.m4894toArgb8_81llA(j11));
        c3Var.setSpotShadowColor(j1.o0.m4894toArgb8_81llA(j12));
        c3Var.setRotationZ(f18);
        c3Var.setRotationX(f16);
        c3Var.setRotationY(f17);
        c3Var.setCameraDistance(f19);
        c3Var.setPivotX(j1.u2.m5013getPivotFractionXimpl(j10) * c3Var.getWidth());
        c3Var.setPivotY(j1.u2.m5014getPivotFractionYimpl(j10) * c3Var.getHeight());
        c3Var.setClipToOutline(z10 && shape != j1.y1.getRectangleShape());
        c3Var.setClipToBounds(z10 && shape == j1.y1.getRectangleShape());
        c3Var.setRenderEffect(z1Var);
        boolean zUpdate = this.f3714g.update(shape, c3Var.getAlpha(), c3Var.getClipToOutline(), c3Var.getElevation(), layoutDirection, density);
        c3Var.setOutline(f4Var.getOutline());
        if (c3Var.getClipToOutline() && !f4Var.getOutlineClipSupported()) {
            z11 = true;
        }
        if (z12 != z11 || (z11 && zUpdate)) {
            invalidate();
        } else {
            int i10 = Build.VERSION.SDK_INT;
            t tVar = this.f3710b;
            if (i10 >= 26) {
                p6.f3775a.onDescendantInvalidated(tVar);
            } else {
                tVar.invalidate();
            }
        }
        if (!this.f3716i && c3Var.getElevation() > 0.0f && (aVar = this.f3712e) != null) {
            aVar.invoke();
        }
        this.f3718k.invalidate();
    }
}
