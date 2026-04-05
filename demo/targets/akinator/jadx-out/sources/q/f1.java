package q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class f1 extends ToggleButton implements x3.e1, t1, e4.x {

    /* renamed from: b, reason: collision with root package name */
    public final s f82084b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f82085c;

    /* renamed from: e, reason: collision with root package name */
    public z f82086e;

    public f1(Context context) {
        this(context, null);
    }

    private z getEmojiTextViewHelper() {
        if (this.f82086e == null) {
            this.f82086e = new z(this);
        }
        return this.f82086e;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.f82084b;
        if (sVar != null) {
            sVar.a();
        }
        v0 v0Var = this.f82085c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        s sVar = this.f82084b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        s sVar = this.f82084b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f82085c.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f82085c.e();
    }

    @Override // q.t1
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().isEnabled();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().b(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        s sVar = this.f82084b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        s sVar = this.f82084b;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82085c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f82085c;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // q.t1
    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().c(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f82316b.getFilters(inputFilterArr));
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        s sVar = this.f82084b;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        s sVar = this.f82084b;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f82085c;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f82085c;
        v0Var.l(mode);
        v0Var.b();
    }

    public f1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public f1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        s sVar = new s(this);
        this.f82084b = sVar;
        sVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f82085c = v0Var;
        v0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }
}
