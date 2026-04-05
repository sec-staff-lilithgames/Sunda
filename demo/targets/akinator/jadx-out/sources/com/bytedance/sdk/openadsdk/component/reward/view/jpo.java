package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d1;
import androidx.recyclerview.widget.o1;
import androidx.recyclerview.widget.o2;
import androidx.recyclerview.widget.w2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends w2 {

    /* renamed from: jd, reason: collision with root package name */
    private o1 f20038jd;
    private o1 jpo;
    private RecyclerView wqx;

    private o1 jd(RecyclerView.f fVar) {
        o1 o1Var = this.f20038jd;
        if (o1Var == null || o1Var.getLayoutManager() != fVar) {
            this.f20038jd = o1.createHorizontalHelper(fVar);
        }
        return this.f20038jd;
    }

    @Override // androidx.recyclerview.widget.w2
    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        this.wqx = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.w2
    public int[] calculateDistanceToFinalSnap(RecyclerView.f fVar, View view) {
        int[] iArr = {0, 0};
        if (fVar.canScrollHorizontally()) {
            iArr[0] = jpo(view, jd(fVar));
            return iArr;
        }
        if (fVar.canScrollVertically()) {
            iArr[1] = jpo(view, jpo(fVar));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.w2
    public RecyclerView.k createScroller(RecyclerView.f fVar) {
        if (fVar instanceof o2) {
            return new d1(this.wqx.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.jpo.1
                @Override // androidx.recyclerview.widget.d1
                public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.d1
                public int calculateTimeForScrolling(int i10) {
                    return Math.min(100, super.calculateTimeForScrolling(i10));
                }

                @Override // androidx.recyclerview.widget.d1, androidx.recyclerview.widget.RecyclerView.k
                public void onTargetFound(View view, RecyclerView.l lVar, RecyclerView.k.a aVar) {
                    jpo jpoVar = jpo.this;
                    int[] iArrCalculateDistanceToFinalSnap = jpoVar.calculateDistanceToFinalSnap(jpoVar.wqx.getLayoutManager(), view);
                    int i10 = iArrCalculateDistanceToFinalSnap[0];
                    int i11 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                    if (iCalculateTimeForDeceleration > 0) {
                        aVar.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.w2
    public View findSnapView(RecyclerView.f fVar) {
        int childCount = fVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) fVar;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        o1 o1VarJpo = jpo(fVar);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutManager.getChildAt(i11);
            int iAbs = Math.abs(o1VarJpo.getDecoratedStart(childAt));
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.w2
    public int findTargetSnapPosition(RecyclerView.f fVar, int i10, int i11) {
        View viewFindSnapView = findSnapView(fVar);
        int i12 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = fVar.getPosition(viewFindSnapView);
        if (fVar.canScrollVertically()) {
            i12 = i11 < 0 ? position - 1 : position + 1;
        }
        return Math.min(fVar.getItemCount() - 1, Math.max(i12, 0));
    }

    private int jpo(View view, o1 o1Var) {
        int decoratedStart = o1Var.getDecoratedStart(view);
        return decoratedStart >= o1Var.getStartAfterPadding() / 2 ? decoratedStart - o1Var.getStartAfterPadding() : decoratedStart;
    }

    private o1 jpo(RecyclerView.f fVar) {
        o1 o1Var = this.jpo;
        if (o1Var == null || o1Var.getLayoutManager() != fVar) {
            this.jpo = o1.createVerticalHelper(fVar);
        }
        return this.jpo;
    }
}
