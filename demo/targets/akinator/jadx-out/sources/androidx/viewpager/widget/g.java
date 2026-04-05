package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPager f7359d;

    public g(ViewPager viewPager) {
        this.f7359d = viewPager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // x3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        /*
            r2 = this;
            super.onInitializeAccessibilityEvent(r3, r4)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r3 = r3.getName()
            r4.setClassName(r3)
            androidx.viewpager.widget.ViewPager r3 = r2.f7359d
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L1a
            int r0 = r0.getCount()
            r1 = 1
            if (r0 <= r1) goto L1a
            goto L1b
        L1a:
            r1 = 0
        L1b:
            r4.setScrollable(r1)
            int r0 = r4.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto L3b
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L3b
            int r0 = r0.getCount()
            r4.setItemCount(r0)
            int r0 = r3.mCurItem
            r4.setFromIndex(r0)
            int r3 = r3.mCurItem
            r4.setToIndex(r3)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.g.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.setClassName(ViewPager.class.getName());
        ViewPager viewPager = this.f7359d;
        PagerAdapter pagerAdapter = viewPager.mAdapter;
        cVar.setScrollable(pagerAdapter != null && pagerAdapter.getCount() > 1);
        if (viewPager.canScrollHorizontally(1)) {
            cVar.addAction(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            cVar.addAction(Segment.SIZE);
        }
    }

    @Override // x3.b
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        ViewPager viewPager = this.f7359d;
        if (i10 == 4096) {
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem + 1);
            return true;
        }
        if (i10 != 8192 || !viewPager.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.mCurItem - 1);
        return true;
    }
}
