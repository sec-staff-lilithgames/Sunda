package com.google.android.material.sidesheet;

import a.b;
import ag.h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.exoplayer2.m0;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import i4.m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kc.p;
import p0.o2;
import sg.n;
import x3.z1;
import y3.c;
import yg.j;
import yg.p;
import zg.c;
import zg.d;
import zg.f;
import zg.g;
import zg.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.a implements c {

    /* renamed from: b, reason: collision with root package name */
    public p f29364b;

    /* renamed from: c, reason: collision with root package name */
    public final j f29365c;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f29366e;

    /* renamed from: f, reason: collision with root package name */
    public final yg.p f29367f;

    /* renamed from: g, reason: collision with root package name */
    public final h f29368g;

    /* renamed from: h, reason: collision with root package name */
    public final float f29369h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29370i;

    /* renamed from: j, reason: collision with root package name */
    public int f29371j;

    /* renamed from: k, reason: collision with root package name */
    public int f29372k;

    /* renamed from: l, reason: collision with root package name */
    public m f29373l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29374m;

    /* renamed from: n, reason: collision with root package name */
    public float f29375n;

    /* renamed from: o, reason: collision with root package name */
    public int f29376o;

    /* renamed from: p, reason: collision with root package name */
    public int f29377p;

    /* renamed from: q, reason: collision with root package name */
    public int f29378q;

    /* renamed from: r, reason: collision with root package name */
    public int f29379r;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference f29380s;

    /* renamed from: t, reason: collision with root package name */
    public WeakReference f29381t;

    /* renamed from: u, reason: collision with root package name */
    public int f29382u;

    /* renamed from: v, reason: collision with root package name */
    public VelocityTracker f29383v;

    /* renamed from: w, reason: collision with root package name */
    public n f29384w;

    /* renamed from: x, reason: collision with root package name */
    public int f29385x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashSet f29386y;

    /* renamed from: z, reason: collision with root package name */
    public final f f29387z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public final int f29388e;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29388e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29388e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f29388e = sideSheetBehavior.f29371j;
        }
    }

    public SideSheetBehavior() {
        this.f29368g = new h(this);
        this.f29370i = true;
        this.f29371j = 5;
        this.f29372k = 5;
        this.f29375n = 0.1f;
        this.f29382u = -1;
        this.f29386y = new LinkedHashSet();
        this.f29387z = new f(this);
    }

    public static <V extends View> SideSheetBehavior<V> from(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.b)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.b) layoutParams).getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    public final void a(int i10) {
        View view;
        if (this.f29371j == i10) {
            return;
        }
        this.f29371j = i10;
        if (i10 == 3 || i10 == 5) {
            this.f29372k = i10;
        }
        WeakReference weakReference = this.f29380s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = this.f29371j == 5 ? 4 : 0;
        if (view.getVisibility() != i11) {
            view.setVisibility(i11);
        }
        Iterator it = this.f29386y.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onStateChanged(view, i10);
        }
        d();
    }

    public final boolean b() {
        if (this.f29373l != null) {
            return this.f29370i || this.f29371j == 1;
        }
        return false;
    }

    public final void c(View view, int i10, boolean z10) {
        int expandedOffset;
        if (i10 == 3) {
            expandedOffset = getExpandedOffset();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException(b.e(i10, "Invalid state to get outer edge offset: "));
            }
            expandedOffset = this.f29364b.s();
        }
        m mVar = this.f29373l;
        if (mVar == null || (!z10 ? mVar.smoothSlideViewTo(view, expandedOffset, view.getTop()) : mVar.settleCapturedViewAt(expandedOffset, view.getTop()))) {
            a(i10);
        } else {
            a(2);
            this.f29368g.a(i10);
        }
    }

    @Override // zg.c, sg.b
    public void cancelBackProgress() {
        n nVar = this.f29384w;
        if (nVar == null) {
            return;
        }
        nVar.cancelBackProgress();
    }

    public final void d() {
        View view;
        WeakReference weakReference = this.f29380s;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        z1.removeAccessibilityAction(view, 262144);
        z1.removeAccessibilityAction(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        int i10 = 5;
        if (this.f29371j != 5) {
            z1.replaceAccessibilityAction(view, c.a.f94046n, null, new m0(this, i10, 5));
        }
        int i11 = 3;
        if (this.f29371j != 3) {
            z1.replaceAccessibilityAction(view, c.a.f94044l, null, new m0(this, i11, 5));
        }
    }

    public void expand() {
        setState(3);
    }

    public View getCoplanarSiblingView() {
        WeakReference weakReference = this.f29381t;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int getExpandedOffset() {
        return this.f29364b.q();
    }

    public float getHideFriction() {
        return this.f29375n;
    }

    public int getLastStableState() {
        return this.f29372k;
    }

    @Override // zg.c
    public int getState() {
        return this.f29371j;
    }

    @Override // zg.c, sg.b
    public void handleBackInvoked() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        n nVar = this.f29384w;
        if (nVar == null) {
            return;
        }
        f.c cVarOnHandleBackInvoked = nVar.onHandleBackInvoked();
        int i10 = 5;
        if (cVarOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(5);
            return;
        }
        n nVar2 = this.f29384w;
        p pVar = this.f29364b;
        if (pVar != null && pVar.y() != 0) {
            i10 = 3;
        }
        g gVar = new g(this);
        final View coplanarSiblingView = getCoplanarSiblingView();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
            final int iP = this.f29364b.p(marginLayoutParams);
            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: zg.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f97959a.f29364b.V(marginLayoutParams, vf.a.lerp(iP, 0, valueAnimator.getAnimatedFraction()));
                    coplanarSiblingView.requestLayout();
                }
            };
        }
        nVar2.finishBackProgress(cVarOnHandleBackInvoked, i10, gVar, animatorUpdateListener);
    }

    public void hide() {
        setState(5);
    }

    public boolean isDraggable() {
        return this.f29370i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
        super.onAttachedToLayoutParams(bVar);
        this.f29380s = null;
        this.f29373l = null;
        this.f29384w = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f29380s = null;
        this.f29373l = null;
        this.f29384w = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        m mVar;
        VelocityTracker velocityTracker;
        if ((!v10.isShown() && z1.getAccessibilityPaneTitle(v10) == null) || !this.f29370i) {
            this.f29374m = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f29383v) != null) {
            velocityTracker.recycle();
            this.f29383v = null;
        }
        if (this.f29383v == null) {
            this.f29383v = VelocityTracker.obtain();
        }
        this.f29383v.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f29385x = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f29374m) {
            this.f29374m = false;
            return false;
        }
        return (this.f29374m || (mVar = this.f29373l) == null || !mVar.shouldInterceptTouchEvent(motionEvent)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        View view;
        View view2;
        int i11;
        View viewFindViewById;
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int iW = 0;
        if (this.f29380s == null) {
            this.f29380s = new WeakReference(v10);
            this.f29384w = new n(v10);
            j jVar = this.f29365c;
            if (jVar != null) {
                v10.setBackground(jVar);
                float elevation = this.f29369h;
                if (elevation == -1.0f) {
                    elevation = v10.getElevation();
                }
                this.f29365c.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.f29366e;
                if (colorStateList != null) {
                    z1.setBackgroundTintList(v10, colorStateList);
                }
            }
            int i12 = this.f29371j == 5 ? 4 : 0;
            if (v10.getVisibility() != i12) {
                v10.setVisibility(i12);
            }
            d();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
            if (z1.getAccessibilityPaneTitle(v10) == null) {
                z1.setAccessibilityPaneTitle(v10, v10.getResources().getString(R.string.side_sheet_accessibility_pane_title));
            }
        }
        int i13 = Gravity.getAbsoluteGravity(((CoordinatorLayout.b) v10.getLayoutParams()).f5609c, i10) == 3 ? 1 : 0;
        p pVar = this.f29364b;
        if (pVar == null || pVar.y() != i13) {
            CoordinatorLayout.b bVar = null;
            yg.p pVar2 = this.f29367f;
            if (i13 == 0) {
                this.f29364b = new zg.b(this);
                if (pVar2 != null) {
                    WeakReference weakReference = this.f29380s;
                    if (weakReference != null && (view2 = (View) weakReference.get()) != null && (view2.getLayoutParams() instanceof CoordinatorLayout.b)) {
                        bVar = (CoordinatorLayout.b) view2.getLayoutParams();
                    }
                    if (bVar == null || ((ViewGroup.MarginLayoutParams) bVar).rightMargin <= 0) {
                        p.a builder = pVar2.toBuilder();
                        builder.setTopRightCornerSize(0.0f).setBottomRightCornerSize(0.0f);
                        yg.p pVarBuild = builder.build();
                        j jVar2 = this.f29365c;
                        if (jVar2 != null) {
                            jVar2.setShapeAppearanceModel(pVarBuild);
                        }
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalArgumentException(o2.k(i13, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
                }
                this.f29364b = new zg.a(this);
                if (pVar2 != null) {
                    WeakReference weakReference2 = this.f29380s;
                    if (weakReference2 != null && (view = (View) weakReference2.get()) != null && (view.getLayoutParams() instanceof CoordinatorLayout.b)) {
                        bVar = (CoordinatorLayout.b) view.getLayoutParams();
                    }
                    if (bVar == null || ((ViewGroup.MarginLayoutParams) bVar).leftMargin <= 0) {
                        p.a builder2 = pVar2.toBuilder();
                        builder2.setTopLeftCornerSize(0.0f).setBottomLeftCornerSize(0.0f);
                        yg.p pVarBuild2 = builder2.build();
                        j jVar3 = this.f29365c;
                        if (jVar3 != null) {
                            jVar3.setShapeAppearanceModel(pVarBuild2);
                        }
                    }
                }
            }
        }
        if (this.f29373l == null) {
            this.f29373l = m.create(coordinatorLayout, this.f29387z);
        }
        int iW2 = this.f29364b.w(v10);
        coordinatorLayout.onLayoutChild(v10, i10);
        this.f29377p = coordinatorLayout.getWidth();
        this.f29378q = this.f29364b.getParentInnerEdge(coordinatorLayout);
        this.f29376o = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f29379r = marginLayoutParams != null ? this.f29364b.c(marginLayoutParams) : 0;
        int i14 = this.f29371j;
        if (i14 == 1 || i14 == 2) {
            iW = iW2 - this.f29364b.w(v10);
        } else if (i14 != 3) {
            if (i14 != 5) {
                throw new IllegalStateException("Unexpected value: " + this.f29371j);
            }
            iW = this.f29364b.s();
        }
        z1.offsetLeftAndRight(v10, iW);
        if (this.f29381t == null && (i11 = this.f29382u) != -1 && (viewFindViewById = coordinatorLayout.findViewById(i11)) != null) {
            this.f29381t = new WeakReference(viewFindViewById);
        }
        for (d dVar : this.f29386y) {
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.getSuperState() != null) {
            super.onRestoreInstanceState(coordinatorLayout, v10, savedState.getSuperState());
        }
        int i10 = savedState.f29388e;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f29371j = i10;
        this.f29372k = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f29371j == 1 && actionMasked == 0) {
            return true;
        }
        if (b()) {
            this.f29373l.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f29383v) != null) {
            velocityTracker.recycle();
            this.f29383v = null;
        }
        if (this.f29383v == null) {
            this.f29383v = VelocityTracker.obtain();
        }
        this.f29383v.addMovement(motionEvent);
        if (b() && actionMasked == 2 && !this.f29374m && b() && Math.abs(this.f29385x - motionEvent.getX()) > this.f29373l.getTouchSlop()) {
            this.f29373l.captureChildView(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f29374m;
    }

    public void setCoplanarSiblingView(View view) {
        this.f29382u = -1;
        if (view == null) {
            WeakReference weakReference = this.f29381t;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f29381t = null;
            return;
        }
        this.f29381t = new WeakReference(view);
        WeakReference weakReference2 = this.f29380s;
        if (weakReference2 != null) {
            View view2 = (View) weakReference2.get();
            if (view2.isLaidOut()) {
                view2.requestLayout();
            }
        }
    }

    public void setCoplanarSiblingViewId(int i10) {
        this.f29382u = i10;
        WeakReference weakReference = this.f29381t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f29381t = null;
        WeakReference weakReference2 = this.f29380s;
        if (weakReference2 != null) {
            View view = (View) weakReference2.get();
            if (i10 == -1 || !view.isLaidOut()) {
                return;
            }
            view.requestLayout();
        }
    }

    public void setDraggable(boolean z10) {
        this.f29370i = z10;
    }

    public void setHideFriction(float f10) {
        this.f29375n = f10;
    }

    @Override // zg.c
    public void setState(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(j1.o2.o(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        WeakReference weakReference = this.f29380s;
        if (weakReference == null || weakReference.get() == null) {
            a(i10);
            return;
        }
        View view = (View) this.f29380s.get();
        com.applovin.impl.adview.p pVar = new com.applovin.impl.adview.p(this, i10, 8);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(pVar);
        } else {
            pVar.run();
        }
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // zg.c, sg.b
    public void startBackProgress(f.c cVar) {
        n nVar = this.f29384w;
        if (nVar == null) {
            return;
        }
        nVar.startBackProgress(cVar);
    }

    @Override // zg.c, sg.b
    public void updateBackProgress(f.c cVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        n nVar = this.f29384w;
        if (nVar == null) {
            return;
        }
        kc.p pVar = this.f29364b;
        nVar.updateBackProgress(cVar, (pVar == null || pVar.y() == 0) ? 5 : 3);
        WeakReference weakReference = this.f29380s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f29380s.get();
        View coplanarSiblingView = getCoplanarSiblingView();
        if (coplanarSiblingView == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) == null) {
            return;
        }
        this.f29364b.V(marginLayoutParams, (int) ((view.getScaleX() * this.f29376o) + this.f29379r));
        coplanarSiblingView.requestLayout();
    }

    @Override // zg.c
    public void addCallback(i iVar) {
        this.f29386y.add(iVar);
    }

    @Override // zg.c
    public void removeCallback(i iVar) {
        this.f29386y.remove(iVar);
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29368g = new h(this);
        this.f29370i = true;
        this.f29371j = 5;
        this.f29372k = 5;
        this.f29375n = 0.1f;
        this.f29382u = -1;
        this.f29386y = new LinkedHashSet();
        this.f29387z = new f(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.L);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f29366e = ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.f29367f = yg.p.builder(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).build();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setCoplanarSiblingViewId(typedArrayObtainStyledAttributes.getResourceId(5, -1));
        }
        yg.p pVar = this.f29367f;
        if (pVar != null) {
            j jVar = new j(pVar);
            this.f29365c = jVar;
            jVar.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.f29366e;
            if (colorStateList != null) {
                this.f29365c.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f29365c.setTint(typedValue.data);
            }
        }
        this.f29369h = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(4, true));
        typedArrayObtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
