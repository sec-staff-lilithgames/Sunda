package l0;

import g2.x1;
import java.util.ArrayList;
import java.util.List;
import m0.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 implements x1.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f72152a;

    public q0(x0 x0Var) {
        this.f72152a = x0Var;
    }

    @Override // x1.x0
    public int maxIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return s2.v.m6971getHeightimpl(y0.m5289layoutNN6EwU$default(this.f72152a.getState().getTextDelegate(), s2.d.Constraints(0, i10, 0, Integer.MAX_VALUE), zVar.getLayoutDirection(), null, 4, null).m4044getSizeYbymL2g());
    }

    @Override // x1.x0
    public int maxIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        x0 x0Var = this.f72152a;
        x0Var.getState().getTextDelegate().layoutIntrinsics(zVar.getLayoutDirection());
        return x0Var.getState().getTextDelegate().getMaxIntrinsicWidth();
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public x1.y0 mo79measure3p2s80s(x1.a1 measure, List<? extends x1.w0> measurables, long j10) {
        t1 t1Var;
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        x0 x0Var = this.f72152a;
        x1 layoutResult = x0Var.getState().getLayoutResult();
        x1 x1VarM5291layoutNN6EwU = x0Var.getState().getTextDelegate().m5291layoutNN6EwU(j10, measure.getLayoutDirection(), layoutResult);
        if (!kotlin.jvm.internal.e0.areEqual(layoutResult, x1VarM5291layoutNN6EwU)) {
            x0Var.getState().getOnTextLayout().invoke(x1VarM5291layoutNN6EwU);
            if (layoutResult != null && !kotlin.jvm.internal.e0.areEqual(layoutResult.getLayoutInput().getText(), x1VarM5291layoutNN6EwU.getLayoutInput().getText()) && (t1Var = x0Var.f72198c) != null) {
                t1Var.notifySelectableChange(x0Var.getState().getSelectableId());
            }
        }
        x0Var.getState().setLayoutResult(x1VarM5291layoutNN6EwU);
        if (measurables.size() < x1VarM5291layoutNN6EwU.getPlaceholderRects().size()) {
            throw new IllegalStateException("Check failed.");
        }
        List<i1.j> placeholderRects = x1VarM5291layoutNN6EwU.getPlaceholderRects();
        ArrayList arrayList = new ArrayList(placeholderRects.size());
        int size = placeholderRects.size();
        for (int i10 = 0; i10 < size; i10++) {
            i1.j jVar = placeholderRects.get(i10);
            tu.v vVar = jVar != null ? new tu.v(measurables.get(i10).mo7826measureBRTryo0(s2.d.Constraints$default(0, (int) Math.floor(jVar.getWidth()), 0, (int) Math.floor(jVar.getHeight()), 5, null)), s2.q.m6921boximpl(s2.r.IntOffset(mv.d.roundToInt(jVar.getLeft()), mv.d.roundToInt(jVar.getTop())))) : null;
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return measure.layout(s2.v.m6972getWidthimpl(x1VarM5291layoutNN6EwU.m4044getSizeYbymL2g()), s2.v.m6971getHeightimpl(x1VarM5291layoutNN6EwU.m4044getSizeYbymL2g()), uu.p1.mapOf(tu.e0.to(x1.d.getFirstBaseline(), Integer.valueOf(mv.d.roundToInt(x1VarM5291layoutNN6EwU.getFirstBaseline()))), tu.e0.to(x1.d.getLastBaseline(), Integer.valueOf(mv.d.roundToInt(x1VarM5291layoutNN6EwU.getLastBaseline())))), new p0(arrayList));
    }

    @Override // x1.x0
    public int minIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        return s2.v.m6971getHeightimpl(y0.m5289layoutNN6EwU$default(this.f72152a.getState().getTextDelegate(), s2.d.Constraints(0, i10, 0, Integer.MAX_VALUE), zVar.getLayoutDirection(), null, 4, null).m4044getSizeYbymL2g());
    }

    @Override // x1.x0
    public int minIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        x0 x0Var = this.f72152a;
        x0Var.getState().getTextDelegate().layoutIntrinsics(zVar.getLayoutDirection());
        return x0Var.getState().getTextDelegate().getMinIntrinsicWidth();
    }
}
