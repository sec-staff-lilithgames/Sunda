package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import e4.y;
import q.a0;
import q.i3;
import q.j3;
import q.k3;
import x3.e1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements e1, y {

    /* renamed from: b, reason: collision with root package name */
    public final q.s f5025b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f5026c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5027e;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        q.s sVar = this.f5025b;
        if (sVar != null) {
            sVar.a();
        }
        a0 a0Var = this.f5026c;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        q.s sVar = this.f5025b;
        if (sVar != null) {
            return sVar.b();
        }
        return null;
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        q.s sVar = this.f5025b;
        if (sVar != null) {
            return sVar.c();
        }
        return null;
    }

    @Override // e4.y
    public ColorStateList getSupportImageTintList() {
        k3 k3Var;
        a0 a0Var = this.f5026c;
        if (a0Var == null || (k3Var = a0Var.f82019b) == null) {
            return null;
        }
        return k3Var.f82166a;
    }

    @Override // e4.y
    public PorterDuff.Mode getSupportImageTintMode() {
        k3 k3Var;
        a0 a0Var = this.f5026c;
        if (a0Var == null || (k3Var = a0Var.f82019b) == null) {
            return null;
        }
        return k3Var.f82167b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.f5026c.f82018a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        q.s sVar = this.f5025b;
        if (sVar != null) {
            sVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        q.s sVar = this.f5025b;
        if (sVar != null) {
            sVar.f(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a0 a0Var = this.f5026c;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        a0 a0Var = this.f5026c;
        if (a0Var != null && drawable != null && !this.f5027e) {
            a0Var.f82020c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (a0Var != null) {
            a0Var.a();
            if (this.f5027e) {
                return;
            }
            ImageView imageView = a0Var.f82018a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(a0Var.f82020c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.f5027e = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f5026c.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        a0 a0Var = this.f5026c;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        q.s sVar = this.f5025b;
        if (sVar != null) {
            sVar.h(colorStateList);
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        q.s sVar = this.f5025b;
        if (sVar != null) {
            sVar.i(mode);
        }
    }

    @Override // e4.y
    public void setSupportImageTintList(ColorStateList colorStateList) {
        a0 a0Var = this.f5026c;
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
        a0 a0Var = this.f5026c;
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

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i10) {
        super(j3.wrap(context), attributeSet, i10);
        this.f5027e = false;
        i3.checkAppCompatTheme(this, getContext());
        q.s sVar = new q.s(this);
        this.f5025b = sVar;
        sVar.d(attributeSet, i10);
        a0 a0Var = new a0(this);
        this.f5026c = a0Var;
        a0Var.loadFromAttributes(attributeSet, i10);
    }
}
