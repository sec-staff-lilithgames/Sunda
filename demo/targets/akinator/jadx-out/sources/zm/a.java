package zm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import um.h0;
import um.o;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class a extends View implements o {

    /* renamed from: b, reason: collision with root package name */
    public Bitmap f98284b;

    /* renamed from: c, reason: collision with root package name */
    public int f98285c;

    /* renamed from: e, reason: collision with root package name */
    public int f98286e;

    /* renamed from: f, reason: collision with root package name */
    public int f98287f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f98288g;

    /* renamed from: h, reason: collision with root package name */
    public final float f98289h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f98290i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f98291j;

    /* renamed from: k, reason: collision with root package name */
    public float f98292k;

    /* renamed from: l, reason: collision with root package name */
    public float f98293l;

    /* renamed from: m, reason: collision with root package name */
    public float f98294m;

    /* renamed from: n, reason: collision with root package name */
    public Paint f98295n;

    /* renamed from: o, reason: collision with root package name */
    public Paint f98296o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f98297p;

    /* renamed from: q, reason: collision with root package name */
    public RectF f98298q;

    /* renamed from: r, reason: collision with root package name */
    public Paint f98299r;

    /* renamed from: s, reason: collision with root package name */
    public Paint f98300s;

    /* renamed from: t, reason: collision with root package name */
    public float f98301t;

    /* renamed from: u, reason: collision with root package name */
    public int f98302u;

    public a(Context context) {
        super(context);
        this.f98286e = um.a.f88522a;
        this.f98287f = um.a.f88523b;
        this.f98288g = false;
        this.f98289h = 0.071428575f;
        this.f98290i = new RectF();
        this.f98291j = new RectF();
        this.f98292k = 54.0f;
        this.f98293l = 54.0f;
        this.f98294m = 5.0f;
        this.f98301t = 100.0f;
        setLayerType(1, null);
        this.f98294m = h0.dpToPx(context, 3.0f);
    }

    public final float a(float f10, boolean z10) {
        float fWidth = this.f98290i.width();
        if (z10) {
            fWidth -= this.f98294m * 2.0f;
        }
        float fSqrt = (float) (Math.sqrt(2.0d) * (fWidth / 2.0f));
        return fSqrt - ((f10 * fSqrt) * 2.0f);
    }

    public final void b() {
        float fMin = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        float f10 = fMin / 2.0f;
        float width = (getWidth() / 2.0f) - f10;
        float height = (getHeight() / 2.0f) - f10;
        RectF rectF = this.f98290i;
        rectF.set(width, height, width + fMin, fMin + height);
        this.f98292k = rectF.centerX();
        this.f98293l = rectF.centerY();
        float f11 = rectF.left;
        float f12 = this.f98294m / 2.0f;
        this.f98291j.set(f11 + f12, rectF.top + f12, rectF.right - f12, rectF.bottom - f12);
    }

    public void changePercentage(float f10, int i10) {
        if (this.f98284b == null || f10 == 100.0f) {
            this.f98301t = f10;
            this.f98302u = i10;
            postInvalidate();
        }
    }

    public int getAccentColor() {
        return this.f98286e;
    }

    public int getBackgroundColor() {
        return this.f98287f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        if (this.f98302u == 0 && this.f98284b == null) {
            return;
        }
        if (this.f98295n == null) {
            this.f98295n = new Paint(1);
        }
        float f10 = 360.0f - ((this.f98301t * 360.0f) * 0.01f);
        this.f98295n.setColor(this.f98287f);
        Paint paint = this.f98295n;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        canvas.drawArc(this.f98290i, 0.0f, 360.0f, false, this.f98295n);
        this.f98295n.setColor(this.f98286e);
        Paint paint2 = this.f98295n;
        Paint.Style style2 = Paint.Style.STROKE;
        paint2.setStyle(style2);
        this.f98295n.setStrokeWidth(this.f98294m);
        Paint paint3 = this.f98295n;
        RectF rectF = this.f98291j;
        canvas.drawArc(rectF, 270.0f, f10, false, paint3);
        Bitmap bitmap = this.f98284b;
        if (bitmap == null) {
            if (this.f98296o == null) {
                Paint paint4 = new Paint(1);
                this.f98296o = paint4;
                paint4.setAntiAlias(true);
                this.f98296o.setStyle(style);
                this.f98296o.setTextAlign(Paint.Align.CENTER);
            }
            String strValueOf = String.valueOf(this.f98302u);
            this.f98296o.setColor(this.f98286e);
            this.f98296o.setTypeface(Typeface.create(Typeface.DEFAULT, this.f98285c));
            this.f98296o.setTextSize(a(this.f98289h, true));
            canvas.drawText(strValueOf, this.f98292k, this.f98293l - ((this.f98296o.ascent() + this.f98296o.descent()) / 2.0f), this.f98296o);
            return;
        }
        if (this.f98299r == null) {
            Paint paint5 = new Paint(7);
            this.f98299r = paint5;
            paint5.setStyle(style);
            this.f98299r.setAntiAlias(true);
        }
        if (this.f98297p == null) {
            this.f98297p = new Rect();
        }
        if (this.f98298q == null) {
            this.f98298q = new RectF();
        }
        float fA = a(0.0f, this.f98288g);
        float f11 = fA / 2.0f;
        float f12 = this.f98292k - f11;
        float f13 = this.f98293l - f11;
        this.f98297p.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f98298q.set(f12, f13, f12 + fA, fA + f13);
        this.f98299r.setColorFilter(new PorterDuffColorFilter(this.f98286e, PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, this.f98297p, this.f98298q, this.f98299r);
        if (this.f98288g) {
            if (this.f98300s == null) {
                Paint paint6 = new Paint(1);
                this.f98300s = paint6;
                paint6.setStyle(style2);
            }
            this.f98300s.setStrokeWidth(this.f98294m);
            this.f98300s.setColor(this.f98286e);
            canvas.drawArc(rectF, 0.0f, 360.0f, false, this.f98300s);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    public void setColors(int i10, int i11) {
        this.f98286e = i10;
        this.f98287f = i11;
        b();
    }

    public void setImage(Bitmap bitmap) {
        this.f98284b = bitmap;
        if (bitmap != null) {
            this.f98301t = 100.0f;
        }
        postInvalidate();
    }

    @Override // um.o
    public void setStyle(p pVar) {
        this.f98285c = pVar.getFontStyle().intValue();
        this.f98286e = pVar.getStrokeColor().intValue();
        this.f98287f = pVar.getFillColor().intValue();
        this.f98288g = pVar.isOutlined().booleanValue();
        this.f98294m = pVar.getStrokeWidth(getContext()).floatValue();
        setPadding(pVar.getPaddingLeft(getContext()).intValue(), pVar.getPaddingTop(getContext()).intValue(), pVar.getPaddingRight(getContext()).intValue(), pVar.getPaddingBottom(getContext()).intValue());
        setAlpha(pVar.getOpacity().floatValue());
        b();
        postInvalidate();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f98286e = um.a.f88522a;
        this.f98287f = um.a.f88523b;
        this.f98288g = false;
        this.f98289h = 0.071428575f;
        this.f98290i = new RectF();
        this.f98291j = new RectF();
        this.f98292k = 54.0f;
        this.f98293l = 54.0f;
        this.f98294m = 5.0f;
        this.f98301t = 100.0f;
        setLayerType(1, null);
        this.f98294m = h0.dpToPx(context, 3.0f);
    }
}
