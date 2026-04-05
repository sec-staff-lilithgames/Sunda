package ag;

import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e extends i4.l {

    /* renamed from: a, reason: collision with root package name */
    public long f4399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f4400b;

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f4400b = bottomSheetBehavior;
    }

    @Override // i4.l
    public int clampViewPositionHorizontal(View view, int i10, int i11) {
        return view.getLeft();
    }

    @Override // i4.l
    public int clampViewPositionVertical(View view, int i10, int i11) {
        return r3.a.clamp(i10, this.f4400b.getExpandedOffset(), getViewVerticalDragRange(view));
    }

    @Override // i4.l
    public int getViewVerticalDragRange(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.f4400b;
        return (bottomSheetBehavior.isHideable() && bottomSheetBehavior.isHideableWhenDragging()) ? bottomSheetBehavior.Z : bottomSheetBehavior.J;
    }

    @Override // i4.l
    public void onViewDragStateChanged(int i10) {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f4400b;
            if (bottomSheetBehavior.N) {
                bottomSheetBehavior.j(1);
            }
        }
    }

    @Override // i4.l
    public void onViewPositionChanged(View view, int i10, int i11, int i12, int i13) {
        this.f4400b.e(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
    @Override // i4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewReleased(android.view.View r9, float r10, float r11) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.e.onViewReleased(android.view.View, float, float):void");
    }

    @Override // i4.l
    public boolean tryCaptureView(View view, int i10) {
        BottomSheetBehavior bottomSheetBehavior = this.f4400b;
        int i11 = bottomSheetBehavior.Q;
        if (i11 == 1 || bottomSheetBehavior.f28993h0) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.f28989f0 == i10) {
            WeakReference weakReference = bottomSheetBehavior.f28982b0;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        this.f4399a = SystemClock.uptimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f28980a0;
        return weakReference2 != null && weakReference2.get() == view;
    }
}
