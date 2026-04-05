package zg;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import i4.l;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f97963a;

    public f(SideSheetBehavior sideSheetBehavior) {
        this.f97963a = sideSheetBehavior;
    }

    @Override // i4.l
    public int clampViewPositionHorizontal(View view, int i10, int i11) {
        SideSheetBehavior sideSheetBehavior = this.f97963a;
        return r3.a.clamp(i10, sideSheetBehavior.f29364b.v(), sideSheetBehavior.f29364b.u());
    }

    @Override // i4.l
    public int clampViewPositionVertical(View view, int i10, int i11) {
        return view.getTop();
    }

    @Override // i4.l
    public int getViewHorizontalDragRange(View view) {
        SideSheetBehavior sideSheetBehavior = this.f97963a;
        return sideSheetBehavior.f29376o + sideSheetBehavior.f29379r;
    }

    @Override // i4.l
    public void onViewDragStateChanged(int i10) {
        if (i10 == 1) {
            SideSheetBehavior sideSheetBehavior = this.f97963a;
            if (sideSheetBehavior.f29370i) {
                sideSheetBehavior.a(1);
            }
        }
    }

    @Override // i4.l
    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f97963a;
        View coplanarSiblingView = sideSheetBehavior.getCoplanarSiblingView();
        if (coplanarSiblingView != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) coplanarSiblingView.getLayoutParams()) != null) {
            sideSheetBehavior.f29364b.W(marginLayoutParams, view.getLeft(), view.getRight());
            coplanarSiblingView.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f29386y;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        float fD = sideSheetBehavior.f29364b.d(i10);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onSlide(view, fD);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // i4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewReleased(android.view.View r3, float r4, float r5) {
        /*
            r2 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f97963a
            kc.p r1 = r0.f29364b
            boolean r1 = r1.A(r4)
            if (r1 == 0) goto Lb
            goto L51
        Lb:
            kc.p r1 = r0.f29364b
            boolean r1 = r1.Q(r3, r4)
            if (r1 == 0) goto L24
            kc.p r1 = r0.f29364b
            boolean r4 = r1.D(r4, r5)
            if (r4 != 0) goto L53
            kc.p r4 = r0.f29364b
            boolean r4 = r4.C(r3)
            if (r4 == 0) goto L51
            goto L53
        L24:
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L36
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L36
            goto L53
        L36:
            int r4 = r3.getLeft()
            int r5 = r0.getExpandedOffset()
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            kc.p r1 = r0.f29364b
            int r1 = r1.s()
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r5 >= r4) goto L53
        L51:
            r4 = 3
            goto L54
        L53:
            r4 = 5
        L54:
            boolean r5 = r0.shouldSkipSmoothAnimation()
            r0.c(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.f.onViewReleased(android.view.View, float, float):void");
    }

    @Override // i4.l
    public boolean tryCaptureView(View view, int i10) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f97963a;
        return (sideSheetBehavior.f29371j == 1 || (weakReference = sideSheetBehavior.f29380s) == null || weakReference.get() != view) ? false : true;
    }
}
