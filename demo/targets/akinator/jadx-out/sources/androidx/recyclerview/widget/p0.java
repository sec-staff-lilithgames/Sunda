package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f7216a;

    public p0(s0 s0Var) {
        this.f7216a = s0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i10, int i11) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        s0 s0Var = this.f7216a;
        int i12 = s0Var.f7240a;
        int iComputeVerticalScrollRange = s0Var.f7258s.computeVerticalScrollRange();
        int i13 = s0Var.f7257r;
        s0Var.f7259t = iComputeVerticalScrollRange - i13 > 0 && i13 >= i12;
        int iComputeHorizontalScrollRange = s0Var.f7258s.computeHorizontalScrollRange();
        int i14 = s0Var.f7256q;
        boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= i12;
        s0Var.f7260u = z10;
        boolean z11 = s0Var.f7259t;
        if (!z11 && !z10) {
            if (s0Var.f7261v != 0) {
                s0Var.d(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i13;
            s0Var.f7251l = (int) ((((f10 / 2.0f) + iComputeVerticalScrollOffset) * f10) / iComputeVerticalScrollRange);
            s0Var.f7250k = Math.min(i13, (i13 * i13) / iComputeVerticalScrollRange);
        }
        if (s0Var.f7260u) {
            float f11 = iComputeHorizontalScrollOffset;
            float f12 = i14;
            s0Var.f7254o = (int) ((((f12 / 2.0f) + f11) * f12) / iComputeHorizontalScrollRange);
            s0Var.f7253n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = s0Var.f7261v;
        if (i15 == 0 || i15 == 1) {
            s0Var.d(1);
        }
    }
}
