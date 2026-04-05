package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q1 extends w2 {

    /* renamed from: a, reason: collision with root package name */
    public o1 f7221a;

    /* renamed from: b, reason: collision with root package name */
    public o1 f7222b;

    public static int a(View view, o1 o1Var) {
        return ((o1Var.getDecoratedMeasurement(view) / 2) + o1Var.getDecoratedStart(view)) - ((o1Var.getTotalSpace() / 2) + o1Var.getStartAfterPadding());
    }

    public static View b(RecyclerView.f fVar, o1 o1Var) {
        int childCount = fVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int totalSpace = (o1Var.getTotalSpace() / 2) + o1Var.getStartAfterPadding();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = fVar.getChildAt(i11);
            int iAbs = Math.abs(((o1Var.getDecoratedMeasurement(childAt) / 2) + o1Var.getDecoratedStart(childAt)) - totalSpace);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final o1 c(RecyclerView.f fVar) {
        o1 o1Var = this.f7222b;
        if (o1Var == null || o1Var.f7206a != fVar) {
            this.f7222b = o1.createHorizontalHelper(fVar);
        }
        return this.f7222b;
    }

    @Override // androidx.recyclerview.widget.w2
    public int[] calculateDistanceToFinalSnap(RecyclerView.f fVar, View view) {
        int[] iArr = new int[2];
        if (fVar.canScrollHorizontally()) {
            iArr[0] = a(view, c(fVar));
        } else {
            iArr[0] = 0;
        }
        if (fVar.canScrollVertically()) {
            iArr[1] = a(view, d(fVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.w2
    public final RecyclerView.k createScroller(RecyclerView.f fVar) {
        if (fVar instanceof o2) {
            return new p1(this, this.mRecyclerView.getContext());
        }
        return null;
    }

    public final o1 d(RecyclerView.f fVar) {
        o1 o1Var = this.f7221a;
        if (o1Var == null || o1Var.f7206a != fVar) {
            this.f7221a = o1.createVerticalHelper(fVar);
        }
        return this.f7221a;
    }

    @Override // androidx.recyclerview.widget.w2
    public View findSnapView(RecyclerView.f fVar) {
        if (fVar.canScrollVertically()) {
            return b(fVar, d(fVar));
        }
        if (fVar.canScrollHorizontally()) {
            return b(fVar, c(fVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.w2
    public int findTargetSnapPosition(RecyclerView.f fVar, int i10, int i11) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = fVar.getItemCount();
        if (itemCount != 0) {
            View view = null;
            o1 o1VarD = fVar.canScrollVertically() ? d(fVar) : fVar.canScrollHorizontally() ? c(fVar) : null;
            if (o1VarD != null) {
                int childCount = fVar.getChildCount();
                boolean z10 = false;
                int i12 = Integer.MAX_VALUE;
                int i13 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = fVar.getChildAt(i14);
                    if (childAt != null) {
                        int iA = a(childAt, o1VarD);
                        if (iA <= 0 && iA > i13) {
                            view2 = childAt;
                            i13 = iA;
                        }
                        if (iA >= 0 && iA < i12) {
                            view = childAt;
                            i12 = iA;
                        }
                    }
                }
                boolean z11 = !fVar.canScrollHorizontally() ? i11 <= 0 : i10 <= 0;
                if (z11 && view != null) {
                    return fVar.getPosition(view);
                }
                if (!z11 && view2 != null) {
                    return fVar.getPosition(view2);
                }
                if (z11) {
                    view = view2;
                }
                if (view != null) {
                    int position = fVar.getPosition(view);
                    int itemCount2 = fVar.getItemCount();
                    if ((fVar instanceof o2) && (pointFComputeScrollVectorForPosition = ((o2) fVar).computeScrollVectorForPosition(itemCount2 - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                        z10 = true;
                    }
                    int i15 = position + (z10 == z11 ? -1 : 1);
                    if (i15 >= 0 && i15 < itemCount) {
                        return i15;
                    }
                }
            }
        }
        return -1;
    }
}
