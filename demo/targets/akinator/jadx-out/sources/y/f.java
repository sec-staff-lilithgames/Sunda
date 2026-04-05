package y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public float f93931a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f93932b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f93933c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f93934d;

    /* renamed from: e, reason: collision with root package name */
    public float f93935e;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f93938h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f93939i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f93940j;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93936f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93937g = true;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f93941k = PorterDuff.Mode.SRC_IN;

    public f(float f10, ColorStateList colorStateList) {
        this.f93931a = f10;
        Paint paint = new Paint(5);
        this.f93932b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f93938h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f93938h.getDefaultColor()));
        this.f93933c = new RectF();
        this.f93934d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f93933c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f93934d;
        rect2.set(rect);
        if (this.f93936f) {
            rect2.inset((int) Math.ceil(g.a(this.f93935e, this.f93931a, this.f93937g)), (int) Math.ceil(g.b(this.f93935e, this.f93931a, this.f93937g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        PorterDuffColorFilter porterDuffColorFilter = this.f93939i;
        Paint paint = this.f93932b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z10 = false;
        } else {
            paint.setColorFilter(this.f93939i);
            z10 = true;
        }
        RectF rectF = this.f93933c;
        float f10 = this.f93931a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z10) {
            paint.setColorFilter(null);
        }
    }

    public ColorStateList getColor() {
        return this.f93938h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f93934d, this.f93931a);
    }

    public float getRadius() {
        return this.f93931a;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f93940j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f93938h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f93938h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f93932b;
        boolean z10 = colorForState != paint.getColor();
        if (z10) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f93940j;
        if (colorStateList2 == null || (mode = this.f93941k) == null) {
            return z10;
        }
        this.f93939i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f93932b.setAlpha(i10);
    }

    public void setColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f93938h = colorStateList;
        this.f93932b.setColor(colorStateList.getColorForState(getState(), this.f93938h.getDefaultColor()));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f93932b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f93940j = colorStateList;
        this.f93939i = a(colorStateList, this.f93941k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f93941k = mode;
        this.f93939i = a(this.f93940j, mode);
        invalidateSelf();
    }
}
