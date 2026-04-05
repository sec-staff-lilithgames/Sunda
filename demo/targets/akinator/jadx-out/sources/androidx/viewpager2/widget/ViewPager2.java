package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import j6.i;
import j6.m;
import j6.n;
import j6.o;
import j6.p;
import j6.q;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f7381b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f7382c;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.viewpager2.widget.a f7383e;

    /* renamed from: f, reason: collision with root package name */
    public int f7384f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7385g;

    /* renamed from: h, reason: collision with root package name */
    public final j6.e f7386h;

    /* renamed from: i, reason: collision with root package name */
    public i f7387i;

    /* renamed from: j, reason: collision with root package name */
    public int f7388j;

    /* renamed from: k, reason: collision with root package name */
    public Parcelable f7389k;

    /* renamed from: l, reason: collision with root package name */
    public p f7390l;

    /* renamed from: m, reason: collision with root package name */
    public o f7391m;

    /* renamed from: n, reason: collision with root package name */
    public c f7392n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.viewpager2.widget.a f7393o;

    /* renamed from: p, reason: collision with root package name */
    public j6.c f7394p;

    /* renamed from: q, reason: collision with root package name */
    public b f7395q;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView.d f7396r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7397s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7398t;

    /* renamed from: u, reason: collision with root package name */
    public int f7399u;

    /* renamed from: v, reason: collision with root package name */
    public m f7400v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();

        /* renamed from: b, reason: collision with root package name */
        public int f7401b;

        /* renamed from: c, reason: collision with root package name */
        public int f7402c;

        /* renamed from: e, reason: collision with root package name */
        public Parcelable f7403e;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7401b);
            parcel.writeInt(this.f7402c);
            parcel.writeParcelable(this.f7403e, i10);
        }
    }

    public ViewPager2(Context context) throws IllegalStateException {
        super(context);
        this.f7381b = new Rect();
        this.f7382c = new Rect();
        this.f7383e = new androidx.viewpager2.widget.a();
        this.f7385g = false;
        this.f7386h = new j6.e(this);
        this.f7388j = -1;
        this.f7396r = null;
        this.f7397s = false;
        this.f7398t = true;
        this.f7399u = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) throws IllegalStateException {
        this.f7400v = new m(this);
        p pVar = new p(this, context);
        this.f7390l = pVar;
        pVar.setId(z1.generateViewId());
        this.f7390l.setDescendantFocusability(131072);
        i iVar = new i(this, context);
        this.f7387i = iVar;
        this.f7390l.setLayoutManager(iVar);
        this.f7390l.setScrollingTouchSlop(1);
        int[] iArr = i6.a.f59430a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        z1.saveAttributeDataForStyleable(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.f7390l.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f7390l.addOnChildAttachStateChangeListener(new j6.f());
            c cVar = new c(this);
            this.f7392n = cVar;
            this.f7394p = new j6.c(this, cVar, this.f7390l);
            o oVar = new o(this);
            this.f7391m = oVar;
            oVar.attachToRecyclerView(this.f7390l);
            this.f7390l.addOnScrollListener(this.f7392n);
            androidx.viewpager2.widget.a aVar = new androidx.viewpager2.widget.a();
            this.f7393o = aVar;
            this.f7392n.f7405a = aVar;
            d dVar = new d(this);
            e eVar = new e(this);
            this.f7393o.f7404a.add(dVar);
            this.f7393o.f7404a.add(eVar);
            this.f7400v.onInitialize(this.f7393o, this.f7390l);
            androidx.viewpager2.widget.a aVar2 = this.f7393o;
            aVar2.f7404a.add(this.f7383e);
            b bVar = new b();
            this.f7395q = bVar;
            this.f7393o.f7404a.add(bVar);
            p pVar2 = this.f7390l;
            attachViewToParent(pVar2, 0, pVar2.getLayoutParams());
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void addItemDecoration(RecyclerView.e eVar) {
        this.f7390l.addItemDecoration(eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        RecyclerView.a adapter;
        if (this.f7388j == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f7389k;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.o) {
                ((androidx.viewpager2.adapter.o) adapter).restoreState(parcelable);
            }
            this.f7389k = null;
        }
        int iMax = Math.max(0, Math.min(this.f7388j, adapter.getItemCount() - 1));
        this.f7384f = iMax;
        this.f7388j = -1;
        this.f7390l.scrollToPosition(iMax);
        this.f7400v.onRestorePendingState();
    }

    public boolean beginFakeDrag() {
        j6.c cVar = this.f7394p;
        c cVar2 = cVar.f69129b;
        if (cVar2.f7410f == 1) {
            return false;
        }
        cVar.f69134g = 0;
        cVar.f69133f = 0;
        cVar.f69135h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = cVar.f69131d;
        if (velocityTracker == null) {
            cVar.f69131d = VelocityTracker.obtain();
            cVar.f69132e = ViewConfiguration.get(cVar.f69128a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        cVar2.f7409e = 4;
        cVar2.d(true);
        if (cVar2.f7410f != 0) {
            cVar.f69130c.stopScroll();
        }
        long j10 = cVar.f69135h;
        MotionEvent motionEventObtain = MotionEvent.obtain(j10, j10, 0, 0.0f, 0.0f, 0);
        cVar.f69131d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final void c(int i10, boolean z10) {
        RecyclerView.a adapter = getAdapter();
        if (adapter == null) {
            if (this.f7388j != -1) {
                this.f7388j = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        int i11 = this.f7384f;
        if (iMin == i11 && this.f7392n.f7410f == 0) {
            return;
        }
        if (iMin == i11 && z10) {
            return;
        }
        double d10 = i11;
        this.f7384f = iMin;
        this.f7400v.onSetNewCurrentItem();
        c cVar = this.f7392n;
        if (cVar.f7410f != 0) {
            cVar.e();
            j6.d dVar = cVar.f7411g;
            d10 = dVar.f69137b + dVar.f69136a;
        }
        c cVar2 = this.f7392n;
        cVar2.getClass();
        cVar2.f7409e = z10 ? 2 : 3;
        cVar2.f7417m = false;
        boolean z11 = cVar2.f7413i != iMin;
        cVar2.f7413i = iMin;
        cVar2.b(2);
        if (z11) {
            cVar2.a(iMin);
        }
        if (!z10) {
            this.f7390l.scrollToPosition(iMin);
            return;
        }
        double d11 = iMin;
        if (Math.abs(d11 - d10) <= 3.0d) {
            this.f7390l.smoothScrollToPosition(iMin);
            return;
        }
        this.f7390l.scrollToPosition(d11 > d10 ? iMin - 3 : iMin + 3);
        p pVar = this.f7390l;
        pVar.post(new q(iMin, pVar));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f7390l.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f7390l.canScrollVertically(i10);
    }

    public final void d() {
        o oVar = this.f7391m;
        if (oVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = oVar.findSnapView(this.f7387i);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.f7387i.getPosition(viewFindSnapView);
        if (position != this.f7384f && getScrollState() == 0) {
            this.f7393o.onPageSelected(position);
        }
        this.f7385g = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f7401b;
            sparseArray.put(this.f7390l.getId(), (Parcelable) sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        b();
    }

    public boolean endFakeDrag() {
        int[] iArrCalculateDistanceToFinalSnap;
        int i10;
        j6.c cVar = this.f7394p;
        c cVar2 = cVar.f69129b;
        boolean z10 = cVar2.f7417m;
        if (!z10) {
            return false;
        }
        if (cVar2.f7410f != 1 || z10) {
            cVar2.f7417m = false;
            cVar2.e();
            j6.d dVar = cVar2.f7411g;
            if (dVar.f69138c == 0) {
                int i11 = dVar.f69137b;
                if (i11 != cVar2.f7412h) {
                    cVar2.a(i11);
                }
                cVar2.b(0);
                cVar2.c();
            } else {
                cVar2.b(2);
            }
        }
        VelocityTracker velocityTracker = cVar.f69131d;
        velocityTracker.computeCurrentVelocity(1000, cVar.f69132e);
        if (!cVar.f69130c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            ViewPager2 viewPager2 = cVar.f69128a;
            View viewFindSnapView = viewPager2.f7391m.findSnapView(viewPager2.f7387i);
            if (viewFindSnapView != null && ((i10 = (iArrCalculateDistanceToFinalSnap = viewPager2.f7391m.calculateDistanceToFinalSnap(viewPager2.f7387i, viewFindSnapView))[0]) != 0 || iArrCalculateDistanceToFinalSnap[1] != 0)) {
                viewPager2.f7390l.smoothScrollBy(i10, iArrCalculateDistanceToFinalSnap[1]);
            }
        }
        return true;
    }

    public boolean fakeDragBy(float f10) {
        j6.c cVar = this.f7394p;
        if (!cVar.f69129b.f7417m) {
            return false;
        }
        float f11 = cVar.f69133f - f10;
        cVar.f69133f = f11;
        int iRound = Math.round(f11 - cVar.f69134g);
        cVar.f69134g += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = cVar.f69128a.getOrientation() == 0;
        int i10 = z10 ? iRound : 0;
        int i11 = z10 ? 0 : iRound;
        float f12 = z10 ? cVar.f69133f : 0.0f;
        float f13 = z10 ? 0.0f : cVar.f69133f;
        cVar.f69130c.scrollBy(i10, i11);
        MotionEvent motionEventObtain = MotionEvent.obtain(cVar.f69135h, jUptimeMillis, 2, f12, f13, 0);
        cVar.f69131d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return this.f7400v.handlesGetAccessibilityClassName() ? this.f7400v.onGetAccessibilityClassName() : super.getAccessibilityClassName();
    }

    public RecyclerView.a getAdapter() {
        return this.f7390l.getAdapter();
    }

    public int getCurrentItem() {
        return this.f7384f;
    }

    public RecyclerView.e getItemDecorationAt(int i10) {
        return this.f7390l.getItemDecorationAt(i10);
    }

    public int getItemDecorationCount() {
        return this.f7390l.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f7399u;
    }

    public int getOrientation() {
        return this.f7387i.getOrientation() == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        p pVar = this.f7390l;
        if (getOrientation() == 0) {
            height = pVar.getWidth() - pVar.getPaddingLeft();
            paddingBottom = pVar.getPaddingRight();
        } else {
            height = pVar.getHeight() - pVar.getPaddingTop();
            paddingBottom = pVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f7392n.f7410f;
    }

    public void invalidateItemDecorations() {
        this.f7390l.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.f7394p.f69129b.f7417m;
    }

    public boolean isUserInputEnabled() {
        return this.f7398t;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f7400v.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f7390l.getMeasuredWidth();
        int measuredHeight = this.f7390l.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f7381b;
        rect.left = paddingLeft;
        rect.right = (i12 - i10) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i13 - i11) - getPaddingBottom();
        Rect rect2 = this.f7382c;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.f7390l.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f7385g) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChild(this.f7390l, i10, i11);
        int measuredWidth = this.f7390l.getMeasuredWidth();
        int measuredHeight = this.f7390l.getMeasuredHeight();
        int measuredState = this.f7390l.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7388j = savedState.f7402c;
        this.f7389k = savedState.f7403e;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7401b = this.f7390l.getId();
        int i10 = this.f7388j;
        if (i10 == -1) {
            i10 = this.f7384f;
        }
        savedState.f7402c = i10;
        Parcelable parcelable = this.f7389k;
        if (parcelable != null) {
            savedState.f7403e = parcelable;
            return savedState;
        }
        Object adapter = this.f7390l.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.o) {
            savedState.f7403e = ((androidx.viewpager2.adapter.o) adapter).saveState();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f7400v.handlesPerformAccessibilityAction(i10, bundle) ? this.f7400v.onPerformAccessibilityAction(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void registerOnPageChangeCallback(a aVar) {
        this.f7383e.f7404a.add(aVar);
    }

    public void removeItemDecoration(RecyclerView.e eVar) {
        this.f7390l.removeItemDecoration(eVar);
    }

    public void removeItemDecorationAt(int i10) {
        this.f7390l.removeItemDecorationAt(i10);
    }

    public void requestTransform() {
        this.f7395q.getClass();
    }

    public void setAdapter(RecyclerView.a aVar) {
        RecyclerView.a adapter = this.f7390l.getAdapter();
        this.f7400v.onDetachAdapter(adapter);
        j6.e eVar = this.f7386h;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(eVar);
        }
        this.f7390l.setAdapter(aVar);
        this.f7384f = 0;
        b();
        this.f7400v.onAttachAdapter(aVar);
        if (aVar != null) {
            aVar.registerAdapterDataObserver(eVar);
        }
    }

    public void setCurrentItem(int i10) {
        setCurrentItem(i10, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f7400v.onSetLayoutDirection();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f7399u = i10;
        this.f7390l.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f7387i.setOrientation(i10);
        this.f7400v.onSetOrientation();
    }

    public void setPageTransformer(n nVar) {
        if (nVar != null) {
            if (!this.f7397s) {
                this.f7396r = this.f7390l.getItemAnimator();
                this.f7397s = true;
            }
            this.f7390l.setItemAnimator(null);
        } else if (this.f7397s) {
            this.f7390l.setItemAnimator(this.f7396r);
            this.f7396r = null;
            this.f7397s = false;
        }
        this.f7395q.getClass();
        if (nVar == null) {
            return;
        }
        this.f7395q.getClass();
        requestTransform();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f7398t = z10;
        this.f7400v.onSetUserInputEnabled();
    }

    public void unregisterOnPageChangeCallback(a aVar) {
        this.f7383e.f7404a.remove(aVar);
    }

    public void addItemDecoration(RecyclerView.e eVar, int i10) {
        this.f7390l.addItemDecoration(eVar, i10);
    }

    public void setCurrentItem(int i10, boolean z10) {
        if (isFakeDragging()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        c(i10, z10);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) throws IllegalStateException {
        super(context, attributeSet);
        this.f7381b = new Rect();
        this.f7382c = new Rect();
        this.f7383e = new androidx.viewpager2.widget.a();
        this.f7385g = false;
        this.f7386h = new j6.e(this);
        this.f7388j = -1;
        this.f7396r = null;
        this.f7397s = false;
        this.f7398t = true;
        this.f7399u = -1;
        a(context, attributeSet);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public void onPageScrollStateChanged(int i10) {
        }

        public void onPageSelected(int i10) {
        }

        public void onPageScrolled(int i10, float f10, int i11) {
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10) throws IllegalStateException {
        super(context, attributeSet, i10);
        this.f7381b = new Rect();
        this.f7382c = new Rect();
        this.f7383e = new androidx.viewpager2.widget.a();
        this.f7385g = false;
        this.f7386h = new j6.e(this);
        this.f7388j = -1;
        this.f7396r = null;
        this.f7397s = false;
        this.f7398t = true;
        this.f7399u = -1;
        a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i10, int i11) throws IllegalStateException {
        super(context, attributeSet, i10, i11);
        this.f7381b = new Rect();
        this.f7382c = new Rect();
        this.f7383e = new androidx.viewpager2.widget.a();
        this.f7385g = false;
        this.f7386h = new j6.e(this);
        this.f7388j = -1;
        this.f7396r = null;
        this.f7397s = false;
        this.f7398t = true;
        this.f7399u = -1;
        a(context, attributeSet);
    }
}
