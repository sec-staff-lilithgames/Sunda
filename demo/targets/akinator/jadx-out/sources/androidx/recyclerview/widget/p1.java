package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p1 extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1 f7217a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(q1 q1Var, Context context) {
        super(context);
        this.f7217a = q1Var;
    }

    @Override // androidx.recyclerview.widget.d1
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.d1
    public final int calculateTimeForScrolling(int i10) {
        return Math.min(100, super.calculateTimeForScrolling(i10));
    }

    @Override // androidx.recyclerview.widget.d1, androidx.recyclerview.widget.RecyclerView.k
    public final void onTargetFound(View view, RecyclerView.l lVar, RecyclerView.k.a aVar) {
        q1 q1Var = this.f7217a;
        int[] iArrCalculateDistanceToFinalSnap = q1Var.calculateDistanceToFinalSnap(q1Var.mRecyclerView.getLayoutManager(), view);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        int i11 = iArrCalculateDistanceToFinalSnap[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
        if (iCalculateTimeForDeceleration > 0) {
            aVar.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }
}
