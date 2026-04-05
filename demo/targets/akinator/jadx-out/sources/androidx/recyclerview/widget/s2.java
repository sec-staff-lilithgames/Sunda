package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s2 {
    public static int a(RecyclerView.l lVar, o1 o1Var, View view, View view2, RecyclerView.f fVar, boolean z10) {
        if (fVar.getChildCount() == 0 || lVar.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return Math.abs(fVar.getPosition(view) - fVar.getPosition(view2)) + 1;
        }
        return Math.min(o1Var.getTotalSpace(), o1Var.getDecoratedEnd(view2) - o1Var.getDecoratedStart(view));
    }

    public static int b(RecyclerView.l lVar, o1 o1Var, View view, View view2, RecyclerView.f fVar, boolean z10, boolean z11) {
        if (fVar.getChildCount() == 0 || lVar.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z11 ? Math.max(0, (lVar.getItemCount() - Math.max(fVar.getPosition(view), fVar.getPosition(view2))) - 1) : Math.max(0, Math.min(fVar.getPosition(view), fVar.getPosition(view2)));
        if (z10) {
            return Math.round((iMax * (Math.abs(o1Var.getDecoratedEnd(view2) - o1Var.getDecoratedStart(view)) / (Math.abs(fVar.getPosition(view) - fVar.getPosition(view2)) + 1))) + (o1Var.getStartAfterPadding() - o1Var.getDecoratedStart(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.l lVar, o1 o1Var, View view, View view2, RecyclerView.f fVar, boolean z10) {
        if (fVar.getChildCount() == 0 || lVar.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z10) {
            return lVar.getItemCount();
        }
        return (int) (((o1Var.getDecoratedEnd(view2) - o1Var.getDecoratedStart(view)) / (Math.abs(fVar.getPosition(view) - fVar.getPosition(view2)) + 1)) * lVar.getItemCount());
    }
}
