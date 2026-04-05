package yg;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;
import java.util.BitSet;
import r4.f0;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class j extends Drawable implements p3.b, y {
    public static final Paint H;
    public static final l[] I;
    public boolean A;
    public p B;
    public f0 C;
    public final r4.e0[] D;
    public float[] E;
    public float[] F;
    public k G;

    /* renamed from: b, reason: collision with root package name */
    public final h f94428b;

    /* renamed from: c, reason: collision with root package name */
    public a f94429c;

    /* renamed from: e, reason: collision with root package name */
    public final w[] f94430e;

    /* renamed from: f, reason: collision with root package name */
    public final w[] f94431f;

    /* renamed from: g, reason: collision with root package name */
    public final BitSet f94432g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f94433h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f94434i;

    /* renamed from: j, reason: collision with root package name */
    public final Matrix f94435j;

    /* renamed from: k, reason: collision with root package name */
    public final Path f94436k;

    /* renamed from: l, reason: collision with root package name */
    public final Path f94437l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f94438m;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f94439n;

    /* renamed from: o, reason: collision with root package name */
    public final Region f94440o;

    /* renamed from: p, reason: collision with root package name */
    public final Region f94441p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f94442q;

    /* renamed from: r, reason: collision with root package name */
    public final Paint f94443r;

    /* renamed from: s, reason: collision with root package name */
    public final xg.a f94444s;

    /* renamed from: t, reason: collision with root package name */
    public final i f94445t;

    /* renamed from: u, reason: collision with root package name */
    public final t f94446u;

    /* renamed from: v, reason: collision with root package name */
    public PorterDuffColorFilter f94447v;

    /* renamed from: w, reason: collision with root package name */
    public PorterDuffColorFilter f94448w;

    /* renamed from: x, reason: collision with root package name */
    public int f94449x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f94450y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f94451z;

    static {
        int i10 = 0;
        p.builder().setAllCorners(0, 0.0f).build();
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        I = new l[4];
        while (true) {
            l[] lVarArr = I;
            if (i10 >= lVarArr.length) {
                return;
            }
            lVarArr[i10] = new l(i10);
            i10++;
        }
    }

    public j() {
        this(new p());
    }

    public static float b(RectF rectF, p pVar, float[] fArr) {
        if (fArr == null) {
            if (pVar.isRoundRect(rectF)) {
                return pVar.getTopLeftCornerSize().getCornerSize(rectF);
            }
            return -1.0f;
        }
        if (rg.a.areAllElementsEqual(fArr) && pVar.hasRoundedCorners()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public static j createWithElevationOverlay(Context context) {
        return createWithElevationOverlay(context, 0.0f);
    }

    public final void a(RectF rectF, Path path) {
        a aVar = this.f94429c;
        this.f94446u.calculatePath(aVar.f94452a, this.E, aVar.f94462k, rectF, this.f94445t, path);
        if (this.f94429c.f94461j != 1.0f) {
            Matrix matrix = this.f94435j;
            matrix.reset();
            float f10 = this.f94429c.f94461j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f94450y, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            this.f94449x = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z10) {
            return null;
        }
        int color = paint.getColor();
        int iD = d(color);
        this.f94449x = iD;
        if (iD != color) {
            return new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    public final int d(int i10) {
        float parentAbsoluteElevation = getParentAbsoluteElevation() + getZ();
        ng.a aVar = this.f94429c.f94454c;
        return aVar != null ? aVar.compositeOverlayIfNeeded(i10, parentAbsoluteElevation) : i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f94447v;
        Paint paint2 = this.f94442q;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i10 = this.f94429c.f94464m;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f94448w;
        Paint paint3 = this.f94443r;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f94429c.f94463l);
        int alpha2 = paint3.getAlpha();
        int i11 = this.f94429c.f94464m;
        paint3.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f94429c.f94473v;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z10 = this.f94433h;
            paint = paint2;
            Path path = this.f94436k;
            if (z10) {
                a(h(), path);
                this.f94433h = false;
            }
            a aVar = this.f94429c;
            int i12 = aVar.f94468q;
            if (i12 != 1 && aVar.f94469r > 0 && (i12 == 2 || requiresCompatShadow())) {
                canvas.save();
                canvas.translate(getShadowOffsetX(), getShadowOffsetY());
                if (this.f94451z) {
                    RectF rectF = this.f94450y;
                    int iWidth = (int) (rectF.width() - getBounds().width());
                    int iHeight = (int) (rectF.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(o2.B(this.f94429c.f94469r, 2, (int) rectF.width(), iWidth), o2.B(this.f94429c.f94469r, 2, (int) rectF.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f10 = (getBounds().left - this.f94429c.f94469r) - iWidth;
                    float f11 = (getBounds().top - this.f94429c.f94469r) - iHeight;
                    canvas2.translate(-f10, -f11);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f10, f11, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.f94429c.f94452a, this.E, h());
        } else {
            paint = paint2;
        }
        if (j()) {
            if (this.f94434i) {
                this.B = getShapeAppearanceModel().withTransformedCornerSizes(this.f94428b);
                float[] fArr = this.E;
                if (fArr != null) {
                    if (this.F == null) {
                        this.F = new float[fArr.length];
                    }
                    float fI = i();
                    int i13 = 0;
                    while (true) {
                        float[] fArr2 = this.E;
                        if (i13 >= fArr2.length) {
                            break;
                        }
                        this.F[i13] = Math.max(0.0f, fArr2[i13] - fI);
                        i13++;
                    }
                } else {
                    this.F = null;
                }
                p pVar = this.B;
                float[] fArr3 = this.F;
                float f12 = this.f94429c.f94462k;
                RectF rectFH = h();
                RectF rectF2 = this.f94439n;
                rectF2.set(rectFH);
                float fI2 = i();
                rectF2.inset(fI2, fI2);
                this.f94446u.calculatePath(pVar, fArr3, f12, rectF2, null, this.f94437l);
                this.f94434i = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f94432g.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f94429c.f94470s;
        Path path = this.f94436k;
        xg.a aVar = this.f94444s;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.getShadowPaint());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.f94430e[i11].draw(aVar, this.f94429c.f94469r, canvas);
            this.f94431f[i11].draw(aVar, this.f94429c.f94469r, canvas);
        }
        if (this.f94451z) {
            int shadowOffsetX = getShadowOffsetX();
            int shadowOffsetY = getShadowOffsetY();
            canvas.translate(-shadowOffsetX, -shadowOffsetY);
            canvas.drawPath(path, H);
            canvas.translate(shadowOffsetX, shadowOffsetY);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, p pVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, pVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f10 = fB * this.f94429c.f94462k;
            canvas.drawRoundRect(rectF, f10, f10, paint);
        }
    }

    public void g(Canvas canvas) {
        p pVar = this.B;
        float[] fArr = this.F;
        RectF rectFH = h();
        RectF rectF = this.f94439n;
        rectF.set(rectFH);
        float fI = i();
        rectF.inset(fI, fI);
        f(canvas, this.f94443r, this.f94437l, pVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f94429c.f94464m;
    }

    public float getBottomLeftCornerResolvedSize() {
        float[] fArr = this.E;
        return fArr != null ? fArr[2] : this.f94429c.f94452a.getBottomLeftCornerSize().getCornerSize(h());
    }

    public float getBottomRightCornerResolvedSize() {
        float[] fArr = this.E;
        return fArr != null ? fArr[1] : this.f94429c.f94452a.getBottomRightCornerSize().getCornerSize(h());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f94429c;
    }

    public float getCornerSizeDiffX() {
        float[] fArr = this.E;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        p shapeAppearanceModel = getShapeAppearanceModel();
        t tVar = this.f94446u;
        tVar.getClass();
        float cornerSize = shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectFH);
        p shapeAppearanceModel2 = getShapeAppearanceModel();
        tVar.getClass();
        float cornerSize2 = shapeAppearanceModel2.getBottomLeftCornerSize().getCornerSize(rectFH) + cornerSize;
        p shapeAppearanceModel3 = getShapeAppearanceModel();
        tVar.getClass();
        float cornerSize3 = cornerSize2 - shapeAppearanceModel3.getBottomRightCornerSize().getCornerSize(rectFH);
        p shapeAppearanceModel4 = getShapeAppearanceModel();
        tVar.getClass();
        return (cornerSize3 - shapeAppearanceModel4.getTopRightCornerSize().getCornerSize(rectFH)) / 2.0f;
    }

    public f0 getCornerSpringForce() {
        return this.C;
    }

    public float getElevation() {
        return this.f94429c.f94466o;
    }

    public ColorStateList getFillColor() {
        return this.f94429c.f94455d;
    }

    public float getInterpolation() {
        return this.f94429c.f94462k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f94429c.f94468q == 2) {
            return;
        }
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fB = b(rectFH, this.f94429c.f94452a, this.E);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.f94429c.f94462k);
            return;
        }
        boolean z10 = this.f94433h;
        Path path = this.f94436k;
        if (z10) {
            a(rectFH, path);
            this.f94433h = false;
        }
        mg.c.setOutlineToPath(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f94429c.f94460i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Paint.Style getPaintStyle() {
        return this.f94429c.f94473v;
    }

    public float getParentAbsoluteElevation() {
        return this.f94429c.f94465n;
    }

    @Deprecated
    public void getPathForSize(int i10, int i11, Path path) {
        RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
        a aVar = this.f94429c;
        this.f94446u.calculatePath(aVar.f94452a, this.E, aVar.f94462k, rectF, this.f94445t, path);
    }

    public int getResolvedTintColor() {
        return this.f94449x;
    }

    public float getScale() {
        return this.f94429c.f94461j;
    }

    public int getShadowCompatRotation() {
        return this.f94429c.f94471t;
    }

    public int getShadowCompatibilityMode() {
        return this.f94429c.f94468q;
    }

    @Deprecated
    public int getShadowElevation() {
        return (int) getElevation();
    }

    public int getShadowOffsetX() {
        a aVar = this.f94429c;
        return (int) (Math.sin(Math.toRadians(aVar.f94471t)) * aVar.f94470s);
    }

    public int getShadowOffsetY() {
        a aVar = this.f94429c;
        return (int) (Math.cos(Math.toRadians(aVar.f94471t)) * aVar.f94470s);
    }

    public int getShadowRadius() {
        return this.f94429c.f94469r;
    }

    public int getShadowVerticalOffset() {
        return this.f94429c.f94470s;
    }

    @Override // yg.y
    public p getShapeAppearanceModel() {
        return this.f94429c.f94452a;
    }

    @Deprecated
    public x getShapedViewModel() {
        p shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof x) {
            return (x) shapeAppearanceModel;
        }
        return null;
    }

    public b0 getStateListShapeAppearanceModel() {
        return this.f94429c.f94453b;
    }

    public ColorStateList getStrokeColor() {
        return this.f94429c.f94456e;
    }

    public ColorStateList getStrokeTintList() {
        return this.f94429c.f94457f;
    }

    public float getStrokeWidth() {
        return this.f94429c.f94463l;
    }

    public ColorStateList getTintList() {
        return this.f94429c.f94458g;
    }

    public float getTopLeftCornerResolvedSize() {
        float[] fArr = this.E;
        return fArr != null ? fArr[3] : this.f94429c.f94452a.getTopLeftCornerSize().getCornerSize(h());
    }

    public float getTopRightCornerResolvedSize() {
        float[] fArr = this.E;
        return fArr != null ? fArr[0] : this.f94429c.f94452a.getTopRightCornerSize().getCornerSize(h());
    }

    public float getTranslationZ() {
        return this.f94429c.f94467p;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f94440o;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.f94436k;
        a(rectFH, path);
        Region region2 = this.f94441p;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public float getZ() {
        return getTranslationZ() + getElevation();
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.f94438m;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        if (j()) {
            return this.f94443r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public void initializeElevationOverlay(Context context) {
        this.f94429c.f94454c = new ng.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f94433h = true;
        this.f94434i = true;
        super.invalidateSelf();
    }

    public boolean isElevationOverlayEnabled() {
        ng.a aVar = this.f94429c.f94454c;
        return aVar != null && aVar.isThemeElevationOverlayEnabled();
    }

    public boolean isElevationOverlayInitialized() {
        return this.f94429c.f94454c != null;
    }

    public boolean isPointInTransparentRegion(int i10, int i11) {
        return getTransparentRegion().contains(i10, i11);
    }

    public boolean isRoundRect() {
        if (this.f94429c.f94452a.isRoundRect(h())) {
            return true;
        }
        float[] fArr = this.E;
        return fArr != null && rg.a.areAllElementsEqual(fArr) && this.f94429c.f94452a.hasRoundedCorners();
    }

    @Deprecated
    public boolean isShadowEnabled() {
        int i10 = this.f94429c.f94468q;
        return i10 == 0 || i10 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f94429c.f94458g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f94429c.f94457f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f94429c.f94456e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f94429c.f94455d;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        b0 b0Var = this.f94429c.f94453b;
        return b0Var != null && b0Var.isStateful();
    }

    public final boolean j() {
        Paint.Style style = this.f94429c.f94473v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f94443r.getStrokeWidth() > 0.0f;
    }

    public final boolean k(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f94429c.f94455d == null || color2 == (colorForState2 = this.f94429c.f94455d.getColorForState(iArr, (color2 = (paint2 = this.f94442q).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f94429c.f94456e == null || color == (colorForState = this.f94429c.f94456e.getColorForState(iArr, (color = (paint = this.f94443r).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void l(int[] iArr, boolean z10) {
        p pVarBuild;
        int i10;
        RectF rectFH = h();
        if (this.f94429c.f94453b == null || rectFH.isEmpty()) {
            return;
        }
        boolean z11 = z10 | (this.C == null);
        if (this.E == null) {
            this.E = new float[4];
        }
        b0 b0Var = this.f94429c.f94453b;
        p[] pVarArr = b0Var.f94412d;
        int i11 = b0Var.f94409a;
        int[][] iArr2 = b0Var.f94411c;
        z zVar = b0Var.f94416h;
        z zVar2 = b0Var.f94415g;
        z zVar3 = b0Var.f94414f;
        z zVar4 = b0Var.f94413e;
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                i12 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i13 = 0;
            while (true) {
                if (i13 >= i11) {
                    i10 = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i13], iArr3)) {
                        i10 = i13;
                        break;
                    }
                    i13++;
                }
            }
            i12 = i10;
        }
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            pVarBuild = pVarArr[i12];
        } else {
            p.a builder = pVarArr[i12].toBuilder();
            if (zVar4 != null) {
                builder.setTopLeftCornerSize(zVar4.getCornerSizeForState(iArr));
            }
            if (zVar3 != null) {
                builder.setTopRightCornerSize(zVar3.getCornerSizeForState(iArr));
            }
            if (zVar2 != null) {
                builder.setBottomLeftCornerSize(zVar2.getCornerSizeForState(iArr));
            }
            if (zVar != null) {
                builder.setBottomRightCornerSize(zVar.getCornerSizeForState(iArr));
            }
            pVarBuild = builder.build();
        }
        int i14 = 0;
        while (i14 < 4) {
            this.f94446u.getClass();
            float cornerSize = (i14 != 1 ? i14 != 2 ? i14 != 3 ? pVarBuild.getTopRightCornerSize() : pVarBuild.getTopLeftCornerSize() : pVarBuild.getBottomLeftCornerSize() : pVarBuild.getBottomRightCornerSize()).getCornerSize(rectFH);
            if (z11) {
                this.E[i14] = cornerSize;
            }
            r4.e0[] e0VarArr = this.D;
            r4.e0 e0Var = e0VarArr[i14];
            if (e0Var != null) {
                e0Var.animateToFinalPosition(cornerSize);
                if (z11) {
                    e0VarArr[i14].skipToEnd();
                }
            }
            i14++;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f94447v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f94448w;
        a aVar = this.f94429c;
        this.f94447v = c(aVar.f94458g, aVar.f94459h, this.f94442q, true);
        a aVar2 = this.f94429c;
        this.f94448w = c(aVar2.f94457f, aVar2.f94459h, this.f94443r, false);
        a aVar3 = this.f94429c;
        if (aVar3.f94472u) {
            this.f94444s.setShadowColor(aVar3.f94458g.getColorForState(getState(), 0));
        }
        return (w3.d.equals(porterDuffColorFilter, this.f94447v) && w3.d.equals(porterDuffColorFilter2, this.f94448w)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f94429c = new a(this.f94429c);
        return this;
    }

    public final void n() {
        float z10 = getZ();
        this.f94429c.f94469r = (int) Math.ceil(0.75f * z10);
        this.f94429c.f94470s = (int) Math.ceil(z10 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f94433h = true;
        this.f94434i = true;
        super.onBoundsChange(rect);
        if (this.f94429c.f94453b != null && !rect.isEmpty()) {
            l(getState(), this.A);
        }
        this.A = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, qg.g0
    public boolean onStateChange(int[] iArr) {
        if (this.f94429c.f94453b != null) {
            l(iArr, false);
        }
        boolean z10 = k(iArr) || m();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public boolean requiresCompatShadow() {
        return (isRoundRect() || this.f94436k.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        a aVar = this.f94429c;
        if (aVar.f94464m != i10) {
            aVar.f94464m = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f94429c.getClass();
        super.invalidateSelf();
    }

    public void setCornerSize(float f10) {
        setShapeAppearanceModel(this.f94429c.f94452a.withCornerSize(f10));
    }

    public void setCornerSpringForce(f0 f0Var) {
        if (this.C == f0Var) {
            return;
        }
        this.C = f0Var;
        int i10 = 0;
        while (true) {
            r4.e0[] e0VarArr = this.D;
            if (i10 >= e0VarArr.length) {
                l(getState(), true);
                invalidateSelf();
                return;
            } else {
                if (e0VarArr[i10] == null) {
                    e0VarArr[i10] = new r4.e0(this, I[i10]);
                }
                e0VarArr[i10].setSpring(new f0().setDampingRatio(f0Var.getDampingRatio()).setStiffness(f0Var.getStiffness()));
                i10++;
            }
        }
    }

    public void setEdgeIntersectionCheckEnable(boolean z10) {
        this.f94446u.f94514l = z10;
    }

    public void setElevation(float f10) {
        a aVar = this.f94429c;
        if (aVar.f94466o != f10) {
            aVar.f94466o = f10;
            n();
        }
    }

    public void setFillColor(ColorStateList colorStateList) {
        a aVar = this.f94429c;
        if (aVar.f94455d != colorStateList) {
            aVar.f94455d = colorStateList;
            onStateChange(getState());
        }
    }

    public void setInterpolation(float f10) {
        a aVar = this.f94429c;
        if (aVar.f94462k != f10) {
            aVar.f94462k = f10;
            this.f94433h = true;
            this.f94434i = true;
            invalidateSelf();
        }
    }

    public void setOnCornerSizeChangeListener(k kVar) {
        this.G = kVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        a aVar = this.f94429c;
        if (aVar.f94460i == null) {
            aVar.f94460i = new Rect();
        }
        this.f94429c.f94460i.set(i10, i11, i12, i13);
        invalidateSelf();
    }

    public void setPaintStyle(Paint.Style style) {
        this.f94429c.f94473v = style;
        super.invalidateSelf();
    }

    public void setParentAbsoluteElevation(float f10) {
        a aVar = this.f94429c;
        if (aVar.f94465n != f10) {
            aVar.f94465n = f10;
            n();
        }
    }

    public void setScale(float f10) {
        a aVar = this.f94429c;
        if (aVar.f94461j != f10) {
            aVar.f94461j = f10;
            invalidateSelf();
        }
    }

    public void setShadowBitmapDrawingEnable(boolean z10) {
        this.f94451z = z10;
    }

    public void setShadowColor(int i10) {
        this.f94444s.setShadowColor(i10);
        this.f94429c.f94472u = false;
        super.invalidateSelf();
    }

    public void setShadowCompatRotation(int i10) {
        a aVar = this.f94429c;
        if (aVar.f94471t != i10) {
            aVar.f94471t = i10;
            super.invalidateSelf();
        }
    }

    public void setShadowCompatibilityMode(int i10) {
        a aVar = this.f94429c;
        if (aVar.f94468q != i10) {
            aVar.f94468q = i10;
            super.invalidateSelf();
        }
    }

    @Deprecated
    public void setShadowElevation(int i10) {
        setElevation(i10);
    }

    @Deprecated
    public void setShadowEnabled(boolean z10) {
        setShadowCompatibilityMode(!z10 ? 1 : 0);
    }

    @Deprecated
    public void setShadowRadius(int i10) {
        this.f94429c.f94469r = i10;
    }

    public void setShadowVerticalOffset(int i10) {
        a aVar = this.f94429c;
        if (aVar.f94470s != i10) {
            aVar.f94470s = i10;
            super.invalidateSelf();
        }
    }

    @Override // yg.y
    public void setShapeAppearanceModel(p pVar) {
        a aVar = this.f94429c;
        aVar.f94452a = pVar;
        aVar.f94453b = null;
        this.E = null;
        this.F = null;
        invalidateSelf();
    }

    @Deprecated
    public void setShapedViewModel(x xVar) {
        setShapeAppearanceModel(xVar);
    }

    public void setStateListShapeAppearanceModel(b0 b0Var) {
        a aVar = this.f94429c;
        if (aVar.f94453b != b0Var) {
            aVar.f94453b = b0Var;
            l(getState(), true);
            invalidateSelf();
        }
    }

    public void setStroke(float f10, int i10) {
        setStrokeWidth(f10);
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f94429c;
        if (aVar.f94456e != colorStateList) {
            aVar.f94456e = colorStateList;
            onStateChange(getState());
        }
    }

    public void setStrokeTint(ColorStateList colorStateList) {
        this.f94429c.f94457f = colorStateList;
        m();
        super.invalidateSelf();
    }

    public void setStrokeWidth(float f10) {
        this.f94429c.f94463l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTintList(ColorStateList colorStateList) {
        this.f94429c.f94458g = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, p3.b
    public void setTintMode(PorterDuff.Mode mode) {
        a aVar = this.f94429c;
        if (aVar.f94459h != mode) {
            aVar.f94459h = mode;
            m();
            super.invalidateSelf();
        }
    }

    public void setTranslationZ(float f10) {
        a aVar = this.f94429c;
        if (aVar.f94467p != f10) {
            aVar.f94467p = f10;
            n();
        }
    }

    public void setUseTintColorForShadow(boolean z10) {
        a aVar = this.f94429c;
        if (aVar.f94472u != z10) {
            aVar.f94472u = z10;
            invalidateSelf();
        }
    }

    public void setZ(float f10) {
        setTranslationZ(f10 - getElevation());
    }

    public j(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(p.builder(context, attributeSet, i10, i11).build());
    }

    public static j createWithElevationOverlay(Context context, float f10) {
        return createWithElevationOverlay(context, f10, null);
    }

    public void setCornerSize(d dVar) {
        setShapeAppearanceModel(this.f94429c.f94452a.withCornerSize(dVar));
    }

    @Deprecated
    public j(x xVar) {
        this((p) xVar);
    }

    public static j createWithElevationOverlay(Context context, float f10, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(jg.b.getColor(context, R.attr.colorSurface, j.class.getSimpleName()));
        }
        j jVar = new j();
        jVar.initializeElevationOverlay(context);
        jVar.setFillColor(colorStateList);
        jVar.setElevation(f10);
        return jVar;
    }

    public void setStroke(float f10, ColorStateList colorStateList) {
        setStrokeWidth(f10);
        setStrokeColor(colorStateList);
    }

    public j(p pVar) {
        this(new a(pVar, null));
    }

    public void setStrokeTint(int i10) {
        setStrokeTint(ColorStateList.valueOf(i10));
    }

    public j(a aVar) {
        t tVar;
        this.f94428b = new h(this);
        this.f94430e = new w[4];
        this.f94431f = new w[4];
        this.f94432g = new BitSet(8);
        this.f94435j = new Matrix();
        this.f94436k = new Path();
        this.f94437l = new Path();
        this.f94438m = new RectF();
        this.f94439n = new RectF();
        this.f94440o = new Region();
        this.f94441p = new Region();
        Paint paint = new Paint(1);
        this.f94442q = paint;
        Paint paint2 = new Paint(1);
        this.f94443r = paint2;
        this.f94444s = new xg.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            tVar = t.getInstance();
        } else {
            tVar = new t();
        }
        this.f94446u = tVar;
        this.f94450y = new RectF();
        this.f94451z = true;
        this.A = true;
        this.D = new r4.e0[4];
        this.f94429c = aVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        k(getState());
        this.f94445t = new i(this);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public p f94452a;

        /* renamed from: b, reason: collision with root package name */
        public b0 f94453b;

        /* renamed from: c, reason: collision with root package name */
        public ng.a f94454c;

        /* renamed from: d, reason: collision with root package name */
        public ColorStateList f94455d;

        /* renamed from: e, reason: collision with root package name */
        public ColorStateList f94456e;

        /* renamed from: f, reason: collision with root package name */
        public ColorStateList f94457f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f94458g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f94459h;

        /* renamed from: i, reason: collision with root package name */
        public Rect f94460i;

        /* renamed from: j, reason: collision with root package name */
        public float f94461j;

        /* renamed from: k, reason: collision with root package name */
        public float f94462k;

        /* renamed from: l, reason: collision with root package name */
        public float f94463l;

        /* renamed from: m, reason: collision with root package name */
        public int f94464m;

        /* renamed from: n, reason: collision with root package name */
        public float f94465n;

        /* renamed from: o, reason: collision with root package name */
        public float f94466o;

        /* renamed from: p, reason: collision with root package name */
        public float f94467p;

        /* renamed from: q, reason: collision with root package name */
        public int f94468q;

        /* renamed from: r, reason: collision with root package name */
        public int f94469r;

        /* renamed from: s, reason: collision with root package name */
        public int f94470s;

        /* renamed from: t, reason: collision with root package name */
        public int f94471t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f94472u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f94473v;

        public a(p pVar, ng.a aVar) {
            this.f94455d = null;
            this.f94456e = null;
            this.f94457f = null;
            this.f94458g = null;
            this.f94459h = PorterDuff.Mode.SRC_IN;
            this.f94460i = null;
            this.f94461j = 1.0f;
            this.f94462k = 1.0f;
            this.f94464m = 255;
            this.f94465n = 0.0f;
            this.f94466o = 0.0f;
            this.f94467p = 0.0f;
            this.f94468q = 0;
            this.f94469r = 0;
            this.f94470s = 0;
            this.f94471t = 0;
            this.f94472u = false;
            this.f94473v = Paint.Style.FILL_AND_STROKE;
            this.f94452a = pVar;
            this.f94454c = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            j jVar = new j(this);
            jVar.f94433h = true;
            jVar.f94434i = true;
            return jVar;
        }

        public a(a aVar) {
            this.f94455d = null;
            this.f94456e = null;
            this.f94457f = null;
            this.f94458g = null;
            this.f94459h = PorterDuff.Mode.SRC_IN;
            this.f94460i = null;
            this.f94461j = 1.0f;
            this.f94462k = 1.0f;
            this.f94464m = 255;
            this.f94465n = 0.0f;
            this.f94466o = 0.0f;
            this.f94467p = 0.0f;
            this.f94468q = 0;
            this.f94469r = 0;
            this.f94470s = 0;
            this.f94471t = 0;
            this.f94472u = false;
            this.f94473v = Paint.Style.FILL_AND_STROKE;
            this.f94452a = aVar.f94452a;
            this.f94453b = aVar.f94453b;
            this.f94454c = aVar.f94454c;
            this.f94463l = aVar.f94463l;
            this.f94455d = aVar.f94455d;
            this.f94456e = aVar.f94456e;
            this.f94459h = aVar.f94459h;
            this.f94458g = aVar.f94458g;
            this.f94464m = aVar.f94464m;
            this.f94461j = aVar.f94461j;
            this.f94470s = aVar.f94470s;
            this.f94468q = aVar.f94468q;
            this.f94472u = aVar.f94472u;
            this.f94462k = aVar.f94462k;
            this.f94465n = aVar.f94465n;
            this.f94466o = aVar.f94466o;
            this.f94467p = aVar.f94467p;
            this.f94469r = aVar.f94469r;
            this.f94471t = aVar.f94471t;
            this.f94457f = aVar.f94457f;
            this.f94473v = aVar.f94473v;
            if (aVar.f94460i != null) {
                this.f94460i = new Rect(aVar.f94460i);
            }
        }
    }
}
