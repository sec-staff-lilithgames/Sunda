package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final View f82229a;

    /* renamed from: d, reason: collision with root package name */
    public k3 f82232d;

    /* renamed from: e, reason: collision with root package name */
    public k3 f82233e;

    /* renamed from: f, reason: collision with root package name */
    public k3 f82234f;

    /* renamed from: c, reason: collision with root package name */
    public int f82231c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final w f82230b = w.get();

    public s(View view) {
        this.f82229a = view;
    }

    public final void a() {
        View view = this.f82229a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f82232d != null) {
                if (this.f82234f == null) {
                    this.f82234f = new k3();
                }
                k3 k3Var = this.f82234f;
                k3Var.f82166a = null;
                k3Var.f82169d = false;
                k3Var.f82167b = null;
                k3Var.f82168c = false;
                ColorStateList backgroundTintList = x3.z1.getBackgroundTintList(view);
                if (backgroundTintList != null) {
                    k3Var.f82169d = true;
                    k3Var.f82166a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = x3.z1.getBackgroundTintMode(view);
                if (backgroundTintMode != null) {
                    k3Var.f82168c = true;
                    k3Var.f82167b = backgroundTintMode;
                }
                if (k3Var.f82169d || k3Var.f82168c) {
                    w.a(background, k3Var, view.getDrawableState());
                    return;
                }
            }
            k3 k3Var2 = this.f82233e;
            if (k3Var2 != null) {
                w.a(background, k3Var2, view.getDrawableState());
                return;
            }
            k3 k3Var3 = this.f82232d;
            if (k3Var3 != null) {
                w.a(background, k3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        k3 k3Var = this.f82233e;
        if (k3Var != null) {
            return k3Var.f82166a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        k3 k3Var = this.f82233e;
        if (k3Var != null) {
            return k3Var.f82167b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListC;
        View view = this.f82229a;
        Context context = view.getContext();
        int[] iArr = k.a.B;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        View view2 = this.f82229a;
        x3.z1.saveAttributeDataForStyleable(view2, view2.getContext(), iArr, attributeSet, n3VarObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            if (n3VarObtainStyledAttributes.hasValue(0)) {
                this.f82231c = n3VarObtainStyledAttributes.getResourceId(0, -1);
                w wVar = this.f82230b;
                Context context2 = view.getContext();
                int i11 = this.f82231c;
                synchronized (wVar) {
                    colorStateListC = wVar.f82288a.c(context2, i11);
                }
                if (colorStateListC != null) {
                    g(colorStateListC);
                }
            }
            if (n3VarObtainStyledAttributes.hasValue(1)) {
                x3.z1.setBackgroundTintList(view, n3VarObtainStyledAttributes.getColorStateList(1));
            }
            if (n3VarObtainStyledAttributes.hasValue(2)) {
                x3.z1.setBackgroundTintMode(view, l1.parseTintMode(n3VarObtainStyledAttributes.getInt(2, -1), null));
            }
            n3VarObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            n3VarObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void e() {
        this.f82231c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateListC;
        this.f82231c = i10;
        w wVar = this.f82230b;
        if (wVar != null) {
            Context context = this.f82229a.getContext();
            synchronized (wVar) {
                colorStateListC = wVar.f82288a.c(context, i10);
            }
        } else {
            colorStateListC = null;
        }
        g(colorStateListC);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f82232d == null) {
                this.f82232d = new k3();
            }
            k3 k3Var = this.f82232d;
            k3Var.f82166a = colorStateList;
            k3Var.f82169d = true;
        } else {
            this.f82232d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f82233e == null) {
            this.f82233e = new k3();
        }
        k3 k3Var = this.f82233e;
        k3Var.f82166a = colorStateList;
        k3Var.f82169d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f82233e == null) {
            this.f82233e = new k3();
        }
        k3 k3Var = this.f82233e;
        k3Var.f82167b = mode;
        k3Var.f82168c = true;
        a();
    }
}
