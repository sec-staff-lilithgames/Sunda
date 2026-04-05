package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f7211a;

    /* renamed from: e, reason: collision with root package name */
    public View f7215e;

    /* renamed from: d, reason: collision with root package name */
    public int f7214d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final n f7212b = new n();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7213c = new ArrayList();

    public p(w1 w1Var) {
        this.f7211a = w1Var;
    }

    public final void a(View view, int i10, boolean z10) {
        w1 w1Var = this.f7211a;
        int childCount = i10 < 0 ? w1Var.getChildCount() : e(i10);
        this.f7212b.e(childCount, z10);
        if (z10) {
            this.f7213c.add(view);
            w1Var.onEnteredHiddenState(view);
        }
        w1Var.addView(view, childCount);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        w1 w1Var = this.f7211a;
        int childCount = i10 < 0 ? w1Var.getChildCount() : e(i10);
        this.f7212b.e(childCount, z10);
        if (z10) {
            this.f7213c.add(view);
            w1Var.onEnteredHiddenState(view);
        }
        w1Var.attachViewToParent(view, childCount, layoutParams);
    }

    public final View c(int i10) {
        return this.f7211a.getChildAt(e(i10));
    }

    public final int d() {
        return this.f7211a.getChildCount() - this.f7213c.size();
    }

    public final int e(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f7211a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            n nVar = this.f7212b;
            int iB = i10 - (i11 - nVar.b(i11));
            if (iB == 0) {
                while (nVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public final int f(View view) {
        int iIndexOfChild = this.f7211a.indexOfChild(view);
        if (iIndexOfChild != -1) {
            n nVar = this.f7212b;
            if (!nVar.d(iIndexOfChild)) {
                return iIndexOfChild - nVar.b(iIndexOfChild);
            }
        }
        return -1;
    }

    public final void g(int i10) {
        w1 w1Var = this.f7211a;
        int i11 = this.f7214d;
        if (i11 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int iE = e(i10);
            View childAt = w1Var.getChildAt(iE);
            if (childAt != null) {
                this.f7214d = 1;
                this.f7215e = childAt;
                if (this.f7212b.f(iE)) {
                    h(childAt);
                }
                w1Var.removeViewAt(iE);
            }
            this.f7214d = 0;
            this.f7215e = null;
        } catch (Throwable th2) {
            this.f7214d = 0;
            this.f7215e = null;
            throw th2;
        }
    }

    public final void h(View view) {
        if (this.f7213c.remove(view)) {
            this.f7211a.onLeftHiddenState(view);
        }
    }

    public String toString() {
        return this.f7212b.toString() + ", hidden list:" + this.f7213c.size();
    }
}
