package i4;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import hr.kNq.ikJMrW;
import java.util.Arrays;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: x, reason: collision with root package name */
    public static final j f59404x = new j();

    /* renamed from: a, reason: collision with root package name */
    public int f59405a;

    /* renamed from: b, reason: collision with root package name */
    public int f59406b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f59408d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f59409e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f59410f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f59411g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f59412h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f59413i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f59414j;

    /* renamed from: k, reason: collision with root package name */
    public int f59415k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f59416l;

    /* renamed from: m, reason: collision with root package name */
    public final float f59417m;

    /* renamed from: n, reason: collision with root package name */
    public float f59418n;

    /* renamed from: o, reason: collision with root package name */
    public int f59419o;

    /* renamed from: p, reason: collision with root package name */
    public final int f59420p;

    /* renamed from: q, reason: collision with root package name */
    public int f59421q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f59422r;

    /* renamed from: s, reason: collision with root package name */
    public final l f59423s;

    /* renamed from: t, reason: collision with root package name */
    public View f59424t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f59425u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f59426v;

    /* renamed from: c, reason: collision with root package name */
    public int f59407c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final k f59427w = new k(this);

    public m(Context context, ViewGroup viewGroup, l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f59426v = viewGroup;
        this.f59423s = lVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f59420p = i10;
        this.f59419o = i10;
        this.f59406b = viewConfiguration.getScaledTouchSlop();
        this.f59417m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f59418n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f59422r = new OverScroller(context, f59404x);
    }

    public static m create(ViewGroup viewGroup, l lVar) {
        return new m(viewGroup.getContext(), viewGroup, lVar);
    }

    public final boolean a(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f59412h[i10] & i11) == i11 && (this.f59421q & i11) != 0 && (this.f59414j[i10] & i11) != i11 && (this.f59413i[i10] & i11) != i11) {
            float f12 = this.f59406b;
            if (fAbs > f12 || fAbs2 > f12) {
                if (fAbs < fAbs2 * 0.5f && this.f59423s.onEdgeLock(i11)) {
                    int[] iArr = this.f59414j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f59413i[i10] & i11) == 0 && fAbs > this.f59406b) {
                    return true;
                }
            }
        }
        return false;
    }

    public void abort() {
        cancel();
        if (this.f59405a == 2) {
            OverScroller overScroller = this.f59422r;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX2 = overScroller.getCurrX();
            int currY2 = overScroller.getCurrY();
            this.f59423s.onViewPositionChanged(this.f59424t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        k(0);
    }

    public final boolean b(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        l lVar = this.f59423s;
        boolean z10 = lVar.getViewHorizontalDragRange(view) > 0;
        boolean z11 = lVar.getViewVerticalDragRange(view) > 0;
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f59406b) : z11 && Math.abs(f11) > ((float) this.f59406b);
        }
        float f12 = (f11 * f11) + (f10 * f10);
        int i10 = this.f59406b;
        return f12 > ((float) (i10 * i10));
    }

    public final void c(int i10) {
        if (this.f59408d == null || !isPointerDown(i10)) {
            return;
        }
        this.f59408d[i10] = 0.0f;
        this.f59409e[i10] = 0.0f;
        this.f59410f[i10] = 0.0f;
        this.f59411g[i10] = 0.0f;
        this.f59412h[i10] = 0;
        this.f59413i[i10] = 0;
        this.f59414j[i10] = 0;
        this.f59415k = (~(1 << i10)) & this.f59415k;
    }

    public void cancel() {
        this.f59407c = -1;
        float[] fArr = this.f59408d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f59409e, 0.0f);
            Arrays.fill(this.f59410f, 0.0f);
            Arrays.fill(this.f59411g, 0.0f);
            Arrays.fill(this.f59412h, 0);
            Arrays.fill(this.f59413i, 0);
            Arrays.fill(this.f59414j, 0);
            this.f59415k = 0;
        }
        VelocityTracker velocityTracker = this.f59416l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f59416l = null;
        }
    }

    public void captureChildView(View view, int i10) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f59426v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f59424t = view;
        this.f59407c = i10;
        this.f59423s.onViewCaptured(view, i10);
        k(1);
    }

    public boolean checkTouchSlop(int i10) {
        int length = this.f59408d.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (checkTouchSlop(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean continueSettling(boolean z10) {
        if (this.f59405a == 2) {
            OverScroller overScroller = this.f59422r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f59424t.getLeft();
            int top = currY - this.f59424t.getTop();
            if (left != 0) {
                z1.offsetLeftAndRight(this.f59424t, left);
            }
            if (top != 0) {
                z1.offsetTopAndBottom(this.f59424t, top);
            }
            if (left != 0 || top != 0) {
                this.f59423s.onViewPositionChanged(this.f59424t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f59426v.post(this.f59427w);
                } else {
                    k(0);
                }
            }
        }
        return this.f59405a == 2;
    }

    public final int d(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f59426v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    public final boolean e(int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int left = this.f59424t.getLeft();
        int top = this.f59424t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f59422r;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            k(0);
            return false;
        }
        View view = this.f59424t;
        int i16 = (int) this.f59418n;
        int i17 = (int) this.f59417m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int i18 = (int) this.f59418n;
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i18) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i19 = iAbs5 + iAbs6;
        int i20 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f10 = iAbs5;
            f11 = i19;
        } else {
            f10 = iAbs3;
            f11 = i20;
        }
        float f14 = f10 / f11;
        if (i13 != 0) {
            f12 = iAbs6;
            f13 = i19;
        } else {
            f12 = iAbs4;
            f13 = i20;
        }
        float f15 = f12 / f13;
        l lVar = this.f59423s;
        overScroller.startScroll(left, top, i14, i15, (int) ((d(i15, i13, lVar.getViewVerticalDragRange(view)) * f15) + (d(i14, i12, lVar.getViewHorizontalDragRange(view)) * f14)));
        k(2);
        return true;
    }

    public View findTopChildUnder(int i10, int i11) {
        ViewGroup viewGroup = this.f59426v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(this.f59423s.getOrderedChildIndex(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public void flingCapturedView(int i10, int i11, int i12, int i13) {
        if (!this.f59425u) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f59422r.fling(this.f59424t.getLeft(), this.f59424t.getTop(), (int) this.f59416l.getXVelocity(this.f59407c), (int) this.f59416l.getYVelocity(this.f59407c), i10, i12, i11, i13);
        k(2);
    }

    public final void g() {
        VelocityTracker velocityTracker = this.f59416l;
        float f10 = this.f59417m;
        velocityTracker.computeCurrentVelocity(1000, f10);
        float xVelocity = this.f59416l.getXVelocity(this.f59407c);
        float f11 = this.f59418n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f11) {
            xVelocity = 0.0f;
        } else if (fAbs > f10) {
            xVelocity = xVelocity > 0.0f ? f10 : -f10;
        }
        float yVelocity = this.f59416l.getYVelocity(this.f59407c);
        float f12 = this.f59418n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f12) {
            f10 = 0.0f;
        } else if (fAbs2 <= f10) {
            f10 = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f10 = -f10;
        }
        this.f59425u = true;
        this.f59423s.onViewReleased(this.f59424t, xVelocity, f10);
        this.f59425u = false;
        if (this.f59405a == 1) {
            k(0);
        }
    }

    public int getActivePointerId() {
        return this.f59407c;
    }

    public View getCapturedView() {
        return this.f59424t;
    }

    public int getDefaultEdgeSize() {
        return this.f59420p;
    }

    public int getEdgeSize() {
        return this.f59419o;
    }

    public float getMinVelocity() {
        return this.f59418n;
    }

    public int getTouchSlop() {
        return this.f59406b;
    }

    public int getViewDragState() {
        return this.f59405a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [i4.l] */
    public final void h(float f10, int i10, float f11) {
        boolean zA = a(f10, f11, i10, 1);
        boolean z10 = zA;
        if (a(f11, f10, i10, 4)) {
            z10 = (zA ? 1 : 0) | 4;
        }
        boolean z11 = z10;
        if (a(f10, f11, i10, 2)) {
            z11 = (z10 ? 1 : 0) | 2;
        }
        ?? r02 = z11;
        if (a(f11, f10, i10, 8)) {
            r02 = (z11 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f59413i;
            iArr[i10] = iArr[i10] | r02;
            this.f59423s.onEdgeDragStarted(r02, i10);
        }
    }

    public final void i(float f10, int i10, float f11) {
        float[] fArr = this.f59408d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f59409e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f59410f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f59411g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f59412h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f59413i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f59414j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f59408d = fArr2;
            this.f59409e = fArr3;
            this.f59410f = fArr4;
            this.f59411g = fArr5;
            this.f59412h = iArr;
            this.f59413i = iArr2;
            this.f59414j = iArr3;
        }
        float[] fArr9 = this.f59408d;
        this.f59410f[i10] = f10;
        fArr9[i10] = f10;
        float[] fArr10 = this.f59409e;
        this.f59411g[i10] = f11;
        fArr10[i10] = f11;
        int[] iArr7 = this.f59412h;
        int i12 = (int) f10;
        int i13 = (int) f11;
        ViewGroup viewGroup = this.f59426v;
        int i14 = i12 < viewGroup.getLeft() + this.f59419o ? 1 : 0;
        if (i13 < viewGroup.getTop() + this.f59419o) {
            i14 |= 4;
        }
        if (i12 > viewGroup.getRight() - this.f59419o) {
            i14 |= 2;
        }
        if (i13 > viewGroup.getBottom() - this.f59419o) {
            i14 |= 8;
        }
        iArr7[i10] = i14;
        this.f59415k |= 1 << i10;
    }

    public boolean isCapturedViewUnder(int i10, int i11) {
        return isViewUnder(this.f59424t, i10, i11);
    }

    public boolean isEdgeTouched(int i10) {
        int length = this.f59412h.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (isEdgeTouched(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPointerDown(int i10) {
        return ((1 << i10) & this.f59415k) != 0;
    }

    public boolean isViewUnder(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public final void j(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (f(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f59410f[pointerId] = x10;
                this.f59411g[pointerId] = y10;
            }
        }
    }

    public final void k(int i10) {
        this.f59426v.removeCallbacks(this.f59427w);
        if (this.f59405a != i10) {
            this.f59405a = i10;
            this.f59423s.onViewDragStateChanged(i10);
            if (this.f59405a == 0) {
                this.f59424t = null;
            }
        }
    }

    public final boolean l(int i10, View view) {
        if (view == this.f59424t && this.f59407c == i10) {
            return true;
        }
        if (view == null || !this.f59423s.tryCaptureView(view, i10)) {
            return false;
        }
        this.f59407c = i10;
        captureChildView(view, i10);
        return true;
    }

    public void processTouchEvent(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.f59416l == null) {
            this.f59416l = VelocityTracker.obtain();
        }
        this.f59416l.addMovement(motionEvent);
        l lVar = this.f59423s;
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewFindTopChildUnder = findTopChildUnder((int) x10, (int) y10);
            i(x10, pointerId, y10);
            l(pointerId, viewFindTopChildUnder);
            int i12 = this.f59412h[pointerId] & this.f59421q;
            if (i12 != 0) {
                lVar.onEdgeTouched(i12, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f59405a == 1) {
                g();
            }
            cancel();
            return;
        }
        if (actionMasked == 2) {
            if (this.f59405a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i11 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i11);
                    if (f(pointerId2)) {
                        float x11 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f10 = x11 - this.f59408d[pointerId2];
                        float f11 = y11 - this.f59409e[pointerId2];
                        h(f10, pointerId2, f11);
                        if (this.f59405a != 1) {
                            View viewFindTopChildUnder2 = findTopChildUnder((int) x11, (int) y11);
                            if (b(viewFindTopChildUnder2, f10, f11) && l(pointerId2, viewFindTopChildUnder2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
                j(motionEvent);
                return;
            }
            if (f(this.f59407c)) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f59407c);
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f59410f;
                int i13 = this.f59407c;
                int i14 = (int) (x12 - fArr[i13]);
                int i15 = (int) (y12 - this.f59411g[i13]);
                int left = this.f59424t.getLeft() + i14;
                int top = this.f59424t.getTop() + i15;
                int left2 = this.f59424t.getLeft();
                int top2 = this.f59424t.getTop();
                if (i14 != 0) {
                    left = lVar.clampViewPositionHorizontal(this.f59424t, left, i14);
                    z1.offsetLeftAndRight(this.f59424t, left - left2);
                }
                int i16 = left;
                if (i15 != 0) {
                    top = lVar.clampViewPositionVertical(this.f59424t, top, i15);
                    z1.offsetTopAndBottom(this.f59424t, top - top2);
                }
                int i17 = top;
                if (i14 != 0 || i15 != 0) {
                    this.f59423s.onViewPositionChanged(this.f59424t, i16, i17, i16 - left2, i17 - top2);
                }
                j(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.f59405a == 1) {
                this.f59425u = true;
                lVar.onViewReleased(this.f59424t, 0.0f, 0.0f);
                this.f59425u = false;
                if (this.f59405a == 1) {
                    k(0);
                }
            }
            cancel();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            i(x13, pointerId3, y13);
            if (this.f59405a != 0) {
                if (isCapturedViewUnder((int) x13, (int) y13)) {
                    l(pointerId3, this.f59424t);
                    return;
                }
                return;
            } else {
                l(pointerId3, findTopChildUnder((int) x13, (int) y13));
                int i18 = this.f59412h[pointerId3] & this.f59421q;
                if (i18 != 0) {
                    lVar.onEdgeTouched(i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f59405a == 1 && pointerId4 == this.f59407c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f59407c) {
                    View viewFindTopChildUnder3 = findTopChildUnder((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f59424t;
                    if (viewFindTopChildUnder3 == view && l(pointerId5, view)) {
                        i10 = this.f59407c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                g();
            }
        }
        c(pointerId4);
    }

    public void setEdgeSize(int i10) {
        this.f59419o = i10;
    }

    public void setEdgeTrackingEnabled(int i10) {
        this.f59421q = i10;
    }

    public void setMinVelocity(float f10) {
        this.f59418n = f10;
    }

    public boolean settleCapturedViewAt(int i10, int i11) {
        if (this.f59425u) {
            return e(i10, i11, (int) this.f59416l.getXVelocity(this.f59407c), (int) this.f59416l.getYVelocity(this.f59407c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.m.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean smoothSlideViewTo(View view, int i10, int i11) {
        this.f59424t = view;
        this.f59407c = -1;
        boolean zE = e(i10, i11, 0, 0);
        if (!zE && this.f59405a == 0 && this.f59424t != null) {
            this.f59424t = null;
        }
        return zE;
    }

    public static m create(ViewGroup viewGroup, float f10, l lVar) {
        m mVarCreate = create(viewGroup, lVar);
        mVarCreate.f59406b = (int) ((1.0f / f10) * mVarCreate.f59406b);
        return mVarCreate;
    }

    public boolean checkTouchSlop(int i10, int i11) {
        if (!isPointerDown(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float f10 = this.f59410f[i11] - this.f59408d[i11];
        float f11 = this.f59411g[i11] - this.f59409e[i11];
        if (!z10 || !z11) {
            return z10 ? Math.abs(f10) > ((float) this.f59406b) : z11 && Math.abs(f11) > ((float) this.f59406b);
        }
        float f12 = (f11 * f11) + (f10 * f10);
        int i12 = this.f59406b;
        return f12 > ((float) (i12 * i12));
    }

    public final boolean f(int i10) {
        if (!isPointerDown(i10)) {
            Log.e("ViewDragHelper", ikJMrW.HaUuXQbkRRANK + i10 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
            return false;
        }
        return true;
    }

    public boolean isEdgeTouched(int i10, int i11) {
        return isPointerDown(i11) && (i10 & this.f59412h[i11]) != 0;
    }
}
