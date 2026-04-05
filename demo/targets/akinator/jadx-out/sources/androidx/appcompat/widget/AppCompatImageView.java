package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import e4.y;
import q.a0;
import q.i3;
import q.j3;
import q.k3;
import x3.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView implements e1, y {
    private final q.s mBackgroundTintHelper;
    private boolean mHasLevel;
    private final a0 mImageHelper;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.a();
        }
        a0 a0Var = this.mImageHelper;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.y
    public ColorStateList getSupportImageTintList() {
        k3 k3Var;
        a0 a0Var = this.mImageHelper;
        if (a0Var == null || (k3Var = a0Var.f82019b) == null) {
            return null;
        }
        return k3Var.f82166a;
    }

    @Override // e4.y
    public PorterDuff.Mode getSupportImageTintMode() {
        k3 k3Var;
        a0 a0Var = this.mImageHelper;
        if (a0Var == null || (k3Var = a0Var.f82019b) == null) {
            return null;
        }
        return k3Var.f82167b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.f82018a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a0 a0Var = this.mImageHelper;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a0 a0Var = this.mImageHelper;
        if (a0Var != null && drawable != null && !this.mHasLevel) {
            a0Var.f82020c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        a0 a0Var2 = this.mImageHelper;
        if (a0Var2 != null) {
            a0Var2.a();
            if (this.mHasLevel) {
                return;
            }
            a0 a0Var3 = this.mImageHelper;
            ImageView imageView = a0Var3.f82018a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(a0Var3.f82020c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        a0 a0Var = this.mImageHelper;
        if (a0Var != null) {
            a0Var.setImageResource(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a0 a0Var = this.mImageHelper;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.s sVar = this.mBackgroundTintHelper;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.y
    public void setSupportImageTintList(ColorStateList colorStateList) {
        a0 a0Var = this.mImageHelper;
        if (a0Var != null) {
            if (a0Var.f82019b == null) {
                a0Var.f82019b = new k3();
            }
            k3 k3Var = a0Var.f82019b;
            k3Var.f82166a = colorStateList;
            k3Var.f82169d = true;
            a0Var.a();
        }
    }

    @Override // e4.y
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        a0 a0Var = this.mImageHelper;
        if (a0Var != null) {
            if (a0Var.f82019b == null) {
                a0Var.f82019b = new k3();
            }
            k3 k3Var = a0Var.f82019b;
            k3Var.f82167b = mode;
            k3Var.f82168c = true;
            a0Var.a();
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        this.mHasLevel = false;
        i3.checkAppCompatTheme(this, getContext());
        q.s sVar = new q.s(this);
        this.mBackgroundTintHelper = sVar;
        sVar.d(attributeSet, i10);
        a0 a0Var = new a0(this);
        this.mImageHelper = a0Var;
        a0Var.loadFromAttributes(attributeSet, i10);
    }
}
