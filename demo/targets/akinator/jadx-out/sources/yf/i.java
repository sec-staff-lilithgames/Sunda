package yf;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class i extends i4.l {

    /* renamed from: a, reason: collision with root package name */
    public int f94391a;

    /* renamed from: b, reason: collision with root package name */
    public int f94392b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f94393c;

    public i(SwipeDismissBehavior swipeDismissBehavior) {
        this.f94393c = swipeDismissBehavior;
    }

    @Override // i4.l
    public int clampViewPositionHorizontal(View view, int i10, int i11) {
        int width;
        int width2;
        int width3;
        boolean z10 = view.getLayoutDirection() == 1;
        int i12 = this.f94393c.f28944h;
        if (i12 == 0) {
            if (z10) {
                width = this.f94391a - view.getWidth();
                width2 = this.f94391a;
            } else {
                width = this.f94391a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i12 != 1) {
            width = this.f94391a - view.getWidth();
            width2 = view.getWidth() + this.f94391a;
        } else if (z10) {
            width = this.f94391a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f94391a - view.getWidth();
            width2 = this.f94391a;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // i4.l
    public int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // i4.l
    public int getViewHorizontalDragRange(View view) {
        return view.getWidth();
    }

    @Override // i4.l
    public void onViewCaptured(View view, int i10) {
        this.f94392b = i10;
        this.f94391a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f94393c;
            swipeDismissBehavior.f28941e = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f28941e = false;
        }
    }

    @Override // i4.l
    public void onViewDragStateChanged(int i10) {
        this.f94393c.getClass();
    }

    @Override // i4.l
    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f94393c;
        float f10 = width * swipeDismissBehavior.f28946j;
        float width2 = view.getWidth() * swipeDismissBehavior.f28947k;
        float fAbs = Math.abs(i10 - this.f94391a);
        if (fAbs <= f10) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // i4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewReleased(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f94392b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f94393c
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.f28944h
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f94391a
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f28945i
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.f94391a
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.f94391a
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.f94391a
        L67:
            i4.m r10 = r3.f28939b
            int r11 = r9.getTop()
            boolean r10 = r10.settleCapturedViewAt(r0, r11)
            if (r10 == 0) goto L7b
            yf.l r10 = new yf.l
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.i.onViewReleased(android.view.View, float, float):void");
    }

    @Override // i4.l
    public boolean tryCaptureView(View view, int i10) {
        int i11 = this.f94392b;
        return (i11 == -1 || i11 == i10) && this.f94393c.canSwipeDismissView(view);
    }
}
