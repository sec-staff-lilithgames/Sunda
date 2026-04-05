package pg;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends Drawable {

    /* renamed from: b, reason: collision with root package name */
    public final Paint f81209b;

    /* renamed from: h, reason: collision with root package name */
    public float f81215h;

    /* renamed from: i, reason: collision with root package name */
    public int f81216i;

    /* renamed from: j, reason: collision with root package name */
    public int f81217j;

    /* renamed from: k, reason: collision with root package name */
    public int f81218k;

    /* renamed from: l, reason: collision with root package name */
    public int f81219l;

    /* renamed from: m, reason: collision with root package name */
    public int f81220m;

    /* renamed from: o, reason: collision with root package name */
    public yg.p f81222o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f81223p;

    /* renamed from: a, reason: collision with root package name */
    public final yg.t f81208a = yg.t.getInstance();

    /* renamed from: c, reason: collision with root package name */
    public final Path f81210c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f81211d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f81212e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f81213f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final d f81214g = new d(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f81221n = true;

    public e(yg.p pVar) {
        this.f81222o = pVar;
        Paint paint = new Paint(1);
        this.f81209b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10 = this.f81221n;
        Rect rect = this.f81211d;
        Paint paint = this.f81209b;
        if (z10) {
            copyBounds(rect);
            float fHeight = this.f81215h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{o3.b.compositeColors(this.f81216i, this.f81220m), o3.b.compositeColors(this.f81217j, this.f81220m), o3.b.compositeColors(o3.b.setAlphaComponent(this.f81217j, 0), this.f81220m), o3.b.compositeColors(o3.b.setAlphaComponent(this.f81219l, 0), this.f81220m), o3.b.compositeColors(this.f81219l, this.f81220m), o3.b.compositeColors(this.f81218k, this.f81220m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f81221n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f81212e;
        rectF.set(rect);
        yg.d topLeftCornerSize = this.f81222o.getTopLeftCornerSize();
        Rect bounds = getBounds();
        RectF rectF2 = this.f81213f;
        rectF2.set(bounds);
        float fMin = Math.min(topLeftCornerSize.getCornerSize(rectF2), rectF.width() / 2.0f);
        yg.p pVar = this.f81222o;
        rectF2.set(getBounds());
        if (pVar.isRoundRect(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f81214g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f81215h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        yg.p pVar = this.f81222o;
        Rect bounds = getBounds();
        RectF rectF = this.f81213f;
        rectF.set(bounds);
        if (pVar.isRoundRect(rectF)) {
            yg.d topLeftCornerSize = this.f81222o.getTopLeftCornerSize();
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), topLeftCornerSize.getCornerSize(rectF));
            return;
        }
        Rect rect = this.f81211d;
        copyBounds(rect);
        RectF rectF2 = this.f81212e;
        rectF2.set(rect);
        yg.p pVar2 = this.f81222o;
        yg.t tVar = this.f81208a;
        Path path = this.f81210c;
        tVar.calculatePath(pVar2, 1.0f, rectF2, path);
        mg.c.setOutlineToPath(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        yg.p pVar = this.f81222o;
        Rect bounds = getBounds();
        RectF rectF = this.f81213f;
        rectF.set(bounds);
        if (!pVar.isRoundRect(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f81215h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    public yg.p getShapeAppearanceModel() {
        return this.f81222o;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f81223p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f81221n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f81223p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f81220m)) != this.f81220m) {
            this.f81221n = true;
            this.f81220m = colorForState;
        }
        if (this.f81221n) {
            invalidateSelf();
        }
        return this.f81221n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f81209b.setAlpha(i10);
        invalidateSelf();
    }

    public void setBorderWidth(float f10) {
        if (this.f81215h != f10) {
            this.f81215h = f10;
            this.f81209b.setStrokeWidth(f10 * 1.3333f);
            this.f81221n = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f81209b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setShapeAppearanceModel(yg.p pVar) {
        this.f81222o = pVar;
        invalidateSelf();
    }
}
