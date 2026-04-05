package u2;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import x1.a1;
import x1.w0;
import x1.x0;
import x1.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f87722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z1.b0 f87723b;

    public f(o oVar, z1.b0 b0Var) {
        this.f87722a = oVar;
        this.f87723b = b0Var;
    }

    @Override // x1.x0
    public int maxIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        o oVar = this.f87722a;
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        kotlin.jvm.internal.e0.checkNotNull(layoutParams);
        oVar.measure(o.access$obtainMeasureSpec(oVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return oVar.getMeasuredHeight();
    }

    @Override // x1.x0
    public int maxIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        o oVar = this.f87722a;
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        kotlin.jvm.internal.e0.checkNotNull(layoutParams);
        oVar.measure(iMakeMeasureSpec, o.access$obtainMeasureSpec(oVar, 0, i10, layoutParams.height));
        return oVar.getMeasuredWidth();
    }

    @Override // x1.x0
    /* renamed from: measure-3p2s80s */
    public y0 mo79measure3p2s80s(a1 measure, List<? extends w0> measurables, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measure, "$this$measure");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        int iM6757getMinWidthimpl = s2.c.m6757getMinWidthimpl(j10);
        o oVar = this.f87722a;
        if (iM6757getMinWidthimpl != 0) {
            oVar.getChildAt(0).setMinimumWidth(s2.c.m6757getMinWidthimpl(j10));
        }
        if (s2.c.m6756getMinHeightimpl(j10) != 0) {
            oVar.getChildAt(0).setMinimumHeight(s2.c.m6756getMinHeightimpl(j10));
        }
        int iM6757getMinWidthimpl2 = s2.c.m6757getMinWidthimpl(j10);
        int iM6755getMaxWidthimpl = s2.c.m6755getMaxWidthimpl(j10);
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        kotlin.jvm.internal.e0.checkNotNull(layoutParams);
        int iAccess$obtainMeasureSpec = o.access$obtainMeasureSpec(oVar, iM6757getMinWidthimpl2, iM6755getMaxWidthimpl, layoutParams.width);
        int iM6756getMinHeightimpl = s2.c.m6756getMinHeightimpl(j10);
        int iM6754getMaxHeightimpl = s2.c.m6754getMaxHeightimpl(j10);
        ViewGroup.LayoutParams layoutParams2 = oVar.getLayoutParams();
        kotlin.jvm.internal.e0.checkNotNull(layoutParams2);
        oVar.measure(iAccess$obtainMeasureSpec, o.access$obtainMeasureSpec(oVar, iM6756getMinHeightimpl, iM6754getMaxHeightimpl, layoutParams2.height));
        return a1.layout$default(measure, oVar.getMeasuredWidth(), oVar.getMeasuredHeight(), null, new e(oVar, this.f87723b), 4, null);
    }

    @Override // x1.x0
    public int minIntrinsicHeight(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        o oVar = this.f87722a;
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        kotlin.jvm.internal.e0.checkNotNull(layoutParams);
        oVar.measure(o.access$obtainMeasureSpec(oVar, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return oVar.getMeasuredHeight();
    }

    @Override // x1.x0
    public int minIntrinsicWidth(x1.z zVar, List<? extends x1.y> measurables, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(zVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(measurables, "measurables");
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        o oVar = this.f87722a;
        ViewGroup.LayoutParams layoutParams = oVar.getLayoutParams();
        kotlin.jvm.internal.e0.checkNotNull(layoutParams);
        oVar.measure(iMakeMeasureSpec, o.access$obtainMeasureSpec(oVar, 0, i10, layoutParams.height));
        return oVar.getMeasuredWidth();
    }
}
