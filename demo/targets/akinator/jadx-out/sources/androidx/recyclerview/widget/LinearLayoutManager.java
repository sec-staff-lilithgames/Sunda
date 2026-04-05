package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.f implements x0, o2 {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final z0 mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final a1 mLayoutChunkResult;
    private b1 mLayoutState;
    int mOrientation;
    o1 mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new c1();

        /* renamed from: b, reason: collision with root package name */
        public int f6945b;

        /* renamed from: c, reason: collision with root package name */
        public int f6946c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f6947e;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f6945b);
            parcel.writeInt(this.f6946c);
            parcel.writeInt(this.f6947e ? 1 : 0);
        }

        public SavedState(SavedState savedState) {
            this.f6945b = savedState.f6945b;
            this.f6946c = savedState.f6946c;
            this.f6947e = savedState.f6947e;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.l lVar, int[] iArr) {
        int i10;
        int extraLayoutSpace = getExtraLayoutSpace(lVar);
        if (this.mLayoutState.f7063f == -1) {
            i10 = 0;
        } else {
            i10 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void collectAdjacentPrefetchPositions(int i10, int i11, RecyclerView.l lVar, h2 h2Var) {
        if (this.mOrientation != 0) {
            i10 = i11;
        }
        if (getChildCount() == 0 || i10 == 0) {
            return;
        }
        ensureLayoutState();
        o(i10 > 0 ? 1 : -1, Math.abs(i10), true, lVar);
        collectPrefetchPositionsForLayoutState(lVar, this.mLayoutState, h2Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void collectInitialPrefetchPositions(int i10, h2 h2Var) {
        boolean z10;
        int i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || (i11 = savedState.f6945b) < 0) {
            n();
            z10 = this.mShouldReverseLayout;
            i11 = this.mPendingScrollPosition;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = savedState.f6947e;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.mInitialPrefetchItemCount && i11 >= 0 && i11 < i10; i13++) {
            ((u0) h2Var).addPosition(i11, 0);
            i11 += i12;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.l lVar, b1 b1Var, h2 h2Var) {
        int i10 = b1Var.f7061d;
        if (i10 < 0 || i10 >= lVar.getItemCount()) {
            return;
        }
        ((u0) h2Var).addPosition(i10, Math.max(0, b1Var.f7064g));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollExtent(RecyclerView.l lVar) {
        return d(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollOffset(RecyclerView.l lVar) {
        return e(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeHorizontalScrollRange(RecyclerView.l lVar) {
        return f(lVar);
    }

    @Override // androidx.recyclerview.widget.o2
    public PointF computeScrollVectorForPosition(int i10) {
        if (getChildCount() == 0) {
            return null;
        }
        int i11 = (i10 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollExtent(RecyclerView.l lVar) {
        return d(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollOffset(RecyclerView.l lVar) {
        return e(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int computeVerticalScrollRange(RecyclerView.l lVar) {
        return f(lVar);
    }

    public int convertFocusDirectionToLayoutDirection(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    public b1 createLayoutState() {
        b1 b1Var = new b1();
        b1Var.f7058a = true;
        b1Var.f7065h = 0;
        b1Var.f7066i = 0;
        b1Var.f7068k = null;
        return b1Var;
    }

    public final int d(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s2.a(lVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public final int e(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s2.b(lVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public final int f(RecyclerView.l lVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return s2.c(lVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    public int fill(RecyclerView.j jVar, b1 b1Var, RecyclerView.l lVar, boolean z10) {
        int i10;
        int i11 = b1Var.f7060c;
        int i12 = b1Var.f7064g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                b1Var.f7064g = i12 + i11;
            }
            l(jVar, b1Var);
        }
        int i13 = b1Var.f7060c + b1Var.f7065h;
        a1 a1Var = this.mLayoutChunkResult;
        while (true) {
            if ((!b1Var.f7069l && i13 <= 0) || (i10 = b1Var.f7061d) < 0 || i10 >= lVar.getItemCount()) {
                break;
            }
            a1Var.f7046a = 0;
            a1Var.f7047b = false;
            a1Var.f7048c = false;
            a1Var.f7049d = false;
            layoutChunk(jVar, lVar, b1Var, a1Var);
            if (!a1Var.f7047b) {
                b1Var.f7059b = (a1Var.f7046a * b1Var.f7063f) + b1Var.f7059b;
                if (!a1Var.f7048c || b1Var.f7068k != null || !lVar.isPreLayout()) {
                    int i14 = b1Var.f7060c;
                    int i15 = a1Var.f7046a;
                    b1Var.f7060c = i14 - i15;
                    i13 -= i15;
                }
                int i16 = b1Var.f7064g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + a1Var.f7046a;
                    b1Var.f7064g = i17;
                    int i18 = b1Var.f7060c;
                    if (i18 < 0) {
                        b1Var.f7064g = i17 + i18;
                    }
                    l(jVar, b1Var);
                }
                if (z10 && a1Var.f7049d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - b1Var.f7060c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z10, z11) : findOneVisibleChild(getChildCount() - 1, -1, z10, z11);
    }

    public View findFirstVisibleChildClosestToStart(boolean z10, boolean z11) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z10, z11) : findOneVisibleChild(0, getChildCount(), z10, z11);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i10, int i11) {
        int i12;
        int i13;
        ensureLayoutState();
        if (i11 <= i10 && i11 >= i10) {
            return getChildAt(i10);
        }
        if (this.mOrientationHelper.getDecoratedStart(getChildAt(i10)) < this.mOrientationHelper.getStartAfterPadding()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    public View findOneVisibleChild(int i10, int i11, boolean z10, boolean z11) {
        ensureLayoutState();
        int i12 = z10 ? 24579 : 320;
        int i13 = z11 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.a(i10, i11, i12, i13) : this.mVerticalBoundCheck.a(i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.j r17, androidx.recyclerview.widget.RecyclerView.l r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r0.ensureLayoutState()
            int r1 = r0.getChildCount()
            r2 = 0
            r3 = 1
            if (r20 == 0) goto L15
            int r1 = r0.getChildCount()
            int r1 = r1 - r3
            r4 = -1
            r5 = r4
            goto L18
        L15:
            r4 = r1
            r1 = r2
            r5 = r3
        L18:
            int r6 = r18.getItemCount()
            androidx.recyclerview.widget.o1 r7 = r0.mOrientationHelper
            int r7 = r7.getStartAfterPadding()
            androidx.recyclerview.widget.o1 r8 = r0.mOrientationHelper
            int r8 = r8.getEndAfterPadding()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r4) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.o1 r14 = r0.mOrientationHelper
            int r14 = r14.getDecoratedStart(r12)
            androidx.recyclerview.widget.o1 r15 = r0.mOrientationHelper
            int r15 = r15.getDecoratedEnd(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$g r13 = (androidx.recyclerview.widget.RecyclerView.g) r13
            boolean r13 = r13.isItemRemoved()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r3
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r3
            goto L63
        L62:
            r14 = r2
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            return r9
        L7d:
            if (r10 == 0) goto L80
            return r10
        L80:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public View findViewByPosition(int i10) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i10 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i10) {
                return childAt;
            }
        }
        return super.findViewByPosition(i10);
    }

    public final int g(int i10, RecyclerView.j jVar, RecyclerView.l lVar, boolean z10) {
        int endAfterPadding;
        int endAfterPadding2 = this.mOrientationHelper.getEndAfterPadding() - i10;
        if (endAfterPadding2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(-endAfterPadding2, jVar, lVar);
        int i12 = i10 + i11;
        if (!z10 || (endAfterPadding = this.mOrientationHelper.getEndAfterPadding() - i12) <= 0) {
            return i11;
        }
        this.mOrientationHelper.offsetChildren(endAfterPadding);
        return endAfterPadding + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public RecyclerView.g generateDefaultLayoutParams() {
        return new RecyclerView.g(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.l lVar) {
        if (lVar.hasTargetScrollPosition()) {
            return this.mOrientationHelper.getTotalSpace();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public final int h(int i10, RecyclerView.j jVar, RecyclerView.l lVar, boolean z10) {
        int startAfterPadding;
        int startAfterPadding2 = i10 - this.mOrientationHelper.getStartAfterPadding();
        if (startAfterPadding2 <= 0) {
            return 0;
        }
        int i11 = -scrollBy(startAfterPadding2, jVar, lVar);
        int i12 = i10 + i11;
        if (!z10 || (startAfterPadding = i12 - this.mOrientationHelper.getStartAfterPadding()) <= 0) {
            return i11;
        }
        this.mOrientationHelper.offsetChildren(-startAfterPadding);
        return i11 - startAfterPadding;
    }

    public final View i() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean isLayoutReversed() {
        return this.mReverseLayout;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public final View j() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    public final void k() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.getDecoratedStart(childAt));
        }
        Log.d(TAG, "==============");
    }

    public final void l(RecyclerView.j jVar, b1 b1Var) {
        if (!b1Var.f7058a || b1Var.f7069l) {
            return;
        }
        int i10 = b1Var.f7064g;
        int i11 = b1Var.f7066i;
        if (b1Var.f7063f == -1) {
            int childCount = getChildCount();
            if (i10 < 0) {
                return;
            }
            int end = (this.mOrientationHelper.getEnd() - i10) + i11;
            if (this.mShouldReverseLayout) {
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (this.mOrientationHelper.getDecoratedStart(childAt) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt) < end) {
                        m(jVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = childCount - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View childAt2 = getChildAt(i14);
                if (this.mOrientationHelper.getDecoratedStart(childAt2) < end || this.mOrientationHelper.getTransformedStartWithDecoration(childAt2) < end) {
                    m(jVar, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int childCount2 = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt3 = getChildAt(i16);
                if (this.mOrientationHelper.getDecoratedEnd(childAt3) > i15 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt3) > i15) {
                    m(jVar, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = childCount2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View childAt4 = getChildAt(i18);
            if (this.mOrientationHelper.getDecoratedEnd(childAt4) > i15 || this.mOrientationHelper.getTransformedEndWithDecoration(childAt4) > i15) {
                m(jVar, i17, i18);
                return;
            }
        }
    }

    public void layoutChunk(RecyclerView.j jVar, RecyclerView.l lVar, b1 b1Var, a1 a1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingLeft;
        int decoratedMeasurementInOther;
        int i14;
        int i15;
        View viewA = b1Var.a(jVar);
        if (viewA == null) {
            a1Var.f7047b = true;
            return;
        }
        RecyclerView.g gVar = (RecyclerView.g) viewA.getLayoutParams();
        if (b1Var.f7068k == null) {
            if (this.mShouldReverseLayout == (b1Var.f7063f == -1)) {
                addView(viewA);
            } else {
                addView(viewA, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (b1Var.f7063f == -1)) {
                addDisappearingView(viewA);
            } else {
                addDisappearingView(viewA, 0);
            }
        }
        measureChildWithMargins(viewA, 0, 0);
        a1Var.f7046a = this.mOrientationHelper.getDecoratedMeasurement(viewA);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                decoratedMeasurementInOther = getWidth() - getPaddingRight();
                paddingLeft = decoratedMeasurementInOther - this.mOrientationHelper.getDecoratedMeasurementInOther(viewA);
            } else {
                paddingLeft = getPaddingLeft();
                decoratedMeasurementInOther = this.mOrientationHelper.getDecoratedMeasurementInOther(viewA) + paddingLeft;
            }
            if (b1Var.f7063f == -1) {
                i15 = b1Var.f7059b;
                i14 = i15 - a1Var.f7046a;
            } else {
                i14 = b1Var.f7059b;
                i15 = a1Var.f7046a + i14;
            }
            int i16 = paddingLeft;
            i13 = i14;
            i12 = i16;
            i11 = i15;
            i10 = decoratedMeasurementInOther;
        } else {
            int paddingTop = getPaddingTop();
            int decoratedMeasurementInOther2 = this.mOrientationHelper.getDecoratedMeasurementInOther(viewA) + paddingTop;
            if (b1Var.f7063f == -1) {
                int i17 = b1Var.f7059b;
                i12 = i17 - a1Var.f7046a;
                i10 = i17;
                i11 = decoratedMeasurementInOther2;
            } else {
                int i18 = b1Var.f7059b;
                i10 = a1Var.f7046a + i18;
                i11 = decoratedMeasurementInOther2;
                i12 = i18;
            }
            i13 = paddingTop;
        }
        layoutDecoratedWithMargins(viewA, i12, i13, i10, i11);
        if (gVar.isItemRemoved() || gVar.isItemChanged()) {
            a1Var.f7048c = true;
        }
        a1Var.f7049d = viewA.hasFocusable();
    }

    public final void m(RecyclerView.j jVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                removeAndRecycleViewAt(i10, jVar);
                i10--;
            }
        } else {
            for (int i12 = i11 - 1; i12 >= i10; i12--) {
                removeAndRecycleViewAt(i12, jVar);
            }
        }
    }

    public final void n() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    public final void o(int i10, int i11, boolean z10, RecyclerView.l lVar) {
        int startAfterPadding;
        this.mLayoutState.f7069l = resolveIsInfinite();
        this.mLayoutState.f7063f = i10;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(lVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z11 = i10 == 1;
        b1 b1Var = this.mLayoutState;
        int i12 = z11 ? iMax2 : iMax;
        b1Var.f7065h = i12;
        if (!z11) {
            iMax = iMax2;
        }
        b1Var.f7066i = iMax;
        if (z11) {
            b1Var.f7065h = this.mOrientationHelper.getEndPadding() + i12;
            View viewI = i();
            b1 b1Var2 = this.mLayoutState;
            b1Var2.f7062e = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(viewI);
            b1 b1Var3 = this.mLayoutState;
            b1Var2.f7061d = position + b1Var3.f7062e;
            b1Var3.f7059b = this.mOrientationHelper.getDecoratedEnd(viewI);
            startAfterPadding = this.mOrientationHelper.getDecoratedEnd(viewI) - this.mOrientationHelper.getEndAfterPadding();
        } else {
            View viewJ = j();
            b1 b1Var4 = this.mLayoutState;
            b1Var4.f7065h = this.mOrientationHelper.getStartAfterPadding() + b1Var4.f7065h;
            b1 b1Var5 = this.mLayoutState;
            b1Var5.f7062e = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(viewJ);
            b1 b1Var6 = this.mLayoutState;
            b1Var5.f7061d = position2 + b1Var6.f7062e;
            b1Var6.f7059b = this.mOrientationHelper.getDecoratedStart(viewJ);
            startAfterPadding = (-this.mOrientationHelper.getDecoratedStart(viewJ)) + this.mOrientationHelper.getStartAfterPadding();
        }
        b1 b1Var7 = this.mLayoutState;
        b1Var7.f7060c = i11;
        if (z10) {
            b1Var7.f7060c = i11 - startAfterPadding;
        }
        b1Var7.f7064g = startAfterPadding;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.j jVar) {
        super.onDetachedFromWindow(recyclerView, jVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(jVar);
            jVar.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public View onFocusSearchFailed(View view, int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        int iConvertFocusDirectionToLayoutDirection;
        n();
        if (getChildCount() != 0 && (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i10)) != Integer.MIN_VALUE) {
            ensureLayoutState();
            o(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.getTotalSpace() * MAX_SCROLL_FACTOR), false, lVar);
            b1 b1Var = this.mLayoutState;
            b1Var.f7064g = Integer.MIN_VALUE;
            b1Var.f7058a = false;
            fill(jVar, b1Var, lVar, true);
            View viewFindOnePartiallyOrCompletelyInvisibleChild = iConvertFocusDirectionToLayoutDirection == -1 ? this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1) : findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : this.mShouldReverseLayout ? findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount()) : findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
            View viewJ = iConvertFocusDirectionToLayoutDirection == -1 ? j() : i();
            if (!viewJ.hasFocusable()) {
                return viewFindOnePartiallyOrCompletelyInvisibleChild;
            }
            if (viewFindOnePartiallyOrCompletelyInvisibleChild != null) {
                return viewJ;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onInitializeAccessibilityNodeInfo(RecyclerView.j jVar, RecyclerView.l lVar, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(jVar, lVar, cVar);
        RecyclerView.a aVar = this.mRecyclerView.mAdapter;
        if (aVar == null || aVar.getItemCount() <= 0) {
            return;
        }
        cVar.addAction(c.a.f94047o);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a2  */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.j r14, androidx.recyclerview.widget.RecyclerView.l r15) {
        /*
            Method dump skipped, instructions count: 1041
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onLayoutChildren(androidx.recyclerview.widget.RecyclerView$j, androidx.recyclerview.widget.RecyclerView$l):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutCompleted(RecyclerView.l lVar) {
        super.onLayoutCompleted(lVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.f6945b = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() <= 0) {
            savedState2.f6945b = -1;
            return savedState2;
        }
        ensureLayoutState();
        boolean z10 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState2.f6947e = z10;
        if (z10) {
            View viewI = i();
            savedState2.f6946c = this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(viewI);
            savedState2.f6945b = getPosition(viewI);
            return savedState2;
        }
        View viewJ = j();
        savedState2.f6945b = getPosition(viewJ);
        savedState2.f6946c = this.mOrientationHelper.getDecoratedStart(viewJ) - this.mOrientationHelper.getStartAfterPadding();
        return savedState2;
    }

    public final void p(int i10, int i11) {
        this.mLayoutState.f7060c = this.mOrientationHelper.getEndAfterPadding() - i11;
        b1 b1Var = this.mLayoutState;
        b1Var.f7062e = this.mShouldReverseLayout ? -1 : 1;
        b1Var.f7061d = i10;
        b1Var.f7063f = 1;
        b1Var.f7059b = i11;
        b1Var.f7064g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        int iMin;
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (i10 == 16908343 && bundle != null) {
            if (this.mOrientation == 1) {
                int i11 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
                if (i11 < 0) {
                    return false;
                }
                RecyclerView recyclerView = this.mRecyclerView;
                iMin = Math.min(i11, getRowCountForAccessibility(recyclerView.mRecycler, recyclerView.mState) - 1);
            } else {
                int i12 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
                if (i12 < 0) {
                    return false;
                }
                RecyclerView recyclerView2 = this.mRecyclerView;
                iMin = Math.min(i12, getColumnCountForAccessibility(recyclerView2.mRecycler, recyclerView2.mState) - 1);
            }
            if (iMin >= 0) {
                scrollToPositionWithOffset(iMin, 0);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.x0
    public void prepareForDrop(View view, View view2, int i10, int i11) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        n();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        char c10 = position < position2 ? (char) 1 : (char) 65535;
        if (this.mShouldReverseLayout) {
            if (c10 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - (this.mOrientationHelper.getDecoratedMeasurement(view) + this.mOrientationHelper.getDecoratedStart(view2)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.getEndAfterPadding() - this.mOrientationHelper.getDecoratedEnd(view2));
                return;
            }
        }
        if (c10 == 65535) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedStart(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.getDecoratedEnd(view2) - this.mOrientationHelper.getDecoratedMeasurement(view));
        }
    }

    public final void q(int i10, int i11) {
        this.mLayoutState.f7060c = i11 - this.mOrientationHelper.getStartAfterPadding();
        b1 b1Var = this.mLayoutState;
        b1Var.f7061d = i10;
        b1Var.f7062e = this.mShouldReverseLayout ? 1 : -1;
        b1Var.f7063f = -1;
        b1Var.f7059b = i11;
        b1Var.f7064g = Integer.MIN_VALUE;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.getMode() == 0 && this.mOrientationHelper.getEnd() == 0;
    }

    public int scrollBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (getChildCount() == 0 || i10 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f7058a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        o(i11, iAbs, true, lVar);
        b1 b1Var = this.mLayoutState;
        int iFill = fill(jVar, b1Var, lVar, false) + b1Var.f7064g;
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i10 = i11 * iFill;
        }
        this.mOrientationHelper.offsetChildren(-i10);
        this.mLayoutState.f7067j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollHorizontallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i10, jVar, lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void scrollToPosition(int i10) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f6945b = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i10, int i11) {
        this.mPendingScrollPosition = i10;
        this.mPendingScrollPositionOffset = i11;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.f6945b = -1;
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int scrollVerticallyBy(int i10, RecyclerView.j jVar, RecyclerView.l lVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i10, jVar, lVar);
    }

    public void setInitialPrefetchItemCount(int i10) {
        this.mInitialPrefetchItemCount = i10;
    }

    public void setOrientation(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(a.b.e(i10, "invalid orientation:"));
        }
        assertNotInLayoutOrScroll(null);
        if (i10 != this.mOrientation || this.mOrientationHelper == null) {
            o1 o1VarCreateOrientationHelper = o1.createOrientationHelper(this, i10);
            this.mOrientationHelper = o1VarCreateOrientationHelper;
            this.mAnchorInfo.f7332a = o1VarCreateOrientationHelper;
            this.mOrientation = i10;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z10) {
        this.mRecycleChildrenOnDetach = z10;
    }

    public void setReverseLayout(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (z10 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z10;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z10) {
        this.mSmoothScrollbarEnabled = z10;
    }

    public void setStackFromEnd(boolean z10) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z10) {
            return;
        }
        this.mStackFromEnd = z10;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.l lVar, int i10) {
        d1 d1Var = new d1(recyclerView.getContext());
        d1Var.setTargetPosition(i10);
        startSmoothScroll(d1Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int decoratedStart = this.mOrientationHelper.getDecoratedStart(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i10 = 1; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                int position2 = getPosition(childAt);
                int decoratedStart2 = this.mOrientationHelper.getDecoratedStart(childAt);
                if (position2 < position) {
                    k();
                    StringBuilder sb2 = new StringBuilder("detected invalid position. loc invalid? ");
                    sb2.append(decoratedStart2 < decoratedStart);
                    throw new RuntimeException(sb2.toString());
                }
                if (decoratedStart2 > decoratedStart) {
                    k();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i11 = 1; i11 < getChildCount(); i11++) {
            View childAt2 = getChildAt(i11);
            int position3 = getPosition(childAt2);
            int decoratedStart3 = this.mOrientationHelper.getDecoratedStart(childAt2);
            if (position3 < position) {
                k();
                StringBuilder sb3 = new StringBuilder("detected invalid position. loc invalid? ");
                sb3.append(decoratedStart3 < decoratedStart);
                throw new RuntimeException(sb3.toString());
            }
            if (decoratedStart3 < decoratedStart) {
                k();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new z0();
        this.mLayoutChunkResult = new a1();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i10);
        setReverseLayout(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new z0();
        this.mLayoutChunkResult = new a1();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.f.a properties = RecyclerView.f.getProperties(context, attributeSet, i10, i11);
        setOrientation(properties.f6957a);
        setReverseLayout(properties.f6959c);
        setStackFromEnd(properties.f6960d);
    }

    public void onAnchorReady(RecyclerView.j jVar, RecyclerView.l lVar, z0 z0Var, int i10) {
    }
}
