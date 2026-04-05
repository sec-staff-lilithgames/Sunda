package a2;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j5 extends View implements z1.p1, x1.w {

    /* renamed from: o, reason: collision with root package name */
    public static final a f3668o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final i5 f3669p = i5.f3656e;

    /* renamed from: q, reason: collision with root package name */
    public static final h5 f3670q = new h5();

    /* renamed from: r, reason: collision with root package name */
    public static Method f3671r;

    /* renamed from: s, reason: collision with root package name */
    public static Field f3672s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f3673t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f3674u;

    /* renamed from: b, reason: collision with root package name */
    public final t f3675b;

    /* renamed from: c, reason: collision with root package name */
    public final j3 f3676c;

    /* renamed from: e, reason: collision with root package name */
    public kv.l f3677e;

    /* renamed from: f, reason: collision with root package name */
    public kv.a f3678f;

    /* renamed from: g, reason: collision with root package name */
    public final f4 f3679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3680h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f3681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3682j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3683k;

    /* renamed from: l, reason: collision with root package name */
    public final j1.f0 f3684l;

    /* renamed from: m, reason: collision with root package name */
    public final a4 f3685m;

    /* renamed from: n, reason: collision with root package name */
    public long f3686n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final boolean getHasRetrievedMethod() {
            return j5.f3673t;
        }

        public final ViewOutlineProvider getOutlineProvider() {
            return j5.f3670q;
        }

        public final boolean getShouldUseDispatchDraw() {
            return j5.f3674u;
        }

        public final void setShouldUseDispatchDraw$ui_release(boolean z10) {
            j5.f3674u = z10;
        }

        public final void updateDisplayList(View view) {
            kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
            try {
                if (!getHasRetrievedMethod()) {
                    j5.f3673t = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        j5.f3671r = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        j5.f3672s = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        j5.f3671r = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        j5.f3672s = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = j5.f3671r;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = j5.f3672s;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = j5.f3672s;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = j5.f3671r;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                setShouldUseDispatchDraw$ui_release(true);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(t ownerView, j3 container, kv.l drawBlock, kv.a invalidateParentLayer) {
        super(ownerView.getContext());
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerView, "ownerView");
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f3675b = ownerView;
        this.f3676c = container;
        this.f3677e = drawBlock;
        this.f3678f = invalidateParentLayer;
        this.f3679g = new f4(ownerView.getDensity());
        this.f3684l = new j1.f0();
        this.f3685m = new a4(f3669p);
        this.f3686n = j1.u2.f69011b.m4991getCenterSzJe1aQ();
        setWillNotDraw(false);
        setId(View.generateViewId());
        container.addView(this);
    }

    private final j1.l1 getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        f4 f4Var = this.f3679g;
        if (f4Var.getOutlineClipSupported()) {
            return null;
        }
        return f4Var.getClipPath();
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f3682j) {
            this.f3682j = z10;
            this.f3675b.notifyLayerIsDirty$ui_release(this, z10);
        }
    }

    public final void a() {
        Rect rect;
        if (this.f3680h) {
            Rect rect2 = this.f3681i;
            if (rect2 == null) {
                this.f3681i = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.e0.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f3681i;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // z1.p1
    public void destroy() {
        setInvalidated(false);
        t tVar = this.f3675b;
        tVar.requestClearInvalidObservations();
        this.f3677e = null;
        this.f3678f = null;
        tVar.recycle$ui_release(this);
        this.f3676c.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        j1.f0 f0Var = this.f3684l;
        Canvas internalCanvas = f0Var.getAndroidCanvas().getInternalCanvas();
        f0Var.getAndroidCanvas().setInternalCanvas(canvas);
        j1.c androidCanvas = f0Var.getAndroidCanvas();
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            androidCanvas.save();
            this.f3679g.clipToOutline(androidCanvas);
            z10 = true;
        }
        kv.l lVar = this.f3677e;
        if (lVar != null) {
            lVar.invoke(androidCanvas);
        }
        if (z10) {
            androidCanvas.restore();
        }
        f0Var.getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @Override // z1.p1
    public void drawLayer(j1.e0 canvas) {
        kotlin.jvm.internal.e0.checkNotNullParameter(canvas, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.f3683k = z10;
        if (z10) {
            canvas.enableZ();
        }
        this.f3676c.drawChild$ui_release(canvas, this, getDrawingTime());
        if (this.f3683k) {
            canvas.disableZ();
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final j3 getContainer() {
        return this.f3676c;
    }

    @Override // x1.w
    public long getLayerId() {
        return getId();
    }

    public final t getOwnerView() {
        return this.f3675b;
    }

    @Override // x1.w
    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return k5.getUniqueDrawingId(this.f3675b);
        }
        return -1L;
    }

    @Override // android.view.View, z1.p1
    public void invalidate() {
        if (this.f3682j) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f3675b.invalidate();
    }

    @Override // z1.p1
    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    public boolean mo39isInLayerk4lQ0M(long j10) {
        float fM4185getXimpl = i1.h.m4185getXimpl(j10);
        float fM4186getYimpl = i1.h.m4186getYimpl(j10);
        if (this.f3680h) {
            return 0.0f <= fM4185getXimpl && fM4185getXimpl < ((float) getWidth()) && 0.0f <= fM4186getYimpl && fM4186getYimpl < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f3679g.m33isInOutlinek4lQ0M(j10);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.f3682j;
    }

    @Override // z1.p1
    public void mapBounds(i1.e rect, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rect, "rect");
        a4 a4Var = this.f3685m;
        if (!z10) {
            j1.e1.m4740mapimpl(a4Var.m4calculateMatrixGrdbGEg(this), rect);
            return;
        }
        float[] fArrM3calculateInverseMatrixbWbORWo = a4Var.m3calculateInverseMatrixbWbORWo(this);
        if (fArrM3calculateInverseMatrixbWbORWo != null) {
            j1.e1.m4740mapimpl(fArrM3calculateInverseMatrixbWbORWo, rect);
        } else {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    @Override // z1.p1
    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    public long mo40mapOffset8S9VItk(long j10, boolean z10) {
        a4 a4Var = this.f3685m;
        if (!z10) {
            return j1.e1.m4738mapMKHz9U(a4Var.m4calculateMatrixGrdbGEg(this), j10);
        }
        float[] fArrM3calculateInverseMatrixbWbORWo = a4Var.m3calculateInverseMatrixbWbORWo(this);
        return fArrM3calculateInverseMatrixbWbORWo != null ? j1.e1.m4738mapMKHz9U(fArrM3calculateInverseMatrixbWbORWo, j10) : i1.h.f59344b.m4171getInfiniteF1C5BW0();
    }

    @Override // z1.p1
    /* renamed from: move--gyyYBs, reason: not valid java name */
    public void mo41movegyyYBs(long j10) {
        int iM6930getXimpl = s2.q.m6930getXimpl(j10);
        int left = getLeft();
        a4 a4Var = this.f3685m;
        if (iM6930getXimpl != left) {
            offsetLeftAndRight(iM6930getXimpl - getLeft());
            a4Var.invalidate();
        }
        int iM6931getYimpl = s2.q.m6931getYimpl(j10);
        if (iM6931getYimpl != getTop()) {
            offsetTopAndBottom(iM6931getYimpl - getTop());
            a4Var.invalidate();
        }
    }

    @Override // z1.p1
    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    public void mo42resizeozmzZPI(long j10) {
        int iM6972getWidthimpl = s2.v.m6972getWidthimpl(j10);
        int iM6971getHeightimpl = s2.v.m6971getHeightimpl(j10);
        if (iM6972getWidthimpl == getWidth() && iM6971getHeightimpl == getHeight()) {
            return;
        }
        float f10 = iM6972getWidthimpl;
        setPivotX(j1.u2.m5013getPivotFractionXimpl(this.f3686n) * f10);
        float f11 = iM6971getHeightimpl;
        setPivotY(j1.u2.m5014getPivotFractionYimpl(this.f3686n) * f11);
        long jSize = i1.p.Size(f10, f11);
        f4 f4Var = this.f3679g;
        f4Var.m34updateuvyYCjk(jSize);
        setOutlineProvider(f4Var.getOutline() != null ? f3670q : null);
        layout(getLeft(), getTop(), getLeft() + iM6972getWidthimpl, getTop() + iM6971getHeightimpl);
        a();
        this.f3685m.invalidate();
    }

    @Override // z1.p1
    public void reuseLayer(kv.l drawBlock, kv.a invalidateParentLayer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBlock, "drawBlock");
        kotlin.jvm.internal.e0.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f3676c.addView(this);
        this.f3680h = false;
        this.f3683k = false;
        this.f3686n = j1.u2.f69011b.m4991getCenterSzJe1aQ();
        this.f3677e = drawBlock;
        this.f3678f = invalidateParentLayer;
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // z1.p1
    public void updateDisplayList() {
        if (!this.f3682j || f3674u) {
            return;
        }
        setInvalidated(false);
        f3668o.updateDisplayList(this);
    }

    @Override // z1.p1
    /* renamed from: updateLayerProperties-NHXXZp8, reason: not valid java name */
    public void mo43updateLayerPropertiesNHXXZp8(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, j1.f2 shape, boolean z10, j1.z1 z1Var, long j11, long j12, s2.x layoutDirection, s2.e density) {
        kv.a aVar;
        kotlin.jvm.internal.e0.checkNotNullParameter(shape, "shape");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f3686n = j10;
        setScaleX(f10);
        setScaleY(f11);
        setAlpha(f12);
        setTranslationX(f13);
        setTranslationY(f14);
        setElevation(f15);
        setRotation(f18);
        setRotationX(f16);
        setRotationY(f17);
        setPivotX(j1.u2.m5013getPivotFractionXimpl(this.f3686n) * getWidth());
        setPivotY(j1.u2.m5014getPivotFractionYimpl(this.f3686n) * getHeight());
        setCameraDistancePx(f19);
        this.f3680h = z10 && shape == j1.y1.getRectangleShape();
        a();
        boolean z11 = getManualClipPath() != null;
        setClipToOutline(z10 && shape != j1.y1.getRectangleShape());
        boolean zUpdate = this.f3679g.update(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f3679g.getOutline() != null ? f3670q : null);
        boolean z12 = getManualClipPath() != null;
        if (z11 != z12 || (z12 && zUpdate)) {
            invalidate();
        }
        if (!this.f3683k && getElevation() > 0.0f && (aVar = this.f3678f) != null) {
            aVar.invoke();
        }
        this.f3685m.invalidate();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iM4894toArgb8_81llA = j1.o0.m4894toArgb8_81llA(j11);
            m5 m5Var = m5.f3728a;
            m5Var.setOutlineAmbientShadowColor(this, iM4894toArgb8_81llA);
            m5Var.setOutlineSpotShadowColor(this, j1.o0.m4894toArgb8_81llA(j12));
        }
        if (i10 >= 31) {
            n5.f3737a.setRenderEffect(this, z1Var);
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
