package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.stateful.ExtendableSavedState;
import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import e4.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pg.e;
import pg.o;
import pg.p;
import pg.r;
import pg.s;
import pg.v;
import q.a0;
import q.w;
import qg.i;
import qg.j0;
import qg.t0;
import qg.u0;
import vf.h;
import vf.k;
import x3.e1;
import x3.z1;
import yg.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class FloatingActionButton extends u0 implements e1, y, og.a, yg.y, androidx.coordinatorlayout.widget.a {

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f29256c;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f29257e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f29258f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f29259g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f29260h;

    /* renamed from: i, reason: collision with root package name */
    public int f29261i;

    /* renamed from: j, reason: collision with root package name */
    public int f29262j;

    /* renamed from: k, reason: collision with root package name */
    public int f29263k;

    /* renamed from: l, reason: collision with root package name */
    public int f29264l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29265m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f29266n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f29267o;

    /* renamed from: p, reason: collision with root package name */
    public final a0 f29268p;

    /* renamed from: q, reason: collision with root package name */
    public final og.c f29269q;

    /* renamed from: r, reason: collision with root package name */
    public pg.y f29270r;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.a {

        /* renamed from: b, reason: collision with root package name */
        public Rect f29271b;

        /* renamed from: c, reason: collision with root package name */
        public a f29272c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f29273e;

        public BaseBehavior() {
            this.f29273e = true;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.b bVar = (CoordinatorLayout.b) floatingActionButton.getLayoutParams();
            if (!this.f29273e || bVar.getAnchorId() != appBarLayout.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (this.f29271b == null) {
                this.f29271b = new Rect();
            }
            Rect rect = this.f29271b;
            i.getDescendantRect(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.c(this.f29272c, false);
                return true;
            }
            floatingActionButton.f(this.f29272c, false);
            return true;
        }

        public final boolean b(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.b bVar = (CoordinatorLayout.b) floatingActionButton.getLayoutParams();
            if (!this.f29273e || bVar.getAnchorId() != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.b) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.c(this.f29272c, false);
                return true;
            }
            floatingActionButton.f(this.f29272c, false);
            return true;
        }

        public boolean isAutoHideEnabled() {
            return this.f29273e;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
            if (bVar.f5614h == 0) {
                bVar.f5614h = 80;
            }
        }

        public void setAutoHideEnabled(boolean z10) {
            this.f29273e = z10;
        }

        public void setInternalAutoHideListener(a aVar) {
            this.f29272c = aVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f29266n;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.b ? ((CoordinatorLayout.b) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) {
                    b(view, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                View view = dependencies.get(i12);
                if (!(view instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.b ? ((CoordinatorLayout.b) layoutParams).getBehavior() instanceof BottomSheetBehavior : false) && b(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i10);
            Rect rect = floatingActionButton.f29266n;
            if (rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.b bVar = (CoordinatorLayout.b) floatingActionButton.getLayoutParams();
                int i13 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) bVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) bVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin) {
                    i11 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) bVar).topMargin) {
                    i11 = -rect.top;
                }
                if (i11 != 0) {
                    z1.offsetTopAndBottom(floatingActionButton, i11);
                }
                if (i13 != 0) {
                    z1.offsetLeftAndRight(floatingActionButton, i13);
                }
            }
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88466n);
            this.f29273e = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.getInsetDodgeRect(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
            return super.isAutoHideEnabled();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.a
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
            super.onAttachedToLayoutParams(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.onDependentViewChanged(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.onLayoutChild(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean z10) {
            super.setAutoHideEnabled(z10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(a aVar) {
            super.setInternalAutoHideListener(aVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private pg.y getImpl() {
        if (this.f29270r == null) {
            this.f29270r = new pg.y(this, new o(this));
        }
        return this.f29270r;
    }

    public void addOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().addOnHideAnimationListener(animatorListener);
    }

    public void addOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        pg.y impl = getImpl();
        if (impl.f81270s == null) {
            impl.f81270s = new ArrayList();
        }
        impl.f81270s.add(animatorListener);
    }

    public void addTransformationCallback(k kVar) {
        pg.y impl = getImpl();
        p pVar = new p(this, kVar);
        if (impl.f81272u == null) {
            impl.f81272u = new ArrayList();
        }
        impl.f81272u.add(pVar);
    }

    public final int b(int i10) {
        int i11 = this.f29262j;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? b(1) : b(0);
    }

    public final void c(a aVar, boolean z10) {
        pg.y impl = getImpl();
        c cVar = aVar == null ? null : new c(this, aVar);
        FloatingActionButton floatingActionButton = impl.f81273v;
        FloatingActionButton floatingActionButton2 = impl.f81273v;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f81269r == 1) {
                return;
            }
        } else if (impl.f81269r != 2) {
            return;
        }
        Animator animator = impl.f81264m;
        if (animator != null) {
            animator.cancel();
        }
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton2.internalSetVisibility(z10 ? 8 : 4, z10);
            if (cVar != null) {
                cVar.onHidden();
                return;
            }
            return;
        }
        h hVar = impl.f81266o;
        AnimatorSet animatorSetB = hVar != null ? impl.b(hVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, pg.y.E, pg.y.F, 0.4f, 0.4f);
        animatorSetB.addListener(new r(impl, z10, cVar));
        ArrayList arrayList = impl.f81271t;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    public void clearCustomSize() {
        setCustomSize(0);
    }

    public final void d(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f29266n;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f29258f;
        if (colorStateList == null) {
            p3.a.clearColorFilter(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f29259g;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(w.getPorterDuffColorFilter(colorForState, mode));
    }

    public final void f(a aVar, boolean z10) {
        pg.y impl = getImpl();
        c cVar = aVar == null ? null : new c(this, aVar);
        FloatingActionButton floatingActionButton = impl.f81273v;
        Matrix matrix = impl.A;
        FloatingActionButton floatingActionButton2 = impl.f81273v;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f81269r == 2) {
                return;
            }
        } else if (impl.f81269r != 1) {
            return;
        }
        Animator animator = impl.f81264m;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.f81265n == null;
        if (!floatingActionButton2.isLaidOut() || floatingActionButton2.isInEditMode()) {
            floatingActionButton.internalSetVisibility(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f81267p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            if (cVar != null) {
                cVar.onShown();
                return;
            }
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z11 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z11 ? 0.4f : 0.0f);
            float f10 = z11 ? 0.4f : 0.0f;
            impl.f81267p = f10;
            impl.a(f10, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        h hVar = impl.f81265n;
        AnimatorSet animatorSetB = hVar != null ? impl.b(hVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, pg.y.C, pg.y.D, 1.0f, 1.0f);
        animatorSetB.addListener(new s(impl, z10, cVar));
        ArrayList arrayList = impl.f81270s;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetB.addListener((Animator.AnimatorListener) it.next());
            }
        }
        animatorSetB.start();
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f29256c;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f29257e;
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().f81273v.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f81260i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f81261j;
    }

    public Drawable getContentBackground() {
        return getImpl().f81256e;
    }

    @Deprecated
    public boolean getContentRect(Rect rect) {
        if (!isLaidOut()) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        d(rect);
        return true;
    }

    public int getCustomSize() {
        return this.f29262j;
    }

    @Override // og.a
    public int getExpandedComponentIdHint() {
        return this.f29269q.getExpandedComponentIdHint();
    }

    public h getHideMotionSpec() {
        return getImpl().f81266o;
    }

    public void getMeasuredContentRect(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        d(rect);
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f29260h;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f29260h;
    }

    @Override // yg.y
    public yg.p getShapeAppearanceModel() {
        return (yg.p) w3.i.checkNotNull(getImpl().f81252a);
    }

    public h getShowMotionSpec() {
        return getImpl().f81265n;
    }

    public int getSize() {
        return this.f29261i;
    }

    public int getSizeDimension() {
        return b(this.f29261i);
    }

    @Override // x3.e1
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // x3.e1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // e4.y
    public ColorStateList getSupportImageTintList() {
        return this.f29258f;
    }

    @Override // e4.y
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f29259g;
    }

    public boolean getUseCompatPadding() {
        return this.f29265m;
    }

    public void hide() {
        hide(null);
    }

    @Override // og.a, og.b
    public boolean isExpanded() {
        return this.f29269q.isExpanded();
    }

    public boolean isOrWillBeHidden() {
        pg.y impl = getImpl();
        if (impl.f81273v.getVisibility() == 0) {
            if (impl.f81269r != 1) {
                return false;
            }
        } else if (impl.f81269r == 2) {
            return false;
        }
        return true;
    }

    public boolean isOrWillBeShown() {
        pg.y impl = getImpl();
        if (impl.f81273v.getVisibility() != 0) {
            if (impl.f81269r != 2) {
                return false;
            }
        } else if (impl.f81269r == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pg.y impl = getImpl();
        v vVar = impl.f81253b;
        if (vVar != null) {
            m.setParentAbsoluteElevation(impl.f81273v, vVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().f81273v.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f29263k = (sizeDimension - this.f29264l) / 2;
        getImpl().h();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f29266n;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.getSuperState());
        this.f29269q.onRestoreInstanceState((Bundle) w3.i.checkNotNull((Bundle) extendableSavedState.f29394e.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f29394e.put("expandableWidgetHelper", this.f29269q.onSaveInstanceState());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.f29267o;
            getMeasuredContentRect(rect);
            pg.y yVar = this.f29270r;
            int i10 = -(yVar.f81257f ? Math.max((yVar.f81262k - yVar.f81273v.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void removeOnHideAnimationListener(Animator.AnimatorListener animatorListener) {
        getImpl().removeOnHideAnimationListener(animatorListener);
    }

    public void removeOnShowAnimationListener(Animator.AnimatorListener animatorListener) {
        ArrayList arrayList = getImpl().f81270s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    public void removeTransformationCallback(k kVar) {
        pg.y impl = getImpl();
        p pVar = new p(this, kVar);
        ArrayList arrayList = impl.f81272u;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f29256c != colorStateList) {
            this.f29256c = colorStateList;
            pg.y impl = getImpl();
            v vVar = impl.f81253b;
            if (vVar != null) {
                vVar.setTintList(colorStateList);
            }
            e eVar = impl.f81255d;
            if (eVar != null) {
                if (colorStateList != null) {
                    eVar.f81220m = colorStateList.getColorForState(eVar.getState(), eVar.f81220m);
                }
                eVar.f81223p = colorStateList;
                eVar.f81221n = true;
                eVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f29257e != mode) {
            this.f29257e = mode;
            v vVar = getImpl().f81253b;
            if (vVar != null) {
                vVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        pg.y impl = getImpl();
        if (impl.f81259h != f10) {
            impl.f81259h = f10;
            impl.e(f10, impl.f81260i, impl.f81261j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        pg.y impl = getImpl();
        if (impl.f81260i != f10) {
            impl.f81260i = f10;
            impl.e(impl.f81259h, f10, impl.f81261j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        pg.y impl = getImpl();
        if (impl.f81261j != f10) {
            impl.f81261j = f10;
            impl.e(impl.f81259h, impl.f81260i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        v vVar = getImpl().f81253b;
        if (vVar != null) {
            vVar.setElevation(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f81257f) {
            getImpl().f81257f = z10;
            requestLayout();
        }
    }

    @Override // og.a, og.b
    public boolean setExpanded(boolean z10) {
        return this.f29269q.setExpanded(z10);
    }

    @Override // og.a
    public void setExpandedComponentIdHint(int i10) {
        this.f29269q.setExpandedComponentIdHint(i10);
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().f81266o = hVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(h.createFromResource(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            pg.y impl = getImpl();
            float f10 = impl.f81267p;
            impl.f81267p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f81273v.setImageMatrix(matrix);
            if (this.f29258f != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f29268p.setImageResource(i10);
        e();
    }

    public void setMaxImageSize(int i10) {
        this.f29264l = i10;
        pg.y impl = getImpl();
        if (impl.f81268q != i10) {
            impl.f81268q = i10;
            float f10 = impl.f81267p;
            impl.f81267p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f81273v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList arrayList = getImpl().f81272u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p) ((pg.w) it.next())).onScaleChanged();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList arrayList = getImpl().f81272u;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p) ((pg.w) it.next())).onScaleChanged();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        pg.y impl = getImpl();
        impl.f81258g = z10;
        impl.h();
    }

    @Override // yg.y
    public void setShapeAppearanceModel(yg.p pVar) {
        getImpl().g(pVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().f81265n = hVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(h.createFromResource(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f29262j = 0;
        if (i10 != this.f29261i) {
            this.f29261i = i10;
            requestLayout();
        }
    }

    @Override // x3.e1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // x3.e1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // e4.y
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f29258f != colorStateList) {
            this.f29258f = colorStateList;
            e();
        }
    }

    @Override // e4.y
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f29259g != mode) {
            this.f29259g = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().f();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().f();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f29265m != z10) {
            this.f29265m = z10;
            getImpl().h();
        }
    }

    @Override // qg.u0, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldEnsureMinTouchTargetSize() {
        return getImpl().f81257f;
    }

    public void show() {
        show(null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void hide(a aVar) {
        c(aVar, true);
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(TJzY.KQjRwHKwHh);
        }
        if (i10 != this.f29262j) {
            this.f29262j = i10;
            requestLayout();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f29260h != colorStateList) {
            this.f29260h = colorStateList;
            pg.y impl = getImpl();
            ColorStateList colorStateList2 = this.f29260h;
            RippleDrawable rippleDrawable = impl.f81254c;
            if (rippleDrawable != null) {
                rippleDrawable.setColor(vg.b.sanitizeRippleDrawableColor(colorStateList2));
            } else if (rippleDrawable != null) {
                rippleDrawable.setTintList(vg.b.sanitizeRippleDrawableColor(colorStateList2));
            }
        }
    }

    public void show(a aVar) {
        f(aVar, true);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(fh.a.wrap(context, attributeSet, i10, R.style.Widget_Design_FloatingActionButton), attributeSet, i10);
        this.f29266n = new Rect();
        this.f29267o = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = j0.obtainStyledAttributes(context2, attributeSet, uf.a.f88465m, i10, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f29256c = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 1);
        this.f29257e = t0.parseTintMode(typedArrayObtainStyledAttributes.getInt(2, -1), null);
        this.f29260h = ug.d.getColorStateList(context2, typedArrayObtainStyledAttributes, 12);
        this.f29261i = typedArrayObtainStyledAttributes.getInt(7, -1);
        this.f29262j = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(9, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(11, 0.0f);
        this.f29265m = typedArrayObtainStyledAttributes.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, 0));
        h hVarCreateFromAttribute = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 15);
        h hVarCreateFromAttribute2 = h.createFromAttribute(context2, typedArrayObtainStyledAttributes, 8);
        yg.p pVarBuild = yg.p.builder(context2, attributeSet, i10, R.style.Widget_Design_FloatingActionButton, yg.p.f94477m).build();
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
        a0 a0Var = new a0(this);
        this.f29268p = a0Var;
        a0Var.loadFromAttributes(attributeSet, i10);
        this.f29269q = new og.c(this);
        getImpl().g(pVarBuild);
        pg.y impl = getImpl();
        ColorStateList colorStateList2 = this.f29256c;
        PorterDuff.Mode mode = this.f29257e;
        ColorStateList colorStateList3 = this.f29260h;
        FloatingActionButton floatingActionButton = impl.f81273v;
        v vVar = new v((yg.p) w3.i.checkNotNull(impl.f81252a));
        impl.f81253b = vVar;
        vVar.setTintList(colorStateList2);
        if (mode != null) {
            impl.f81253b.setTintMode(mode);
        }
        impl.f81253b.initializeElevationOverlay(floatingActionButton.getContext());
        if (dimensionPixelSize > 0) {
            Context context3 = floatingActionButton.getContext();
            e eVar = new e((yg.p) w3.i.checkNotNull(impl.f81252a));
            int color = m3.a.getColor(context3, R.color.design_fab_stroke_top_outer_color);
            int color2 = m3.a.getColor(context3, R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = m3.a.getColor(context3, R.color.design_fab_stroke_end_inner_color);
            int color4 = m3.a.getColor(context3, R.color.design_fab_stroke_end_outer_color);
            eVar.f81216i = color;
            eVar.f81217j = color2;
            eVar.f81218k = color3;
            eVar.f81219l = color4;
            eVar.setBorderWidth(dimensionPixelSize);
            if (colorStateList2 != null) {
                eVar.f81220m = colorStateList2.getColorForState(eVar.getState(), eVar.f81220m);
            }
            eVar.f81223p = colorStateList2;
            eVar.f81221n = true;
            eVar.invalidateSelf();
            impl.f81255d = eVar;
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) w3.i.checkNotNull(impl.f81255d), (Drawable) w3.i.checkNotNull(impl.f81253b)});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            impl.f81255d = null;
            layerDrawable = impl.f81253b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(vg.b.sanitizeRippleDrawableColor(colorStateList), layerDrawable, drawable);
        impl.f81254c = rippleDrawable;
        impl.f81256e = rippleDrawable;
        getImpl().f81262k = dimensionPixelSize2;
        pg.y impl2 = getImpl();
        if (impl2.f81259h != dimension) {
            impl2.f81259h = dimension;
            impl2.e(dimension, impl2.f81260i, impl2.f81261j);
        }
        pg.y impl3 = getImpl();
        if (impl3.f81260i != dimension2) {
            impl3.f81260i = dimension2;
            impl3.e(impl3.f81259h, dimension2, impl3.f81261j);
        }
        pg.y impl4 = getImpl();
        if (impl4.f81261j != dimension3) {
            impl4.f81261j = dimension3;
            impl4.e(impl4.f81259h, impl4.f81260i, dimension3);
        }
        getImpl().f81265n = hVarCreateFromAttribute;
        getImpl().f81266o = hVarCreateFromAttribute2;
        getImpl().f81257f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public void onHidden(FloatingActionButton floatingActionButton) {
        }

        public void onShown(FloatingActionButton floatingActionButton) {
        }
    }
}
