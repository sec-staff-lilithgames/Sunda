package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v2 extends d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f7293a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(w2 w2Var, Context context) {
        super(context);
        this.f7293a = w2Var;
    }

    @Override // androidx.recyclerview.widget.d1
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.d1, androidx.recyclerview.widget.RecyclerView.k
    public final void onTargetFound(View view, RecyclerView.l lVar, RecyclerView.k.a aVar) {
        w2 w2Var = this.f7293a;
        RecyclerView recyclerView = w2Var.mRecyclerView;
        if (recyclerView == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = w2Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
        int i10 = iArrCalculateDistanceToFinalSnap[0];
        int i11 = iArrCalculateDistanceToFinalSnap[1];
        int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
        if (iCalculateTimeForDeceleration > 0) {
            aVar.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
        }
    }
}
