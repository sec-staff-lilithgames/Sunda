package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h2 f73663a;

    public a2(h2 h2Var) {
        this.f73663a = h2Var;
    }

    @Override // m0.o
    /* renamed from: onDrag-3MmeM6k */
    public boolean mo5284onDrag3MmeM6k(long j10, b0 adjustment) {
        l0.i1 state$foundation_release;
        l0.k1 layoutResult;
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        h2 h2Var = this.f73663a;
        if (h2Var.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = h2Var.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        int iM5267getOffsetForPosition3MmeM6k = layoutResult.m5267getOffsetForPosition3MmeM6k(j10, false);
        m2.j0 value$foundation_release = h2Var.getValue$foundation_release();
        Integer num = h2Var.f73751m;
        kotlin.jvm.internal.e0.checkNotNull(num);
        h2Var.c(value$foundation_release, num.intValue(), iM5267getOffsetForPosition3MmeM6k, false, adjustment);
        return true;
    }

    @Override // m0.o
    /* renamed from: onExtend-k-4lQ0M */
    public boolean mo5285onExtendk4lQ0M(long j10) {
        l0.k1 layoutResult;
        h2 h2Var = this.f73663a;
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        h2Var.c(h2Var.getValue$foundation_release(), ((m2.x) h2Var.getOffsetMapping$foundation_release()).originalToTransformed(g2.a2.m3960getStartimpl(h2Var.getValue$foundation_release().m5591getSelectiond9O1mEE())), l0.k1.m5266getOffsetForPosition3MmeM6k$default(layoutResult, j10, false, 2, null), false, a0.f73656a.getNone());
        return true;
    }

    @Override // m0.o
    /* renamed from: onExtendDrag-k-4lQ0M */
    public boolean mo5286onExtendDragk4lQ0M(long j10) {
        l0.i1 state$foundation_release;
        l0.k1 layoutResult;
        h2 h2Var = this.f73663a;
        if (h2Var.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = h2Var.getState$foundation_release()) == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        h2Var.c(h2Var.getValue$foundation_release(), ((m2.x) h2Var.getOffsetMapping$foundation_release()).originalToTransformed(g2.a2.m3960getStartimpl(h2Var.getValue$foundation_release().m5591getSelectiond9O1mEE())), layoutResult.m5267getOffsetForPosition3MmeM6k(j10, false), false, a0.f73656a.getNone());
        return true;
    }

    @Override // m0.o
    /* renamed from: onStart-3MmeM6k */
    public boolean mo5287onStart3MmeM6k(long j10, b0 adjustment) {
        l0.k1 layoutResult;
        kotlin.jvm.internal.e0.checkNotNullParameter(adjustment, "adjustment");
        h2 h2Var = this.f73663a;
        h1.o0 focusRequester = h2Var.getFocusRequester();
        if (focusRequester != null) {
            focusRequester.requestFocus();
        }
        h2Var.f73750l = j10;
        l0.i1 state$foundation_release = h2Var.getState$foundation_release();
        if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
            return false;
        }
        h2Var.f73751m = Integer.valueOf(l0.k1.m5266getOffsetForPosition3MmeM6k$default(layoutResult, j10, false, 2, null));
        int iM5266getOffsetForPosition3MmeM6k$default = l0.k1.m5266getOffsetForPosition3MmeM6k$default(layoutResult, h2Var.f73750l, false, 2, null);
        h2Var.c(h2Var.getValue$foundation_release(), iM5266getOffsetForPosition3MmeM6k$default, iM5266getOffsetForPosition3MmeM6k$default, false, adjustment);
        return true;
    }
}
