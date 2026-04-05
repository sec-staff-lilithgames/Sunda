package wf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class g extends i {

    /* renamed from: f, reason: collision with root package name */
    public f f90554f;

    /* renamed from: g, reason: collision with root package name */
    public OverScroller f90555g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f90556h;

    /* renamed from: i, reason: collision with root package name */
    public int f90557i;

    /* renamed from: j, reason: collision with root package name */
    public int f90558j;

    /* renamed from: k, reason: collision with root package name */
    public int f90559k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f90560l;

    public g() {
        this.f90557i = -1;
        this.f90559k = -1;
    }

    public boolean c(View view) {
        return false;
    }

    public int d(View view) {
        return -view.getHeight();
    }

    public int e(View view) {
        return view.getHeight();
    }

    public int g(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        int iClamp;
        int topAndBottomOffset = getTopAndBottomOffset();
        if (i11 == 0 || topAndBottomOffset < i11 || topAndBottomOffset > i12 || topAndBottomOffset == (iClamp = r3.a.clamp(i10, i11, i12))) {
            return 0;
        }
        setTopAndBottomOffset(iClamp);
        return topAndBottomOffset - iClamp;
    }

    public final void h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        g(coordinatorLayout, view, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.f90559k
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f90559k = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L40
            boolean r0 = r6.f90556h
            if (r0 == 0) goto L40
            int r0 = r6.f90557i
            if (r0 != r3) goto L25
            goto L8e
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 != r3) goto L2c
            goto L8e
        L2c:
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f90558j
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.f90559k
            if (r1 <= r5) goto L40
            r6.f90558j = r0
            return r2
        L40:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L87
            r6.f90557i = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.c(r8)
            if (r3 == 0) goto L60
            boolean r7 = r7.isPointInChildBounds(r8, r0, r1)
            if (r7 == 0) goto L60
            r7 = r2
            goto L61
        L60:
            r7 = r4
        L61:
            r6.f90556h = r7
            if (r7 == 0) goto L87
            r6.f90558j = r1
            int r7 = r9.getPointerId(r4)
            r6.f90557i = r7
            android.view.VelocityTracker r7 = r6.f90560l
            if (r7 != 0) goto L77
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.f90560l = r7
        L77:
            android.widget.OverScroller r7 = r6.f90555g
            if (r7 == 0) goto L87
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L87
            android.widget.OverScroller r7 = r6.f90555g
            r7.abortAnimation()
            return r2
        L87:
            android.view.VelocityTracker r7 = r6.f90560l
            if (r7 == 0) goto L8e
            r7.addMovement(r9)
        L8e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.g.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8 A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r19, android.view.View r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.g.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90557i = -1;
        this.f90559k = -1;
    }

    public void f(CoordinatorLayout coordinatorLayout, View view) {
    }
}
