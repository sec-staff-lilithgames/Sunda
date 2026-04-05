package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.digidust.elokence.akinator.freemium.R;
import e4.w;
import e4.x;
import q.i3;
import q.j3;
import q.t1;
import q.u;
import q.v0;
import q.z;
import x3.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements w, e1, t1, x {

    /* renamed from: b, reason: collision with root package name */
    public final u f5021b;

    /* renamed from: c, reason: collision with root package name */
    public final q.s f5022c;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f5023e;

    /* renamed from: f, reason: collision with root package name */
    public z f5024f;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    private z getEmojiTextViewHelper() {
        if (this.f5024f == null) {
            this.f5024f = new z(this);
        }
        return this.f5024f;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q.s sVar = this.f5022c;
        if (sVar != null) {
            sVar.a();
        }
        v0 v0Var = this.f5023e;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        q.s sVar = this.f5022c;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.s sVar = this.f5022c;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.w
    public ColorStateList getSupportButtonTintList() {
        u uVar = this.f5021b;
        if (uVar != null) {
            return uVar.f82257a;
        }
        return null;
    }

    @Override // e4.w
    public PorterDuff.Mode getSupportButtonTintMode() {
        u uVar = this.f5021b;
        if (uVar != null) {
            return uVar.f82258b;
        }
        return null;
    }

    @Override // e4.x
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5023e.d();
    }

    @Override // e4.x
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5023e.e();
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

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.s sVar = this.f5022c;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.s sVar = this.f5022c;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        u uVar = this.f5021b;
        if (uVar != null) {
            if (uVar.f82261e) {
                uVar.f82261e = false;
            } else {
                uVar.f82261e = true;
                uVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f5023e;
        if (v0Var != null) {
            v0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v0 v0Var = this.f5023e;
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
        q.s sVar = this.f5022c;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.s sVar = this.f5022c;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.w
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        u uVar = this.f5021b;
        if (uVar != null) {
            uVar.f82257a = colorStateList;
            uVar.f82259c = true;
            uVar.a();
        }
    }

    @Override // e4.w
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        u uVar = this.f5021b;
        if (uVar != null) {
            uVar.f82258b = mode;
            uVar.f82260d = true;
            uVar.a();
        }
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        v0 v0Var = this.f5023e;
        v0Var.k(colorStateList);
        v0Var.b();
    }

    @Override // e4.x
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        v0 v0Var = this.f5023e;
        v0Var.l(mode);
        v0Var.b();
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        i3.checkAppCompatTheme(this, getContext());
        u uVar = new u(this);
        this.f5021b = uVar;
        uVar.c(attributeSet, i10);
        q.s sVar = new q.s(this);
        this.f5022c = sVar;
        sVar.d(attributeSet, i10);
        v0 v0Var = new v0(this);
        this.f5023e = v0Var;
        v0Var.f(attributeSet, i10);
        getEmojiTextViewHelper().a(attributeSet, i10);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(l.a.getDrawable(getContext(), i10));
    }
}
