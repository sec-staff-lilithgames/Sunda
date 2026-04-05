package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import sg.o;
import yf.a;
import yf.b;
import yf.c;
import yf.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.a {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f28913b;

    /* renamed from: c, reason: collision with root package name */
    public int f28914c;

    /* renamed from: e, reason: collision with root package name */
    public int f28915e;

    /* renamed from: f, reason: collision with root package name */
    public TimeInterpolator f28916f;

    /* renamed from: g, reason: collision with root package name */
    public TimeInterpolator f28917g;

    /* renamed from: h, reason: collision with root package name */
    public int f28918h;

    /* renamed from: i, reason: collision with root package name */
    public AccessibilityManager f28919i;

    /* renamed from: j, reason: collision with root package name */
    public a f28920j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28921k;

    /* renamed from: l, reason: collision with root package name */
    public int f28922l;

    /* renamed from: m, reason: collision with root package name */
    public int f28923m;

    /* renamed from: n, reason: collision with root package name */
    public ViewPropertyAnimator f28924n;

    public HideBottomViewOnScrollBehavior() {
        this.f28913b = new LinkedHashSet();
        this.f28918h = 0;
        this.f28921k = true;
        this.f28922l = 2;
        this.f28923m = 0;
    }

    public void addOnScrollStateChangedListener(d dVar) {
        this.f28913b.add(dVar);
    }

    public void clearOnScrollStateChangedListeners() {
        this.f28913b.clear();
    }

    public void disableOnTouchExploration(boolean z10) {
        this.f28921k = z10;
    }

    public boolean isDisabledOnTouchExploration() {
        return this.f28921k;
    }

    public boolean isScrolledDown() {
        return this.f28922l == 1;
    }

    public boolean isScrolledUp() {
        return this.f28922l == 2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f28918h = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f28914c = o.resolveThemeDuration(v10.getContext(), R.attr.motionDurationLong2, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
        this.f28915e = o.resolveThemeDuration(v10.getContext(), R.attr.motionDurationMedium4, 175);
        this.f28916f = o.resolveThemeInterpolator(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, vf.a.f89243d);
        this.f28917g = o.resolveThemeInterpolator(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, vf.a.f89242c);
        if (this.f28919i == null) {
            this.f28919i = (AccessibilityManager) m3.a.getSystemService(v10.getContext(), AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f28919i;
        if (accessibilityManager != null && this.f28920j == null) {
            a aVar = new a(this, v10, 0);
            this.f28920j = aVar;
            accessibilityManager.addTouchExplorationStateChangeListener(aVar);
            v10.addOnAttachStateChangeListener(new b(this));
        }
        return super.onLayoutChild(coordinatorLayout, v10, i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i11 > 0) {
            slideDown(v10);
        } else if (i11 < 0) {
            slideUp(v10);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public void removeOnScrollStateChangedListener(d dVar) {
        this.f28913b.remove(dVar);
    }

    public void setAdditionalHiddenOffsetY(V v10, int i10) {
        this.f28923m = i10;
        if (this.f28922l == 1) {
            v10.setTranslationY(this.f28918h + i10);
        }
    }

    public void slideDown(V v10) {
        slideDown(v10, true);
    }

    public void slideUp(V v10) {
        slideUp(v10, true);
    }

    public void slideDown(V v10, boolean z10) {
        AccessibilityManager accessibilityManager;
        if (isScrolledDown()) {
            return;
        }
        if (this.f28921k && (accessibilityManager = this.f28919i) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f28924n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f28922l = 1;
        Iterator it = this.f28913b.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        int i10 = this.f28918h + this.f28923m;
        if (z10) {
            this.f28924n = v10.animate().translationY(i10).setInterpolator(this.f28917g).setDuration(this.f28915e).setListener(new c(this));
        } else {
            v10.setTranslationY(i10);
        }
    }

    public void slideUp(V v10, boolean z10) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f28924n;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v10.clearAnimation();
        }
        this.f28922l = 2;
        Iterator it = this.f28913b.iterator();
        if (it.hasNext()) {
            throw a.b.c(it);
        }
        if (!z10) {
            v10.setTranslationY(0);
            return;
        }
        this.f28924n = v10.animate().translationY(0).setInterpolator(this.f28916f).setDuration(this.f28914c).setListener(new c(this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28913b = new LinkedHashSet();
        this.f28918h = 0;
        this.f28921k = true;
        this.f28922l = 2;
        this.f28923m = 0;
    }
}
