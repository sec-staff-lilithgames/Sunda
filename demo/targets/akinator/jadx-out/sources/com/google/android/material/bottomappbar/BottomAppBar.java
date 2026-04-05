package com.google.android.material.bottomappbar;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import qg.j0;
import qg.t0;
import sg.o;
import yf.d;
import yg.j;
import yg.m;
import yg.p;
import zf.c;
import zf.f;
import zf.g;
import zf.h;
import zf.i;
import zf.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class BottomAppBar extends Toolbar implements androidx.coordinatorlayout.widget.a {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f28949x0 = 0;
    public Integer W;

    /* renamed from: a0, reason: collision with root package name */
    public final j f28950a0;

    /* renamed from: b0, reason: collision with root package name */
    public AnimatorSet f28951b0;

    /* renamed from: c0, reason: collision with root package name */
    public AnimatorSet f28952c0;

    /* renamed from: d0, reason: collision with root package name */
    public int f28953d0;

    /* renamed from: e0, reason: collision with root package name */
    public int f28954e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f28955f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f28956g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f28957h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f28958i0;

    /* renamed from: j0, reason: collision with root package name */
    public final boolean f28959j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f28960k0;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f28961l0;

    /* renamed from: m0, reason: collision with root package name */
    public final boolean f28962m0;

    /* renamed from: n0, reason: collision with root package name */
    public final boolean f28963n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f28964o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f28965p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f28966q0;

    /* renamed from: r0, reason: collision with root package name */
    public Behavior f28967r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f28968s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f28969t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f28970u0;

    /* renamed from: v0, reason: collision with root package name */
    public final zf.a f28971v0;

    /* renamed from: w0, reason: collision with root package name */
    public final zf.b f28972w0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: o, reason: collision with root package name */
        public final Rect f28973o;

        /* renamed from: p, reason: collision with root package name */
        public WeakReference f28974p;

        /* renamed from: q, reason: collision with root package name */
        public int f28975q;

        /* renamed from: r, reason: collision with root package name */
        public final a f28976r;

        public Behavior() {
            this.f28976r = new a(this);
            this.f28973o = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i10) {
            this.f28974p = new WeakReference(bottomAppBar);
            int i11 = BottomAppBar.f28949x0;
            View viewY = bottomAppBar.y();
            if (viewY != null && !viewY.isLaidOut()) {
                BottomAppBar.H(bottomAppBar, viewY);
                this.f28975q = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.b) viewY.getLayoutParams())).bottomMargin;
                if (viewY instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewY;
                    if (bottomAppBar.f28955f0 == 0 && bottomAppBar.f28959j0) {
                        floatingActionButton.setElevation(0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    floatingActionButton.addOnHideAnimationListener(bottomAppBar.f28971v0);
                    floatingActionButton.addOnShowAnimationListener(new zf.j(bottomAppBar));
                    floatingActionButton.addTransformationCallback(bottomAppBar.f28972w0);
                }
                viewY.addOnLayoutChangeListener(this.f28976r);
                bottomAppBar.E();
            }
            coordinatorLayout.onLayoutChild(bottomAppBar, i10);
            return super.onLayoutChild(coordinatorLayout, (CoordinatorLayout) bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.onStartNestedScroll(coordinatorLayout, (CoordinatorLayout) bottomAppBar, view, view2, i10, i11);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f28976r = new a(this);
            this.f28973o = new Rect();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* renamed from: e, reason: collision with root package name */
        public int f28977e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f28978f;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f28977e);
            parcel.writeInt(this.f28978f ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f28977e = parcel.readInt();
            this.f28978f = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    public static void H(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.b bVar = (CoordinatorLayout.b) view.getLayoutParams();
        bVar.f5610d = 17;
        int i10 = bottomAppBar.f28955f0;
        if (i10 == 1) {
            bVar.f5610d = 49;
        }
        if (i10 == 0) {
            bVar.f5610d |= 80;
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f28968s0;
    }

    private int getFabAlignmentAnimationDuration() {
        return o.resolveThemeDuration(getContext(), R.attr.motionDurationLong2, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return A(this.f28953d0);
    }

    private float getFabTranslationY() {
        if (this.f28955f0 == 1) {
            return -getTopEdgeTreatment().f97954f;
        }
        return y() != null ? (-((getMeasuredHeight() + getBottomInset()) - r0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f28970u0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f28969t0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k getTopEdgeTreatment() {
        return (k) this.f28950a0.getShapeAppearanceModel().getTopEdge();
    }

    public final float A(int i10) {
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewY = y();
        int i11 = zIsLayoutRtl ? this.f28970u0 : this.f28969t0;
        return ((getMeasuredWidth() / 2) - ((this.f28957h0 == -1 || viewY == null) ? this.f28956g0 + i11 : ((viewY.getMeasuredWidth() / 2) + this.f28957h0) + i11)) * (zIsLayoutRtl ? -1 : 1);
    }

    public final boolean B() {
        View viewY = y();
        FloatingActionButton floatingActionButton = viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null;
        return floatingActionButton != null && floatingActionButton.isOrWillBeShown();
    }

    public final void C(int i10, boolean z10) {
        if (!isLaidOut()) {
            this.f28965p0 = false;
            replaceMenu(this.f28964o0);
            return;
        }
        AnimatorSet animatorSet = this.f28952c0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!B()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            objectAnimatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
            if (Math.abs(actionMenuView.getTranslationX() - z(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                objectAnimatorOfFloat2.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
                objectAnimatorOfFloat2.addListener(new h(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playSequentially(objectAnimatorOfFloat2, objectAnimatorOfFloat);
                arrayList.add(animatorSet2);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(objectAnimatorOfFloat);
            }
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(arrayList);
        this.f28952c0 = animatorSet3;
        animatorSet3.addListener(new g(this));
        this.f28952c0.start();
    }

    public final void D() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f28952c0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (B()) {
            G(actionMenuView, this.f28953d0, this.f28966q0, false);
        } else {
            G(actionMenuView, 0, false, false);
        }
    }

    public final void E() {
        getTopEdgeTreatment().f97955g = getFabTranslationX();
        this.f28950a0.setInterpolation((this.f28966q0 && B() && this.f28955f0 == 1) ? 1.0f : 0.0f);
        View viewY = y();
        if (viewY != null) {
            viewY.setTranslationY(getFabTranslationY());
            viewY.setTranslationX(getFabTranslationX());
        }
    }

    public final void F(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().getFabDiameter()) {
            getTopEdgeTreatment().setFabDiameter(f10);
            this.f28950a0.invalidateSelf();
        }
    }

    public final void G(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        i iVar = new i(this, actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(iVar);
        } else {
            iVar.run();
        }
    }

    public void addOnScrollStateChangedListener(d dVar) {
        getBehavior().addOnScrollStateChangedListener(dVar);
    }

    public void clearOnScrollStateChangedListeners() {
        getBehavior().clearOnScrollStateChangedListeners();
    }

    public ColorStateList getBackgroundTint() {
        return this.f28950a0.getTintList();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f97954f;
    }

    public int getFabAlignmentMode() {
        return this.f28953d0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f28957h0;
    }

    public int getFabAnchorMode() {
        return this.f28955f0;
    }

    public int getFabAnimationMode() {
        return this.f28954e0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f97952c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f97951b;
    }

    public boolean getHideOnScroll() {
        return this.f28960k0;
    }

    public int getMenuAlignmentMode() {
        return this.f28958i0;
    }

    public boolean isScrolledDown() {
        return getBehavior().isScrolledDown();
    }

    public boolean isScrolledUp() {
        return getBehavior().isScrolledUp();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.setParentAbsoluteElevation(this, this.f28950a0);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            AnimatorSet animatorSet = this.f28952c0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = this.f28951b0;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            E();
            View viewY = y();
            if (viewY != null && viewY.isLaidOut()) {
                viewY.post(new com.google.android.material.datepicker.d(viewY, 2));
            }
        }
        D();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f28953d0 = savedState.f28977e;
        this.f28966q0 = savedState.f28978f;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f28977e = this.f28953d0;
        savedState.f28978f = this.f28966q0;
        return savedState;
    }

    public void performHide() {
        performHide(true);
    }

    public void performShow() {
        performShow(true);
    }

    public void removeOnScrollStateChangedListener(d dVar) {
        getBehavior().removeOnScrollStateChangedListener(dVar);
    }

    public void replaceMenu(int i10) {
        if (i10 != 0) {
            this.f28964o0 = 0;
            getMenu().clear();
            inflateMenu(i10);
        }
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        this.f28950a0.setTintList(colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().a(f10);
            this.f28950a0.invalidateSelf();
            E();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        j jVar = this.f28950a0;
        jVar.setElevation(f10);
        getBehavior().setAdditionalHiddenOffsetY(this, jVar.getShadowRadius() - jVar.getShadowOffsetY());
    }

    public void setFabAlignmentMode(int i10) {
        setFabAlignmentModeAndReplaceMenu(i10, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i10, int i11) {
        this.f28964o0 = i11;
        this.f28965p0 = true;
        C(i10, this.f28966q0);
        if (this.f28953d0 != i10 && isLaidOut()) {
            AnimatorSet animatorSet = this.f28951b0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f28954e0 == 1) {
                View viewY = y();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewY instanceof FloatingActionButton ? (FloatingActionButton) viewY : null, "translationX", A(i10));
                objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
                arrayList.add(objectAnimatorOfFloat);
            } else {
                View viewY2 = y();
                FloatingActionButton floatingActionButton = viewY2 instanceof FloatingActionButton ? (FloatingActionButton) viewY2 : null;
                if (floatingActionButton != null && !floatingActionButton.isOrWillBeHidden()) {
                    floatingActionButton.hide(new f(this, i10));
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            animatorSet2.setInterpolator(o.resolveThemeInterpolator(getContext(), R.attr.motionEasingEmphasizedInterpolator, vf.a.f89240a));
            this.f28951b0 = animatorSet2;
            animatorSet2.addListener(new zf.d(this));
            this.f28951b0.start();
        }
        this.f28953d0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f28957h0 != i10) {
            this.f28957h0 = i10;
            E();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f28955f0 = i10;
        E();
        View viewY = y();
        if (viewY != null) {
            H(this, viewY);
            viewY.requestLayout();
            this.f28950a0.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f28954e0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().getFabCornerRadius()) {
            getTopEdgeTreatment().setFabCornerSize(f10);
            this.f28950a0.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f97952c = f10;
            this.f28950a0.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f97951b = f10;
            this.f28950a0.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f28960k0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f28958i0 != i10) {
            this.f28958i0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                G(actionMenuView, this.f28953d0, B(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.W != null) {
            drawable = p3.a.wrap(drawable.mutate());
            drawable.setTint(this.W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.W = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public final View y() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).getDependents(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    public final int z(ActionMenuView actionMenuView, int i10, boolean z10) throws Resources.NotFoundException {
        int dimensionPixelOffset = 0;
        if (this.f28958i0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zIsLayoutRtl = t0.isLayoutRtl(this);
        int measuredWidth = zIsLayoutRtl ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.a) && (((Toolbar.a) childAt.getLayoutParams()).f4717a & 8388615) == 8388611) {
                measuredWidth = zIsLayoutRtl ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zIsLayoutRtl ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i12 = zIsLayoutRtl ? this.f28969t0 : -this.f28970u0;
        if (getNavigationIcon() == null) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!zIsLayoutRtl) {
                dimensionPixelOffset = -dimensionPixelOffset;
            }
        }
        return measuredWidth - ((right + i12) + dimensionPixelOffset);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public Behavior getBehavior() {
        if (this.f28967r0 == null) {
            this.f28967r0 = new Behavior();
        }
        return this.f28967r0;
    }

    public void performHide(boolean z10) {
        getBehavior().slideDown(this, z10);
    }

    public void performShow(boolean z10) {
        getBehavior().slideUp(this, z10);
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i10) {
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_MaterialComponents_BottomAppBar), attributeSet, i10);
        j jVar = new j();
        this.f28950a0 = jVar;
        this.f28964o0 = 0;
        this.f28965p0 = false;
        this.f28966q0 = true;
        this.f28971v0 = new zf.a(this);
        this.f28972w0 = new zf.b(this);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88456d, i10, R.style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList colorStateList = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 1);
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            setNavigationIconTint(typedArrayObtainStyledAttributes.getColor(12, -1));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
        float dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, 0);
        float dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f28953d0 = typedArrayObtainStyledAttributes.getInt(3, 0);
        this.f28954e0 = typedArrayObtainStyledAttributes.getInt(6, 0);
        this.f28955f0 = typedArrayObtainStyledAttributes.getInt(5, 1);
        this.f28959j0 = typedArrayObtainStyledAttributes.getBoolean(16, true);
        this.f28958i0 = typedArrayObtainStyledAttributes.getInt(11, 0);
        this.f28960k0 = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f28961l0 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        this.f28962m0 = typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f28963n0 = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f28957h0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, -1);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f28956g0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        jVar.setShapeAppearanceModel(p.builder().setTopEdge(new k(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).build());
        if (z10) {
            jVar.setShadowCompatibilityMode(2);
        } else {
            jVar.setShadowCompatibilityMode(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        jVar.setPaintStyle(Paint.Style.FILL);
        jVar.initializeElevationOverlay(context2);
        jVar.setTintList(colorStateList);
        setElevation(dimensionPixelSize);
        setBackground(jVar);
        t0.doOnApplyWindowInsets(this, attributeSet, i10, R.style.Widget_MaterialComponents_BottomAppBar, new c(this));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
