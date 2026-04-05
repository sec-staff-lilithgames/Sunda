package qg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class p extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f83214a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f83215b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f83216c;

    /* renamed from: d, reason: collision with root package name */
    public float f83217d;

    public p(Drawable drawable, Drawable drawable2) {
        Drawable drawableMutate = drawable != null ? drawable.getConstantState().newDrawable().mutate() : new o();
        this.f83214a = drawableMutate;
        Drawable drawableMutate2 = drawable2 != null ? drawable2.getConstantState().newDrawable().mutate() : new o();
        this.f83215b = drawableMutate2;
        int layoutDirection = drawable != null ? p3.a.getLayoutDirection(drawable) : 3;
        int layoutDirection2 = drawable2 != null ? p3.a.getLayoutDirection(drawable2) : 3;
        p3.a.setLayoutDirection(drawableMutate, layoutDirection);
        p3.a.setLayoutDirection(drawableMutate2, layoutDirection2);
        drawableMutate2.setAlpha(0);
        this.f83216c = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f83214a.draw(canvas);
        this.f83215b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f83214a.getIntrinsicHeight(), this.f83215b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f83214a.getIntrinsicWidth(), this.f83215b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f83214a.getMinimumHeight(), this.f83215b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f83214a.getMinimumWidth(), this.f83215b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f83214a.isStateful() || this.f83215b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        float f10 = this.f83217d;
        Drawable drawable = this.f83215b;
        Drawable drawable2 = this.f83214a;
        if (f10 <= 0.5f) {
            drawable2.setAlpha(i10);
            drawable.setAlpha(0);
        } else {
            drawable2.setAlpha(0);
            drawable.setAlpha(i10);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.f83214a.setBounds(i10, i11, i12, i13);
        this.f83215b.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f83214a.setColorFilter(colorFilter);
        this.f83215b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f10) {
        if (this.f83217d != f10) {
            this.f83217d = f10;
            float[] fArr = this.f83216c;
            kc.p.b(f10, fArr);
            this.f83214a.setAlpha((int) (fArr[0] * 255.0f));
            this.f83215b.setAlpha((int) (fArr[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f83214a.setState(iArr) || this.f83215b.setState(iArr);
    }
}
