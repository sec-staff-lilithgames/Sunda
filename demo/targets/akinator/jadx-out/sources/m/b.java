package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.digidust.elokence.akinator.freemium.R;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends Drawable {

    /* renamed from: m, reason: collision with root package name */
    public static final float f73638m = (float) Math.toRadians(45.0d);

    /* renamed from: a, reason: collision with root package name */
    public final Paint f73639a;

    /* renamed from: b, reason: collision with root package name */
    public float f73640b;

    /* renamed from: c, reason: collision with root package name */
    public float f73641c;

    /* renamed from: d, reason: collision with root package name */
    public float f73642d;

    /* renamed from: e, reason: collision with root package name */
    public float f73643e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f73644f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f73645g;

    /* renamed from: h, reason: collision with root package name */
    public final int f73646h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f73647i;

    /* renamed from: j, reason: collision with root package name */
    public float f73648j;

    /* renamed from: k, reason: collision with root package name */
    public float f73649k;

    /* renamed from: l, reason: collision with root package name */
    public int f73650l;

    public b(Context context) {
        Paint paint = new Paint();
        this.f73639a = paint;
        this.f73645g = new Path();
        this.f73647i = false;
        this.f73650l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, k.a.f69990n, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
        setColor(typedArrayObtainStyledAttributes.getColor(3, 0));
        setBarThickness(typedArrayObtainStyledAttributes.getDimension(7, 0.0f));
        setSpinEnabled(typedArrayObtainStyledAttributes.getBoolean(6, true));
        setGapSize(Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f)));
        this.f73646h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f73641c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f73640b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f73642d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return o2.a(f11, f10, f12, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f73650l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? p3.a.getLayoutDirection(this) == 0 : p3.a.getLayoutDirection(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f73640b;
        float fA = a(this.f73641c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f73648j);
        float fA2 = a(this.f73641c, this.f73642d, this.f73648j);
        float fRound = Math.round(a(0.0f, this.f73649k, this.f73648j));
        float fA3 = a(0.0f, f73638m, this.f73648j);
        float fA4 = a(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f73648j);
        double d10 = fA;
        double d11 = fA3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(Math.sin(d11) * d10);
        Path path = this.f73645g;
        path.rewind();
        float f11 = this.f73643e;
        Paint paint = this.f73639a;
        float fA5 = a(paint.getStrokeWidth() + f11, -this.f73649k, this.f73648j);
        float f12 = (-fA2) / 2.0f;
        path.moveTo(f12 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f12, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f12, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f73643e + ((((int) (fHeight - (r6 * 2.0f))) / 4) * 2));
        if (this.f73644f) {
            canvas.rotate(fA4 * (this.f73647i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    public float getArrowHeadLength() {
        return this.f73640b;
    }

    public float getArrowShaftLength() {
        return this.f73642d;
    }

    public float getBarLength() {
        return this.f73641c;
    }

    public float getBarThickness() {
        return this.f73639a.getStrokeWidth();
    }

    public int getColor() {
        return this.f73639a.getColor();
    }

    public int getDirection() {
        return this.f73650l;
    }

    public float getGapSize() {
        return this.f73643e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f73646h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f73646h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint getPaint() {
        return this.f73639a;
    }

    public float getProgress() {
        return this.f73648j;
    }

    public boolean isSpinEnabled() {
        return this.f73644f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Paint paint = this.f73639a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    public void setArrowHeadLength(float f10) {
        if (this.f73640b != f10) {
            this.f73640b = f10;
            invalidateSelf();
        }
    }

    public void setArrowShaftLength(float f10) {
        if (this.f73642d != f10) {
            this.f73642d = f10;
            invalidateSelf();
        }
    }

    public void setBarLength(float f10) {
        if (this.f73641c != f10) {
            this.f73641c = f10;
            invalidateSelf();
        }
    }

    public void setBarThickness(float f10) {
        Paint paint = this.f73639a;
        if (paint.getStrokeWidth() != f10) {
            paint.setStrokeWidth(f10);
            this.f73649k = (float) (Math.cos(f73638m) * (f10 / 2.0f));
            invalidateSelf();
        }
    }

    public void setColor(int i10) {
        Paint paint = this.f73639a;
        if (i10 != paint.getColor()) {
            paint.setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f73639a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDirection(int i10) {
        if (i10 != this.f73650l) {
            this.f73650l = i10;
            invalidateSelf();
        }
    }

    public void setGapSize(float f10) {
        if (f10 != this.f73643e) {
            this.f73643e = f10;
            invalidateSelf();
        }
    }

    public void setProgress(float f10) {
        if (this.f73648j != f10) {
            this.f73648j = f10;
            invalidateSelf();
        }
    }

    public void setSpinEnabled(boolean z10) {
        if (this.f73644f != z10) {
            this.f73644f = z10;
            invalidateSelf();
        }
    }

    public void setVerticalMirror(boolean z10) {
        if (this.f73647i != z10) {
            this.f73647i = z10;
            invalidateSelf();
        }
    }
}
