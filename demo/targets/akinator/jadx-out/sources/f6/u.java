package f6;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class u extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f55428a;

    /* renamed from: b, reason: collision with root package name */
    public t f55429b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f55430c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f55431d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f55432e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f55433f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f55434g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f55435h;

    /* renamed from: i, reason: collision with root package name */
    public int f55436i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f55437j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f55438k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f55439l;

    public u(u uVar) {
        this.f55430c = null;
        this.f55431d = w.f55441l;
        if (uVar != null) {
            this.f55428a = uVar.f55428a;
            t tVar = new t(uVar.f55429b);
            this.f55429b = tVar;
            if (uVar.f55429b.f55417e != null) {
                tVar.f55417e = new Paint(uVar.f55429b.f55417e);
            }
            if (uVar.f55429b.f55416d != null) {
                this.f55429b.f55416d = new Paint(uVar.f55429b.f55416d);
            }
            this.f55430c = uVar.f55430c;
            this.f55431d = uVar.f55431d;
            this.f55432e = uVar.f55432e;
        }
    }

    public boolean canReuseBitmap(int i10, int i11) {
        return i10 == this.f55433f.getWidth() && i11 == this.f55433f.getHeight();
    }

    public boolean canReuseCache() {
        return !this.f55438k && this.f55434g == this.f55430c && this.f55435h == this.f55431d && this.f55437j == this.f55432e && this.f55436i == this.f55429b.getRootAlpha();
    }

    public void createCachedBitmapIfNeeded(int i10, int i11) {
        if (this.f55433f == null || !canReuseBitmap(i10, i11)) {
            this.f55433f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
            this.f55438k = true;
        }
    }

    public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorFilter, Rect rect) {
        canvas.drawBitmap(this.f55433f, (Rect) null, rect, getPaint(colorFilter));
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f55428a;
    }

    public Paint getPaint(ColorFilter colorFilter) {
        if (!hasTranslucentRoot() && colorFilter == null) {
            return null;
        }
        if (this.f55439l == null) {
            Paint paint = new Paint();
            this.f55439l = paint;
            paint.setFilterBitmap(true);
        }
        this.f55439l.setAlpha(this.f55429b.getRootAlpha());
        this.f55439l.setColorFilter(colorFilter);
        return this.f55439l;
    }

    public boolean hasTranslucentRoot() {
        return this.f55429b.getRootAlpha() < 255;
    }

    public boolean isStateful() {
        return this.f55429b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new w(this);
    }

    public boolean onStateChanged(int[] iArr) {
        boolean zOnStateChanged = this.f55429b.onStateChanged(iArr);
        this.f55438k |= zOnStateChanged;
        return zOnStateChanged;
    }

    public void updateCacheStates() {
        this.f55434g = this.f55430c;
        this.f55435h = this.f55431d;
        this.f55436i = this.f55429b.getRootAlpha();
        this.f55437j = this.f55432e;
        this.f55438k = false;
    }

    public void updateCachedBitmap(int i10, int i11) {
        this.f55433f.eraseColor(0);
        this.f55429b.draw(new Canvas(this.f55433f), i10, i11, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new w(this);
    }

    public u() {
        this.f55430c = null;
        this.f55431d = w.f55441l;
        this.f55429b = new t();
    }
}
