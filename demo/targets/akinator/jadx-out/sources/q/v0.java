package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f82270a;

    /* renamed from: b, reason: collision with root package name */
    public k3 f82271b;

    /* renamed from: c, reason: collision with root package name */
    public k3 f82272c;

    /* renamed from: d, reason: collision with root package name */
    public k3 f82273d;

    /* renamed from: e, reason: collision with root package name */
    public k3 f82274e;

    /* renamed from: f, reason: collision with root package name */
    public k3 f82275f;

    /* renamed from: g, reason: collision with root package name */
    public k3 f82276g;

    /* renamed from: h, reason: collision with root package name */
    public k3 f82277h;

    /* renamed from: i, reason: collision with root package name */
    public final e1 f82278i;

    /* renamed from: j, reason: collision with root package name */
    public int f82279j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f82280k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f82281l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f82282m;

    public v0(TextView textView) {
        this.f82270a = textView;
        this.f82278i = new e1(textView);
    }

    public static k3 c(Context context, w wVar, int i10) {
        ColorStateList colorStateListC;
        synchronized (wVar) {
            colorStateListC = wVar.f82288a.c(context, i10);
        }
        if (colorStateListC == null) {
            return null;
        }
        k3 k3Var = new k3();
        k3Var.f82169d = true;
        k3Var.f82166a = colorStateListC;
        return k3Var;
    }

    public final void a(Drawable drawable, k3 k3Var) {
        if (drawable == null || k3Var == null) {
            return;
        }
        w.a(drawable, k3Var, this.f82270a.getDrawableState());
    }

    public final void b() {
        k3 k3Var = this.f82271b;
        TextView textView = this.f82270a;
        if (k3Var != null || this.f82272c != null || this.f82273d != null || this.f82274e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f82271b);
            a(compoundDrawables[1], this.f82272c);
            a(compoundDrawables[2], this.f82273d);
            a(compoundDrawables[3], this.f82274e);
        }
        if (this.f82275f == null && this.f82276g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f82275f);
        a(compoundDrawablesRelative[2], this.f82276g);
    }

    public final ColorStateList d() {
        k3 k3Var = this.f82277h;
        if (k3Var != null) {
            return k3Var.f82166a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        k3 k3Var = this.f82277h;
        if (k3Var != null) {
            return k3Var.f82167b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.v0.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i10) {
        String string;
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, i10, k.a.f70001y);
        boolean zHasValue = n3VarObtainStyledAttributes.hasValue(14);
        TextView textView = this.f82270a;
        if (zHasValue) {
            textView.setAllCaps(n3VarObtainStyledAttributes.getBoolean(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (n3VarObtainStyledAttributes.hasValue(0) && n3VarObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m(context, n3VarObtainStyledAttributes);
        if (i11 >= 26 && n3VarObtainStyledAttributes.hasValue(13) && (string = n3VarObtainStyledAttributes.getString(13)) != null) {
            t0.d(textView, string);
        }
        n3VarObtainStyledAttributes.recycle();
        Typeface typeface = this.f82281l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f82279j);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        e1 e1Var = this.f82278i;
        if (e1Var.j()) {
            DisplayMetrics displayMetrics = e1Var.f82077j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i10) {
        e1 e1Var = this.f82278i;
        if (e1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e1Var.f82077j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                e1Var.f82073f = e1.b(iArrCopyOf);
                if (!e1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                e1Var.f82074g = false;
            }
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void j(int i10) {
        e1 e1Var = this.f82278i;
        if (e1Var.j()) {
            if (i10 == 0) {
                e1Var.f82068a = 0;
                e1Var.f82071d = -1.0f;
                e1Var.f82072e = -1.0f;
                e1Var.f82070c = -1.0f;
                e1Var.f82073f = new int[0];
                e1Var.f82069b = false;
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException(a.b.e(i10, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = e1Var.f82077j.getResources().getDisplayMetrics();
            e1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e1Var.h()) {
                e1Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        if (this.f82277h == null) {
            this.f82277h = new k3();
        }
        k3 k3Var = this.f82277h;
        k3Var.f82166a = colorStateList;
        k3Var.f82169d = colorStateList != null;
        this.f82271b = k3Var;
        this.f82272c = k3Var;
        this.f82273d = k3Var;
        this.f82274e = k3Var;
        this.f82275f = k3Var;
        this.f82276g = k3Var;
    }

    public final void l(PorterDuff.Mode mode) {
        if (this.f82277h == null) {
            this.f82277h = new k3();
        }
        k3 k3Var = this.f82277h;
        k3Var.f82167b = mode;
        k3Var.f82168c = mode != null;
        this.f82271b = k3Var;
        this.f82272c = k3Var;
        this.f82273d = k3Var;
        this.f82274e = k3Var;
        this.f82275f = k3Var;
        this.f82276g = k3Var;
    }

    public final void m(Context context, n3 n3Var) {
        String string;
        this.f82279j = n3Var.getInt(2, this.f82279j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = n3Var.getInt(11, -1);
            this.f82280k = i11;
            if (i11 != -1) {
                this.f82279j &= 2;
            }
        }
        if (!n3Var.hasValue(10) && !n3Var.hasValue(12)) {
            if (n3Var.hasValue(1)) {
                this.f82282m = false;
                int i12 = n3Var.getInt(1, 1);
                if (i12 == 1) {
                    this.f82281l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f82281l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f82281l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f82281l = null;
        int i13 = n3Var.hasValue(12) ? 12 : 10;
        int i14 = this.f82280k;
        int i15 = this.f82279j;
        if (!context.isRestricted()) {
            try {
                Typeface font = n3Var.getFont(i13, this.f82279j, new q0(this, i14, i15, new WeakReference(this.f82270a)));
                if (font != null) {
                    if (i10 < 28 || this.f82280k == -1) {
                        this.f82281l = font;
                    } else {
                        this.f82281l = u0.a(Typeface.create(font, 0), this.f82280k, (this.f82279j & 2) != 0);
                    }
                }
                this.f82282m = this.f82281l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f82281l != null || (string = n3Var.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f82280k == -1) {
            this.f82281l = Typeface.create(string, this.f82279j);
        } else {
            this.f82281l = u0.a(Typeface.create(string, 0), this.f82280k, (this.f82279j & 2) != 0);
        }
    }
}
