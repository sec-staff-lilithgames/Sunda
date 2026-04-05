package androidx.core.widget;

import a.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import e4.i;
import e4.l;
import e4.m;
import e4.n;
import e4.o;
import x3.a1;
import x3.h0;
import x3.j0;
import x3.l0;
import x3.n0;
import x3.p0;
import x3.q;
import x3.z0;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements n0, j0, a1 {
    public static final float F = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final l G = new l();
    public static final int[] H = {R.attr.fillViewport};
    public final p0 A;
    public final l0 B;
    public float C;
    public o D;
    public final q E;

    /* renamed from: b, reason: collision with root package name */
    public final float f5760b;

    /* renamed from: c, reason: collision with root package name */
    public long f5761c;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f5762e;

    /* renamed from: f, reason: collision with root package name */
    public final OverScroller f5763f;

    /* renamed from: g, reason: collision with root package name */
    public final EdgeEffect f5764g;

    /* renamed from: h, reason: collision with root package name */
    public final EdgeEffect f5765h;

    /* renamed from: i, reason: collision with root package name */
    public z0 f5766i;

    /* renamed from: j, reason: collision with root package name */
    public int f5767j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5768k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5769l;

    /* renamed from: m, reason: collision with root package name */
    public View f5770m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5771n;

    /* renamed from: o, reason: collision with root package name */
    public VelocityTracker f5772o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5773p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5774q;

    /* renamed from: r, reason: collision with root package name */
    public final int f5775r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5776s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5777t;

    /* renamed from: u, reason: collision with root package name */
    public int f5778u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f5779v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f5780w;

    /* renamed from: x, reason: collision with root package name */
    public int f5781x;

    /* renamed from: y, reason: collision with root package name */
    public int f5782y;

    /* renamed from: z, reason: collision with root package name */
    public SavedState f5783z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public int f5784b;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return b.f(this.f5784b, "}", sb2);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f5784b);
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public static boolean b(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && b((View) parent, nestedScrollView);
    }

    private z0 getScrollFeedbackProvider() {
        if (this.f5766i == null) {
            this.f5766i = z0.createProvider(this);
        }
        return this.f5766i;
    }

    public final int a(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean arrowScroll(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !c(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            h(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f5762e;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            h(a(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (view != null && view.isFocused() && !c(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean c(View view, int i10, int i11) {
        Rect rect = this.f5762e;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.View, x3.a1
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, x3.a1
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, x3.a1
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void computeScroll() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View, x3.a1
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, x3.a1
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, x3.a1
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    public final void d(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.B.dispatchNestedScroll(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.B.dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.B.dispatchNestedPreFling(f10, f11);
    }

    @Override // x3.j0, x3.i0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.B.dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
    }

    @Override // x3.j0
    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.B.dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f5764g;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f5765h;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final void e(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5778u) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f5767j = (int) motionEvent.getY(i10);
            this.f5778u = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f5772o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.f5762e.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? fullScroll(33) : arrowScroll(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? fullScroll(130) : arrowScroll(130);
                    }
                    if (keyCode == 62) {
                        pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return fullScroll(33);
                    }
                    if (keyCode == 93) {
                        return fullScroll(130);
                    }
                    if (keyCode == 122) {
                        pageScroll(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        pageScroll(130);
                        return false;
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i10, int i11, int i12, int i13) {
        int i14;
        boolean z10;
        int i15;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i16 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            i14 = i11;
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i16 > i13) {
            i15 = i13;
        } else {
            if (i16 >= 0) {
                i15 = i16;
                z11 = false;
                if (z11 && !hasNestedScrollingParent(1)) {
                    this.f5763f.springBack(i14, i15, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i14, i15);
                return !z10 || z11;
            }
            i15 = 0;
        }
        z11 = true;
        if (z11) {
            this.f5763f.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i14, i15);
        if (z10) {
        }
    }

    public void fling(int i10) {
        if (getChildCount() > 0) {
            this.f5763f.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.f5782y = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                m.setFrameContentVelocity(this, Math.abs(this.f5763f.getCurrVelocity()));
            }
        }
    }

    public boolean fullScroll(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f5762e;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return g(i10, rect.top, rect.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(int r19, int r20, int r21) {
        /*
            r18 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int r3 = r18.getHeight()
            int r4 = r18.getScrollY()
            int r3 = r3 + r4
            r5 = 33
            if (r0 != r5) goto L15
            r5 = 1
            goto L16
        L15:
            r5 = 0
        L16:
            r8 = 2
            r9 = r18
            java.util.ArrayList r8 = r9.getFocusables(r8)
            int r10 = r8.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r8.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r6 = r14.getBottom()
            if (r1 >= r6) goto L69
            if (r15 >= r2) goto L69
            if (r1 >= r15) goto L3f
            if (r6 >= r2) goto L3f
            r17 = 1
            goto L41
        L3f:
            r17 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r17
            goto L69
        L47:
            if (r5 == 0) goto L4f
            int r7 = r11.getTop()
            if (r15 < r7) goto L57
        L4f:
            if (r5 != 0) goto L59
            int r7 = r11.getBottom()
            if (r6 <= r7) goto L59
        L57:
            r6 = 1
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r17 == 0) goto L69
            if (r6 == 0) goto L69
            goto L68
        L61:
            if (r17 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r6 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L70
            r6 = r9
            goto L71
        L70:
            r6 = r11
        L71:
            if (r1 < r4) goto L78
            if (r2 > r3) goto L78
            r16 = 0
            goto L8a
        L78:
            if (r5 == 0) goto L7d
            int r1 = r1 - r4
        L7b:
            r10 = r1
            goto L80
        L7d:
            int r1 = r2 - r3
            goto L7b
        L80:
            r11 = -1
            r12 = 0
            r13 = 0
            r14 = 1
            r15 = 1
            r9.h(r10, r11, r12, r13, r14, r15)
            r16 = 1
        L8a:
            android.view.View r1 = r18.findFocus()
            if (r6 == r1) goto L93
            r6.requestFocus(r0)
        L93:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(int, int, int):boolean");
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, x3.n0
    public int getNestedScrollAxes() {
        return this.A.getNestedScrollAxes();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.C = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(int r19, int r20, android.view.MotionEvent r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.h(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // x3.j0, x3.i0
    public boolean hasNestedScrollingParent(int i10) {
        return this.B.hasNestedScrollingParent(i10);
    }

    public final boolean i(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float distance = i.getDistance(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f10 = this.f5760b * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = F;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < distance;
    }

    public boolean isFillViewport() {
        return this.f5773p;
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean isNestedScrollingEnabled() {
        return this.B.isNestedScrollingEnabled();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.f5774q;
    }

    public final void j(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f5761c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f5763f.startScroll(getScrollX(), scrollY, 0, iMax, i12);
            if (z10) {
                startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.f5782y = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f5763f.isFinished()) {
                this.f5763f.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i10, i11);
        }
        this.f5761c = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean k(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f5764g;
        if (i.getDistance(edgeEffect) != 0.0f) {
            i.onPullDistance(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f5765h;
        if (i.getDistance(edgeEffect2) == 0.0f) {
            return z10;
        }
        i.onPullDistance(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5769l = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f5771n) {
            if (h0.isFromSource(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i10 = 9;
                width = (int) motionEvent.getX();
            } else if (h0.isFromSource(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                h(-((int) (getVerticalScrollFactorCompat() * axisValue)), i10, motionEvent, width, 1, h0.isFromSource(motionEvent, 8194));
                if (i10 == 0) {
                    return true;
                }
                this.E.onMotionEvent(motionEvent, i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f5768k = false;
        View view = this.f5770m;
        if (view != null && b(view, this)) {
            View view2 = this.f5770m;
            Rect rect = this.f5762e;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iA = a(rect);
            if (iA != 0) {
                scrollBy(0, iA);
            }
        }
        this.f5770m = null;
        if (!this.f5769l) {
            if (this.f5783z != null) {
                scrollTo(getScrollX(), this.f5783z.f5784b);
                this.f5783z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f5769l = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f5773p && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        fling((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // x3.n0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
    }

    @Override // x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        d(i13, i14, iArr);
    }

    @Override // x3.n0
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.A.onNestedScrollAccepted(view, view2, i10, i11);
        startNestedScroll(2, i11);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && c(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5783z = savedState;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5784b = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        o oVar = this.D;
        if (oVar != null) {
            oVar.onScrollChange(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !c(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f5762e;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iA = a(rect);
        if (iA != 0) {
            if (this.f5774q) {
                smoothScrollBy(0, iA);
            } else {
                scrollBy(0, iA);
            }
        }
    }

    @Override // x3.n0
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // x3.n0
    public void onStopNestedScroll(View view, int i10) {
        this.A.onStopNestedScroll(view, i10);
        stopNestedScroll(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0145  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean pageScroll(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f5762e;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        return g(i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f5768k) {
            this.f5770m = view2;
        } else {
            Rect rect = this.f5762e;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iA = a(rect);
            if (iA != 0) {
                scrollBy(0, iA);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iA = a(rect);
        boolean z11 = iA != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iA);
                return z11;
            }
            smoothScrollBy(0, iA);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f5772o) != null) {
            velocityTracker.recycle();
            this.f5772o = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f5768k = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f5773p) {
            this.f5773p = z10;
            requestLayout();
        }
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public void setNestedScrollingEnabled(boolean z10) {
        this.B.setNestedScrollingEnabled(z10);
    }

    public void setOnScrollChangeListener(o oVar) {
        this.D = oVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f5774q = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int i10, int i11) {
        j(i10, i11, 250, false);
    }

    public final void smoothScrollTo(int i10, int i11) {
        j(i10 - getScrollX(), i11 - getScrollY(), 250, false);
    }

    @Override // x3.j0, x3.i0
    public boolean startNestedScroll(int i10, int i11) {
        return this.B.startNestedScroll(i10, i11);
    }

    @Override // x3.j0, x3.i0
    public void stopNestedScroll(int i10) {
        this.B.stopNestedScroll(i10);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.nestedScrollViewStyle);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    @Override // x3.j0, x3.i0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return this.B.dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // x3.n0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        d(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    public final void smoothScrollBy(int i10, int i11, int i12) {
        j(i10, i11, i12, false);
    }

    public final void smoothScrollTo(int i10, int i11, int i12) {
        j(i10 - getScrollX(), i11 - getScrollY(), i12, false);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5762e = new Rect();
        this.f5768k = true;
        this.f5769l = false;
        this.f5770m = null;
        this.f5771n = false;
        this.f5774q = true;
        this.f5778u = -1;
        this.f5779v = new int[2];
        this.f5780w = new int[2];
        this.E = new q(getContext(), new n(this));
        this.f5764g = i.create(context, attributeSet);
        this.f5765h = i.create(context, attributeSet);
        this.f5760b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f5763f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5775r = viewConfiguration.getScaledTouchSlop();
        this.f5776s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5777t = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, H, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.A = new p0(this);
        this.B = new l0(this);
        setNestedScrollingEnabled(true);
        z1.setAccessibilityDelegate(this, G);
    }

    @Override // android.view.View, x3.j0, x3.i0, x3.k0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.B.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        d(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, x3.n0, x3.m0
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
