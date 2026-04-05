package e4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends x3.b {
    @Override // x3.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        y3.o.setMaxScrollX(accessibilityEvent, nestedScrollView.getScrollX());
        y3.o.setMaxScrollY(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        int scrollRange;
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        cVar.setClassName(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        cVar.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            cVar.addAction(c.a.f94043k);
            cVar.addAction(c.a.f94048p);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            cVar.addAction(c.a.f94042j);
            cVar.addAction(c.a.f94050r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // x3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            boolean r7 = super.performAccessibilityAction(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L8
            return r0
        L8:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L13
            goto L97
        L13:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L30
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L30
            int r7 = r2.height()
        L30:
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 250(0xfa, float:3.5E-43)
            if (r6 == r2) goto L6c
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L45
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L45
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L6c
            goto L97
        L45:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L97
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.j(r1, r6, r3, r0)
            return r0
        L6c:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L97
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.j(r1, r6, r3, r0)
            return r0
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.l.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }
}
