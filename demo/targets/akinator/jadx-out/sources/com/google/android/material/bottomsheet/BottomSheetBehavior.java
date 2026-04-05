package com.google.android.material.bottomsheet;

import ag.h;
import ag.l;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.digidust.elokence.akinator.freemium.R;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import i4.m;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import qg.t0;
import sg.i;
import x3.z1;
import y3.c;
import yg.j;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.a implements sg.b {
    public boolean A;
    public final p B;
    public boolean C;
    public final h D;
    public ValueAnimator E;
    public int F;
    public int G;
    public int H;
    public float I;
    public int J;
    public final float K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public m S;
    public boolean T;
    public int U;
    public boolean V;
    public float W;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: a0, reason: collision with root package name */
    public WeakReference f28980a0;

    /* renamed from: b, reason: collision with root package name */
    public int f28981b;

    /* renamed from: b0, reason: collision with root package name */
    public WeakReference f28982b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28983c;

    /* renamed from: c0, reason: collision with root package name */
    public final ArrayList f28984c0;

    /* renamed from: d0, reason: collision with root package name */
    public VelocityTracker f28985d0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28986e;

    /* renamed from: e0, reason: collision with root package name */
    public i f28987e0;

    /* renamed from: f, reason: collision with root package name */
    public final float f28988f;

    /* renamed from: f0, reason: collision with root package name */
    public int f28989f0;

    /* renamed from: g, reason: collision with root package name */
    public int f28990g;

    /* renamed from: g0, reason: collision with root package name */
    public int f28991g0;

    /* renamed from: h, reason: collision with root package name */
    public int f28992h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f28993h0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f28994i;

    /* renamed from: i0, reason: collision with root package name */
    public HashMap f28995i0;

    /* renamed from: j, reason: collision with root package name */
    public int f28996j;

    /* renamed from: j0, reason: collision with root package name */
    public final SparseIntArray f28997j0;

    /* renamed from: k, reason: collision with root package name */
    public final int f28998k;

    /* renamed from: k0, reason: collision with root package name */
    public final ag.e f28999k0;

    /* renamed from: l, reason: collision with root package name */
    public final j f29000l;

    /* renamed from: m, reason: collision with root package name */
    public final ColorStateList f29001m;

    /* renamed from: n, reason: collision with root package name */
    public int f29002n;

    /* renamed from: o, reason: collision with root package name */
    public int f29003o;

    /* renamed from: p, reason: collision with root package name */
    public int f29004p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f29005q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f29006r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f29007s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f29008t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f29009u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f29010v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f29011w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f29012x;

    /* renamed from: y, reason: collision with root package name */
    public int f29013y;

    /* renamed from: z, reason: collision with root package name */
    public int f29014z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new com.google.android.material.bottomsheet.a();

        /* renamed from: e, reason: collision with root package name */
        public final int f29015e;

        /* renamed from: f, reason: collision with root package name */
        public final int f29016f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f29017g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f29018h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f29019i;

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f29015e);
            parcel.writeInt(this.f29016f);
            parcel.writeInt(this.f29017g ? 1 : 0);
            parcel.writeInt(this.f29018h ? 1 : 0);
            parcel.writeInt(this.f29019i ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29015e = parcel.readInt();
            this.f29016f = parcel.readInt();
            this.f29017g = parcel.readInt() == 1;
            this.f29018h = parcel.readInt() == 1;
            this.f29019i = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f29015e = bottomSheetBehavior.Q;
            this.f29016f = bottomSheetBehavior.f28992h;
            this.f29017g = bottomSheetBehavior.f28983c;
            this.f29018h = bottomSheetBehavior.L;
            this.f29019i = bottomSheetBehavior.M;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f29015e = i10;
        }
    }

    public BottomSheetBehavior() {
        this.f28981b = 0;
        this.f28983c = true;
        this.f28986e = false;
        this.f29002n = -1;
        this.f29003o = -1;
        this.D = new h(this);
        this.I = 0.5f;
        this.K = -1.0f;
        this.N = true;
        this.O = true;
        this.Q = 4;
        this.R = 4;
        this.W = 0.1f;
        this.f28984c0 = new ArrayList();
        this.f28991g0 = -1;
        this.f28997j0 = new SparseIntArray();
        this.f28999k0 = new ag.e(this);
    }

    public static View f(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewF = f(viewGroup.getChildAt(i10));
            if (viewF != null) {
                return viewF;
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.b)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.b) layoutParams).getBehavior();
        if (behavior instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public static int g(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final void a() {
        int iC = c();
        if (this.f28983c) {
            this.J = Math.max(this.Z - iC, this.G);
        } else {
            this.J = this.Z - iC;
        }
    }

    public void addBottomSheetCallback(a aVar) {
        ArrayList arrayList = this.f28984c0;
        if (arrayList.contains(aVar)) {
            return;
        }
        arrayList.add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            r5 = this;
            yg.j r0 = r5.f29000l
            r1 = 0
            if (r0 == 0) goto L67
            java.lang.ref.WeakReference r0 = r5.f28980a0
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L67
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L67
            java.lang.ref.WeakReference r0 = r5.f28980a0
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.i()
            if (r2 == 0) goto L67
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L67
            yg.j r2 = r5.f29000l
            float r2 = r2.getTopLeftCornerResolvedSize()
            r3 = 0
            android.view.RoundedCorner r3 = r0.getRoundedCorner(r3)
            if (r3 == 0) goto L45
            int r3 = r3.getRadius()
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L45
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L45
            float r3 = r3 / r2
            goto L46
        L45:
            r3 = r1
        L46:
            yg.j r2 = r5.f29000l
            float r2 = r2.getTopRightCornerResolvedSize()
            r4 = 1
            android.view.RoundedCorner r0 = r0.getRoundedCorner(r4)
            if (r0 == 0) goto L62
            int r0 = r0.getRadius()
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L62
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L62
            float r1 = r0 / r2
        L62:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b():float");
    }

    public final int c() {
        int i10;
        return this.f28994i ? Math.min(Math.max(this.f28996j, this.Z - ((this.Y * 9) / 16)), this.X) + this.f29013y : (this.f29005q || this.f29006r || (i10 = this.f29004p) <= 0) ? this.f28992h + this.f29013y : Math.max(this.f28992h, i10 + this.f28998k);
    }

    public float calculateSlideOffset() {
        WeakReference weakReference = this.f28980a0;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return d(((View) this.f28980a0.get()).getTop());
    }

    @Override // sg.b
    public void cancelBackProgress() {
        i iVar = this.f28987e0;
        if (iVar == null) {
            return;
        }
        iVar.cancelBackProgress();
    }

    public final float d(int i10) {
        float f10;
        float expandedOffset;
        int i11 = this.J;
        if (i10 > i11 || i11 == getExpandedOffset()) {
            int i12 = this.J;
            f10 = i12 - i10;
            expandedOffset = this.Z - i12;
        } else {
            int i13 = this.J;
            f10 = i13 - i10;
            expandedOffset = i13 - getExpandedOffset();
        }
        return f10 / expandedOffset;
    }

    public void disableShapeAnimations() {
        this.E = null;
    }

    public final void e(int i10) {
        View view = (View) this.f28980a0.get();
        if (view != null) {
            ArrayList arrayList = this.f28984c0;
            if (arrayList.isEmpty()) {
                return;
            }
            float fD = d(i10);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((a) arrayList.get(i11)).onSlide(view, fD);
            }
        }
    }

    public int getExpandedOffset() {
        if (this.f28983c) {
            return this.G;
        }
        return Math.max(this.F, this.f29009u ? 0 : this.f29014z);
    }

    public float getHalfExpandedRatio() {
        return this.I;
    }

    public float getHideFriction() {
        return this.W;
    }

    public int getLastStableState() {
        return this.R;
    }

    public int getMaxHeight() {
        return this.f29003o;
    }

    public int getMaxWidth() {
        return this.f29002n;
    }

    public int getPeekHeight() {
        if (this.f28994i) {
            return -1;
        }
        return this.f28992h;
    }

    public int getSaveFlags() {
        return this.f28981b;
    }

    public int getSignificantVelocityThreshold() {
        return this.f28990g;
    }

    public boolean getSkipCollapsed() {
        return this.M;
    }

    public int getState() {
        return this.Q;
    }

    public final int h(int i10) {
        if (i10 == 3) {
            return getExpandedOffset();
        }
        if (i10 == 4) {
            return this.J;
        }
        if (i10 == 5) {
            return this.Z;
        }
        if (i10 == 6) {
            return this.H;
        }
        throw new IllegalArgumentException(a.b.e(i10, "Invalid state to get top offset: "));
    }

    @Override // sg.b
    public void handleBackInvoked() {
        i iVar = this.f28987e0;
        if (iVar == null) {
            return;
        }
        f.c cVarOnHandleBackInvoked = iVar.onHandleBackInvoked();
        if (cVarOnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            setState(this.L ? 5 : 4);
        } else if (this.L) {
            this.f28987e0.finishBackProgressNotPersistent(cVarOnHandleBackInvoked, new ag.b(this));
        } else {
            this.f28987e0.finishBackProgressPersistent(cVarOnHandleBackInvoked, null);
            setState(4);
        }
    }

    public final boolean i() {
        WeakReference weakReference = this.f28980a0;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f28980a0.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean isDraggable() {
        return this.N;
    }

    public boolean isDraggableOnNestedScroll() {
        return this.O;
    }

    public boolean isFitToContents() {
        return this.f28983c;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.f29005q;
    }

    public boolean isHideable() {
        return this.L;
    }

    public boolean isHideableWhenDragging() {
        return true;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public boolean isShouldRemoveExpandedCorners() {
        return this.A;
    }

    public final void j(int i10) {
        View view;
        if (this.Q == i10) {
            return;
        }
        this.Q = i10;
        if (i10 == 4 || i10 == 3 || i10 == 6 || (this.L && i10 == 5)) {
            this.R = i10;
        }
        WeakReference weakReference = this.f28980a0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            o(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            o(false);
        }
        n(i10, true);
        while (true) {
            ArrayList arrayList = this.f28984c0;
            if (i11 >= arrayList.size()) {
                m();
                return;
            } else {
                ((a) arrayList.get(i11)).onStateChanged(view, i10);
                i11++;
            }
        }
    }

    public final boolean k(View view, float f10) {
        if (this.M) {
            return true;
        }
        if (!isHideableWhenDragging() || view.getTop() < this.J) {
            return false;
        }
        return Math.abs(((f10 * this.W) + ((float) view.getTop())) - ((float) this.J)) / ((float) c()) > 0.5f;
    }

    public final void l(View view, int i10, boolean z10) {
        int iH = h(i10);
        m mVar = this.S;
        if (mVar == null || (!z10 ? mVar.smoothSlideViewTo(view, view.getLeft(), iH) : mVar.settleCapturedViewAt(view.getLeft(), iH))) {
            j(i10);
            return;
        }
        j(2);
        n(i10, true);
        this.D.a(i10);
    }

    public final void m() {
        View view;
        WeakReference weakReference = this.f28980a0;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        z1.removeAccessibilityAction(view, 524288);
        z1.removeAccessibilityAction(view, 262144);
        z1.removeAccessibilityAction(view, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        SparseIntArray sparseIntArray = this.f28997j0;
        int i10 = sparseIntArray.get(0, -1);
        if (i10 != -1) {
            z1.removeAccessibilityAction(view, i10);
            sparseIntArray.delete(0);
        }
        if (!this.f28983c && this.Q != 6) {
            sparseIntArray.put(0, z1.addAccessibilityAction(view, view.getResources().getString(R.string.bottomsheet_action_expand_halfway), new ag.f(this, 6)));
        }
        if (this.L && isHideableWhenDragging() && this.Q != 5) {
            z1.replaceAccessibilityAction(view, c.a.f94046n, null, new ag.f(this, 5));
        }
        int i11 = this.Q;
        if (i11 == 3) {
            z1.replaceAccessibilityAction(view, c.a.f94045m, null, new ag.f(this, this.f28983c ? 4 : 6));
            return;
        }
        if (i11 == 4) {
            z1.replaceAccessibilityAction(view, c.a.f94044l, null, new ag.f(this, this.f28983c ? 3 : 6));
        } else {
            if (i11 != 6) {
                return;
            }
            z1.replaceAccessibilityAction(view, c.a.f94045m, null, new ag.f(this, 4));
            z1.replaceAccessibilityAction(view, c.a.f94044l, null, new ag.f(this, 3));
        }
    }

    public final void n(int i10, boolean z10) {
        j jVar;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z11 = this.Q == 3 && (this.A || i());
        if (this.C == z11 || (jVar = this.f29000l) == null) {
            return;
        }
        this.C = z11;
        if (!z10 || (valueAnimator = this.E) == null) {
            ValueAnimator valueAnimator2 = this.E;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.E.cancel();
            }
            jVar.setInterpolation(this.C ? b() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.E.reverse();
        } else {
            this.E.setFloatValues(jVar.getInterpolation(), z11 ? b() : 1.0f);
            this.E.start();
        }
    }

    public final void o(boolean z10) {
        HashMap map;
        WeakReference weakReference = this.f28980a0;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.f28995i0 != null) {
                    return;
                } else {
                    this.f28995i0 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f28980a0.get()) {
                    if (z10) {
                        this.f28995i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f28986e) {
                            childAt.setImportantForAccessibility(4);
                        }
                    } else if (this.f28986e && (map = this.f28995i0) != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f28995i0.get(childAt)).intValue());
                    }
                }
            }
            if (!z10) {
                this.f28995i0 = null;
            } else if (this.f28986e) {
                ((View) this.f28980a0.get()).sendAccessibilityEvent(8);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
        super.onAttachedToLayoutParams(bVar);
        this.f28980a0 = null;
        this.S = null;
        this.f28987e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f28980a0 = null;
        this.S = null;
        this.f28987e0 = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        int i10;
        m mVar;
        if (!v10.isShown() || !this.N) {
            this.T = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f28989f0 = -1;
            this.f28991g0 = -1;
            VelocityTracker velocityTracker = this.f28985d0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f28985d0 = null;
            }
        }
        if (this.f28985d0 == null) {
            this.f28985d0 = VelocityTracker.obtain();
        }
        this.f28985d0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            this.f28991g0 = y10;
            if (this.Q != 2) {
                WeakReference weakReference = this.f28982b0;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && coordinatorLayout.isPointInChildBounds(view, x10, y10)) {
                    this.f28989f0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f28993h0 = true;
                }
            }
            this.T = this.f28989f0 == -1 && !coordinatorLayout.isPointInChildBounds(v10, x10, this.f28991g0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f28993h0 = false;
            this.f28989f0 = -1;
            if (this.T) {
                this.T = false;
                return false;
            }
        }
        if (this.T || (mVar = this.S) == null || !mVar.shouldInterceptTouchEvent(motionEvent)) {
            WeakReference weakReference2 = this.f28982b0;
            View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view2 == null || this.T || this.Q == 1 || coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.S == null || (i10 = this.f28991g0) == -1 || Math.abs(i10 - motionEvent.getY()) <= this.S.getTouchSlop()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        if (coordinatorLayout.getFitsSystemWindows() && !v10.getFitsSystemWindows()) {
            v10.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.f28980a0 == null) {
            this.f28996j = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || isGestureInsetBottomIgnored() || this.f28994i) ? false : true;
            if (this.f29006r || this.f29007s || this.f29008t || this.f29010v || this.f29011w || this.f29012x || z10) {
                t0.doOnApplyWindowInsets(v10, new ag.d(this, z10));
            }
            z1.setWindowInsetsAnimationCallback(v10, new l(v10));
            this.f28980a0 = new WeakReference(v10);
            this.f28987e0 = new i(v10);
            j jVar = this.f29000l;
            if (jVar != null) {
                v10.setBackground(jVar);
                float elevation = this.K;
                if (elevation == -1.0f) {
                    elevation = v10.getElevation();
                }
                this.f29000l.setElevation(elevation);
            } else {
                ColorStateList colorStateList = this.f29001m;
                if (colorStateList != null) {
                    z1.setBackgroundTintList(v10, colorStateList);
                }
            }
            m();
            if (v10.getImportantForAccessibility() == 0) {
                v10.setImportantForAccessibility(1);
            }
        }
        if (this.S == null) {
            this.S = m.create(coordinatorLayout, this.f28999k0);
        }
        int top = v10.getTop();
        coordinatorLayout.onLayoutChild(v10, i10);
        this.Y = coordinatorLayout.getWidth();
        this.Z = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.X = height;
        int iMin = this.Z;
        int i12 = iMin - height;
        int i13 = this.f29014z;
        if (i12 < i13) {
            if (this.f29009u) {
                int i14 = this.f29003o;
                if (i14 != -1) {
                    iMin = Math.min(iMin, i14);
                }
                this.X = iMin;
            } else {
                int iMin2 = iMin - i13;
                int i15 = this.f29003o;
                if (i15 != -1) {
                    iMin2 = Math.min(iMin2, i15);
                }
                this.X = iMin2;
            }
        }
        this.G = Math.max(0, this.Z - this.X);
        this.H = (int) ((1.0f - this.I) * this.Z);
        a();
        int i16 = this.Q;
        if (i16 == 3) {
            z1.offsetTopAndBottom(v10, getExpandedOffset());
        } else if (i16 == 6) {
            z1.offsetTopAndBottom(v10, this.H);
        } else if (this.L && i16 == 5) {
            z1.offsetTopAndBottom(v10, this.Z);
        } else if (i16 == 4) {
            z1.offsetTopAndBottom(v10, this.J);
        } else if (i16 == 1 || i16 == 2) {
            z1.offsetTopAndBottom(v10, top - v10.getTop());
        }
        n(this.Q, false);
        this.f28982b0 = new WeakReference(f(v10));
        while (true) {
            ArrayList arrayList = this.f28984c0;
            if (i11 >= arrayList.size()) {
                return true;
            }
            ((a) arrayList.get(i11)).a(v10);
            i11++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(g(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f29002n, marginLayoutParams.width), g(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f29003o, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v10, View view, float f10, float f11) {
        WeakReference weakReference;
        if (isNestedScrollingCheckEnabled() && (weakReference = this.f28982b0) != null && view == weakReference.get()) {
            return !(this.Q == 3 || this.P) || super.onNestedPreFling(coordinatorLayout, v10, view, f10, f11);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f28982b0;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (!isNestedScrollingCheckEnabled() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (!this.V && !this.O && view == view2 && view.canScrollVertically(1)) {
                    this.P = true;
                    return;
                }
                if (i13 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    z1.offsetTopAndBottom(v10, -expandedOffset);
                    j(3);
                } else {
                    if (!this.N) {
                        return;
                    }
                    iArr[1] = i11;
                    z1.offsetTopAndBottom(v10, -i11);
                    j(1);
                }
            } else if (i11 < 0) {
                boolean zCanScrollVertically = view.canScrollVertically(-1);
                if (!this.V && !this.O && view == view2 && zCanScrollVertically) {
                    this.P = true;
                    return;
                }
                if (!zCanScrollVertically) {
                    if (i13 > this.J && (!isHideable() || !isHideableWhenDragging())) {
                        int i14 = top - this.J;
                        iArr[1] = i14;
                        z1.offsetTopAndBottom(v10, -i14);
                        j(4);
                    } else {
                        if (!this.N) {
                            return;
                        }
                        iArr[1] = i11;
                        z1.offsetTopAndBottom(v10, -i11);
                        j(1);
                    }
                }
            }
            e(v10.getTop());
            this.U = i11;
            this.V = true;
            this.P = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v10, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v10, savedState.getSuperState());
        int i10 = this.f28981b;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f28992h = savedState.f29016f;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f28983c = savedState.f29017g;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.L = savedState.f29018h;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.M = savedState.f29019i;
            }
        }
        int i11 = savedState.f29015e;
        if (i11 == 1 || i11 == 2) {
            this.Q = 4;
            this.R = 4;
        } else {
            this.Q = i11;
            this.R = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v10) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.U = 0;
        this.V = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ba  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.j(r0)
            return
        Lf:
            boolean r3 = r2.isNestedScrollingCheckEnabled()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f28982b0
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.V
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.U
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f28983c
            if (r3 == 0) goto L2f
            goto Lbb
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.H
            if (r3 <= r6) goto Lbb
            goto Lba
        L39:
            boolean r3 = r2.L
            if (r3 == 0) goto L5a
            android.view.VelocityTracker r3 = r2.f28985d0
            if (r3 != 0) goto L43
            r3 = 0
            goto L52
        L43:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.f28988f
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.f28985d0
            int r6 = r2.f28989f0
            float r3 = r3.getYVelocity(r6)
        L52:
            boolean r3 = r2.k(r4, r3)
            if (r3 == 0) goto L5a
            r0 = 5
            goto Lbb
        L5a:
            int r3 = r2.U
            r6 = 4
            if (r3 != 0) goto L9f
            int r3 = r4.getTop()
            boolean r1 = r2.f28983c
            if (r1 == 0) goto L79
            int r5 = r2.G
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.J
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto La3
            goto Lbb
        L79:
            int r1 = r2.H
            if (r3 >= r1) goto L8f
            int r1 = r2.J
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L88
            goto Lbb
        L88:
            boolean r3 = r2.shouldSkipHalfExpandedStateWhenDragging()
            if (r3 == 0) goto Lba
            goto La3
        L8f:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.J
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto La3
            goto Lba
        L9f:
            boolean r3 = r2.f28983c
            if (r3 == 0) goto La5
        La3:
            r0 = r6
            goto Lbb
        La5:
            int r3 = r4.getTop()
            int r0 = r2.H
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.J
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto La3
        Lba:
            r0 = r5
        Lbb:
            r3 = 0
            r2.l(r4, r0, r3)
            r2.V = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.Q;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        m mVar = this.S;
        if (mVar != null && (this.N || i10 == 1)) {
            mVar.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            this.f28989f0 = -1;
            this.f28991g0 = -1;
            VelocityTracker velocityTracker = this.f28985d0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f28985d0 = null;
            }
        }
        if (this.f28985d0 == null) {
            this.f28985d0 = VelocityTracker.obtain();
        }
        this.f28985d0.addMovement(motionEvent);
        if (this.S != null && ((this.N || this.Q == 1) && actionMasked == 2 && !this.T && Math.abs(this.f28991g0 - motionEvent.getY()) > this.S.getTouchSlop())) {
            this.S.captureChildView(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.T;
    }

    public final void p(boolean z10) {
        View view;
        if (this.f28980a0 != null) {
            a();
            if (this.Q != 4 || (view = (View) this.f28980a0.get()) == null) {
                return;
            }
            if (z10) {
                setState(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public void removeBottomSheetCallback(a aVar) {
        this.f28984c0.remove(aVar);
    }

    @Deprecated
    public void setBottomSheetCallback(a aVar) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        ArrayList arrayList = this.f28984c0;
        arrayList.clear();
        if (aVar != null) {
            arrayList.add(aVar);
        }
    }

    public void setDraggable(boolean z10) {
        this.N = z10;
    }

    public void setDraggableOnNestedScroll(boolean z10) {
        this.O = z10;
    }

    public void setExpandedOffset(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.F = i10;
        n(this.Q, true);
    }

    public void setFitToContents(boolean z10) {
        if (this.f28983c == z10) {
            return;
        }
        this.f28983c = z10;
        if (this.f28980a0 != null) {
            a();
        }
        j((this.f28983c && this.Q == 6) ? 3 : this.Q);
        n(this.Q, true);
        m();
    }

    public void setGestureInsetBottomIgnored(boolean z10) {
        this.f29005q = z10;
    }

    public void setHalfExpandedRatio(float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.I = f10;
        if (this.f28980a0 != null) {
            this.H = (int) ((1.0f - f10) * this.Z);
        }
    }

    public void setHideFriction(float f10) {
        this.W = f10;
    }

    public void setHideable(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            if (!z10 && this.Q == 5) {
                setState(4);
            }
            m();
        }
    }

    public void setHideableInternal(boolean z10) {
        this.L = z10;
    }

    public void setMaxHeight(int i10) {
        this.f29003o = i10;
    }

    public void setMaxWidth(int i10) {
        this.f29002n = i10;
    }

    public void setPeekHeight(int i10) {
        setPeekHeight(i10, false);
    }

    public void setSaveFlags(int i10) {
        this.f28981b = i10;
    }

    public void setShouldRemoveExpandedCorners(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            n(getState(), true);
        }
    }

    public void setSignificantVelocityThreshold(int i10) {
        this.f28990g = i10;
    }

    public void setSkipCollapsed(boolean z10) {
        this.M = z10;
    }

    public void setState(int i10) {
        if (i10 == 1 || i10 == 2) {
            throw new IllegalArgumentException(o2.o(new StringBuilder("STATE_"), i10 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        if (!this.L && i10 == 5) {
            o2.u(i10, "Cannot set state: ", "BottomSheetBehavior");
            return;
        }
        int i11 = (i10 == 6 && this.f28983c && h(i10) <= this.G) ? 3 : i10;
        WeakReference weakReference = this.f28980a0;
        if (weakReference == null || weakReference.get() == null) {
            j(i10);
            return;
        }
        View view = (View) this.f28980a0.get();
        ag.a aVar = new ag.a(this, view, i11);
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(aVar);
        } else {
            aVar.run();
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z10) {
        this.f28986e = z10;
    }

    public boolean shouldExpandOnUpwardDrag(long j10, float f10) {
        return false;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    @Override // sg.b
    public void startBackProgress(f.c cVar) {
        i iVar = this.f28987e0;
        if (iVar == null) {
            return;
        }
        iVar.startBackProgress(cVar);
    }

    @Override // sg.b
    public void updateBackProgress(f.c cVar) {
        i iVar = this.f28987e0;
        if (iVar == null) {
            return;
        }
        iVar.updateBackProgress(cVar);
    }

    public final void setPeekHeight(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f28994i) {
                return;
            } else {
                this.f28994i = true;
            }
        } else {
            if (!this.f28994i && this.f28992h == i10) {
                return;
            }
            this.f28994i = false;
            this.f28992h = Math.max(0, i10);
        }
        p(z10);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f28981b = 0;
        this.f28983c = true;
        this.f28986e = false;
        this.f29002n = -1;
        this.f29003o = -1;
        this.D = new h(this);
        this.I = 0.5f;
        this.K = -1.0f;
        this.N = true;
        this.O = true;
        this.Q = 4;
        this.R = 4;
        this.W = 0.1f;
        this.f28984c0 = new ArrayList();
        this.f28991g0 = -1;
        this.f28997j0 = new SparseIntArray();
        this.f28999k0 = new ag.e(this);
        this.f28998k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, uf.a.f88457e);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.f29001m = ug.d.getColorStateList(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(22)) {
            this.B = p.builder(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).build();
        }
        p pVar = this.B;
        if (pVar != null) {
            j jVar = new j(pVar);
            this.f29000l = jVar;
            jVar.initializeElevationOverlay(context);
            ColorStateList colorStateList = this.f29001m;
            if (colorStateList != null) {
                this.f29000l.setFillColor(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.f29000l.setTint(typedValue.data);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(b(), 1.0f);
        this.E = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.E.addUpdateListener(new ag.c(this));
        this.K = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(10);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            setPeekHeight(i10);
        } else {
            setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(10, -1));
        }
        setHideable(typedArrayObtainStyledAttributes.getBoolean(9, false));
        setGestureInsetBottomIgnored(typedArrayObtainStyledAttributes.getBoolean(14, false));
        setFitToContents(typedArrayObtainStyledAttributes.getBoolean(7, true));
        setSkipCollapsed(typedArrayObtainStyledAttributes.getBoolean(13, false));
        setDraggable(typedArrayObtainStyledAttributes.getBoolean(4, true));
        setDraggableOnNestedScroll(typedArrayObtainStyledAttributes.getBoolean(5, true));
        setSaveFlags(typedArrayObtainStyledAttributes.getInt(11, 0));
        setHalfExpandedRatio(typedArrayObtainStyledAttributes.getFloat(8, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(6);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            setExpandedOffset(typedValuePeekValue2.data);
        } else {
            setExpandedOffset(typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0));
        }
        setSignificantVelocityThreshold(typedArrayObtainStyledAttributes.getInt(12, 500));
        this.f29006r = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.f29007s = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.f29008t = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.f29009u = typedArrayObtainStyledAttributes.getBoolean(21, true);
        this.f29010v = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.f29011w = typedArrayObtainStyledAttributes.getBoolean(16, false);
        this.f29012x = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.A = typedArrayObtainStyledAttributes.getBoolean(24, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f28988f = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract void onSlide(View view, float f10);

        public abstract void onStateChanged(View view, int i10);

        public void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
    }
}
