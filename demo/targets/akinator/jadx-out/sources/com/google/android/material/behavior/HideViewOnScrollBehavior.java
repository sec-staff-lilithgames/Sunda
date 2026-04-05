package com.google.android.material.behavior;

import a.b;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jh.i;
import p0.o2;
import sg.o;
import yf.a;
import yf.e;
import yf.f;
import yf.g;
import yf.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class HideViewOnScrollBehavior<V extends View> extends CoordinatorLayout.a {

    /* renamed from: b, reason: collision with root package name */
    public i f28925b;

    /* renamed from: c, reason: collision with root package name */
    public AccessibilityManager f28926c;

    /* renamed from: e, reason: collision with root package name */
    public a f28927e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28928f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f28929g;

    /* renamed from: h, reason: collision with root package name */
    public int f28930h;

    /* renamed from: i, reason: collision with root package name */
    public int f28931i;

    /* renamed from: j, reason: collision with root package name */
    public TimeInterpolator f28932j;

    /* renamed from: k, reason: collision with root package name */
    public TimeInterpolator f28933k;

    /* renamed from: l, reason: collision with root package name */
    public int f28934l;

    /* renamed from: m, reason: collision with root package name */
    public int f28935m;

    /* renamed from: n, reason: collision with root package name */
    public int f28936n;

    /* renamed from: o, reason: collision with root package name */
    public ViewPropertyAnimator f28937o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f28938p;

    public HideViewOnScrollBehavior() {
        this.f28928f = true;
        this.f28929g = new LinkedHashSet();
        this.f28934l = 0;
        this.f28935m = 2;
        this.f28936n = 0;
        this.f28938p = false;
    }

    public static <V extends View> HideViewOnScrollBehavior<V> from(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.b)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.b) layoutParams).getBehavior();
        if (behavior instanceof HideViewOnScrollBehavior) {
            return (HideViewOnScrollBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with HideViewOnScrollBehavior");
    }

    public final void a(int i10) {
        i iVar = this.f28925b;
        if (iVar == null || iVar.G() != i10) {
            if (i10 == 0) {
                this.f28925b = new e(2);
            } else if (i10 == 1) {
                this.f28925b = new e(0);
            } else {
                if (i10 != 2) {
                    throw new IllegalArgumentException(o2.k(i10, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.f28925b = new e(1);
            }
        }
    }

    public void addOnScrollStateChangedListener(h hVar) {
        this.f28929g.add(hVar);
    }

    public void clearOnScrollStateChangedListeners() {
        this.f28929g.clear();
    }

    public void disableOnTouchExploration(boolean z10) {
        this.f28928f = z10;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.f28928f;
    }

    public boolean isScrolledIn() {
        return this.f28935m == 2;
    }

    public boolean isScrolledOut() {
        return this.f28935m == 1;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (this.f28926c == null) {
            this.f28926c = (AccessibilityManager) m3.a.getSystemService(v10.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f28926c;
        if (accessibilityManager != null && this.f28927e == null) {
            a aVar = new a(this, v10, 1);
            this.f28927e = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            v10.addOnAttachStateChangeListener(new f(this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (!this.f28938p) {
            int i11 = ((CoordinatorLayout.b) v10.getLayoutParams()).f5609c;
            if (i11 == 80 || i11 == 81) {
                a(1);
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(i11, i10);
                a((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
            }
        }
        this.f28934l = this.f28925b.F(v10, marginLayoutParams);
        this.f28930h = o.resolveThemeDuration(v10.getContext(), R.attr.motionDurationLong2, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f28931i = o.resolveThemeDuration(v10.getContext(), R.attr.motionDurationMedium4, 175);
        this.f28932j = o.resolveThemeInterpolator(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, vf.a.f89243d);
        this.f28933k = o.resolveThemeInterpolator(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, vf.a.f89242c);
        return super.onLayoutChild(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            slideOut(v10);
        } else if (i11 < 0) {
            slideIn(v10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void removeOnScrollStateChangedListener(h hVar) {
        this.f28929g.remove(hVar);
    }

    public void setAdditionalHiddenOffset(V v10, int i10) {
        this.f28936n = i10;
        if (this.f28935m == 1) {
            this.f28925b.M(v10, this.f28934l, i10);
        }
    }

    public void setViewEdge(int i10) {
        this.f28938p = true;
        a(i10);
    }

    public void slideIn(V v10) {
        slideIn(v10, true);
    }

    public void slideOut(V v10) {
        slideOut(v10, true);
    }

    public void slideIn(V v10, boolean z10) {
        if (isScrolledIn()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f28937o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f28935m = 2;
        Iterator it = this.f28929g.iterator();
        if (it.hasNext()) {
            throw b.c(it);
        }
        this.f28925b.getClass();
        if (!z10) {
            this.f28925b.O(0, v10);
            return;
        }
        this.f28937o = this.f28925b.H(0, v10).setInterpolator(this.f28932j).setDuration(this.f28930h).setListener(new g(this));
    }

    public void slideOut(V v10, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (isScrolledOut()) {
            return;
        }
        if (this.f28928f && (accessibilityManager = this.f28926c) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f28937o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f28935m = 1;
        Iterator it = this.f28929g.iterator();
        if (it.hasNext()) {
            throw b.c(it);
        }
        int i10 = this.f28934l + this.f28936n;
        if (z10) {
            this.f28937o = this.f28925b.H(i10, v10).setInterpolator(this.f28933k).setDuration(this.f28931i).setListener(new g(this));
        } else {
            this.f28925b.O(i10, v10);
        }
    }

    public HideViewOnScrollBehavior(int i10) {
        this();
        setViewEdge(i10);
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28928f = true;
        this.f28929g = new LinkedHashSet();
        this.f28934l = 0;
        this.f28935m = 2;
        this.f28936n = 0;
        this.f28938p = false;
    }
}
