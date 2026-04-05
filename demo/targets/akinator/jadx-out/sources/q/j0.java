package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public final i0 f82125e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f82126f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f82127g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f82128h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f82129i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f82130j;

    public j0(i0 i0Var) {
        super(i0Var);
        this.f82127g = null;
        this.f82128h = null;
        this.f82129i = false;
        this.f82130j = false;
        this.f82125e = i0Var;
    }

    @Override // q.e0
    public final void b(AttributeSet attributeSet, int i10) {
        super.b(attributeSet, i10);
        i0 i0Var = this.f82125e;
        Context context = i0Var.getContext();
        int[] iArr = k.a.f69983g;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        x3.z1.saveAttributeDataForStyleable(i0Var, i0Var.getContext(), iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        Drawable drawableIfKnown = n3VarObtainStyledAttributes.getDrawableIfKnown(0);
        if (drawableIfKnown != null) {
            i0Var.setThumb(drawableIfKnown);
        }
        Drawable drawable = n3VarObtainStyledAttributes.getDrawable(1);
        Drawable drawable2 = this.f82126f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f82126f = drawable;
        if (drawable != null) {
            drawable.setCallback(i0Var);
            p3.a.setLayoutDirection(drawable, i0Var.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(i0Var.getDrawableState());
            }
            d();
        }
        i0Var.invalidate();
        if (n3VarObtainStyledAttributes.hasValue(3)) {
            this.f82128h = l1.parseTintMode(n3VarObtainStyledAttributes.getInt(3, -1), this.f82128h);
            this.f82130j = true;
        }
        if (n3VarObtainStyledAttributes.hasValue(2)) {
            this.f82127g = n3VarObtainStyledAttributes.getColorStateList(2);
            this.f82129i = true;
        }
        n3VarObtainStyledAttributes.recycle();
        d();
    }

    public final void d() {
        Drawable drawable = this.f82126f;
        if (drawable != null) {
            if (this.f82129i || this.f82130j) {
                Drawable drawableWrap = p3.a.wrap(drawable.mutate());
                this.f82126f = drawableWrap;
                if (this.f82129i) {
                    p3.a.setTintList(drawableWrap, this.f82127g);
                }
                if (this.f82130j) {
                    p3.a.setTintMode(this.f82126f, this.f82128h);
                }
                if (this.f82126f.isStateful()) {
                    this.f82126f.setState(this.f82125e.getDrawableState());
                }
            }
        }
    }

    public final void e(Canvas canvas) {
        if (this.f82126f != null) {
            int max = this.f82125e.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f82126f.getIntrinsicWidth();
                int intrinsicHeight = this.f82126f.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f82126f.setBounds(-i10, -i11, i10, i11);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f82126f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
